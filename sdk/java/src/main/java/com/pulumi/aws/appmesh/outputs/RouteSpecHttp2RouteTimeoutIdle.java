// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouteSpecHttp2RouteTimeoutIdle {
    /**
     * @return Unit of time. Valid values: `ms`, `s`.
     * 
     */
    private String unit;
    /**
     * @return Number of time units. Minimum value of `0`.
     * 
     */
    private Integer value;

    private RouteSpecHttp2RouteTimeoutIdle() {}
    /**
     * @return Unit of time. Valid values: `ms`, `s`.
     * 
     */
    public String unit() {
        return this.unit;
    }
    /**
     * @return Number of time units. Minimum value of `0`.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteTimeoutIdle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String unit;
        private Integer value;
        public Builder() {}
        public Builder(RouteSpecHttp2RouteTimeoutIdle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RouteSpecHttp2RouteTimeoutIdle build() {
            final var o = new RouteSpecHttp2RouteTimeoutIdle();
            o.unit = unit;
            o.value = value;
            return o;
        }
    }
}