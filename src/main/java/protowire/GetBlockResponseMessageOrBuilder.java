// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface GetBlockResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.GetBlockResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protowire.RpcBlock block = 3;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.protowire.RpcBlock block = 3;</code>
   * @return The block.
   */
  protowire.RpcBlock getBlock();
  /**
   * <code>.protowire.RpcBlock block = 3;</code>
   */
  protowire.RpcBlockOrBuilder getBlockOrBuilder();

  /**
   * <code>.protowire.RPCError error = 1000;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   * @return The error.
   */
  protowire.RPCError getError();
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   */
  protowire.RPCErrorOrBuilder getErrorOrBuilder();
}
