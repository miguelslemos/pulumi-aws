// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Retrieve information about a site.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getSite({
 *     globalNetworkId: _var.global_network_id,
 *     siteId: _var.site_id,
 * });
 * ```
 */
export function getSite(args: GetSiteArgs, opts?: pulumi.InvokeOptions): Promise<GetSiteResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:networkmanager/getSite:getSite", {
        "globalNetworkId": args.globalNetworkId,
        "siteId": args.siteId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSite.
 */
export interface GetSiteArgs {
    /**
     * ID of the Global Network of the site to retrieve.
     */
    globalNetworkId: string;
    /**
     * ID of the specific site to retrieve.
     */
    siteId: string;
    /**
     * Key-value tags for the Site.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getSite.
 */
export interface GetSiteResult {
    /**
     * ARN of the site.
     */
    readonly arn: string;
    /**
     * Description of the site.
     */
    readonly description: string;
    readonly globalNetworkId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Site location as documented below.
     */
    readonly locations: outputs.networkmanager.GetSiteLocation[];
    readonly siteId: string;
    /**
     * Key-value tags for the Site.
     */
    readonly tags: {[key: string]: string};
}

export function getSiteOutput(args: GetSiteOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSiteResult> {
    return pulumi.output(args).apply(a => getSite(a, opts))
}

/**
 * A collection of arguments for invoking getSite.
 */
export interface GetSiteOutputArgs {
    /**
     * ID of the Global Network of the site to retrieve.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * ID of the specific site to retrieve.
     */
    siteId: pulumi.Input<string>;
    /**
     * Key-value tags for the Site.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}