// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

/**
 * Protobuf type {@code proto_java.RequestAddressesMessage}
 */
public final class RequestAddressesMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.RequestAddressesMessage)
    RequestAddressesMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestAddressesMessage.newBuilder() to construct.
  private RequestAddressesMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestAddressesMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestAddressesMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestAddressesMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            includeAllSubnetworks_ = input.readBool();
            break;
          }
          case 18: {
            proto_java.SubnetworkId.Builder subBuilder = null;
            if (subnetworkId_ != null) {
              subBuilder = subnetworkId_.toBuilder();
            }
            subnetworkId_ = input.readMessage(proto_java.SubnetworkId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(subnetworkId_);
              subnetworkId_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto_java.P2P.internal_static_org_example_grpc_RequestAddressesMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.P2P.internal_static_org_example_grpc_RequestAddressesMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.RequestAddressesMessage.class, proto_java.RequestAddressesMessage.Builder.class);
  }

  public static final int INCLUDEALLSUBNETWORKS_FIELD_NUMBER = 1;
  private boolean includeAllSubnetworks_;
  /**
   * <code>bool includeAllSubnetworks = 1;</code>
   * @return The includeAllSubnetworks.
   */
  @java.lang.Override
  public boolean getIncludeAllSubnetworks() {
    return includeAllSubnetworks_;
  }

  public static final int SUBNETWORKID_FIELD_NUMBER = 2;
  private proto_java.SubnetworkId subnetworkId_;
  /**
   * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
   * @return Whether the subnetworkId field is set.
   */
  @java.lang.Override
  public boolean hasSubnetworkId() {
    return subnetworkId_ != null;
  }
  /**
   * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
   * @return The subnetworkId.
   */
  @java.lang.Override
  public proto_java.SubnetworkId getSubnetworkId() {
    return subnetworkId_ == null ? proto_java.SubnetworkId.getDefaultInstance() : subnetworkId_;
  }
  /**
   * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
   */
  @java.lang.Override
  public proto_java.SubnetworkIdOrBuilder getSubnetworkIdOrBuilder() {
    return getSubnetworkId();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (includeAllSubnetworks_ != false) {
      output.writeBool(1, includeAllSubnetworks_);
    }
    if (subnetworkId_ != null) {
      output.writeMessage(2, getSubnetworkId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (includeAllSubnetworks_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, includeAllSubnetworks_);
    }
    if (subnetworkId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubnetworkId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto_java.RequestAddressesMessage)) {
      return super.equals(obj);
    }
    proto_java.RequestAddressesMessage other = (proto_java.RequestAddressesMessage) obj;

    if (getIncludeAllSubnetworks()
        != other.getIncludeAllSubnetworks()) return false;
    if (hasSubnetworkId() != other.hasSubnetworkId()) return false;
    if (hasSubnetworkId()) {
      if (!getSubnetworkId()
          .equals(other.getSubnetworkId())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INCLUDEALLSUBNETWORKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeAllSubnetworks());
    if (hasSubnetworkId()) {
      hash = (37 * hash) + SUBNETWORKID_FIELD_NUMBER;
      hash = (53 * hash) + getSubnetworkId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.RequestAddressesMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.RequestAddressesMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.RequestAddressesMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.RequestAddressesMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.RequestAddressesMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.RequestAddressesMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto_java.RequestAddressesMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto_java.RequestAddressesMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.RequestAddressesMessage)
      proto_java.RequestAddressesMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.P2P.internal_static_org_example_grpc_RequestAddressesMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.P2P.internal_static_org_example_grpc_RequestAddressesMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.RequestAddressesMessage.class, proto_java.RequestAddressesMessage.Builder.class);
    }

    // Construct using proto_java.RequestAddressesMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      includeAllSubnetworks_ = false;

      if (subnetworkIdBuilder_ == null) {
        subnetworkId_ = null;
      } else {
        subnetworkId_ = null;
        subnetworkIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.P2P.internal_static_org_example_grpc_RequestAddressesMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.RequestAddressesMessage getDefaultInstanceForType() {
      return proto_java.RequestAddressesMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.RequestAddressesMessage build() {
      proto_java.RequestAddressesMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.RequestAddressesMessage buildPartial() {
      proto_java.RequestAddressesMessage result = new proto_java.RequestAddressesMessage(this);
      result.includeAllSubnetworks_ = includeAllSubnetworks_;
      if (subnetworkIdBuilder_ == null) {
        result.subnetworkId_ = subnetworkId_;
      } else {
        result.subnetworkId_ = subnetworkIdBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto_java.RequestAddressesMessage) {
        return mergeFrom((proto_java.RequestAddressesMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.RequestAddressesMessage other) {
      if (other == proto_java.RequestAddressesMessage.getDefaultInstance()) return this;
      if (other.getIncludeAllSubnetworks() != false) {
        setIncludeAllSubnetworks(other.getIncludeAllSubnetworks());
      }
      if (other.hasSubnetworkId()) {
        mergeSubnetworkId(other.getSubnetworkId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto_java.RequestAddressesMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.RequestAddressesMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean includeAllSubnetworks_ ;
    /**
     * <code>bool includeAllSubnetworks = 1;</code>
     * @return The includeAllSubnetworks.
     */
    @java.lang.Override
    public boolean getIncludeAllSubnetworks() {
      return includeAllSubnetworks_;
    }
    /**
     * <code>bool includeAllSubnetworks = 1;</code>
     * @param value The includeAllSubnetworks to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeAllSubnetworks(boolean value) {
      
      includeAllSubnetworks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool includeAllSubnetworks = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeAllSubnetworks() {
      
      includeAllSubnetworks_ = false;
      onChanged();
      return this;
    }

    private proto_java.SubnetworkId subnetworkId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.SubnetworkId, proto_java.SubnetworkId.Builder, proto_java.SubnetworkIdOrBuilder> subnetworkIdBuilder_;
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     * @return Whether the subnetworkId field is set.
     */
    public boolean hasSubnetworkId() {
      return subnetworkIdBuilder_ != null || subnetworkId_ != null;
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     * @return The subnetworkId.
     */
    public proto_java.SubnetworkId getSubnetworkId() {
      if (subnetworkIdBuilder_ == null) {
        return subnetworkId_ == null ? proto_java.SubnetworkId.getDefaultInstance() : subnetworkId_;
      } else {
        return subnetworkIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    public Builder setSubnetworkId(proto_java.SubnetworkId value) {
      if (subnetworkIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subnetworkId_ = value;
        onChanged();
      } else {
        subnetworkIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    public Builder setSubnetworkId(
        proto_java.SubnetworkId.Builder builderForValue) {
      if (subnetworkIdBuilder_ == null) {
        subnetworkId_ = builderForValue.build();
        onChanged();
      } else {
        subnetworkIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    public Builder mergeSubnetworkId(proto_java.SubnetworkId value) {
      if (subnetworkIdBuilder_ == null) {
        if (subnetworkId_ != null) {
          subnetworkId_ =
            proto_java.SubnetworkId.newBuilder(subnetworkId_).mergeFrom(value).buildPartial();
        } else {
          subnetworkId_ = value;
        }
        onChanged();
      } else {
        subnetworkIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    public Builder clearSubnetworkId() {
      if (subnetworkIdBuilder_ == null) {
        subnetworkId_ = null;
        onChanged();
      } else {
        subnetworkId_ = null;
        subnetworkIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    public proto_java.SubnetworkId.Builder getSubnetworkIdBuilder() {
      
      onChanged();
      return getSubnetworkIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    public proto_java.SubnetworkIdOrBuilder getSubnetworkIdOrBuilder() {
      if (subnetworkIdBuilder_ != null) {
        return subnetworkIdBuilder_.getMessageOrBuilder();
      } else {
        return subnetworkId_ == null ?
            proto_java.SubnetworkId.getDefaultInstance() : subnetworkId_;
      }
    }
    /**
     * <code>.proto_java.SubnetworkId subnetworkId = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.SubnetworkId, proto_java.SubnetworkId.Builder, proto_java.SubnetworkIdOrBuilder> 
        getSubnetworkIdFieldBuilder() {
      if (subnetworkIdBuilder_ == null) {
        subnetworkIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto_java.SubnetworkId, proto_java.SubnetworkId.Builder, proto_java.SubnetworkIdOrBuilder>(
                getSubnetworkId(),
                getParentForChildren(),
                isClean());
        subnetworkId_ = null;
      }
      return subnetworkIdBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto_java.RequestAddressesMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.RequestAddressesMessage)
  private static final proto_java.RequestAddressesMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.RequestAddressesMessage();
  }

  public static proto_java.RequestAddressesMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestAddressesMessage>
      PARSER = new com.google.protobuf.AbstractParser<RequestAddressesMessage>() {
    @java.lang.Override
    public RequestAddressesMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestAddressesMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestAddressesMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestAddressesMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.RequestAddressesMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

