// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Keyspaces.Inputs
{

    public sealed class TableSchemaDefinitionStaticColumnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the static column.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public TableSchemaDefinitionStaticColumnArgs()
        {
        }
        public static new TableSchemaDefinitionStaticColumnArgs Empty => new TableSchemaDefinitionStaticColumnArgs();
    }
}