// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface RpcBlockHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.RpcBlockHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 version = 1;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <code>repeated .proto_java.RpcBlockLevelParents parents = 12;</code>
   */
  java.util.List<proto_java.RpcBlockLevelParents> 
      getParentsList();
  /**
   * <code>repeated .proto_java.RpcBlockLevelParents parents = 12;</code>
   */
  proto_java.RpcBlockLevelParents getParents(int index);
  /**
   * <code>repeated .proto_java.RpcBlockLevelParents parents = 12;</code>
   */
  int getParentsCount();
  /**
   * <code>repeated .proto_java.RpcBlockLevelParents parents = 12;</code>
   */
  java.util.List<? extends proto_java.RpcBlockLevelParentsOrBuilder> 
      getParentsOrBuilderList();
  /**
   * <code>repeated .proto_java.RpcBlockLevelParents parents = 12;</code>
   */
  proto_java.RpcBlockLevelParentsOrBuilder getParentsOrBuilder(
      int index);

  /**
   * <code>string hashMerkleRoot = 3;</code>
   * @return The hashMerkleRoot.
   */
  java.lang.String getHashMerkleRoot();
  /**
   * <code>string hashMerkleRoot = 3;</code>
   * @return The bytes for hashMerkleRoot.
   */
  com.google.protobuf.ByteString
      getHashMerkleRootBytes();

  /**
   * <code>string acceptedIdMerkleRoot = 4;</code>
   * @return The acceptedIdMerkleRoot.
   */
  java.lang.String getAcceptedIdMerkleRoot();
  /**
   * <code>string acceptedIdMerkleRoot = 4;</code>
   * @return The bytes for acceptedIdMerkleRoot.
   */
  com.google.protobuf.ByteString
      getAcceptedIdMerkleRootBytes();

  /**
   * <code>string utxoCommitment = 5;</code>
   * @return The utxoCommitment.
   */
  java.lang.String getUtxoCommitment();
  /**
   * <code>string utxoCommitment = 5;</code>
   * @return The bytes for utxoCommitment.
   */
  com.google.protobuf.ByteString
      getUtxoCommitmentBytes();

  /**
   * <code>int64 timestamp = 6;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>uint32 bits = 7;</code>
   * @return The bits.
   */
  int getBits();

  /**
   * <code>uint64 nonce = 8;</code>
   * @return The nonce.
   */
  long getNonce();

  /**
   * <code>uint64 daaScore = 9;</code>
   * @return The daaScore.
   */
  long getDaaScore();

  /**
   * <code>string blueWork = 10;</code>
   * @return The blueWork.
   */
  java.lang.String getBlueWork();
  /**
   * <code>string blueWork = 10;</code>
   * @return The bytes for blueWork.
   */
  com.google.protobuf.ByteString
      getBlueWorkBytes();

  /**
   * <code>string pruningPoint = 14;</code>
   * @return The pruningPoint.
   */
  java.lang.String getPruningPoint();
  /**
   * <code>string pruningPoint = 14;</code>
   * @return The bytes for pruningPoint.
   */
  com.google.protobuf.ByteString
      getPruningPointBytes();

  /**
   * <code>uint64 blueScore = 13;</code>
   * @return The blueScore.
   */
  long getBlueScore();
}
