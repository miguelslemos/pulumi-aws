// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetRealtimeLogConfigEndpointKinesisStreamConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRealtimeLogConfigEndpoint {
    /**
     * @return (Required) Amazon Kinesis data stream configuration.
     * 
     */
    private List<GetRealtimeLogConfigEndpointKinesisStreamConfig> kinesisStreamConfigs;
    /**
     * @return (Required) Type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    private String streamType;

    private GetRealtimeLogConfigEndpoint() {}
    /**
     * @return (Required) Amazon Kinesis data stream configuration.
     * 
     */
    public List<GetRealtimeLogConfigEndpointKinesisStreamConfig> kinesisStreamConfigs() {
        return this.kinesisStreamConfigs;
    }
    /**
     * @return (Required) Type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    public String streamType() {
        return this.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRealtimeLogConfigEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRealtimeLogConfigEndpointKinesisStreamConfig> kinesisStreamConfigs;
        private String streamType;
        public Builder() {}
        public Builder(GetRealtimeLogConfigEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfigs = defaults.kinesisStreamConfigs;
    	      this.streamType = defaults.streamType;
        }

        @CustomType.Setter
        public Builder kinesisStreamConfigs(List<GetRealtimeLogConfigEndpointKinesisStreamConfig> kinesisStreamConfigs) {
            this.kinesisStreamConfigs = Objects.requireNonNull(kinesisStreamConfigs);
            return this;
        }
        public Builder kinesisStreamConfigs(GetRealtimeLogConfigEndpointKinesisStreamConfig... kinesisStreamConfigs) {
            return kinesisStreamConfigs(List.of(kinesisStreamConfigs));
        }
        @CustomType.Setter
        public Builder streamType(String streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }
        public GetRealtimeLogConfigEndpoint build() {
            final var o = new GetRealtimeLogConfigEndpoint();
            o.kinesisStreamConfigs = kinesisStreamConfigs;
            o.streamType = streamType;
            return o;
        }
    }
}