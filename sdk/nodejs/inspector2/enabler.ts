// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.inspector2.Enabler("example", {
 *     accountIds: ["012345678901"],
 *     resourceTypes: ["EC2"],
 * });
 * ```
 * ### For the Calling Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const test = new aws.inspector2.Enabler("test", {
 *     accountIds: [current.then(current => current.accountId)],
 *     resourceTypes: [
 *         "ECR",
 *         "EC2",
 *     ],
 * });
 * ```
 */
export class Enabler extends pulumi.CustomResource {
    /**
     * Get an existing Enabler resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnablerState, opts?: pulumi.CustomResourceOptions): Enabler {
        return new Enabler(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:inspector2/enabler:Enabler';

    /**
     * Returns true if the given object is an instance of Enabler.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Enabler {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Enabler.__pulumiType;
    }

    /**
     * Set of account IDs.
     */
    public readonly accountIds!: pulumi.Output<string[]>;
    public readonly resourceTypes!: pulumi.Output<string[]>;

    /**
     * Create a Enabler resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnablerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnablerArgs | EnablerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnablerState | undefined;
            resourceInputs["accountIds"] = state ? state.accountIds : undefined;
            resourceInputs["resourceTypes"] = state ? state.resourceTypes : undefined;
        } else {
            const args = argsOrState as EnablerArgs | undefined;
            if ((!args || args.accountIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountIds'");
            }
            if ((!args || args.resourceTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceTypes'");
            }
            resourceInputs["accountIds"] = args ? args.accountIds : undefined;
            resourceInputs["resourceTypes"] = args ? args.resourceTypes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Enabler.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Enabler resources.
 */
export interface EnablerState {
    /**
     * Set of account IDs.
     */
    accountIds?: pulumi.Input<pulumi.Input<string>[]>;
    resourceTypes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Enabler resource.
 */
export interface EnablerArgs {
    /**
     * Set of account IDs.
     */
    accountIds: pulumi.Input<pulumi.Input<string>[]>;
    resourceTypes: pulumi.Input<pulumi.Input<string>[]>;
}