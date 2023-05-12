// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.GetBlockCountResponseMessage}
 */
public final class GetBlockCountResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.GetBlockCountResponseMessage)
    GetBlockCountResponseMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBlockCountResponseMessage.newBuilder() to construct.
  private GetBlockCountResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBlockCountResponseMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBlockCountResponseMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBlockCountResponseMessage(
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

            blockCount_ = input.readUInt64();
            break;
          }
          case 16: {

            headerCount_ = input.readUInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protowire.Rpc.internal_static_protowire_GetBlockCountResponseMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_GetBlockCountResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.GetBlockCountResponseMessage.class, protowire.GetBlockCountResponseMessage.Builder.class);
  }

  public static final int BLOCKCOUNT_FIELD_NUMBER = 1;
  private long blockCount_;
  /**
   * <code>uint64 blockCount = 1;</code>
   * @return The blockCount.
   */
  @java.lang.Override
  public long getBlockCount() {
    return blockCount_;
  }

  public static final int HEADERCOUNT_FIELD_NUMBER = 2;
  private long headerCount_;
  /**
   * <code>uint64 headerCount = 2;</code>
   * @return The headerCount.
   */
  @java.lang.Override
  public long getHeaderCount() {
    return headerCount_;
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
    if (blockCount_ != 0L) {
      output.writeUInt64(1, blockCount_);
    }
    if (headerCount_ != 0L) {
      output.writeUInt64(2, headerCount_);
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
    if (blockCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, blockCount_);
    }
    if (headerCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, headerCount_);
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
    if (!(obj instanceof protowire.GetBlockCountResponseMessage)) {
      return super.equals(obj);
    }
    protowire.GetBlockCountResponseMessage other = (protowire.GetBlockCountResponseMessage) obj;

    if (getBlockCount()
        != other.getBlockCount()) return false;
    if (getHeaderCount()
        != other.getHeaderCount()) return false;
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
    hash = (37 * hash) + BLOCKCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockCount());
    hash = (37 * hash) + HEADERCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeaderCount());
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.GetBlockCountResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetBlockCountResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.GetBlockCountResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetBlockCountResponseMessage parseFrom(
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
  public static Builder newBuilder(protowire.GetBlockCountResponseMessage prototype) {
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
   * Protobuf type {@code protowire.GetBlockCountResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.GetBlockCountResponseMessage)
      protowire.GetBlockCountResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_GetBlockCountResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_GetBlockCountResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.GetBlockCountResponseMessage.class, protowire.GetBlockCountResponseMessage.Builder.class);
    }

    // Construct using protowire.GetBlockCountResponseMessage.newBuilder()
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
      blockCount_ = 0L;

      headerCount_ = 0L;

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
      return protowire.Rpc.internal_static_protowire_GetBlockCountResponseMessage_descriptor;
    }

    @java.lang.Override
    public protowire.GetBlockCountResponseMessage getDefaultInstanceForType() {
      return protowire.GetBlockCountResponseMessage.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.GetBlockCountResponseMessage build() {
      protowire.GetBlockCountResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.GetBlockCountResponseMessage buildPartial() {
      protowire.GetBlockCountResponseMessage result = new protowire.GetBlockCountResponseMessage(this);
      result.blockCount_ = blockCount_;
      result.headerCount_ = headerCount_;
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
      if (other instanceof protowire.GetBlockCountResponseMessage) {
        return mergeFrom((protowire.GetBlockCountResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.GetBlockCountResponseMessage other) {
      if (other == protowire.GetBlockCountResponseMessage.getDefaultInstance()) return this;
      if (other.getBlockCount() != 0L) {
        setBlockCount(other.getBlockCount());
      }
      if (other.getHeaderCount() != 0L) {
        setHeaderCount(other.getHeaderCount());
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
      protowire.GetBlockCountResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.GetBlockCountResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long blockCount_ ;
    /**
     * <code>uint64 blockCount = 1;</code>
     * @return The blockCount.
     */
    @java.lang.Override
    public long getBlockCount() {
      return blockCount_;
    }
    /**
     * <code>uint64 blockCount = 1;</code>
     * @param value The blockCount to set.
     * @return This builder for chaining.
     */
    public Builder setBlockCount(long value) {
      
      blockCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 blockCount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockCount() {
      
      blockCount_ = 0L;
      onChanged();
      return this;
    }

    private long headerCount_ ;
    /**
     * <code>uint64 headerCount = 2;</code>
     * @return The headerCount.
     */
    @java.lang.Override
    public long getHeaderCount() {
      return headerCount_;
    }
    /**
     * <code>uint64 headerCount = 2;</code>
     * @param value The headerCount to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderCount(long value) {
      
      headerCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 headerCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeaderCount() {
      
      headerCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:protowire.GetBlockCountResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:protowire.GetBlockCountResponseMessage)
  private static final protowire.GetBlockCountResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.GetBlockCountResponseMessage();
  }

  public static protowire.GetBlockCountResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBlockCountResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetBlockCountResponseMessage>() {
    @java.lang.Override
    public GetBlockCountResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBlockCountResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBlockCountResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBlockCountResponseMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.GetBlockCountResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
