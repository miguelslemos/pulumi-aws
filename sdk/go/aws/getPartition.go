// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to lookup current AWS partition in which Terraform is working
func LookupPartition(ctx *pulumi.Context) (*GetPartitionResult, error) {
	outputs, err := ctx.Invoke("aws:index/getPartition:getPartition", nil)
	if err != nil {
		return nil, err
	}
	return &GetPartitionResult{
		Partition: outputs["partition"],
	}
	}, nil
}

// A collection of values returned by getPartition.
type GetPartitionResult struct {
	Partition interface{}
}