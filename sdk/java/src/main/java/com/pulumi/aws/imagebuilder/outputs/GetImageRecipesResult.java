// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetImageRecipesFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageRecipesResult {
    /**
     * @return Set of ARNs of the matched Image Builder Image Recipes.
     * 
     */
    private List<String> arns;
    private @Nullable List<GetImageRecipesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set of names of the matched Image Builder Image Recipes.
     * 
     */
    private List<String> names;
    private @Nullable String owner;

    private GetImageRecipesResult() {}
    /**
     * @return Set of ARNs of the matched Image Builder Image Recipes.
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    public List<GetImageRecipesFilter> filters() {
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
     * @return Set of names of the matched Image Builder Image Recipes.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetImageRecipesFilter> filters;
        private String id;
        private List<String> names;
        private @Nullable String owner;
        public Builder() {}
        public Builder(GetImageRecipesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.owner = defaults.owner;
        }

        @CustomType.Setter
        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetImageRecipesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetImageRecipesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public GetImageRecipesResult build() {
            final var o = new GetImageRecipesResult();
            o.arns = arns;
            o.filters = filters;
            o.id = id;
            o.names = names;
            o.owner = owner;
            return o;
        }
    }
}