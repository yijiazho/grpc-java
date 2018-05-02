// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/channelz.proto

package io.grpc.channelz.v1;

public interface GetSubchannelResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.GetSubchannelResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Subchannel that corresponds to the requested subchannel_id.  This
   * field should be set.
   * </pre>
   *
   * <code>.grpc.channelz.Subchannel subchannel = 1;</code>
   */
  boolean hasSubchannel();
  /**
   * <pre>
   * The Subchannel that corresponds to the requested subchannel_id.  This
   * field should be set.
   * </pre>
   *
   * <code>.grpc.channelz.Subchannel subchannel = 1;</code>
   */
  io.grpc.channelz.v1.Subchannel getSubchannel();
  /**
   * <pre>
   * The Subchannel that corresponds to the requested subchannel_id.  This
   * field should be set.
   * </pre>
   *
   * <code>.grpc.channelz.Subchannel subchannel = 1;</code>
   */
  io.grpc.channelz.v1.SubchannelOrBuilder getSubchannelOrBuilder();
}