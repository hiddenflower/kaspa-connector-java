// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

/**
 * <pre>
 * SubmitBlockRequestMessage requests to submit a block into the DAG.
 * Blocks are generally expected to have been generated using the getBlockTemplate call.
 * See: GetBlockTemplateRequestMessage
 * </pre>
 *
 * Protobuf type {@code proto_java.SubmitBlockRequestMessage}
 */
public final class SubmitBlockRequestMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.SubmitBlockRequestMessage)
    SubmitBlockRequestMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitBlockRequestMessage.newBuilder() to construct.
  private SubmitBlockRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitBlockRequestMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitBlockRequestMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitBlockRequestMessage(
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
          case 18: {
            proto_java.RpcBlock.Builder subBuilder = null;
            if (block_ != null) {
              subBuilder = block_.toBuilder();
            }
            block_ = input.readMessage(proto_java.RpcBlock.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(block_);
              block_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            allowNonDAABlocks_ = input.readBool();
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
    return proto_java.Rpc.internal_static_org_example_grpc_SubmitBlockRequestMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.Rpc.internal_static_org_example_grpc_SubmitBlockRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.SubmitBlockRequestMessage.class, proto_java.SubmitBlockRequestMessage.Builder.class);
  }

  public static final int BLOCK_FIELD_NUMBER = 2;
  private proto_java.RpcBlock block_;
  /**
   * <code>.proto_java.RpcBlock block = 2;</code>
   * @return Whether the block field is set.
   */
  @java.lang.Override
  public boolean hasBlock() {
    return block_ != null;
  }
  /**
   * <code>.proto_java.RpcBlock block = 2;</code>
   * @return The block.
   */
  @java.lang.Override
  public proto_java.RpcBlock getBlock() {
    return block_ == null ? proto_java.RpcBlock.getDefaultInstance() : block_;
  }
  /**
   * <code>.proto_java.RpcBlock block = 2;</code>
   */
  @java.lang.Override
  public proto_java.RpcBlockOrBuilder getBlockOrBuilder() {
    return getBlock();
  }

  public static final int ALLOWNONDAABLOCKS_FIELD_NUMBER = 3;
  private boolean allowNonDAABlocks_;
  /**
   * <code>bool allowNonDAABlocks = 3;</code>
   * @return The allowNonDAABlocks.
   */
  @java.lang.Override
  public boolean getAllowNonDAABlocks() {
    return allowNonDAABlocks_;
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
    if (block_ != null) {
      output.writeMessage(2, getBlock());
    }
    if (allowNonDAABlocks_ != false) {
      output.writeBool(3, allowNonDAABlocks_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (block_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBlock());
    }
    if (allowNonDAABlocks_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowNonDAABlocks_);
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
    if (!(obj instanceof proto_java.SubmitBlockRequestMessage)) {
      return super.equals(obj);
    }
    proto_java.SubmitBlockRequestMessage other = (proto_java.SubmitBlockRequestMessage) obj;

    if (hasBlock() != other.hasBlock()) return false;
    if (hasBlock()) {
      if (!getBlock()
          .equals(other.getBlock())) return false;
    }
    if (getAllowNonDAABlocks()
        != other.getAllowNonDAABlocks()) return false;
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
    if (hasBlock()) {
      hash = (37 * hash) + BLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getBlock().hashCode();
    }
    hash = (37 * hash) + ALLOWNONDAABLOCKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowNonDAABlocks());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.SubmitBlockRequestMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.SubmitBlockRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.SubmitBlockRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.SubmitBlockRequestMessage parseFrom(
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
  public static Builder newBuilder(proto_java.SubmitBlockRequestMessage prototype) {
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
   * SubmitBlockRequestMessage requests to submit a block into the DAG.
   * Blocks are generally expected to have been generated using the getBlockTemplate call.
   * See: GetBlockTemplateRequestMessage
   * </pre>
   *
   * Protobuf type {@code proto_java.SubmitBlockRequestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.SubmitBlockRequestMessage)
      proto_java.SubmitBlockRequestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.Rpc.internal_static_org_example_grpc_SubmitBlockRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.Rpc.internal_static_org_example_grpc_SubmitBlockRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.SubmitBlockRequestMessage.class, proto_java.SubmitBlockRequestMessage.Builder.class);
    }

    // Construct using proto_java.SubmitBlockRequestMessage.newBuilder()
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
      if (blockBuilder_ == null) {
        block_ = null;
      } else {
        block_ = null;
        blockBuilder_ = null;
      }
      allowNonDAABlocks_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.Rpc.internal_static_org_example_grpc_SubmitBlockRequestMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.SubmitBlockRequestMessage getDefaultInstanceForType() {
      return proto_java.SubmitBlockRequestMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.SubmitBlockRequestMessage build() {
      proto_java.SubmitBlockRequestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.SubmitBlockRequestMessage buildPartial() {
      proto_java.SubmitBlockRequestMessage result = new proto_java.SubmitBlockRequestMessage(this);
      if (blockBuilder_ == null) {
        result.block_ = block_;
      } else {
        result.block_ = blockBuilder_.build();
      }
      result.allowNonDAABlocks_ = allowNonDAABlocks_;
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
      if (other instanceof proto_java.SubmitBlockRequestMessage) {
        return mergeFrom((proto_java.SubmitBlockRequestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.SubmitBlockRequestMessage other) {
      if (other == proto_java.SubmitBlockRequestMessage.getDefaultInstance()) return this;
      if (other.hasBlock()) {
        mergeBlock(other.getBlock());
      }
      if (other.getAllowNonDAABlocks() != false) {
        setAllowNonDAABlocks(other.getAllowNonDAABlocks());
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
      proto_java.SubmitBlockRequestMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.SubmitBlockRequestMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private proto_java.RpcBlock block_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.RpcBlock, proto_java.RpcBlock.Builder, proto_java.RpcBlockOrBuilder> blockBuilder_;
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     * @return Whether the block field is set.
     */
    public boolean hasBlock() {
      return blockBuilder_ != null || block_ != null;
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     * @return The block.
     */
    public proto_java.RpcBlock getBlock() {
      if (blockBuilder_ == null) {
        return block_ == null ? proto_java.RpcBlock.getDefaultInstance() : block_;
      } else {
        return blockBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    public Builder setBlock(proto_java.RpcBlock value) {
      if (blockBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        block_ = value;
        onChanged();
      } else {
        blockBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    public Builder setBlock(
        proto_java.RpcBlock.Builder builderForValue) {
      if (blockBuilder_ == null) {
        block_ = builderForValue.build();
        onChanged();
      } else {
        blockBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    public Builder mergeBlock(proto_java.RpcBlock value) {
      if (blockBuilder_ == null) {
        if (block_ != null) {
          block_ =
            proto_java.RpcBlock.newBuilder(block_).mergeFrom(value).buildPartial();
        } else {
          block_ = value;
        }
        onChanged();
      } else {
        blockBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    public Builder clearBlock() {
      if (blockBuilder_ == null) {
        block_ = null;
        onChanged();
      } else {
        block_ = null;
        blockBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    public proto_java.RpcBlock.Builder getBlockBuilder() {
      
      onChanged();
      return getBlockFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    public proto_java.RpcBlockOrBuilder getBlockOrBuilder() {
      if (blockBuilder_ != null) {
        return blockBuilder_.getMessageOrBuilder();
      } else {
        return block_ == null ?
            proto_java.RpcBlock.getDefaultInstance() : block_;
      }
    }
    /**
     * <code>.proto_java.RpcBlock block = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.RpcBlock, proto_java.RpcBlock.Builder, proto_java.RpcBlockOrBuilder> 
        getBlockFieldBuilder() {
      if (blockBuilder_ == null) {
        blockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto_java.RpcBlock, proto_java.RpcBlock.Builder, proto_java.RpcBlockOrBuilder>(
                getBlock(),
                getParentForChildren(),
                isClean());
        block_ = null;
      }
      return blockBuilder_;
    }

    private boolean allowNonDAABlocks_ ;
    /**
     * <code>bool allowNonDAABlocks = 3;</code>
     * @return The allowNonDAABlocks.
     */
    @java.lang.Override
    public boolean getAllowNonDAABlocks() {
      return allowNonDAABlocks_;
    }
    /**
     * <code>bool allowNonDAABlocks = 3;</code>
     * @param value The allowNonDAABlocks to set.
     * @return This builder for chaining.
     */
    public Builder setAllowNonDAABlocks(boolean value) {
      
      allowNonDAABlocks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allowNonDAABlocks = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowNonDAABlocks() {
      
      allowNonDAABlocks_ = false;
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


    // @@protoc_insertion_point(builder_scope:proto_java.SubmitBlockRequestMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.SubmitBlockRequestMessage)
  private static final proto_java.SubmitBlockRequestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.SubmitBlockRequestMessage();
  }

  public static proto_java.SubmitBlockRequestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitBlockRequestMessage>
      PARSER = new com.google.protobuf.AbstractParser<SubmitBlockRequestMessage>() {
    @java.lang.Override
    public SubmitBlockRequestMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitBlockRequestMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitBlockRequestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitBlockRequestMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.SubmitBlockRequestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
