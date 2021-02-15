// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudwatch

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Use the `alarm_name` to import a CloudWatch Composite Alarm. For example
//
// ```sh
//  $ pulumi import aws:cloudwatch/compositeAlarm:CompositeAlarm test my-alarm
// ```
type CompositeAlarm struct {
	pulumi.CustomResourceState

	// Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
	ActionsEnabled pulumi.BoolPtrOutput `pulumi:"actionsEnabled"`
	// The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	AlarmActions pulumi.StringArrayOutput `pulumi:"alarmActions"`
	// The description for the composite alarm.
	AlarmDescription pulumi.StringPtrOutput `pulumi:"alarmDescription"`
	// The name for the composite alarm. This name must be unique within the region.
	AlarmName pulumi.StringOutput `pulumi:"alarmName"`
	// An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
	AlarmRule pulumi.StringOutput `pulumi:"alarmRule"`
	// The ARN of the composite alarm.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	InsufficientDataActions pulumi.StringArrayOutput `pulumi:"insufficientDataActions"`
	// The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	OkActions pulumi.StringArrayOutput `pulumi:"okActions"`
	// A map of tags to associate with the alarm. Up to 50 tags are allowed.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewCompositeAlarm registers a new resource with the given unique name, arguments, and options.
func NewCompositeAlarm(ctx *pulumi.Context,
	name string, args *CompositeAlarmArgs, opts ...pulumi.ResourceOption) (*CompositeAlarm, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AlarmName == nil {
		return nil, errors.New("invalid value for required argument 'AlarmName'")
	}
	if args.AlarmRule == nil {
		return nil, errors.New("invalid value for required argument 'AlarmRule'")
	}
	var resource CompositeAlarm
	err := ctx.RegisterResource("aws:cloudwatch/compositeAlarm:CompositeAlarm", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCompositeAlarm gets an existing CompositeAlarm resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCompositeAlarm(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CompositeAlarmState, opts ...pulumi.ResourceOption) (*CompositeAlarm, error) {
	var resource CompositeAlarm
	err := ctx.ReadResource("aws:cloudwatch/compositeAlarm:CompositeAlarm", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CompositeAlarm resources.
type compositeAlarmState struct {
	// Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
	ActionsEnabled *bool `pulumi:"actionsEnabled"`
	// The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	AlarmActions []string `pulumi:"alarmActions"`
	// The description for the composite alarm.
	AlarmDescription *string `pulumi:"alarmDescription"`
	// The name for the composite alarm. This name must be unique within the region.
	AlarmName *string `pulumi:"alarmName"`
	// An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
	AlarmRule *string `pulumi:"alarmRule"`
	// The ARN of the composite alarm.
	Arn *string `pulumi:"arn"`
	// The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	InsufficientDataActions []string `pulumi:"insufficientDataActions"`
	// The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	OkActions []string `pulumi:"okActions"`
	// A map of tags to associate with the alarm. Up to 50 tags are allowed.
	Tags map[string]string `pulumi:"tags"`
}

type CompositeAlarmState struct {
	// Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
	ActionsEnabled pulumi.BoolPtrInput
	// The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	AlarmActions pulumi.StringArrayInput
	// The description for the composite alarm.
	AlarmDescription pulumi.StringPtrInput
	// The name for the composite alarm. This name must be unique within the region.
	AlarmName pulumi.StringPtrInput
	// An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
	AlarmRule pulumi.StringPtrInput
	// The ARN of the composite alarm.
	Arn pulumi.StringPtrInput
	// The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	InsufficientDataActions pulumi.StringArrayInput
	// The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	OkActions pulumi.StringArrayInput
	// A map of tags to associate with the alarm. Up to 50 tags are allowed.
	Tags pulumi.StringMapInput
}

func (CompositeAlarmState) ElementType() reflect.Type {
	return reflect.TypeOf((*compositeAlarmState)(nil)).Elem()
}

type compositeAlarmArgs struct {
	// Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
	ActionsEnabled *bool `pulumi:"actionsEnabled"`
	// The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	AlarmActions []string `pulumi:"alarmActions"`
	// The description for the composite alarm.
	AlarmDescription *string `pulumi:"alarmDescription"`
	// The name for the composite alarm. This name must be unique within the region.
	AlarmName string `pulumi:"alarmName"`
	// An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
	AlarmRule string `pulumi:"alarmRule"`
	// The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	InsufficientDataActions []string `pulumi:"insufficientDataActions"`
	// The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	OkActions []string `pulumi:"okActions"`
	// A map of tags to associate with the alarm. Up to 50 tags are allowed.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a CompositeAlarm resource.
type CompositeAlarmArgs struct {
	// Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
	ActionsEnabled pulumi.BoolPtrInput
	// The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	AlarmActions pulumi.StringArrayInput
	// The description for the composite alarm.
	AlarmDescription pulumi.StringPtrInput
	// The name for the composite alarm. This name must be unique within the region.
	AlarmName pulumi.StringInput
	// An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
	AlarmRule pulumi.StringInput
	// The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	InsufficientDataActions pulumi.StringArrayInput
	// The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
	OkActions pulumi.StringArrayInput
	// A map of tags to associate with the alarm. Up to 50 tags are allowed.
	Tags pulumi.StringMapInput
}

func (CompositeAlarmArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*compositeAlarmArgs)(nil)).Elem()
}

type CompositeAlarmInput interface {
	pulumi.Input

	ToCompositeAlarmOutput() CompositeAlarmOutput
	ToCompositeAlarmOutputWithContext(ctx context.Context) CompositeAlarmOutput
}

func (*CompositeAlarm) ElementType() reflect.Type {
	return reflect.TypeOf((*CompositeAlarm)(nil))
}

func (i *CompositeAlarm) ToCompositeAlarmOutput() CompositeAlarmOutput {
	return i.ToCompositeAlarmOutputWithContext(context.Background())
}

func (i *CompositeAlarm) ToCompositeAlarmOutputWithContext(ctx context.Context) CompositeAlarmOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CompositeAlarmOutput)
}

func (i *CompositeAlarm) ToCompositeAlarmPtrOutput() CompositeAlarmPtrOutput {
	return i.ToCompositeAlarmPtrOutputWithContext(context.Background())
}

func (i *CompositeAlarm) ToCompositeAlarmPtrOutputWithContext(ctx context.Context) CompositeAlarmPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CompositeAlarmPtrOutput)
}

