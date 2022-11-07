// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Outputs
{

    [OutputType]
    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorErrorHandlingConfig
    {
        /// <summary>
        /// Amazon S3 bucket name where the source files are stored.
        /// </summary>
        public readonly string? BucketName;
        /// <summary>
        /// Object key for the Amazon S3 bucket in which the source files are stored.
        /// </summary>
        public readonly string? BucketPrefix;
        /// <summary>
        /// If the flow should fail after the first instance of a failure when attempting to place data in the destination.
        /// </summary>
        public readonly bool? FailOnFirstDestinationError;

        [OutputConstructor]
        private FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorErrorHandlingConfig(
            string? bucketName,

            string? bucketPrefix,

            bool? failOnFirstDestinationError)
        {
            BucketName = bucketName;
            BucketPrefix = bucketPrefix;
            FailOnFirstDestinationError = failOnFirstDestinationError;
        }
    }
}