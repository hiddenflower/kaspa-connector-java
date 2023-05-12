// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

/**
 * Protobuf type {@code protowire.UtxoEntry}
 */
public final class UtxoEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.UtxoEntry)
    UtxoEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UtxoEntry.newBuilder() to construct.
  private UtxoEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UtxoEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UtxoEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UtxoEntry(
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
            protowire.ScriptPublicKey.Builder subBuilder = null;
            if (scriptPublicKey_ != null) {
              subBuilder = scriptPublicKey_.toBuilder();
            }
            scriptPublicKey_ = input.readMessage(protowire.ScriptPublicKey.parser(), extensionRegistry);
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
    return protowire.P2P.internal_static_protowire_UtxoEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.P2P.internal_static_protowire_UtxoEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.UtxoEntry.class, protowire.UtxoEntry.Builder.class);
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
  private protowire.ScriptPublicKey scriptPublicKey_;
  /**
   * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
   * @return Whether the scriptPublicKey field is set.
   */
  @java.lang.Override
  public boolean hasScriptPublicKey() {
    return scriptPublicKey_ != null;
  }
  /**
   * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
   * @return The scriptPublicKey.
   */
  @java.lang.Override
  public protowire.ScriptPublicKey getScriptPublicKey() {
    return scriptPublicKey_ == null ? protowire.ScriptPublicKey.getDefaultInstance() : scriptPublicKey_;
  }
  /**
   * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
   */
  @java.lang.Override
  public protowire.ScriptPublicKeyOrBuilder getScriptPublicKeyOrBuilder() {
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
    if (!(obj instanceof protowire.UtxoEntry)) {
      return super.equals(obj);
    }
    protowire.UtxoEntry other = (protowire.UtxoEntry) obj;

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

  public static protowire.UtxoEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.UtxoEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.UtxoEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.UtxoEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.UtxoEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.UtxoEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.UtxoEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.UtxoEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.UtxoEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.UtxoEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.UtxoEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.UtxoEntry parseFrom(
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
  public static Builder newBuilder(protowire.UtxoEntry prototype) {
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
   * Protobuf type {@code protowire.UtxoEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.UtxoEntry)
      protowire.UtxoEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.P2P.internal_static_protowire_UtxoEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.P2P.internal_static_protowire_UtxoEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.UtxoEntry.class, protowire.UtxoEntry.Builder.class);
    }

    // Construct using protowire.UtxoEntry.newBuilder()
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
      return protowire.P2P.internal_static_protowire_UtxoEntry_descriptor;
    }

    @java.lang.Override
    public protowire.UtxoEntry getDefaultInstanceForType() {
      return protowire.UtxoEntry.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.UtxoEntry build() {
      protowire.UtxoEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.UtxoEntry buildPartial() {
      protowire.UtxoEntry result = new protowire.UtxoEntry(this);
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
      if (other instanceof protowire.UtxoEntry) {
        return mergeFrom((protowire.UtxoEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.UtxoEntry other) {
      if (other == protowire.UtxoEntry.getDefaultInstance()) return this;
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
      protowire.UtxoEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.UtxoEntry) e.getUnfinishedMessage();
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

    private protowire.ScriptPublicKey scriptPublicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.ScriptPublicKey, protowire.ScriptPublicKey.Builder, protowire.ScriptPublicKeyOrBuilder> scriptPublicKeyBuilder_;
    /**
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     * @return Whether the scriptPublicKey field is set.
     */
    public boolean hasScriptPublicKey() {
      return scriptPublicKeyBuilder_ != null || scriptPublicKey_ != null;
    }
    /**
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     * @return The scriptPublicKey.
     */
    public protowire.ScriptPublicKey getScriptPublicKey() {
      if (scriptPublicKeyBuilder_ == null) {
        return scriptPublicKey_ == null ? protowire.ScriptPublicKey.getDefaultInstance() : scriptPublicKey_;
      } else {
        return scriptPublicKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder setScriptPublicKey(protowire.ScriptPublicKey value) {
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
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder setScriptPublicKey(
        protowire.ScriptPublicKey.Builder builderForValue) {
      if (scriptPublicKeyBuilder_ == null) {
        scriptPublicKey_ = builderForValue.build();
        onChanged();
      } else {
        scriptPublicKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     */
    public Builder mergeScriptPublicKey(protowire.ScriptPublicKey value) {
      if (scriptPublicKeyBuilder_ == null) {
        if (scriptPublicKey_ != null) {
          scriptPublicKey_ =
            protowire.ScriptPublicKey.newBuilder(scriptPublicKey_).mergeFrom(value).buildPartial();
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
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
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
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     */
    public protowire.ScriptPublicKey.Builder getScriptPublicKeyBuilder() {
      
      onChanged();
      return getScriptPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     */
    public protowire.ScriptPublicKeyOrBuilder getScriptPublicKeyOrBuilder() {
      if (scriptPublicKeyBuilder_ != null) {
        return scriptPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return scriptPublicKey_ == null ?
            protowire.ScriptPublicKey.getDefaultInstance() : scriptPublicKey_;
      }
    }
    /**
     * <code>.protowire.ScriptPublicKey scriptPublicKey = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.ScriptPublicKey, protowire.ScriptPublicKey.Builder, protowire.ScriptPublicKeyOrBuilder> 
        getScriptPublicKeyFieldBuilder() {
      if (scriptPublicKeyBuilder_ == null) {
        scriptPublicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.ScriptPublicKey, protowire.ScriptPublicKey.Builder, protowire.ScriptPublicKeyOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:protowire.UtxoEntry)
  }

  // @@protoc_insertion_point(class_scope:protowire.UtxoEntry)
  private static final protowire.UtxoEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.UtxoEntry();
  }

  public static protowire.UtxoEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UtxoEntry>
      PARSER = new com.google.protobuf.AbstractParser<UtxoEntry>() {
    @java.lang.Override
    public UtxoEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UtxoEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UtxoEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UtxoEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.UtxoEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
