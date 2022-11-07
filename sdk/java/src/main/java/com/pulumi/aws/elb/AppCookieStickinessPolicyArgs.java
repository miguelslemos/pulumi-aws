// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCookieStickinessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppCookieStickinessPolicyArgs Empty = new AppCookieStickinessPolicyArgs();

    /**
     * Application cookie whose lifetime the ELB&#39;s cookie should follow.
     * 
     */
    @Import(name="cookieName", required=true)
    private Output<String> cookieName;

    /**
     * @return Application cookie whose lifetime the ELB&#39;s cookie should follow.
     * 
     */
    public Output<String> cookieName() {
        return this.cookieName;
    }

    /**
     * Load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Import(name="lbPort", required=true)
    private Output<Integer> lbPort;

    /**
     * @return Load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    public Output<Integer> lbPort() {
        return this.lbPort;
    }

    /**
     * Name of load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer", required=true)
    private Output<String> loadBalancer;

    /**
     * @return Name of load balancer to which the policy
     * should be attached.
     * 
     */
    public Output<String> loadBalancer() {
        return this.loadBalancer;
    }

    /**
     * Name of the stickiness policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the stickiness policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AppCookieStickinessPolicyArgs() {}

    private AppCookieStickinessPolicyArgs(AppCookieStickinessPolicyArgs $) {
        this.cookieName = $.cookieName;
        this.lbPort = $.lbPort;
        this.loadBalancer = $.loadBalancer;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCookieStickinessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCookieStickinessPolicyArgs $;

        public Builder() {
            $ = new AppCookieStickinessPolicyArgs();
        }

        public Builder(AppCookieStickinessPolicyArgs defaults) {
            $ = new AppCookieStickinessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookieName Application cookie whose lifetime the ELB&#39;s cookie should follow.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        /**
         * @param cookieName Application cookie whose lifetime the ELB&#39;s cookie should follow.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        /**
         * @param lbPort Load balancer port to which the policy
         * should be applied. This must be an active listener on the load
         * balancer.
         * 
         * @return builder
         * 
         */
        public Builder lbPort(Output<Integer> lbPort) {
            $.lbPort = lbPort;
            return this;
        }

        /**
         * @param lbPort Load balancer port to which the policy
         * should be applied. This must be an active listener on the load
         * balancer.
         * 
         * @return builder
         * 
         */
        public Builder lbPort(Integer lbPort) {
            return lbPort(Output.of(lbPort));
        }

        /**
         * @param loadBalancer Name of load balancer to which the policy
         * should be attached.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(Output<String> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer Name of load balancer to which the policy
         * should be attached.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(String loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param name Name of the stickiness policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the stickiness policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AppCookieStickinessPolicyArgs build() {
            $.cookieName = Objects.requireNonNull($.cookieName, "expected parameter 'cookieName' to be non-null");
            $.lbPort = Objects.requireNonNull($.lbPort, "expected parameter 'lbPort' to be non-null");
            $.loadBalancer = Objects.requireNonNull($.loadBalancer, "expected parameter 'loadBalancer' to be non-null");
            return $;
        }
    }

}