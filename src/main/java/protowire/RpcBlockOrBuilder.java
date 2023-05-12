// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface RpcBlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.RpcBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.protowire.RpcBlockHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.protowire.RpcBlockHeader header = 1;</code>
   * @return The header.
   */
  protowire.RpcBlockHeader getHeader();
  /**
   * <code>.protowire.RpcBlockHeader header = 1;</code>
   */
  protowire.RpcBlockHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated .protowire.RpcTransaction transactions = 2;</code>
   */
  java.util.List<protowire.RpcTransaction> 
      getTransactionsList();
  /**
   * <code>repeated .protowire.RpcTransaction transactions = 2;</code>
   */
  protowire.RpcTransaction getTransactions(int index);
  /**
   * <code>repeated .protowire.RpcTransaction transactions = 2;</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .protowire.RpcTransaction transactions = 2;</code>
   */
  java.util.List<? extends protowire.RpcTransactionOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .protowire.RpcTransaction transactions = 2;</code>
   */
  protowire.RpcTransactionOrBuilder getTransactionsOrBuilder(
      int index);

  /**
   * <code>.protowire.RpcBlockVerboseData verboseData = 3;</code>
   * @return Whether the verboseData field is set.
   */
  boolean hasVerboseData();
  /**
   * <code>.protowire.RpcBlockVerboseData verboseData = 3;</code>
   * @return The verboseData.
   */
  protowire.RpcBlockVerboseData getVerboseData();
  /**
   * <code>.protowire.RpcBlockVerboseData verboseData = 3;</code>
   */
  protowire.RpcBlockVerboseDataOrBuilder getVerboseDataOrBuilder();
}