// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

/**
 * Protobuf type {@code proto_java.ScriptPublicKey}
 */
public final class ScriptPublicKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.ScriptPublicKey)
    ScriptPublicKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScriptPublicKey.newBuilder() to construct.
  private ScriptPublicKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScriptPublicKey() {
    script_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScriptPublicKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScriptPublicKey(
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

            script_ = input.readBytes();
            break;
          }
          case 16: {

            version_ = input.readUInt32();
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
    return proto_java.P2P.internal_static_org_example_grpc_ScriptPublicKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.P2P.internal_static_org_example_grpc_ScriptPublicKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.ScriptPublicKey.class, proto_java.ScriptPublicKey.Builder.class);
  }

  public static final int SCRIPT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString script_;
  /**
   * <code>bytes script = 1;</code>
   * @return The script.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScript() {
    return script_;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <code>uint32 version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
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
    if (!script_.isEmpty()) {
      output.writeBytes(1, script_);
    }
    if (version_ != 0) {
      output.writeUInt32(2, version_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!script_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, script_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, version_);
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
    if (!(obj instanceof proto_java.ScriptPublicKey)) {
      return super.equals(obj);
    }
    proto_java.ScriptPublicKey other = (proto_java.ScriptPublicKey) obj;

    if (!getScript()
        .equals(other.getScript())) return false;
    if (getVersion()
        != other.getVersion()) return false;
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
    hash = (37 * hash) + SCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getScript().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.ScriptPublicKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.ScriptPublicKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.ScriptPublicKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.ScriptPublicKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.ScriptPublicKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.ScriptPublicKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.ScriptPublicKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.ScriptPublicKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.ScriptPublicKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.ScriptPublicKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.ScriptPublicKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.ScriptPublicKey parseFrom(
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
  public static Builder newBuilder(proto_java.ScriptPublicKey prototype) {
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
   * Protobuf type {@code proto_java.ScriptPublicKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.ScriptPublicKey)
      proto_java.ScriptPublicKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.P2P.internal_static_org_example_grpc_ScriptPublicKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.P2P.internal_static_org_example_grpc_ScriptPublicKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.ScriptPublicKey.class, proto_java.ScriptPublicKey.Builder.class);
    }

    // Construct using proto_java.ScriptPublicKey.newBuilder()
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
      script_ = com.google.protobuf.ByteString.EMPTY;

      version_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.P2P.internal_static_org_example_grpc_ScriptPublicKey_descriptor;
    }

    @java.lang.Override
    public proto_java.ScriptPublicKey getDefaultInstanceForType() {
      return proto_java.ScriptPublicKey.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.ScriptPublicKey build() {
      proto_java.ScriptPublicKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.ScriptPublicKey buildPartial() {
      proto_java.ScriptPublicKey result = new proto_java.ScriptPublicKey(this);
      result.script_ = script_;
      result.version_ = version_;
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
      if (other instanceof proto_java.ScriptPublicKey) {
        return mergeFrom((proto_java.ScriptPublicKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.ScriptPublicKey other) {
      if (other == proto_java.ScriptPublicKey.getDefaultInstance()) return this;
      if (other.getScript() != com.google.protobuf.ByteString.EMPTY) {
        setScript(other.getScript());
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
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
      proto_java.ScriptPublicKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.ScriptPublicKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString script_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes script = 1;</code>
     * @return The script.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getScript() {
      return script_;
    }
    /**
     * <code>bytes script = 1;</code>
     * @param value The script to set.
     * @return This builder for chaining.
     */
    public Builder setScript(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      script_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes script = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScript() {
      
      script_ = getDefaultInstance().getScript();
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <code>uint32 version = 2;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>uint32 version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
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


    // @@protoc_insertion_point(builder_scope:proto_java.ScriptPublicKey)
  }

  // @@protoc_insertion_point(class_scope:proto_java.ScriptPublicKey)
  private static final proto_java.ScriptPublicKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.ScriptPublicKey();
  }

  public static proto_java.ScriptPublicKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScriptPublicKey>
      PARSER = new com.google.protobuf.AbstractParser<ScriptPublicKey>() {
    @java.lang.Override
    public ScriptPublicKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScriptPublicKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScriptPublicKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScriptPublicKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.ScriptPublicKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
