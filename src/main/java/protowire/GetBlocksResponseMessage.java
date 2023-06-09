// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.GetBlocksResponseMessage}
 */
public final class GetBlocksResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.GetBlocksResponseMessage)
    GetBlocksResponseMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBlocksResponseMessage.newBuilder() to construct.
  private GetBlocksResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBlocksResponseMessage() {
    blockHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    blocks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBlocksResponseMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBlocksResponseMessage(
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
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              blocks_ = new java.util.ArrayList<protowire.RpcBlock>();
              mutable_bitField0_ |= 0x00000002;
            }
            blocks_.add(
                input.readMessage(protowire.RpcBlock.parser(), extensionRegistry));
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              blockHashes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            blockHashes_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        blocks_ = java.util.Collections.unmodifiableList(blocks_);
      }
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        blockHashes_ = blockHashes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protowire.Rpc.internal_static_protowire_GetBlocksResponseMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_GetBlocksResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.GetBlocksResponseMessage.class, protowire.GetBlocksResponseMessage.Builder.class);
  }

  public static final int BLOCKHASHES_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList blockHashes_;
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @return A list containing the blockHashes.
   */
  public com.google.protobuf.ProtocolStringList
      getBlockHashesList() {
    return blockHashes_;
  }
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @return The count of blockHashes.
   */
  public int getBlockHashesCount() {
    return blockHashes_.size();
  }
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @param index The index of the element to return.
   * @return The blockHashes at the given index.
   */
  public java.lang.String getBlockHashes(int index) {
    return blockHashes_.get(index);
  }
  /**
   * <code>repeated string blockHashes = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blockHashes at the given index.
   */
  public com.google.protobuf.ByteString
      getBlockHashesBytes(int index) {
    return blockHashes_.getByteString(index);
  }

  public static final int BLOCKS_FIELD_NUMBER = 3;
  private java.util.List<protowire.RpcBlock> blocks_;
  /**
   * <code>repeated .protowire.RpcBlock blocks = 3;</code>
   */
  @java.lang.Override
  public java.util.List<protowire.RpcBlock> getBlocksList() {
    return blocks_;
  }
  /**
   * <code>repeated .protowire.RpcBlock blocks = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends protowire.RpcBlockOrBuilder> 
      getBlocksOrBuilderList() {
    return blocks_;
  }
  /**
   * <code>repeated .protowire.RpcBlock blocks = 3;</code>
   */
  @java.lang.Override
  public int getBlocksCount() {
    return blocks_.size();
  }
  /**
   * <code>repeated .protowire.RpcBlock blocks = 3;</code>
   */
  @java.lang.Override
  public protowire.RpcBlock getBlocks(int index) {
    return blocks_.get(index);
  }
  /**
   * <code>repeated .protowire.RpcBlock blocks = 3;</code>
   */
  @java.lang.Override
  public protowire.RpcBlockOrBuilder getBlocksOrBuilder(
      int index) {
    return blocks_.get(index);
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
    for (int i = 0; i < blocks_.size(); i++) {
      output.writeMessage(3, blocks_.get(i));
    }
    for (int i = 0; i < blockHashes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, blockHashes_.getRaw(i));
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
    for (int i = 0; i < blocks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, blocks_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < blockHashes_.size(); i++) {
        dataSize += computeStringSizeNoTag(blockHashes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBlockHashesList().size();
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
    if (!(obj instanceof protowire.GetBlocksResponseMessage)) {
      return super.equals(obj);
    }
    protowire.GetBlocksResponseMessage other = (protowire.GetBlocksResponseMessage) obj;

    if (!getBlockHashesList()
        .equals(other.getBlockHashesList())) return false;
    if (!getBlocksList()
        .equals(other.getBlocksList())) return false;
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
    if (getBlockHashesCount() > 0) {
      hash = (37 * hash) + BLOCKHASHES_FIELD_NUMBER;
      hash = (53 * hash) + getBlockHashesList().hashCode();
    }
    if (getBlocksCount() > 0) {
      hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
      hash = (53 * hash) + getBlocksList().hashCode();
    }
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.GetBlocksResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetBlocksResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.GetBlocksResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.GetBlocksResponseMessage parseFrom(
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
  public static Builder newBuilder(protowire.GetBlocksResponseMessage prototype) {
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
   * Protobuf type {@code protowire.GetBlocksResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.GetBlocksResponseMessage)
      protowire.GetBlocksResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_GetBlocksResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_GetBlocksResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.GetBlocksResponseMessage.class, protowire.GetBlocksResponseMessage.Builder.class);
    }

    // Construct using protowire.GetBlocksResponseMessage.newBuilder()
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
        getBlocksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      blockHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        blocksBuilder_.clear();
      }
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
      return protowire.Rpc.internal_static_protowire_GetBlocksResponseMessage_descriptor;
    }

    @java.lang.Override
    public protowire.GetBlocksResponseMessage getDefaultInstanceForType() {
      return protowire.GetBlocksResponseMessage.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.GetBlocksResponseMessage build() {
      protowire.GetBlocksResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.GetBlocksResponseMessage buildPartial() {
      protowire.GetBlocksResponseMessage result = new protowire.GetBlocksResponseMessage(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        blockHashes_ = blockHashes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.blockHashes_ = blockHashes_;
      if (blocksBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          blocks_ = java.util.Collections.unmodifiableList(blocks_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.blocks_ = blocks_;
      } else {
        result.blocks_ = blocksBuilder_.build();
      }
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
      if (other instanceof protowire.GetBlocksResponseMessage) {
        return mergeFrom((protowire.GetBlocksResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.GetBlocksResponseMessage other) {
      if (other == protowire.GetBlocksResponseMessage.getDefaultInstance()) return this;
      if (!other.blockHashes_.isEmpty()) {
        if (blockHashes_.isEmpty()) {
          blockHashes_ = other.blockHashes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBlockHashesIsMutable();
          blockHashes_.addAll(other.blockHashes_);
        }
        onChanged();
      }
      if (blocksBuilder_ == null) {
        if (!other.blocks_.isEmpty()) {
          if (blocks_.isEmpty()) {
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBlocksIsMutable();
            blocks_.addAll(other.blocks_);
          }
          onChanged();
        }
      } else {
        if (!other.blocks_.isEmpty()) {
          if (blocksBuilder_.isEmpty()) {
            blocksBuilder_.dispose();
            blocksBuilder_ = null;
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000002);
            blocksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBlocksFieldBuilder() : null;
          } else {
            blocksBuilder_.addAllMessages(other.blocks_);
          }
        }
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
      protowire.GetBlocksResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.GetBlocksResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList blockHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureBlockHashesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        blockHashes_ = new com.google.protobuf.LazyStringArrayList(blockHashes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @return A list containing the blockHashes.
     */
    public com.google.protobuf.ProtocolStringList
        getBlockHashesList() {
      return blockHashes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @return The count of blockHashes.
     */
    public int getBlockHashesCount() {
      return blockHashes_.size();
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @param index The index of the element to return.
     * @return The blockHashes at the given index.
     */
    public java.lang.String getBlockHashes(int index) {
      return blockHashes_.get(index);
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the blockHashes at the given index.
     */
    public com.google.protobuf.ByteString
        getBlockHashesBytes(int index) {
      return blockHashes_.getByteString(index);
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @param index The index to set the value at.
     * @param value The blockHashes to set.
     * @return This builder for chaining.
     */
    public Builder setBlockHashes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlockHashesIsMutable();
      blockHashes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @param value The blockHashes to add.
     * @return This builder for chaining.
     */
    public Builder addBlockHashes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlockHashesIsMutable();
      blockHashes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @param values The blockHashes to add.
     * @return This builder for chaining.
     */
    public Builder addAllBlockHashes(
        java.lang.Iterable<java.lang.String> values) {
      ensureBlockHashesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, blockHashes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockHashes() {
      blockHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string blockHashes = 4;</code>
     * @param value The bytes of the blockHashes to add.
     * @return This builder for chaining.
     */
    public Builder addBlockHashesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureBlockHashesIsMutable();
      blockHashes_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<protowire.RpcBlock> blocks_ =
      java.util.Collections.emptyList();
    private void ensureBlocksIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        blocks_ = new java.util.ArrayList<protowire.RpcBlock>(blocks_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protowire.RpcBlock, protowire.RpcBlock.Builder, protowire.RpcBlockOrBuilder> blocksBuilder_;

    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public java.util.List<protowire.RpcBlock> getBlocksList() {
      if (blocksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(blocks_);
      } else {
        return blocksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public int getBlocksCount() {
      if (blocksBuilder_ == null) {
        return blocks_.size();
      } else {
        return blocksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public protowire.RpcBlock getBlocks(int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);
      } else {
        return blocksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder setBlocks(
        int index, protowire.RpcBlock value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.set(index, value);
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder setBlocks(
        int index, protowire.RpcBlock.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.set(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder addBlocks(protowire.RpcBlock value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder addBlocks(
        int index, protowire.RpcBlock value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(index, value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder addBlocks(
        protowire.RpcBlock.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder addBlocks(
        int index, protowire.RpcBlock.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder addAllBlocks(
        java.lang.Iterable<? extends protowire.RpcBlock> values) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blocks_);
        onChanged();
      } else {
        blocksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder clearBlocks() {
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        blocksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public Builder removeBlocks(int index) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.remove(index);
        onChanged();
      } else {
        blocksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public protowire.RpcBlock.Builder getBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public protowire.RpcBlockOrBuilder getBlocksOrBuilder(
        int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);  } else {
        return blocksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public java.util.List<? extends protowire.RpcBlockOrBuilder> 
         getBlocksOrBuilderList() {
      if (blocksBuilder_ != null) {
        return blocksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(blocks_);
      }
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public protowire.RpcBlock.Builder addBlocksBuilder() {
      return getBlocksFieldBuilder().addBuilder(
          protowire.RpcBlock.getDefaultInstance());
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public protowire.RpcBlock.Builder addBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().addBuilder(
          index, protowire.RpcBlock.getDefaultInstance());
    }
    /**
     * <code>repeated .protowire.RpcBlock blocks = 3;</code>
     */
    public java.util.List<protowire.RpcBlock.Builder> 
         getBlocksBuilderList() {
      return getBlocksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protowire.RpcBlock, protowire.RpcBlock.Builder, protowire.RpcBlockOrBuilder> 
        getBlocksFieldBuilder() {
      if (blocksBuilder_ == null) {
        blocksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protowire.RpcBlock, protowire.RpcBlock.Builder, protowire.RpcBlockOrBuilder>(
                blocks_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        blocks_ = null;
      }
      return blocksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protowire.GetBlocksResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:protowire.GetBlocksResponseMessage)
  private static final protowire.GetBlocksResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.GetBlocksResponseMessage();
  }

  public static protowire.GetBlocksResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBlocksResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetBlocksResponseMessage>() {
    @java.lang.Override
    public GetBlocksResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBlocksResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBlocksResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBlocksResponseMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.GetBlocksResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

