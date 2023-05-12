// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.RpcUtxoEntry}
 */
public final class RpcUtxoEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.RpcUtxoEntry)
    RpcUtxoEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RpcUtxoEntry.newBuilder() to construct.
  private RpcUtxoEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RpcUtxoEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RpcUtxoEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RpcUtxoEntry(
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

            amount_ = input.readUInt64();
            break;
          }
          case 18: {
            protowire.RpcScriptPublicKey.Builder subBuilder = null;
            if (scriptPublicKey_ != null) {
              subBuilder = scriptPublicKey_.toBuilder();
            }
            scriptPublicKey_ = input.readMessage(protowire.RpcScriptPublicKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(scriptPublicKey_);
              scriptPublicKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            blockDaaScore_ = input.readUInt64();
            break;
          }
          case 32: {

            isCoinbase_ = input.readBool();
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
    return protowire.Rpc.internal_static_protowire_RpcUtxoEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_RpcUtxoEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.RpcUtxoEntry.class, protowire.RpcUtxoEntry.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private long amount_;
  /**
   * <code>uint64 amount = 1;</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
  }

  public static final int SCRIPTPUBLICKEY_FIELD_NUMBER = 2;
  private protowire.RpcScriptPublicKey scriptPublicKey_;
  /**
   * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
   * @return Whether the scriptPublicKey field is set.
   */
  @java.lang.Override
  public boolean hasScriptPublicKey() {
    return scriptPublicKey_ != null;
  }
  /**
   * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
   * @return The scriptPublicKey.
   */
  @java.lang.Override
  public protowire.RpcScriptPublicKey getScriptPublicKey() {
    return scriptPublicKey_ == null ? protowire.RpcScriptPublicKey.getDefaultInstance() : scriptPublicKey_;
  }
  /**
   * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
   */
  @java.lang.Override
  public protowire.RpcScriptPublicKeyOrBuilder getScriptPublicKeyOrBuilder() {
    return getScriptPublicKey();
  }

  public static final int BLOCKDAASCORE_FIELD_NUMBER = 3;
  private long blockDaaScore_;
  /**
   * <code>uint64 blockDaaScore = 3;</code>
   * @return The blockDaaScore.
   */
  @java.lang.Override
  public long getBlockDaaScore() {
    return blockDaaScore_;
  }

  public static final int ISCOINBASE_FIELD_NUMBER = 4;
  private boolean isCoinbase_;
  /**
   * <code>bool isCoinbase = 4;</code>
   * @return The isCoinbase.
   */
  @java.lang.Override
  public boolean getIsCoinbase() {
    return isCoinbase_;
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
    if (amount_ != 0L) {
      output.writeUInt64(1, amount_);
    }
    if (scriptPublicKey_ != null) {
      output.writeMessage(2, getScriptPublicKey());
    }
    if (blockDaaScore_ != 0L) {
      output.writeUInt64(3, blockDaaScore_);
    }
    if (isCoinbase_ != false) {
      output.writeBool(4, isCoinbase_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, amount_);
    }
    if (scriptPublicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getScriptPublicKey());
    }
    if (blockDaaScore_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, blockDaaScore_);
    }
    if (isCoinbase_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isCoinbase_);
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
    if (!(obj instanceof protowire.RpcUtxoEntry)) {
      return super.equals(obj);
    }
    protowire.RpcUtxoEntry other = (protowire.RpcUtxoEntry) obj;

    if (getAmount()
        != other.getAmount()) return false;
    if (hasScriptPublicKey() != other.hasScriptPublicKey()) return false;
    if (hasScriptPublicKey()) {
      if (!getScriptPublicKey()
          .equals(other.getScriptPublicKey())) return false;
    }
    if (getBlockDaaScore()
        != other.getBlockDaaScore()) return false;
    if (getIsCoinbase()
        != other.getIsCoinbase()) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    if (hasScriptPublicKey()) {
      hash = (37 * hash) + SCRIPTPUBLICKEY_FIELD_NUMBER;
      hash = (53 * hash) + getScriptPublicKey().hashCode();
    }
    hash = (37 * hash) + BLOCKDAASCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockDaaScore());
    hash = (37 * hash) + ISCOINBASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCoinbase());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.RpcUtxoEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcUtxoEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcUtxoEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcUtxoEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcUtxoEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcUtxoEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcUtxoEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RpcUtxoEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RpcUtxoEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.RpcUtxoEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RpcUtxoEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RpcUtxoEntry parseFrom(
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
  public static Builder newBuilder(protowire.RpcUtxoEntry prototype) {
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
   * Protobuf type {@code protowire.RpcUtxoEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.RpcUtxoEntry)
      protowire.RpcUtxoEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_RpcUtxoEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_RpcUtxoEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.RpcUtxoEntry.class, protowire.RpcUtxoEntry.Builder.class);
    }

    // Construct using protowire.RpcUtxoEntry.newBuilder()
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
      amount_ = 0L;

      if (scriptPublicKeyBuilder_ == null) {
        scriptPublicKey_ = null;
      } else {
        scriptPublicKey_ = null;
        scriptPublicKeyBuilder_ = null;
      }
      blockDaaScore_ = 0L;

      isCoinbase_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.Rpc.internal_static_protowire_RpcUtxoEntry_descriptor;
    }

    @java.lang.Override
    public protowire.RpcUtxoEntry getDefaultInstanceForType() {
      return protowire.RpcUtxoEntry.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.RpcUtxoEntry build() {
      protowire.RpcUtxoEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.RpcUtxoEntry buildPartial() {
      protowire.RpcUtxoEntry result = new protowire.RpcUtxoEntry(this);
      result.amount_ = amount_;
      if (scriptPublicKeyBuilder_ == null) {
        result.scriptPublicKey_ = scriptPublicKey_;
      } else {
        result.scriptPublicKey_ = scriptPublicKeyBuilder_.build();
      }
      result.blockDaaScore_ = blockDaaScore_;
      result.isCoinbase_ = isCoinbase_;
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
      if (other instanceof protowire.RpcUtxoEntry) {
        return mergeFrom((protowire.RpcUtxoEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.RpcUtxoEntry other) {
      if (other == protowire.RpcUtxoEntry.getDefaultInstance()) return this;
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (other.hasScriptPublicKey()) {
        mergeScriptPublicKey(other.getScriptPublicKey());
      }
      if (other.getBlockDaaScore() != 0L) {
        setBlockDaaScore(other.getBlockDaaScore());
      }
      if (other.getIsCoinbase() != false) {
        setIsCoinbase(other.getIsCoinbase());
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
      protowire.RpcUtxoEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.RpcUtxoEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long amount_ ;
    /**
     * <code>uint64 amount = 1;</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <code>uint64 amount = 1;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 amount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0L;
      onChanged();
      return this;
    }

    private protowire.RpcScriptPublicKey scriptPublicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RpcScriptPublicKey, protowire.RpcScriptPublicKey.Builder, protowire.RpcScriptPublicKeyOrBuilder> scriptPublicKeyBuilder_;
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     * @return Whether the scriptPublicKey field is set.
     */
    public boolean hasScriptPublicKey() {
      return scriptPublicKeyBuilder_ != null || scriptPublicKey_ != null;
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     * @return The scriptPublicKey.
     */
    public protowire.RpcScriptPublicKey getScriptPublicKey() {
      if (scriptPublicKeyBuilder_ == null) {
        return scriptPublicKey_ == null ? protowire.RpcScriptPublicKey.getDefaultInstance() : scriptPublicKey_;
      } else {
        return scriptPublicKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder setScriptPublicKey(protowire.RpcScriptPublicKey value) {
      if (scriptPublicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scriptPublicKey_ = value;
        onChanged();
      } else {
        scriptPublicKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder setScriptPublicKey(
        protowire.RpcScriptPublicKey.Builder builderForValue) {
      if (scriptPublicKeyBuilder_ == null) {
        scriptPublicKey_ = builderForValue.build();
        onChanged();
      } else {
        scriptPublicKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder mergeScriptPublicKey(protowire.RpcScriptPublicKey value) {
      if (scriptPublicKeyBuilder_ == null) {
        if (scriptPublicKey_ != null) {
          scriptPublicKey_ =
            protowire.RpcScriptPublicKey.newBuilder(scriptPublicKey_).mergeFrom(value).buildPartial();
        } else {
          scriptPublicKey_ = value;
        }
        onChanged();
      } else {
        scriptPublicKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder clearScriptPublicKey() {
      if (scriptPublicKeyBuilder_ == null) {
        scriptPublicKey_ = null;
        onChanged();
      } else {
        scriptPublicKey_ = null;
        scriptPublicKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    public protowire.RpcScriptPublicKey.Builder getScriptPublicKeyBuilder() {
      
      onChanged();
      return getScriptPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    public protowire.RpcScriptPublicKeyOrBuilder getScriptPublicKeyOrBuilder() {
      if (scriptPublicKeyBuilder_ != null) {
        return scriptPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return scriptPublicKey_ == null ?
            protowire.RpcScriptPublicKey.getDefaultInstance() : scriptPublicKey_;
      }
    }
    /**
     * <code>.protowire.RpcScriptPublicKey scriptPublicKey = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RpcScriptPublicKey, protowire.RpcScriptPublicKey.Builder, protowire.RpcScriptPublicKeyOrBuilder> 
        getScriptPublicKeyFieldBuilder() {
      if (scriptPublicKeyBuilder_ == null) {
        scriptPublicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.RpcScriptPublicKey, protowire.RpcScriptPublicKey.Builder, protowire.RpcScriptPublicKeyOrBuilder>(
                getScriptPublicKey(),
                getParentForChildren(),
                isClean());
        scriptPublicKey_ = null;
      }
      return scriptPublicKeyBuilder_;
    }

    private long blockDaaScore_ ;
    /**
     * <code>uint64 blockDaaScore = 3;</code>
     * @return The blockDaaScore.
     */
    @java.lang.Override
    public long getBlockDaaScore() {
      return blockDaaScore_;
    }
    /**
     * <code>uint64 blockDaaScore = 3;</code>
     * @param value The blockDaaScore to set.
     * @return This builder for chaining.
     */
    public Builder setBlockDaaScore(long value) {
      
      blockDaaScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 blockDaaScore = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockDaaScore() {
      
      blockDaaScore_ = 0L;
      onChanged();
      return this;
    }

    private boolean isCoinbase_ ;
    /**
     * <code>bool isCoinbase = 4;</code>
     * @return The isCoinbase.
     */
    @java.lang.Override
    public boolean getIsCoinbase() {
      return isCoinbase_;
    }
    /**
     * <code>bool isCoinbase = 4;</code>
     * @param value The isCoinbase to set.
     * @return This builder for chaining.
     */
    public Builder setIsCoinbase(boolean value) {
      
      isCoinbase_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isCoinbase = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsCoinbase() {
      
      isCoinbase_ = false;
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


    // @@protoc_insertion_point(builder_scope:protowire.RpcUtxoEntry)
  }

  // @@protoc_insertion_point(class_scope:protowire.RpcUtxoEntry)
  private static final protowire.RpcUtxoEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.RpcUtxoEntry();
  }

  public static protowire.RpcUtxoEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RpcUtxoEntry>
      PARSER = new com.google.protobuf.AbstractParser<RpcUtxoEntry>() {
    @java.lang.Override
    public RpcUtxoEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RpcUtxoEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RpcUtxoEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RpcUtxoEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.RpcUtxoEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
