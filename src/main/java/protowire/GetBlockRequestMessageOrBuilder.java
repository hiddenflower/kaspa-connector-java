// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface GetBlockRequestMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.GetBlockRequestMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hash of the requested block
   * </pre>
   *
   * <code>string hash = 1;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * The hash of the requested block
   * </pre>
   *
   * <code>string hash = 1;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <pre>
   * Whether to include transaction data in the response
   * </pre>
   *
   * <code>bool includeTransactions = 3;</code>
   * @return The includeTransactions.
   */
  boolean getIncludeTransactions();
}