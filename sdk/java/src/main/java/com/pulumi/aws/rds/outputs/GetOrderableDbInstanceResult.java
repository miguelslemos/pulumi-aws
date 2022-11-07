// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetOrderableDbInstanceResult {
    private String availabilityZoneGroup;
    /**
     * @return Availability zones where the instance is available.
     * 
     */
    private List<String> availabilityZones;
    private String engine;
    private String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceClass;
    private String licenseModel;
    /**
     * @return Maximum total provisioned IOPS for a DB instance.
     * 
     */
    private Integer maxIopsPerDbInstance;
    /**
     * @return Maximum provisioned IOPS per GiB for a DB instance.
     * 
     */
    private Double maxIopsPerGib;
    /**
     * @return Maximum storage size for a DB instance.
     * 
     */
    private Integer maxStorageSize;
    /**
     * @return Minimum total provisioned IOPS for a DB instance.
     * 
     */
    private Integer minIopsPerDbInstance;
    /**
     * @return Minimum provisioned IOPS per GiB for a DB instance.
     * 
     */
    private Double minIopsPerGib;
    /**
     * @return Minimum storage size for a DB instance.
     * 
     */
    private Integer minStorageSize;
    /**
     * @return Whether a DB instance is Multi-AZ capable.
     * 
     */
    private Boolean multiAzCapable;
    /**
     * @return Whether a DB instance supports RDS on Outposts.
     * 
     */
    private Boolean outpostCapable;
    private @Nullable List<String> preferredEngineVersions;
    private @Nullable List<String> preferredInstanceClasses;
    /**
     * @return Whether a DB instance can have a read replica.
     * 
     */
    private Boolean readReplicaCapable;
    private String storageType;
    /**
     * @return A list of the supported DB engine modes.
     * 
     */
    private List<String> supportedEngineModes;
    /**
     * @return The network types supported by the DB instance (`IPV4` or `DUAL`).
     * 
     */
    private List<String> supportedNetworkTypes;
    private Boolean supportsEnhancedMonitoring;
    private Boolean supportsGlobalDatabases;
    private Boolean supportsIamDatabaseAuthentication;
    private Boolean supportsIops;
    private Boolean supportsKerberosAuthentication;
    private Boolean supportsPerformanceInsights;
    private Boolean supportsStorageAutoscaling;
    private Boolean supportsStorageEncryption;
    private Boolean vpc;

    private GetOrderableDbInstanceResult() {}
    public String availabilityZoneGroup() {
        return this.availabilityZoneGroup;
    }
    /**
     * @return Availability zones where the instance is available.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    public String engine() {
        return this.engine;
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceClass() {
        return this.instanceClass;
    }
    public String licenseModel() {
        return this.licenseModel;
    }
    /**
     * @return Maximum total provisioned IOPS for a DB instance.
     * 
     */
    public Integer maxIopsPerDbInstance() {
        return this.maxIopsPerDbInstance;
    }
    /**
     * @return Maximum provisioned IOPS per GiB for a DB instance.
     * 
     */
    public Double maxIopsPerGib() {
        return this.maxIopsPerGib;
    }
    /**
     * @return Maximum storage size for a DB instance.
     * 
     */
    public Integer maxStorageSize() {
        return this.maxStorageSize;
    }
    /**
     * @return Minimum total provisioned IOPS for a DB instance.
     * 
     */
    public Integer minIopsPerDbInstance() {
        return this.minIopsPerDbInstance;
    }
    /**
     * @return Minimum provisioned IOPS per GiB for a DB instance.
     * 
     */
    public Double minIopsPerGib() {
        return this.minIopsPerGib;
    }
    /**
     * @return Minimum storage size for a DB instance.
     * 
     */
    public Integer minStorageSize() {
        return this.minStorageSize;
    }
    /**
     * @return Whether a DB instance is Multi-AZ capable.
     * 
     */
    public Boolean multiAzCapable() {
        return this.multiAzCapable;
    }
    /**
     * @return Whether a DB instance supports RDS on Outposts.
     * 
     */
    public Boolean outpostCapable() {
        return this.outpostCapable;
    }
    public List<String> preferredEngineVersions() {
        return this.preferredEngineVersions == null ? List.of() : this.preferredEngineVersions;
    }
    public List<String> preferredInstanceClasses() {
        return this.preferredInstanceClasses == null ? List.of() : this.preferredInstanceClasses;
    }
    /**
     * @return Whether a DB instance can have a read replica.
     * 
     */
    public Boolean readReplicaCapable() {
        return this.readReplicaCapable;
    }
    public String storageType() {
        return this.storageType;
    }
    /**
     * @return A list of the supported DB engine modes.
     * 
     */
    public List<String> supportedEngineModes() {
        return this.supportedEngineModes;
    }
    /**
     * @return The network types supported by the DB instance (`IPV4` or `DUAL`).
     * 
     */
    public List<String> supportedNetworkTypes() {
        return this.supportedNetworkTypes;
    }
    public Boolean supportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
    }
    public Boolean supportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }
    public Boolean supportsIamDatabaseAuthentication() {
        return this.supportsIamDatabaseAuthentication;
    }
    public Boolean supportsIops() {
        return this.supportsIops;
    }
    public Boolean supportsKerberosAuthentication() {
        return this.supportsKerberosAuthentication;
    }
    public Boolean supportsPerformanceInsights() {
        return this.supportsPerformanceInsights;
    }
    public Boolean supportsStorageAutoscaling() {
        return this.supportsStorageAutoscaling;
    }
    public Boolean supportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }
    public Boolean vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableDbInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String availabilityZoneGroup;
        private List<String> availabilityZones;
        private String engine;
        private String engineVersion;
        private String id;
        private String instanceClass;
        private String licenseModel;
        private Integer maxIopsPerDbInstance;
        private Double maxIopsPerGib;
        private Integer maxStorageSize;
        private Integer minIopsPerDbInstance;
        private Double minIopsPerGib;
        private Integer minStorageSize;
        private Boolean multiAzCapable;
        private Boolean outpostCapable;
        private @Nullable List<String> preferredEngineVersions;
        private @Nullable List<String> preferredInstanceClasses;
        private Boolean readReplicaCapable;
        private String storageType;
        private List<String> supportedEngineModes;
        private List<String> supportedNetworkTypes;
        private Boolean supportsEnhancedMonitoring;
        private Boolean supportsGlobalDatabases;
        private Boolean supportsIamDatabaseAuthentication;
        private Boolean supportsIops;
        private Boolean supportsKerberosAuthentication;
        private Boolean supportsPerformanceInsights;
        private Boolean supportsStorageAutoscaling;
        private Boolean supportsStorageEncryption;
        private Boolean vpc;
        public Builder() {}
        public Builder(GetOrderableDbInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneGroup = defaults.availabilityZoneGroup;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.licenseModel = defaults.licenseModel;
    	      this.maxIopsPerDbInstance = defaults.maxIopsPerDbInstance;
    	      this.maxIopsPerGib = defaults.maxIopsPerGib;
    	      this.maxStorageSize = defaults.maxStorageSize;
    	      this.minIopsPerDbInstance = defaults.minIopsPerDbInstance;
    	      this.minIopsPerGib = defaults.minIopsPerGib;
    	      this.minStorageSize = defaults.minStorageSize;
    	      this.multiAzCapable = defaults.multiAzCapable;
    	      this.outpostCapable = defaults.outpostCapable;
    	      this.preferredEngineVersions = defaults.preferredEngineVersions;
    	      this.preferredInstanceClasses = defaults.preferredInstanceClasses;
    	      this.readReplicaCapable = defaults.readReplicaCapable;
    	      this.storageType = defaults.storageType;
    	      this.supportedEngineModes = defaults.supportedEngineModes;
    	      this.supportedNetworkTypes = defaults.supportedNetworkTypes;
    	      this.supportsEnhancedMonitoring = defaults.supportsEnhancedMonitoring;
    	      this.supportsGlobalDatabases = defaults.supportsGlobalDatabases;
    	      this.supportsIamDatabaseAuthentication = defaults.supportsIamDatabaseAuthentication;
    	      this.supportsIops = defaults.supportsIops;
    	      this.supportsKerberosAuthentication = defaults.supportsKerberosAuthentication;
    	      this.supportsPerformanceInsights = defaults.supportsPerformanceInsights;
    	      this.supportsStorageAutoscaling = defaults.supportsStorageAutoscaling;
    	      this.supportsStorageEncryption = defaults.supportsStorageEncryption;
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder availabilityZoneGroup(String availabilityZoneGroup) {
            this.availabilityZoneGroup = Objects.requireNonNull(availabilityZoneGroup);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        @CustomType.Setter
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }
        @CustomType.Setter
        public Builder maxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
            this.maxIopsPerDbInstance = Objects.requireNonNull(maxIopsPerDbInstance);
            return this;
        }
        @CustomType.Setter
        public Builder maxIopsPerGib(Double maxIopsPerGib) {
            this.maxIopsPerGib = Objects.requireNonNull(maxIopsPerGib);
            return this;
        }
        @CustomType.Setter
        public Builder maxStorageSize(Integer maxStorageSize) {
            this.maxStorageSize = Objects.requireNonNull(maxStorageSize);
            return this;
        }
        @CustomType.Setter
        public Builder minIopsPerDbInstance(Integer minIopsPerDbInstance) {
            this.minIopsPerDbInstance = Objects.requireNonNull(minIopsPerDbInstance);
            return this;
        }
        @CustomType.Setter
        public Builder minIopsPerGib(Double minIopsPerGib) {
            this.minIopsPerGib = Objects.requireNonNull(minIopsPerGib);
            return this;
        }
        @CustomType.Setter
        public Builder minStorageSize(Integer minStorageSize) {
            this.minStorageSize = Objects.requireNonNull(minStorageSize);
            return this;
        }
        @CustomType.Setter
        public Builder multiAzCapable(Boolean multiAzCapable) {
            this.multiAzCapable = Objects.requireNonNull(multiAzCapable);
            return this;
        }
        @CustomType.Setter
        public Builder outpostCapable(Boolean outpostCapable) {
            this.outpostCapable = Objects.requireNonNull(outpostCapable);
            return this;
        }
        @CustomType.Setter
        public Builder preferredEngineVersions(@Nullable List<String> preferredEngineVersions) {
            this.preferredEngineVersions = preferredEngineVersions;
            return this;
        }
        public Builder preferredEngineVersions(String... preferredEngineVersions) {
            return preferredEngineVersions(List.of(preferredEngineVersions));
        }
        @CustomType.Setter
        public Builder preferredInstanceClasses(@Nullable List<String> preferredInstanceClasses) {
            this.preferredInstanceClasses = preferredInstanceClasses;
            return this;
        }
        public Builder preferredInstanceClasses(String... preferredInstanceClasses) {
            return preferredInstanceClasses(List.of(preferredInstanceClasses));
        }
        @CustomType.Setter
        public Builder readReplicaCapable(Boolean readReplicaCapable) {
            this.readReplicaCapable = Objects.requireNonNull(readReplicaCapable);
            return this;
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        @CustomType.Setter
        public Builder supportedEngineModes(List<String> supportedEngineModes) {
            this.supportedEngineModes = Objects.requireNonNull(supportedEngineModes);
            return this;
        }
        public Builder supportedEngineModes(String... supportedEngineModes) {
            return supportedEngineModes(List.of(supportedEngineModes));
        }
        @CustomType.Setter
        public Builder supportedNetworkTypes(List<String> supportedNetworkTypes) {
            this.supportedNetworkTypes = Objects.requireNonNull(supportedNetworkTypes);
            return this;
        }
        public Builder supportedNetworkTypes(String... supportedNetworkTypes) {
            return supportedNetworkTypes(List.of(supportedNetworkTypes));
        }
        @CustomType.Setter
        public Builder supportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
            this.supportsEnhancedMonitoring = Objects.requireNonNull(supportsEnhancedMonitoring);
            return this;
        }
        @CustomType.Setter
        public Builder supportsGlobalDatabases(Boolean supportsGlobalDatabases) {
            this.supportsGlobalDatabases = Objects.requireNonNull(supportsGlobalDatabases);
            return this;
        }
        @CustomType.Setter
        public Builder supportsIamDatabaseAuthentication(Boolean supportsIamDatabaseAuthentication) {
            this.supportsIamDatabaseAuthentication = Objects.requireNonNull(supportsIamDatabaseAuthentication);
            return this;
        }
        @CustomType.Setter
        public Builder supportsIops(Boolean supportsIops) {
            this.supportsIops = Objects.requireNonNull(supportsIops);
            return this;
        }
        @CustomType.Setter
        public Builder supportsKerberosAuthentication(Boolean supportsKerberosAuthentication) {
            this.supportsKerberosAuthentication = Objects.requireNonNull(supportsKerberosAuthentication);
            return this;
        }
        @CustomType.Setter
        public Builder supportsPerformanceInsights(Boolean supportsPerformanceInsights) {
            this.supportsPerformanceInsights = Objects.requireNonNull(supportsPerformanceInsights);
            return this;
        }
        @CustomType.Setter
        public Builder supportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
            this.supportsStorageAutoscaling = Objects.requireNonNull(supportsStorageAutoscaling);
            return this;
        }
        @CustomType.Setter
        public Builder supportsStorageEncryption(Boolean supportsStorageEncryption) {
            this.supportsStorageEncryption = Objects.requireNonNull(supportsStorageEncryption);
            return this;
        }
        @CustomType.Setter
        public Builder vpc(Boolean vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public GetOrderableDbInstanceResult build() {
            final var o = new GetOrderableDbInstanceResult();
            o.availabilityZoneGroup = availabilityZoneGroup;
            o.availabilityZones = availabilityZones;
            o.engine = engine;
            o.engineVersion = engineVersion;
            o.id = id;
            o.instanceClass = instanceClass;
            o.licenseModel = licenseModel;
            o.maxIopsPerDbInstance = maxIopsPerDbInstance;
            o.maxIopsPerGib = maxIopsPerGib;
            o.maxStorageSize = maxStorageSize;
            o.minIopsPerDbInstance = minIopsPerDbInstance;
            o.minIopsPerGib = minIopsPerGib;
            o.minStorageSize = minStorageSize;
            o.multiAzCapable = multiAzCapable;
            o.outpostCapable = outpostCapable;
            o.preferredEngineVersions = preferredEngineVersions;
            o.preferredInstanceClasses = preferredInstanceClasses;
            o.readReplicaCapable = readReplicaCapable;
            o.storageType = storageType;
            o.supportedEngineModes = supportedEngineModes;
            o.supportedNetworkTypes = supportedNetworkTypes;
            o.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
            o.supportsGlobalDatabases = supportsGlobalDatabases;
            o.supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication;
            o.supportsIops = supportsIops;
            o.supportsKerberosAuthentication = supportsKerberosAuthentication;
            o.supportsPerformanceInsights = supportsPerformanceInsights;
            o.supportsStorageAutoscaling = supportsStorageAutoscaling;
            o.supportsStorageEncryption = supportsStorageEncryption;
            o.vpc = vpc;
            return o;
        }
    }
}