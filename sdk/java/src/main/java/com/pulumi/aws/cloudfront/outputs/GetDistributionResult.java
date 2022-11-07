// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDistributionResult {
    /**
     * @return List that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     * 
     */
    private List<String> aliases;
    /**
     * @return ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
     * 
     */
    private String arn;
    /**
     * @return Domain name corresponding to the distribution. For
     * example: `d604721fxaaqy9.cloudfront.net`.
     * 
     */
    private String domainName;
    private Boolean enabled;
    /**
     * @return Current version of the distribution&#39;s information. For example:
     * `E2QWRUHAPOMQZL`.
     * 
     */
    private String etag;
    /**
     * @return CloudFront Route 53 zone ID that can be used to
     * route an [Alias Resource Record Set][7] to. This attribute is simply an
     * alias for the zone ID `Z2FDTNDATAQYW2`.
     * 
     */
    private String hostedZoneId;
    /**
     * @return Identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     * 
     */
    private String id;
    /**
     * @return The number of invalidation batches
     * currently in progress.
     * 
     */
    private Integer inProgressValidationBatches;
    /**
     * @return Date and time the distribution was last modified.
     * 
     */
    private String lastModifiedTime;
    /**
     * @return Current status of the distribution. `Deployed` if the
     * distribution&#39;s information is fully propagated throughout the Amazon
     * CloudFront system.
     * 
     */
    private String status;
    private @Nullable Map<String,String> tags;

    private GetDistributionResult() {}
    /**
     * @return List that contains information about CNAMEs (alternate domain names), if any, for this distribution.
     * 
     */
    public List<String> aliases() {
        return this.aliases;
    }
    /**
     * @return ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Domain name corresponding to the distribution. For
     * example: `d604721fxaaqy9.cloudfront.net`.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Current version of the distribution&#39;s information. For example:
     * `E2QWRUHAPOMQZL`.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return CloudFront Route 53 zone ID that can be used to
     * route an [Alias Resource Record Set][7] to. This attribute is simply an
     * alias for the zone ID `Z2FDTNDATAQYW2`.
     * 
     */
    public String hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * @return Identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The number of invalidation batches
     * currently in progress.
     * 
     */
    public Integer inProgressValidationBatches() {
        return this.inProgressValidationBatches;
    }
    /**
     * @return Date and time the distribution was last modified.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return Current status of the distribution. `Deployed` if the
     * distribution&#39;s information is fully propagated throughout the Amazon
     * CloudFront system.
     * 
     */
    public String status() {
        return this.status;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> aliases;
        private String arn;
        private String domainName;
        private Boolean enabled;
        private String etag;
        private String hostedZoneId;
        private String id;
        private Integer inProgressValidationBatches;
        private String lastModifiedTime;
        private String status;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetDistributionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.id = defaults.id;
    	      this.inProgressValidationBatches = defaults.inProgressValidationBatches;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder aliases(List<String> aliases) {
            this.aliases = Objects.requireNonNull(aliases);
            return this;
        }
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder inProgressValidationBatches(Integer inProgressValidationBatches) {
            this.inProgressValidationBatches = Objects.requireNonNull(inProgressValidationBatches);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetDistributionResult build() {
            final var o = new GetDistributionResult();
            o.aliases = aliases;
            o.arn = arn;
            o.domainName = domainName;
            o.enabled = enabled;
            o.etag = etag;
            o.hostedZoneId = hostedZoneId;
            o.id = id;
            o.inProgressValidationBatches = inProgressValidationBatches;
            o.lastModifiedTime = lastModifiedTime;
            o.status = status;
            o.tags = tags;
            return o;
        }
    }
}