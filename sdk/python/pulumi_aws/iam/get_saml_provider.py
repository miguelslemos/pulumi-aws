# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSamlProviderResult',
    'AwaitableGetSamlProviderResult',
    'get_saml_provider',
    'get_saml_provider_output',
]

@pulumi.output_type
class GetSamlProviderResult:
    """
    A collection of values returned by getSamlProvider.
    """
    def __init__(__self__, arn=None, create_date=None, id=None, name=None, saml_metadata_document=None, tags=None, valid_until=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if create_date and not isinstance(create_date, str):
            raise TypeError("Expected argument 'create_date' to be a str")
        pulumi.set(__self__, "create_date", create_date)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if saml_metadata_document and not isinstance(saml_metadata_document, str):
            raise TypeError("Expected argument 'saml_metadata_document' to be a str")
        pulumi.set(__self__, "saml_metadata_document", saml_metadata_document)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if valid_until and not isinstance(valid_until, str):
            raise TypeError("Expected argument 'valid_until' to be a str")
        pulumi.set(__self__, "valid_until", valid_until)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> str:
        """
        Creation date of the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the provider.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="samlMetadataDocument")
    def saml_metadata_document(self) -> str:
        """
        The XML document generated by an identity provider that supports SAML 2.0.
        """
        return pulumi.get(self, "saml_metadata_document")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Tags attached to the SAML provider.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="validUntil")
    def valid_until(self) -> str:
        """
        Expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2007 15:04:05 MST`.
        """
        return pulumi.get(self, "valid_until")


class AwaitableGetSamlProviderResult(GetSamlProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSamlProviderResult(
            arn=self.arn,
            create_date=self.create_date,
            id=self.id,
            name=self.name,
            saml_metadata_document=self.saml_metadata_document,
            tags=self.tags,
            valid_until=self.valid_until)


def get_saml_provider(arn: Optional[str] = None,
                      tags: Optional[Mapping[str, str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSamlProviderResult:
    """
    This data source can be used to fetch information about a specific
    IAM SAML provider. This will allow you to easily retrieve the metadata
    document of an existing SAML provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_saml_provider(arn="arn:aws:iam::123456789:saml-provider/myprovider")
    ```


    :param str arn: ARN assigned by AWS for the provider.
    :param Mapping[str, str] tags: Tags attached to the SAML provider.
    """
    __args__ = dict()
    __args__['arn'] = arn
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:iam/getSamlProvider:getSamlProvider', __args__, opts=opts, typ=GetSamlProviderResult).value

    return AwaitableGetSamlProviderResult(
        arn=__ret__.arn,
        create_date=__ret__.create_date,
        id=__ret__.id,
        name=__ret__.name,
        saml_metadata_document=__ret__.saml_metadata_document,
        tags=__ret__.tags,
        valid_until=__ret__.valid_until)


@_utilities.lift_output_func(get_saml_provider)
def get_saml_provider_output(arn: Optional[pulumi.Input[str]] = None,
                             tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSamlProviderResult]:
    """
    This data source can be used to fetch information about a specific
    IAM SAML provider. This will allow you to easily retrieve the metadata
    document of an existing SAML provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.iam.get_saml_provider(arn="arn:aws:iam::123456789:saml-provider/myprovider")
    ```


    :param str arn: ARN assigned by AWS for the provider.
    :param Mapping[str, str] tags: Tags attached to the SAML provider.
    """
    ...