// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Outputs
{

    [OutputType]
    public sealed class GetCostCategoryRuleRuleAndResult
    {
        /// <summary>
        /// Configuration block for the filter that's based on `CostCategory` values. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleAndCostCategoryResult> CostCategories;
        /// <summary>
        /// Configuration block for the specific `Dimension` to use for `Expression`. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleAndDimensionResult> Dimensions;
        /// <summary>
        /// Resource tags.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleAndTagResult> Tags;

        [OutputConstructor]
        private GetCostCategoryRuleRuleAndResult(
            ImmutableArray<Outputs.GetCostCategoryRuleRuleAndCostCategoryResult> costCategories,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleAndDimensionResult> dimensions,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleAndTagResult> tags)
        {
            CostCategories = costCategories;
            Dimensions = dimensions;
            Tags = tags;
        }
    }
}