// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * <pre>
 * GetBlockTemplateRequestMessage requests a current block template.
 * Callers are expected to solve the block template and submit it using the submitBlock call
 * See: SubmitBlockRequestMessage
 * </pre>
 *
 * Protobuf type {@code protowire.GetBlockTemplateRequestMessage}
 */
public final class GetBlockTemplateRequestMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.GetBlockTemplateRequestMessage)
    GetBlockTemplateRequestMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBlockTemplateRequestMessage.newBuilder() to construct.
  private GetBlockTemplateRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBlockTemplateRequestMessage() {
    payAddress_ = "";
    extraData_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBlockTemplateRequestMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBlockTemplateRequestMessage(
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

            payAddress_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            extraData_ = s;
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
    return protowire.Rpc.internal_static_protowire_GetBlockTemplateRequestMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_GetBlockTemplateRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.GetBlockTemplateRequestMessage.class, protowire.GetBlockTemplateRequestMessage.Builder.class);
  }

  public static final int PAYADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object payAddress_;
  /**
   * <pre>
   * Which kaspa address should the coinbase block reward transaction pay into
   * </pre>
   *
   * <code>string payAddress = 1;</code>
   * @return The payAddress.
   */
  @java.lang.Override
  public java.lang.String getPayAddress() {
    java.lang.Object ref = payAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Which kaspa address should the coinbase block reward transaction pay into
   * </pre>
   *
   * <code>string payAddress = 1;</code>
   * @return The bytes for payAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPayAddressBytes() {
    java.lang.Object ref = payAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRADATA_FIELD_NUMBER = 2;
  private volatile java.lang.Object extraData_;
  /**
   * <code>string extraData = 2;</code>
   * @return The extraData.
   */
  @java.lang.Override
  public java.lang.String getExtraData() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extraData_ = s;
      return s;
    }
  }
  /**
   * <code>string extraData = 2;</code>
   * @return The bytes for extraData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtraDataBytes() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extraData_ = b;
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
    if (!getPayAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, payAddress_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, extraData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPayAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, payAddress_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, extraData_);
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
    if (!(obj instanceof protowire.GetBlockTemplateRequestMessage)) {
      return super.equals(obj);
    }
    protowire.GetBlockTemplateRequestMessage other = (protowire.GetBlockTemplateRequestMessage) obj;

    if (!getPayAddress()
        .equals(other.getPayAddress())) return false;
    if (!getExtraData()
        .equals(other.getExtraData())) return false;
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
    hash = (37 * hash) + PAYADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getPayAddress().hashCode();
    hash = (37 * hash) + EXTRADATA_FIELD_NUMBER;
    hash = (53 * hash) + getExtraData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetBlockTemplateRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.GetBlockTemplateRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetBlockTemplateRequestMessage parseFrom(
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
  public static Builder newBuilder(protowire.GetBlockTemplateRequestMessage prototype) {
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
   * GetBlockTemplateRequestMessage requests a current block template.
   * Callers are expected to solve the block template and submit it using the submitBlock call
   * See: SubmitBlockRequestMessage
   * </pre>
   *
   * Protobuf type {@code protowire.GetBlockTemplateRequestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.GetBlockTemplateRequestMessage)
      protowire.GetBlockTemplateRequestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_GetBlockTemplateRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_GetBlockTemplateRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.GetBlockTemplateRequestMessage.class, protowire.GetBlockTemplateRequestMessage.Builder.class);
    }

    // Construct using protowire.GetBlockTemplateRequestMessage.newBuilder()
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
      payAddress_ = "";

      extraData_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.Rpc.internal_static_protowire_GetBlockTemplateRequestMessage_descriptor;
    }

    @java.lang.Override
    public protowire.GetBlockTemplateRequestMessage getDefaultInstanceForType() {
      return protowire.GetBlockTemplateRequestMessage.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.GetBlockTemplateRequestMessage build() {
      protowire.GetBlockTemplateRequestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.GetBlockTemplateRequestMessage buildPartial() {
      protowire.GetBlockTemplateRequestMessage result = new protowire.GetBlockTemplateRequestMessage(this);
      result.payAddress_ = payAddress_;
      result.extraData_ = extraData_;
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
      if (other instanceof protowire.GetBlockTemplateRequestMessage) {
        return mergeFrom((protowire.GetBlockTemplateRequestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.GetBlockTemplateRequestMessage other) {
      if (other == protowire.GetBlockTemplateRequestMessage.getDefaultInstance()) return this;
      if (!other.getPayAddress().isEmpty()) {
        payAddress_ = other.payAddress_;
        onChanged();
      }
      if (!other.getExtraData().isEmpty()) {
        extraData_ = other.extraData_;
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
      protowire.GetBlockTemplateRequestMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.GetBlockTemplateRequestMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object payAddress_ = "";
    /**
     * <pre>
     * Which kaspa address should the coinbase block reward transaction pay into
     * </pre>
     *
     * <code>string payAddress = 1;</code>
     * @return The payAddress.
     */
    public java.lang.String getPayAddress() {
      java.lang.Object ref = payAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Which kaspa address should the coinbase block reward transaction pay into
     * </pre>
     *
     * <code>string payAddress = 1;</code>
     * @return The bytes for payAddress.
     */
    public com.google.protobuf.ByteString
        getPayAddressBytes() {
      java.lang.Object ref = payAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Which kaspa address should the coinbase block reward transaction pay into
     * </pre>
     *
     * <code>string payAddress = 1;</code>
     * @param value The payAddress to set.
     * @return This builder for chaining.
     */
    public Builder setPayAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Which kaspa address should the coinbase block reward transaction pay into
     * </pre>
     *
     * <code>string payAddress = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayAddress() {
      
      payAddress_ = getDefaultInstance().getPayAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Which kaspa address should the coinbase block reward transaction pay into
     * </pre>
     *
     * <code>string payAddress = 1;</code>
     * @param value The bytes for payAddress to set.
     * @return This builder for chaining.
     */
    public Builder setPayAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      payAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object extraData_ = "";
    /**
     * <code>string extraData = 2;</code>
     * @return The extraData.
     */
    public java.lang.String getExtraData() {
      java.lang.Object ref = extraData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extraData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extraData = 2;</code>
     * @return The bytes for extraData.
     */
    public com.google.protobuf.ByteString
        getExtraDataBytes() {
      java.lang.Object ref = extraData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extraData = 2;</code>
     * @param value The extraData to set.
     * @return This builder for chaining.
     */
    public Builder setExtraData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extraData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtraData() {
      
      extraData_ = getDefaultInstance().getExtraData();
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 2;</code>
     * @param value The bytes for extraData to set.
     * @return This builder for chaining.
     */
    public Builder setExtraDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extraData_ = value;
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


    // @@protoc_insertion_point(builder_scope:protowire.GetBlockTemplateRequestMessage)
  }

  // @@protoc_insertion_point(class_scope:protowire.GetBlockTemplateRequestMessage)
  private static final protowire.GetBlockTemplateRequestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.GetBlockTemplateRequestMessage();
  }

  public static protowire.GetBlockTemplateRequestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBlockTemplateRequestMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetBlockTemplateRequestMessage>() {
    @java.lang.Override
    public GetBlockTemplateRequestMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBlockTemplateRequestMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBlockTemplateRequestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBlockTemplateRequestMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.GetBlockTemplateRequestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

