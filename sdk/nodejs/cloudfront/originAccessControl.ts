// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an AWS CloudFront Origin Access Control, which is used by CloudFront Distributions with an Amazon S3 bucket as the origin.
 *
 * Read more about Origin Access Control in the [CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html).
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.cloudfront.OriginAccessControl("example", {
 *     description: "Example Policy",
 *     originAccessControlOriginType: "s3",
 *     signingBehavior: "always",
 *     signingProtocol: "sigv4",
 * });
 * ```
 *
 * ## Import
 *
 * CloudFront Origin Access Control can be imported using the `id`. For example
 *
 * ```sh
 *  $ pulumi import aws:cloudfront/originAccessControl:OriginAccessControl example E327GJI25M56DG
 * ```
 */
export class OriginAccessControl extends pulumi.CustomResource {
    /**
     * Get an existing OriginAccessControl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OriginAccessControlState, opts?: pulumi.CustomResourceOptions): OriginAccessControl {
        return new OriginAccessControl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudfront/originAccessControl:OriginAccessControl';

    /**
     * Returns true if the given object is an instance of OriginAccessControl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OriginAccessControl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OriginAccessControl.__pulumiType;
    }

    /**
     * The description of the Origin Access Control. It may be empty.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The current version of this Origin Access Control.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * A name that identifies the Origin Access Control.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The type of origin that this Origin Access Control is for. The only valid value is `s3`.
     */
    public readonly originAccessControlOriginType!: pulumi.Output<string>;
    /**
     * Specifies which requests CloudFront signs. Specify `always` for the most common use case. Allowed values: `always`, `never`, `no-override`.
     */
    public readonly signingBehavior!: pulumi.Output<string>;
    /**
     * Determines how CloudFront signs (authenticates) requests. Valid values: `sigv4`.
     */
    public readonly signingProtocol!: pulumi.Output<string>;

    /**
     * Create a OriginAccessControl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OriginAccessControlArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OriginAccessControlArgs | OriginAccessControlState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OriginAccessControlState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["originAccessControlOriginType"] = state ? state.originAccessControlOriginType : undefined;
            resourceInputs["signingBehavior"] = state ? state.signingBehavior : undefined;
            resourceInputs["signingProtocol"] = state ? state.signingProtocol : undefined;
        } else {
            const args = argsOrState as OriginAccessControlArgs | undefined;
            if ((!args || args.originAccessControlOriginType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'originAccessControlOriginType'");
            }
            if ((!args || args.signingBehavior === undefined) && !opts.urn) {
                throw new Error("Missing required property 'signingBehavior'");
            }
            if ((!args || args.signingProtocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'signingProtocol'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["originAccessControlOriginType"] = args ? args.originAccessControlOriginType : undefined;
            resourceInputs["signingBehavior"] = args ? args.signingBehavior : undefined;
            resourceInputs["signingProtocol"] = args ? args.signingProtocol : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OriginAccessControl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OriginAccessControl resources.
 */
export interface OriginAccessControlState {
    /**
     * The description of the Origin Access Control. It may be empty.
     */
    description?: pulumi.Input<string>;
    /**
     * The current version of this Origin Access Control.
     */
    etag?: pulumi.Input<string>;
    /**
     * A name that identifies the Origin Access Control.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of origin that this Origin Access Control is for. The only valid value is `s3`.
     */
    originAccessControlOriginType?: pulumi.Input<string>;
    /**
     * Specifies which requests CloudFront signs. Specify `always` for the most common use case. Allowed values: `always`, `never`, `no-override`.
     */
    signingBehavior?: pulumi.Input<string>;
    /**
     * Determines how CloudFront signs (authenticates) requests. Valid values: `sigv4`.
     */
    signingProtocol?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OriginAccessControl resource.
 */
export interface OriginAccessControlArgs {
    /**
     * The description of the Origin Access Control. It may be empty.
     */
    description?: pulumi.Input<string>;
    /**
     * A name that identifies the Origin Access Control.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of origin that this Origin Access Control is for. The only valid value is `s3`.
     */
    originAccessControlOriginType: pulumi.Input<string>;
    /**
     * Specifies which requests CloudFront signs. Specify `always` for the most common use case. Allowed values: `always`, `never`, `no-override`.
     */
    signingBehavior: pulumi.Input<string>;
    /**
     * Determines how CloudFront signs (authenticates) requests. Valid values: `sigv4`.
     */
    signingProtocol: pulumi.Input<string>;
}