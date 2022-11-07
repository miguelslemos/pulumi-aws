// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterEndpointArgs Empty = new ClusterClusterEndpointArgs();

    /**
     * DNS hostname of the node.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return DNS hostname of the node.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The port number on which each of the nodes accepts connections. Defaults to `6379`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number on which each of the nodes accepts connections. Defaults to `6379`.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private ClusterClusterEndpointArgs() {}

    private ClusterClusterEndpointArgs(ClusterClusterEndpointArgs $) {
        this.address = $.address;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterEndpointArgs $;

        public Builder() {
            $ = new ClusterClusterEndpointArgs();
        }

        public Builder(ClusterClusterEndpointArgs defaults) {
            $ = new ClusterClusterEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address DNS hostname of the node.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address DNS hostname of the node.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param port The port number on which each of the nodes accepts connections. Defaults to `6379`.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number on which each of the nodes accepts connections. Defaults to `6379`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ClusterClusterEndpointArgs build() {
            return $;
        }
    }

}