// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface IbdChainBlockLocatorMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.IbdChainBlockLocatorMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.Hash blockLocatorHashes = 1;</code>
   */
  java.util.List<protowire.Hash> 
      getBlockLocatorHashesList();
  /**
   * <code>repeated .protowire.Hash blockLocatorHashes = 1;</code>
   */
  protowire.Hash getBlockLocatorHashes(int index);
  /**
   * <code>repeated .protowire.Hash blockLocatorHashes = 1;</code>
   */
  int getBlockLocatorHashesCount();
  /**
   * <code>repeated .protowire.Hash blockLocatorHashes = 1;</code>
   */
  java.util.List<? extends protowire.HashOrBuilder> 
      getBlockLocatorHashesOrBuilderList();
  /**
   * <code>repeated .protowire.Hash blockLocatorHashes = 1;</code>
   */
  protowire.HashOrBuilder getBlockLocatorHashesOrBuilder(
      int index);
}
