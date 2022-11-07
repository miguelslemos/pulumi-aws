// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IdentityStore.Outputs
{

    [OutputType]
    public sealed class GetUserAlternateIdentifierUniqueAttributeResult
    {
        /// <summary>
        /// Attribute path that is used to specify which attribute name to search. For example: `UserName`. Refer to the [User data type](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html).
        /// </summary>
        public readonly string AttributePath;
        /// <summary>
        /// Value for an attribute.
        /// </summary>
        public readonly string AttributeValue;

        [OutputConstructor]
        private GetUserAlternateIdentifierUniqueAttributeResult(
            string attributePath,

            string attributeValue)
        {
            AttributePath = attributePath;
            AttributeValue = attributeValue;
        }
    }
}