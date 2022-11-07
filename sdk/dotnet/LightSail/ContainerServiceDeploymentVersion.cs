// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LightSail
{
    /// <summary>
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.LightSail.ContainerServiceDeploymentVersion("example", new()
    ///     {
    ///         Containers = new[]
    ///         {
    ///             new Aws.LightSail.Inputs.ContainerServiceDeploymentVersionContainerArgs
    ///             {
    ///                 ContainerName = "hello-world",
    ///                 Image = "amazon/amazon-lightsail:hello-world",
    ///                 Commands = new[] {},
    ///                 Environment = 
    ///                 {
    ///                     { "MY_ENVIRONMENT_VARIABLE", "my_value" },
    ///                 },
    ///                 Ports = 
    ///                 {
    ///                     { "80", "HTTP" },
    ///                 },
    ///             },
    ///         },
    ///         PublicEndpoint = new Aws.LightSail.Inputs.ContainerServiceDeploymentVersionPublicEndpointArgs
    ///         {
    ///             ContainerName = "hello-world",
    ///             ContainerPort = 80,
    ///             HealthCheck = new Aws.LightSail.Inputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs
    ///             {
    ///                 HealthyThreshold = 2,
    ///                 UnhealthyThreshold = 2,
    ///                 TimeoutSeconds = 2,
    ///                 IntervalSeconds = 5,
    ///                 Path = "/",
    ///                 SuccessCodes = "200-499",
    ///             },
    ///         },
    ///         ServiceName = aws_lightsail_container_service.Example.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Lightsail Container Service Deployment Version can be imported using the `service_name` and `version` separated by a slash (`/`), e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion example container-service-1/1
    /// ```
    /// </summary>
    [AwsResourceType("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion")]
    public partial class ContainerServiceDeploymentVersion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
        /// </summary>
        [Output("containers")]
        public Output<ImmutableArray<Outputs.ContainerServiceDeploymentVersionContainer>> Containers { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the deployment was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
        /// </summary>
        [Output("publicEndpoint")]
        public Output<Outputs.ContainerServiceDeploymentVersionPublicEndpoint?> PublicEndpoint { get; private set; } = null!;

        /// <summary>
        /// The name for the container service.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// The current state of the container service.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The version number of the deployment.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a ContainerServiceDeploymentVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContainerServiceDeploymentVersion(string name, ContainerServiceDeploymentVersionArgs args, CustomResourceOptions? options = null)
            : base("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion", name, args ?? new ContainerServiceDeploymentVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContainerServiceDeploymentVersion(string name, Input<string> id, ContainerServiceDeploymentVersionState? state = null, CustomResourceOptions? options = null)
            : base("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ContainerServiceDeploymentVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContainerServiceDeploymentVersion Get(string name, Input<string> id, ContainerServiceDeploymentVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new ContainerServiceDeploymentVersion(name, id, state, options);
        }
    }

    public sealed class ContainerServiceDeploymentVersionArgs : global::Pulumi.ResourceArgs
    {
        [Input("containers", required: true)]
        private InputList<Inputs.ContainerServiceDeploymentVersionContainerArgs>? _containers;

        /// <summary>
        /// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
        /// </summary>
        public InputList<Inputs.ContainerServiceDeploymentVersionContainerArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.ContainerServiceDeploymentVersionContainerArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
        /// </summary>
        [Input("publicEndpoint")]
        public Input<Inputs.ContainerServiceDeploymentVersionPublicEndpointArgs>? PublicEndpoint { get; set; }

        /// <summary>
        /// The name for the container service.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public ContainerServiceDeploymentVersionArgs()
        {
        }
        public static new ContainerServiceDeploymentVersionArgs Empty => new ContainerServiceDeploymentVersionArgs();
    }

    public sealed class ContainerServiceDeploymentVersionState : global::Pulumi.ResourceArgs
    {
        [Input("containers")]
        private InputList<Inputs.ContainerServiceDeploymentVersionContainerGetArgs>? _containers;

        /// <summary>
        /// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
        /// </summary>
        public InputList<Inputs.ContainerServiceDeploymentVersionContainerGetArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.ContainerServiceDeploymentVersionContainerGetArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// The timestamp when the deployment was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
        /// </summary>
        [Input("publicEndpoint")]
        public Input<Inputs.ContainerServiceDeploymentVersionPublicEndpointGetArgs>? PublicEndpoint { get; set; }

        /// <summary>
        /// The name for the container service.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// The current state of the container service.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The version number of the deployment.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public ContainerServiceDeploymentVersionState()
        {
        }
        public static new ContainerServiceDeploymentVersionState Empty => new ContainerServiceDeploymentVersionState();
    }
}