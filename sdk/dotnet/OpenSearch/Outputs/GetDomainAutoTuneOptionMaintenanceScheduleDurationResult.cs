// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpenSearch.Outputs
{

    [OutputType]
    public sealed class GetDomainAutoTuneOptionMaintenanceScheduleDurationResult
    {
        /// <summary>
        /// Unit of time.
        /// </summary>
        public readonly string Unit;
        /// <summary>
        /// Duration of an Auto-Tune maintenance window.
        /// </summary>
        public readonly int Value;

        [OutputConstructor]
        private GetDomainAutoTuneOptionMaintenanceScheduleDurationResult(
            string unit,

            int value)
        {
            Unit = unit;
            Value = value;
        }
    }
}