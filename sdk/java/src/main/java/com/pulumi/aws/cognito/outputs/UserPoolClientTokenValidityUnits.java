// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolClientTokenValidityUnits {
    /**
     * @return Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    private @Nullable String idToken;
    /**
     * @return Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    private @Nullable String refreshToken;

    private UserPoolClientTokenValidityUnits() {}
    /**
     * @return Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    public Optional<String> idToken() {
        return Optional.ofNullable(this.idToken);
    }
    /**
     * @return Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolClientTokenValidityUnits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String idToken;
        private @Nullable String refreshToken;
        public Builder() {}
        public Builder(UserPoolClientTokenValidityUnits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.idToken = defaults.idToken;
    	      this.refreshToken = defaults.refreshToken;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder idToken(@Nullable String idToken) {
            this.idToken = idToken;
            return this;
        }
        @CustomType.Setter
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public UserPoolClientTokenValidityUnits build() {
            final var o = new UserPoolClientTokenValidityUnits();
            o.accessToken = accessToken;
            o.idToken = idToken;
            o.refreshToken = refreshToken;
            return o;
        }
    }
}