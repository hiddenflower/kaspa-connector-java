// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

public interface RequestIBDChainBlockLocatorMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.RequestIBDChainBlockLocatorMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.Hash lowHash = 1;</code>
   * @return Whether the lowHash field is set.
   */
  boolean hasLowHash();
  /**
   * <code>.proto_java.Hash lowHash = 1;</code>
   * @return The lowHash.
   */
  proto_java.Hash getLowHash();
  /**
   * <code>.proto_java.Hash lowHash = 1;</code>
   */
  proto_java.HashOrBuilder getLowHashOrBuilder();

  /**
   * <code>.proto_java.Hash highHash = 2;</code>
   * @return Whether the highHash field is set.
   */
  boolean hasHighHash();
  /**
   * <code>.proto_java.Hash highHash = 2;</code>
   * @return The highHash.
   */
  proto_java.Hash getHighHash();
  /**
   * <code>.proto_java.Hash highHash = 2;</code>
   */
  proto_java.HashOrBuilder getHighHashOrBuilder();
}
