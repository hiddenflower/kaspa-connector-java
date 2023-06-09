// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.RpcTransactionInput}
 */
public final class RpcTransactionInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.RpcTransactionInput)
    RpcTransactionInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RpcTransactionInput.newBuilder() to construct.
  private RpcTransactionInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RpcTransactionInput() {
    signatureScript_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RpcTransactionInput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RpcTransactionInput(
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
            protowire.RpcOutpoint.Builder subBuilder = null;
            if (previousOutpoint_ != null) {
              subBuilder = previousOutpoint_.toBuilder();
            }
            previousOutpoint_ = input.readMessage(protowire.RpcOutpoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(previousOutpoint_);
              previousOutpoint_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            signatureScript_ = s;
            break;
          }
          case 24: {

            sequence_ = input.readUInt64();
            break;
          }
          case 34: {
            protowire.RpcTransactionInputVerboseData.Builder subBuilder = null;
            if (verboseData_ != null) {
              subBuilder = verboseData_.toBuilder();
            }
            verboseData_ = input.readMessage(protowire.RpcTransactionInputVerboseData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(verboseData_);
              verboseData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

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
    return protowire.Rpc.internal_static_protowire_RpcTransactionInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_RpcTransactionInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.RpcTransactionInput.class, protowire.RpcTransactionInput.Builder.class);
  }

  public static final int PREVIOUSOUTPOINT_FIELD_NUMBER = 1;
  private protowire.RpcOutpoint previousOutpoint_;
  /**
   * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
   * @return Whether the previousOutpoint field is set.
   */
  @java.lang.Override
  public boolean hasPreviousOutpoint() {
    return previousOutpoint_ != null;
  }
  /**
   * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
   * @return The previousOutpoint.
   */
  @java.lang.Override
  public protowire.RpcOutpoint getPreviousOutpoint() {
    return previousOutpoint_ == null ? protowire.RpcOutpoint.getDefaultInstance() : previousOutpoint_;
  }
  /**
   * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
   */
  @java.lang.Override
  public protowire.RpcOutpointOrBuilder getPreviousOutpointOrBuilder() {
    return getPreviousOutpoint();
  }

  public static final int SIGNATURESCRIPT_FIELD_NUMBER = 2;
  private volatile java.lang.Object signatureScript_;
  /**
   * <code>string signatureScript = 2;</code>
   * @return The signatureScript.
   */
  @java.lang.Override
  public java.lang.String getSignatureScript() {
    java.lang.Object ref = signatureScript_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signatureScript_ = s;
      return s;
    }
  }
  /**
   * <code>string signatureScript = 2;</code>
   * @return The bytes for signatureScript.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignatureScriptBytes() {
    java.lang.Object ref = signatureScript_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signatureScript_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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

  public static final int SIGOPCOUNT_FIELD_NUMBER = 5;
  private int sigOpCount_;
  /**
   * <code>uint32 sigOpCount = 5;</code>
   * @return The sigOpCount.
   */
  @java.lang.Override
  public int getSigOpCount() {
    return sigOpCount_;
  }

  public static final int VERBOSEDATA_FIELD_NUMBER = 4;
  private protowire.RpcTransactionInputVerboseData verboseData_;
  /**
   * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
   * @return Whether the verboseData field is set.
   */
  @java.lang.Override
  public boolean hasVerboseData() {
    return verboseData_ != null;
  }
  /**
   * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
   * @return The verboseData.
   */
  @java.lang.Override
  public protowire.RpcTransactionInputVerboseData getVerboseData() {
    return verboseData_ == null ? protowire.RpcTransactionInputVerboseData.getDefaultInstance() : verboseData_;
  }
  /**
   * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
   */
  @java.lang.Override
  public protowire.RpcTransactionInputVerboseDataOrBuilder getVerboseDataOrBuilder() {
    return getVerboseData();
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
    if (!getSignatureScriptBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signatureScript_);
    }
    if (sequence_ != 0L) {
      output.writeUInt64(3, sequence_);
    }
    if (verboseData_ != null) {
      output.writeMessage(4, getVerboseData());
    }
    if (sigOpCount_ != 0) {
      output.writeUInt32(5, sigOpCount_);
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
    if (!getSignatureScriptBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, signatureScript_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, sequence_);
    }
    if (verboseData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getVerboseData());
    }
    if (sigOpCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, sigOpCount_);
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
    if (!(obj instanceof protowire.RpcTransactionInput)) {
      return super.equals(obj);
    }
    protowire.RpcTransactionInput other = (protowire.RpcTransactionInput) obj;

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
    if (hasVerboseData() != other.hasVerboseData()) return false;
    if (hasVerboseData()) {
      if (!getVerboseData()
          .equals(other.getVerboseData())) return false;
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
    if (hasVerboseData()) {
      hash = (37 * hash) + VERBOSEDATA_FIELD_NUMBER;
      hash = (53 * hash) + getVerboseData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.RpcTransactionInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcTransactionInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcTransactionInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcTransactionInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcTransactionInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcTransactionInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcTransactionInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RpcTransactionInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RpcTransactionInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.RpcTransactionInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RpcTransactionInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RpcTransactionInput parseFrom(
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
  public static Builder newBuilder(protowire.RpcTransactionInput prototype) {
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
   * Protobuf type {@code protowire.RpcTransactionInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.RpcTransactionInput)
      protowire.RpcTransactionInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_RpcTransactionInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_RpcTransactionInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.RpcTransactionInput.class, protowire.RpcTransactionInput.Builder.class);
    }

    // Construct using protowire.RpcTransactionInput.newBuilder()
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
      signatureScript_ = "";

      sequence_ = 0L;

      sigOpCount_ = 0;

      if (verboseDataBuilder_ == null) {
        verboseData_ = null;
      } else {
        verboseData_ = null;
        verboseDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.Rpc.internal_static_protowire_RpcTransactionInput_descriptor;
    }

    @java.lang.Override
    public protowire.RpcTransactionInput getDefaultInstanceForType() {
      return protowire.RpcTransactionInput.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.RpcTransactionInput build() {
      protowire.RpcTransactionInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.RpcTransactionInput buildPartial() {
      protowire.RpcTransactionInput result = new protowire.RpcTransactionInput(this);
      if (previousOutpointBuilder_ == null) {
        result.previousOutpoint_ = previousOutpoint_;
      } else {
        result.previousOutpoint_ = previousOutpointBuilder_.build();
      }
      result.signatureScript_ = signatureScript_;
      result.sequence_ = sequence_;
      result.sigOpCount_ = sigOpCount_;
      if (verboseDataBuilder_ == null) {
        result.verboseData_ = verboseData_;
      } else {
        result.verboseData_ = verboseDataBuilder_.build();
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
      if (other instanceof protowire.RpcTransactionInput) {
        return mergeFrom((protowire.RpcTransactionInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.RpcTransactionInput other) {
      if (other == protowire.RpcTransactionInput.getDefaultInstance()) return this;
      if (other.hasPreviousOutpoint()) {
        mergePreviousOutpoint(other.getPreviousOutpoint());
      }
      if (!other.getSignatureScript().isEmpty()) {
        signatureScript_ = other.signatureScript_;
        onChanged();
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.getSigOpCount() != 0) {
        setSigOpCount(other.getSigOpCount());
      }
      if (other.hasVerboseData()) {
        mergeVerboseData(other.getVerboseData());
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
      protowire.RpcTransactionInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.RpcTransactionInput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private protowire.RpcOutpoint previousOutpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RpcOutpoint, protowire.RpcOutpoint.Builder, protowire.RpcOutpointOrBuilder> previousOutpointBuilder_;
    /**
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     * @return Whether the previousOutpoint field is set.
     */
    public boolean hasPreviousOutpoint() {
      return previousOutpointBuilder_ != null || previousOutpoint_ != null;
    }
    /**
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     * @return The previousOutpoint.
     */
    public protowire.RpcOutpoint getPreviousOutpoint() {
      if (previousOutpointBuilder_ == null) {
        return previousOutpoint_ == null ? protowire.RpcOutpoint.getDefaultInstance() : previousOutpoint_;
      } else {
        return previousOutpointBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     */
    public Builder setPreviousOutpoint(protowire.RpcOutpoint value) {
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
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     */
    public Builder setPreviousOutpoint(
        protowire.RpcOutpoint.Builder builderForValue) {
      if (previousOutpointBuilder_ == null) {
        previousOutpoint_ = builderForValue.build();
        onChanged();
      } else {
        previousOutpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     */
    public Builder mergePreviousOutpoint(protowire.RpcOutpoint value) {
      if (previousOutpointBuilder_ == null) {
        if (previousOutpoint_ != null) {
          previousOutpoint_ =
            protowire.RpcOutpoint.newBuilder(previousOutpoint_).mergeFrom(value).buildPartial();
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
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
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
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     */
    public protowire.RpcOutpoint.Builder getPreviousOutpointBuilder() {
      
      onChanged();
      return getPreviousOutpointFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     */
    public protowire.RpcOutpointOrBuilder getPreviousOutpointOrBuilder() {
      if (previousOutpointBuilder_ != null) {
        return previousOutpointBuilder_.getMessageOrBuilder();
      } else {
        return previousOutpoint_ == null ?
            protowire.RpcOutpoint.getDefaultInstance() : previousOutpoint_;
      }
    }
    /**
     * <code>.protowire.RpcOutpoint previousOutpoint = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RpcOutpoint, protowire.RpcOutpoint.Builder, protowire.RpcOutpointOrBuilder> 
        getPreviousOutpointFieldBuilder() {
      if (previousOutpointBuilder_ == null) {
        previousOutpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.RpcOutpoint, protowire.RpcOutpoint.Builder, protowire.RpcOutpointOrBuilder>(
                getPreviousOutpoint(),
                getParentForChildren(),
                isClean());
        previousOutpoint_ = null;
      }
      return previousOutpointBuilder_;
    }

    private java.lang.Object signatureScript_ = "";
    /**
     * <code>string signatureScript = 2;</code>
     * @return The signatureScript.
     */
    public java.lang.String getSignatureScript() {
      java.lang.Object ref = signatureScript_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signatureScript_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signatureScript = 2;</code>
     * @return The bytes for signatureScript.
     */
    public com.google.protobuf.ByteString
        getSignatureScriptBytes() {
      java.lang.Object ref = signatureScript_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signatureScript_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signatureScript = 2;</code>
     * @param value The signatureScript to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureScript(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signatureScript_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string signatureScript = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignatureScript() {
      
      signatureScript_ = getDefaultInstance().getSignatureScript();
      onChanged();
      return this;
    }
    /**
     * <code>string signatureScript = 2;</code>
     * @param value The bytes for signatureScript to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureScriptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      signatureScript_ = value;
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
     * <code>uint32 sigOpCount = 5;</code>
     * @return The sigOpCount.
     */
    @java.lang.Override
    public int getSigOpCount() {
      return sigOpCount_;
    }
    /**
     * <code>uint32 sigOpCount = 5;</code>
     * @param value The sigOpCount to set.
     * @return This builder for chaining.
     */
    public Builder setSigOpCount(int value) {
      
      sigOpCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 sigOpCount = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSigOpCount() {
      
      sigOpCount_ = 0;
      onChanged();
      return this;
    }

    private protowire.RpcTransactionInputVerboseData verboseData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RpcTransactionInputVerboseData, protowire.RpcTransactionInputVerboseData.Builder, protowire.RpcTransactionInputVerboseDataOrBuilder> verboseDataBuilder_;
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     * @return Whether the verboseData field is set.
     */
    public boolean hasVerboseData() {
      return verboseDataBuilder_ != null || verboseData_ != null;
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     * @return The verboseData.
     */
    public protowire.RpcTransactionInputVerboseData getVerboseData() {
      if (verboseDataBuilder_ == null) {
        return verboseData_ == null ? protowire.RpcTransactionInputVerboseData.getDefaultInstance() : verboseData_;
      } else {
        return verboseDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    public Builder setVerboseData(protowire.RpcTransactionInputVerboseData value) {
      if (verboseDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        verboseData_ = value;
        onChanged();
      } else {
        verboseDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    public Builder setVerboseData(
        protowire.RpcTransactionInputVerboseData.Builder builderForValue) {
      if (verboseDataBuilder_ == null) {
        verboseData_ = builderForValue.build();
        onChanged();
      } else {
        verboseDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    public Builder mergeVerboseData(protowire.RpcTransactionInputVerboseData value) {
      if (verboseDataBuilder_ == null) {
        if (verboseData_ != null) {
          verboseData_ =
            protowire.RpcTransactionInputVerboseData.newBuilder(verboseData_).mergeFrom(value).buildPartial();
        } else {
          verboseData_ = value;
        }
        onChanged();
      } else {
        verboseDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    public Builder clearVerboseData() {
      if (verboseDataBuilder_ == null) {
        verboseData_ = null;
        onChanged();
      } else {
        verboseData_ = null;
        verboseDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    public protowire.RpcTransactionInputVerboseData.Builder getVerboseDataBuilder() {
      
      onChanged();
      return getVerboseDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    public protowire.RpcTransactionInputVerboseDataOrBuilder getVerboseDataOrBuilder() {
      if (verboseDataBuilder_ != null) {
        return verboseDataBuilder_.getMessageOrBuilder();
      } else {
        return verboseData_ == null ?
            protowire.RpcTransactionInputVerboseData.getDefaultInstance() : verboseData_;
      }
    }
    /**
     * <code>.protowire.RpcTransactionInputVerboseData verboseData = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protowire.RpcTransactionInputVerboseData, protowire.RpcTransactionInputVerboseData.Builder, protowire.RpcTransactionInputVerboseDataOrBuilder> 
        getVerboseDataFieldBuilder() {
      if (verboseDataBuilder_ == null) {
        verboseDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protowire.RpcTransactionInputVerboseData, protowire.RpcTransactionInputVerboseData.Builder, protowire.RpcTransactionInputVerboseDataOrBuilder>(
                getVerboseData(),
                getParentForChildren(),
                isClean());
        verboseData_ = null;
      }
      return verboseDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protowire.RpcTransactionInput)
  }

  // @@protoc_insertion_point(class_scope:protowire.RpcTransactionInput)
  private static final protowire.RpcTransactionInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.RpcTransactionInput();
  }

  public static protowire.RpcTransactionInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RpcTransactionInput>
      PARSER = new com.google.protobuf.AbstractParser<RpcTransactionInput>() {
    @java.lang.Override
    public RpcTransactionInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RpcTransactionInput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RpcTransactionInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RpcTransactionInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.RpcTransactionInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

