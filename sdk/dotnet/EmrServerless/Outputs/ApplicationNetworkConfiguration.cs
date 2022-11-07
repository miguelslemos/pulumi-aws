// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.EmrServerless.Outputs
{

    [OutputType]
    public sealed class ApplicationNetworkConfiguration
    {
        /// <summary>
        /// The array of security group Ids for customer VPC connectivity.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroupIds;
        /// <summary>
        /// The array of subnet Ids for customer VPC connectivity.
        /// </summary>
        public readonly ImmutableArray<string> SubnetIds;

        [OutputConstructor]
        private ApplicationNetworkConfiguration(
            ImmutableArray<string> securityGroupIds,

            ImmutableArray<string> subnetIds)
        {
            SecurityGroupIds = securityGroupIds;
            SubnetIds = subnetIds;
        }
    }
}