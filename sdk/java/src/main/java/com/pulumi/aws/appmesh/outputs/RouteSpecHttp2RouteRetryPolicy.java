// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteRetryPolicyPerRetryTimeout;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttp2RouteRetryPolicy {
    /**
     * @return List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    private @Nullable List<String> httpRetryEvents;
    /**
     * @return Maximum number of retries.
     * 
     */
    private Integer maxRetries;
    /**
     * @return Per-retry timeout.
     * 
     */
    private RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout;
    /**
     * @return List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    private @Nullable List<String> tcpRetryEvents;

    private RouteSpecHttp2RouteRetryPolicy() {}
    /**
     * @return List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    public List<String> httpRetryEvents() {
        return this.httpRetryEvents == null ? List.of() : this.httpRetryEvents;
    }
    /**
     * @return Maximum number of retries.
     * 
     */
    public Integer maxRetries() {
        return this.maxRetries;
    }
    /**
     * @return Per-retry timeout.
     * 
     */
    public RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout() {
        return this.perRetryTimeout;
    }
    /**
     * @return List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    public List<String> tcpRetryEvents() {
        return this.tcpRetryEvents == null ? List.of() : this.tcpRetryEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteRetryPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> httpRetryEvents;
        private Integer maxRetries;
        private RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout;
        private @Nullable List<String> tcpRetryEvents;
        public Builder() {}
        public Builder(RouteSpecHttp2RouteRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        @CustomType.Setter
        public Builder httpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }
        public Builder httpRetryEvents(String... httpRetryEvents) {
            return httpRetryEvents(List.of(httpRetryEvents));
        }
        @CustomType.Setter
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        @CustomType.Setter
        public Builder perRetryTimeout(RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder tcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }
        public Builder tcpRetryEvents(String... tcpRetryEvents) {
            return tcpRetryEvents(List.of(tcpRetryEvents));
        }
        public RouteSpecHttp2RouteRetryPolicy build() {
            final var o = new RouteSpecHttp2RouteRetryPolicy();
            o.httpRetryEvents = httpRetryEvents;
            o.maxRetries = maxRetries;
            o.perRetryTimeout = perRetryTimeout;
            o.tcpRetryEvents = tcpRetryEvents;
            return o;
        }
    }
}