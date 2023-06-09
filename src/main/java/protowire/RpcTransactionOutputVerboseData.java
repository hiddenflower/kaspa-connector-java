// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package protowire;

/**
 * Protobuf type {@code protowire.RpcTransactionOutputVerboseData}
 */
public final class RpcTransactionOutputVerboseData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protowire.RpcTransactionOutputVerboseData)
    RpcTransactionOutputVerboseDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RpcTransactionOutputVerboseData.newBuilder() to construct.
  private RpcTransactionOutputVerboseData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RpcTransactionOutputVerboseData() {
    scriptPublicKeyType_ = "";
    scriptPublicKeyAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RpcTransactionOutputVerboseData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RpcTransactionOutputVerboseData(
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
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            scriptPublicKeyType_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            scriptPublicKeyAddress_ = s;
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
    return protowire.Rpc.internal_static_protowire_RpcTransactionOutputVerboseData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protowire.Rpc.internal_static_protowire_RpcTransactionOutputVerboseData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protowire.RpcTransactionOutputVerboseData.class, protowire.RpcTransactionOutputVerboseData.Builder.class);
  }

  public static final int SCRIPTPUBLICKEYTYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object scriptPublicKeyType_;
  /**
   * <code>string scriptPublicKeyType = 5;</code>
   * @return The scriptPublicKeyType.
   */
  @java.lang.Override
  public java.lang.String getScriptPublicKeyType() {
    java.lang.Object ref = scriptPublicKeyType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scriptPublicKeyType_ = s;
      return s;
    }
  }
  /**
   * <code>string scriptPublicKeyType = 5;</code>
   * @return The bytes for scriptPublicKeyType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScriptPublicKeyTypeBytes() {
    java.lang.Object ref = scriptPublicKeyType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scriptPublicKeyType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCRIPTPUBLICKEYADDRESS_FIELD_NUMBER = 6;
  private volatile java.lang.Object scriptPublicKeyAddress_;
  /**
   * <code>string scriptPublicKeyAddress = 6;</code>
   * @return The scriptPublicKeyAddress.
   */
  @java.lang.Override
  public java.lang.String getScriptPublicKeyAddress() {
    java.lang.Object ref = scriptPublicKeyAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scriptPublicKeyAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string scriptPublicKeyAddress = 6;</code>
   * @return The bytes for scriptPublicKeyAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScriptPublicKeyAddressBytes() {
    java.lang.Object ref = scriptPublicKeyAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scriptPublicKeyAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getScriptPublicKeyTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, scriptPublicKeyType_);
    }
    if (!getScriptPublicKeyAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, scriptPublicKeyAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScriptPublicKeyTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, scriptPublicKeyType_);
    }
    if (!getScriptPublicKeyAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, scriptPublicKeyAddress_);
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
    if (!(obj instanceof protowire.RpcTransactionOutputVerboseData)) {
      return super.equals(obj);
    }
    protowire.RpcTransactionOutputVerboseData other = (protowire.RpcTransactionOutputVerboseData) obj;

    if (!getScriptPublicKeyType()
        .equals(other.getScriptPublicKeyType())) return false;
    if (!getScriptPublicKeyAddress()
        .equals(other.getScriptPublicKeyAddress())) return false;
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
    hash = (37 * hash) + SCRIPTPUBLICKEYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getScriptPublicKeyType().hashCode();
    hash = (37 * hash) + SCRIPTPUBLICKEYADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getScriptPublicKeyAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RpcTransactionOutputVerboseData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protowire.RpcTransactionOutputVerboseData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protowire.RpcTransactionOutputVerboseData parseFrom(
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
  public static Builder newBuilder(protowire.RpcTransactionOutputVerboseData prototype) {
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
   * Protobuf type {@code protowire.RpcTransactionOutputVerboseData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protowire.RpcTransactionOutputVerboseData)
      protowire.RpcTransactionOutputVerboseDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protowire.Rpc.internal_static_protowire_RpcTransactionOutputVerboseData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protowire.Rpc.internal_static_protowire_RpcTransactionOutputVerboseData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protowire.RpcTransactionOutputVerboseData.class, protowire.RpcTransactionOutputVerboseData.Builder.class);
    }

    // Construct using protowire.RpcTransactionOutputVerboseData.newBuilder()
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
      scriptPublicKeyType_ = "";

      scriptPublicKeyAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protowire.Rpc.internal_static_protowire_RpcTransactionOutputVerboseData_descriptor;
    }

    @java.lang.Override
    public protowire.RpcTransactionOutputVerboseData getDefaultInstanceForType() {
      return protowire.RpcTransactionOutputVerboseData.getDefaultInstance();
    }

    @java.lang.Override
    public protowire.RpcTransactionOutputVerboseData build() {
      protowire.RpcTransactionOutputVerboseData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protowire.RpcTransactionOutputVerboseData buildPartial() {
      protowire.RpcTransactionOutputVerboseData result = new protowire.RpcTransactionOutputVerboseData(this);
      result.scriptPublicKeyType_ = scriptPublicKeyType_;
      result.scriptPublicKeyAddress_ = scriptPublicKeyAddress_;
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
      if (other instanceof protowire.RpcTransactionOutputVerboseData) {
        return mergeFrom((protowire.RpcTransactionOutputVerboseData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protowire.RpcTransactionOutputVerboseData other) {
      if (other == protowire.RpcTransactionOutputVerboseData.getDefaultInstance()) return this;
      if (!other.getScriptPublicKeyType().isEmpty()) {
        scriptPublicKeyType_ = other.scriptPublicKeyType_;
        onChanged();
      }
      if (!other.getScriptPublicKeyAddress().isEmpty()) {
        scriptPublicKeyAddress_ = other.scriptPublicKeyAddress_;
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
      protowire.RpcTransactionOutputVerboseData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protowire.RpcTransactionOutputVerboseData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object scriptPublicKeyType_ = "";
    /**
     * <code>string scriptPublicKeyType = 5;</code>
     * @return The scriptPublicKeyType.
     */
    public java.lang.String getScriptPublicKeyType() {
      java.lang.Object ref = scriptPublicKeyType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scriptPublicKeyType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scriptPublicKeyType = 5;</code>
     * @return The bytes for scriptPublicKeyType.
     */
    public com.google.protobuf.ByteString
        getScriptPublicKeyTypeBytes() {
      java.lang.Object ref = scriptPublicKeyType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptPublicKeyType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scriptPublicKeyType = 5;</code>
     * @param value The scriptPublicKeyType to set.
     * @return This builder for chaining.
     */
    public Builder setScriptPublicKeyType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scriptPublicKeyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string scriptPublicKeyType = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearScriptPublicKeyType() {
      
      scriptPublicKeyType_ = getDefaultInstance().getScriptPublicKeyType();
      onChanged();
      return this;
    }
    /**
     * <code>string scriptPublicKeyType = 5;</code>
     * @param value The bytes for scriptPublicKeyType to set.
     * @return This builder for chaining.
     */
    public Builder setScriptPublicKeyTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scriptPublicKeyType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object scriptPublicKeyAddress_ = "";
    /**
     * <code>string scriptPublicKeyAddress = 6;</code>
     * @return The scriptPublicKeyAddress.
     */
    public java.lang.String getScriptPublicKeyAddress() {
      java.lang.Object ref = scriptPublicKeyAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scriptPublicKeyAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scriptPublicKeyAddress = 6;</code>
     * @return The bytes for scriptPublicKeyAddress.
     */
    public com.google.protobuf.ByteString
        getScriptPublicKeyAddressBytes() {
      java.lang.Object ref = scriptPublicKeyAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptPublicKeyAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scriptPublicKeyAddress = 6;</code>
     * @param value The scriptPublicKeyAddress to set.
     * @return This builder for chaining.
     */
    public Builder setScriptPublicKeyAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scriptPublicKeyAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string scriptPublicKeyAddress = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearScriptPublicKeyAddress() {
      
      scriptPublicKeyAddress_ = getDefaultInstance().getScriptPublicKeyAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string scriptPublicKeyAddress = 6;</code>
     * @param value The bytes for scriptPublicKeyAddress to set.
     * @return This builder for chaining.
     */
    public Builder setScriptPublicKeyAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scriptPublicKeyAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:protowire.RpcTransactionOutputVerboseData)
  }

  // @@protoc_insertion_point(class_scope:protowire.RpcTransactionOutputVerboseData)
  private static final protowire.RpcTransactionOutputVerboseData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protowire.RpcTransactionOutputVerboseData();
  }

  public static protowire.RpcTransactionOutputVerboseData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RpcTransactionOutputVerboseData>
      PARSER = new com.google.protobuf.AbstractParser<RpcTransactionOutputVerboseData>() {
    @java.lang.Override
    public RpcTransactionOutputVerboseData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RpcTransactionOutputVerboseData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RpcTransactionOutputVerboseData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RpcTransactionOutputVerboseData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protowire.RpcTransactionOutputVerboseData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

