// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling;

import com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs;
import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    /**
     * Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="scalableDimension", required=true)
    private Output<String> scalableDimension;

    /**
     * @return Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Output<String> scalableDimension() {
        return this.scalableDimension;
    }

    /**
     * AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="serviceNamespace", required=true)
    private Output<String> serviceNamespace;

    /**
     * @return AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Output<String> serviceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
     * 
     */
    @Import(name="stepScalingPolicyConfiguration")
    private @Nullable Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration;

    /**
     * @return Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
     * 
     */
    public Optional<Output<PolicyStepScalingPolicyConfigurationArgs>> stepScalingPolicyConfiguration() {
        return Optional.ofNullable(this.stepScalingPolicyConfiguration);
    }

    /**
     * Target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * 
     */
    @Import(name="targetTrackingScalingPolicyConfiguration")
    private @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration;

    /**
     * @return Target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * 
     */
    public Optional<Output<PolicyTargetTrackingScalingPolicyConfigurationArgs>> targetTrackingScalingPolicyConfiguration() {
        return Optional.ofNullable(this.targetTrackingScalingPolicyConfiguration);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.name = $.name;
        this.policyType = $.policyType;
        this.resourceId = $.resourceId;
        this.scalableDimension = $.scalableDimension;
        this.serviceNamespace = $.serviceNamespace;
        this.stepScalingPolicyConfiguration = $.stepScalingPolicyConfiguration;
        this.targetTrackingScalingPolicyConfiguration = $.targetTrackingScalingPolicyConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the policy. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the policy. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyType Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param resourceId Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param scalableDimension Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder scalableDimension(Output<String> scalableDimension) {
            $.scalableDimension = scalableDimension;
            return this;
        }

        /**
         * @param scalableDimension Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder scalableDimension(String scalableDimension) {
            return scalableDimension(Output.of(scalableDimension));
        }

        /**
         * @param serviceNamespace AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder serviceNamespace(Output<String> serviceNamespace) {
            $.serviceNamespace = serviceNamespace;
            return this;
        }

        /**
         * @param serviceNamespace AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder serviceNamespace(String serviceNamespace) {
            return serviceNamespace(Output.of(serviceNamespace));
        }

        /**
         * @param stepScalingPolicyConfiguration Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder stepScalingPolicyConfiguration(@Nullable Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration) {
            $.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
            return this;
        }

        /**
         * @param stepScalingPolicyConfiguration Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder stepScalingPolicyConfiguration(PolicyStepScalingPolicyConfigurationArgs stepScalingPolicyConfiguration) {
            return stepScalingPolicyConfiguration(Output.of(stepScalingPolicyConfiguration));
        }

        /**
         * @param targetTrackingScalingPolicyConfiguration Target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder targetTrackingScalingPolicyConfiguration(@Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration) {
            $.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
            return this;
        }

        /**
         * @param targetTrackingScalingPolicyConfiguration Target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
         * 
         * @return builder
         * 
         */
        public Builder targetTrackingScalingPolicyConfiguration(PolicyTargetTrackingScalingPolicyConfigurationArgs targetTrackingScalingPolicyConfiguration) {
            return targetTrackingScalingPolicyConfiguration(Output.of(targetTrackingScalingPolicyConfiguration));
        }

        public PolicyArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.scalableDimension = Objects.requireNonNull($.scalableDimension, "expected parameter 'scalableDimension' to be non-null");
            $.serviceNamespace = Objects.requireNonNull($.serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
            return $;
        }
    }

}