// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerPredicateCondition {
    /**
     * @return The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawler_name` must also be specified. Conflicts with `state`.
     * 
     */
    private @Nullable String crawlState;
    /**
     * @return The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    private @Nullable String crawlerName;
    /**
     * @return The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    private @Nullable String jobName;
    /**
     * @return A logical operator. Defaults to `EQUALS`.
     * 
     */
    private @Nullable String logicalOperator;
    /**
     * @return The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
     */
    private @Nullable String state;

    private TriggerPredicateCondition() {}
    /**
     * @return The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawler_name` must also be specified. Conflicts with `state`.
     * 
     */
    public Optional<String> crawlState() {
        return Optional.ofNullable(this.crawlState);
    }
    /**
     * @return The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    public Optional<String> crawlerName() {
        return Optional.ofNullable(this.crawlerName);
    }
    /**
     * @return The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    public Optional<String> jobName() {
        return Optional.ofNullable(this.jobName);
    }
    /**
     * @return A logical operator. Defaults to `EQUALS`.
     * 
     */
    public Optional<String> logicalOperator() {
        return Optional.ofNullable(this.logicalOperator);
    }
    /**
     * @return The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPredicateCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String crawlState;
        private @Nullable String crawlerName;
        private @Nullable String jobName;
        private @Nullable String logicalOperator;
        private @Nullable String state;
        public Builder() {}
        public Builder(TriggerPredicateCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlState = defaults.crawlState;
    	      this.crawlerName = defaults.crawlerName;
    	      this.jobName = defaults.jobName;
    	      this.logicalOperator = defaults.logicalOperator;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder crawlState(@Nullable String crawlState) {
            this.crawlState = crawlState;
            return this;
        }
        @CustomType.Setter
        public Builder crawlerName(@Nullable String crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }
        @CustomType.Setter
        public Builder jobName(@Nullable String jobName) {
            this.jobName = jobName;
            return this;
        }
        @CustomType.Setter
        public Builder logicalOperator(@Nullable String logicalOperator) {
            this.logicalOperator = logicalOperator;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public TriggerPredicateCondition build() {
            final var o = new TriggerPredicateCondition();
            o.crawlState = crawlState;
            o.crawlerName = crawlerName;
            o.jobName = jobName;
            o.logicalOperator = logicalOperator;
            o.state = state;
            return o;
        }
    }
}