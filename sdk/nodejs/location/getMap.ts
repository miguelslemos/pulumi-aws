// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Retrieve information about a Location Service Map.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.location.getMap({
 *     mapName: "example",
 * }));
 * ```
 */
export function getMap(args: GetMapArgs, opts?: pulumi.InvokeOptions): Promise<GetMapResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:location/getMap:getMap", {
        "mapName": args.mapName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getMap.
 */
export interface GetMapArgs {
    /**
     * Name of the map resource.
     */
    mapName: string;
    /**
     * Key-value map of resource tags for the map.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getMap.
 */
export interface GetMapResult {
    /**
     * List of configurations that specify the map tile style selected from a partner data provider.
     */
    readonly configurations: outputs.location.GetMapConfiguration[];
    /**
     * Timestamp for when the map resource was created in ISO 8601 format.
     */
    readonly createTime: string;
    /**
     * Optional description for the map resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * ARN for the map resource.
     */
    readonly mapArn: string;
    readonly mapName: string;
    /**
     * Key-value map of resource tags for the map.
     */
    readonly tags: {[key: string]: string};
    /**
     * Timestamp for when the map resource was last updated in ISO 8601 format.
     */
    readonly updateTime: string;
}

export function getMapOutput(args: GetMapOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMapResult> {
    return pulumi.output(args).apply(a => getMap(a, opts))
}

/**
 * A collection of arguments for invoking getMap.
 */
export interface GetMapOutputArgs {
    /**
     * Name of the map resource.
     */
    mapName: pulumi.Input<string>;
    /**
     * Key-value map of resource tags for the map.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}