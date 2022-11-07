// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MskConnect.Inputs
{

    public sealed class ConnectorLogDeliveryWorkerLogDeliveryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details about delivering logs to Amazon CloudWatch Logs. See below.
        /// </summary>
        [Input("cloudwatchLogs")]
        public Input<Inputs.ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogsArgs>? CloudwatchLogs { get; set; }

        /// <summary>
        /// Details about delivering logs to Amazon Kinesis Data Firehose. See below.
        /// </summary>
        [Input("firehose")]
        public Input<Inputs.ConnectorLogDeliveryWorkerLogDeliveryFirehoseArgs>? Firehose { get; set; }

        /// <summary>
        /// Details about delivering logs to Amazon S3. See below.
        /// </summary>
        [Input("s3")]
        public Input<Inputs.ConnectorLogDeliveryWorkerLogDeliveryS3Args>? S3 { get; set; }

        public ConnectorLogDeliveryWorkerLogDeliveryArgs()
        {
        }
        public static new ConnectorLogDeliveryWorkerLogDeliveryArgs Empty => new ConnectorLogDeliveryWorkerLogDeliveryArgs();
    }
}