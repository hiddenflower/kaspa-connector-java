// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

public interface TransactionMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.TransactionMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 version = 1;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <code>repeated .proto_java.TransactionInput inputs = 2;</code>
   */
  java.util.List<proto_java.TransactionInput> 
      getInputsList();
  /**
   * <code>repeated .proto_java.TransactionInput inputs = 2;</code>
   */
  proto_java.TransactionInput getInputs(int index);
  /**
   * <code>repeated .proto_java.TransactionInput inputs = 2;</code>
   */
  int getInputsCount();
  /**
   * <code>repeated .proto_java.TransactionInput inputs = 2;</code>
   */
  java.util.List<? extends proto_java.TransactionInputOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <code>repeated .proto_java.TransactionInput inputs = 2;</code>
   */
  proto_java.TransactionInputOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <code>repeated .proto_java.TransactionOutput outputs = 3;</code>
   */
  java.util.List<proto_java.TransactionOutput> 
      getOutputsList();
  /**
   * <code>repeated .proto_java.TransactionOutput outputs = 3;</code>
   */
  proto_java.TransactionOutput getOutputs(int index);
  /**
   * <code>repeated .proto_java.TransactionOutput outputs = 3;</code>
   */
  int getOutputsCount();
  /**
   * <code>repeated .proto_java.TransactionOutput outputs = 3;</code>
   */
  java.util.List<? extends proto_java.TransactionOutputOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <code>repeated .proto_java.TransactionOutput outputs = 3;</code>
   */
  proto_java.TransactionOutputOrBuilder getOutputsOrBuilder(
      int index);

  /**
   * <code>uint64 lockTime = 4;</code>
   * @return The lockTime.
   */
  long getLockTime();

  /**
   * <code>.proto_java.SubnetworkId subnetworkId = 5;</code>
   * @return Whether the subnetworkId field is set.
   */
  boolean hasSubnetworkId();
  /**
   * <code>.proto_java.SubnetworkId subnetworkId = 5;</code>
   * @return The subnetworkId.
   */
  proto_java.SubnetworkId getSubnetworkId();
  /**
   * <code>.proto_java.SubnetworkId subnetworkId = 5;</code>
   */
  proto_java.SubnetworkIdOrBuilder getSubnetworkIdOrBuilder();

  /**
   * <code>uint64 gas = 6;</code>
   * @return The gas.
   */
  long getGas();

  /**
   * <code>bytes payload = 8;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}