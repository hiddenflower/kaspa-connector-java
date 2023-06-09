// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface SubmitTransactionResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.SubmitTransactionResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The transaction ID of the submitted transaction
   * </pre>
   *
   * <code>string transactionId = 1;</code>
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   * <pre>
   * The transaction ID of the submitted transaction
   * </pre>
   *
   * <code>string transactionId = 1;</code>
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();

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
