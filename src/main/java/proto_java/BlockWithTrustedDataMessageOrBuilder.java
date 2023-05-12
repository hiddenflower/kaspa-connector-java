// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

public interface BlockWithTrustedDataMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.BlockWithTrustedDataMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.BlockMessage block = 1;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.proto_java.BlockMessage block = 1;</code>
   * @return The block.
   */
  proto_java.BlockMessage getBlock();
  /**
   * <code>.proto_java.BlockMessage block = 1;</code>
   */
  proto_java.BlockMessageOrBuilder getBlockOrBuilder();

  /**
   * <code>uint64 daaScore = 2;</code>
   * @return The daaScore.
   */
  long getDaaScore();

  /**
   * <code>repeated .proto_java.DaaBlock daaWindow = 3;</code>
   */
  java.util.List<proto_java.DaaBlock> 
      getDaaWindowList();
  /**
   * <code>repeated .proto_java.DaaBlock daaWindow = 3;</code>
   */
  proto_java.DaaBlock getDaaWindow(int index);
  /**
   * <code>repeated .proto_java.DaaBlock daaWindow = 3;</code>
   */
  int getDaaWindowCount();
  /**
   * <code>repeated .proto_java.DaaBlock daaWindow = 3;</code>
   */
  java.util.List<? extends proto_java.DaaBlockOrBuilder> 
      getDaaWindowOrBuilderList();
  /**
   * <code>repeated .proto_java.DaaBlock daaWindow = 3;</code>
   */
  proto_java.DaaBlockOrBuilder getDaaWindowOrBuilder(
      int index);

  /**
   * <code>repeated .proto_java.BlockGhostdagDataHashPair ghostdagData = 4;</code>
   */
  java.util.List<proto_java.BlockGhostdagDataHashPair> 
      getGhostdagDataList();
  /**
   * <code>repeated .proto_java.BlockGhostdagDataHashPair ghostdagData = 4;</code>
   */
  proto_java.BlockGhostdagDataHashPair getGhostdagData(int index);
  /**
   * <code>repeated .proto_java.BlockGhostdagDataHashPair ghostdagData = 4;</code>
   */
  int getGhostdagDataCount();
  /**
   * <code>repeated .proto_java.BlockGhostdagDataHashPair ghostdagData = 4;</code>
   */
  java.util.List<? extends proto_java.BlockGhostdagDataHashPairOrBuilder> 
      getGhostdagDataOrBuilderList();
  /**
   * <code>repeated .proto_java.BlockGhostdagDataHashPair ghostdagData = 4;</code>
   */
  proto_java.BlockGhostdagDataHashPairOrBuilder getGhostdagDataOrBuilder(
      int index);
}