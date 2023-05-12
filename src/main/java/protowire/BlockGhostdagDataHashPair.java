// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

/**
 * Protobuf type {@code protowire.BlockGhostdagDataHashPair}
 */
public final class BlockGhostdagDataHashPair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.BlockGhostdagDataHashPair)
    BlockGhostdagDataHashPairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockGhostdagDataHashPair.newBuilder() to construct.
  private BlockGhostdagDataHashPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockGhostdagDataHashPair() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockGhostdagDataHashPair();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockGhostdagDataHashPair(
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
            if (hash_ != null) {
              subBuilder = hash_.toBuilder();
            }
            hash_ = input.readMessage(protowire.Hash.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hash_);
              hash_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            protowire.GhostdagData.Builder subBuilder = null;
            if (ghostdagData_ != null) {
              subBuilder = ghostdagData_.toBuilder();
            }
            ghostdagData_ = input.readMessage(protowire.GhostdagData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ghostdagData_);
              ghostdagData_ = subBuilder.buildPartial();
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
    return protowire.P2P.internal_static_protowire_BlockGhostdagDataHashPair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.P2P.internal_static_protowire_BlockGhostdagDataHashPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.BlockGhostdagDataHashPair.class, protowire.BlockGhostdagDataHashPair.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private protowire.Hash hash_;
  /**
   * <code>.protowire.Hash hash = 1;</code>
   * @return Whether the hash field is set.
   */
  @java.lang.Override
  public boolean hasHash() {
    return hash_ != null;
  }
  /**
   * <code>.protowire.Hash hash = 1;</code>
   * @return The hash.
   */
  @java.lang.Override
  public protowire.Hash getHash() {
    return hash_ == null ? protowire.Hash.getDefaultInstance() : hash_;
  }
  /**
   * <code>.protowire.Hash hash = 1;</code>
   */
  @java.lang.Override
  public protowire.HashOrBuilder getHashOrBuilder() {
    return getHash();
  }

  public static final int GHOSTDAGDATA_FIELD_NUMBER = 2;
  private protowire.GhostdagData ghostdagData_;
  /**
   * <code>.protowire.GhostdagData ghostdagData = 2;</code>
   * @return Whether the ghostdagData field is set.
   */
  @java.lang.Override
  public boolean hasGhostdagData() {
    return ghostdagData_ != null;
  }
  /**
   * <code>.protowire.GhostdagData ghostdagData = 2;</code>
   * @return The ghostdagData.
   */
  @java.lang.Override
  public protowire.GhostdagData getGhostdagData() {
    return ghostdagData_ == null ? protowire.GhostdagData.getDefaultInstance() : ghostdagData_;
  }
  /**
   * <code>.protowire.GhostdagData ghostdagData = 2;</code>
   */
  @java.lang.Override
  public protowire.GhostdagDataOrBuilder getGhostdagDataOrBuilder() {
    return getGhostdagData();
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
    if (hash_ != null) {
      output.writeMessage(1, getHash());
    }
    if (ghostdagData_ != null) {
      output.writeMessage(2, getGhostdagData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hash_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHash());
    }
    if (ghostdagData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGhostdagData());
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
    if (!(obj instanceof protowire.BlockGhostdagDataHashPair)) {
      return super.equals(obj);
    }
    protowire.BlockGhostdagDataHashPair other = (protowire.BlockGhostdagDataHashPair) obj;

    if (hasHash() != other.hasHash()) return false;
    if (hasHash()) {
      if (!getHash()
          .equals(other.getHash())) return false;
    }
    if (hasGhostdagData() != other.hasGhostdagData()) return false;
    if (hasGhostdagData()) {
      if (!getGhostdagData()
          .equals(other.getGhostdagData())) return false;
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
    if (hasHash()) {
      hash = (37 * hash) + HASH_FIELD_NUMBER;
      hash = (53 * hash) + getHash().hashCode();
    }
    if (hasGhostdagData()) {
      hash = (37 * hash) + GHOSTDAGDATA_FIELD_NUMBER;
      hash = (53 * hash) + getGhostdagData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.BlockGhostdagDataHashPair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.BlockGhostdagDataHashPair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.BlockGhostdagDataHashPair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.BlockGhostdagDataHashPair parseFrom(
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
  public static Builder newBuilder(protowire.BlockGhostdagDataHashPair prototype) {
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
   * Protobuf type {@code protowire.BlockGhostdagDataHashPair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.BlockGhostdagDataHashPair)
      protowire.BlockGhostdagDataHashPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.P2P.internal_static_protowire_BlockGhostdagDataHashPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.P2P.internal_static_protowire_BlockGhostdagDataHashPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.BlockGhostdagDataHashPair.class, protowire.BlockGhostdagDataHashPair.Builder.class);
    }

    // Construct using protowire.BlockGhostdagDataHashPair.newBuilder()
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
      if (hashBuilder_ == null) {
        hash_ = null;
      } else {
        hash_ = null;
        hashBuilder_ = null;
      }
      if (ghostdagDataBuilder_ == null) {
        ghostdagData_ = null;
      } else {
        ghostdagData_ = null;
        ghostdagDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.P2P.internal_static_protowire_BlockGhostdagDataHashPair_descriptor;
    }

    @java.lang.Override
    public protowire.BlockGhostdagDataHashPair getDefaultInstanceForType() {
      return protowire.BlockGhostdagDataHashPair.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.BlockGhostdagDataHashPair build() {
      protowire.BlockGhostdagDataHashPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.BlockGhostdagDataHashPair buildPartial() {
      protowire.BlockGhostdagDataHashPair result = new protowire.BlockGhostdagDataHashPair(this);
      if (hashBuilder_ == null) {
        result.hash_ = hash_;
      } else {
        result.hash_ = hashBuilder_.build();
      }
      if (ghostdagDataBuilder_ == null) {
        result.ghostdagData_ = ghostdagData_;
      } else {
        result.ghostdagData_ = ghostdagDataBuilder_.build();
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
      if (other instanceof protowire.BlockGhostdagDataHashPair) {
        return mergeFrom((protowire.BlockGhostdagDataHashPair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.BlockGhostdagDataHashPair other) {
      if (other == protowire.BlockGhostdagDataHashPair.getDefaultInstance()) return this;
      if (other.hasHash()) {
        mergeHash(other.getHash());
      }
      if (other.hasGhostdagData()) {
        mergeGhostdagData(other.getGhostdagData());
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
      protowire.BlockGhostdagDataHashPair parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.BlockGhostdagDataHashPair) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protowire.Hash hash_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.Hash, protowire.Hash.Builder, protowire.HashOrBuilder> hashBuilder_;
    /**
     * <code>.protowire.Hash hash = 1;</code>
     * @return Whether the hash field is set.
     */
    public boolean hasHash() {
      return hashBuilder_ != null || hash_ != null;
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     * @return The hash.
     */
    public protowire.Hash getHash() {
      if (hashBuilder_ == null) {
        return hash_ == null ? protowire.Hash.getDefaultInstance() : hash_;
      } else {
        return hashBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    public Builder setHash(protowire.Hash value) {
      if (hashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hash_ = value;
        onChanged();
      } else {
        hashBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    public Builder setHash(
        protowire.Hash.Builder builderForValue) {
      if (hashBuilder_ == null) {
        hash_ = builderForValue.build();
        onChanged();
      } else {
        hashBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    public Builder mergeHash(protowire.Hash value) {
      if (hashBuilder_ == null) {
        if (hash_ != null) {
          hash_ =
            protowire.Hash.newBuilder(hash_).mergeFrom(value).buildPartial();
        } else {
          hash_ = value;
        }
        onChanged();
      } else {
        hashBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    public Builder clearHash() {
      if (hashBuilder_ == null) {
        hash_ = null;
        onChanged();
      } else {
        hash_ = null;
        hashBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    public protowire.Hash.Builder getHashBuilder() {
      
      onChanged();
      return getHashFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    public protowire.HashOrBuilder getHashOrBuilder() {
      if (hashBuilder_ != null) {
        return hashBuilder_.getMessageOrBuilder();
      } else {
        return hash_ == null ?
            protowire.Hash.getDefaultInstance() : hash_;
      }
    }
    /**
     * <code>.protowire.Hash hash = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.Hash, protowire.Hash.Builder, protowire.HashOrBuilder> 
        getHashFieldBuilder() {
      if (hashBuilder_ == null) {
        hashBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.Hash, protowire.Hash.Builder, protowire.HashOrBuilder>(
                getHash(),
                getParentForChildren(),
                isClean());
        hash_ = null;
      }
      return hashBuilder_;
    }

    private protowire.GhostdagData ghostdagData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.GhostdagData, protowire.GhostdagData.Builder, protowire.GhostdagDataOrBuilder> ghostdagDataBuilder_;
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     * @return Whether the ghostdagData field is set.
     */
    public boolean hasGhostdagData() {
      return ghostdagDataBuilder_ != null || ghostdagData_ != null;
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     * @return The ghostdagData.
     */
    public protowire.GhostdagData getGhostdagData() {
      if (ghostdagDataBuilder_ == null) {
        return ghostdagData_ == null ? protowire.GhostdagData.getDefaultInstance() : ghostdagData_;
      } else {
        return ghostdagDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    public Builder setGhostdagData(protowire.GhostdagData value) {
      if (ghostdagDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ghostdagData_ = value;
        onChanged();
      } else {
        ghostdagDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    public Builder setGhostdagData(
        protowire.GhostdagData.Builder builderForValue) {
      if (ghostdagDataBuilder_ == null) {
        ghostdagData_ = builderForValue.build();
        onChanged();
      } else {
        ghostdagDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    public Builder mergeGhostdagData(protowire.GhostdagData value) {
      if (ghostdagDataBuilder_ == null) {
        if (ghostdagData_ != null) {
          ghostdagData_ =
            protowire.GhostdagData.newBuilder(ghostdagData_).mergeFrom(value).buildPartial();
        } else {
          ghostdagData_ = value;
        }
        onChanged();
      } else {
        ghostdagDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    public Builder clearGhostdagData() {
      if (ghostdagDataBuilder_ == null) {
        ghostdagData_ = null;
        onChanged();
      } else {
        ghostdagData_ = null;
        ghostdagDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    public protowire.GhostdagData.Builder getGhostdagDataBuilder() {
      
      onChanged();
      return getGhostdagDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    public protowire.GhostdagDataOrBuilder getGhostdagDataOrBuilder() {
      if (ghostdagDataBuilder_ != null) {
        return ghostdagDataBuilder_.getMessageOrBuilder();
      } else {
        return ghostdagData_ == null ?
            protowire.GhostdagData.getDefaultInstance() : ghostdagData_;
      }
    }
    /**
     * <code>.protowire.GhostdagData ghostdagData = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.GhostdagData, protowire.GhostdagData.Builder, protowire.GhostdagDataOrBuilder> 
        getGhostdagDataFieldBuilder() {
      if (ghostdagDataBuilder_ == null) {
        ghostdagDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.GhostdagData, protowire.GhostdagData.Builder, protowire.GhostdagDataOrBuilder>(
                getGhostdagData(),
                getParentForChildren(),
                isClean());
        ghostdagData_ = null;
      }
      return ghostdagDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protowire.BlockGhostdagDataHashPair)
  }

  // @@protoc_insertion_point(class_scope:protowire.BlockGhostdagDataHashPair)
  private static final protowire.BlockGhostdagDataHashPair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.BlockGhostdagDataHashPair();
  }

  public static protowire.BlockGhostdagDataHashPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockGhostdagDataHashPair>
      PARSER = new com.google.protobuf.AbstractParser<BlockGhostdagDataHashPair>() {
    @java.lang.Override
    public BlockGhostdagDataHashPair parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockGhostdagDataHashPair(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockGhostdagDataHashPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockGhostdagDataHashPair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.BlockGhostdagDataHashPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
