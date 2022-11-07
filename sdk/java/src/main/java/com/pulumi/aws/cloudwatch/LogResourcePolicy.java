// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.LogResourcePolicyArgs;
import com.pulumi.aws.cloudwatch.inputs.LogResourcePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a CloudWatch log resource policy.
 * 
 * ## Example Usage
 * ### Elasticsearch Log Publishing
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicy;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var elasticsearch-log-publishing-policyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(                
 *                     &#34;logs:CreateLogStream&#34;,
 *                     &#34;logs:PutLogEvents&#34;,
 *                     &#34;logs:PutLogEventsBatch&#34;)
 *                 .resources(&#34;arn:aws:logs:*&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .identifiers(&#34;es.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var elasticsearch_log_publishing_policyLogResourcePolicy = new LogResourcePolicy(&#34;elasticsearch-log-publishing-policyLogResourcePolicy&#34;, LogResourcePolicyArgs.builder()        
 *             .policyDocument(elasticsearch_log_publishing_policyPolicyDocument.json())
 *             .policyName(&#34;elasticsearch-log-publishing-policy&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Route53 Query Logging
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicy;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var route53-query-logging-policyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(                
 *                     &#34;logs:CreateLogStream&#34;,
 *                     &#34;logs:PutLogEvents&#34;)
 *                 .resources(&#34;arn:aws:logs:*:*:log-group:/aws/route53/*&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .identifiers(&#34;route53.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var route53_query_logging_policyLogResourcePolicy = new LogResourcePolicy(&#34;route53-query-logging-policyLogResourcePolicy&#34;, LogResourcePolicyArgs.builder()        
 *             .policyDocument(route53_query_logging_policyPolicyDocument.json())
 *             .policyName(&#34;route53-query-logging-policy&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CloudWatch log resource policies can be imported using the policy name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logResourcePolicy:LogResourcePolicy MyPolicy MyPolicy
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logResourcePolicy:LogResourcePolicy")
public class LogResourcePolicy extends com.pulumi.resources.CustomResource {
    /**
     * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * 
     */
    @Export(name="policyDocument", type=String.class, parameters={})
    private Output<String> policyDocument;

    /**
     * @return Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * 
     */
    public Output<String> policyDocument() {
        return this.policyDocument;
    }
    /**
     * Name of the resource policy.
     * 
     */
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return Name of the resource policy.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogResourcePolicy(String name) {
        this(name, LogResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogResourcePolicy(String name, LogResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogResourcePolicy(String name, LogResourcePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logResourcePolicy:LogResourcePolicy", name, args == null ? LogResourcePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogResourcePolicy(String name, Output<String> id, @Nullable LogResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logResourcePolicy:LogResourcePolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LogResourcePolicy get(String name, Output<String> id, @Nullable LogResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogResourcePolicy(name, id, state, options);
    }
}