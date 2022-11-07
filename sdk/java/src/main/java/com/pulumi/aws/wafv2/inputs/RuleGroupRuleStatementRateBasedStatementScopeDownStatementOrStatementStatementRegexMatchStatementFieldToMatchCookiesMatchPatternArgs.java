// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs Empty = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs();

    /**
     * An empty configuration block that is used for inspecting all headers.
     * 
     */
    @Import(name="all")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs> all;

    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    @Import(name="excludedCookies")
    private @Nullable Output<List<String>> excludedCookies;

    public Optional<Output<List<String>>> excludedCookies() {
        return Optional.ofNullable(this.excludedCookies);
    }

    @Import(name="includedCookies")
    private @Nullable Output<List<String>> includedCookies;

    public Optional<Output<List<String>>> includedCookies() {
        return Optional.ofNullable(this.includedCookies);
    }

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs() {}

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs $) {
        this.all = $.all;
        this.excludedCookies = $.excludedCookies;
        this.includedCookies = $.includedCookies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs();
        }

        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs defaults) {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        public Builder excludedCookies(@Nullable Output<List<String>> excludedCookies) {
            $.excludedCookies = excludedCookies;
            return this;
        }

        public Builder excludedCookies(List<String> excludedCookies) {
            return excludedCookies(Output.of(excludedCookies));
        }

        public Builder excludedCookies(String... excludedCookies) {
            return excludedCookies(List.of(excludedCookies));
        }

        public Builder includedCookies(@Nullable Output<List<String>> includedCookies) {
            $.includedCookies = includedCookies;
            return this;
        }

        public Builder includedCookies(List<String> includedCookies) {
            return includedCookies(Output.of(includedCookies));
        }

        public Builder includedCookies(String... includedCookies) {
            return includedCookies(List.of(includedCookies));
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs build() {
            return $;
        }
    }

}