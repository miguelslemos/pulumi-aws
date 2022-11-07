// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRuleNoncurrentVersionExpiration {
    /**
     * @return Specifies the number of days noncurrent object versions expire.
     * 
     */
    private @Nullable Integer days;

    private BucketLifecycleRuleNoncurrentVersionExpiration() {}
    /**
     * @return Specifies the number of days noncurrent object versions expire.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionExpiration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer days;
        public Builder() {}
        public Builder(BucketLifecycleRuleNoncurrentVersionExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        @CustomType.Setter
        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public BucketLifecycleRuleNoncurrentVersionExpiration build() {
            final var o = new BucketLifecycleRuleNoncurrentVersionExpiration();
            o.days = days;
            return o;
        }
    }
}