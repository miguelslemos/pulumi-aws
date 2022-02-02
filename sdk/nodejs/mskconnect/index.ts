// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./customPlugin";
export * from "./getCustomPlugin";
export * from "./getWorkerConfiguration";
export * from "./workerConfiguration";

// Import resources to register:
import { CustomPlugin } from "./customPlugin";
import { WorkerConfiguration } from "./workerConfiguration";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:mskconnect/customPlugin:CustomPlugin":
                return new CustomPlugin(name, <any>undefined, { urn })
            case "aws:mskconnect/workerConfiguration:WorkerConfiguration":
                return new WorkerConfiguration(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "mskconnect/customPlugin", _module)
pulumi.runtime.registerResourceModule("aws", "mskconnect/workerConfiguration", _module)