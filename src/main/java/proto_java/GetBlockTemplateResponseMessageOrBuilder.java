// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetBlockTemplateResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetBlockTemplateResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.RpcBlock block = 3;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.proto_java.RpcBlock block = 3;</code>
   * @return The block.
   */
  proto_java.RpcBlock getBlock();
  /**
   * <code>.proto_java.RpcBlock block = 3;</code>
   */
  proto_java.RpcBlockOrBuilder getBlockOrBuilder();

  /**
   * <pre>
   * Whether kaspad thinks that it's synced.
   * Callers are discouraged (but not forbidden) from solving blocks when kaspad is not synced.
   * That is because when kaspad isn't in sync with the rest of the network there's a high
   * chance the block will never be accepted, thus the solving effort would have been wasted.
   * </pre>
   *
   * <code>bool isSynced = 2;</code>
   * @return The isSynced.
   */
  boolean getIsSynced();

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
