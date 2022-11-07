// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.aws.connect.outputs.GetInstanceStorageConfigStorageConfigS3ConfigEncryptionConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceStorageConfigStorageConfigS3Config {
    /**
     * @return The S3 bucket name.
     * 
     */
    private String bucketName;
    /**
     * @return The S3 bucket prefix.
     * 
     */
    private String bucketPrefix;
    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    private List<GetInstanceStorageConfigStorageConfigS3ConfigEncryptionConfig> encryptionConfigs;

    private GetInstanceStorageConfigStorageConfigS3Config() {}
    /**
     * @return The S3 bucket name.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The S3 bucket prefix.
     * 
     */
    public String bucketPrefix() {
        return this.bucketPrefix;
    }
    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    public List<GetInstanceStorageConfigStorageConfigS3ConfigEncryptionConfig> encryptionConfigs() {
        return this.encryptionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceStorageConfigStorageConfigS3Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private String bucketPrefix;
        private List<GetInstanceStorageConfigStorageConfigS3ConfigEncryptionConfig> encryptionConfigs;
        public Builder() {}
        public Builder(GetInstanceStorageConfigStorageConfigS3Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.encryptionConfigs = defaults.encryptionConfigs;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder bucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder encryptionConfigs(List<GetInstanceStorageConfigStorageConfigS3ConfigEncryptionConfig> encryptionConfigs) {
            this.encryptionConfigs = Objects.requireNonNull(encryptionConfigs);
            return this;
        }
        public Builder encryptionConfigs(GetInstanceStorageConfigStorageConfigS3ConfigEncryptionConfig... encryptionConfigs) {
            return encryptionConfigs(List.of(encryptionConfigs));
        }
        public GetInstanceStorageConfigStorageConfigS3Config build() {
            final var o = new GetInstanceStorageConfigStorageConfigS3Config();
            o.bucketName = bucketName;
            o.bucketPrefix = bucketPrefix;
            o.encryptionConfigs = encryptionConfigs;
            return o;
        }
    }
}