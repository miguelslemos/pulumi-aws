# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['UserHierarchyGroupArgs', 'UserHierarchyGroup']

@pulumi.input_type
class UserHierarchyGroupArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 parent_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a UserHierarchyGroup resource.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] name: The name of the user hierarchy group. Must not be more than 100 characters.
        :param pulumi.Input[str] parent_group_id: The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_group_id is not None:
            pulumi.set(__self__, "parent_group_id", parent_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the user hierarchy group. Must not be more than 100 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentGroupId")
    def parent_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        """
        return pulumi.get(self, "parent_group_id")

    @parent_group_id.setter
    def parent_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _UserHierarchyGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 hierarchy_group_id: Optional[pulumi.Input[str]] = None,
                 hierarchy_paths: Optional[pulumi.Input[Sequence[pulumi.Input['UserHierarchyGroupHierarchyPathArgs']]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 level_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering UserHierarchyGroup resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the hierarchy group.
        :param pulumi.Input[str] hierarchy_group_id: The identifier for the hierarchy group.
        :param pulumi.Input[Sequence[pulumi.Input['UserHierarchyGroupHierarchyPathArgs']]] hierarchy_paths: A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] level_id: The identifier of the level in the hierarchy group.
        :param pulumi.Input[str] name: The name of the user hierarchy group. Must not be more than 100 characters.
        :param pulumi.Input[str] parent_group_id: The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if hierarchy_group_id is not None:
            pulumi.set(__self__, "hierarchy_group_id", hierarchy_group_id)
        if hierarchy_paths is not None:
            pulumi.set(__self__, "hierarchy_paths", hierarchy_paths)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if level_id is not None:
            pulumi.set(__self__, "level_id", level_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_group_id is not None:
            pulumi.set(__self__, "parent_group_id", parent_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the hierarchy group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="hierarchyGroupId")
    def hierarchy_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the hierarchy group.
        """
        return pulumi.get(self, "hierarchy_group_id")

    @hierarchy_group_id.setter
    def hierarchy_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hierarchy_group_id", value)

    @property
    @pulumi.getter(name="hierarchyPaths")
    def hierarchy_paths(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserHierarchyGroupHierarchyPathArgs']]]]:
        """
        A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
        """
        return pulumi.get(self, "hierarchy_paths")

    @hierarchy_paths.setter
    def hierarchy_paths(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserHierarchyGroupHierarchyPathArgs']]]]):
        pulumi.set(self, "hierarchy_paths", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="levelId")
    def level_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the level in the hierarchy group.
        """
        return pulumi.get(self, "level_id")

    @level_id.setter
    def level_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "level_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the user hierarchy group. Must not be more than 100 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentGroupId")
    def parent_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        """
        return pulumi.get(self, "parent_group_id")

    @parent_group_id.setter
    def parent_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class UserHierarchyGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an Amazon Connect User Hierarchy Group resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        > **NOTE:** The User Hierarchy Structure must be created before creating a User Hierarchy Group.

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.UserHierarchyGroup("example",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            tags={
                "Name": "Example User Hierarchy Group",
            })
        ```
        ### With a parent group

        ```python
        import pulumi
        import pulumi_aws as aws

        parent = aws.connect.UserHierarchyGroup("parent",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            tags={
                "Name": "Example User Hierarchy Group Parent",
            })
        child = aws.connect.UserHierarchyGroup("child",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            parent_group_id=parent.hierarchy_group_id,
            tags={
                "Name": "Example User Hierarchy Group Child",
            })
        ```

        ## Import

        Amazon Connect User Hierarchy Groups can be imported using the `instance_id` and `hierarchy_group_id` separated by a colon (`:`), e.g.,

        ```sh
         $ pulumi import aws:connect/userHierarchyGroup:UserHierarchyGroup example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] name: The name of the user hierarchy group. Must not be more than 100 characters.
        :param pulumi.Input[str] parent_group_id: The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserHierarchyGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Connect User Hierarchy Group resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        > **NOTE:** The User Hierarchy Structure must be created before creating a User Hierarchy Group.

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.connect.UserHierarchyGroup("example",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            tags={
                "Name": "Example User Hierarchy Group",
            })
        ```
        ### With a parent group

        ```python
        import pulumi
        import pulumi_aws as aws

        parent = aws.connect.UserHierarchyGroup("parent",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            tags={
                "Name": "Example User Hierarchy Group Parent",
            })
        child = aws.connect.UserHierarchyGroup("child",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            parent_group_id=parent.hierarchy_group_id,
            tags={
                "Name": "Example User Hierarchy Group Child",
            })
        ```

        ## Import

        Amazon Connect User Hierarchy Groups can be imported using the `instance_id` and `hierarchy_group_id` separated by a colon (`:`), e.g.,

        ```sh
         $ pulumi import aws:connect/userHierarchyGroup:UserHierarchyGroup example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
        ```

        :param str resource_name: The name of the resource.
        :param UserHierarchyGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserHierarchyGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserHierarchyGroupArgs.__new__(UserHierarchyGroupArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["name"] = name
            __props__.__dict__["parent_group_id"] = parent_group_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["hierarchy_group_id"] = None
            __props__.__dict__["hierarchy_paths"] = None
            __props__.__dict__["level_id"] = None
            __props__.__dict__["tags_all"] = None
        super(UserHierarchyGroup, __self__).__init__(
            'aws:connect/userHierarchyGroup:UserHierarchyGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            hierarchy_group_id: Optional[pulumi.Input[str]] = None,
            hierarchy_paths: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserHierarchyGroupHierarchyPathArgs']]]]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            level_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent_group_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'UserHierarchyGroup':
        """
        Get an existing UserHierarchyGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the hierarchy group.
        :param pulumi.Input[str] hierarchy_group_id: The identifier for the hierarchy group.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserHierarchyGroupHierarchyPathArgs']]]] hierarchy_paths: A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] level_id: The identifier of the level in the hierarchy group.
        :param pulumi.Input[str] name: The name of the user hierarchy group. Must not be more than 100 characters.
        :param pulumi.Input[str] parent_group_id: The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserHierarchyGroupState.__new__(_UserHierarchyGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["hierarchy_group_id"] = hierarchy_group_id
        __props__.__dict__["hierarchy_paths"] = hierarchy_paths
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["level_id"] = level_id
        __props__.__dict__["name"] = name
        __props__.__dict__["parent_group_id"] = parent_group_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return UserHierarchyGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the hierarchy group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="hierarchyGroupId")
    def hierarchy_group_id(self) -> pulumi.Output[str]:
        """
        The identifier for the hierarchy group.
        """
        return pulumi.get(self, "hierarchy_group_id")

    @property
    @pulumi.getter(name="hierarchyPaths")
    def hierarchy_paths(self) -> pulumi.Output[Sequence['outputs.UserHierarchyGroupHierarchyPath']]:
        """
        A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
        """
        return pulumi.get(self, "hierarchy_paths")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="levelId")
    def level_id(self) -> pulumi.Output[str]:
        """
        The identifier of the level in the hierarchy group.
        """
        return pulumi.get(self, "level_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the user hierarchy group. Must not be more than 100 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentGroupId")
    def parent_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        """
        return pulumi.get(self, "parent_group_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")
