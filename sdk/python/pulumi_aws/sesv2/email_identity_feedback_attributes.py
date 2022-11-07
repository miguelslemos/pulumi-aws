# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EmailIdentityFeedbackAttributesArgs', 'EmailIdentityFeedbackAttributes']

@pulumi.input_type
class EmailIdentityFeedbackAttributesArgs:
    def __init__(__self__, *,
                 email_identity: pulumi.Input[str],
                 email_forwarding_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a EmailIdentityFeedbackAttributes resource.
        :param pulumi.Input[str] email_identity: The email identity.
        :param pulumi.Input[bool] email_forwarding_enabled: Sets the feedback forwarding configuration for the identity.
        """
        pulumi.set(__self__, "email_identity", email_identity)
        if email_forwarding_enabled is not None:
            pulumi.set(__self__, "email_forwarding_enabled", email_forwarding_enabled)

    @property
    @pulumi.getter(name="emailIdentity")
    def email_identity(self) -> pulumi.Input[str]:
        """
        The email identity.
        """
        return pulumi.get(self, "email_identity")

    @email_identity.setter
    def email_identity(self, value: pulumi.Input[str]):
        pulumi.set(self, "email_identity", value)

    @property
    @pulumi.getter(name="emailForwardingEnabled")
    def email_forwarding_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Sets the feedback forwarding configuration for the identity.
        """
        return pulumi.get(self, "email_forwarding_enabled")

    @email_forwarding_enabled.setter
    def email_forwarding_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "email_forwarding_enabled", value)


@pulumi.input_type
class _EmailIdentityFeedbackAttributesState:
    def __init__(__self__, *,
                 email_forwarding_enabled: Optional[pulumi.Input[bool]] = None,
                 email_identity: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EmailIdentityFeedbackAttributes resources.
        :param pulumi.Input[bool] email_forwarding_enabled: Sets the feedback forwarding configuration for the identity.
        :param pulumi.Input[str] email_identity: The email identity.
        """
        if email_forwarding_enabled is not None:
            pulumi.set(__self__, "email_forwarding_enabled", email_forwarding_enabled)
        if email_identity is not None:
            pulumi.set(__self__, "email_identity", email_identity)

    @property
    @pulumi.getter(name="emailForwardingEnabled")
    def email_forwarding_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Sets the feedback forwarding configuration for the identity.
        """
        return pulumi.get(self, "email_forwarding_enabled")

    @email_forwarding_enabled.setter
    def email_forwarding_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "email_forwarding_enabled", value)

    @property
    @pulumi.getter(name="emailIdentity")
    def email_identity(self) -> Optional[pulumi.Input[str]]:
        """
        The email identity.
        """
        return pulumi.get(self, "email_identity")

    @email_identity.setter
    def email_identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email_identity", value)


class EmailIdentityFeedbackAttributes(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_forwarding_enabled: Optional[pulumi.Input[bool]] = None,
                 email_identity: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_email_identity = aws.sesv2.EmailIdentity("exampleEmailIdentity", email_identity="example.com")
        example_email_identity_feedback_attributes = aws.sesv2.EmailIdentityFeedbackAttributes("exampleEmailIdentityFeedbackAttributes",
            email_identity=example_email_identity.email_identity,
            email_forwarding_enabled=True)
        ```

        ## Import

        SESv2 (Simple Email V2) Email Identity Feedback Attributes can be imported using the `email_identity`, e.g.,

        ```sh
         $ pulumi import aws:sesv2/emailIdentityFeedbackAttributes:EmailIdentityFeedbackAttributes example example.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] email_forwarding_enabled: Sets the feedback forwarding configuration for the identity.
        :param pulumi.Input[str] email_identity: The email identity.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailIdentityFeedbackAttributesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_email_identity = aws.sesv2.EmailIdentity("exampleEmailIdentity", email_identity="example.com")
        example_email_identity_feedback_attributes = aws.sesv2.EmailIdentityFeedbackAttributes("exampleEmailIdentityFeedbackAttributes",
            email_identity=example_email_identity.email_identity,
            email_forwarding_enabled=True)
        ```

        ## Import

        SESv2 (Simple Email V2) Email Identity Feedback Attributes can be imported using the `email_identity`, e.g.,

        ```sh
         $ pulumi import aws:sesv2/emailIdentityFeedbackAttributes:EmailIdentityFeedbackAttributes example example.com
        ```

        :param str resource_name: The name of the resource.
        :param EmailIdentityFeedbackAttributesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailIdentityFeedbackAttributesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_forwarding_enabled: Optional[pulumi.Input[bool]] = None,
                 email_identity: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailIdentityFeedbackAttributesArgs.__new__(EmailIdentityFeedbackAttributesArgs)

            __props__.__dict__["email_forwarding_enabled"] = email_forwarding_enabled
            if email_identity is None and not opts.urn:
                raise TypeError("Missing required property 'email_identity'")
            __props__.__dict__["email_identity"] = email_identity
        super(EmailIdentityFeedbackAttributes, __self__).__init__(
            'aws:sesv2/emailIdentityFeedbackAttributes:EmailIdentityFeedbackAttributes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email_forwarding_enabled: Optional[pulumi.Input[bool]] = None,
            email_identity: Optional[pulumi.Input[str]] = None) -> 'EmailIdentityFeedbackAttributes':
        """
        Get an existing EmailIdentityFeedbackAttributes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] email_forwarding_enabled: Sets the feedback forwarding configuration for the identity.
        :param pulumi.Input[str] email_identity: The email identity.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailIdentityFeedbackAttributesState.__new__(_EmailIdentityFeedbackAttributesState)

        __props__.__dict__["email_forwarding_enabled"] = email_forwarding_enabled
        __props__.__dict__["email_identity"] = email_identity
        return EmailIdentityFeedbackAttributes(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="emailForwardingEnabled")
    def email_forwarding_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Sets the feedback forwarding configuration for the identity.
        """
        return pulumi.get(self, "email_forwarding_enabled")

    @property
    @pulumi.getter(name="emailIdentity")
    def email_identity(self) -> pulumi.Output[str]:
        """
        The email identity.
        """
        return pulumi.get(self, "email_identity")
