// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSamlProviderResult {
    private String arn;
    /**
     * @return Creation date of the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    private String createDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Name of the provider.
     * 
     */
    private String name;
    /**
     * @return The XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    private String samlMetadataDocument;
    /**
     * @return Tags attached to the SAML provider.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2007 15:04:05 MST`.
     * 
     */
    private String validUntil;

    private GetSamlProviderResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return Creation date of the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    public String createDate() {
        return this.createDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the provider.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    public String samlMetadataDocument() {
        return this.samlMetadataDocument;
    }
    /**
     * @return Tags attached to the SAML provider.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2007 15:04:05 MST`.
     * 
     */
    public String validUntil() {
        return this.validUntil;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSamlProviderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String createDate;
        private String id;
        private String name;
        private String samlMetadataDocument;
        private Map<String,String> tags;
        private String validUntil;
        public Builder() {}
        public Builder(GetSamlProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createDate = defaults.createDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.tags = defaults.tags;
    	      this.validUntil = defaults.validUntil;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder createDate(String createDate) {
            if (createDate == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "createDate");
            }
            this.createDate = createDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder samlMetadataDocument(String samlMetadataDocument) {
            if (samlMetadataDocument == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "samlMetadataDocument");
            }
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder validUntil(String validUntil) {
            if (validUntil == null) {
              throw new MissingRequiredPropertyException("GetSamlProviderResult", "validUntil");
            }
            this.validUntil = validUntil;
            return this;
        }
        public GetSamlProviderResult build() {
            final var _resultValue = new GetSamlProviderResult();
            _resultValue.arn = arn;
            _resultValue.createDate = createDate;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.samlMetadataDocument = samlMetadataDocument;
            _resultValue.tags = tags;
            _resultValue.validUntil = validUntil;
            return _resultValue;
        }
    }
}
