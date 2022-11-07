// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3Control.Inputs
{

    public sealed class StorageLensConfigurationStorageLensConfigurationDataExportGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon CloudWatch publishing for S3 Storage Lens metrics. See Cloud Watch Metrics below for more details.
        /// </summary>
        [Input("cloudWatchMetrics")]
        public Input<Inputs.StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsGetArgs>? CloudWatchMetrics { get; set; }

        /// <summary>
        /// The bucket where the S3 Storage Lens metrics export will be located. See S3 Bucket Destination below for more details.
        /// </summary>
        [Input("s3BucketDestination")]
        public Input<Inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationGetArgs>? S3BucketDestination { get; set; }

        public StorageLensConfigurationStorageLensConfigurationDataExportGetArgs()
        {
        }
        public static new StorageLensConfigurationStorageLensConfigurationDataExportGetArgs Empty => new StorageLensConfigurationStorageLensConfigurationDataExportGetArgs();
    }
}