// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface OutpointAndUtxoEntryPairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.OutpointAndUtxoEntryPair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protowire.Outpoint outpoint = 1;</code>
   * @return Whether the outpoint field is set.
   */
  boolean hasOutpoint();
  /**
   * <code>.protowire.Outpoint outpoint = 1;</code>
   * @return The outpoint.
   */
  protowire.Outpoint getOutpoint();
  /**
   * <code>.protowire.Outpoint outpoint = 1;</code>
   */
  protowire.OutpointOrBuilder getOutpointOrBuilder();

  /**
   * <code>.protowire.UtxoEntry utxoEntry = 2;</code>
   * @return Whether the utxoEntry field is set.
   */
  boolean hasUtxoEntry();
  /**
   * <code>.protowire.UtxoEntry utxoEntry = 2;</code>
   * @return The utxoEntry.
   */
  protowire.UtxoEntry getUtxoEntry();
  /**
   * <code>.protowire.UtxoEntry utxoEntry = 2;</code>
   */
  protowire.UtxoEntryOrBuilder getUtxoEntryOrBuilder();
}
