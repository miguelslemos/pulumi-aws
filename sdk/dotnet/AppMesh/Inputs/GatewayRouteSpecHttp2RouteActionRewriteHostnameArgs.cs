// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecHttp2RouteActionRewriteHostnameArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default target host name to write to. Valid values: `ENABLED`, `DISABLED`.
        /// </summary>
        [Input("defaultTargetHostname", required: true)]
        public Input<string> DefaultTargetHostname { get; set; } = null!;

        public GatewayRouteSpecHttp2RouteActionRewriteHostnameArgs()
        {
        }
        public static new GatewayRouteSpecHttp2RouteActionRewriteHostnameArgs Empty => new GatewayRouteSpecHttp2RouteActionRewriteHostnameArgs();
    }
}