// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface TrustedDataMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.TrustedDataMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.DaaBlockV4 daaWindow = 1;</code>
   */
  java.util.List<protowire.DaaBlockV4> 
      getDaaWindowList();
  /**
   * <code>repeated .protowire.DaaBlockV4 daaWindow = 1;</code>
   */
  protowire.DaaBlockV4 getDaaWindow(int index);
  /**
   * <code>repeated .protowire.DaaBlockV4 daaWindow = 1;</code>
   */
  int getDaaWindowCount();
  /**
   * <code>repeated .protowire.DaaBlockV4 daaWindow = 1;</code>
   */
  java.util.List<? extends protowire.DaaBlockV4OrBuilder> 
      getDaaWindowOrBuilderList();
  /**
   * <code>repeated .protowire.DaaBlockV4 daaWindow = 1;</code>
   */
  protowire.DaaBlockV4OrBuilder getDaaWindowOrBuilder(
      int index);

  /**
   * <code>repeated .protowire.BlockGhostdagDataHashPair ghostdagData = 2;</code>
   */
  java.util.List<protowire.BlockGhostdagDataHashPair> 
      getGhostdagDataList();
  /**
   * <code>repeated .protowire.BlockGhostdagDataHashPair ghostdagData = 2;</code>
   */
  protowire.BlockGhostdagDataHashPair getGhostdagData(int index);
  /**
   * <code>repeated .protowire.BlockGhostdagDataHashPair ghostdagData = 2;</code>
   */
  int getGhostdagDataCount();
  /**
   * <code>repeated .protowire.BlockGhostdagDataHashPair ghostdagData = 2;</code>
   */
  java.util.List<? extends protowire.BlockGhostdagDataHashPairOrBuilder> 
      getGhostdagDataOrBuilderList();
  /**
   * <code>repeated .protowire.BlockGhostdagDataHashPair ghostdagData = 2;</code>
   */
  protowire.BlockGhostdagDataHashPairOrBuilder getGhostdagDataOrBuilder(
      int index);
}
