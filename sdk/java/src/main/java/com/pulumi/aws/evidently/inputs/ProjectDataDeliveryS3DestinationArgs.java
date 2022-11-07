// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectDataDeliveryS3DestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectDataDeliveryS3DestinationArgs Empty = new ProjectDataDeliveryS3DestinationArgs();

    /**
     * The name of the bucket in which Evidently stores evaluation events.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket in which Evidently stores evaluation events.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The bucket prefix in which Evidently stores evaluation events.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The bucket prefix in which Evidently stores evaluation events.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private ProjectDataDeliveryS3DestinationArgs() {}

    private ProjectDataDeliveryS3DestinationArgs(ProjectDataDeliveryS3DestinationArgs $) {
        this.bucket = $.bucket;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectDataDeliveryS3DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectDataDeliveryS3DestinationArgs $;

        public Builder() {
            $ = new ProjectDataDeliveryS3DestinationArgs();
        }

        public Builder(ProjectDataDeliveryS3DestinationArgs defaults) {
            $ = new ProjectDataDeliveryS3DestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket in which Evidently stores evaluation events.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket in which Evidently stores evaluation events.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param prefix The bucket prefix in which Evidently stores evaluation events.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The bucket prefix in which Evidently stores evaluation events.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public ProjectDataDeliveryS3DestinationArgs build() {
            return $;
        }
    }

}