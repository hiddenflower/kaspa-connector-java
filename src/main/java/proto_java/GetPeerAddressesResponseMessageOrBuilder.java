// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetPeerAddressesResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetPeerAddressesResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage addresses = 1;</code>
   */
  java.util.List<proto_java.GetPeerAddressesKnownAddressMessage> 
      getAddressesList();
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage addresses = 1;</code>
   */
  proto_java.GetPeerAddressesKnownAddressMessage getAddresses(int index);
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage addresses = 1;</code>
   */
  int getAddressesCount();
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage addresses = 1;</code>
   */
  java.util.List<? extends proto_java.GetPeerAddressesKnownAddressMessageOrBuilder> 
      getAddressesOrBuilderList();
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage addresses = 1;</code>
   */
  proto_java.GetPeerAddressesKnownAddressMessageOrBuilder getAddressesOrBuilder(
      int index);

  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage bannedAddresses = 2;</code>
   */
  java.util.List<proto_java.GetPeerAddressesKnownAddressMessage> 
      getBannedAddressesList();
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage bannedAddresses = 2;</code>
   */
  proto_java.GetPeerAddressesKnownAddressMessage getBannedAddresses(int index);
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage bannedAddresses = 2;</code>
   */
  int getBannedAddressesCount();
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage bannedAddresses = 2;</code>
   */
  java.util.List<? extends proto_java.GetPeerAddressesKnownAddressMessageOrBuilder> 
      getBannedAddressesOrBuilderList();
  /**
   * <code>repeated .proto_java.GetPeerAddressesKnownAddressMessage bannedAddresses = 2;</code>
   */
  proto_java.GetPeerAddressesKnownAddressMessageOrBuilder getBannedAddressesOrBuilder(
      int index);

  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   * @return The error.
   */
  proto_java.RPCError getError();
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   */
  proto_java.RPCErrorOrBuilder getErrorOrBuilder();
}
