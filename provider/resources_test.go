package provider

import (
	"context"
	"testing"

	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/stretchr/testify/assert"
)

func TestParseDuration(t *testing.T) {
	for _, v := range []string{
		"1",
		"60",
		"3600",
		"86400",
		"1s",
		"60s",
		"3600s",
	} {
		valid := resource.PropertyMap{
			"durationSeconds": resource.NewStringProperty(v),
		}
		d, err := durationFromConfig(valid, "durationSeconds")
		assert.NoError(t, err)
		assert.NotNil(t, d)
	}
}

func TestHasNonComputedTagsAndTagsAllOptimized(t *testing.T) {
	p := Provider()
	p.P.ResourcesMap().Range(func(key string, value shim.Resource) bool {
		actual := hasNonComputedTagsAndTagsAllOptimized(key, value)
		expected := hasNonComputedTagsAndTagsAll(key, value)
		assert.Equal(t, expected, actual, "%q", key)
		return true
	})
	ctx := context.Background()
	upstreamProvider := newUpstreamProvider(ctx)
	for rn, r := range upstreamProvider.SDKV2Provider.ResourcesMap {
		if r.SchemaFunc != nil {
			res, ok := p.P.ResourcesMap().GetOk(rn)
			if ok {
				v := hasNonComputedTagsAndTagsAll(rn, res)
				t.Logf("Should cache %v: %s", v, rn)
			}
		}
	}
}

func TestHasOptionalOrRequiredNamePropertyOptimized(t *testing.T) {
	p := Provider()
	p.P.ResourcesMap().Range(func(key string, value shim.Resource) bool {
		actual := hasOptionalOrRequiredNameProperty(p.P, key)
		expected := hasOptionalOrRequiredNamePropertyOptimized(p.P, key)
		assert.Equal(t, expected, actual, "%q", key)
		return true
	})
	ctx := context.Background()
	upstreamProvider := newUpstreamProvider(ctx)
	for rn, r := range upstreamProvider.SDKV2Provider.ResourcesMap {
		if r.SchemaFunc != nil {
			v := hasOptionalOrRequiredNameProperty(p.P, rn)
			t.Logf("Should cache %v: %s", v, rn)
		}
	}
}
func TestSessionTags(t *testing.T) {
	tests := []struct {
		name string
		tags resource.PropertyValue
		want map[string]string
	}{
		{
			name: "Empty tags",
			tags: resource.NewObjectProperty(resource.PropertyMap{}),
			want: map[string]string{},
		},
		{
			name: "Single tag",
			tags: resource.NewObjectProperty(resource.PropertyMap{
				"key1": resource.NewStringProperty("value1"),
			}),
			want: map[string]string{
				"key1": "{value1}",
			},
		},
		{
			name: "Multiple tags",
			tags: resource.NewObjectProperty(resource.PropertyMap{
				"key1": resource.NewStringProperty("value1"),
				"key2": resource.NewStringProperty("value2"),
			}),
			want: map[string]string{
				"key1": "{value1}",
				"key2": "{value2}",
			},
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := sessionTags(tt.tags)
			assert.Equal(t, tt.want, got)
		})
	}
}
