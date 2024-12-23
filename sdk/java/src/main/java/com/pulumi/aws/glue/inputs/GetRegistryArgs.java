// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryArgs Empty = new GetRegistryArgs();

    /**
     * Name of the Glue Registry.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the Glue Registry.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetRegistryArgs() {}

    private GetRegistryArgs(GetRegistryArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryArgs $;

        public Builder() {
            $ = new GetRegistryArgs();
        }

        public Builder(GetRegistryArgs defaults) {
            $ = new GetRegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Glue Registry.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Glue Registry.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetRegistryArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetRegistryArgs", "name");
            }
            return $;
        }
    }

}
