// *** WARNING: this file was generated by the Lumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as lumi from "@lumi/lumi";
import * as lumirt from "@lumi/lumirt";

export class SecurityGroupRule extends lumi.NamedResource implements SecurityGroupRuleArgs {
    public readonly cidrBlocks?: string[];
    public readonly fromPort: number;
    public readonly ipv6CidrBlocks?: string[];
    public readonly prefixListIds?: string[];
    public readonly protocol: string;
    public readonly securityGroupId: string;
    public readonly self?: boolean;
    public readonly sourceSecurityGroupId: string;
    public readonly toPort: number;
    public readonly type: string;

    constructor(name: string, args: SecurityGroupRuleArgs) {
        super(name);
        this.cidrBlocks = args.cidrBlocks;
        if (lumirt.defaultIfComputed(args.fromPort, "") === undefined) {
            throw new Error("Property argument 'fromPort' is required, but was missing");
        }
        this.fromPort = args.fromPort;
        this.ipv6CidrBlocks = args.ipv6CidrBlocks;
        this.prefixListIds = args.prefixListIds;
        if (lumirt.defaultIfComputed(args.protocol, "") === undefined) {
            throw new Error("Property argument 'protocol' is required, but was missing");
        }
        this.protocol = args.protocol;
        if (lumirt.defaultIfComputed(args.securityGroupId, "") === undefined) {
            throw new Error("Property argument 'securityGroupId' is required, but was missing");
        }
        this.securityGroupId = args.securityGroupId;
        this.self = args.self;
        this.sourceSecurityGroupId = args.sourceSecurityGroupId;
        if (lumirt.defaultIfComputed(args.toPort, "") === undefined) {
            throw new Error("Property argument 'toPort' is required, but was missing");
        }
        this.toPort = args.toPort;
        if (lumirt.defaultIfComputed(args.type, "") === undefined) {
            throw new Error("Property argument 'type' is required, but was missing");
        }
        this.type = args.type;
    }
}

export interface SecurityGroupRuleArgs {
    readonly cidrBlocks?: string[];
    readonly fromPort: number;
    readonly ipv6CidrBlocks?: string[];
    readonly prefixListIds?: string[];
    readonly protocol: string;
    readonly securityGroupId: string;
    readonly self?: boolean;
    readonly sourceSecurityGroupId?: string;
    readonly toPort: number;
    // Type of rule, ingress (inbound) or egress (outbound).
    readonly type: string;
}
