// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

/**
 * Protobuf type {@code protowire.BlockMessage}
 */
public final class BlockMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.BlockMessage)
    BlockMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockMessage.newBuilder() to construct.
  private BlockMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockMessage() {
    transactions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockMessage(
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
            protowire.BlockHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(protowire.BlockHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              transactions_ = new java.util.ArrayList<protowire.TransactionMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            transactions_.add(
                input.readMessage(protowire.TransactionMessage.parser(), extensionRegistry));
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
        transactions_ = java.util.Collections.unmodifiableList(transactions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protowire.P2P.internal_static_protowire_BlockMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.P2P.internal_static_protowire_BlockMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.BlockMessage.class, protowire.BlockMessage.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private protowire.BlockHeader header_;
  /**
   * <code>.protowire.BlockHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.protowire.BlockHeader header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public protowire.BlockHeader getHeader() {
    return header_ == null ? protowire.BlockHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.protowire.BlockHeader header = 1;</code>
   */
  @java.lang.Override
  public protowire.BlockHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int TRANSACTIONS_FIELD_NUMBER = 2;
  private java.util.List<protowire.TransactionMessage> transactions_;
  /**
   * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<protowire.TransactionMessage> getTransactionsList() {
    return transactions_;
  }
  /**
   * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends protowire.TransactionMessageOrBuilder> 
      getTransactionsOrBuilderList() {
    return transactions_;
  }
  /**
   * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
   */
  @java.lang.Override
  public int getTransactionsCount() {
    return transactions_.size();
  }
  /**
   * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
   */
  @java.lang.Override
  public protowire.TransactionMessage getTransactions(int index) {
    return transactions_.get(index);
  }
  /**
   * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
   */
  @java.lang.Override
  public protowire.TransactionMessageOrBuilder getTransactionsOrBuilder(
      int index) {
    return transactions_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < transactions_.size(); i++) {
      output.writeMessage(2, transactions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < transactions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, transactions_.get(i));
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
    if (!(obj instanceof protowire.BlockMessage)) {
      return super.equals(obj);
    }
    protowire.BlockMessage other = (protowire.BlockMessage) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getTransactionsList()
        .equals(other.getTransactionsList())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getTransactionsCount() > 0) {
      hash = (37 * hash) + TRANSACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.BlockMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.BlockMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.BlockMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.BlockMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.BlockMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.BlockMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.BlockMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.BlockMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.BlockMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.BlockMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.BlockMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.BlockMessage parseFrom(
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
  public static Builder newBuilder(protowire.BlockMessage prototype) {
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
   * Protobuf type {@code protowire.BlockMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.BlockMessage)
      protowire.BlockMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.P2P.internal_static_protowire_BlockMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.P2P.internal_static_protowire_BlockMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.BlockMessage.class, protowire.BlockMessage.Builder.class);
    }

    // Construct using protowire.BlockMessage.newBuilder()
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
        getTransactionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (transactionsBuilder_ == null) {
        transactions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        transactionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.P2P.internal_static_protowire_BlockMessage_descriptor;
    }

    @java.lang.Override
    public protowire.BlockMessage getDefaultInstanceForType() {
      return protowire.BlockMessage.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.BlockMessage build() {
      protowire.BlockMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.BlockMessage buildPartial() {
      protowire.BlockMessage result = new protowire.BlockMessage(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (transactionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          transactions_ = java.util.Collections.unmodifiableList(transactions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transactions_ = transactions_;
      } else {
        result.transactions_ = transactionsBuilder_.build();
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
      if (other instanceof protowire.BlockMessage) {
        return mergeFrom((protowire.BlockMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.BlockMessage other) {
      if (other == protowire.BlockMessage.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (transactionsBuilder_ == null) {
        if (!other.transactions_.isEmpty()) {
          if (transactions_.isEmpty()) {
            transactions_ = other.transactions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransactionsIsMutable();
            transactions_.addAll(other.transactions_);
          }
          onChanged();
        }
      } else {
        if (!other.transactions_.isEmpty()) {
          if (transactionsBuilder_.isEmpty()) {
            transactionsBuilder_.dispose();
            transactionsBuilder_ = null;
            transactions_ = other.transactions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transactionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransactionsFieldBuilder() : null;
          } else {
            transactionsBuilder_.addAllMessages(other.transactions_);
          }
        }
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
      protowire.BlockMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.BlockMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private protowire.BlockHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.BlockHeader, protowire.BlockHeader.Builder, protowire.BlockHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     * @return The header.
     */
    public protowire.BlockHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? protowire.BlockHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    public Builder setHeader(protowire.BlockHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    public Builder setHeader(
        protowire.BlockHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    public Builder mergeHeader(protowire.BlockHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            protowire.BlockHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    public protowire.BlockHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    public protowire.BlockHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            protowire.BlockHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.protowire.BlockHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.BlockHeader, protowire.BlockHeader.Builder, protowire.BlockHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.BlockHeader, protowire.BlockHeader.Builder, protowire.BlockHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<protowire.TransactionMessage> transactions_ =
      java.util.Collections.emptyList();
    private void ensureTransactionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transactions_ = new java.util.ArrayList<protowire.TransactionMessage>(transactions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protowire.TransactionMessage, protowire.TransactionMessage.Builder, protowire.TransactionMessageOrBuilder> transactionsBuilder_;

    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public java.util.List<protowire.TransactionMessage> getTransactionsList() {
      if (transactionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transactions_);
      } else {
        return transactionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public int getTransactionsCount() {
      if (transactionsBuilder_ == null) {
        return transactions_.size();
      } else {
        return transactionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public protowire.TransactionMessage getTransactions(int index) {
      if (transactionsBuilder_ == null) {
        return transactions_.get(index);
      } else {
        return transactionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder setTransactions(
        int index, protowire.TransactionMessage value) {
      if (transactionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransactionsIsMutable();
        transactions_.set(index, value);
        onChanged();
      } else {
        transactionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder setTransactions(
        int index, protowire.TransactionMessage.Builder builderForValue) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.set(index, builderForValue.build());
        onChanged();
      } else {
        transactionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder addTransactions(protowire.TransactionMessage value) {
      if (transactionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransactionsIsMutable();
        transactions_.add(value);
        onChanged();
      } else {
        transactionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder addTransactions(
        int index, protowire.TransactionMessage value) {
      if (transactionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransactionsIsMutable();
        transactions_.add(index, value);
        onChanged();
      } else {
        transactionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder addTransactions(
        protowire.TransactionMessage.Builder builderForValue) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.add(builderForValue.build());
        onChanged();
      } else {
        transactionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder addTransactions(
        int index, protowire.TransactionMessage.Builder builderForValue) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.add(index, builderForValue.build());
        onChanged();
      } else {
        transactionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder addAllTransactions(
        java.lang.Iterable<? extends protowire.TransactionMessage> values) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transactions_);
        onChanged();
      } else {
        transactionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder clearTransactions() {
      if (transactionsBuilder_ == null) {
        transactions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transactionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public Builder removeTransactions(int index) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.remove(index);
        onChanged();
      } else {
        transactionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public protowire.TransactionMessage.Builder getTransactionsBuilder(
        int index) {
      return getTransactionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public protowire.TransactionMessageOrBuilder getTransactionsOrBuilder(
        int index) {
      if (transactionsBuilder_ == null) {
        return transactions_.get(index);  } else {
        return transactionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public java.util.List<? extends protowire.TransactionMessageOrBuilder> 
         getTransactionsOrBuilderList() {
      if (transactionsBuilder_ != null) {
        return transactionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transactions_);
      }
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public protowire.TransactionMessage.Builder addTransactionsBuilder() {
      return getTransactionsFieldBuilder().addBuilder(
          protowire.TransactionMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public protowire.TransactionMessage.Builder addTransactionsBuilder(
        int index) {
      return getTransactionsFieldBuilder().addBuilder(
          index, protowire.TransactionMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .protowire.TransactionMessage transactions = 2;</code>
     */
    public java.util.List<protowire.TransactionMessage.Builder> 
         getTransactionsBuilderList() {
      return getTransactionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protowire.TransactionMessage, protowire.TransactionMessage.Builder, protowire.TransactionMessageOrBuilder> 
        getTransactionsFieldBuilder() {
      if (transactionsBuilder_ == null) {
        transactionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protowire.TransactionMessage, protowire.TransactionMessage.Builder, protowire.TransactionMessageOrBuilder>(
                transactions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        transactions_ = null;
      }
      return transactionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protowire.BlockMessage)
  }

  // @@protoc_insertion_point(class_scope:protowire.BlockMessage)
  private static final protowire.BlockMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.BlockMessage();
  }

  public static protowire.BlockMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockMessage>
      PARSER = new com.google.protobuf.AbstractParser<BlockMessage>() {
    @java.lang.Override
    public BlockMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.BlockMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
