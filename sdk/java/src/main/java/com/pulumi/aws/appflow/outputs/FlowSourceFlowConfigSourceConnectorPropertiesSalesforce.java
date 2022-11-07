// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceFlowConfigSourceConnectorPropertiesSalesforce {
    /**
     * @return Flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a flow.
     * 
     */
    private @Nullable Boolean enableDynamicFieldUpdate;
    /**
     * @return Whether Amazon AppFlow includes deleted files in the flow run.
     * 
     */
    private @Nullable Boolean includeDeletedRecords;
    /**
     * @return Object specified in the Veeva flow source.
     * 
     */
    private String object;

    private FlowSourceFlowConfigSourceConnectorPropertiesSalesforce() {}
    /**
     * @return Flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a flow.
     * 
     */
    public Optional<Boolean> enableDynamicFieldUpdate() {
        return Optional.ofNullable(this.enableDynamicFieldUpdate);
    }
    /**
     * @return Whether Amazon AppFlow includes deleted files in the flow run.
     * 
     */
    public Optional<Boolean> includeDeletedRecords() {
        return Optional.ofNullable(this.includeDeletedRecords);
    }
    /**
     * @return Object specified in the Veeva flow source.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesSalesforce defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDynamicFieldUpdate;
        private @Nullable Boolean includeDeletedRecords;
        private String object;
        public Builder() {}
        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesSalesforce defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicFieldUpdate = defaults.enableDynamicFieldUpdate;
    	      this.includeDeletedRecords = defaults.includeDeletedRecords;
    	      this.object = defaults.object;
        }

        @CustomType.Setter
        public Builder enableDynamicFieldUpdate(@Nullable Boolean enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder includeDeletedRecords(@Nullable Boolean includeDeletedRecords) {
            this.includeDeletedRecords = includeDeletedRecords;
            return this;
        }
        @CustomType.Setter
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowSourceFlowConfigSourceConnectorPropertiesSalesforce build() {
            final var o = new FlowSourceFlowConfigSourceConnectorPropertiesSalesforce();
            o.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
            o.includeDeletedRecords = includeDeletedRecords;
            o.object = object;
            return o;
        }
    }
}