// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Macie2.Inputs
{

    public sealed class ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValueArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tag key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The tag value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValueArgs()
        {
        }
        public static new ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValueArgs Empty => new ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValueArgs();
    }
}