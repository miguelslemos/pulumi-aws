// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement {
    /**
     * @return Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement> statements;

    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement() {}
    /**
     * @return Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement> statements;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        @CustomType.Setter
        public Builder statements(List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement... statements) {
            return statements(List.of(statements));
        }
        public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement build() {
            final var o = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement();
            o.statements = statements;
            return o;
        }
    }
}