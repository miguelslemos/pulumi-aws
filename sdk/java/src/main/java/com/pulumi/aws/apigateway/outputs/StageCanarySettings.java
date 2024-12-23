// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StageCanarySettings {
    /**
     * @return ID of the deployment that the canary points to.
     * 
     */
    private String deploymentId;
    /**
     * @return Percent `0.0` - `100.0` of traffic to divert to the canary deployment.
     * 
     */
    private @Nullable Double percentTraffic;
    /**
     * @return Map of overridden stage `variables` (including new variables) for the canary deployment.
     * 
     */
    private @Nullable Map<String,String> stageVariableOverrides;
    /**
     * @return Whether the canary deployment uses the stage cache. Defaults to false.
     * 
     */
    private @Nullable Boolean useStageCache;

    private StageCanarySettings() {}
    /**
     * @return ID of the deployment that the canary points to.
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }
    /**
     * @return Percent `0.0` - `100.0` of traffic to divert to the canary deployment.
     * 
     */
    public Optional<Double> percentTraffic() {
        return Optional.ofNullable(this.percentTraffic);
    }
    /**
     * @return Map of overridden stage `variables` (including new variables) for the canary deployment.
     * 
     */
    public Map<String,String> stageVariableOverrides() {
        return this.stageVariableOverrides == null ? Map.of() : this.stageVariableOverrides;
    }
    /**
     * @return Whether the canary deployment uses the stage cache. Defaults to false.
     * 
     */
    public Optional<Boolean> useStageCache() {
        return Optional.ofNullable(this.useStageCache);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageCanarySettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deploymentId;
        private @Nullable Double percentTraffic;
        private @Nullable Map<String,String> stageVariableOverrides;
        private @Nullable Boolean useStageCache;
        public Builder() {}
        public Builder(StageCanarySettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        @CustomType.Setter
        public Builder deploymentId(String deploymentId) {
            if (deploymentId == null) {
              throw new MissingRequiredPropertyException("StageCanarySettings", "deploymentId");
            }
            this.deploymentId = deploymentId;
            return this;
        }
        @CustomType.Setter
        public Builder percentTraffic(@Nullable Double percentTraffic) {

            this.percentTraffic = percentTraffic;
            return this;
        }
        @CustomType.Setter
        public Builder stageVariableOverrides(@Nullable Map<String,String> stageVariableOverrides) {

            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }
        @CustomType.Setter
        public Builder useStageCache(@Nullable Boolean useStageCache) {

            this.useStageCache = useStageCache;
            return this;
        }
        public StageCanarySettings build() {
            final var _resultValue = new StageCanarySettings();
            _resultValue.deploymentId = deploymentId;
            _resultValue.percentTraffic = percentTraffic;
            _resultValue.stageVariableOverrides = stageVariableOverrides;
            _resultValue.useStageCache = useStageCache;
            return _resultValue;
        }
    }
}
