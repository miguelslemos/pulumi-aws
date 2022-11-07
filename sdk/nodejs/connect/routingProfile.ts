// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Connect Routing Profile resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.connect.RoutingProfile("example", {
 *     defaultOutboundQueueId: "12345678-1234-1234-1234-123456789012",
 *     description: "example description",
 *     instanceId: "aaaaaaaa-bbbb-cccc-dddd-111111111111",
 *     mediaConcurrencies: [{
 *         channel: "VOICE",
 *         concurrency: 1,
 *     }],
 *     queueConfigs: [{
 *         channel: "VOICE",
 *         delay: 2,
 *         priority: 1,
 *         queueId: "12345678-1234-1234-1234-123456789012",
 *     }],
 *     tags: {
 *         Name: "Example Routing Profile",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Amazon Connect Routing Profiles can be imported using the `instance_id` and `routing_profile_id` separated by a colon (`:`), e.g.,
 *
 * ```sh
 *  $ pulumi import aws:connect/routingProfile:RoutingProfile example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 */
export class RoutingProfile extends pulumi.CustomResource {
    /**
     * Get an existing RoutingProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoutingProfileState, opts?: pulumi.CustomResourceOptions): RoutingProfile {
        return new RoutingProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:connect/routingProfile:RoutingProfile';

    /**
     * Returns true if the given object is an instance of RoutingProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoutingProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoutingProfile.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Routing Profile.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies the default outbound queue for the Routing Profile.
     */
    public readonly defaultOutboundQueueId!: pulumi.Output<string>;
    /**
     * Specifies the description of the Routing Profile.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     */
    public readonly mediaConcurrencies!: pulumi.Output<outputs.connect.RoutingProfileMediaConcurrency[]>;
    /**
     * Specifies the name of the Routing Profile.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     */
    public readonly queueConfigs!: pulumi.Output<outputs.connect.RoutingProfileQueueConfig[] | undefined>;
    public /*out*/ readonly queueConfigsAssociateds!: pulumi.Output<outputs.connect.RoutingProfileQueueConfigsAssociated[]>;
    /**
     * The identifier for the Routing Profile.
     */
    public /*out*/ readonly routingProfileId!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a RoutingProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoutingProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoutingProfileArgs | RoutingProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoutingProfileState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["defaultOutboundQueueId"] = state ? state.defaultOutboundQueueId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["mediaConcurrencies"] = state ? state.mediaConcurrencies : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["queueConfigs"] = state ? state.queueConfigs : undefined;
            resourceInputs["queueConfigsAssociateds"] = state ? state.queueConfigsAssociateds : undefined;
            resourceInputs["routingProfileId"] = state ? state.routingProfileId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as RoutingProfileArgs | undefined;
            if ((!args || args.defaultOutboundQueueId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultOutboundQueueId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.mediaConcurrencies === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mediaConcurrencies'");
            }
            resourceInputs["defaultOutboundQueueId"] = args ? args.defaultOutboundQueueId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["mediaConcurrencies"] = args ? args.mediaConcurrencies : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["queueConfigs"] = args ? args.queueConfigs : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["queueConfigsAssociateds"] = undefined /*out*/;
            resourceInputs["routingProfileId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoutingProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoutingProfile resources.
 */
export interface RoutingProfileState {
    /**
     * The Amazon Resource Name (ARN) of the Routing Profile.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies the default outbound queue for the Routing Profile.
     */
    defaultOutboundQueueId?: pulumi.Input<string>;
    /**
     * Specifies the description of the Routing Profile.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     */
    mediaConcurrencies?: pulumi.Input<pulumi.Input<inputs.connect.RoutingProfileMediaConcurrency>[]>;
    /**
     * Specifies the name of the Routing Profile.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     */
    queueConfigs?: pulumi.Input<pulumi.Input<inputs.connect.RoutingProfileQueueConfig>[]>;
    queueConfigsAssociateds?: pulumi.Input<pulumi.Input<inputs.connect.RoutingProfileQueueConfigsAssociated>[]>;
    /**
     * The identifier for the Routing Profile.
     */
    routingProfileId?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a RoutingProfile resource.
 */
export interface RoutingProfileArgs {
    /**
     * Specifies the default outbound queue for the Routing Profile.
     */
    defaultOutboundQueueId: pulumi.Input<string>;
    /**
     * Specifies the description of the Routing Profile.
     */
    description: pulumi.Input<string>;
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     */
    mediaConcurrencies: pulumi.Input<pulumi.Input<inputs.connect.RoutingProfileMediaConcurrency>[]>;
    /**
     * Specifies the name of the Routing Profile.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     */
    queueConfigs?: pulumi.Input<pulumi.Input<inputs.connect.RoutingProfileQueueConfig>[]>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}