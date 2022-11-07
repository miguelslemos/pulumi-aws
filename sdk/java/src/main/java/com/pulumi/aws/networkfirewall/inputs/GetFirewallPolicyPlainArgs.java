// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyPlainArgs Empty = new GetFirewallPolicyPlainArgs();

    /**
     * ARN of the firewall policy.
     * 
     */
    @Import(name="arn")
    private @Nullable String arn;

    /**
     * @return ARN of the firewall policy.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Descriptive name of the firewall policy.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Descriptive name of the firewall policy.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value tags for the firewall policy.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value tags for the firewall policy.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetFirewallPolicyPlainArgs() {}

    private GetFirewallPolicyPlainArgs(GetFirewallPolicyPlainArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyPlainArgs $;

        public Builder() {
            $ = new GetFirewallPolicyPlainArgs();
        }

        public Builder(GetFirewallPolicyPlainArgs defaults) {
            $ = new GetFirewallPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param name Descriptive name of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Key-value tags for the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetFirewallPolicyPlainArgs build() {
            return $;
        }
    }

}