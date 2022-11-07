// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PipelineDefinitionParameterValue {
    /**
     * @return ID of the parameter value.
     * 
     */
    private String id;
    /**
     * @return Field value, expressed as a String.
     * 
     */
    private String stringValue;

    private PipelineDefinitionParameterValue() {}
    /**
     * @return ID of the parameter value.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Field value, expressed as a String.
     * 
     */
    public String stringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String stringValue;
        public Builder() {}
        public Builder(PipelineDefinitionParameterValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.stringValue = defaults.stringValue;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public PipelineDefinitionParameterValue build() {
            final var o = new PipelineDefinitionParameterValue();
            o.id = id;
            o.stringValue = stringValue;
            return o;
        }
    }
}