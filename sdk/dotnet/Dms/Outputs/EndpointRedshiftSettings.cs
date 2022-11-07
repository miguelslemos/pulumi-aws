// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dms.Outputs
{

    [OutputType]
    public sealed class EndpointRedshiftSettings
    {
        /// <summary>
        /// S3 object prefix.
        /// </summary>
        public readonly string? BucketFolder;
        /// <summary>
        /// S3 bucket name.
        /// </summary>
        public readonly string? BucketName;
        /// <summary>
        /// Server-side encryption mode that you want to encrypt your .csv or .parquet object files copied to S3. Valid values are `SSE_S3` and `SSE_KMS`. Default is `SSE_S3`.
        /// </summary>
        public readonly string? EncryptionMode;
        /// <summary>
        /// If you set encryptionMode to `SSE_KMS`, set this parameter to the ARN for the AWS KMS key.
        /// </summary>
        public readonly string? ServerSideEncryptionKmsKeyId;
        /// <summary>
        /// ARN of the IAM Role with permissions to read from or write to the S3 Bucket.
        /// </summary>
        public readonly string? ServiceAccessRoleArn;

        [OutputConstructor]
        private EndpointRedshiftSettings(
            string? bucketFolder,

            string? bucketName,

            string? encryptionMode,

            string? serverSideEncryptionKmsKeyId,

            string? serviceAccessRoleArn)
        {
            BucketFolder = bucketFolder;
            BucketName = bucketName;
            EncryptionMode = encryptionMode;
            ServerSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
            ServiceAccessRoleArn = serviceAccessRoleArn;
        }
    }
}