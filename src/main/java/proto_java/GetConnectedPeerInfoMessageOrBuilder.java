// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetConnectedPeerInfoMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetConnectedPeerInfoMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * How long did the last ping/pong exchange take
   * </pre>
   *
   * <code>int64 lastPingDuration = 3;</code>
   * @return The lastPingDuration.
   */
  long getLastPingDuration();

  /**
   * <pre>
   * Whether this kaspad initiated the connection
   * </pre>
   *
   * <code>bool isOutbound = 6;</code>
   * @return The isOutbound.
   */
  boolean getIsOutbound();

  /**
   * <code>int64 timeOffset = 7;</code>
   * @return The timeOffset.
   */
  long getTimeOffset();

  /**
   * <code>string userAgent = 8;</code>
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   * <code>string userAgent = 8;</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();

  /**
   * <pre>
   * The protocol version that this peer claims to support
   * </pre>
   *
   * <code>uint32 advertisedProtocolVersion = 9;</code>
   * @return The advertisedProtocolVersion.
   */
  int getAdvertisedProtocolVersion();

  /**
   * <pre>
   * The timestamp of when this peer connected to this kaspad
   * </pre>
   *
   * <code>int64 timeConnected = 10;</code>
   * @return The timeConnected.
   */
  long getTimeConnected();

  /**
   * <pre>
   * Whether this peer is the IBD peer (if IBD is running)
   * </pre>
   *
   * <code>bool isIbdPeer = 11;</code>
   * @return The isIbdPeer.
   */
  boolean getIsIbdPeer();
}