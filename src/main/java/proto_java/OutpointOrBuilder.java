// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

public interface OutpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.Outpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.TransactionId transactionId = 1;</code>
   * @return Whether the transactionId field is set.
   */
  boolean hasTransactionId();
  /**
   * <code>.proto_java.TransactionId transactionId = 1;</code>
   * @return The transactionId.
   */
  proto_java.TransactionId getTransactionId();
  /**
   * <code>.proto_java.TransactionId transactionId = 1;</code>
   */
  proto_java.TransactionIdOrBuilder getTransactionIdOrBuilder();

  /**
   * <code>uint32 index = 2;</code>
   * @return The index.
   */
  int getIndex();
}
