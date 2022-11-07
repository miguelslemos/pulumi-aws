// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The IAM Group name to attach the list of `users` to
     * 
     */
    @Import(name="group", required=true)
    private Output<String> group;

    /**
     * @return The IAM Group name to attach the list of `users` to
     * 
     */
    public Output<String> group() {
        return this.group;
    }

    /**
     * The name to identify the Group Membership
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to identify the Group Membership
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of IAM User names to associate with the Group
     * 
     */
    @Import(name="users", required=true)
    private Output<List<String>> users;

    /**
     * @return A list of IAM User names to associate with the Group
     * 
     */
    public Output<List<String>> users() {
        return this.users;
    }

    private GroupMembershipArgs() {}

    private GroupMembershipArgs(GroupMembershipArgs $) {
        this.group = $.group;
        this.name = $.name;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMembershipArgs $;

        public Builder() {
            $ = new GroupMembershipArgs();
        }

        public Builder(GroupMembershipArgs defaults) {
            $ = new GroupMembershipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The IAM Group name to attach the list of `users` to
         * 
         * @return builder
         * 
         */
        public Builder group(Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The IAM Group name to attach the list of `users` to
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param name The name to identify the Group Membership
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to identify the Group Membership
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param users A list of IAM User names to associate with the Group
         * 
         * @return builder
         * 
         */
        public Builder users(Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users A list of IAM User names to associate with the Group
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users A list of IAM User names to associate with the Group
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public GroupMembershipArgs build() {
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            $.users = Objects.requireNonNull($.users, "expected parameter 'users' to be non-null");
            return $;
        }
    }

}