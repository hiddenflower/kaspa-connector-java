// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface GetUtxosByAddressesResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.GetUtxosByAddressesResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.UtxosByAddressesEntry entries = 1;</code>
   */
  java.util.List<protowire.UtxosByAddressesEntry> 
      getEntriesList();
  /**
   * <code>repeated .protowire.UtxosByAddressesEntry entries = 1;</code>
   */
  protowire.UtxosByAddressesEntry getEntries(int index);
  /**
   * <code>repeated .protowire.UtxosByAddressesEntry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .protowire.UtxosByAddressesEntry entries = 1;</code>
   */
  java.util.List<? extends protowire.UtxosByAddressesEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .protowire.UtxosByAddressesEntry entries = 1;</code>
   */
  protowire.UtxosByAddressesEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <code>.protowire.RPCError error = 1000;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   * @return The error.
   */
  protowire.RPCError getError();
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   */
  protowire.RPCErrorOrBuilder getErrorOrBuilder();
}
