// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkmanager.NewAttachmentAccepter(ctx, "test", &networkmanager.AttachmentAccepterArgs{
//				AttachmentId:   pulumi.Any(aws_networkmanager_vpc_attachment.Vpc.Id),
//				AttachmentType: pulumi.Any(aws_networkmanager_vpc_attachment.Vpc.Attachment_type),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AttachmentAccepter struct {
	pulumi.CustomResourceState

	// The ID of the attachment.
	AttachmentId pulumi.StringOutput `pulumi:"attachmentId"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntOutput `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
	AttachmentType pulumi.StringOutput `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringOutput `pulumi:"coreNetworkArn"`
	// The id of a core network.
	CoreNetworkId pulumi.StringOutput `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation pulumi.StringOutput `pulumi:"edgeLocation"`
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringOutput `pulumi:"ownerAccountId"`
	// The attachment resource ARN.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
	// The name of the segment attachment.
	SegmentName pulumi.StringOutput `pulumi:"segmentName"`
	// The state of the attachment.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewAttachmentAccepter registers a new resource with the given unique name, arguments, and options.
func NewAttachmentAccepter(ctx *pulumi.Context,
	name string, args *AttachmentAccepterArgs, opts ...pulumi.ResourceOption) (*AttachmentAccepter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AttachmentId == nil {
		return nil, errors.New("invalid value for required argument 'AttachmentId'")
	}
	if args.AttachmentType == nil {
		return nil, errors.New("invalid value for required argument 'AttachmentType'")
	}
	var resource AttachmentAccepter
	err := ctx.RegisterResource("aws:networkmanager/attachmentAccepter:AttachmentAccepter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAttachmentAccepter gets an existing AttachmentAccepter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAttachmentAccepter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AttachmentAccepterState, opts ...pulumi.ResourceOption) (*AttachmentAccepter, error) {
	var resource AttachmentAccepter
	err := ctx.ReadResource("aws:networkmanager/attachmentAccepter:AttachmentAccepter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AttachmentAccepter resources.
type attachmentAccepterState struct {
	// The ID of the attachment.
	AttachmentId *string `pulumi:"attachmentId"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber *int `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
	AttachmentType *string `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn *string `pulumi:"coreNetworkArn"`
	// The id of a core network.
	CoreNetworkId *string `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation *string `pulumi:"edgeLocation"`
	// The ID of the attachment account owner.
	OwnerAccountId *string `pulumi:"ownerAccountId"`
	// The attachment resource ARN.
	ResourceArn *string `pulumi:"resourceArn"`
	// The name of the segment attachment.
	SegmentName *string `pulumi:"segmentName"`
	// The state of the attachment.
	State *string `pulumi:"state"`
}

type AttachmentAccepterState struct {
	// The ID of the attachment.
	AttachmentId pulumi.StringPtrInput
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntPtrInput
	// The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
	AttachmentType pulumi.StringPtrInput
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringPtrInput
	// The id of a core network.
	CoreNetworkId pulumi.StringPtrInput
	// The Region where the edge is located.
	EdgeLocation pulumi.StringPtrInput
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringPtrInput
	// The attachment resource ARN.
	ResourceArn pulumi.StringPtrInput
	// The name of the segment attachment.
	SegmentName pulumi.StringPtrInput
	// The state of the attachment.
	State pulumi.StringPtrInput
}

func (AttachmentAccepterState) ElementType() reflect.Type {
	return reflect.TypeOf((*attachmentAccepterState)(nil)).Elem()
}

type attachmentAccepterArgs struct {
	// The ID of the attachment.
	AttachmentId string `pulumi:"attachmentId"`
	// The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
	AttachmentType string `pulumi:"attachmentType"`
}

// The set of arguments for constructing a AttachmentAccepter resource.
type AttachmentAccepterArgs struct {
	// The ID of the attachment.
	AttachmentId pulumi.StringInput
	// The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
	AttachmentType pulumi.StringInput
}

func (AttachmentAccepterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*attachmentAccepterArgs)(nil)).Elem()
}

type AttachmentAccepterInput interface {
	pulumi.Input

	ToAttachmentAccepterOutput() AttachmentAccepterOutput
	ToAttachmentAccepterOutputWithContext(ctx context.Context) AttachmentAccepterOutput
}

func (*AttachmentAccepter) ElementType() reflect.Type {
	return reflect.TypeOf((**AttachmentAccepter)(nil)).Elem()
}

func (i *AttachmentAccepter) ToAttachmentAccepterOutput() AttachmentAccepterOutput {
	return i.ToAttachmentAccepterOutputWithContext(context.Background())
}

func (i *AttachmentAccepter) ToAttachmentAccepterOutputWithContext(ctx context.Context) AttachmentAccepterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachmentAccepterOutput)
}

// AttachmentAccepterArrayInput is an input type that accepts AttachmentAccepterArray and AttachmentAccepterArrayOutput values.
// You can construct a concrete instance of `AttachmentAccepterArrayInput` via:
//
//	AttachmentAccepterArray{ AttachmentAccepterArgs{...} }
type AttachmentAccepterArrayInput interface {
	pulumi.Input

	ToAttachmentAccepterArrayOutput() AttachmentAccepterArrayOutput
	ToAttachmentAccepterArrayOutputWithContext(context.Context) AttachmentAccepterArrayOutput
}

