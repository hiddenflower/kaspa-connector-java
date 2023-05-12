// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface RpcTransactionOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.RpcTransactionOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 amount = 1;</code>
   * @return The amount.
   */
  long getAmount();

  /**
   * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
   * @return Whether the scriptPublicKey field is set.
   */
  boolean hasScriptPublicKey();
  /**
   * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
   * @return The scriptPublicKey.
   */
  protowire.RpcScriptPublicKey getScriptPublicKey();
  /**
   * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
   */
  protowire.RpcScriptPublicKeyOrBuilder getScriptPublicKeyOrBuilder();

  /**
   * <code>.protowire.RpcTransactionOutputVerboseData verboseData = 3;</code>
   * @return Whether the verboseData field is set.
   */
  boolean hasVerboseData();
  /**
   * <code>.protowire.RpcTransactionOutputVerboseData verboseData = 3;</code>
   * @return The verboseData.
   */
  protowire.RpcTransactionOutputVerboseData getVerboseData();
  /**
   * <code>.protowire.RpcTransactionOutputVerboseData verboseData = 3;</code>
   */
  protowire.RpcTransactionOutputVerboseDataOrBuilder getVerboseDataOrBuilder();
}
