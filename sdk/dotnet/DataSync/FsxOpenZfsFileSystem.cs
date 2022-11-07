// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataSync
{
    /// <summary>
    /// Manages an AWS DataSync FSx OpenZfs Location.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.DataSync.FsxOpenZfsFileSystem("example", new()
    ///     {
    ///         FsxFilesystemArn = aws_fsx_openzfs_file_system.Example.Arn,
    ///         SecurityGroupArns = new[]
    ///         {
    ///             aws_security_group.Example.Arn,
    ///         },
    ///         Protocol = new Aws.DataSync.Inputs.FsxOpenZfsFileSystemProtocolArgs
    ///         {
    ///             Nfs = new Aws.DataSync.Inputs.FsxOpenZfsFileSystemProtocolNfsArgs
    ///             {
    ///                 MountOptions = new Aws.DataSync.Inputs.FsxOpenZfsFileSystemProtocolNfsMountOptionsArgs
    ///                 {
    ///                     Version = "AUTOMATIC",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_datasync_location_fsx_openzfs_file_system` can be imported by using the `DataSync-ARN#FSx-openzfs-ARN`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:123456789012:file-system/fs-08e04cd442c1bb94a
    /// ```
    /// </summary>
    [AwsResourceType("aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem")]
    public partial class FsxOpenZfsFileSystem : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DataSync Location.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The time that the FSx for openzfs location was created.
        /// </summary>
        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
        /// </summary>
        [Output("fsxFilesystemArn")]
        public Output<string> FsxFilesystemArn { get; private set; } = null!;

        /// <summary>
        /// The type of protocol that DataSync uses to access your file system. See below.
        /// </summary>
        [Output("protocol")]
        public Output<Outputs.FsxOpenZfsFileSystemProtocol> Protocol { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
        /// </summary>
        [Output("securityGroupArns")]
        public Output<ImmutableArray<string>> SecurityGroupArns { get; private set; } = null!;

        /// <summary>
        /// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
        /// </summary>
        [Output("subdirectory")]
        public Output<string> Subdirectory { get; private set; } = null!;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The URL of the FSx for openzfs location that was described.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;


        /// <summary>
        /// Create a FsxOpenZfsFileSystem resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FsxOpenZfsFileSystem(string name, FsxOpenZfsFileSystemArgs args, CustomResourceOptions? options = null)
            : base("aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem", name, args ?? new FsxOpenZfsFileSystemArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FsxOpenZfsFileSystem(string name, Input<string> id, FsxOpenZfsFileSystemState? state = null, CustomResourceOptions? options = null)
            : base("aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FsxOpenZfsFileSystem resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FsxOpenZfsFileSystem Get(string name, Input<string> id, FsxOpenZfsFileSystemState? state = null, CustomResourceOptions? options = null)
        {
            return new FsxOpenZfsFileSystem(name, id, state, options);
        }
    }

    public sealed class FsxOpenZfsFileSystemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
        /// </summary>
        [Input("fsxFilesystemArn", required: true)]
        public Input<string> FsxFilesystemArn { get; set; } = null!;

        /// <summary>
        /// The type of protocol that DataSync uses to access your file system. See below.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<Inputs.FsxOpenZfsFileSystemProtocolArgs> Protocol { get; set; } = null!;

        [Input("securityGroupArns", required: true)]
        private InputList<string>? _securityGroupArns;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
        /// </summary>
        public InputList<string> SecurityGroupArns
        {
            get => _securityGroupArns ?? (_securityGroupArns = new InputList<string>());
            set => _securityGroupArns = value;
        }

        /// <summary>
        /// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FsxOpenZfsFileSystemArgs()
        {
        }
        public static new FsxOpenZfsFileSystemArgs Empty => new FsxOpenZfsFileSystemArgs();
    }

    public sealed class FsxOpenZfsFileSystemState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DataSync Location.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The time that the FSx for openzfs location was created.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
        /// </summary>
        [Input("fsxFilesystemArn")]
        public Input<string>? FsxFilesystemArn { get; set; }

        /// <summary>
        /// The type of protocol that DataSync uses to access your file system. See below.
        /// </summary>
        [Input("protocol")]
        public Input<Inputs.FsxOpenZfsFileSystemProtocolGetArgs>? Protocol { get; set; }

        [Input("securityGroupArns")]
        private InputList<string>? _securityGroupArns;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
        /// </summary>
        public InputList<string> SecurityGroupArns
        {
            get => _securityGroupArns ?? (_securityGroupArns = new InputList<string>());
            set => _securityGroupArns = value;
        }

        /// <summary>
        /// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The URL of the FSx for openzfs location that was described.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public FsxOpenZfsFileSystemState()
        {
        }
        public static new FsxOpenZfsFileSystemState Empty => new FsxOpenZfsFileSystemState();
    }
}