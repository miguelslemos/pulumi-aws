// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as fabric from "@pulumi/pulumi-fabric";

export class Response
        extends fabric.Resource implements ResponseArgs {
    public readonly responseParameters?: fabric.Property<{[key: string]: string}>;
    public readonly responseTemplates?: fabric.Property<{[key: string]: string}>;
    public readonly responseType: fabric.Property<string>;
    public readonly restApiId: fabric.Property<string>;
    public readonly statusCode?: fabric.Property<string>;

    constructor(urnName: string, args: ResponseArgs) {
        if (args.responseType === undefined) {
            throw new Error("Missing required property 'responseType'");
        }
        if (args.restApiId === undefined) {
            throw new Error("Missing required property 'restApiId'");
        }
        super("aws:apigateway/response:Response", urnName, {
            "responseParameters": args.responseParameters,
            "responseTemplates": args.responseTemplates,
            "responseType": args.responseType,
            "restApiId": args.restApiId,
            "statusCode": args.statusCode,
        });
    }
}

export interface ResponseArgs {
    readonly responseParameters?: fabric.PropertyValue<{[key: string]: string}>;
    readonly responseTemplates?: fabric.PropertyValue<{[key: string]: string}>;
    readonly responseType: fabric.PropertyValue<string>;
    readonly restApiId: fabric.PropertyValue<string>;
    readonly statusCode?: fabric.PropertyValue<string>;
}
