// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

public interface GetMempoolEntryResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto_java.GetMempoolEntryResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto_java.MempoolEntry entry = 1;</code>
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   * <code>.proto_java.MempoolEntry entry = 1;</code>
   * @return The entry.
   */
  proto_java.MempoolEntry getEntry();
  /**
   * <code>.proto_java.MempoolEntry entry = 1;</code>
   */
  proto_java.MempoolEntryOrBuilder getEntryOrBuilder();

  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   * @return The error.
   */
  proto_java.RPCError getError();
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   */
  proto_java.RPCErrorOrBuilder getErrorOrBuilder();
}
