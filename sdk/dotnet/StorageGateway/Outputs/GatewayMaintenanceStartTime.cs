// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.StorageGateway.Outputs
{

    [OutputType]
    public sealed class GatewayMaintenanceStartTime
    {
        /// <summary>
        /// The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.
        /// </summary>
        public readonly string? DayOfMonth;
        /// <summary>
        /// The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
        /// </summary>
        public readonly string? DayOfWeek;
        /// <summary>
        /// The hour component of the maintenance start time represented as _hh_, where _hh_ is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
        /// </summary>
        public readonly int HourOfDay;
        /// <summary>
        /// The minute component of the maintenance start time represented as _mm_, where _mm_ is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
        /// </summary>
        public readonly int? MinuteOfHour;

        [OutputConstructor]
        private GatewayMaintenanceStartTime(
            string? dayOfMonth,

            string? dayOfWeek,

            int hourOfDay,

            int? minuteOfHour)
        {
            DayOfMonth = dayOfMonth;
            DayOfWeek = dayOfWeek;
            HourOfDay = hourOfDay;
            MinuteOfHour = minuteOfHour;
        }
    }
}