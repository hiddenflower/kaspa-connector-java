// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface PruningPointProofHeaderArrayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.PruningPointProofHeaderArray)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.BlockHeader headers = 1;</code>
   */
  java.util.List<protowire.BlockHeader> 
      getHeadersList();
  /**
   * <code>repeated .protowire.BlockHeader headers = 1;</code>
   */
  protowire.BlockHeader getHeaders(int index);
  /**
   * <code>repeated .protowire.BlockHeader headers = 1;</code>
   */
  int getHeadersCount();
  /**
   * <code>repeated .protowire.BlockHeader headers = 1;</code>
   */
  java.util.List<? extends protowire.BlockHeaderOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <code>repeated .protowire.BlockHeader headers = 1;</code>
   */
  protowire.BlockHeaderOrBuilder getHeadersOrBuilder(
      int index);
}