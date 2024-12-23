// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devopsguru.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetNotificationChannelFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationChannelFilter Empty = new GetNotificationChannelFilter();

    /**
     * Events to receive notifications for.
     * 
     */
    @Import(name="messageTypes", required=true)
    private List<String> messageTypes;

    /**
     * @return Events to receive notifications for.
     * 
     */
    public List<String> messageTypes() {
        return this.messageTypes;
    }

    /**
     * Severity levels to receive notifications for.
     * 
     */
    @Import(name="severities", required=true)
    private List<String> severities;

    /**
     * @return Severity levels to receive notifications for.
     * 
     */
    public List<String> severities() {
        return this.severities;
    }

    private GetNotificationChannelFilter() {}

    private GetNotificationChannelFilter(GetNotificationChannelFilter $) {
        this.messageTypes = $.messageTypes;
        this.severities = $.severities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationChannelFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationChannelFilter $;

        public Builder() {
            $ = new GetNotificationChannelFilter();
        }

        public Builder(GetNotificationChannelFilter defaults) {
            $ = new GetNotificationChannelFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param messageTypes Events to receive notifications for.
         * 
         * @return builder
         * 
         */
        public Builder messageTypes(List<String> messageTypes) {
            $.messageTypes = messageTypes;
            return this;
        }

        /**
         * @param messageTypes Events to receive notifications for.
         * 
         * @return builder
         * 
         */
        public Builder messageTypes(String... messageTypes) {
            return messageTypes(List.of(messageTypes));
        }

        /**
         * @param severities Severity levels to receive notifications for.
         * 
         * @return builder
         * 
         */
        public Builder severities(List<String> severities) {
            $.severities = severities;
            return this;
        }

        /**
         * @param severities Severity levels to receive notifications for.
         * 
         * @return builder
         * 
         */
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }

        public GetNotificationChannelFilter build() {
            if ($.messageTypes == null) {
                throw new MissingRequiredPropertyException("GetNotificationChannelFilter", "messageTypes");
            }
            if ($.severities == null) {
                throw new MissingRequiredPropertyException("GetNotificationChannelFilter", "severities");
            }
            return $;
        }
    }

}
