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

__all__ = [
    'GetFunctionUrlResult',
    'AwaitableGetFunctionUrlResult',
    'get_function_url',
    'get_function_url_output',
]

@pulumi.output_type
class GetFunctionUrlResult:
    """
    A collection of values returned by getFunctionUrl.
    """
    def __init__(__self__, authorization_type=None, cors=None, creation_time=None, function_arn=None, function_name=None, function_url=None, id=None, last_modified_time=None, qualifier=None, url_id=None):
        if authorization_type and not isinstance(authorization_type, str):
            raise TypeError("Expected argument 'authorization_type' to be a str")
        pulumi.set(__self__, "authorization_type", authorization_type)
        if cors and not isinstance(cors, list):
            raise TypeError("Expected argument 'cors' to be a list")
        pulumi.set(__self__, "cors", cors)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if function_arn and not isinstance(function_arn, str):
            raise TypeError("Expected argument 'function_arn' to be a str")
        pulumi.set(__self__, "function_arn", function_arn)
        if function_name and not isinstance(function_name, str):
            raise TypeError("Expected argument 'function_name' to be a str")
        pulumi.set(__self__, "function_name", function_name)
        if function_url and not isinstance(function_url, str):
            raise TypeError("Expected argument 'function_url' to be a str")
        pulumi.set(__self__, "function_url", function_url)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_modified_time and not isinstance(last_modified_time, str):
            raise TypeError("Expected argument 'last_modified_time' to be a str")
        pulumi.set(__self__, "last_modified_time", last_modified_time)
        if qualifier and not isinstance(qualifier, str):
            raise TypeError("Expected argument 'qualifier' to be a str")
        pulumi.set(__self__, "qualifier", qualifier)
        if url_id and not isinstance(url_id, str):
            raise TypeError("Expected argument 'url_id' to be a str")
        pulumi.set(__self__, "url_id", url_id)

    @property
    @pulumi.getter(name="authorizationType")
    def authorization_type(self) -> str:
        """
        Type of authentication that the function URL uses.
        """
        return pulumi.get(self, "authorization_type")

    @property
    @pulumi.getter
    def cors(self) -> Sequence['outputs.GetFunctionUrlCorResult']:
        """
        The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. See the [`lambda.FunctionUrl` resource](https://www.terraform.io/docs/providers/aws/r/lambda_function_url.html) documentation for more details.
        """
        return pulumi.get(self, "cors")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        When the function URL was created, in [ISO-8601 format](https://www.w3.org/TR/NOTE-datetime).
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="functionArn")
    def function_arn(self) -> str:
        """
        ARN of the function.
        """
        return pulumi.get(self, "function_arn")

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> str:
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter(name="functionUrl")
    def function_url(self) -> str:
        """
        HTTP URL endpoint for the function in the format `https://<url_id>.lambda-url.<region>.on.aws`.
        """
        return pulumi.get(self, "function_url")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> str:
        """
        When the function URL configuration was last updated, in [ISO-8601 format](https://www.w3.org/TR/NOTE-datetime).
        """
        return pulumi.get(self, "last_modified_time")

    @property
    @pulumi.getter
    def qualifier(self) -> Optional[str]:
        return pulumi.get(self, "qualifier")

    @property
    @pulumi.getter(name="urlId")
    def url_id(self) -> str:
        """
        Generated ID for the endpoint.
        """
        return pulumi.get(self, "url_id")


class AwaitableGetFunctionUrlResult(GetFunctionUrlResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFunctionUrlResult(
            authorization_type=self.authorization_type,
            cors=self.cors,
            creation_time=self.creation_time,
            function_arn=self.function_arn,
            function_name=self.function_name,
            function_url=self.function_url,
            id=self.id,
            last_modified_time=self.last_modified_time,
            qualifier=self.qualifier,
            url_id=self.url_id)


def get_function_url(function_name: Optional[str] = None,
                     qualifier: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFunctionUrlResult:
    """
    Provides information about a Lambda function URL.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    config = pulumi.Config()
    function_name = config.require("functionName")
    existing = aws.lambda.get_function_url(function_name=function_name)
    ```


    :param str function_name: he name (or ARN) of the Lambda function.
    :param str qualifier: Alias name or `"$LATEST"`.
    """
    __args__ = dict()
    __args__['functionName'] = function_name
    __args__['qualifier'] = qualifier
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:lambda/getFunctionUrl:getFunctionUrl', __args__, opts=opts, typ=GetFunctionUrlResult).value

    return AwaitableGetFunctionUrlResult(
        authorization_type=__ret__.authorization_type,
        cors=__ret__.cors,
        creation_time=__ret__.creation_time,
        function_arn=__ret__.function_arn,
        function_name=__ret__.function_name,
        function_url=__ret__.function_url,
        id=__ret__.id,
        last_modified_time=__ret__.last_modified_time,
        qualifier=__ret__.qualifier,
        url_id=__ret__.url_id)


@_utilities.lift_output_func(get_function_url)
def get_function_url_output(function_name: Optional[pulumi.Input[str]] = None,
                            qualifier: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFunctionUrlResult]:
    """
    Provides information about a Lambda function URL.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    config = pulumi.Config()
    function_name = config.require("functionName")
    existing = aws.lambda.get_function_url(function_name=function_name)
    ```


    :param str function_name: he name (or ARN) of the Lambda function.
    :param str qualifier: Alias name or `"$LATEST"`.
    """
    ...