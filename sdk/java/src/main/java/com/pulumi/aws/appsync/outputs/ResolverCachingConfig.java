// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResolverCachingConfig {
    /**
     * @return List of caching key.
     * 
     */
    private @Nullable List<String> cachingKeys;
    /**
     * @return TTL in seconds.
     * 
     */
    private @Nullable Integer ttl;

    private ResolverCachingConfig() {}
    /**
     * @return List of caching key.
     * 
     */
    public List<String> cachingKeys() {
        return this.cachingKeys == null ? List.of() : this.cachingKeys;
    }
    /**
     * @return TTL in seconds.
     * 
     */
    public Optional<Integer> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverCachingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cachingKeys;
        private @Nullable Integer ttl;
        public Builder() {}
        public Builder(ResolverCachingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachingKeys = defaults.cachingKeys;
    	      this.ttl = defaults.ttl;
        }

        @CustomType.Setter
        public Builder cachingKeys(@Nullable List<String> cachingKeys) {
            this.cachingKeys = cachingKeys;
            return this;
        }
        public Builder cachingKeys(String... cachingKeys) {
            return cachingKeys(List.of(cachingKeys));
        }
        @CustomType.Setter
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public ResolverCachingConfig build() {
            final var o = new ResolverCachingConfig();
            o.cachingKeys = cachingKeys;
            o.ttl = ttl;
            return o;
        }
    }
}