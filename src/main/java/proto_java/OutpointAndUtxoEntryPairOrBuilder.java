// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

public interface OutpointAndUtxoEntryPairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.OutpointAndUtxoEntryPair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.Outpoint outpoint = 1;</code>
   * @return Whether the outpoint field is set.
   */
  boolean hasOutpoint();
  /**
   * <code>.proto_java.Outpoint outpoint = 1;</code>
   * @return The outpoint.
   */
  proto_java.Outpoint getOutpoint();
  /**
   * <code>.proto_java.Outpoint outpoint = 1;</code>
   */
  proto_java.OutpointOrBuilder getOutpointOrBuilder();

  /**
   * <code>.proto_java.UtxoEntry utxoEntry = 2;</code>
   * @return Whether the utxoEntry field is set.
   */
  boolean hasUtxoEntry();
  /**
   * <code>.proto_java.UtxoEntry utxoEntry = 2;</code>
   * @return The utxoEntry.
   */
  proto_java.UtxoEntry getUtxoEntry();
  /**
   * <code>.proto_java.UtxoEntry utxoEntry = 2;</code>
   */
  proto_java.UtxoEntryOrBuilder getUtxoEntryOrBuilder();
}
