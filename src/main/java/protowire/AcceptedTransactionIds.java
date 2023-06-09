// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.AcceptedTransactionIds}
 */
public final class AcceptedTransactionIds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.AcceptedTransactionIds)
    AcceptedTransactionIdsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcceptedTransactionIds.newBuilder() to construct.
  private AcceptedTransactionIds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcceptedTransactionIds() {
    acceptingBlockHash_ = "";
    acceptedTransactionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcceptedTransactionIds();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AcceptedTransactionIds(
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

            acceptingBlockHash_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              acceptedTransactionIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            acceptedTransactionIds_.add(s);
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
        acceptedTransactionIds_ = acceptedTransactionIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protowire.Rpc.internal_static_protowire_AcceptedTransactionIds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_AcceptedTransactionIds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.AcceptedTransactionIds.class, protowire.AcceptedTransactionIds.Builder.class);
  }

  public static final int ACCEPTINGBLOCKHASH_FIELD_NUMBER = 1;
  private volatile java.lang.Object acceptingBlockHash_;
  /**
   * <code>string acceptingBlockHash = 1;</code>
   * @return The acceptingBlockHash.
   */
  @java.lang.Override
  public java.lang.String getAcceptingBlockHash() {
    java.lang.Object ref = acceptingBlockHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceptingBlockHash_ = s;
      return s;
    }
  }
  /**
   * <code>string acceptingBlockHash = 1;</code>
   * @return The bytes for acceptingBlockHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcceptingBlockHashBytes() {
    java.lang.Object ref = acceptingBlockHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acceptingBlockHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCEPTEDTRANSACTIONIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList acceptedTransactionIds_;
  /**
   * <code>repeated string acceptedTransactionIds = 2;</code>
   * @return A list containing the acceptedTransactionIds.
   */
  public com.google.protobuf.ProtocolStringList
      getAcceptedTransactionIdsList() {
    return acceptedTransactionIds_;
  }
  /**
   * <code>repeated string acceptedTransactionIds = 2;</code>
   * @return The count of acceptedTransactionIds.
   */
  public int getAcceptedTransactionIdsCount() {
    return acceptedTransactionIds_.size();
  }
  /**
   * <code>repeated string acceptedTransactionIds = 2;</code>
   * @param index The index of the element to return.
   * @return The acceptedTransactionIds at the given index.
   */
  public java.lang.String getAcceptedTransactionIds(int index) {
    return acceptedTransactionIds_.get(index);
  }
  /**
   * <code>repeated string acceptedTransactionIds = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the acceptedTransactionIds at the given index.
   */
  public com.google.protobuf.ByteString
      getAcceptedTransactionIdsBytes(int index) {
    return acceptedTransactionIds_.getByteString(index);
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
    if (!getAcceptingBlockHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, acceptingBlockHash_);
    }
    for (int i = 0; i < acceptedTransactionIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acceptedTransactionIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAcceptingBlockHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, acceptingBlockHash_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < acceptedTransactionIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(acceptedTransactionIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAcceptedTransactionIdsList().size();
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
    if (!(obj instanceof protowire.AcceptedTransactionIds)) {
      return super.equals(obj);
    }
    protowire.AcceptedTransactionIds other = (protowire.AcceptedTransactionIds) obj;

    if (!getAcceptingBlockHash()
        .equals(other.getAcceptingBlockHash())) return false;
    if (!getAcceptedTransactionIdsList()
        .equals(other.getAcceptedTransactionIdsList())) return false;
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
    hash = (37 * hash) + ACCEPTINGBLOCKHASH_FIELD_NUMBER;
    hash = (53 * hash) + getAcceptingBlockHash().hashCode();
    if (getAcceptedTransactionIdsCount() > 0) {
      hash = (37 * hash) + ACCEPTEDTRANSACTIONIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAcceptedTransactionIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.AcceptedTransactionIds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.AcceptedTransactionIds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.AcceptedTransactionIds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.AcceptedTransactionIds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.AcceptedTransactionIds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.AcceptedTransactionIds parseFrom(
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
  public static Builder newBuilder(protowire.AcceptedTransactionIds prototype) {
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
   * Protobuf type {@code protowire.AcceptedTransactionIds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.AcceptedTransactionIds)
      protowire.AcceptedTransactionIdsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_AcceptedTransactionIds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_AcceptedTransactionIds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.AcceptedTransactionIds.class, protowire.AcceptedTransactionIds.Builder.class);
    }

    // Construct using protowire.AcceptedTransactionIds.newBuilder()
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
      acceptingBlockHash_ = "";

      acceptedTransactionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.Rpc.internal_static_protowire_AcceptedTransactionIds_descriptor;
    }

    @java.lang.Override
    public protowire.AcceptedTransactionIds getDefaultInstanceForType() {
      return protowire.AcceptedTransactionIds.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.AcceptedTransactionIds build() {
      protowire.AcceptedTransactionIds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.AcceptedTransactionIds buildPartial() {
      protowire.AcceptedTransactionIds result = new protowire.AcceptedTransactionIds(this);
      int from_bitField0_ = bitField0_;
      result.acceptingBlockHash_ = acceptingBlockHash_;
      if (((bitField0_ & 0x00000001) != 0)) {
        acceptedTransactionIds_ = acceptedTransactionIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.acceptedTransactionIds_ = acceptedTransactionIds_;
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
      if (other instanceof protowire.AcceptedTransactionIds) {
        return mergeFrom((protowire.AcceptedTransactionIds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.AcceptedTransactionIds other) {
      if (other == protowire.AcceptedTransactionIds.getDefaultInstance()) return this;
      if (!other.getAcceptingBlockHash().isEmpty()) {
        acceptingBlockHash_ = other.acceptingBlockHash_;
        onChanged();
      }
      if (!other.acceptedTransactionIds_.isEmpty()) {
        if (acceptedTransactionIds_.isEmpty()) {
          acceptedTransactionIds_ = other.acceptedTransactionIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAcceptedTransactionIdsIsMutable();
          acceptedTransactionIds_.addAll(other.acceptedTransactionIds_);
        }
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
      protowire.AcceptedTransactionIds parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.AcceptedTransactionIds) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object acceptingBlockHash_ = "";
    /**
     * <code>string acceptingBlockHash = 1;</code>
     * @return The acceptingBlockHash.
     */
    public java.lang.String getAcceptingBlockHash() {
      java.lang.Object ref = acceptingBlockHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceptingBlockHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string acceptingBlockHash = 1;</code>
     * @return The bytes for acceptingBlockHash.
     */
    public com.google.protobuf.ByteString
        getAcceptingBlockHashBytes() {
      java.lang.Object ref = acceptingBlockHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acceptingBlockHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string acceptingBlockHash = 1;</code>
     * @param value The acceptingBlockHash to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptingBlockHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      acceptingBlockHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string acceptingBlockHash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptingBlockHash() {
      
      acceptingBlockHash_ = getDefaultInstance().getAcceptingBlockHash();
      onChanged();
      return this;
    }
    /**
     * <code>string acceptingBlockHash = 1;</code>
     * @param value The bytes for acceptingBlockHash to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptingBlockHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      acceptingBlockHash_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList acceptedTransactionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAcceptedTransactionIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        acceptedTransactionIds_ = new com.google.protobuf.LazyStringArrayList(acceptedTransactionIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @return A list containing the acceptedTransactionIds.
     */
    public com.google.protobuf.ProtocolStringList
        getAcceptedTransactionIdsList() {
      return acceptedTransactionIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @return The count of acceptedTransactionIds.
     */
    public int getAcceptedTransactionIdsCount() {
      return acceptedTransactionIds_.size();
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @param index The index of the element to return.
     * @return The acceptedTransactionIds at the given index.
     */
    public java.lang.String getAcceptedTransactionIds(int index) {
      return acceptedTransactionIds_.get(index);
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the acceptedTransactionIds at the given index.
     */
    public com.google.protobuf.ByteString
        getAcceptedTransactionIdsBytes(int index) {
      return acceptedTransactionIds_.getByteString(index);
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @param index The index to set the value at.
     * @param value The acceptedTransactionIds to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptedTransactionIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAcceptedTransactionIdsIsMutable();
      acceptedTransactionIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @param value The acceptedTransactionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAcceptedTransactionIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAcceptedTransactionIdsIsMutable();
      acceptedTransactionIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @param values The acceptedTransactionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcceptedTransactionIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAcceptedTransactionIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, acceptedTransactionIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptedTransactionIds() {
      acceptedTransactionIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string acceptedTransactionIds = 2;</code>
     * @param value The bytes of the acceptedTransactionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAcceptedTransactionIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAcceptedTransactionIdsIsMutable();
      acceptedTransactionIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:protowire.AcceptedTransactionIds)
  }

  // @@protoc_insertion_point(class_scope:protowire.AcceptedTransactionIds)
  private static final protowire.AcceptedTransactionIds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.AcceptedTransactionIds();
  }

  public static protowire.AcceptedTransactionIds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceptedTransactionIds>
      PARSER = new com.google.protobuf.AbstractParser<AcceptedTransactionIds>() {
    @java.lang.Override
    public AcceptedTransactionIds parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AcceptedTransactionIds(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AcceptedTransactionIds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceptedTransactionIds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.AcceptedTransactionIds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

