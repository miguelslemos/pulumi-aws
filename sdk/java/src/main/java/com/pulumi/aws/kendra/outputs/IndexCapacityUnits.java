// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IndexCapacityUnits {
    /**
     * @return The amount of extra query capacity for an index and GetQuerySuggestions capacity. For more information, refer to [QueryCapacityUnits](https://docs.aws.amazon.com/kendra/latest/dg/API_CapacityUnitsConfiguration.html#Kendra-Type-CapacityUnitsConfiguration-QueryCapacityUnits).
     * 
     */
    private @Nullable Integer queryCapacityUnits;
    /**
     * @return The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is reached first. Minimum value of 0.
     * 
     */
    private @Nullable Integer storageCapacityUnits;

    private IndexCapacityUnits() {}
    /**
     * @return The amount of extra query capacity for an index and GetQuerySuggestions capacity. For more information, refer to [QueryCapacityUnits](https://docs.aws.amazon.com/kendra/latest/dg/API_CapacityUnitsConfiguration.html#Kendra-Type-CapacityUnitsConfiguration-QueryCapacityUnits).
     * 
     */
    public Optional<Integer> queryCapacityUnits() {
        return Optional.ofNullable(this.queryCapacityUnits);
    }
    /**
     * @return The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is reached first. Minimum value of 0.
     * 
     */
    public Optional<Integer> storageCapacityUnits() {
        return Optional.ofNullable(this.storageCapacityUnits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexCapacityUnits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer queryCapacityUnits;
        private @Nullable Integer storageCapacityUnits;
        public Builder() {}
        public Builder(IndexCapacityUnits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryCapacityUnits = defaults.queryCapacityUnits;
    	      this.storageCapacityUnits = defaults.storageCapacityUnits;
        }

        @CustomType.Setter
        public Builder queryCapacityUnits(@Nullable Integer queryCapacityUnits) {
            this.queryCapacityUnits = queryCapacityUnits;
            return this;
        }
        @CustomType.Setter
        public Builder storageCapacityUnits(@Nullable Integer storageCapacityUnits) {
            this.storageCapacityUnits = storageCapacityUnits;
            return this;
        }
        public IndexCapacityUnits build() {
            final var o = new IndexCapacityUnits();
            o.queryCapacityUnits = queryCapacityUnits;
            o.storageCapacityUnits = storageCapacityUnits;
            return o;
        }
    }
}