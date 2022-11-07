// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetWorkspaceArgs, GetWorkspaceResult, GetWorkspaceOutputArgs } from "./getWorkspace";
export const getWorkspace: typeof import("./getWorkspace").getWorkspace = null as any;
export const getWorkspaceOutput: typeof import("./getWorkspace").getWorkspaceOutput = null as any;

export { LicenseAssociationArgs, LicenseAssociationState } from "./licenseAssociation";
export type LicenseAssociation = import("./licenseAssociation").LicenseAssociation;
export const LicenseAssociation: typeof import("./licenseAssociation").LicenseAssociation = null as any;

export { RoleAssociationArgs, RoleAssociationState } from "./roleAssociation";
export type RoleAssociation = import("./roleAssociation").RoleAssociation;
export const RoleAssociation: typeof import("./roleAssociation").RoleAssociation = null as any;

export { WorkspaceArgs, WorkspaceState } from "./workspace";
export type Workspace = import("./workspace").Workspace;
export const Workspace: typeof import("./workspace").Workspace = null as any;

export { WorkspaceApiKeyArgs, WorkspaceApiKeyState } from "./workspaceApiKey";
export type WorkspaceApiKey = import("./workspaceApiKey").WorkspaceApiKey;
export const WorkspaceApiKey: typeof import("./workspaceApiKey").WorkspaceApiKey = null as any;

export { WorkspaceSamlConfigurationArgs, WorkspaceSamlConfigurationState } from "./workspaceSamlConfiguration";
export type WorkspaceSamlConfiguration = import("./workspaceSamlConfiguration").WorkspaceSamlConfiguration;
export const WorkspaceSamlConfiguration: typeof import("./workspaceSamlConfiguration").WorkspaceSamlConfiguration = null as any;

utilities.lazyLoad(exports, ["getWorkspace","getWorkspaceOutput"], () => require("./getWorkspace"));
utilities.lazyLoad(exports, ["LicenseAssociation"], () => require("./licenseAssociation"));
utilities.lazyLoad(exports, ["RoleAssociation"], () => require("./roleAssociation"));
utilities.lazyLoad(exports, ["Workspace"], () => require("./workspace"));
utilities.lazyLoad(exports, ["WorkspaceApiKey"], () => require("./workspaceApiKey"));
utilities.lazyLoad(exports, ["WorkspaceSamlConfiguration"], () => require("./workspaceSamlConfiguration"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:grafana/licenseAssociation:LicenseAssociation":
                return new LicenseAssociation(name, <any>undefined, { urn })
            case "aws:grafana/roleAssociation:RoleAssociation":
                return new RoleAssociation(name, <any>undefined, { urn })
            case "aws:grafana/workspace:Workspace":
                return new Workspace(name, <any>undefined, { urn })
            case "aws:grafana/workspaceApiKey:WorkspaceApiKey":
                return new WorkspaceApiKey(name, <any>undefined, { urn })
            case "aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration":
                return new WorkspaceSamlConfiguration(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "grafana/licenseAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "grafana/roleAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "grafana/workspace", _module)
pulumi.runtime.registerResourceModule("aws", "grafana/workspaceApiKey", _module)
pulumi.runtime.registerResourceModule("aws", "grafana/workspaceSamlConfiguration", _module)