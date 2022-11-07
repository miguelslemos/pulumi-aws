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
    'GetSecurityProfileResult',
    'AwaitableGetSecurityProfileResult',
    'get_security_profile',
    'get_security_profile_output',
]

@pulumi.output_type
class GetSecurityProfileResult:
    """
    A collection of values returned by getSecurityProfile.
    """
    def __init__(__self__, arn=None, description=None, id=None, instance_id=None, name=None, organization_resource_id=None, permissions=None, security_profile_id=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if organization_resource_id and not isinstance(organization_resource_id, str):
            raise TypeError("Expected argument 'organization_resource_id' to be a str")
        pulumi.set(__self__, "organization_resource_id", organization_resource_id)
        if permissions and not isinstance(permissions, list):
            raise TypeError("Expected argument 'permissions' to be a list")
        pulumi.set(__self__, "permissions", permissions)
        if security_profile_id and not isinstance(security_profile_id, str):
            raise TypeError("Expected argument 'security_profile_id' to be a str")
        pulumi.set(__self__, "security_profile_id", security_profile_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the Security Profile.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the Security Profile.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationResourceId")
    def organization_resource_id(self) -> str:
        """
        The organization resource identifier for the security profile.
        """
        return pulumi.get(self, "organization_resource_id")

    @property
    @pulumi.getter
    def permissions(self) -> Sequence[str]:
        """
        List of permissions assigned to the security profile.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="securityProfileId")
    def security_profile_id(self) -> str:
        return pulumi.get(self, "security_profile_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of tags to assign to the Security Profile.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSecurityProfileResult(GetSecurityProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecurityProfileResult(
            arn=self.arn,
            description=self.description,
            id=self.id,
            instance_id=self.instance_id,
            name=self.name,
            organization_resource_id=self.organization_resource_id,
            permissions=self.permissions,
            security_profile_id=self.security_profile_id,
            tags=self.tags)


def get_security_profile(instance_id: Optional[str] = None,
                         name: Optional[str] = None,
                         security_profile_id: Optional[str] = None,
                         tags: Optional[Mapping[str, str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecurityProfileResult:
    """
    Provides details about a specific Amazon Connect Security Profile.

    ## Example Usage

    By `name`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_security_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        name="Example")
    ```

    By `security_profile_id`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_security_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        security_profile_id="cccccccc-bbbb-cccc-dddd-111111111111")
    ```


    :param str instance_id: Reference to the hosting Amazon Connect Instance
    :param str name: Returns information on a specific Security Profile by name
    :param str security_profile_id: Returns information on a specific Security Profile by Security Profile id
    :param Mapping[str, str] tags: Map of tags to assign to the Security Profile.
    """
    __args__ = dict()
    __args__['instanceId'] = instance_id
    __args__['name'] = name
    __args__['securityProfileId'] = security_profile_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:connect/getSecurityProfile:getSecurityProfile', __args__, opts=opts, typ=GetSecurityProfileResult).value

    return AwaitableGetSecurityProfileResult(
        arn=__ret__.arn,
        description=__ret__.description,
        id=__ret__.id,
        instance_id=__ret__.instance_id,
        name=__ret__.name,
        organization_resource_id=__ret__.organization_resource_id,
        permissions=__ret__.permissions,
        security_profile_id=__ret__.security_profile_id,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_security_profile)
def get_security_profile_output(instance_id: Optional[pulumi.Input[str]] = None,
                                name: Optional[pulumi.Input[Optional[str]]] = None,
                                security_profile_id: Optional[pulumi.Input[Optional[str]]] = None,
                                tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecurityProfileResult]:
    """
    Provides details about a specific Amazon Connect Security Profile.

    ## Example Usage

    By `name`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_security_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        name="Example")
    ```

    By `security_profile_id`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_security_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        security_profile_id="cccccccc-bbbb-cccc-dddd-111111111111")
    ```


    :param str instance_id: Reference to the hosting Amazon Connect Instance
    :param str name: Returns information on a specific Security Profile by name
    :param str security_profile_id: Returns information on a specific Security Profile by Security Profile id
    :param Mapping[str, str] tags: Map of tags to assign to the Security Profile.
    """
    ...