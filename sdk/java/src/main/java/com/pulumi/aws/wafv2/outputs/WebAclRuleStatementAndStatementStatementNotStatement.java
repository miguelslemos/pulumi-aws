// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementAndStatementStatementNotStatement {
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementAndStatementStatementNotStatementStatement> statements;

    private WebAclRuleStatementAndStatementStatementNotStatement() {}
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementAndStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementAndStatementStatementNotStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementAndStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementAndStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementAndStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementAndStatementStatementNotStatement build() {
            final var o = new WebAclRuleStatementAndStatementStatementNotStatement();
            o.statements = statements;
            return o;
        }
    }
}