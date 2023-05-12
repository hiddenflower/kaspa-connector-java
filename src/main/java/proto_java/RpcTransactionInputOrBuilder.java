// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface RpcTransactionInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.RpcTransactionInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.RpcOutpoint previousOutpoint = 1;</code>
   * @return Whether the previousOutpoint field is set.
   */
  boolean hasPreviousOutpoint();
  /**
   * <code>.proto_java.RpcOutpoint previousOutpoint = 1;</code>
   * @return The previousOutpoint.
   */
  proto_java.RpcOutpoint getPreviousOutpoint();
  /**
   * <code>.proto_java.RpcOutpoint previousOutpoint = 1;</code>
   */
  proto_java.RpcOutpointOrBuilder getPreviousOutpointOrBuilder();

  /**
   * <code>string signatureScript = 2;</code>
   * @return The signatureScript.
   */
  java.lang.String getSignatureScript();
  /**
   * <code>string signatureScript = 2;</code>
   * @return The bytes for signatureScript.
   */
  com.google.protobuf.ByteString
      getSignatureScriptBytes();

  /**
   * <code>uint64 sequence = 3;</code>
   * @return The sequence.
   */
  long getSequence();

  /**
   * <code>uint32 sigOpCount = 5;</code>
   * @return The sigOpCount.
   */
  int getSigOpCount();

  /**
   * <code>.proto_java.RpcTransactionInputVerboseData verboseData = 4;</code>
   * @return Whether the verboseData field is set.
   */
  boolean hasVerboseData();
  /**
   * <code>.proto_java.RpcTransactionInputVerboseData verboseData = 4;</code>
   * @return The verboseData.
   */
  proto_java.RpcTransactionInputVerboseData getVerboseData();
  /**
   * <code>.proto_java.RpcTransactionInputVerboseData verboseData = 4;</code>
   */
  proto_java.RpcTransactionInputVerboseDataOrBuilder getVerboseDataOrBuilder();
}
