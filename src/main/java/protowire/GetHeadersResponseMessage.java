// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.GetHeadersResponseMessage}
 */
public final class GetHeadersResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.GetHeadersResponseMessage)
    GetHeadersResponseMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetHeadersResponseMessage.newBuilder() to construct.
  private GetHeadersResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetHeadersResponseMessage() {
    headers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetHeadersResponseMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetHeadersResponseMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              headers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            headers_.add(s);
            break;
          }
          case 8002: {
            protowire.RPCError.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(protowire.RPCError.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        headers_ = headers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protowire.Rpc.internal_static_protowire_GetHeadersResponseMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_GetHeadersResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.GetHeadersResponseMessage.class, protowire.GetHeadersResponseMessage.Builder.class);
  }

  public static final int HEADERS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList headers_;
  /**
   * <code>repeated string headers = 1;</code>
   * @return A list containing the headers.
   */
  public com.google.protobuf.ProtocolStringList
      getHeadersList() {
    return headers_;
  }
  /**
   * <code>repeated string headers = 1;</code>
   * @return The count of headers.
   */
  public int getHeadersCount() {
    return headers_.size();
  }
  /**
   * <code>repeated string headers = 1;</code>
   * @param index The index of the element to return.
   * @return The headers at the given index.
   */
  public java.lang.String getHeaders(int index) {
    return headers_.get(index);
  }
  /**
   * <code>repeated string headers = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the headers at the given index.
   */
  public com.google.protobuf.ByteString
      getHeadersBytes(int index) {
    return headers_.getByteString(index);
  }

  public static final int ERROR_FIELD_NUMBER = 1000;
  private protowire.RPCError error_;
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   * @return The error.
   */
  @java.lang.Override
  public protowire.RPCError getError() {
    return error_ == null ? protowire.RPCError.getDefaultInstance() : error_;
  }
  /**
   * <code>.protowire.RPCError error = 1000;</code>
   */
  @java.lang.Override
  public protowire.RPCErrorOrBuilder getErrorOrBuilder() {
    return getError();
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
    for (int i = 0; i < headers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, headers_.getRaw(i));
    }
    if (error_ != null) {
      output.writeMessage(1000, getError());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < headers_.size(); i++) {
        dataSize += computeStringSizeNoTag(headers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHeadersList().size();
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1000, getError());
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
    if (!(obj instanceof protowire.GetHeadersResponseMessage)) {
      return super.equals(obj);
    }
    protowire.GetHeadersResponseMessage other = (protowire.GetHeadersResponseMessage) obj;

    if (!getHeadersList()
        .equals(other.getHeadersList())) return false;
    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
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
    if (getHeadersCount() > 0) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeadersList().hashCode();
    }
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.GetHeadersResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetHeadersResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.GetHeadersResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetHeadersResponseMessage parseFrom(
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
  public static Builder newBuilder(protowire.GetHeadersResponseMessage prototype) {
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
   * Protobuf type {@code protowire.GetHeadersResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.GetHeadersResponseMessage)
      protowire.GetHeadersResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_GetHeadersResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_GetHeadersResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.GetHeadersResponseMessage.class, protowire.GetHeadersResponseMessage.Builder.class);
    }

    // Construct using protowire.GetHeadersResponseMessage.newBuilder()
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
      headers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.Rpc.internal_static_protowire_GetHeadersResponseMessage_descriptor;
    }

    @java.lang.Override
    public protowire.GetHeadersResponseMessage getDefaultInstanceForType() {
      return protowire.GetHeadersResponseMessage.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.GetHeadersResponseMessage build() {
      protowire.GetHeadersResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.GetHeadersResponseMessage buildPartial() {
      protowire.GetHeadersResponseMessage result = new protowire.GetHeadersResponseMessage(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        headers_ = headers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.headers_ = headers_;
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
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
      if (other instanceof protowire.GetHeadersResponseMessage) {
        return mergeFrom((protowire.GetHeadersResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.GetHeadersResponseMessage other) {
      if (other == protowire.GetHeadersResponseMessage.getDefaultInstance()) return this;
      if (!other.headers_.isEmpty()) {
        if (headers_.isEmpty()) {
          headers_ = other.headers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureHeadersIsMutable();
          headers_.addAll(other.headers_);
        }
        onChanged();
      }
      if (other.hasError()) {
        mergeError(other.getError());
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
      protowire.GetHeadersResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.GetHeadersResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList headers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        headers_ = new com.google.protobuf.LazyStringArrayList(headers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @return A list containing the headers.
     */
    public com.google.protobuf.ProtocolStringList
        getHeadersList() {
      return headers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @return The count of headers.
     */
    public int getHeadersCount() {
      return headers_.size();
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @param index The index of the element to return.
     * @return The headers at the given index.
     */
    public java.lang.String getHeaders(int index) {
      return headers_.get(index);
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the headers at the given index.
     */
    public com.google.protobuf.ByteString
        getHeadersBytes(int index) {
      return headers_.getByteString(index);
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @param index The index to set the value at.
     * @param value The headers to set.
     * @return This builder for chaining.
     */
    public Builder setHeaders(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHeadersIsMutable();
      headers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @param value The headers to add.
     * @return This builder for chaining.
     */
    public Builder addHeaders(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHeadersIsMutable();
      headers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @param values The headers to add.
     * @return This builder for chaining.
     */
    public Builder addAllHeaders(
        java.lang.Iterable<java.lang.String> values) {
      ensureHeadersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, headers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeaders() {
      headers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string headers = 1;</code>
     * @param value The bytes of the headers to add.
     * @return This builder for chaining.
     */
    public Builder addHeadersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureHeadersIsMutable();
      headers_.add(value);
      onChanged();
      return this;
    }

    private protowire.RPCError error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RPCError, protowire.RPCError.Builder, protowire.RPCErrorOrBuilder> errorBuilder_;
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     * @return The error.
     */
    public protowire.RPCError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? protowire.RPCError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    public Builder setError(protowire.RPCError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    public Builder setError(
        protowire.RPCError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    public Builder mergeError(protowire.RPCError value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            protowire.RPCError.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    public protowire.RPCError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    public protowire.RPCErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            protowire.RPCError.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>.protowire.RPCError error = 1000;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RPCError, protowire.RPCError.Builder, protowire.RPCErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.RPCError, protowire.RPCError.Builder, protowire.RPCErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protowire.GetHeadersResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:protowire.GetHeadersResponseMessage)
  private static final protowire.GetHeadersResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.GetHeadersResponseMessage();
  }

  public static protowire.GetHeadersResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetHeadersResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetHeadersResponseMessage>() {
    @java.lang.Override
    public GetHeadersResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetHeadersResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetHeadersResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetHeadersResponseMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.GetHeadersResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

