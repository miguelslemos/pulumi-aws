// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.InputSecurityGroupWhitelistRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InputSecurityGroupState extends com.pulumi.resources.ResourceArgs {

    public static final InputSecurityGroupState Empty = new InputSecurityGroupState();

    /**
     * ARN of the InputSecurityGroup.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the InputSecurityGroup.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The list of inputs currently using this InputSecurityGroup.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<String>> inputs;

    /**
     * @return The list of inputs currently using this InputSecurityGroup.
     * 
     */
    public Optional<Output<List<String>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * A map of tags to assign to the InputSecurityGroup. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the InputSecurityGroup. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Whitelist rules. See Whitelist Rules for more details.
     * 
     */
    @Import(name="whitelistRules")
    private @Nullable Output<List<InputSecurityGroupWhitelistRuleArgs>> whitelistRules;

    /**
     * @return Whitelist rules. See Whitelist Rules for more details.
     * 
     */
    public Optional<Output<List<InputSecurityGroupWhitelistRuleArgs>>> whitelistRules() {
        return Optional.ofNullable(this.whitelistRules);
    }

    private InputSecurityGroupState() {}

    private InputSecurityGroupState(InputSecurityGroupState $) {
        this.arn = $.arn;
        this.inputs = $.inputs;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.whitelistRules = $.whitelistRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InputSecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InputSecurityGroupState $;

        public Builder() {
            $ = new InputSecurityGroupState();
        }

        public Builder(InputSecurityGroupState defaults) {
            $ = new InputSecurityGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the InputSecurityGroup.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the InputSecurityGroup.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param inputs The list of inputs currently using this InputSecurityGroup.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<String>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs The list of inputs currently using this InputSecurityGroup.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<String> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs The list of inputs currently using this InputSecurityGroup.
         * 
         * @return builder
         * 
         */
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param tags A map of tags to assign to the InputSecurityGroup. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the InputSecurityGroup. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param whitelistRules Whitelist rules. See Whitelist Rules for more details.
         * 
         * @return builder
         * 
         */
        public Builder whitelistRules(@Nullable Output<List<InputSecurityGroupWhitelistRuleArgs>> whitelistRules) {
            $.whitelistRules = whitelistRules;
            return this;
        }

        /**
         * @param whitelistRules Whitelist rules. See Whitelist Rules for more details.
         * 
         * @return builder
         * 
         */
        public Builder whitelistRules(List<InputSecurityGroupWhitelistRuleArgs> whitelistRules) {
            return whitelistRules(Output.of(whitelistRules));
        }

        /**
         * @param whitelistRules Whitelist rules. See Whitelist Rules for more details.
         * 
         * @return builder
         * 
         */
        public Builder whitelistRules(InputSecurityGroupWhitelistRuleArgs... whitelistRules) {
            return whitelistRules(List.of(whitelistRules));
        }

        public InputSecurityGroupState build() {
            return $;
        }
    }

}