// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OntapStorageVirtualMachineActiveDirectoryConfiguration {
    /**
     * @return The NetBIOS name of the Active Directory computer object that will be created for your SVM. This is often the same as the SVM name but can be different. AWS limits to 15 characters because of standard NetBIOS naming limits.
     * 
     */
    private @Nullable String netbiosName;
    private @Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;

    private OntapStorageVirtualMachineActiveDirectoryConfiguration() {}
    /**
     * @return The NetBIOS name of the Active Directory computer object that will be created for your SVM. This is often the same as the SVM name but can be different. AWS limits to 15 characters because of standard NetBIOS naming limits.
     * 
     */
    public Optional<String> netbiosName() {
        return Optional.ofNullable(this.netbiosName);
    }
    public Optional<OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration> selfManagedActiveDirectoryConfiguration() {
        return Optional.ofNullable(this.selfManagedActiveDirectoryConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapStorageVirtualMachineActiveDirectoryConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String netbiosName;
        private @Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;
        public Builder() {}
        public Builder(OntapStorageVirtualMachineActiveDirectoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netbiosName = defaults.netbiosName;
    	      this.selfManagedActiveDirectoryConfiguration = defaults.selfManagedActiveDirectoryConfiguration;
        }

        @CustomType.Setter
        public Builder netbiosName(@Nullable String netbiosName) {
            this.netbiosName = netbiosName;
            return this;
        }
        @CustomType.Setter
        public Builder selfManagedActiveDirectoryConfiguration(@Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
            this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
            return this;
        }
        public OntapStorageVirtualMachineActiveDirectoryConfiguration build() {
            final var o = new OntapStorageVirtualMachineActiveDirectoryConfiguration();
            o.netbiosName = netbiosName;
            o.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
            return o;
        }
    }
}