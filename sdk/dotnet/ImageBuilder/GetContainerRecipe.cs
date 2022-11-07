// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder
{
    public static class GetContainerRecipe
    {
        /// <summary>
        /// Provides details about an Image builder Container Recipe.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.ImageBuilder.GetContainerRecipe.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:imagebuilder:us-east-1:aws:container-recipe/example/1.0.0",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContainerRecipeResult> InvokeAsync(GetContainerRecipeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetContainerRecipeResult>("aws:imagebuilder/getContainerRecipe:getContainerRecipe", args ?? new GetContainerRecipeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about an Image builder Container Recipe.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.ImageBuilder.GetContainerRecipe.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:imagebuilder:us-east-1:aws:container-recipe/example/1.0.0",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContainerRecipeResult> Invoke(GetContainerRecipeInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetContainerRecipeResult>("aws:imagebuilder/getContainerRecipe:getContainerRecipe", args ?? new GetContainerRecipeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerRecipeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the container recipe.
        /// </summary>
        [Input("arn", required: true)]
        public string Arn { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the container recipe.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetContainerRecipeArgs()
        {
        }
        public static new GetContainerRecipeArgs Empty => new GetContainerRecipeArgs();
    }

    public sealed class GetContainerRecipeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the container recipe.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the container recipe.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetContainerRecipeInvokeArgs()
        {
        }
        public static new GetContainerRecipeInvokeArgs Empty => new GetContainerRecipeInvokeArgs();
    }


    [OutputType]
    public sealed class GetContainerRecipeResult
    {
        public readonly string Arn;
        /// <summary>
        /// List of objects with components for the container recipe.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerRecipeComponentResult> Components;
        /// <summary>
        /// Type of the container.
        /// </summary>
        public readonly string ContainerType;
        /// <summary>
        /// Date the container recipe was created.
        /// </summary>
        public readonly string DateCreated;
        /// <summary>
        /// Description of the container recipe.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Dockerfile template used to build the image.
        /// </summary>
        public readonly string DockerfileTemplateData;
        /// <summary>
        /// Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
        /// </summary>
        public readonly bool Encrypted;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of objects with instance configurations for building and testing container images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerRecipeInstanceConfigurationResult> InstanceConfigurations;
        /// <summary>
        /// KMS key used to encrypt the container image.
        /// </summary>
        public readonly string KmsKeyId;
        /// <summary>
        /// Name of the container recipe.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Owner of the container recipe.
        /// </summary>
        public readonly string Owner;
        /// <summary>
        /// Base image for the container recipe.
        /// </summary>
        public readonly string ParentImage;
        /// <summary>
        /// Platform of the container recipe.
        /// </summary>
        public readonly string Platform;
        /// <summary>
        /// Key-value map of resource tags for the container recipe.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// Destination repository for the container image.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerRecipeTargetRepositoryResult> TargetRepositories;
        /// <summary>
        /// Version of the container recipe.
        /// </summary>
        public readonly string Version;
        /// <summary>
        /// Working directory used during build and test workflows.
        /// </summary>
        public readonly string WorkingDirectory;

        [OutputConstructor]
        private GetContainerRecipeResult(
            string arn,

            ImmutableArray<Outputs.GetContainerRecipeComponentResult> components,

            string containerType,

            string dateCreated,

            string description,

            string dockerfileTemplateData,

            bool encrypted,

            string id,

            ImmutableArray<Outputs.GetContainerRecipeInstanceConfigurationResult> instanceConfigurations,

            string kmsKeyId,

            string name,

            string owner,

            string parentImage,

            string platform,

            ImmutableDictionary<string, string>? tags,

            ImmutableArray<Outputs.GetContainerRecipeTargetRepositoryResult> targetRepositories,

            string version,

            string workingDirectory)
        {
            Arn = arn;
            Components = components;
            ContainerType = containerType;
            DateCreated = dateCreated;
            Description = description;
            DockerfileTemplateData = dockerfileTemplateData;
            Encrypted = encrypted;
            Id = id;
            InstanceConfigurations = instanceConfigurations;
            KmsKeyId = kmsKeyId;
            Name = name;
            Owner = owner;
            ParentImage = parentImage;
            Platform = platform;
            Tags = tags;
            TargetRepositories = targetRepositories;
            Version = version;
            WorkingDirectory = workingDirectory;
        }
    }
}