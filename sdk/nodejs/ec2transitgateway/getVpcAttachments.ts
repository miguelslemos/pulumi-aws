// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Get information on EC2 Transit Gateway VPC Attachments.
 *
 * ## Example Usage
 */
export function getVpcAttachments(args?: GetVpcAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcAttachmentsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2transitgateway/getVpcAttachments:getVpcAttachments", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcAttachments.
 */
export interface GetVpcAttachmentsArgs {
    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     */
    filters?: inputs.ec2transitgateway.GetVpcAttachmentsFilter[];
}

/**
 * A collection of values returned by getVpcAttachments.
 */
export interface GetVpcAttachmentsResult {
    readonly filters?: outputs.ec2transitgateway.GetVpcAttachmentsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
}

export function getVpcAttachmentsOutput(args?: GetVpcAttachmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcAttachmentsResult> {
    return pulumi.output(args).apply(a => getVpcAttachments(a, opts))
}

/**
 * A collection of arguments for invoking getVpcAttachments.
 */
export interface GetVpcAttachmentsOutputArgs {
    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2transitgateway.GetVpcAttachmentsFilterArgs>[]>;
}