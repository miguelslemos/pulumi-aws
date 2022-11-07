// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteTimeoutIdle;
import com.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteTimeoutPerRequest;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttpRouteTimeout {
    /**
     * @return Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private @Nullable RouteSpecHttpRouteTimeoutIdle idle;
    /**
     * @return Per request timeout.
     * 
     */
    private @Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest;

    private RouteSpecHttpRouteTimeout() {}
    /**
     * @return Idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<RouteSpecHttpRouteTimeoutIdle> idle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * @return Per request timeout.
     * 
     */
    public Optional<RouteSpecHttpRouteTimeoutPerRequest> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteTimeout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RouteSpecHttpRouteTimeoutIdle idle;
        private @Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest;
        public Builder() {}
        public Builder(RouteSpecHttpRouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        @CustomType.Setter
        public Builder idle(@Nullable RouteSpecHttpRouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }
        @CustomType.Setter
        public Builder perRequest(@Nullable RouteSpecHttpRouteTimeoutPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public RouteSpecHttpRouteTimeout build() {
            final var o = new RouteSpecHttpRouteTimeout();
            o.idle = idle;
            o.perRequest = perRequest;
            return o;
        }
    }
}