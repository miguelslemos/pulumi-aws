// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ConnectorProfileArgs, ConnectorProfileState } from "./connectorProfile";
export type ConnectorProfile = import("./connectorProfile").ConnectorProfile;
export const ConnectorProfile: typeof import("./connectorProfile").ConnectorProfile = null as any;

export { FlowArgs, FlowState } from "./flow";
export type Flow = import("./flow").Flow;
export const Flow: typeof import("./flow").Flow = null as any;

utilities.lazyLoad(exports, ["ConnectorProfile"], () => require("./connectorProfile"));
utilities.lazyLoad(exports, ["Flow"], () => require("./flow"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:appflow/connectorProfile:ConnectorProfile":
                return new ConnectorProfile(name, <any>undefined, { urn })
            case "aws:appflow/flow:Flow":
                return new Flow(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "appflow/connectorProfile", _module)
pulumi.runtime.registerResourceModule("aws", "appflow/flow", _module)