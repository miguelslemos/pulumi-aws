// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshiftserverless.UsageLimitArgs;
import com.pulumi.aws.redshiftserverless.inputs.UsageLimitState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift Serverless Usage Limit.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshiftserverless.Workgroup;
 * import com.pulumi.aws.redshiftserverless.WorkgroupArgs;
 * import com.pulumi.aws.redshiftserverless.UsageLimit;
 * import com.pulumi.aws.redshiftserverless.UsageLimitArgs;
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
 *         var exampleWorkgroup = new Workgroup(&#34;exampleWorkgroup&#34;, WorkgroupArgs.builder()        
 *             .namespaceName(aws_redshiftserverless_namespace.example().namespace_name())
 *             .workgroupName(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleUsageLimit = new UsageLimit(&#34;exampleUsageLimit&#34;, UsageLimitArgs.builder()        
 *             .resourceArn(exampleWorkgroup.arn())
 *             .usageType(&#34;serverless-compute&#34;)
 *             .amount(60)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Redshift Serverless Usage Limits can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshiftserverless/usageLimit:UsageLimit example example-id
 * ```
 * 
 */
@ResourceType(type="aws:redshiftserverless/usageLimit:UsageLimit")
public class UsageLimit extends com.pulumi.resources.CustomResource {
    /**
     * The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The value must be a positive number.
     * 
     */
    @Export(name="amount", type=Integer.class, parameters={})
    private Output<Integer> amount;

    /**
     * @return The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The value must be a positive number.
     * 
     */
    public Output<Integer> amount() {
        return this.amount;
    }
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Usage Limit.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Serverless Usage Limit.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The action that Amazon Redshift Serverless takes when the limit is reached. Valid values are `log`, `emit-metric`, and `deactivate`. The default is `log`.
     * 
     */
    @Export(name="breachAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> breachAction;

    /**
     * @return The action that Amazon Redshift Serverless takes when the limit is reached. Valid values are `log`, `emit-metric`, and `deactivate`. The default is `log`.
     * 
     */
    public Output<Optional<String>> breachAction() {
        return Codegen.optional(this.breachAction);
    }
    /**
     * The time period that the amount applies to. A weekly period begins on Sunday. Valid values are `daily`, `weekly`, and `monthly`. The default is `monthly`.
     * 
     */
    @Export(name="period", type=String.class, parameters={})
    private Output</* @Nullable */ String> period;

    /**
     * @return The time period that the amount applies to. A weekly period begins on Sunday. Valid values are `daily`, `weekly`, and `monthly`. The default is `monthly`.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The type of Amazon Redshift Serverless usage to create a usage limit for. Valid values are `serverless-compute` or `cross-region-datasharing`.
     * 
     */
    @Export(name="usageType", type=String.class, parameters={})
    private Output<String> usageType;

    /**
     * @return The type of Amazon Redshift Serverless usage to create a usage limit for. Valid values are `serverless-compute` or `cross-region-datasharing`.
     * 
     */
    public Output<String> usageType() {
        return this.usageType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UsageLimit(String name) {
        this(name, UsageLimitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UsageLimit(String name, UsageLimitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UsageLimit(String name, UsageLimitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/usageLimit:UsageLimit", name, args == null ? UsageLimitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UsageLimit(String name, Output<String> id, @Nullable UsageLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/usageLimit:UsageLimit", name, state, makeResourceOptions(options, id));
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
    public static UsageLimit get(String name, Output<String> id, @Nullable UsageLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UsageLimit(name, id, state, options);
    }
}