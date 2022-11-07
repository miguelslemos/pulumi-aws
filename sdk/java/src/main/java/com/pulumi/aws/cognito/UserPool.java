// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cognito.UserPoolArgs;
import com.pulumi.aws.cognito.inputs.UserPoolState;
import com.pulumi.aws.cognito.outputs.UserPoolAccountRecoverySetting;
import com.pulumi.aws.cognito.outputs.UserPoolAdminCreateUserConfig;
import com.pulumi.aws.cognito.outputs.UserPoolDeviceConfiguration;
import com.pulumi.aws.cognito.outputs.UserPoolEmailConfiguration;
import com.pulumi.aws.cognito.outputs.UserPoolLambdaConfig;
import com.pulumi.aws.cognito.outputs.UserPoolPasswordPolicy;
import com.pulumi.aws.cognito.outputs.UserPoolSchema;
import com.pulumi.aws.cognito.outputs.UserPoolSmsConfiguration;
import com.pulumi.aws.cognito.outputs.UserPoolSoftwareTokenMfaConfiguration;
import com.pulumi.aws.cognito.outputs.UserPoolUserAttributeUpdateSettings;
import com.pulumi.aws.cognito.outputs.UserPoolUserPoolAddOns;
import com.pulumi.aws.cognito.outputs.UserPoolUsernameConfiguration;
import com.pulumi.aws.cognito.outputs.UserPoolVerificationMessageTemplate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cognito User Pool resource.
 * 
 * ## Example Usage
 * ### Basic configuration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cognito.UserPool;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var pool = new UserPool(&#34;pool&#34;);
 * 
 *     }
 * }
 * ```
 * ### Enabling SMS and Software Token Multi-Factor Authentication
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cognito.UserPool;
 * import com.pulumi.aws.cognito.UserPoolArgs;
 * import com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs;
 * import com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new UserPool(&#34;example&#34;, UserPoolArgs.builder()        
 *             .mfaConfiguration(&#34;ON&#34;)
 *             .smsAuthenticationMessage(&#34;Your code is {####}&#34;)
 *             .smsConfiguration(UserPoolSmsConfigurationArgs.builder()
 *                 .externalId(&#34;example&#34;)
 *                 .snsCallerArn(aws_iam_role.example().arn())
 *                 .build())
 *             .softwareTokenMfaConfiguration(UserPoolSoftwareTokenMfaConfigurationArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using Account Recovery Setting
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cognito.UserPool;
 * import com.pulumi.aws.cognito.UserPoolArgs;
 * import com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new UserPool(&#34;test&#34;, UserPoolArgs.builder()        
 *             .accountRecoverySetting(UserPoolAccountRecoverySettingArgs.builder()
 *                 .recoveryMechanisms(                
 *                     UserPoolAccountRecoverySettingRecoveryMechanismArgs.builder()
 *                         .name(&#34;verified_email&#34;)
 *                         .priority(1)
 *                         .build(),
 *                     UserPoolAccountRecoverySettingRecoveryMechanismArgs.builder()
 *                         .name(&#34;verified_phone_number&#34;)
 *                         .priority(2)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cognito User Pools can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/userPool:UserPool pool us-west-2_abc123
 * ```
 * 
 */
