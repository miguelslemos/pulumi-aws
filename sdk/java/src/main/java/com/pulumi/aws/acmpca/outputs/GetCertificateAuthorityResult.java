// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.outputs;

import com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityRevocationConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityResult {
    private String arn;
    /**
     * @return Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    private String certificate;
    /**
     * @return Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    private String certificateChain;
    /**
     * @return The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    private String certificateSigningRequest;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    private String notAfter;
    /**
     * @return Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    private String notBefore;
    /**
     * @return Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * * `revocation_configuration.0.ocsp_configuration.0.enabled` - Boolean value that specifies whether a custom OCSP responder is enabled.
     * * `revocation_configuration.0.ocsp_configuration.0.ocsp_custom_cname` - A CNAME specifying a customized OCSP domain.
     * 
     */
    private List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
    /**
     * @return Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    private String serial;
    /**
     * @return Status of the certificate authority.
     * 
     */
    private String status;
    /**
     * @return Key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Type of the certificate authority.
     * 
     */
    private String type;
    /**
     * @return Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly.
     * 
     */
    private String usageMode;

    private GetCertificateAuthorityResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String certificateChain() {
        return this.certificateChain;
    }
    /**
     * @return The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    public String certificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String notAfter() {
        return this.notAfter;
    }
    /**
     * @return Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String notBefore() {
        return this.notBefore;
    }
    /**
     * @return Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * * `revocation_configuration.0.ocsp_configuration.0.enabled` - Boolean value that specifies whether a custom OCSP responder is enabled.
     * * `revocation_configuration.0.ocsp_configuration.0.ocsp_custom_cname` - A CNAME specifying a customized OCSP domain.
     * 
     */
    public List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations() {
        return this.revocationConfigurations;
    }
    /**
     * @return Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return Status of the certificate authority.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Type of the certificate authority.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly.
     * 
     */
    public String usageMode() {
        return this.usageMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String certificate;
        private String certificateChain;
        private String certificateSigningRequest;
        private String id;
        private String notAfter;
        private String notBefore;
        private List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
        private String serial;
        private String status;
        private Map<String,String> tags;
        private String type;
        private String usageMode;
        public Builder() {}
        public Builder(GetCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.certificateChain = defaults.certificateChain;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.id = defaults.id;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.revocationConfigurations = defaults.revocationConfigurations;
    	      this.serial = defaults.serial;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.usageMode = defaults.usageMode;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        @CustomType.Setter
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }
        @CustomType.Setter
        public Builder certificateSigningRequest(String certificateSigningRequest) {
            this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder notAfter(String notAfter) {
            this.notAfter = Objects.requireNonNull(notAfter);
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(String notBefore) {
            this.notBefore = Objects.requireNonNull(notBefore);
            return this;
        }
        @CustomType.Setter
        public Builder revocationConfigurations(List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations) {
            this.revocationConfigurations = Objects.requireNonNull(revocationConfigurations);
            return this;
        }
        public Builder revocationConfigurations(GetCertificateAuthorityRevocationConfiguration... revocationConfigurations) {
            return revocationConfigurations(List.of(revocationConfigurations));
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            this.serial = Objects.requireNonNull(serial);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder usageMode(String usageMode) {
            this.usageMode = Objects.requireNonNull(usageMode);
            return this;
        }
        public GetCertificateAuthorityResult build() {
            final var o = new GetCertificateAuthorityResult();
            o.arn = arn;
            o.certificate = certificate;
            o.certificateChain = certificateChain;
            o.certificateSigningRequest = certificateSigningRequest;
            o.id = id;
            o.notAfter = notAfter;
            o.notBefore = notBefore;
            o.revocationConfigurations = revocationConfigurations;
            o.serial = serial;
            o.status = status;
            o.tags = tags;
            o.type = type;
            o.usageMode = usageMode;
            return o;
        }
    }
}