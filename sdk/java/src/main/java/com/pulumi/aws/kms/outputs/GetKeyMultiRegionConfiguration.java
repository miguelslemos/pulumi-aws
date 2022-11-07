// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.outputs;

import com.pulumi.aws.kms.outputs.GetKeyMultiRegionConfigurationPrimaryKey;
import com.pulumi.aws.kms.outputs.GetKeyMultiRegionConfigurationReplicaKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeyMultiRegionConfiguration {
    private String multiRegionKeyType;
    private List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys;
    private List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys;

    private GetKeyMultiRegionConfiguration() {}
    public String multiRegionKeyType() {
        return this.multiRegionKeyType;
    }
    public List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys() {
        return this.primaryKeys;
    }
    public List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys() {
        return this.replicaKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyMultiRegionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String multiRegionKeyType;
        private List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys;
        private List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys;
        public Builder() {}
        public Builder(GetKeyMultiRegionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiRegionKeyType = defaults.multiRegionKeyType;
    	      this.primaryKeys = defaults.primaryKeys;
    	      this.replicaKeys = defaults.replicaKeys;
        }

        @CustomType.Setter
        public Builder multiRegionKeyType(String multiRegionKeyType) {
            this.multiRegionKeyType = Objects.requireNonNull(multiRegionKeyType);
            return this;
        }
        @CustomType.Setter
        public Builder primaryKeys(List<GetKeyMultiRegionConfigurationPrimaryKey> primaryKeys) {
            this.primaryKeys = Objects.requireNonNull(primaryKeys);
            return this;
        }
        public Builder primaryKeys(GetKeyMultiRegionConfigurationPrimaryKey... primaryKeys) {
            return primaryKeys(List.of(primaryKeys));
        }
        @CustomType.Setter
        public Builder replicaKeys(List<GetKeyMultiRegionConfigurationReplicaKey> replicaKeys) {
            this.replicaKeys = Objects.requireNonNull(replicaKeys);
            return this;
        }
        public Builder replicaKeys(GetKeyMultiRegionConfigurationReplicaKey... replicaKeys) {
            return replicaKeys(List.of(replicaKeys));
        }
        public GetKeyMultiRegionConfiguration build() {
            final var o = new GetKeyMultiRegionConfiguration();
            o.multiRegionKeyType = multiRegionKeyType;
            o.primaryKeys = primaryKeys;
            o.replicaKeys = replicaKeys;
            return o;
        }
    }
}