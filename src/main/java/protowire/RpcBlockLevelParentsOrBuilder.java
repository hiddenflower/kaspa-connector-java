// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

public interface RpcBlockLevelParentsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.RpcBlockLevelParents)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string parentHashes = 1;</code>
   * @return A list containing the parentHashes.
   */
  java.util.List<java.lang.String>
      getParentHashesList();
  /**
   * <code>repeated string parentHashes = 1;</code>
   * @return The count of parentHashes.
   */
  int getParentHashesCount();
  /**
   * <code>repeated string parentHashes = 1;</code>
   * @param index The index of the element to return.
   * @return The parentHashes at the given index.
   */
  java.lang.String getParentHashes(int index);
  /**
   * <code>repeated string parentHashes = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the parentHashes at the given index.
   */
  com.google.protobuf.ByteString
      getParentHashesBytes(int index);
}
