// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs();

    /**
     * Values sent must match the specified values exactly.
     * 
     */
    @Import(name="exacts", required=true)
    private Output<List<String>> exacts;

    /**
     * @return Values sent must match the specified values exactly.
     * 
     */
    public Output<List<String>> exacts() {
        return this.exacts;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs() {}

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs $) {
        this.exacts = $.exacts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs();
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs defaults) {
            $ = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exacts Values sent must match the specified values exactly.
         * 
         * @return builder
         * 
         */
        public Builder exacts(Output<List<String>> exacts) {
            $.exacts = exacts;
            return this;
        }

        /**
         * @param exacts Values sent must match the specified values exactly.
         * 
         * @return builder
         * 
         */
        public Builder exacts(List<String> exacts) {
            return exacts(Output.of(exacts));
        }

        /**
         * @param exacts Values sent must match the specified values exactly.
         * 
         * @return builder
         * 
         */
        public Builder exacts(String... exacts) {
            return exacts(List.of(exacts));
        }

        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs build() {
            $.exacts = Objects.requireNonNull($.exacts, "expected parameter 'exacts' to be non-null");
            return $;
        }
    }

}