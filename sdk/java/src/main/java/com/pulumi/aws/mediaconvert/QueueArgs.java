// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediaconvert;

import com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * A description of the queue
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the queue
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A unique identifier describing the queue
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique identifier describing the queue
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
     * 
     */
    @Import(name="pricingPlan")
    private @Nullable Output<String> pricingPlan;

    /**
     * @return Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
     * 
     */
    public Optional<Output<String>> pricingPlan() {
        return Optional.ofNullable(this.pricingPlan);
    }

    /**
     * A detail pricing plan of the  reserved queue. See below.
     * 
     */
    @Import(name="reservationPlanSettings")
    private @Nullable Output<QueueReservationPlanSettingsArgs> reservationPlanSettings;

    /**
     * @return A detail pricing plan of the  reserved queue. See below.
     * 
     */
    public Optional<Output<QueueReservationPlanSettingsArgs>> reservationPlanSettings() {
        return Optional.ofNullable(this.reservationPlanSettings);
    }

    /**
     * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private QueueArgs() {}

    private QueueArgs(QueueArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.pricingPlan = $.pricingPlan;
        this.reservationPlanSettings = $.reservationPlanSettings;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueArgs $;

        public Builder() {
            $ = new QueueArgs();
        }

        public Builder(QueueArgs defaults) {
            $ = new QueueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the queue
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the queue
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name A unique identifier describing the queue
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique identifier describing the queue
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pricingPlan Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
         * 
         * @return builder
         * 
         */
        public Builder pricingPlan(@Nullable Output<String> pricingPlan) {
            $.pricingPlan = pricingPlan;
            return this;
        }

        /**
         * @param pricingPlan Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
         * 
         * @return builder
         * 
         */
        public Builder pricingPlan(String pricingPlan) {
            return pricingPlan(Output.of(pricingPlan));
        }

        /**
         * @param reservationPlanSettings A detail pricing plan of the  reserved queue. See below.
         * 
         * @return builder
         * 
         */
        public Builder reservationPlanSettings(@Nullable Output<QueueReservationPlanSettingsArgs> reservationPlanSettings) {
            $.reservationPlanSettings = reservationPlanSettings;
            return this;
        }

        /**
         * @param reservationPlanSettings A detail pricing plan of the  reserved queue. See below.
         * 
         * @return builder
         * 
         */
        public Builder reservationPlanSettings(QueueReservationPlanSettingsArgs reservationPlanSettings) {
            return reservationPlanSettings(Output.of(reservationPlanSettings));
        }

        /**
         * @param status A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public QueueArgs build() {
            return $;
        }
    }

}