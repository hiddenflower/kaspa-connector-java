// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface BlockHeadersMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.BlockHeadersMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.BlockHeader blockHeaders = 1;</code>
   */
  java.util.List<protowire.BlockHeader> 
      getBlockHeadersList();
  /**
   * <code>repeated .protowire.BlockHeader blockHeaders = 1;</code>
   */
  protowire.BlockHeader getBlockHeaders(int index);
  /**
   * <code>repeated .protowire.BlockHeader blockHeaders = 1;</code>
   */
  int getBlockHeadersCount();
  /**
   * <code>repeated .protowire.BlockHeader blockHeaders = 1;</code>
   */
  java.util.List<? extends protowire.BlockHeaderOrBuilder> 
      getBlockHeadersOrBuilderList();
  /**
   * <code>repeated .protowire.BlockHeader blockHeaders = 1;</code>
   */
  protowire.BlockHeaderOrBuilder getBlockHeadersOrBuilder(
      int index);
}
