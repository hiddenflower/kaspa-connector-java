// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

/**
 * <pre>
 * GetSubnetworkRequestMessage requests information about a specific subnetwork
 * Currently unimplemented
 * </pre>
 *
 * Protobuf type {@code proto_java.GetSubnetworkRequestMessage}
 */
public final class GetSubnetworkRequestMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.GetSubnetworkRequestMessage)
    GetSubnetworkRequestMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSubnetworkRequestMessage.newBuilder() to construct.
  private GetSubnetworkRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSubnetworkRequestMessage() {
    subnetworkId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSubnetworkRequestMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSubnetworkRequestMessage(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            subnetworkId_ = s;
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
    return proto_java.Rpc.internal_static_org_example_grpc_GetSubnetworkRequestMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.Rpc.internal_static_org_example_grpc_GetSubnetworkRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.GetSubnetworkRequestMessage.class, proto_java.GetSubnetworkRequestMessage.Builder.class);
  }

  public static final int SUBNETWORKID_FIELD_NUMBER = 1;
  private volatile java.lang.Object subnetworkId_;
  /**
   * <code>string subnetworkId = 1;</code>
   * @return The subnetworkId.
   */
  @java.lang.Override
  public java.lang.String getSubnetworkId() {
    java.lang.Object ref = subnetworkId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetworkId_ = s;
      return s;
    }
  }
  /**
   * <code>string subnetworkId = 1;</code>
   * @return The bytes for subnetworkId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubnetworkIdBytes() {
    java.lang.Object ref = subnetworkId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subnetworkId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSubnetworkIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subnetworkId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubnetworkIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subnetworkId_);
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
    if (!(obj instanceof proto_java.GetSubnetworkRequestMessage)) {
      return super.equals(obj);
    }
    proto_java.GetSubnetworkRequestMessage other = (proto_java.GetSubnetworkRequestMessage) obj;

    if (!getSubnetworkId()
        .equals(other.getSubnetworkId())) return false;
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
    hash = (37 * hash) + SUBNETWORKID_FIELD_NUMBER;
    hash = (53 * hash) + getSubnetworkId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.GetSubnetworkRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.GetSubnetworkRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.GetSubnetworkRequestMessage parseFrom(
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
  public static Builder newBuilder(proto_java.GetSubnetworkRequestMessage prototype) {
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
   * <pre>
   * GetSubnetworkRequestMessage requests information about a specific subnetwork
   * Currently unimplemented
   * </pre>
   *
   * Protobuf type {@code proto_java.GetSubnetworkRequestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.GetSubnetworkRequestMessage)
      proto_java.GetSubnetworkRequestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.Rpc.internal_static_org_example_grpc_GetSubnetworkRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.Rpc.internal_static_org_example_grpc_GetSubnetworkRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.GetSubnetworkRequestMessage.class, proto_java.GetSubnetworkRequestMessage.Builder.class);
    }

    // Construct using proto_java.GetSubnetworkRequestMessage.newBuilder()
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
      subnetworkId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.Rpc.internal_static_org_example_grpc_GetSubnetworkRequestMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.GetSubnetworkRequestMessage getDefaultInstanceForType() {
      return proto_java.GetSubnetworkRequestMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.GetSubnetworkRequestMessage build() {
      proto_java.GetSubnetworkRequestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.GetSubnetworkRequestMessage buildPartial() {
      proto_java.GetSubnetworkRequestMessage result = new proto_java.GetSubnetworkRequestMessage(this);
      result.subnetworkId_ = subnetworkId_;
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
      if (other instanceof proto_java.GetSubnetworkRequestMessage) {
        return mergeFrom((proto_java.GetSubnetworkRequestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.GetSubnetworkRequestMessage other) {
      if (other == proto_java.GetSubnetworkRequestMessage.getDefaultInstance()) return this;
      if (!other.getSubnetworkId().isEmpty()) {
        subnetworkId_ = other.subnetworkId_;
        onChanged();
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
      proto_java.GetSubnetworkRequestMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.GetSubnetworkRequestMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subnetworkId_ = "";
    /**
     * <code>string subnetworkId = 1;</code>
     * @return The subnetworkId.
     */
    public java.lang.String getSubnetworkId() {
      java.lang.Object ref = subnetworkId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetworkId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subnetworkId = 1;</code>
     * @return The bytes for subnetworkId.
     */
    public com.google.protobuf.ByteString
        getSubnetworkIdBytes() {
      java.lang.Object ref = subnetworkId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subnetworkId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subnetworkId = 1;</code>
     * @param value The subnetworkId to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subnetworkId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subnetworkId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubnetworkId() {
      
      subnetworkId_ = getDefaultInstance().getSubnetworkId();
      onChanged();
      return this;
    }
    /**
     * <code>string subnetworkId = 1;</code>
     * @param value The bytes for subnetworkId to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subnetworkId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:proto_java.GetSubnetworkRequestMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.GetSubnetworkRequestMessage)
  private static final proto_java.GetSubnetworkRequestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.GetSubnetworkRequestMessage();
  }

  public static proto_java.GetSubnetworkRequestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSubnetworkRequestMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetSubnetworkRequestMessage>() {
    @java.lang.Override
    public GetSubnetworkRequestMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSubnetworkRequestMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSubnetworkRequestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSubnetworkRequestMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.GetSubnetworkRequestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
