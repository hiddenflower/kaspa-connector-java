// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface GetSubnetworkResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.GetSubnetworkResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 gasLimit = 1;</code>
   * @return The gasLimit.
   */
  long getGasLimit();

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
