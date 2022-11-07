// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GameServerGroupInstanceDefinition {
    /**
     * @return An EC2 instance type.
     * 
     */
    private String instanceType;
    /**
     * @return Instance weighting that indicates how much this instance type contributes
     * to the total capacity of a game server group.
     * Instance weights are used by GameLift FleetIQ to calculate the instance type&#39;s cost per unit hour and better identify
     * the most cost-effective options.
     * 
     */
    private @Nullable String weightedCapacity;

    private GameServerGroupInstanceDefinition() {}
    /**
     * @return An EC2 instance type.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Instance weighting that indicates how much this instance type contributes
     * to the total capacity of a game server group.
     * Instance weights are used by GameLift FleetIQ to calculate the instance type&#39;s cost per unit hour and better identify
     * the most cost-effective options.
     * 
     */
    public Optional<String> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupInstanceDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceType;
        private @Nullable String weightedCapacity;
        public Builder() {}
        public Builder(GameServerGroupInstanceDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder weightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public GameServerGroupInstanceDefinition build() {
            final var o = new GameServerGroupInstanceDefinition();
            o.instanceType = instanceType;
            o.weightedCapacity = weightedCapacity;
            return o;
        }
    }
}