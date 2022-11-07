// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLambdaFunctionAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLambdaFunctionAssociationArgs Empty = new GetLambdaFunctionAssociationArgs();

    /**
     * ARN of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @Import(name="functionArn", required=true)
    private Output<String> functionArn;

    /**
     * @return ARN of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    public Output<String> functionArn() {
        return this.functionArn;
    }

    /**
     * Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    private GetLambdaFunctionAssociationArgs() {}

    private GetLambdaFunctionAssociationArgs(GetLambdaFunctionAssociationArgs $) {
        this.functionArn = $.functionArn;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLambdaFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLambdaFunctionAssociationArgs $;

        public Builder() {
            $ = new GetLambdaFunctionAssociationArgs();
        }

        public Builder(GetLambdaFunctionAssociationArgs defaults) {
            $ = new GetLambdaFunctionAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionArn ARN of the Lambda Function, omitting any version or alias qualifier.
         * 
         * @return builder
         * 
         */
        public Builder functionArn(Output<String> functionArn) {
            $.functionArn = functionArn;
            return this;
        }

        /**
         * @param functionArn ARN of the Lambda Function, omitting any version or alias qualifier.
         * 
         * @return builder
         * 
         */
        public Builder functionArn(String functionArn) {
            return functionArn(Output.of(functionArn));
        }

        /**
         * @param instanceId Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public GetLambdaFunctionAssociationArgs build() {
            $.functionArn = Objects.requireNonNull($.functionArn, "expected parameter 'functionArn' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}