// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

public interface AddressesMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protowire.AddressesMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protowire.NetAddress addressList = 1;</code>
   */
  java.util.List<protowire.NetAddress> 
      getAddressListList();
  /**
   * <code>repeated .protowire.NetAddress addressList = 1;</code>
   */
  protowire.NetAddress getAddressList(int index);
  /**
   * <code>repeated .protowire.NetAddress addressList = 1;</code>
   */
  int getAddressListCount();
  /**
   * <code>repeated .protowire.NetAddress addressList = 1;</code>
   */
  java.util.List<? extends protowire.NetAddressOrBuilder> 
      getAddressListOrBuilderList();
  /**
   * <code>repeated .protowire.NetAddress addressList = 1;</code>
   */
  protowire.NetAddressOrBuilder getAddressListOrBuilder(
      int index);
}