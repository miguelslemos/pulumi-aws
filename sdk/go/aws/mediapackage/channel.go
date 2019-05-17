// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mediapackage

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides an AWS Elemental MediaPackage Channel.
type Channel struct {
	s *pulumi.ResourceState
}

// NewChannel registers a new resource with the given unique name, arguments, and options.
func NewChannel(ctx *pulumi.Context,
	name string, args *ChannelArgs, opts ...pulumi.ResourceOpt) (*Channel, error) {
	if args == nil || args.ChannelId == nil {
		return nil, errors.New("missing required argument 'ChannelId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["channelId"] = nil
		inputs["description"] = nil
		inputs["tags"] = nil
	} else {
		inputs["channelId"] = args.ChannelId
		inputs["description"] = args.Description
		inputs["tags"] = args.Tags
	}
	inputs["arn"] = nil
	inputs["hlsIngests"] = nil
	s, err := ctx.RegisterResource("aws:mediapackage/channel:Channel", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Channel{s: s}, nil
}

// GetChannel gets an existing Channel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChannel(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ChannelState, opts ...pulumi.ResourceOpt) (*Channel, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["arn"] = state.Arn
		inputs["channelId"] = state.ChannelId
		inputs["description"] = state.Description
		inputs["hlsIngests"] = state.HlsIngests
		inputs["tags"] = state.Tags
	}
	s, err := ctx.ReadResource("aws:mediapackage/channel:Channel", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Channel{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Channel) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Channel) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The ARN of the channel
func (r *Channel) Arn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["arn"])
}

// A unique identifier describing the channel
func (r *Channel) ChannelId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["channelId"])
}

// A description of the channel
func (r *Channel) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// A single item list of HLS ingest information
func (r *Channel) HlsIngests() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["hlsIngests"])
}

// A mapping of tags to assign to the resource.
func (r *Channel) Tags() *pulumi.MapOutput {
	return (*pulumi.MapOutput)(r.s.State["tags"])
}

// Input properties used for looking up and filtering Channel resources.
type ChannelState struct {
	// The ARN of the channel
	Arn interface{}
	// A unique identifier describing the channel
	ChannelId interface{}
	// A description of the channel
	Description interface{}
	// A single item list of HLS ingest information
	HlsIngests interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}

// The set of arguments for constructing a Channel resource.
type ChannelArgs struct {
	// A unique identifier describing the channel
	ChannelId interface{}
	// A description of the channel
	Description interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}