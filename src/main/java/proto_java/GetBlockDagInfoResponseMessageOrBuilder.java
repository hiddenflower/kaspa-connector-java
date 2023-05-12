// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetBlockDagInfoResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetBlockDagInfoResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string networkName = 1;</code>
   * @return The networkName.
   */
  java.lang.String getNetworkName();
  /**
   * <code>string networkName = 1;</code>
   * @return The bytes for networkName.
   */
  com.google.protobuf.ByteString
      getNetworkNameBytes();

  /**
   * <code>uint64 blockCount = 2;</code>
   * @return The blockCount.
   */
  long getBlockCount();

  /**
   * <code>uint64 headerCount = 3;</code>
   * @return The headerCount.
   */
  long getHeaderCount();

  /**
   * <code>repeated string tipHashes = 4;</code>
   * @return A list containing the tipHashes.
   */
  java.util.List<java.lang.String>
      getTipHashesList();
  /**
   * <code>repeated string tipHashes = 4;</code>
   * @return The count of tipHashes.
   */
  int getTipHashesCount();
  /**
   * <code>repeated string tipHashes = 4;</code>
   * @param index The index of the element to return.
   * @return The tipHashes at the given index.
   */
  java.lang.String getTipHashes(int index);
  /**
   * <code>repeated string tipHashes = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tipHashes at the given index.
   */
  com.google.protobuf.ByteString
      getTipHashesBytes(int index);

  /**
   * <code>double difficulty = 5;</code>
   * @return The difficulty.
   */
  double getDifficulty();

  /**
   * <code>int64 pastMedianTime = 6;</code>
   * @return The pastMedianTime.
   */
  long getPastMedianTime();

  /**
   * <code>repeated string virtualParentHashes = 7;</code>
   * @return A list containing the virtualParentHashes.
   */
  java.util.List<java.lang.String>
      getVirtualParentHashesList();
  /**
   * <code>repeated string virtualParentHashes = 7;</code>
   * @return The count of virtualParentHashes.
   */
  int getVirtualParentHashesCount();
  /**
   * <code>repeated string virtualParentHashes = 7;</code>
   * @param index The index of the element to return.
   * @return The virtualParentHashes at the given index.
   */
  java.lang.String getVirtualParentHashes(int index);
  /**
   * <code>repeated string virtualParentHashes = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the virtualParentHashes at the given index.
   */
  com.google.protobuf.ByteString
      getVirtualParentHashesBytes(int index);

  /**
   * <code>string pruningPointHash = 8;</code>
   * @return The pruningPointHash.
   */
  java.lang.String getPruningPointHash();
  /**
   * <code>string pruningPointHash = 8;</code>
   * @return The bytes for pruningPointHash.
   */
  com.google.protobuf.ByteString
      getPruningPointHashBytes();

  /**
   * <code>uint64 virtualDaaScore = 9;</code>
   * @return The virtualDaaScore.
   */
  long getVirtualDaaScore();

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
