// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface RequestIBDChainBlockLocatorMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.RequestIBDChainBlockLocatorMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protowire.Hash lowHash = 1;</code>
   * @return Whether the lowHash field is set.
   */
  boolean hasLowHash();
  /**
   * <code>.protowire.Hash lowHash = 1;</code>
   * @return The lowHash.
   */
  protowire.Hash getLowHash();
  /**
   * <code>.protowire.Hash lowHash = 1;</code>
   */
  protowire.HashOrBuilder getLowHashOrBuilder();

  /**
   * <code>.protowire.Hash highHash = 2;</code>
   * @return Whether the highHash field is set.
   */
  boolean hasHighHash();
  /**
   * <code>.protowire.Hash highHash = 2;</code>
   * @return The highHash.
   */
  protowire.Hash getHighHash();
  /**
   * <code>.protowire.Hash highHash = 2;</code>
   */
  protowire.HashOrBuilder getHighHashOrBuilder();
}
