// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.GetQuerySuggestionsBlockListSourceS3Path;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetQuerySuggestionsBlockListResult {
    /**
     * @return ARN of the block list.
     * 
     */
    private String arn;
    /**
     * @return Date-time a block list was created.
     * 
     */
    private String createdAt;
    /**
     * @return Description for the block list.
     * 
     */
    private String description;
    /**
     * @return Error message containing details if there are issues processing the block list.
     * 
     */
    private String errorMessage;
    /**
     * @return Current size of the block list text file in S3.
     * 
     */
    private Integer fileSizeBytes;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String indexId;
    /**
     * @return Current number of valid, non-empty words or phrases in the block list text file.
     * 
     */
    private Integer itemCount;
    /**
     * @return Name of the block list.
     * 
     */
    private String name;
    private String querySuggestionsBlockListId;
    /**
     * @return ARN of a role with permission to access the S3 bucket that contains the block list. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    private String roleArn;
    /**
     * @return S3 location of the block list input data. Detailed below.
     * 
     */
    private List<GetQuerySuggestionsBlockListSourceS3Path> sourceS3Paths;
    /**
     * @return Current status of the block list. When the value is `ACTIVE`, the block list is ready for use.
     * 
     */
    private String status;
    /**
     * @return Metadata that helps organize the block list you create.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Date and time that the block list was last updated.
     * 
     */
    private String updatedAt;

    private GetQuerySuggestionsBlockListResult() {}
    /**
     * @return ARN of the block list.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Date-time a block list was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Description for the block list.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Error message containing details if there are issues processing the block list.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return Current size of the block list text file in S3.
     * 
     */
    public Integer fileSizeBytes() {
        return this.fileSizeBytes;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String indexId() {
        return this.indexId;
    }
    /**
     * @return Current number of valid, non-empty words or phrases in the block list text file.
     * 
     */
    public Integer itemCount() {
        return this.itemCount;
    }
    /**
     * @return Name of the block list.
     * 
     */
    public String name() {
        return this.name;
    }
    public String querySuggestionsBlockListId() {
        return this.querySuggestionsBlockListId;
    }
    /**
     * @return ARN of a role with permission to access the S3 bucket that contains the block list. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return S3 location of the block list input data. Detailed below.
     * 
     */
    public List<GetQuerySuggestionsBlockListSourceS3Path> sourceS3Paths() {
        return this.sourceS3Paths;
    }
    /**
     * @return Current status of the block list. When the value is `ACTIVE`, the block list is ready for use.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Metadata that helps organize the block list you create.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Date and time that the block list was last updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuerySuggestionsBlockListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String createdAt;
        private String description;
        private String errorMessage;
        private Integer fileSizeBytes;
        private String id;
        private String indexId;
        private Integer itemCount;
        private String name;
        private String querySuggestionsBlockListId;
        private String roleArn;
        private List<GetQuerySuggestionsBlockListSourceS3Path> sourceS3Paths;
        private String status;
        private Map<String,String> tags;
        private String updatedAt;
        public Builder() {}
        public Builder(GetQuerySuggestionsBlockListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.errorMessage = defaults.errorMessage;
    	      this.fileSizeBytes = defaults.fileSizeBytes;
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
    	      this.itemCount = defaults.itemCount;
    	      this.name = defaults.name;
    	      this.querySuggestionsBlockListId = defaults.querySuggestionsBlockListId;
    	      this.roleArn = defaults.roleArn;
    	      this.sourceS3Paths = defaults.sourceS3Paths;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        @CustomType.Setter
        public Builder fileSizeBytes(Integer fileSizeBytes) {
            this.fileSizeBytes = Objects.requireNonNull(fileSizeBytes);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder indexId(String indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }
        @CustomType.Setter
        public Builder itemCount(Integer itemCount) {
            this.itemCount = Objects.requireNonNull(itemCount);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder querySuggestionsBlockListId(String querySuggestionsBlockListId) {
            this.querySuggestionsBlockListId = Objects.requireNonNull(querySuggestionsBlockListId);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder sourceS3Paths(List<GetQuerySuggestionsBlockListSourceS3Path> sourceS3Paths) {
            this.sourceS3Paths = Objects.requireNonNull(sourceS3Paths);
            return this;
        }
        public Builder sourceS3Paths(GetQuerySuggestionsBlockListSourceS3Path... sourceS3Paths) {
            return sourceS3Paths(List.of(sourceS3Paths));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetQuerySuggestionsBlockListResult build() {
            final var o = new GetQuerySuggestionsBlockListResult();
            o.arn = arn;
            o.createdAt = createdAt;
            o.description = description;
            o.errorMessage = errorMessage;
            o.fileSizeBytes = fileSizeBytes;
            o.id = id;
            o.indexId = indexId;
            o.itemCount = itemCount;
            o.name = name;
            o.querySuggestionsBlockListId = querySuggestionsBlockListId;
            o.roleArn = roleArn;
            o.sourceS3Paths = sourceS3Paths;
            o.status = status;
            o.tags = tags;
            o.updatedAt = updatedAt;
            return o;
        }
    }
}