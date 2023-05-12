// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface RpcTransactionVerboseDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.RpcTransactionVerboseData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string transactionId = 1;</code>
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   * <code>string transactionId = 1;</code>
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();

  /**
   * <code>string hash = 2;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string hash = 2;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>uint64 mass = 4;</code>
   * @return The mass.
   */
  long getMass();

  /**
   * <code>string blockHash = 12;</code>
   * @return The blockHash.
   */
  java.lang.String getBlockHash();
  /**
   * <code>string blockHash = 12;</code>
   * @return The bytes for blockHash.
   */
  com.google.protobuf.ByteString
      getBlockHashBytes();

  /**
   * <code>uint64 blockTime = 14;</code>
   * @return The blockTime.
   */
  long getBlockTime();
}