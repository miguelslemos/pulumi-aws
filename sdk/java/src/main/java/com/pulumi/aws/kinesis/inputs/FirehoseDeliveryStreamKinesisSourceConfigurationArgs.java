// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirehoseDeliveryStreamKinesisSourceConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamKinesisSourceConfigurationArgs Empty = new FirehoseDeliveryStreamKinesisSourceConfigurationArgs();

    /**
     * The kinesis stream used as the source of the firehose delivery stream.
     * 
     */
    @Import(name="kinesisStreamArn", required=true)
    private Output<String> kinesisStreamArn;

    /**
     * @return The kinesis stream used as the source of the firehose delivery stream.
     * 
     */
    public Output<String> kinesisStreamArn() {
        return this.kinesisStreamArn;
    }

    /**
     * The ARN of the role that provides access to the source Kinesis stream.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that provides access to the source Kinesis stream.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private FirehoseDeliveryStreamKinesisSourceConfigurationArgs() {}

    private FirehoseDeliveryStreamKinesisSourceConfigurationArgs(FirehoseDeliveryStreamKinesisSourceConfigurationArgs $) {
        this.kinesisStreamArn = $.kinesisStreamArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamKinesisSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamKinesisSourceConfigurationArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamKinesisSourceConfigurationArgs();
        }

        public Builder(FirehoseDeliveryStreamKinesisSourceConfigurationArgs defaults) {
            $ = new FirehoseDeliveryStreamKinesisSourceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kinesisStreamArn The kinesis stream used as the source of the firehose delivery stream.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStreamArn(Output<String> kinesisStreamArn) {
            $.kinesisStreamArn = kinesisStreamArn;
            return this;
        }

        /**
         * @param kinesisStreamArn The kinesis stream used as the source of the firehose delivery stream.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStreamArn(String kinesisStreamArn) {
            return kinesisStreamArn(Output.of(kinesisStreamArn));
        }

        /**
         * @param roleArn The ARN of the role that provides access to the source Kinesis stream.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the role that provides access to the source Kinesis stream.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public FirehoseDeliveryStreamKinesisSourceConfigurationArgs build() {
            $.kinesisStreamArn = Objects.requireNonNull($.kinesisStreamArn, "expected parameter 'kinesisStreamArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}