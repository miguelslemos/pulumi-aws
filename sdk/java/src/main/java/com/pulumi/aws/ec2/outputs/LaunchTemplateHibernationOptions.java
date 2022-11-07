// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class LaunchTemplateHibernationOptions {
    /**
     * @return If set to `true`, the launched EC2 instance will hibernation enabled.
     * 
     */
    private Boolean configured;

    private LaunchTemplateHibernationOptions() {}
    /**
     * @return If set to `true`, the launched EC2 instance will hibernation enabled.
     * 
     */
    public Boolean configured() {
        return this.configured;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateHibernationOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean configured;
        public Builder() {}
        public Builder(LaunchTemplateHibernationOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configured = defaults.configured;
        }

        @CustomType.Setter
        public Builder configured(Boolean configured) {
            this.configured = Objects.requireNonNull(configured);
            return this;
        }
        public LaunchTemplateHibernationOptions build() {
            final var o = new LaunchTemplateHibernationOptions();
            o.configured = configured;
            return o;
        }
    }
}