// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class QuickConnectQuickConnectConfigQueueConfig
    {
        /// <summary>
        /// Specifies the identifier of the contact flow.
        /// </summary>
        public readonly string ContactFlowId;
        /// <summary>
        /// Specifies the identifier for the queue.
        /// </summary>
        public readonly string QueueId;

        [OutputConstructor]
        private QuickConnectQuickConnectConfigQueueConfig(
            string contactFlowId,

            string queueId)
        {
            ContactFlowId = contactFlowId;
            QueueId = queueId;
        }
    }
}