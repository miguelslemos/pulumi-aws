// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DirectoryService.Inputs
{

    public sealed class ServiceRegionVpcSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The identifiers of the subnets for the directory servers.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        /// <summary>
        /// The identifier of the VPC in which to create the directory.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public ServiceRegionVpcSettingsArgs()
        {
        }
        public static new ServiceRegionVpcSettingsArgs Empty => new ServiceRegionVpcSettingsArgs();
    }
}