// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody {
    private WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody build() {
            final var o = new WebAclRuleStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBody();
            return o;
        }
    }
}