@ResourceType(type="aws:cognito/userPool:UserPool")
public class UserPool extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    @Export(name="accountRecoverySetting", type=UserPoolAccountRecoverySetting.class, parameters={})
    private Output</* @Nullable */ UserPoolAccountRecoverySetting> accountRecoverySetting;

    /**
     * @return Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    public Output<Optional<UserPoolAccountRecoverySetting>> accountRecoverySetting() {
        return Codegen.optional(this.accountRecoverySetting);
    }
    /**
     * Configuration block for creating a new user profile. Detailed below.
     * 
     */
    @Export(name="adminCreateUserConfig", type=UserPoolAdminCreateUserConfig.class, parameters={})
    private Output<UserPoolAdminCreateUserConfig> adminCreateUserConfig;

    /**
     * @return Configuration block for creating a new user profile. Detailed below.
     * 
     */
    public Output<UserPoolAdminCreateUserConfig> adminCreateUserConfig() {
        return this.adminCreateUserConfig;
    }
    /**
     * Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    @Export(name="aliasAttributes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> aliasAttributes;

    /**
     * @return Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    public Output<Optional<List<String>>> aliasAttributes() {
        return Codegen.optional(this.aliasAttributes);
    }
    /**
     * ARN of the user pool.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the user pool.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    @Export(name="autoVerifiedAttributes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> autoVerifiedAttributes;

    /**
     * @return Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    public Output<Optional<List<String>>> autoVerifiedAttributes() {
        return Codegen.optional(this.autoVerifiedAttributes);
    }
    /**
     * Date the user pool was created.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return Date the user pool was created.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: `auth.example.com`.
     * 
     */
    @Export(name="customDomain", type=String.class, parameters={})
    private Output<String> customDomain;

    /**
     * @return A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: `auth.example.com`.
     * 
     */
    public Output<String> customDomain() {
        return this.customDomain;
    }
    /**
     * When active, DeletionProtection prevents accidental deletion of your user pool. Before you can delete a user pool that you have protected against deletion, you must deactivate this feature. Valid values are `ACTIVE` and `INACTIVE`, Default value is `INACTIVE`.
     * 
     */
    @Export(name="deletionProtection", type=String.class, parameters={})
    private Output</* @Nullable */ String> deletionProtection;

    /**
     * @return When active, DeletionProtection prevents accidental deletion of your user pool. Before you can delete a user pool that you have protected against deletion, you must deactivate this feature. Valid values are `ACTIVE` and `INACTIVE`, Default value is `INACTIVE`.
     * 
     */
    public Output<Optional<String>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * Configuration block for the user pool&#39;s device tracking. Detailed below.
     * 
     */
    @Export(name="deviceConfiguration", type=UserPoolDeviceConfiguration.class, parameters={})
    private Output</* @Nullable */ UserPoolDeviceConfiguration> deviceConfiguration;

    /**
     * @return Configuration block for the user pool&#39;s device tracking. Detailed below.
     * 
     */
    public Output<Optional<UserPoolDeviceConfiguration>> deviceConfiguration() {
        return Codegen.optional(this.deviceConfiguration);
    }
    /**
     * Holds the domain prefix if the user pool has a domain associated with it.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Holds the domain prefix if the user pool has a domain associated with it.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Configuration block for configuring email. Detailed below.
     * 
     */
    @Export(name="emailConfiguration", type=UserPoolEmailConfiguration.class, parameters={})
    private Output</* @Nullable */ UserPoolEmailConfiguration> emailConfiguration;

    /**
     * @return Configuration block for configuring email. Detailed below.
     * 
     */
    public Output<Optional<UserPoolEmailConfiguration>> emailConfiguration() {
        return Codegen.optional(this.emailConfiguration);
    }
    /**
     * String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    @Export(name="emailVerificationMessage", type=String.class, parameters={})
    private Output<String> emailVerificationMessage;

    /**
     * @return String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    public Output<String> emailVerificationMessage() {
        return this.emailVerificationMessage;
    }
    /**
     * String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    @Export(name="emailVerificationSubject", type=String.class, parameters={})
    private Output<String> emailVerificationSubject;

    /**
     * @return String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    public Output<String> emailVerificationSubject() {
        return this.emailVerificationSubject;
    }
    /**
     * Endpoint name of the user pool. Example format: `cognito-idp.REGION.amazonaws.com/xxxx_yyyyy`
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return Endpoint name of the user pool. Example format: `cognito-idp.REGION.amazonaws.com/xxxx_yyyyy`
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * A number estimating the size of the user pool.
     * 
     */
    @Export(name="estimatedNumberOfUsers", type=Integer.class, parameters={})
    private Output<Integer> estimatedNumberOfUsers;

    /**
     * @return A number estimating the size of the user pool.
     * 
     */
    public Output<Integer> estimatedNumberOfUsers() {
        return this.estimatedNumberOfUsers;
    }
    /**
     * Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    @Export(name="lambdaConfig", type=UserPoolLambdaConfig.class, parameters={})
    private Output</* @Nullable */ UserPoolLambdaConfig> lambdaConfig;

    /**
     * @return Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    public Output<Optional<UserPoolLambdaConfig>> lambdaConfig() {
        return Codegen.optional(this.lambdaConfig);
    }
    /**
     * Date the user pool was last modified.
     * 
     */
    @Export(name="lastModifiedDate", type=String.class, parameters={})
    private Output<String> lastModifiedDate;

    /**
     * @return Date the user pool was last modified.
     * 
     */
    public Output<String> lastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    @Export(name="mfaConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> mfaConfiguration;

    /**
     * @return Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    public Output<Optional<String>> mfaConfiguration() {
        return Codegen.optional(this.mfaConfiguration);
    }
    /**
     * Name of the attribute.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the attribute.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    @Export(name="passwordPolicy", type=UserPoolPasswordPolicy.class, parameters={})
    private Output<UserPoolPasswordPolicy> passwordPolicy;

    /**
     * @return Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    public Output<UserPoolPasswordPolicy> passwordPolicy() {
        return this.passwordPolicy;
    }
    /**
     * Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    @Export(name="schemas", type=List.class, parameters={UserPoolSchema.class})
    private Output</* @Nullable */ List<UserPoolSchema>> schemas;

    /**
     * @return Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    public Output<Optional<List<UserPoolSchema>>> schemas() {
        return Codegen.optional(this.schemas);
    }
    /**
     * String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    @Export(name="smsAuthenticationMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> smsAuthenticationMessage;

    /**
     * @return String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    public Output<Optional<String>> smsAuthenticationMessage() {
        return Codegen.optional(this.smsAuthenticationMessage);
    }
    /**
     * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    @Export(name="smsConfiguration", type=UserPoolSmsConfiguration.class, parameters={})
    private Output<UserPoolSmsConfiguration> smsConfiguration;

    /**
     * @return Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    public Output<UserPoolSmsConfiguration> smsConfiguration() {
        return this.smsConfiguration;
    }
    /**
     * String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    @Export(name="smsVerificationMessage", type=String.class, parameters={})
    private Output<String> smsVerificationMessage;

    /**
     * @return String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    public Output<String> smsVerificationMessage() {
        return this.smsVerificationMessage;
    }
    /**
     * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    @Export(name="softwareTokenMfaConfiguration", type=UserPoolSoftwareTokenMfaConfiguration.class, parameters={})
    private Output</* @Nullable */ UserPoolSoftwareTokenMfaConfiguration> softwareTokenMfaConfiguration;

    /**
     * @return Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    public Output<Optional<UserPoolSoftwareTokenMfaConfiguration>> softwareTokenMfaConfiguration() {
        return Codegen.optional(this.softwareTokenMfaConfiguration);
    }
    /**
     * Map of tags to assign to the User Pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the User Pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for user attribute update settings. Detailed below.
     * 
     */
    @Export(name="userAttributeUpdateSettings", type=UserPoolUserAttributeUpdateSettings.class, parameters={})
    private Output</* @Nullable */ UserPoolUserAttributeUpdateSettings> userAttributeUpdateSettings;

    /**
     * @return Configuration block for user attribute update settings. Detailed below.
     * 
     */
    public Output<Optional<UserPoolUserAttributeUpdateSettings>> userAttributeUpdateSettings() {
        return Codegen.optional(this.userAttributeUpdateSettings);
    }
    /**
     * Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    @Export(name="userPoolAddOns", type=UserPoolUserPoolAddOns.class, parameters={})
    private Output</* @Nullable */ UserPoolUserPoolAddOns> userPoolAddOns;

    /**
     * @return Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    public Output<Optional<UserPoolUserPoolAddOns>> userPoolAddOns() {
        return Codegen.optional(this.userPoolAddOns);
    }
    /**
     * Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    @Export(name="usernameAttributes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> usernameAttributes;

    /**
     * @return Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    public Output<Optional<List<String>>> usernameAttributes() {
        return Codegen.optional(this.usernameAttributes);
    }
    /**
     * Configuration block for username configuration. Detailed below.
     * 
     */
    @Export(name="usernameConfiguration", type=UserPoolUsernameConfiguration.class, parameters={})
    private Output</* @Nullable */ UserPoolUsernameConfiguration> usernameConfiguration;

    /**
     * @return Configuration block for username configuration. Detailed below.
     * 
     */
    public Output<Optional<UserPoolUsernameConfiguration>> usernameConfiguration() {
        return Codegen.optional(this.usernameConfiguration);
    }
    /**
     * Configuration block for verification message templates. Detailed below.
     * 
     */
    @Export(name="verificationMessageTemplate", type=UserPoolVerificationMessageTemplate.class, parameters={})
    private Output<UserPoolVerificationMessageTemplate> verificationMessageTemplate;

    /**
     * @return Configuration block for verification message templates. Detailed below.
     * 
     */
    public Output<UserPoolVerificationMessageTemplate> verificationMessageTemplate() {
        return this.verificationMessageTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPool(String name) {
        this(name, UserPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPool(String name, @Nullable UserPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPool(String name, @Nullable UserPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPool:UserPool", name, args == null ? UserPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPool(String name, Output<String> id, @Nullable UserPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPool:UserPool", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserPool get(String name, Output<String> id, @Nullable UserPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPool(name, id, state, options);
    }
}