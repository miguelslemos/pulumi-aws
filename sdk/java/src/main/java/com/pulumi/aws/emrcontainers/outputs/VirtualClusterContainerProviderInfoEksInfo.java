// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualClusterContainerProviderInfoEksInfo {
    /**
     * @return The namespace where the EMR Containers cluster is running
     * 
     */
    private @Nullable String namespace;

    private VirtualClusterContainerProviderInfoEksInfo() {}
    /**
     * @return The namespace where the EMR Containers cluster is running
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerProviderInfoEksInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String namespace;
        public Builder() {}
        public Builder(VirtualClusterContainerProviderInfoEksInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public VirtualClusterContainerProviderInfoEksInfo build() {
            final var o = new VirtualClusterContainerProviderInfoEksInfo();
            o.namespace = namespace;
            return o;
        }
    }
}