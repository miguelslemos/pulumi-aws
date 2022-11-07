// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainEbsOption {
    /**
     * @return Whether EBS volumes are attached to data nodes in the domain.
     * 
     */
    private Boolean ebsEnabled;
    /**
     * @return The baseline input/output (I/O) performance of EBS volumes attached to data nodes.
     * 
     */
    private Integer iops;
    /**
     * @return The throughput (in MiB/s) of the EBS volumes attached to data nodes.
     * 
     */
    private Integer throughput;
    /**
     * @return The size of EBS volumes attached to data nodes (in GB).
     * 
     */
    private Integer volumeSize;
    /**
     * @return The type of EBS volumes attached to data nodes.
     * 
     */
    private String volumeType;

    private GetDomainEbsOption() {}
    /**
     * @return Whether EBS volumes are attached to data nodes in the domain.
     * 
     */
    public Boolean ebsEnabled() {
        return this.ebsEnabled;
    }
    /**
     * @return The baseline input/output (I/O) performance of EBS volumes attached to data nodes.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    /**
     * @return The throughput (in MiB/s) of the EBS volumes attached to data nodes.
     * 
     */
    public Integer throughput() {
        return this.throughput;
    }
    /**
     * @return The size of EBS volumes attached to data nodes (in GB).
     * 
     */
    public Integer volumeSize() {
        return this.volumeSize;
    }
    /**
     * @return The type of EBS volumes attached to data nodes.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainEbsOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean ebsEnabled;
        private Integer iops;
        private Integer throughput;
        private Integer volumeSize;
        private String volumeType;
        public Builder() {}
        public Builder(GetDomainEbsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ebsEnabled = defaults.ebsEnabled;
    	      this.iops = defaults.iops;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder ebsEnabled(Boolean ebsEnabled) {
            this.ebsEnabled = Objects.requireNonNull(ebsEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        @CustomType.Setter
        public Builder throughput(Integer throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }
        @CustomType.Setter
        public Builder volumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetDomainEbsOption build() {
            final var o = new GetDomainEbsOption();
            o.ebsEnabled = ebsEnabled;
            o.iops = iops;
            o.throughput = throughput;
            o.volumeSize = volumeSize;
            o.volumeType = volumeType;
            return o;
        }
    }
}