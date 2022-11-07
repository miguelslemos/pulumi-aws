// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetEipsFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEipsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEipsArgs Empty = new GetEipsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetEipsFilterArgs>> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<Output<List<GetEipsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetEipsArgs() {}

    private GetEipsArgs(GetEipsArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEipsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEipsArgs $;

        public Builder() {
            $ = new GetEipsArgs();
        }

        public Builder(GetEipsArgs defaults) {
            $ = new GetEipsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetEipsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetEipsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetEipsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetEipsArgs build() {
            return $;
        }
    }

}