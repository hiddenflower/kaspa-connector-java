// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

/**
 * Protobuf type {@code protowire.RequestPruningPointUTXOSetMessage}
 */
public final class RequestPruningPointUTXOSetMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.RequestPruningPointUTXOSetMessage)
    RequestPruningPointUTXOSetMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestPruningPointUTXOSetMessage.newBuilder() to construct.
  private RequestPruningPointUTXOSetMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestPruningPointUTXOSetMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestPruningPointUTXOSetMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestPruningPointUTXOSetMessage(
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
            protowire.Hash.Builder subBuilder = null;
            if (pruningPointHash_ != null) {
              subBuilder = pruningPointHash_.toBuilder();
            }
            pruningPointHash_ = input.readMessage(protowire.Hash.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pruningPointHash_);
              pruningPointHash_ = subBuilder.buildPartial();
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
    return protowire.P2P.internal_static_protowire_RequestPruningPointUTXOSetMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.P2P.internal_static_protowire_RequestPruningPointUTXOSetMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.RequestPruningPointUTXOSetMessage.class, protowire.RequestPruningPointUTXOSetMessage.Builder.class);
  }

  public static final int PRUNINGPOINTHASH_FIELD_NUMBER = 1;
  private protowire.Hash pruningPointHash_;
  /**
   * <code>.protowire.Hash pruningPointHash = 1;</code>
   * @return Whether the pruningPointHash field is set.
   */
  @java.lang.Override
  public boolean hasPruningPointHash() {
    return pruningPointHash_ != null;
  }
  /**
   * <code>.protowire.Hash pruningPointHash = 1;</code>
   * @return The pruningPointHash.
   */
  @java.lang.Override
  public protowire.Hash getPruningPointHash() {
    return pruningPointHash_ == null ? protowire.Hash.getDefaultInstance() : pruningPointHash_;
  }
  /**
   * <code>.protowire.Hash pruningPointHash = 1;</code>
   */
  @java.lang.Override
  public protowire.HashOrBuilder getPruningPointHashOrBuilder() {
    return getPruningPointHash();
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
    if (pruningPointHash_ != null) {
      output.writeMessage(1, getPruningPointHash());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pruningPointHash_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPruningPointHash());
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
    if (!(obj instanceof protowire.RequestPruningPointUTXOSetMessage)) {
      return super.equals(obj);
    }
    protowire.RequestPruningPointUTXOSetMessage other = (protowire.RequestPruningPointUTXOSetMessage) obj;

    if (hasPruningPointHash() != other.hasPruningPointHash()) return false;
    if (hasPruningPointHash()) {
      if (!getPruningPointHash()
          .equals(other.getPruningPointHash())) return false;
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
    if (hasPruningPointHash()) {
      hash = (37 * hash) + PRUNINGPOINTHASH_FIELD_NUMBER;
      hash = (53 * hash) + getPruningPointHash().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RequestPruningPointUTXOSetMessage parseFrom(
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
  public static Builder newBuilder(protowire.RequestPruningPointUTXOSetMessage prototype) {
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
   * Protobuf type {@code protowire.RequestPruningPointUTXOSetMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.RequestPruningPointUTXOSetMessage)
      protowire.RequestPruningPointUTXOSetMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.P2P.internal_static_protowire_RequestPruningPointUTXOSetMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.P2P.internal_static_protowire_RequestPruningPointUTXOSetMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.RequestPruningPointUTXOSetMessage.class, protowire.RequestPruningPointUTXOSetMessage.Builder.class);
    }

    // Construct using protowire.RequestPruningPointUTXOSetMessage.newBuilder()
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
      if (pruningPointHashBuilder_ == null) {
        pruningPointHash_ = null;
      } else {
        pruningPointHash_ = null;
        pruningPointHashBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.P2P.internal_static_protowire_RequestPruningPointUTXOSetMessage_descriptor;
    }

    @java.lang.Override
    public protowire.RequestPruningPointUTXOSetMessage getDefaultInstanceForType() {
      return protowire.RequestPruningPointUTXOSetMessage.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.RequestPruningPointUTXOSetMessage build() {
      protowire.RequestPruningPointUTXOSetMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.RequestPruningPointUTXOSetMessage buildPartial() {
      protowire.RequestPruningPointUTXOSetMessage result = new protowire.RequestPruningPointUTXOSetMessage(this);
      if (pruningPointHashBuilder_ == null) {
        result.pruningPointHash_ = pruningPointHash_;
      } else {
        result.pruningPointHash_ = pruningPointHashBuilder_.build();
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
      if (other instanceof protowire.RequestPruningPointUTXOSetMessage) {
        return mergeFrom((protowire.RequestPruningPointUTXOSetMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.RequestPruningPointUTXOSetMessage other) {
      if (other == protowire.RequestPruningPointUTXOSetMessage.getDefaultInstance()) return this;
      if (other.hasPruningPointHash()) {
        mergePruningPointHash(other.getPruningPointHash());
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
      protowire.RequestPruningPointUTXOSetMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.RequestPruningPointUTXOSetMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protowire.Hash pruningPointHash_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.Hash, protowire.Hash.Builder, protowire.HashOrBuilder> pruningPointHashBuilder_;
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     * @return Whether the pruningPointHash field is set.
     */
    public boolean hasPruningPointHash() {
      return pruningPointHashBuilder_ != null || pruningPointHash_ != null;
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     * @return The pruningPointHash.
     */
    public protowire.Hash getPruningPointHash() {
      if (pruningPointHashBuilder_ == null) {
        return pruningPointHash_ == null ? protowire.Hash.getDefaultInstance() : pruningPointHash_;
      } else {
        return pruningPointHashBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    public Builder setPruningPointHash(protowire.Hash value) {
      if (pruningPointHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pruningPointHash_ = value;
        onChanged();
      } else {
        pruningPointHashBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    public Builder setPruningPointHash(
        protowire.Hash.Builder builderForValue) {
      if (pruningPointHashBuilder_ == null) {
        pruningPointHash_ = builderForValue.build();
        onChanged();
      } else {
        pruningPointHashBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    public Builder mergePruningPointHash(protowire.Hash value) {
      if (pruningPointHashBuilder_ == null) {
        if (pruningPointHash_ != null) {
          pruningPointHash_ =
            protowire.Hash.newBuilder(pruningPointHash_).mergeFrom(value).buildPartial();
        } else {
          pruningPointHash_ = value;
        }
        onChanged();
      } else {
        pruningPointHashBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    public Builder clearPruningPointHash() {
      if (pruningPointHashBuilder_ == null) {
        pruningPointHash_ = null;
        onChanged();
      } else {
        pruningPointHash_ = null;
        pruningPointHashBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    public protowire.Hash.Builder getPruningPointHashBuilder() {
      
      onChanged();
      return getPruningPointHashFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    public protowire.HashOrBuilder getPruningPointHashOrBuilder() {
      if (pruningPointHashBuilder_ != null) {
        return pruningPointHashBuilder_.getMessageOrBuilder();
      } else {
        return pruningPointHash_ == null ?
            protowire.Hash.getDefaultInstance() : pruningPointHash_;
      }
    }
    /**
     * <code>.protowire.Hash pruningPointHash = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.Hash, protowire.Hash.Builder, protowire.HashOrBuilder> 
        getPruningPointHashFieldBuilder() {
      if (pruningPointHashBuilder_ == null) {
        pruningPointHashBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.Hash, protowire.Hash.Builder, protowire.HashOrBuilder>(
                getPruningPointHash(),
                getParentForChildren(),
                isClean());
        pruningPointHash_ = null;
      }
      return pruningPointHashBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protowire.RequestPruningPointUTXOSetMessage)
  }

  // @@protoc_insertion_point(class_scope:protowire.RequestPruningPointUTXOSetMessage)
  private static final protowire.RequestPruningPointUTXOSetMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.RequestPruningPointUTXOSetMessage();
  }

  public static protowire.RequestPruningPointUTXOSetMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestPruningPointUTXOSetMessage>
      PARSER = new com.google.protobuf.AbstractParser<RequestPruningPointUTXOSetMessage>() {
    @java.lang.Override
    public RequestPruningPointUTXOSetMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestPruningPointUTXOSetMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestPruningPointUTXOSetMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestPruningPointUTXOSetMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.RequestPruningPointUTXOSetMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