type CompositeAlarmPtrInput interface {
	pulumi.Input

	ToCompositeAlarmPtrOutput() CompositeAlarmPtrOutput
	ToCompositeAlarmPtrOutputWithContext(ctx context.Context) CompositeAlarmPtrOutput
}

type compositeAlarmPtrType CompositeAlarmArgs

func (*compositeAlarmPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CompositeAlarm)(nil))
}

func (i *compositeAlarmPtrType) ToCompositeAlarmPtrOutput() CompositeAlarmPtrOutput {
	return i.ToCompositeAlarmPtrOutputWithContext(context.Background())
}

func (i *compositeAlarmPtrType) ToCompositeAlarmPtrOutputWithContext(ctx context.Context) CompositeAlarmPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CompositeAlarmPtrOutput)
}

// CompositeAlarmArrayInput is an input type that accepts CompositeAlarmArray and CompositeAlarmArrayOutput values.
// You can construct a concrete instance of `CompositeAlarmArrayInput` via:
//
//          CompositeAlarmArray{ CompositeAlarmArgs{...} }
type CompositeAlarmArrayInput interface {
	pulumi.Input

	ToCompositeAlarmArrayOutput() CompositeAlarmArrayOutput
	ToCompositeAlarmArrayOutputWithContext(context.Context) CompositeAlarmArrayOutput
}

type CompositeAlarmArray []CompositeAlarmInput

func (CompositeAlarmArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CompositeAlarm)(nil))
}

func (i CompositeAlarmArray) ToCompositeAlarmArrayOutput() CompositeAlarmArrayOutput {
	return i.ToCompositeAlarmArrayOutputWithContext(context.Background())
}

func (i CompositeAlarmArray) ToCompositeAlarmArrayOutputWithContext(ctx context.Context) CompositeAlarmArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CompositeAlarmArrayOutput)
}

