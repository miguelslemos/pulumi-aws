// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexus {
    /**
     * @return The location of the Salesforce resource.
     * 
     */
    private String instanceUrl;

    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexus() {}
    /**
     * @return The location of the Salesforce resource.
     * 
     */
    public String instanceUrl() {
        return this.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceUrl;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        @CustomType.Setter
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexus build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexus();
            o.instanceUrl = instanceUrl;
            return o;
        }
    }
}