// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SelectionSelectionTag {
    /**
     * @return The key in a key-value pair.
     * 
     */
    private String key;
    /**
     * @return An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
     * 
     */
    private String type;
    /**
     * @return The value in a key-value pair.
     * 
     */
    private String value;

    private SelectionSelectionTag() {}
    /**
     * @return The key in a key-value pair.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value in a key-value pair.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionSelectionTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String type;
        private String value;
        public Builder() {}
        public Builder(SelectionSelectionTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SelectionSelectionTag build() {
            final var o = new SelectionSelectionTag();
            o.key = key;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}