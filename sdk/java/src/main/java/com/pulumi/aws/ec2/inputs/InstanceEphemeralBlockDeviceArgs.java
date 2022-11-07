// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceEphemeralBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceEphemeralBlockDeviceArgs Empty = new InstanceEphemeralBlockDeviceArgs();

    /**
     * Name of the block device to mount on the instance.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return Name of the block device to mount on the instance.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Suppresses the specified device included in the AMI&#39;s block device mapping.
     * 
     */
    @Import(name="noDevice")
    private @Nullable Output<Boolean> noDevice;

    /**
     * @return Suppresses the specified device included in the AMI&#39;s block device mapping.
     * 
     */
    public Optional<Output<Boolean>> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }

    /**
     * [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
     * 
     */
    @Import(name="virtualName")
    private @Nullable Output<String> virtualName;

    /**
     * @return [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
     * 
     */
    public Optional<Output<String>> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    private InstanceEphemeralBlockDeviceArgs() {}

    private InstanceEphemeralBlockDeviceArgs(InstanceEphemeralBlockDeviceArgs $) {
        this.deviceName = $.deviceName;
        this.noDevice = $.noDevice;
        this.virtualName = $.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceEphemeralBlockDeviceArgs $;

        public Builder() {
            $ = new InstanceEphemeralBlockDeviceArgs();
        }

        public Builder(InstanceEphemeralBlockDeviceArgs defaults) {
            $ = new InstanceEphemeralBlockDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName Name of the block device to mount on the instance.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName Name of the block device to mount on the instance.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param noDevice Suppresses the specified device included in the AMI&#39;s block device mapping.
         * 
         * @return builder
         * 
         */
        public Builder noDevice(@Nullable Output<Boolean> noDevice) {
            $.noDevice = noDevice;
            return this;
        }

        /**
         * @param noDevice Suppresses the specified device included in the AMI&#39;s block device mapping.
         * 
         * @return builder
         * 
         */
        public Builder noDevice(Boolean noDevice) {
            return noDevice(Output.of(noDevice));
        }

        /**
         * @param virtualName [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
         * 
         * @return builder
         * 
         */
        public Builder virtualName(@Nullable Output<String> virtualName) {
            $.virtualName = virtualName;
            return this;
        }

        /**
         * @param virtualName [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
         * 
         * @return builder
         * 
         */
        public Builder virtualName(String virtualName) {
            return virtualName(Output.of(virtualName));
        }

        public InstanceEphemeralBlockDeviceArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            return $;
        }
    }

}