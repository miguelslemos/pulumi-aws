// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersAuroraPostgresqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAuroraPostgresqlArgs Empty = new DataSourceParametersAuroraPostgresqlArgs();

    /**
     * The database to which to connect.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database to which to connect.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The host to which to connect.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port to which to connect.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private DataSourceParametersAuroraPostgresqlArgs() {}

    private DataSourceParametersAuroraPostgresqlArgs(DataSourceParametersAuroraPostgresqlArgs $) {
        this.database = $.database;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersAuroraPostgresqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersAuroraPostgresqlArgs $;

        public Builder() {
            $ = new DataSourceParametersAuroraPostgresqlArgs();
        }

        public Builder(DataSourceParametersAuroraPostgresqlArgs defaults) {
            $ = new DataSourceParametersAuroraPostgresqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param host The host to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port The port to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port to which to connect.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public DataSourceParametersAuroraPostgresqlArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}