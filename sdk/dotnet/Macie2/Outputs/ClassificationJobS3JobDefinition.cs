// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Macie2.Outputs
{

    [OutputType]
    public sealed class ClassificationJobS3JobDefinition
    {
        /// <summary>
        /// An array of objects, one for each AWS account that owns buckets to analyze. Each object specifies the account ID for an account and one or more buckets to analyze for the account. (documented below)
        /// </summary>
        public readonly ImmutableArray<Outputs.ClassificationJobS3JobDefinitionBucketDefinition> BucketDefinitions;
        /// <summary>
        /// The property- and tag-based conditions that determine which objects to include or exclude from the analysis. (documented below)
        /// </summary>
        public readonly Outputs.ClassificationJobS3JobDefinitionScoping? Scoping;

        [OutputConstructor]
        private ClassificationJobS3JobDefinition(
            ImmutableArray<Outputs.ClassificationJobS3JobDefinitionBucketDefinition> bucketDefinitions,

            Outputs.ClassificationJobS3JobDefinitionScoping? scoping)
        {
            BucketDefinitions = bucketDefinitions;
            Scoping = scoping;
        }
    }
}