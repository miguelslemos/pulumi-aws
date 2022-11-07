// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.aws.codebuild.outputs.ProjectSourceAuth;
import com.pulumi.aws.codebuild.outputs.ProjectSourceBuildStatusConfig;
import com.pulumi.aws.codebuild.outputs.ProjectSourceGitSubmodulesConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectSource {
    /**
     * @return Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console&#39;s use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    private @Nullable ProjectSourceAuth auth;
    /**
     * @return Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    private @Nullable ProjectSourceBuildStatusConfig buildStatusConfig;
    /**
     * @return Build specification to use for this build project&#39;s related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    private @Nullable String buildspec;
    /**
     * @return Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    private @Nullable Integer gitCloneDepth;
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    private @Nullable ProjectSourceGitSubmodulesConfig gitSubmodulesConfig;
    /**
     * @return Ignore SSL warnings when connecting to source control.
     * 
     */
    private @Nullable Boolean insecureSsl;
    /**
     * @return Location of the source code from git or s3.
     * 
     */
    private @Nullable String location;
    /**
     * @return Whether to report the status of a build&#39;s start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    private @Nullable Boolean reportBuildStatus;
    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    private String type;

    private ProjectSource() {}
    /**
     * @return Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console&#39;s use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Optional<ProjectSourceAuth> auth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * @return Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    public Optional<ProjectSourceBuildStatusConfig> buildStatusConfig() {
        return Optional.ofNullable(this.buildStatusConfig);
    }
    /**
     * @return Build specification to use for this build project&#39;s related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    public Optional<String> buildspec() {
        return Optional.ofNullable(this.buildspec);
    }
    /**
     * @return Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    public Optional<Integer> gitCloneDepth() {
        return Optional.ofNullable(this.gitCloneDepth);
    }
    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<ProjectSourceGitSubmodulesConfig> gitSubmodulesConfig() {
        return Optional.ofNullable(this.gitSubmodulesConfig);
    }
    /**
     * @return Ignore SSL warnings when connecting to source control.
     * 
     */
    public Optional<Boolean> insecureSsl() {
        return Optional.ofNullable(this.insecureSsl);
    }
    /**
     * @return Location of the source code from git or s3.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Whether to report the status of a build&#39;s start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    public Optional<Boolean> reportBuildStatus() {
        return Optional.ofNullable(this.reportBuildStatus);
    }
    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ProjectSourceAuth auth;
        private @Nullable ProjectSourceBuildStatusConfig buildStatusConfig;
        private @Nullable String buildspec;
        private @Nullable Integer gitCloneDepth;
        private @Nullable ProjectSourceGitSubmodulesConfig gitSubmodulesConfig;
        private @Nullable Boolean insecureSsl;
        private @Nullable String location;
        private @Nullable Boolean reportBuildStatus;
        private String type;
        public Builder() {}
        public Builder(ProjectSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.buildStatusConfig = defaults.buildStatusConfig;
    	      this.buildspec = defaults.buildspec;
    	      this.gitCloneDepth = defaults.gitCloneDepth;
    	      this.gitSubmodulesConfig = defaults.gitSubmodulesConfig;
    	      this.insecureSsl = defaults.insecureSsl;
    	      this.location = defaults.location;
    	      this.reportBuildStatus = defaults.reportBuildStatus;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder auth(@Nullable ProjectSourceAuth auth) {
            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder buildStatusConfig(@Nullable ProjectSourceBuildStatusConfig buildStatusConfig) {
            this.buildStatusConfig = buildStatusConfig;
            return this;
        }
        @CustomType.Setter
        public Builder buildspec(@Nullable String buildspec) {
            this.buildspec = buildspec;
            return this;
        }
        @CustomType.Setter
        public Builder gitCloneDepth(@Nullable Integer gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }
        @CustomType.Setter
        public Builder gitSubmodulesConfig(@Nullable ProjectSourceGitSubmodulesConfig gitSubmodulesConfig) {
            this.gitSubmodulesConfig = gitSubmodulesConfig;
            return this;
        }
        @CustomType.Setter
        public Builder insecureSsl(@Nullable Boolean insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder reportBuildStatus(@Nullable Boolean reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectSource build() {
            final var o = new ProjectSource();
            o.auth = auth;
            o.buildStatusConfig = buildStatusConfig;
            o.buildspec = buildspec;
            o.gitCloneDepth = gitCloneDepth;
            o.gitSubmodulesConfig = gitSubmodulesConfig;
            o.insecureSsl = insecureSsl;
            o.location = location;
            o.reportBuildStatus = reportBuildStatus;
            o.type = type;
            return o;
        }
    }
}