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
    'GetClusterCredentialsResult',
    'AwaitableGetClusterCredentialsResult',
    'get_cluster_credentials',
    'get_cluster_credentials_output',
]

@pulumi.output_type
class GetClusterCredentialsResult:
    """
    A collection of values returned by getClusterCredentials.
    """
    def __init__(__self__, auto_create=None, cluster_identifier=None, db_groups=None, db_name=None, db_password=None, db_user=None, duration_seconds=None, expiration=None, id=None):
        if auto_create and not isinstance(auto_create, bool):
            raise TypeError("Expected argument 'auto_create' to be a bool")
        pulumi.set(__self__, "auto_create", auto_create)
        if cluster_identifier and not isinstance(cluster_identifier, str):
            raise TypeError("Expected argument 'cluster_identifier' to be a str")
        pulumi.set(__self__, "cluster_identifier", cluster_identifier)
        if db_groups and not isinstance(db_groups, list):
            raise TypeError("Expected argument 'db_groups' to be a list")
        pulumi.set(__self__, "db_groups", db_groups)
        if db_name and not isinstance(db_name, str):
            raise TypeError("Expected argument 'db_name' to be a str")
        pulumi.set(__self__, "db_name", db_name)
        if db_password and not isinstance(db_password, str):
            raise TypeError("Expected argument 'db_password' to be a str")
        pulumi.set(__self__, "db_password", db_password)
        if db_user and not isinstance(db_user, str):
            raise TypeError("Expected argument 'db_user' to be a str")
        pulumi.set(__self__, "db_user", db_user)
        if duration_seconds and not isinstance(duration_seconds, int):
            raise TypeError("Expected argument 'duration_seconds' to be a int")
        pulumi.set(__self__, "duration_seconds", duration_seconds)
        if expiration and not isinstance(expiration, str):
            raise TypeError("Expected argument 'expiration' to be a str")
        pulumi.set(__self__, "expiration", expiration)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="autoCreate")
    def auto_create(self) -> Optional[bool]:
        return pulumi.get(self, "auto_create")

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> str:
        return pulumi.get(self, "cluster_identifier")

    @property
    @pulumi.getter(name="dbGroups")
    def db_groups(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "db_groups")

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> Optional[str]:
        return pulumi.get(self, "db_name")

    @property
    @pulumi.getter(name="dbPassword")
    def db_password(self) -> str:
        """
        Temporary password that authorizes the user name returned by `db_user` to log on to the database `db_name`.
        """
        return pulumi.get(self, "db_password")

    @property
    @pulumi.getter(name="dbUser")
    def db_user(self) -> str:
        return pulumi.get(self, "db_user")

    @property
    @pulumi.getter(name="durationSeconds")
    def duration_seconds(self) -> Optional[int]:
        return pulumi.get(self, "duration_seconds")

    @property
    @pulumi.getter
    def expiration(self) -> str:
        """
        Date and time the password in `db_password` expires.
        """
        return pulumi.get(self, "expiration")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetClusterCredentialsResult(GetClusterCredentialsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterCredentialsResult(
            auto_create=self.auto_create,
            cluster_identifier=self.cluster_identifier,
            db_groups=self.db_groups,
            db_name=self.db_name,
            db_password=self.db_password,
            db_user=self.db_user,
            duration_seconds=self.duration_seconds,
            expiration=self.expiration,
            id=self.id)


def get_cluster_credentials(auto_create: Optional[bool] = None,
                            cluster_identifier: Optional[str] = None,
                            db_groups: Optional[Sequence[str]] = None,
                            db_name: Optional[str] = None,
                            db_user: Optional[str] = None,
                            duration_seconds: Optional[int] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterCredentialsResult:
    """
    Provides redshift subnet group.


    :param bool auto_create: Create a database user with the name specified for the user named in `db_user` if one does not exist.
    :param str cluster_identifier: Unique identifier of the cluster that contains the database for which your are requesting credentials.
    :param Sequence[str] db_groups: List of the names of existing database groups that the user named in `db_user` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
    :param str db_name: Name of a database that DbUser is authorized to log on to. If `db_name` is not specified, `db_user` can log on to any existing database.
    :param str db_user: Name of a database user. If a user name matching `db_user` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `db_user` doesn't exist in the database and `auto_create` is `True`, a new user is created using the value for `db_user` with `PUBLIC` permissions.  If a database user matching the value for `db_user` doesn't exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database.
    :param int duration_seconds: The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
    """
    __args__ = dict()
    __args__['autoCreate'] = auto_create
    __args__['clusterIdentifier'] = cluster_identifier
    __args__['dbGroups'] = db_groups
    __args__['dbName'] = db_name
    __args__['dbUser'] = db_user
    __args__['durationSeconds'] = duration_seconds
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:redshift/getClusterCredentials:getClusterCredentials', __args__, opts=opts, typ=GetClusterCredentialsResult).value

    return AwaitableGetClusterCredentialsResult(
        auto_create=__ret__.auto_create,
        cluster_identifier=__ret__.cluster_identifier,
        db_groups=__ret__.db_groups,
        db_name=__ret__.db_name,
        db_password=__ret__.db_password,
        db_user=__ret__.db_user,
        duration_seconds=__ret__.duration_seconds,
        expiration=__ret__.expiration,
        id=__ret__.id)


@_utilities.lift_output_func(get_cluster_credentials)
def get_cluster_credentials_output(auto_create: Optional[pulumi.Input[Optional[bool]]] = None,
                                   cluster_identifier: Optional[pulumi.Input[str]] = None,
                                   db_groups: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                   db_name: Optional[pulumi.Input[Optional[str]]] = None,
                                   db_user: Optional[pulumi.Input[str]] = None,
                                   duration_seconds: Optional[pulumi.Input[Optional[int]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterCredentialsResult]:
    """
    Provides redshift subnet group.


    :param bool auto_create: Create a database user with the name specified for the user named in `db_user` if one does not exist.
    :param str cluster_identifier: Unique identifier of the cluster that contains the database for which your are requesting credentials.
    :param Sequence[str] db_groups: List of the names of existing database groups that the user named in `db_user` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
    :param str db_name: Name of a database that DbUser is authorized to log on to. If `db_name` is not specified, `db_user` can log on to any existing database.
    :param str db_user: Name of a database user. If a user name matching `db_user` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `db_user` doesn't exist in the database and `auto_create` is `True`, a new user is created using the value for `db_user` with `PUBLIC` permissions.  If a database user matching the value for `db_user` doesn't exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database.
    :param int duration_seconds: The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
    """
    ...