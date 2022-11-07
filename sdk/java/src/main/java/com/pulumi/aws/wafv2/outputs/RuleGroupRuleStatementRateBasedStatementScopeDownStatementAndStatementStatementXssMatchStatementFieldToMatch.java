// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    private @Nullable List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchHeader> headers;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the cookies in the web request. See Cookies below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request headers. See Headers below for details.
     * 
     */
    public List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchCookies cookies;
        private @Nullable List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchHeader> headers;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody jsonBody;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatch defaults) {
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
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatch build() {
            final var o = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementFieldToMatch();
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