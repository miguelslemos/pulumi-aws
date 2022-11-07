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
    'GetCustomKeyStoreResult',
    'AwaitableGetCustomKeyStoreResult',
    'get_custom_key_store',
    'get_custom_key_store_output',
]

@pulumi.output_type
class GetCustomKeyStoreResult:
    """
    A collection of values returned by getCustomKeyStore.
    """
    def __init__(__self__, cloud_hsm_cluster_id=None, connection_state=None, creation_date=None, custom_key_store_id=None, custom_key_store_name=None, id=None, trust_anchor_certificate=None):
        if cloud_hsm_cluster_id and not isinstance(cloud_hsm_cluster_id, str):
            raise TypeError("Expected argument 'cloud_hsm_cluster_id' to be a str")
        pulumi.set(__self__, "cloud_hsm_cluster_id", cloud_hsm_cluster_id)
        if connection_state and not isinstance(connection_state, str):
            raise TypeError("Expected argument 'connection_state' to be a str")
        pulumi.set(__self__, "connection_state", connection_state)
        if creation_date and not isinstance(creation_date, str):
            raise TypeError("Expected argument 'creation_date' to be a str")
        pulumi.set(__self__, "creation_date", creation_date)
        if custom_key_store_id and not isinstance(custom_key_store_id, str):
            raise TypeError("Expected argument 'custom_key_store_id' to be a str")
        pulumi.set(__self__, "custom_key_store_id", custom_key_store_id)
        if custom_key_store_name and not isinstance(custom_key_store_name, str):
            raise TypeError("Expected argument 'custom_key_store_name' to be a str")
        pulumi.set(__self__, "custom_key_store_name", custom_key_store_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if trust_anchor_certificate and not isinstance(trust_anchor_certificate, str):
            raise TypeError("Expected argument 'trust_anchor_certificate' to be a str")
        pulumi.set(__self__, "trust_anchor_certificate", trust_anchor_certificate)

    @property
    @pulumi.getter(name="cloudHsmClusterId")
    def cloud_hsm_cluster_id(self) -> str:
        return pulumi.get(self, "cloud_hsm_cluster_id")

    @property
    @pulumi.getter(name="connectionState")
    def connection_state(self) -> str:
        """
        Indicates whether the custom key store is connected to its CloudHSM cluster.
        """
        return pulumi.get(self, "connection_state")

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> str:
        """
        The date and time when the custom key store was created.
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter(name="customKeyStoreId")
    def custom_key_store_id(self) -> str:
        return pulumi.get(self, "custom_key_store_id")

    @property
    @pulumi.getter(name="customKeyStoreName")
    def custom_key_store_name(self) -> str:
        return pulumi.get(self, "custom_key_store_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="trustAnchorCertificate")
    def trust_anchor_certificate(self) -> str:
        """
        The trust anchor certificate of the associated CloudHSM cluster.
        """
        return pulumi.get(self, "trust_anchor_certificate")


class AwaitableGetCustomKeyStoreResult(GetCustomKeyStoreResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomKeyStoreResult(
            cloud_hsm_cluster_id=self.cloud_hsm_cluster_id,
            connection_state=self.connection_state,
            creation_date=self.creation_date,
            custom_key_store_id=self.custom_key_store_id,
            custom_key_store_name=self.custom_key_store_name,
            id=self.id,
            trust_anchor_certificate=self.trust_anchor_certificate)


def get_custom_key_store(custom_key_store_id: Optional[str] = None,
                         custom_key_store_name: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomKeyStoreResult:
    """
    Use this data source to get the metadata KMS custom key store.
    By using this data source, you can reference KMS custom key store
    without having to hard code the ID as input.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    keystore = aws.kms.get_custom_key_store(custom_key_store_name="my_cloudhsm")
    ```


    :param str custom_key_store_id: The ID for the custom key store.
    :param str custom_key_store_name: The user-specified friendly name for the custom key store.
    """
    __args__ = dict()
    __args__['customKeyStoreId'] = custom_key_store_id
    __args__['customKeyStoreName'] = custom_key_store_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:kms/getCustomKeyStore:getCustomKeyStore', __args__, opts=opts, typ=GetCustomKeyStoreResult).value

    return AwaitableGetCustomKeyStoreResult(
        cloud_hsm_cluster_id=__ret__.cloud_hsm_cluster_id,
        connection_state=__ret__.connection_state,
        creation_date=__ret__.creation_date,
        custom_key_store_id=__ret__.custom_key_store_id,
        custom_key_store_name=__ret__.custom_key_store_name,
        id=__ret__.id,
        trust_anchor_certificate=__ret__.trust_anchor_certificate)


@_utilities.lift_output_func(get_custom_key_store)
def get_custom_key_store_output(custom_key_store_id: Optional[pulumi.Input[Optional[str]]] = None,
                                custom_key_store_name: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomKeyStoreResult]:
    """
    Use this data source to get the metadata KMS custom key store.
    By using this data source, you can reference KMS custom key store
    without having to hard code the ID as input.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    keystore = aws.kms.get_custom_key_store(custom_key_store_name="my_cloudhsm")
    ```


    :param str custom_key_store_id: The ID for the custom key store.
    :param str custom_key_store_name: The user-specified friendly name for the custom key store.
    """
    ...