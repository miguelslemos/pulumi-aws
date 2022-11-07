// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAutoTerminationPolicy {
    /**
     * @return Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a minimum of `60` seconds and a maximum of `604800` seconds (seven days).
     * 
     */
    private @Nullable Integer idleTimeout;

    private ClusterAutoTerminationPolicy() {}
    /**
     * @return Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a minimum of `60` seconds and a maximum of `604800` seconds (seven days).
     * 
     */
    public Optional<Integer> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoTerminationPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer idleTimeout;
        public Builder() {}
        public Builder(ClusterAutoTerminationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
        }

        @CustomType.Setter
        public Builder idleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public ClusterAutoTerminationPolicy build() {
            final var o = new ClusterAutoTerminationPolicy();
            o.idleTimeout = idleTimeout;
            return o;
        }
    }
}