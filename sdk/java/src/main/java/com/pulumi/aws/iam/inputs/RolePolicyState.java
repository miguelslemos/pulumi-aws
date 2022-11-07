// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RolePolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RolePolicyState Empty = new RolePolicyState();

    /**
     * The name of the role policy. If omitted, this provider will
     * assign a random, unique name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the role policy. If omitted, this provider will
     * assign a random, unique name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The name of the IAM role to attach to the policy.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The name of the IAM role to attach to the policy.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private RolePolicyState() {}

    private RolePolicyState(RolePolicyState $) {
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.policy = $.policy;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolePolicyState $;

        public Builder() {
            $ = new RolePolicyState();
        }

        public Builder(RolePolicyState defaults) {
            $ = new RolePolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the role policy. If omitted, this provider will
         * assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the role policy. If omitted, this provider will
         * assign a random, unique name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified
         * prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified
         * prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param policy The policy document. This is a JSON formatted string.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The policy document. This is a JSON formatted string.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param role The name of the IAM role to attach to the policy.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The name of the IAM role to attach to the policy.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public RolePolicyState build() {
            return $;
        }
    }

}