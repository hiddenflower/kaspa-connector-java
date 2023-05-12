// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package protowire;

/**
 * Protobuf type {@code protowire.TransactionInput}
 */
public final class TransactionInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.TransactionInput)
    TransactionInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionInput.newBuilder() to construct.
  private TransactionInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionInput() {
    signatureScript_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransactionInput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransactionInput(
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
            protowire.Outpoint.Builder subBuilder = null;
            if (previousOutpoint_ != null) {
              subBuilder = previousOutpoint_.toBuilder();
            }
            previousOutpoint_ = input.readMessage(protowire.Outpoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(previousOutpoint_);
              previousOutpoint_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            signatureScript_ = input.readBytes();
            break;
          }
          case 24: {

            sequence_ = input.readUInt64();
            break;
          }
          case 32: {

            sigOpCount_ = input.readUInt32();
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
    return protowire.P2P.internal_static_protowire_TransactionInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.P2P.internal_static_protowire_TransactionInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.TransactionInput.class, protowire.TransactionInput.Builder.class);
  }

  public static final int PREVIOUSOUTPOINT_FIELD_NUMBER = 1;
  private protowire.Outpoint previousOutpoint_;
  /**
   * <code>.protowire.Outpoint previousOutpoint = 1;</code>
   * @return Whether the previousOutpoint field is set.
   */
  @java.lang.Override
  public boolean hasPreviousOutpoint() {
    return previousOutpoint_ != null;
  }
  /**
   * <code>.protowire.Outpoint previousOutpoint = 1;</code>
   * @return The previousOutpoint.
   */
  @java.lang.Override
  public protowire.Outpoint getPreviousOutpoint() {
    return previousOutpoint_ == null ? protowire.Outpoint.getDefaultInstance() : previousOutpoint_;
  }
  /**
   * <code>.protowire.Outpoint previousOutpoint = 1;</code>
   */
  @java.lang.Override
  public protowire.OutpointOrBuilder getPreviousOutpointOrBuilder() {
    return getPreviousOutpoint();
  }

  public static final int SIGNATURESCRIPT_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signatureScript_;
  /**
   * <code>bytes signatureScript = 2;</code>
   * @return The signatureScript.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignatureScript() {
    return signatureScript_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 3;
  private long sequence_;
  /**
   * <code>uint64 sequence = 3;</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
  }

  public static final int SIGOPCOUNT_FIELD_NUMBER = 4;
  private int sigOpCount_;
  /**
   * <code>uint32 sigOpCount = 4;</code>
   * @return The sigOpCount.
   */
  @java.lang.Override
  public int getSigOpCount() {
    return sigOpCount_;
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
    if (previousOutpoint_ != null) {
      output.writeMessage(1, getPreviousOutpoint());
    }
    if (!signatureScript_.isEmpty()) {
      output.writeBytes(2, signatureScript_);
    }
    if (sequence_ != 0L) {
      output.writeUInt64(3, sequence_);
    }
    if (sigOpCount_ != 0) {
      output.writeUInt32(4, sigOpCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (previousOutpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPreviousOutpoint());
    }
    if (!signatureScript_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signatureScript_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, sequence_);
    }
    if (sigOpCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, sigOpCount_);
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
    if (!(obj instanceof protowire.TransactionInput)) {
      return super.equals(obj);
    }
    protowire.TransactionInput other = (protowire.TransactionInput) obj;

    if (hasPreviousOutpoint() != other.hasPreviousOutpoint()) return false;
    if (hasPreviousOutpoint()) {
      if (!getPreviousOutpoint()
          .equals(other.getPreviousOutpoint())) return false;
    }
    if (!getSignatureScript()
        .equals(other.getSignatureScript())) return false;
    if (getSequence()
        != other.getSequence()) return false;
    if (getSigOpCount()
        != other.getSigOpCount()) return false;
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
    if (hasPreviousOutpoint()) {
      hash = (37 * hash) + PREVIOUSOUTPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getPreviousOutpoint().hashCode();
    }
    hash = (37 * hash) + SIGNATURESCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getSignatureScript().hashCode();
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (37 * hash) + SIGOPCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSigOpCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.TransactionInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.TransactionInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.TransactionInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.TransactionInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.TransactionInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.TransactionInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.TransactionInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.TransactionInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.TransactionInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.TransactionInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.TransactionInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.TransactionInput parseFrom(
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
  public static Builder newBuilder(protowire.TransactionInput prototype) {
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
   * Protobuf type {@code protowire.TransactionInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.TransactionInput)
      protowire.TransactionInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.P2P.internal_static_protowire_TransactionInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.P2P.internal_static_protowire_TransactionInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.TransactionInput.class, protowire.TransactionInput.Builder.class);
    }

    // Construct using protowire.TransactionInput.newBuilder()
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
      if (previousOutpointBuilder_ == null) {
        previousOutpoint_ = null;
      } else {
        previousOutpoint_ = null;
        previousOutpointBuilder_ = null;
      }
      signatureScript_ = com.google.protobuf.ByteString.EMPTY;

      sequence_ = 0L;

      sigOpCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.P2P.internal_static_protowire_TransactionInput_descriptor;
    }

    @java.lang.Override
    public protowire.TransactionInput getDefaultInstanceForType() {
      return protowire.TransactionInput.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.TransactionInput build() {
      protowire.TransactionInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.TransactionInput buildPartial() {
      protowire.TransactionInput result = new protowire.TransactionInput(this);
      if (previousOutpointBuilder_ == null) {
        result.previousOutpoint_ = previousOutpoint_;
      } else {
        result.previousOutpoint_ = previousOutpointBuilder_.build();
      }
      result.signatureScript_ = signatureScript_;
      result.sequence_ = sequence_;
      result.sigOpCount_ = sigOpCount_;
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
      if (other instanceof protowire.TransactionInput) {
        return mergeFrom((protowire.TransactionInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.TransactionInput other) {
      if (other == protowire.TransactionInput.getDefaultInstance()) return this;
      if (other.hasPreviousOutpoint()) {
        mergePreviousOutpoint(other.getPreviousOutpoint());
      }
      if (other.getSignatureScript() != com.google.protobuf.ByteString.EMPTY) {
        setSignatureScript(other.getSignatureScript());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.getSigOpCount() != 0) {
        setSigOpCount(other.getSigOpCount());
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
      protowire.TransactionInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.TransactionInput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protowire.Outpoint previousOutpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.Outpoint, protowire.Outpoint.Builder, protowire.OutpointOrBuilder> previousOutpointBuilder_;
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     * @return Whether the previousOutpoint field is set.
     */
    public boolean hasPreviousOutpoint() {
      return previousOutpointBuilder_ != null || previousOutpoint_ != null;
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     * @return The previousOutpoint.
     */
    public protowire.Outpoint getPreviousOutpoint() {
      if (previousOutpointBuilder_ == null) {
        return previousOutpoint_ == null ? protowire.Outpoint.getDefaultInstance() : previousOutpoint_;
      } else {
        return previousOutpointBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    public Builder setPreviousOutpoint(protowire.Outpoint value) {
      if (previousOutpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        previousOutpoint_ = value;
        onChanged();
      } else {
        previousOutpointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    public Builder setPreviousOutpoint(
        protowire.Outpoint.Builder builderForValue) {
      if (previousOutpointBuilder_ == null) {
        previousOutpoint_ = builderForValue.build();
        onChanged();
      } else {
        previousOutpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    public Builder mergePreviousOutpoint(protowire.Outpoint value) {
      if (previousOutpointBuilder_ == null) {
        if (previousOutpoint_ != null) {
          previousOutpoint_ =
            protowire.Outpoint.newBuilder(previousOutpoint_).mergeFrom(value).buildPartial();
        } else {
          previousOutpoint_ = value;
        }
        onChanged();
      } else {
        previousOutpointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    public Builder clearPreviousOutpoint() {
      if (previousOutpointBuilder_ == null) {
        previousOutpoint_ = null;
        onChanged();
      } else {
        previousOutpoint_ = null;
        previousOutpointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    public protowire.Outpoint.Builder getPreviousOutpointBuilder() {
      
      onChanged();
      return getPreviousOutpointFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    public protowire.OutpointOrBuilder getPreviousOutpointOrBuilder() {
      if (previousOutpointBuilder_ != null) {
        return previousOutpointBuilder_.getMessageOrBuilder();
      } else {
        return previousOutpoint_ == null ?
            protowire.Outpoint.getDefaultInstance() : previousOutpoint_;
      }
    }
    /**
     * <code>.protowire.Outpoint previousOutpoint = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.Outpoint, protowire.Outpoint.Builder, protowire.OutpointOrBuilder> 
        getPreviousOutpointFieldBuilder() {
      if (previousOutpointBuilder_ == null) {
        previousOutpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.Outpoint, protowire.Outpoint.Builder, protowire.OutpointOrBuilder>(
                getPreviousOutpoint(),
                getParentForChildren(),
                isClean());
        previousOutpoint_ = null;
      }
      return previousOutpointBuilder_;
    }

    private com.google.protobuf.ByteString signatureScript_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signatureScript = 2;</code>
     * @return The signatureScript.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignatureScript() {
      return signatureScript_;
    }
    /**
     * <code>bytes signatureScript = 2;</code>
     * @param value The signatureScript to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureScript(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signatureScript_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signatureScript = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignatureScript() {
      
      signatureScript_ = getDefaultInstance().getSignatureScript();
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <code>uint64 sequence = 3;</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <code>uint64 sequence = 3;</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sequence = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      
      sequence_ = 0L;
      onChanged();
      return this;
    }

    private int sigOpCount_ ;
    /**
     * <code>uint32 sigOpCount = 4;</code>
     * @return The sigOpCount.
     */
    @java.lang.Override
    public int getSigOpCount() {
      return sigOpCount_;
    }
    /**
     * <code>uint32 sigOpCount = 4;</code>
     * @param value The sigOpCount to set.
     * @return This builder for chaining.
     */
    public Builder setSigOpCount(int value) {
      
      sigOpCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 sigOpCount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSigOpCount() {
      
      sigOpCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:protowire.TransactionInput)
  }

  // @@protoc_insertion_point(class_scope:protowire.TransactionInput)
  private static final protowire.TransactionInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.TransactionInput();
  }

  public static protowire.TransactionInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionInput>
      PARSER = new com.google.protobuf.AbstractParser<TransactionInput>() {
    @java.lang.Override
    public TransactionInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransactionInput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.TransactionInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
