// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.outputs;

import com.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPeeringAttachmentResult {
    private @Nullable List<GetPeeringAttachmentFilter> filters;
    private String id;
    /**
     * @return Identifier of the peer AWS account
     * 
     */
    private String peerAccountId;
    /**
     * @return Identifier of the peer AWS region
     * 
     */
    private String peerRegion;
    /**
     * @return Identifier of the peer EC2 Transit Gateway
     * 
     */
    private String peerTransitGatewayId;
    private Map<String,String> tags;
    /**
     * @return Identifier of the local EC2 Transit Gateway
     * 
     */
    private String transitGatewayId;

    private GetPeeringAttachmentResult() {}
    public List<GetPeeringAttachmentFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the peer AWS account
     * 
     */
    public String peerAccountId() {
        return this.peerAccountId;
    }
    /**
     * @return Identifier of the peer AWS region
     * 
     */
    public String peerRegion() {
        return this.peerRegion;
    }
    /**
     * @return Identifier of the peer EC2 Transit Gateway
     * 
     */
    public String peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Identifier of the local EC2 Transit Gateway
     * 
     */
    public String transitGatewayId() {
        return this.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringAttachmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetPeeringAttachmentFilter> filters;
        private String id;
        private String peerAccountId;
        private String peerRegion;
        private String peerTransitGatewayId;
        private Map<String,String> tags;
        private String transitGatewayId;
        public Builder() {}
        public Builder(GetPeeringAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.peerAccountId = defaults.peerAccountId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerTransitGatewayId = defaults.peerTransitGatewayId;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetPeeringAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPeeringAttachmentFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder peerAccountId(String peerAccountId) {
            this.peerAccountId = Objects.requireNonNull(peerAccountId);
            return this;
        }
        @CustomType.Setter
        public Builder peerRegion(String peerRegion) {
            this.peerRegion = Objects.requireNonNull(peerRegion);
            return this;
        }
        @CustomType.Setter
        public Builder peerTransitGatewayId(String peerTransitGatewayId) {
            this.peerTransitGatewayId = Objects.requireNonNull(peerTransitGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        public GetPeeringAttachmentResult build() {
            final var o = new GetPeeringAttachmentResult();
            o.filters = filters;
            o.id = id;
            o.peerAccountId = peerAccountId;
            o.peerRegion = peerRegion;
            o.peerTransitGatewayId = peerTransitGatewayId;
            o.tags = tags;
            o.transitGatewayId = transitGatewayId;
            return o;
        }
    }
}