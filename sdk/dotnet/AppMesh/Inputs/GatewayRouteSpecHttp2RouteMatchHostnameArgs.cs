// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecHttp2RouteMatchHostnameArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Exact host name to match on.
        /// </summary>
        [Input("exact")]
        public Input<string>? Exact { get; set; }

        /// <summary>
        /// Specified ending characters of the host name to match on.
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        public GatewayRouteSpecHttp2RouteMatchHostnameArgs()
        {
        }
        public static new GatewayRouteSpecHttp2RouteMatchHostnameArgs Empty => new GatewayRouteSpecHttp2RouteMatchHostnameArgs();
    }
}