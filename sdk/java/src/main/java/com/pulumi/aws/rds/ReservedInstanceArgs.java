// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservedInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservedInstanceArgs Empty = new ReservedInstanceArgs();

    /**
     * Number of instances to reserve. Default value is `1`.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return Number of instances to reserve. Default value is `1`.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `aws.rds.getReservedInstanceOffering` data source.
     * 
     */
    @Import(name="offeringId", required=true)
    private Output<String> offeringId;

    /**
     * @return ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `aws.rds.getReservedInstanceOffering` data source.
     * 
     */
    public Output<String> offeringId() {
        return this.offeringId;
    }

    @Import(name="reservationId")
    private @Nullable Output<String> reservationId;

    public Optional<Output<String>> reservationId() {
        return Optional.ofNullable(this.reservationId);
    }

    /**
     * Map of tags to assign to the DB reservation. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the DB reservation. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ReservedInstanceArgs() {}

    private ReservedInstanceArgs(ReservedInstanceArgs $) {
        this.instanceCount = $.instanceCount;
        this.offeringId = $.offeringId;
        this.reservationId = $.reservationId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservedInstanceArgs $;

        public Builder() {
            $ = new ReservedInstanceArgs();
        }

        public Builder(ReservedInstanceArgs defaults) {
            $ = new ReservedInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceCount Number of instances to reserve. Default value is `1`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount Number of instances to reserve. Default value is `1`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param offeringId ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `aws.rds.getReservedInstanceOffering` data source.
         * 
         * @return builder
         * 
         */
        public Builder offeringId(Output<String> offeringId) {
            $.offeringId = offeringId;
            return this;
        }

        /**
         * @param offeringId ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `aws.rds.getReservedInstanceOffering` data source.
         * 
         * @return builder
         * 
         */
        public Builder offeringId(String offeringId) {
            return offeringId(Output.of(offeringId));
        }

        public Builder reservationId(@Nullable Output<String> reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        public Builder reservationId(String reservationId) {
            return reservationId(Output.of(reservationId));
        }

        /**
         * @param tags Map of tags to assign to the DB reservation. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the DB reservation. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ReservedInstanceArgs build() {
            $.offeringId = Objects.requireNonNull($.offeringId, "expected parameter 'offeringId' to be non-null");
            return $;
        }
    }

}