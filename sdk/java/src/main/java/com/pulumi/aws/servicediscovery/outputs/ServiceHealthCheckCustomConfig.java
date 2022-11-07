// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceHealthCheckCustomConfig {
    /**
     * @return The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    private @Nullable Integer failureThreshold;

    private ServiceHealthCheckCustomConfig() {}
    /**
     * @return The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckCustomConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer failureThreshold;
        public Builder() {}
        public Builder(ServiceHealthCheckCustomConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
        }

        @CustomType.Setter
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public ServiceHealthCheckCustomConfig build() {
            final var o = new ServiceHealthCheckCustomConfig();
            o.failureThreshold = failureThreshold;
            return o;
        }
    }
}