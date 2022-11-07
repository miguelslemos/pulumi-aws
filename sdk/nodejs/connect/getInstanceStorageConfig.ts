// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Amazon Connect Instance Storage Config.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.connect.getInstanceStorageConfig({
 *     associationId: "1234567890123456789012345678901234567890123456789012345678901234",
 *     instanceId: "aaaaaaaa-bbbb-cccc-dddd-111111111111",
 *     resourceType: "CONTACT_TRACE_RECORDS",
 * }));
 * ```
 */
export function getInstanceStorageConfig(args: GetInstanceStorageConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceStorageConfigResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:connect/getInstanceStorageConfig:getInstanceStorageConfig", {
        "associationId": args.associationId,
        "instanceId": args.instanceId,
        "resourceType": args.resourceType,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceStorageConfig.
 */
export interface GetInstanceStorageConfigArgs {
    /**
     * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
     */
    associationId: string;
    /**
     * Reference to the hosting Amazon Connect Instance
     */
    instanceId: string;
    /**
     * A valid resource type. Valid Values: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` | `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS`.
     */
    resourceType: string;
}

/**
 * A collection of values returned by getInstanceStorageConfig.
 */
export interface GetInstanceStorageConfigResult {
    readonly associationId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId: string;
    readonly resourceType: string;
    /**
     * Specifies the storage configuration options for the Connect Instance. Documented below.
     */
    readonly storageConfigs: outputs.connect.GetInstanceStorageConfigStorageConfig[];
}

export function getInstanceStorageConfigOutput(args: GetInstanceStorageConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceStorageConfigResult> {
    return pulumi.output(args).apply(a => getInstanceStorageConfig(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceStorageConfig.
 */
export interface GetInstanceStorageConfigOutputArgs {
    /**
     * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
     */
    associationId: pulumi.Input<string>;
    /**
     * Reference to the hosting Amazon Connect Instance
     */
    instanceId: pulumi.Input<string>;
    /**
     * A valid resource type. Valid Values: `CHAT_TRANSCRIPTS` | `CALL_RECORDINGS` | `SCHEDULED_REPORTS` | `MEDIA_STREAMS` | `CONTACT_TRACE_RECORDS` | `AGENT_EVENTS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS`.
     */
    resourceType: pulumi.Input<string>;
}