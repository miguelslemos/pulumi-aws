// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs Empty = new NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs();

    @Import(name="additionalDetailType")
    private @Nullable Output<String> additionalDetailType;

    public Optional<Output<String>> additionalDetailType() {
        return Optional.ofNullable(this.additionalDetailType);
    }

    @Import(name="components")
    private @Nullable Output<List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs>> components;

    public Optional<Output<List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs>>> components() {
        return Optional.ofNullable(this.components);
    }

    private NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs() {}

    private NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs(NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs $) {
        this.additionalDetailType = $.additionalDetailType;
        this.components = $.components;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs $;

        public Builder() {
            $ = new NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs();
        }

        public Builder(NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs defaults) {
            $ = new NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalDetailType(@Nullable Output<String> additionalDetailType) {
            $.additionalDetailType = additionalDetailType;
            return this;
        }

        public Builder additionalDetailType(String additionalDetailType) {
            return additionalDetailType(Output.of(additionalDetailType));
        }

        public Builder components(@Nullable Output<List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs>> components) {
            $.components = components;
            return this;
        }

        public Builder components(List<NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs> components) {
            return components(Output.of(components));
        }

        public Builder components(NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs... components) {
            return components(List.of(components));
        }

        public NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs build() {
            return $;
        }
    }

}