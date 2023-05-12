// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface RpcTransactionOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.RpcTransactionOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 amount = 1;</code>
   * @return The amount.
   */
  long getAmount();

  /**
   * <code>.proto_java.RpcScriptPublicKey scriptPublicKey = 2;</code>
   * @return Whether the scriptPublicKey field is set.
   */
  boolean hasScriptPublicKey();
  /**
   * <code>.proto_java.RpcScriptPublicKey scriptPublicKey = 2;</code>
   * @return The scriptPublicKey.
   */
  proto_java.RpcScriptPublicKey getScriptPublicKey();
  /**
   * <code>.proto_java.RpcScriptPublicKey scriptPublicKey = 2;</code>
   */
  proto_java.RpcScriptPublicKeyOrBuilder getScriptPublicKeyOrBuilder();

  /**
   * <code>.proto_java.RpcTransactionOutputVerboseData verboseData = 3;</code>
   * @return Whether the verboseData field is set.
   */
  boolean hasVerboseData();
  /**
   * <code>.proto_java.RpcTransactionOutputVerboseData verboseData = 3;</code>
   * @return The verboseData.
   */
  proto_java.RpcTransactionOutputVerboseData getVerboseData();
  /**
   * <code>.proto_java.RpcTransactionOutputVerboseData verboseData = 3;</code>
   */
  proto_java.RpcTransactionOutputVerboseDataOrBuilder getVerboseDataOrBuilder();
}