// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    private @Nullable List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchHeader> headers;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    public List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchCookies cookies;
        private @Nullable List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchHeader> headers;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchJsonBody jsonBody;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch build() {
            final var o = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.cookies = cookies;
            o.headers = headers;
            o.jsonBody = jsonBody;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}