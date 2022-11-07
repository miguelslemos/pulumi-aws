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

__all__ = ['WorkgroupArgs', 'Workgroup']

@pulumi.input_type
class WorkgroupArgs:
    def __init__(__self__, *,
                 namespace_name: pulumi.Input[str],
                 workgroup_name: pulumi.Input[str],
                 base_capacity: Optional[pulumi.Input[int]] = None,
                 config_parameters: Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]]] = None,
                 enhanced_vpc_routing: Optional[pulumi.Input[bool]] = None,
                 publicly_accessible: Optional[pulumi.Input[bool]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Workgroup resource.
        :param pulumi.Input[str] workgroup_name: The name of the workgroup.
        :param pulumi.Input[int] base_capacity: The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        :param pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]] config_parameters: An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        :param pulumi.Input[bool] enhanced_vpc_routing: The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        :param pulumi.Input[bool] publicly_accessible: A value that specifies whether the workgroup can be accessed from a public network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: An array of security group IDs to associate with the workgroup.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: An array of VPC subnet IDs to associate with the workgroup.
        """
        pulumi.set(__self__, "namespace_name", namespace_name)
        pulumi.set(__self__, "workgroup_name", workgroup_name)
        if base_capacity is not None:
            pulumi.set(__self__, "base_capacity", base_capacity)
        if config_parameters is not None:
            pulumi.set(__self__, "config_parameters", config_parameters)
        if enhanced_vpc_routing is not None:
            pulumi.set(__self__, "enhanced_vpc_routing", enhanced_vpc_routing)
        if publicly_accessible is not None:
            pulumi.set(__self__, "publicly_accessible", publicly_accessible)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter(name="workgroupName")
    def workgroup_name(self) -> pulumi.Input[str]:
        """
        The name of the workgroup.
        """
        return pulumi.get(self, "workgroup_name")

    @workgroup_name.setter
    def workgroup_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "workgroup_name", value)

    @property
    @pulumi.getter(name="baseCapacity")
    def base_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        """
        return pulumi.get(self, "base_capacity")

    @base_capacity.setter
    def base_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "base_capacity", value)

    @property
    @pulumi.getter(name="configParameters")
    def config_parameters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]]]:
        """
        An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        """
        return pulumi.get(self, "config_parameters")

    @config_parameters.setter
    def config_parameters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]]]):
        pulumi.set(self, "config_parameters", value)

    @property
    @pulumi.getter(name="enhancedVpcRouting")
    def enhanced_vpc_routing(self) -> Optional[pulumi.Input[bool]]:
        """
        The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        """
        return pulumi.get(self, "enhanced_vpc_routing")

    @enhanced_vpc_routing.setter
    def enhanced_vpc_routing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enhanced_vpc_routing", value)

    @property
    @pulumi.getter(name="publiclyAccessible")
    def publicly_accessible(self) -> Optional[pulumi.Input[bool]]:
        """
        A value that specifies whether the workgroup can be accessed from a public network.
        """
        return pulumi.get(self, "publicly_accessible")

    @publicly_accessible.setter
    def publicly_accessible(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publicly_accessible", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of security group IDs to associate with the workgroup.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of VPC subnet IDs to associate with the workgroup.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _WorkgroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 base_capacity: Optional[pulumi.Input[int]] = None,
                 config_parameters: Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]]] = None,
                 endpoints: Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupEndpointArgs']]]] = None,
                 enhanced_vpc_routing: Optional[pulumi.Input[bool]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 publicly_accessible: Optional[pulumi.Input[bool]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 workgroup_id: Optional[pulumi.Input[str]] = None,
                 workgroup_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Workgroup resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Redshift Serverless Workgroup.
        :param pulumi.Input[int] base_capacity: The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        :param pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]] config_parameters: An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        :param pulumi.Input[Sequence[pulumi.Input['WorkgroupEndpointArgs']]] endpoints: The endpoint that is created from the workgroup. See `Endpoint` below.
        :param pulumi.Input[bool] enhanced_vpc_routing: The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        :param pulumi.Input[bool] publicly_accessible: A value that specifies whether the workgroup can be accessed from a public network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: An array of security group IDs to associate with the workgroup.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: An array of VPC subnet IDs to associate with the workgroup.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] workgroup_id: The Redshift Workgroup ID.
        :param pulumi.Input[str] workgroup_name: The name of the workgroup.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if base_capacity is not None:
            pulumi.set(__self__, "base_capacity", base_capacity)
        if config_parameters is not None:
            pulumi.set(__self__, "config_parameters", config_parameters)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)
        if enhanced_vpc_routing is not None:
            pulumi.set(__self__, "enhanced_vpc_routing", enhanced_vpc_routing)
        if namespace_name is not None:
            pulumi.set(__self__, "namespace_name", namespace_name)
        if publicly_accessible is not None:
            pulumi.set(__self__, "publicly_accessible", publicly_accessible)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if workgroup_id is not None:
            pulumi.set(__self__, "workgroup_id", workgroup_id)
        if workgroup_name is not None:
            pulumi.set(__self__, "workgroup_name", workgroup_name)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the Redshift Serverless Workgroup.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="baseCapacity")
    def base_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        """
        return pulumi.get(self, "base_capacity")

    @base_capacity.setter
    def base_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "base_capacity", value)

    @property
    @pulumi.getter(name="configParameters")
    def config_parameters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]]]:
        """
        An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        """
        return pulumi.get(self, "config_parameters")

    @config_parameters.setter
    def config_parameters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupConfigParameterArgs']]]]):
        pulumi.set(self, "config_parameters", value)

    @property
    @pulumi.getter
    def endpoints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupEndpointArgs']]]]:
        """
        The endpoint that is created from the workgroup. See `Endpoint` below.
        """
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkgroupEndpointArgs']]]]):
        pulumi.set(self, "endpoints", value)

    @property
    @pulumi.getter(name="enhancedVpcRouting")
    def enhanced_vpc_routing(self) -> Optional[pulumi.Input[bool]]:
        """
        The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        """
        return pulumi.get(self, "enhanced_vpc_routing")

    @enhanced_vpc_routing.setter
    def enhanced_vpc_routing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enhanced_vpc_routing", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter(name="publiclyAccessible")
    def publicly_accessible(self) -> Optional[pulumi.Input[bool]]:
        """
        A value that specifies whether the workgroup can be accessed from a public network.
        """
        return pulumi.get(self, "publicly_accessible")

    @publicly_accessible.setter
    def publicly_accessible(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publicly_accessible", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of security group IDs to associate with the workgroup.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of VPC subnet IDs to associate with the workgroup.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

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

    @property
    @pulumi.getter(name="workgroupId")
    def workgroup_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Redshift Workgroup ID.
        """
        return pulumi.get(self, "workgroup_id")

    @workgroup_id.setter
    def workgroup_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workgroup_id", value)

    @property
    @pulumi.getter(name="workgroupName")
    def workgroup_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the workgroup.
        """
        return pulumi.get(self, "workgroup_name")

    @workgroup_name.setter
    def workgroup_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workgroup_name", value)


class Workgroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_capacity: Optional[pulumi.Input[int]] = None,
                 config_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupConfigParameterArgs']]]]] = None,
                 enhanced_vpc_routing: Optional[pulumi.Input[bool]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 publicly_accessible: Optional[pulumi.Input[bool]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 workgroup_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a new Amazon Redshift Serverless Workgroup.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshiftserverless.Workgroup("example",
            namespace_name="concurrency-scaling",
            workgroup_name="concurrency-scaling")
        ```

        ## Import

        Redshift Serverless Workgroups can be imported using the `workgroup_name`, e.g.,

        ```sh
         $ pulumi import aws:redshiftserverless/workgroup:Workgroup example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] base_capacity: The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupConfigParameterArgs']]]] config_parameters: An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        :param pulumi.Input[bool] enhanced_vpc_routing: The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        :param pulumi.Input[bool] publicly_accessible: A value that specifies whether the workgroup can be accessed from a public network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: An array of security group IDs to associate with the workgroup.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: An array of VPC subnet IDs to associate with the workgroup.
        :param pulumi.Input[str] workgroup_name: The name of the workgroup.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkgroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a new Amazon Redshift Serverless Workgroup.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshiftserverless.Workgroup("example",
            namespace_name="concurrency-scaling",
            workgroup_name="concurrency-scaling")
        ```

        ## Import

        Redshift Serverless Workgroups can be imported using the `workgroup_name`, e.g.,

        ```sh
         $ pulumi import aws:redshiftserverless/workgroup:Workgroup example example
        ```

        :param str resource_name: The name of the resource.
        :param WorkgroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkgroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_capacity: Optional[pulumi.Input[int]] = None,
                 config_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupConfigParameterArgs']]]]] = None,
                 enhanced_vpc_routing: Optional[pulumi.Input[bool]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 publicly_accessible: Optional[pulumi.Input[bool]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 workgroup_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkgroupArgs.__new__(WorkgroupArgs)

            __props__.__dict__["base_capacity"] = base_capacity
            __props__.__dict__["config_parameters"] = config_parameters
            __props__.__dict__["enhanced_vpc_routing"] = enhanced_vpc_routing
            if namespace_name is None and not opts.urn:
                raise TypeError("Missing required property 'namespace_name'")
            __props__.__dict__["namespace_name"] = namespace_name
            __props__.__dict__["publicly_accessible"] = publicly_accessible
            __props__.__dict__["security_group_ids"] = security_group_ids
            __props__.__dict__["subnet_ids"] = subnet_ids
            __props__.__dict__["tags"] = tags
            if workgroup_name is None and not opts.urn:
                raise TypeError("Missing required property 'workgroup_name'")
            __props__.__dict__["workgroup_name"] = workgroup_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["endpoints"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["workgroup_id"] = None
        super(Workgroup, __self__).__init__(
            'aws:redshiftserverless/workgroup:Workgroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            base_capacity: Optional[pulumi.Input[int]] = None,
            config_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupConfigParameterArgs']]]]] = None,
            endpoints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupEndpointArgs']]]]] = None,
            enhanced_vpc_routing: Optional[pulumi.Input[bool]] = None,
            namespace_name: Optional[pulumi.Input[str]] = None,
            publicly_accessible: Optional[pulumi.Input[bool]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            workgroup_id: Optional[pulumi.Input[str]] = None,
            workgroup_name: Optional[pulumi.Input[str]] = None) -> 'Workgroup':
        """
        Get an existing Workgroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Redshift Serverless Workgroup.
        :param pulumi.Input[int] base_capacity: The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupConfigParameterArgs']]]] config_parameters: An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkgroupEndpointArgs']]]] endpoints: The endpoint that is created from the workgroup. See `Endpoint` below.
        :param pulumi.Input[bool] enhanced_vpc_routing: The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        :param pulumi.Input[bool] publicly_accessible: A value that specifies whether the workgroup can be accessed from a public network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: An array of security group IDs to associate with the workgroup.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: An array of VPC subnet IDs to associate with the workgroup.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] workgroup_id: The Redshift Workgroup ID.
        :param pulumi.Input[str] workgroup_name: The name of the workgroup.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkgroupState.__new__(_WorkgroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["base_capacity"] = base_capacity
        __props__.__dict__["config_parameters"] = config_parameters
        __props__.__dict__["endpoints"] = endpoints
        __props__.__dict__["enhanced_vpc_routing"] = enhanced_vpc_routing
        __props__.__dict__["namespace_name"] = namespace_name
        __props__.__dict__["publicly_accessible"] = publicly_accessible
        __props__.__dict__["security_group_ids"] = security_group_ids
        __props__.__dict__["subnet_ids"] = subnet_ids
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["workgroup_id"] = workgroup_id
        __props__.__dict__["workgroup_name"] = workgroup_name
        return Workgroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the Redshift Serverless Workgroup.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="baseCapacity")
    def base_capacity(self) -> pulumi.Output[int]:
        """
        The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
        """
        return pulumi.get(self, "base_capacity")

    @property
    @pulumi.getter(name="configParameters")
    def config_parameters(self) -> pulumi.Output[Sequence['outputs.WorkgroupConfigParameter']]:
        """
        An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
        """
        return pulumi.get(self, "config_parameters")

    @property
    @pulumi.getter
    def endpoints(self) -> pulumi.Output[Sequence['outputs.WorkgroupEndpoint']]:
        """
        The endpoint that is created from the workgroup. See `Endpoint` below.
        """
        return pulumi.get(self, "endpoints")

    @property
    @pulumi.getter(name="enhancedVpcRouting")
    def enhanced_vpc_routing(self) -> pulumi.Output[Optional[bool]]:
        """
        The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
        """
        return pulumi.get(self, "enhanced_vpc_routing")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "namespace_name")

    @property
    @pulumi.getter(name="publiclyAccessible")
    def publicly_accessible(self) -> pulumi.Output[Optional[bool]]:
        """
        A value that specifies whether the workgroup can be accessed from a public network.
        """
        return pulumi.get(self, "publicly_accessible")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        An array of security group IDs to associate with the workgroup.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        An array of VPC subnet IDs to associate with the workgroup.
        """
        return pulumi.get(self, "subnet_ids")

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

    @property
    @pulumi.getter(name="workgroupId")
    def workgroup_id(self) -> pulumi.Output[str]:
        """
        The Redshift Workgroup ID.
        """
        return pulumi.get(self, "workgroup_id")

    @property
    @pulumi.getter(name="workgroupName")
    def workgroup_name(self) -> pulumi.Output[str]:
        """
        The name of the workgroup.
        """
        return pulumi.get(self, "workgroup_name")
