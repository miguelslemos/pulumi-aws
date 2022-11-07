// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetSubnetsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSubnetsResult {
    private @Nullable List<GetSubnetsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of all the subnet ids found.
     * 
     */
    private List<String> ids;
    private Map<String,String> tags;

    private GetSubnetsResult() {}
    public List<GetSubnetsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of all the subnet ids found.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetSubnetsFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetSubnetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetSubnetsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSubnetsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetSubnetsResult build() {
            final var o = new GetSubnetsResult();
            o.filters = filters;
            o.id = id;
            o.ids = ids;
            o.tags = tags;
            return o;
        }
    }
}