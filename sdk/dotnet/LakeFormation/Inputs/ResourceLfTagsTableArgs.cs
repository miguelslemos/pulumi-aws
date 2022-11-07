// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LakeFormation.Inputs
{

    public sealed class ResourceLfTagsTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier for the Data Catalog. By default, it is the account ID of the caller.
        /// </summary>
        [Input("catalogId")]
        public Input<string>? CatalogId { get; set; }

        /// <summary>
        /// Name of the database for the table with columns resource. Unique to the Data Catalog.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// Name of the table resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("wildcard")]
        public Input<bool>? Wildcard { get; set; }

        public ResourceLfTagsTableArgs()
        {
        }
        public static new ResourceLfTagsTableArgs Empty => new ResourceLfTagsTableArgs();
    }
}