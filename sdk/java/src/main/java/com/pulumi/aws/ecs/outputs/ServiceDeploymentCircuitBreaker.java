// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ServiceDeploymentCircuitBreaker {
    /**
     * @return Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    private Boolean enable;
    /**
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    private Boolean rollback;

    private ServiceDeploymentCircuitBreaker() {}
    /**
     * @return Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    public Boolean rollback() {
        return this.rollback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreaker defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        private Boolean rollback;
        public Builder() {}
        public Builder(ServiceDeploymentCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        @CustomType.Setter
        public Builder rollback(Boolean rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }
        public ServiceDeploymentCircuitBreaker build() {
            final var o = new ServiceDeploymentCircuitBreaker();
            o.enable = enable;
            o.rollback = rollback;
            return o;
        }
    }
}