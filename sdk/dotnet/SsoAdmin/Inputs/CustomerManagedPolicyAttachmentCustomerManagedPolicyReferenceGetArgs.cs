// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsoAdmin.Inputs
{

    public sealed class CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the customer managed IAM Policy to be attached.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The path to the IAM policy to be attached. The default is `/`. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names) for more information.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceGetArgs()
        {
        }
        public static new CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceGetArgs Empty => new CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceGetArgs();
    }
}