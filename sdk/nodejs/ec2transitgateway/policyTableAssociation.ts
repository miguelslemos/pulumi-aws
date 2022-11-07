// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EC2 Transit Gateway Policy Table association.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.PolicyTableAssociation("example", {
 *     transitGatewayAttachmentId: aws_networkmanager_transit_gateway_peering.example.transit_gateway_peering_attachment_id,
 *     transitGatewayPolicyTableId: aws_ec2_transit_gateway_policy_table.example.id,
 * });
 * ```
 *
 * ## Import
 *
 * `aws_ec2_transit_gateway_policy_table_association` can be imported by using the EC2 Transit Gateway Policy Table identifier, an underscore, and the EC2 Transit Gateway Attachment identifier, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/policyTableAssociation:PolicyTableAssociation example tgw-rtb-12345678_tgw-attach-87654321
 * ```
 */
export class PolicyTableAssociation extends pulumi.CustomResource {
    /**
     * Get an existing PolicyTableAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyTableAssociationState, opts?: pulumi.CustomResourceOptions): PolicyTableAssociation {
        return new PolicyTableAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/policyTableAssociation:PolicyTableAssociation';

    /**
     * Returns true if the given object is an instance of PolicyTableAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyTableAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyTableAssociation.__pulumiType;
    }

    /**
     * Identifier of the resource
     */
    public /*out*/ readonly resourceId!: pulumi.Output<string>;
    /**
     * Type of the resource
     */
    public /*out*/ readonly resourceType!: pulumi.Output<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     */
    public readonly transitGatewayAttachmentId!: pulumi.Output<string>;
    /**
     * Identifier of EC2 Transit Gateway Policy Table.
     */
    public readonly transitGatewayPolicyTableId!: pulumi.Output<string>;

    /**
     * Create a PolicyTableAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyTableAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyTableAssociationArgs | PolicyTableAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyTableAssociationState | undefined;
            resourceInputs["resourceId"] = state ? state.resourceId : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["transitGatewayAttachmentId"] = state ? state.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayPolicyTableId"] = state ? state.transitGatewayPolicyTableId : undefined;
        } else {
            const args = argsOrState as PolicyTableAssociationArgs | undefined;
            if ((!args || args.transitGatewayAttachmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayAttachmentId'");
            }
            if ((!args || args.transitGatewayPolicyTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayPolicyTableId'");
            }
            resourceInputs["transitGatewayAttachmentId"] = args ? args.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayPolicyTableId"] = args ? args.transitGatewayPolicyTableId : undefined;
            resourceInputs["resourceId"] = undefined /*out*/;
            resourceInputs["resourceType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolicyTableAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyTableAssociation resources.
 */
export interface PolicyTableAssociationState {
    /**
     * Identifier of the resource
     */
    resourceId?: pulumi.Input<string>;
    /**
     * Type of the resource
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Policy Table.
     */
    transitGatewayPolicyTableId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyTableAssociation resource.
 */
export interface PolicyTableAssociationArgs {
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     */
    transitGatewayAttachmentId: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Policy Table.
     */
    transitGatewayPolicyTableId: pulumi.Input<string>;
}