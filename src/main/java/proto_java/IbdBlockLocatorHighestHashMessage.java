// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

/**
 * Protobuf type {@code proto_java.IbdBlockLocatorHighestHashMessage}
 */
public final class IbdBlockLocatorHighestHashMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.IbdBlockLocatorHighestHashMessage)
    IbdBlockLocatorHighestHashMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IbdBlockLocatorHighestHashMessage.newBuilder() to construct.
  private IbdBlockLocatorHighestHashMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IbdBlockLocatorHighestHashMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IbdBlockLocatorHighestHashMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IbdBlockLocatorHighestHashMessage(
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
            proto_java.Hash.Builder subBuilder = null;
            if (highestHash_ != null) {
              subBuilder = highestHash_.toBuilder();
            }
            highestHash_ = input.readMessage(proto_java.Hash.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(highestHash_);
              highestHash_ = subBuilder.buildPartial();
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
    return proto_java.P2P.internal_static_org_example_grpc_IbdBlockLocatorHighestHashMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.P2P.internal_static_org_example_grpc_IbdBlockLocatorHighestHashMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.IbdBlockLocatorHighestHashMessage.class, proto_java.IbdBlockLocatorHighestHashMessage.Builder.class);
  }

  public static final int HIGHESTHASH_FIELD_NUMBER = 1;
  private proto_java.Hash highestHash_;
  /**
   * <code>.proto_java.Hash highestHash = 1;</code>
   * @return Whether the highestHash field is set.
   */
  @java.lang.Override
  public boolean hasHighestHash() {
    return highestHash_ != null;
  }
  /**
   * <code>.proto_java.Hash highestHash = 1;</code>
   * @return The highestHash.
   */
  @java.lang.Override
  public proto_java.Hash getHighestHash() {
    return highestHash_ == null ? proto_java.Hash.getDefaultInstance() : highestHash_;
  }
  /**
   * <code>.proto_java.Hash highestHash = 1;</code>
   */
  @java.lang.Override
  public proto_java.HashOrBuilder getHighestHashOrBuilder() {
    return getHighestHash();
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
    if (highestHash_ != null) {
      output.writeMessage(1, getHighestHash());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (highestHash_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHighestHash());
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
    if (!(obj instanceof proto_java.IbdBlockLocatorHighestHashMessage)) {
      return super.equals(obj);
    }
    proto_java.IbdBlockLocatorHighestHashMessage other = (proto_java.IbdBlockLocatorHighestHashMessage) obj;

    if (hasHighestHash() != other.hasHighestHash()) return false;
    if (hasHighestHash()) {
      if (!getHighestHash()
          .equals(other.getHighestHash())) return false;
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
    if (hasHighestHash()) {
      hash = (37 * hash) + HIGHESTHASH_FIELD_NUMBER;
      hash = (53 * hash) + getHighestHash().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.IbdBlockLocatorHighestHashMessage parseFrom(
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
  public static Builder newBuilder(proto_java.IbdBlockLocatorHighestHashMessage prototype) {
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
   * Protobuf type {@code proto_java.IbdBlockLocatorHighestHashMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.IbdBlockLocatorHighestHashMessage)
      proto_java.IbdBlockLocatorHighestHashMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.P2P.internal_static_org_example_grpc_IbdBlockLocatorHighestHashMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.P2P.internal_static_org_example_grpc_IbdBlockLocatorHighestHashMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.IbdBlockLocatorHighestHashMessage.class, proto_java.IbdBlockLocatorHighestHashMessage.Builder.class);
    }

    // Construct using proto_java.IbdBlockLocatorHighestHashMessage.newBuilder()
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
      if (highestHashBuilder_ == null) {
        highestHash_ = null;
      } else {
        highestHash_ = null;
        highestHashBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.P2P.internal_static_org_example_grpc_IbdBlockLocatorHighestHashMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.IbdBlockLocatorHighestHashMessage getDefaultInstanceForType() {
      return proto_java.IbdBlockLocatorHighestHashMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.IbdBlockLocatorHighestHashMessage build() {
      proto_java.IbdBlockLocatorHighestHashMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.IbdBlockLocatorHighestHashMessage buildPartial() {
      proto_java.IbdBlockLocatorHighestHashMessage result = new proto_java.IbdBlockLocatorHighestHashMessage(this);
      if (highestHashBuilder_ == null) {
        result.highestHash_ = highestHash_;
      } else {
        result.highestHash_ = highestHashBuilder_.build();
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
      if (other instanceof proto_java.IbdBlockLocatorHighestHashMessage) {
        return mergeFrom((proto_java.IbdBlockLocatorHighestHashMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.IbdBlockLocatorHighestHashMessage other) {
      if (other == proto_java.IbdBlockLocatorHighestHashMessage.getDefaultInstance()) return this;
      if (other.hasHighestHash()) {
        mergeHighestHash(other.getHighestHash());
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
      proto_java.IbdBlockLocatorHighestHashMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.IbdBlockLocatorHighestHashMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private proto_java.Hash highestHash_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.Hash, proto_java.Hash.Builder, proto_java.HashOrBuilder> highestHashBuilder_;
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     * @return Whether the highestHash field is set.
     */
    public boolean hasHighestHash() {
      return highestHashBuilder_ != null || highestHash_ != null;
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     * @return The highestHash.
     */
    public proto_java.Hash getHighestHash() {
      if (highestHashBuilder_ == null) {
        return highestHash_ == null ? proto_java.Hash.getDefaultInstance() : highestHash_;
      } else {
        return highestHashBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    public Builder setHighestHash(proto_java.Hash value) {
      if (highestHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        highestHash_ = value;
        onChanged();
      } else {
        highestHashBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    public Builder setHighestHash(
        proto_java.Hash.Builder builderForValue) {
      if (highestHashBuilder_ == null) {
        highestHash_ = builderForValue.build();
        onChanged();
      } else {
        highestHashBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    public Builder mergeHighestHash(proto_java.Hash value) {
      if (highestHashBuilder_ == null) {
        if (highestHash_ != null) {
          highestHash_ =
            proto_java.Hash.newBuilder(highestHash_).mergeFrom(value).buildPartial();
        } else {
          highestHash_ = value;
        }
        onChanged();
      } else {
        highestHashBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    public Builder clearHighestHash() {
      if (highestHashBuilder_ == null) {
        highestHash_ = null;
        onChanged();
      } else {
        highestHash_ = null;
        highestHashBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    public proto_java.Hash.Builder getHighestHashBuilder() {
      
      onChanged();
      return getHighestHashFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    public proto_java.HashOrBuilder getHighestHashOrBuilder() {
      if (highestHashBuilder_ != null) {
        return highestHashBuilder_.getMessageOrBuilder();
      } else {
        return highestHash_ == null ?
            proto_java.Hash.getDefaultInstance() : highestHash_;
      }
    }
    /**
     * <code>.proto_java.Hash highestHash = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.Hash, proto_java.Hash.Builder, proto_java.HashOrBuilder> 
        getHighestHashFieldBuilder() {
      if (highestHashBuilder_ == null) {
        highestHashBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto_java.Hash, proto_java.Hash.Builder, proto_java.HashOrBuilder>(
                getHighestHash(),
                getParentForChildren(),
                isClean());
        highestHash_ = null;
      }
      return highestHashBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto_java.IbdBlockLocatorHighestHashMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.IbdBlockLocatorHighestHashMessage)
  private static final proto_java.IbdBlockLocatorHighestHashMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.IbdBlockLocatorHighestHashMessage();
  }

  public static proto_java.IbdBlockLocatorHighestHashMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IbdBlockLocatorHighestHashMessage>
      PARSER = new com.google.protobuf.AbstractParser<IbdBlockLocatorHighestHashMessage>() {
    @java.lang.Override
    public IbdBlockLocatorHighestHashMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IbdBlockLocatorHighestHashMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IbdBlockLocatorHighestHashMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IbdBlockLocatorHighestHashMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.IbdBlockLocatorHighestHashMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
