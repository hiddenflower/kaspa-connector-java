// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetBalanceByAddressResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetBalanceByAddressResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 balance = 1;</code>
   * @return The balance.
   */
  long getBalance();

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
