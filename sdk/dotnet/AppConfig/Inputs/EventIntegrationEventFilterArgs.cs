// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig.Inputs
{

    public sealed class EventIntegrationEventFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Source of the events.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public EventIntegrationEventFilterArgs()
        {
        }
        public static new EventIntegrationEventFilterArgs Empty => new EventIntegrationEventFilterArgs();
    }
}