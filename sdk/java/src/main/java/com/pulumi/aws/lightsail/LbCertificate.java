// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.LbCertificateArgs;
import com.pulumi.aws.lightsail.inputs.LbCertificateState;
import com.pulumi.aws.lightsail.outputs.LbCertificateDomainValidationRecord;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Lightsail load balancer Certificate resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Lb;
 * import com.pulumi.aws.lightsail.LbArgs;
 * import com.pulumi.aws.lightsail.LbCertificate;
 * import com.pulumi.aws.lightsail.LbCertificateArgs;
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
 *         var testLb = new Lb(&#34;testLb&#34;, LbArgs.builder()        
 *             .healthCheckPath(&#34;/&#34;)
 *             .instancePort(&#34;80&#34;)
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         var testLbCertificate = new LbCertificate(&#34;testLbCertificate&#34;, LbCertificateArgs.builder()        
 *             .lbName(testLb.id())
 *             .domainName(&#34;test.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_lightsail_lb_certificate` can be imported by using the id attribute, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lightsail/lbCertificate:LbCertificate test example-load-balancer,example-load-balancer-certificate
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/lbCertificate:LbCertificate")
public class LbCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the lightsail certificate.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the lightsail certificate.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The timestamp when the instance was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The timestamp when the instance was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The domain name (e.g., example.com) for your SSL/TLS certificate.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name (e.g., example.com) for your SSL/TLS certificate.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    @Export(name="domainValidationRecords", type=List.class, parameters={LbCertificateDomainValidationRecord.class})
    private Output<List<LbCertificateDomainValidationRecord>> domainValidationRecords;

    public Output<List<LbCertificateDomainValidationRecord>> domainValidationRecords() {
        return this.domainValidationRecords;
    }
    /**
     * The load balancer name where you want to create the SSL/TLS certificate.
     * 
     */
    @Export(name="lbName", type=String.class, parameters={})
    private Output<String> lbName;

    /**
     * @return The load balancer name where you want to create the SSL/TLS certificate.
     * 
     */
    public Output<String> lbName() {
        return this.lbName;
    }
    /**
     * The SSL/TLS certificate name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The SSL/TLS certificate name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Set of domains that should be SANs in the issued certificate. `domain_name` attribute is automatically added as a Subject Alternative Name.
     * 
     */
    @Export(name="subjectAlternativeNames", type=List.class, parameters={String.class})
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return Set of domains that should be SANs in the issued certificate. `domain_name` attribute is automatically added as a Subject Alternative Name.
     * 
     */
    public Output<List<String>> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    @Export(name="supportCode", type=String.class, parameters={})
    private Output<String> supportCode;

    public Output<String> supportCode() {
        return this.supportCode;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LbCertificate(String name) {
        this(name, LbCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LbCertificate(String name, LbCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LbCertificate(String name, LbCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/lbCertificate:LbCertificate", name, args == null ? LbCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LbCertificate(String name, Output<String> id, @Nullable LbCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/lbCertificate:LbCertificate", name, state, makeResourceOptions(options, id));
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
    public static LbCertificate get(String name, Output<String> id, @Nullable LbCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LbCertificate(name, id, state, options);
    }
}