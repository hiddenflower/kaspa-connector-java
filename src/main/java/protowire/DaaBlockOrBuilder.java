// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface DaaBlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.DaaBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protowire.BlockMessage block = 3;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.protowire.BlockMessage block = 3;</code>
   * @return The block.
   */
  protowire.BlockMessage getBlock();
  /**
   * <code>.protowire.BlockMessage block = 3;</code>
   */
  protowire.BlockMessageOrBuilder getBlockOrBuilder();

  /**
   * <code>.protowire.GhostdagData ghostdagData = 2;</code>
   * @return Whether the ghostdagData field is set.
   */
  boolean hasGhostdagData();
  /**
   * <code>.protowire.GhostdagData ghostdagData = 2;</code>
   * @return The ghostdagData.
   */
  protowire.GhostdagData getGhostdagData();
  /**
   * <code>.protowire.GhostdagData ghostdagData = 2;</code>
   */
  protowire.GhostdagDataOrBuilder getGhostdagDataOrBuilder();
}
