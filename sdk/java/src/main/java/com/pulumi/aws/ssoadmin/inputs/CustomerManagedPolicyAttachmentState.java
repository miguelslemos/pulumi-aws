// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin.inputs;

import com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerManagedPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final CustomerManagedPolicyAttachmentState Empty = new CustomerManagedPolicyAttachmentState();

    /**
     * Specifies the name and path of a customer managed policy. See below.
     * 
     */
    @Import(name="customerManagedPolicyReference")
    private @Nullable Output<CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs> customerManagedPolicyReference;

    /**
     * @return Specifies the name and path of a customer managed policy. See below.
     * 
     */
    public Optional<Output<CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs>> customerManagedPolicyReference() {
        return Optional.ofNullable(this.customerManagedPolicyReference);
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn")
    private @Nullable Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Optional<Output<String>> instanceArn() {
        return Optional.ofNullable(this.instanceArn);
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Import(name="permissionSetArn")
    private @Nullable Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Optional<Output<String>> permissionSetArn() {
        return Optional.ofNullable(this.permissionSetArn);
    }

    private CustomerManagedPolicyAttachmentState() {}

    private CustomerManagedPolicyAttachmentState(CustomerManagedPolicyAttachmentState $) {
        this.customerManagedPolicyReference = $.customerManagedPolicyReference;
        this.instanceArn = $.instanceArn;
        this.permissionSetArn = $.permissionSetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerManagedPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerManagedPolicyAttachmentState $;

        public Builder() {
            $ = new CustomerManagedPolicyAttachmentState();
        }

        public Builder(CustomerManagedPolicyAttachmentState defaults) {
            $ = new CustomerManagedPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedPolicyReference(@Nullable Output<CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs> customerManagedPolicyReference) {
            $.customerManagedPolicyReference = customerManagedPolicyReference;
            return this;
        }

        /**
         * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedPolicyReference(CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs customerManagedPolicyReference) {
            return customerManagedPolicyReference(Output.of(customerManagedPolicyReference));
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(@Nullable Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(@Nullable Output<String> permissionSetArn) {
            $.permissionSetArn = permissionSetArn;
            return this;
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(String permissionSetArn) {
            return permissionSetArn(Output.of(permissionSetArn));
        }

        public CustomerManagedPolicyAttachmentState build() {
            return $;
        }
    }

}