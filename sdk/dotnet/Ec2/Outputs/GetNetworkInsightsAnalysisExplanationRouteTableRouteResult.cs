// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class GetNetworkInsightsAnalysisExplanationRouteTableRouteResult
    {
        public readonly string DestinationCidr;
        public readonly string DestinationPrefixListId;
        public readonly string EgressOnlyInternetGatewayId;
        public readonly string GatewayId;
        public readonly string InstanceId;
        public readonly string NatGatewayId;
        public readonly string NetworkInterfaceId;
        public readonly string Origin;
        public readonly string TransitGatewayId;
        public readonly string VpcPeeringConnectionId;

        [OutputConstructor]
        private GetNetworkInsightsAnalysisExplanationRouteTableRouteResult(
            string destinationCidr,

            string destinationPrefixListId,

            string egressOnlyInternetGatewayId,

            string gatewayId,

            string instanceId,

            string natGatewayId,

            string networkInterfaceId,

            string origin,

            string transitGatewayId,

            string vpcPeeringConnectionId)
        {
            DestinationCidr = destinationCidr;
            DestinationPrefixListId = destinationPrefixListId;
            EgressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
            GatewayId = gatewayId;
            InstanceId = instanceId;
            NatGatewayId = natGatewayId;
            NetworkInterfaceId = networkInterfaceId;
            Origin = origin;
            TransitGatewayId = transitGatewayId;
            VpcPeeringConnectionId = vpcPeeringConnectionId;
        }
    }
}