type AttachmentAccepterArray []AttachmentAccepterInput

func (AttachmentAccepterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AttachmentAccepter)(nil)).Elem()
}

func (i AttachmentAccepterArray) ToAttachmentAccepterArrayOutput() AttachmentAccepterArrayOutput {
	return i.ToAttachmentAccepterArrayOutputWithContext(context.Background())
}

func (i AttachmentAccepterArray) ToAttachmentAccepterArrayOutputWithContext(ctx context.Context) AttachmentAccepterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachmentAccepterArrayOutput)
}

// AttachmentAccepterMapInput is an input type that accepts AttachmentAccepterMap and AttachmentAccepterMapOutput values.
// You can construct a concrete instance of `AttachmentAccepterMapInput` via:
//
//	AttachmentAccepterMap{ "key": AttachmentAccepterArgs{...} }
type AttachmentAccepterMapInput interface {
	pulumi.Input

	ToAttachmentAccepterMapOutput() AttachmentAccepterMapOutput
	ToAttachmentAccepterMapOutputWithContext(context.Context) AttachmentAccepterMapOutput
}

type AttachmentAccepterMap map[string]AttachmentAccepterInput

func (AttachmentAccepterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AttachmentAccepter)(nil)).Elem()
}

func (i AttachmentAccepterMap) ToAttachmentAccepterMapOutput() AttachmentAccepterMapOutput {
	return i.ToAttachmentAccepterMapOutputWithContext(context.Background())
}

func (i AttachmentAccepterMap) ToAttachmentAccepterMapOutputWithContext(ctx context.Context) AttachmentAccepterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachmentAccepterMapOutput)
}

type AttachmentAccepterOutput struct{ *pulumi.OutputState }

func (AttachmentAccepterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AttachmentAccepter)(nil)).Elem()
}

func (o AttachmentAccepterOutput) ToAttachmentAccepterOutput() AttachmentAccepterOutput {
	return o
}

func (o AttachmentAccepterOutput) ToAttachmentAccepterOutputWithContext(ctx context.Context) AttachmentAccepterOutput {
	return o
}

// The ID of the attachment.
func (o AttachmentAccepterOutput) AttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.AttachmentId }).(pulumi.StringOutput)
}

// The policy rule number associated with the attachment.
func (o AttachmentAccepterOutput) AttachmentPolicyRuleNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.IntOutput { return v.AttachmentPolicyRuleNumber }).(pulumi.IntOutput)
}

// The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
func (o AttachmentAccepterOutput) AttachmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.AttachmentType }).(pulumi.StringOutput)
}

// The ARN of a core network.
func (o AttachmentAccepterOutput) CoreNetworkArn() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.CoreNetworkArn }).(pulumi.StringOutput)
}

// The id of a core network.
func (o AttachmentAccepterOutput) CoreNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.CoreNetworkId }).(pulumi.StringOutput)
}

// The Region where the edge is located.
func (o AttachmentAccepterOutput) EdgeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.EdgeLocation }).(pulumi.StringOutput)
}

// The ID of the attachment account owner.
func (o AttachmentAccepterOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The attachment resource ARN.
func (o AttachmentAccepterOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The name of the segment attachment.
func (o AttachmentAccepterOutput) SegmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.SegmentName }).(pulumi.StringOutput)
}

// The state of the attachment.
func (o AttachmentAccepterOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachmentAccepter) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type AttachmentAccepterArrayOutput struct{ *pulumi.OutputState }

func (AttachmentAccepterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AttachmentAccepter)(nil)).Elem()
}

func (o AttachmentAccepterArrayOutput) ToAttachmentAccepterArrayOutput() AttachmentAccepterArrayOutput {
	return o
}

func (o AttachmentAccepterArrayOutput) ToAttachmentAccepterArrayOutputWithContext(ctx context.Context) AttachmentAccepterArrayOutput {
	return o
}

func (o AttachmentAccepterArrayOutput) Index(i pulumi.IntInput) AttachmentAccepterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AttachmentAccepter {
		return vs[0].([]*AttachmentAccepter)[vs[1].(int)]
	}).(AttachmentAccepterOutput)
}

type AttachmentAccepterMapOutput struct{ *pulumi.OutputState }

func (AttachmentAccepterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AttachmentAccepter)(nil)).Elem()
}

func (o AttachmentAccepterMapOutput) ToAttachmentAccepterMapOutput() AttachmentAccepterMapOutput {
	return o
}

func (o AttachmentAccepterMapOutput) ToAttachmentAccepterMapOutputWithContext(ctx context.Context) AttachmentAccepterMapOutput {
	return o
}

func (o AttachmentAccepterMapOutput) MapIndex(k pulumi.StringInput) AttachmentAccepterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AttachmentAccepter {
		return vs[0].(map[string]*AttachmentAccepter)[vs[1].(string)]
	}).(AttachmentAccepterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AttachmentAccepterInput)(nil)).Elem(), &AttachmentAccepter{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttachmentAccepterArrayInput)(nil)).Elem(), AttachmentAccepterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttachmentAccepterMapInput)(nil)).Elem(), AttachmentAccepterMap{})
	pulumi.RegisterOutputType(AttachmentAccepterOutput{})
	pulumi.RegisterOutputType(AttachmentAccepterArrayOutput{})
	pulumi.RegisterOutputType(AttachmentAccepterMapOutput{})
}