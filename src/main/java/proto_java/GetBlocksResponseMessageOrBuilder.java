// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetBlocksResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetBlocksResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string blockHashes = 4;</code>
   * @return A list containing the blockHashes.
   */
  java.util.List<java.lang.String>
      getBlockHashesList();
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @return The count of blockHashes.
   */
  int getBlockHashesCount();
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @param index The index of the element to return.
   * @return The blockHashes at the given index.
   */
  java.lang.String getBlockHashes(int index);
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blockHashes at the given index.
   */
  com.google.protobuf.ByteString
      getBlockHashesBytes(int index);

  /**
   * <code>repeated .proto_java.RpcBlock blocks = 3;</code>
   */
  java.util.List<proto_java.RpcBlock> 
      getBlocksList();
  /**
   * <code>repeated .proto_java.RpcBlock blocks = 3;</code>
   */
  proto_java.RpcBlock getBlocks(int index);
  /**
   * <code>repeated .proto_java.RpcBlock blocks = 3;</code>
   */
  int getBlocksCount();
  /**
   * <code>repeated .proto_java.RpcBlock blocks = 3;</code>
   */
  java.util.List<? extends proto_java.RpcBlockOrBuilder> 
      getBlocksOrBuilderList();
  /**
   * <code>repeated .proto_java.RpcBlock blocks = 3;</code>
   */
  proto_java.RpcBlockOrBuilder getBlocksOrBuilder(
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
