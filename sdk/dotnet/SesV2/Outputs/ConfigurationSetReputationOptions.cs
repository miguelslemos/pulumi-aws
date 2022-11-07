// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SesV2.Outputs
{

    [OutputType]
    public sealed class ConfigurationSetReputationOptions
    {
        /// <summary>
        /// The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
        /// </summary>
        public readonly string? LastFreshStart;
        /// <summary>
        /// If `true`, tracking of reputation metrics is enabled for the configuration set. If `false`, tracking of reputation metrics is disabled for the configuration set.
        /// </summary>
        public readonly bool? ReputationMetricsEnabled;

        [OutputConstructor]
        private ConfigurationSetReputationOptions(
            string? lastFreshStart,

            bool? reputationMetricsEnabled)
        {
            LastFreshStart = lastFreshStart;
            ReputationMetricsEnabled = reputationMetricsEnabled;
        }
    }
}