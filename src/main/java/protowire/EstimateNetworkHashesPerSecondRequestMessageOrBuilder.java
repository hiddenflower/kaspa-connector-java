// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface EstimateNetworkHashesPerSecondRequestMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.EstimateNetworkHashesPerSecondRequestMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 windowSize = 1;</code>
   * @return The windowSize.
   */
  int getWindowSize();

  /**
   * <code>string startHash = 2;</code>
   * @return The startHash.
   */
  java.lang.String getStartHash();
  /**
   * <code>string startHash = 2;</code>
   * @return The bytes for startHash.
   */
  com.google.protobuf.ByteString
      getStartHashBytes();
}