// CompositeAlarmMapInput is an input type that accepts CompositeAlarmMap and CompositeAlarmMapOutput values.
// You can construct a concrete instance of `CompositeAlarmMapInput` via:
//
//          CompositeAlarmMap{ "key": CompositeAlarmArgs{...} }
type CompositeAlarmMapInput interface {
	pulumi.Input

	ToCompositeAlarmMapOutput() CompositeAlarmMapOutput
	ToCompositeAlarmMapOutputWithContext(context.Context) CompositeAlarmMapOutput
}

type CompositeAlarmMap map[string]CompositeAlarmInput

func (CompositeAlarmMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CompositeAlarm)(nil))
}

func (i CompositeAlarmMap) ToCompositeAlarmMapOutput() CompositeAlarmMapOutput {
	return i.ToCompositeAlarmMapOutputWithContext(context.Background())
}

func (i CompositeAlarmMap) ToCompositeAlarmMapOutputWithContext(ctx context.Context) CompositeAlarmMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CompositeAlarmMapOutput)
}

type CompositeAlarmOutput struct {
	*pulumi.OutputState
}

func (CompositeAlarmOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CompositeAlarm)(nil))
}

func (o CompositeAlarmOutput) ToCompositeAlarmOutput() CompositeAlarmOutput {
	return o
}

func (o CompositeAlarmOutput) ToCompositeAlarmOutputWithContext(ctx context.Context) CompositeAlarmOutput {
	return o
}

func (o CompositeAlarmOutput) ToCompositeAlarmPtrOutput() CompositeAlarmPtrOutput {
	return o.ToCompositeAlarmPtrOutputWithContext(context.Background())
}

func (o CompositeAlarmOutput) ToCompositeAlarmPtrOutputWithContext(ctx context.Context) CompositeAlarmPtrOutput {
	return o.ApplyT(func(v CompositeAlarm) *CompositeAlarm {
		return &v
	}).(CompositeAlarmPtrOutput)
}

type CompositeAlarmPtrOutput struct {
	*pulumi.OutputState
}

func (CompositeAlarmPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CompositeAlarm)(nil))
}

func (o CompositeAlarmPtrOutput) ToCompositeAlarmPtrOutput() CompositeAlarmPtrOutput {
	return o
}

func (o CompositeAlarmPtrOutput) ToCompositeAlarmPtrOutputWithContext(ctx context.Context) CompositeAlarmPtrOutput {
	return o
}

type CompositeAlarmArrayOutput struct{ *pulumi.OutputState }

func (CompositeAlarmArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CompositeAlarm)(nil))
}

func (o CompositeAlarmArrayOutput) ToCompositeAlarmArrayOutput() CompositeAlarmArrayOutput {
	return o
}

func (o CompositeAlarmArrayOutput) ToCompositeAlarmArrayOutputWithContext(ctx context.Context) CompositeAlarmArrayOutput {
	return o
}

func (o CompositeAlarmArrayOutput) Index(i pulumi.IntInput) CompositeAlarmOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CompositeAlarm {
		return vs[0].([]CompositeAlarm)[vs[1].(int)]
	}).(CompositeAlarmOutput)
}

type CompositeAlarmMapOutput struct{ *pulumi.OutputState }

func (CompositeAlarmMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CompositeAlarm)(nil))
}

func (o CompositeAlarmMapOutput) ToCompositeAlarmMapOutput() CompositeAlarmMapOutput {
	return o
}

func (o CompositeAlarmMapOutput) ToCompositeAlarmMapOutputWithContext(ctx context.Context) CompositeAlarmMapOutput {
	return o
}

func (o CompositeAlarmMapOutput) MapIndex(k pulumi.StringInput) CompositeAlarmOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CompositeAlarm {
		return vs[0].(map[string]CompositeAlarm)[vs[1].(string)]
	}).(CompositeAlarmOutput)
}

func init() {
	pulumi.RegisterOutputType(CompositeAlarmOutput{})
	pulumi.RegisterOutputType(CompositeAlarmPtrOutput{})
	pulumi.RegisterOutputType(CompositeAlarmArrayOutput{})
	pulumi.RegisterOutputType(CompositeAlarmMapOutput{})
}