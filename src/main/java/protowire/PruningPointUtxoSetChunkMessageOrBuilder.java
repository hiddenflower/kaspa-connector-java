// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface PruningPointUtxoSetChunkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.PruningPointUtxoSetChunkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.OutpointAndUtxoEntryPair outpointAndUtxoEntryPairs = 1;</code>
   */
  java.util.List<protowire.OutpointAndUtxoEntryPair> 
      getOutpointAndUtxoEntryPairsList();
  /**
   * <code>repeated .protowire.OutpointAndUtxoEntryPair outpointAndUtxoEntryPairs = 1;</code>
   */
  protowire.OutpointAndUtxoEntryPair getOutpointAndUtxoEntryPairs(int index);
  /**
   * <code>repeated .protowire.OutpointAndUtxoEntryPair outpointAndUtxoEntryPairs = 1;</code>
   */
  int getOutpointAndUtxoEntryPairsCount();
  /**
   * <code>repeated .protowire.OutpointAndUtxoEntryPair outpointAndUtxoEntryPairs = 1;</code>
   */
  java.util.List<? extends protowire.OutpointAndUtxoEntryPairOrBuilder> 
      getOutpointAndUtxoEntryPairsOrBuilderList();
  /**
   * <code>repeated .protowire.OutpointAndUtxoEntryPair outpointAndUtxoEntryPairs = 1;</code>
   */
  protowire.OutpointAndUtxoEntryPairOrBuilder getOutpointAndUtxoEntryPairsOrBuilder(
      int index);
}
