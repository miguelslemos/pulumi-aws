// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnomalySubscriptionSubscriber {
    /**
     * @return The address of the subscriber. If type is `SNS`, this will be the arn of the sns topic. If type is `EMAIL`, this will be the destination email address.
     * 
     */
    private String address;
    /**
     * @return The type of subscription. Valid Values: `SNS` | `EMAIL`.
     * 
     */
    private String type;

    private AnomalySubscriptionSubscriber() {}
    /**
     * @return The address of the subscriber. If type is `SNS`, this will be the arn of the sns topic. If type is `EMAIL`, this will be the destination email address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The type of subscription. Valid Values: `SNS` | `EMAIL`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalySubscriptionSubscriber defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String type;
        public Builder() {}
        public Builder(AnomalySubscriptionSubscriber defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AnomalySubscriptionSubscriber build() {
            final var o = new AnomalySubscriptionSubscriber();
            o.address = address;
            o.type = type;
            return o;
        }
    }
}