// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSettingArgs Empty = new ClusterSettingArgs();

    /**
     * Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value to assign to the setting. Valid values are `enabled` and `disabled`.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value to assign to the setting. Valid values are `enabled` and `disabled`.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ClusterSettingArgs() {}

    private ClusterSettingArgs(ClusterSettingArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSettingArgs $;

        public Builder() {
            $ = new ClusterSettingArgs();
        }

        public Builder(ClusterSettingArgs defaults) {
            $ = new ClusterSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the setting to manage. Valid values: `containerInsights`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the setting to manage. Valid values: `containerInsights`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value to assign to the setting. Valid values are `enabled` and `disabled`.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to assign to the setting. Valid values are `enabled` and `disabled`.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterSettingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}