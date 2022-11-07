// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyState extends com.pulumi.resources.ResourceArgs {

    public static final KeyState Empty = new KeyState();

    /**
     * The Amazon Resource Name (ARN) of the key.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the key.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    @Import(name="bypassPolicyLockoutSafetyCheck")
    private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> bypassPolicyLockoutSafetyCheck() {
        return Optional.ofNullable(this.bypassPolicyLockoutSafetyCheck);
    }

    /**
     * ID of the KMS [Custom Key Store](https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html) where the key will be stored instead of KMS (eg CloudHSM).
     * 
     */
    @Import(name="customKeyStoreId")
    private @Nullable Output<String> customKeyStoreId;

    /**
     * @return ID of the KMS [Custom Key Store](https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html) where the key will be stored instead of KMS (eg CloudHSM).
     * 
     */
    public Optional<Output<String>> customKeyStoreId() {
        return Optional.ofNullable(this.customKeyStoreId);
    }

    /**
     * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
     * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `HMAC_256`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
     * 
     */
    @Import(name="customerMasterKeySpec")
    private @Nullable Output<String> customerMasterKeySpec;

    /**
     * @return Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
     * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `HMAC_256`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
     * 
     */
    public Optional<Output<String>> customerMasterKeySpec() {
        return Optional.ofNullable(this.customerMasterKeySpec);
    }

    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     * 
     */
    @Import(name="deletionWindowInDays")
    private @Nullable Output<Integer> deletionWindowInDays;

    /**
     * @return The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     * 
     */
    public Optional<Output<Integer>> deletionWindowInDays() {
        return Optional.ofNullable(this.deletionWindowInDays);
    }

    /**
     * The description of the key as viewed in AWS console.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the key as viewed in AWS console.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
     * 
     */
    @Import(name="enableKeyRotation")
    private @Nullable Output<Boolean> enableKeyRotation;

    /**
     * @return Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> enableKeyRotation() {
        return Optional.ofNullable(this.enableKeyRotation);
    }

    /**
     * Specifies whether the key is enabled. Defaults to `true`.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Specifies whether the key is enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The globally unique identifier for the key.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The globally unique identifier for the key.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT`, `SIGN_VERIFY`, or `GENERATE_VERIFY_MAC`.
     * Defaults to `ENCRYPT_DECRYPT`.
     * 
     */
    @Import(name="keyUsage")
    private @Nullable Output<String> keyUsage;

    /**
     * @return Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT`, `SIGN_VERIFY`, or `GENERATE_VERIFY_MAC`.
     * Defaults to `ENCRYPT_DECRYPT`.
     * 
     */
    public Optional<Output<String>> keyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }

    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @Import(name="multiRegion")
    private @Nullable Output<Boolean> multiRegion;

    /**
     * @return Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> multiRegion() {
        return Optional.ofNullable(this.multiRegion);
    }

    /**
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private KeyState() {}

    private KeyState(KeyState $) {
        this.arn = $.arn;
        this.bypassPolicyLockoutSafetyCheck = $.bypassPolicyLockoutSafetyCheck;
        this.customKeyStoreId = $.customKeyStoreId;
        this.customerMasterKeySpec = $.customerMasterKeySpec;
        this.deletionWindowInDays = $.deletionWindowInDays;
        this.description = $.description;
        this.enableKeyRotation = $.enableKeyRotation;
        this.isEnabled = $.isEnabled;
        this.keyId = $.keyId;
        this.keyUsage = $.keyUsage;
        this.multiRegion = $.multiRegion;
        this.policy = $.policy;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyState $;

        public Builder() {
            $ = new KeyState();
        }

        public Builder(KeyState defaults) {
            $ = new KeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the key.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the key.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param bypassPolicyLockoutSafetyCheck A flag to indicate whether to bypass the key policy lockout safety check.
         * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
         * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
         * The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            $.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }

        /**
         * @param bypassPolicyLockoutSafetyCheck A flag to indicate whether to bypass the key policy lockout safety check.
         * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
         * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
         * The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder bypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
            return bypassPolicyLockoutSafetyCheck(Output.of(bypassPolicyLockoutSafetyCheck));
        }

        /**
         * @param customKeyStoreId ID of the KMS [Custom Key Store](https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html) where the key will be stored instead of KMS (eg CloudHSM).
         * 
         * @return builder
         * 
         */
        public Builder customKeyStoreId(@Nullable Output<String> customKeyStoreId) {
            $.customKeyStoreId = customKeyStoreId;
            return this;
        }

        /**
         * @param customKeyStoreId ID of the KMS [Custom Key Store](https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html) where the key will be stored instead of KMS (eg CloudHSM).
         * 
         * @return builder
         * 
         */
        public Builder customKeyStoreId(String customKeyStoreId) {
            return customKeyStoreId(Output.of(customKeyStoreId));
        }

        /**
         * @param customerMasterKeySpec Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
         * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `HMAC_256`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
         * 
         * @return builder
         * 
         */
        public Builder customerMasterKeySpec(@Nullable Output<String> customerMasterKeySpec) {
            $.customerMasterKeySpec = customerMasterKeySpec;
            return this;
        }

        /**
         * @param customerMasterKeySpec Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
         * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `HMAC_256`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
         * 
         * @return builder
         * 
         */
        public Builder customerMasterKeySpec(String customerMasterKeySpec) {
            return customerMasterKeySpec(Output.of(customerMasterKeySpec));
        }

        /**
         * @param deletionWindowInDays The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
         * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
         * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
         * 
         * @return builder
         * 
         */
        public Builder deletionWindowInDays(@Nullable Output<Integer> deletionWindowInDays) {
            $.deletionWindowInDays = deletionWindowInDays;
            return this;
        }

        /**
         * @param deletionWindowInDays The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
         * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
         * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
         * 
         * @return builder
         * 
         */
        public Builder deletionWindowInDays(Integer deletionWindowInDays) {
            return deletionWindowInDays(Output.of(deletionWindowInDays));
        }

        /**
         * @param description The description of the key as viewed in AWS console.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the key as viewed in AWS console.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableKeyRotation Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder enableKeyRotation(@Nullable Output<Boolean> enableKeyRotation) {
            $.enableKeyRotation = enableKeyRotation;
            return this;
        }

        /**
         * @param enableKeyRotation Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder enableKeyRotation(Boolean enableKeyRotation) {
            return enableKeyRotation(Output.of(enableKeyRotation));
        }

        /**
         * @param isEnabled Specifies whether the key is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Specifies whether the key is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param keyId The globally unique identifier for the key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The globally unique identifier for the key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param keyUsage Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT`, `SIGN_VERIFY`, or `GENERATE_VERIFY_MAC`.
         * Defaults to `ENCRYPT_DECRYPT`.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(@Nullable Output<String> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param keyUsage Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT`, `SIGN_VERIFY`, or `GENERATE_VERIFY_MAC`.
         * Defaults to `ENCRYPT_DECRYPT`.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(String keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        /**
         * @param multiRegion Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder multiRegion(@Nullable Output<Boolean> multiRegion) {
            $.multiRegion = multiRegion;
            return this;
        }

        /**
         * @param multiRegion Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder multiRegion(Boolean multiRegion) {
            return multiRegion(Output.of(multiRegion));
        }

        /**
         * @param policy A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param tags A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public KeyState build() {
            return $;
        }
    }

}