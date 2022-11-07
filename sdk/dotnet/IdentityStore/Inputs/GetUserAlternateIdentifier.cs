// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IdentityStore.Inputs
{

    public sealed class GetUserAlternateIdentifierArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
        /// </summary>
        [Input("externalId")]
        public Inputs.GetUserAlternateIdentifierExternalIdArgs? ExternalId { get; set; }

        /// <summary>
        /// An entity attribute that's unique to a specific entity. Detailed below.
        /// </summary>
        [Input("uniqueAttribute")]
        public Inputs.GetUserAlternateIdentifierUniqueAttributeArgs? UniqueAttribute { get; set; }

        public GetUserAlternateIdentifierArgs()
        {
        }
        public static new GetUserAlternateIdentifierArgs Empty => new GetUserAlternateIdentifierArgs();
    }
}