// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface GetBalanceByAddressResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.GetBalanceByAddressResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 balance = 1;</code>
   * @return The balance.
   */
  long getBalance();

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
