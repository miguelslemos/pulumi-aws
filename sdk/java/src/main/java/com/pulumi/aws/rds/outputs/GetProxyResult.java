// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.aws.rds.outputs.GetProxyAuth;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProxyResult {
    /**
     * @return ARN of the DB Proxy.
     * 
     */
    private String arn;
    /**
     * @return Configuration(s) with authorization mechanisms to connect to the associated instance or cluster.
     * 
     */
    private List<GetProxyAuth> auths;
    /**
     * @return Whether the proxy includes detailed information about SQL statements in its logs.
     * 
     */
    private Boolean debugLogging;
    /**
     * @return Endpoint that you can use to connect to the DB proxy.
     * 
     */
    private String endpoint;
    /**
     * @return Kinds of databases that the proxy can connect to.
     * 
     */
    private String engineFamily;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Number of seconds a connection to the proxy can have no activity before the proxy drops the client connection.
     * 
     */
    private Integer idleClientTimeout;
    private String name;
    /**
     * @return Whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * 
     */
    private Boolean requireTls;
    /**
     * @return ARN for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * 
     */
    private String roleArn;
    /**
     * @return Provides the VPC ID of the DB proxy.
     * 
     */
    private String vpcId;
    /**
     * @return Provides a list of VPC security groups that the proxy belongs to.
     * 
     */
    private List<String> vpcSecurityGroupIds;
    /**
     * @return EC2 subnet IDs for the proxy.
     * 
     */
    private List<String> vpcSubnetIds;

    private GetProxyResult() {}
    /**
     * @return ARN of the DB Proxy.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Configuration(s) with authorization mechanisms to connect to the associated instance or cluster.
     * 
     */
    public List<GetProxyAuth> auths() {
        return this.auths;
    }
    /**
     * @return Whether the proxy includes detailed information about SQL statements in its logs.
     * 
     */
    public Boolean debugLogging() {
        return this.debugLogging;
    }
    /**
     * @return Endpoint that you can use to connect to the DB proxy.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Kinds of databases that the proxy can connect to.
     * 
     */
    public String engineFamily() {
        return this.engineFamily;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Number of seconds a connection to the proxy can have no activity before the proxy drops the client connection.
     * 
     */
    public Integer idleClientTimeout() {
        return this.idleClientTimeout;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * 
     */
    public Boolean requireTls() {
        return this.requireTls;
    }
    /**
     * @return ARN for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return Provides the VPC ID of the DB proxy.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return Provides a list of VPC security groups that the proxy belongs to.
     * 
     */
    public List<String> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    /**
     * @return EC2 subnet IDs for the proxy.
     * 
     */
    public List<String> vpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProxyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<GetProxyAuth> auths;
        private Boolean debugLogging;
        private String endpoint;
        private String engineFamily;
        private String id;
        private Integer idleClientTimeout;
        private String name;
        private Boolean requireTls;
        private String roleArn;
        private String vpcId;
        private List<String> vpcSecurityGroupIds;
        private List<String> vpcSubnetIds;
        public Builder() {}
        public Builder(GetProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auths = defaults.auths;
    	      this.debugLogging = defaults.debugLogging;
    	      this.endpoint = defaults.endpoint;
    	      this.engineFamily = defaults.engineFamily;
    	      this.id = defaults.id;
    	      this.idleClientTimeout = defaults.idleClientTimeout;
    	      this.name = defaults.name;
    	      this.requireTls = defaults.requireTls;
    	      this.roleArn = defaults.roleArn;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder auths(List<GetProxyAuth> auths) {
            this.auths = Objects.requireNonNull(auths);
            return this;
        }
        public Builder auths(GetProxyAuth... auths) {
            return auths(List.of(auths));
        }
        @CustomType.Setter
        public Builder debugLogging(Boolean debugLogging) {
            this.debugLogging = Objects.requireNonNull(debugLogging);
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder engineFamily(String engineFamily) {
            this.engineFamily = Objects.requireNonNull(engineFamily);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder idleClientTimeout(Integer idleClientTimeout) {
            this.idleClientTimeout = Objects.requireNonNull(idleClientTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder requireTls(Boolean requireTls) {
            this.requireTls = Objects.requireNonNull(requireTls);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        @CustomType.Setter
        public Builder vpcSubnetIds(List<String> vpcSubnetIds) {
            this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds);
            return this;
        }
        public Builder vpcSubnetIds(String... vpcSubnetIds) {
            return vpcSubnetIds(List.of(vpcSubnetIds));
        }
        public GetProxyResult build() {
            final var o = new GetProxyResult();
            o.arn = arn;
            o.auths = auths;
            o.debugLogging = debugLogging;
            o.endpoint = endpoint;
            o.engineFamily = engineFamily;
            o.id = id;
            o.idleClientTimeout = idleClientTimeout;
            o.name = name;
            o.requireTls = requireTls;
            o.roleArn = roleArn;
            o.vpcId = vpcId;
            o.vpcSecurityGroupIds = vpcSecurityGroupIds;
            o.vpcSubnetIds = vpcSubnetIds;
            return o;
        }
    }
}