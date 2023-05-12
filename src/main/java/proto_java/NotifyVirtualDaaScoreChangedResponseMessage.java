// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

/**
 * Protobuf type {@code proto_java.NotifyVirtualDaaScoreChangedResponseMessage}
 */
public final class NotifyVirtualDaaScoreChangedResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.NotifyVirtualDaaScoreChangedResponseMessage)
    NotifyVirtualDaaScoreChangedResponseMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotifyVirtualDaaScoreChangedResponseMessage.newBuilder() to construct.
  private NotifyVirtualDaaScoreChangedResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotifyVirtualDaaScoreChangedResponseMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NotifyVirtualDaaScoreChangedResponseMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NotifyVirtualDaaScoreChangedResponseMessage(
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
          case 8002: {
            proto_java.RPCError.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(proto_java.RPCError.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
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
    return proto_java.Rpc.internal_static_org_example_grpc_NotifyVirtualDaaScoreChangedResponseMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.Rpc.internal_static_org_example_grpc_NotifyVirtualDaaScoreChangedResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.NotifyVirtualDaaScoreChangedResponseMessage.class, proto_java.NotifyVirtualDaaScoreChangedResponseMessage.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1000;
  private proto_java.RPCError error_;
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   * @return The error.
   */
  @java.lang.Override
  public proto_java.RPCError getError() {
    return error_ == null ? proto_java.RPCError.getDefaultInstance() : error_;
  }
  /**
   * <code>.proto_java.RPCError error = 1000;</code>
   */
  @java.lang.Override
  public proto_java.RPCErrorOrBuilder getErrorOrBuilder() {
    return getError();
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
    if (error_ != null) {
      output.writeMessage(1000, getError());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1000, getError());
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
    if (!(obj instanceof proto_java.NotifyVirtualDaaScoreChangedResponseMessage)) {
      return super.equals(obj);
    }
    proto_java.NotifyVirtualDaaScoreChangedResponseMessage other = (proto_java.NotifyVirtualDaaScoreChangedResponseMessage) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage parseFrom(
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
  public static Builder newBuilder(proto_java.NotifyVirtualDaaScoreChangedResponseMessage prototype) {
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
   * Protobuf type {@code proto_java.NotifyVirtualDaaScoreChangedResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.NotifyVirtualDaaScoreChangedResponseMessage)
      proto_java.NotifyVirtualDaaScoreChangedResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.Rpc.internal_static_org_example_grpc_NotifyVirtualDaaScoreChangedResponseMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.Rpc.internal_static_org_example_grpc_NotifyVirtualDaaScoreChangedResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.NotifyVirtualDaaScoreChangedResponseMessage.class, proto_java.NotifyVirtualDaaScoreChangedResponseMessage.Builder.class);
    }

    // Construct using proto_java.NotifyVirtualDaaScoreChangedResponseMessage.newBuilder()
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
      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.Rpc.internal_static_org_example_grpc_NotifyVirtualDaaScoreChangedResponseMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.NotifyVirtualDaaScoreChangedResponseMessage getDefaultInstanceForType() {
      return proto_java.NotifyVirtualDaaScoreChangedResponseMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.NotifyVirtualDaaScoreChangedResponseMessage build() {
      proto_java.NotifyVirtualDaaScoreChangedResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.NotifyVirtualDaaScoreChangedResponseMessage buildPartial() {
      proto_java.NotifyVirtualDaaScoreChangedResponseMessage result = new proto_java.NotifyVirtualDaaScoreChangedResponseMessage(this);
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
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
      if (other instanceof proto_java.NotifyVirtualDaaScoreChangedResponseMessage) {
        return mergeFrom((proto_java.NotifyVirtualDaaScoreChangedResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.NotifyVirtualDaaScoreChangedResponseMessage other) {
      if (other == proto_java.NotifyVirtualDaaScoreChangedResponseMessage.getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
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
      proto_java.NotifyVirtualDaaScoreChangedResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.NotifyVirtualDaaScoreChangedResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private proto_java.RPCError error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.RPCError, proto_java.RPCError.Builder, proto_java.RPCErrorOrBuilder> errorBuilder_;
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     * @return The error.
     */
    public proto_java.RPCError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? proto_java.RPCError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    public Builder setError(proto_java.RPCError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    public Builder setError(
        proto_java.RPCError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    public Builder mergeError(proto_java.RPCError value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            proto_java.RPCError.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    public proto_java.RPCError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    public proto_java.RPCErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            proto_java.RPCError.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>.proto_java.RPCError error = 1000;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.RPCError, proto_java.RPCError.Builder, proto_java.RPCErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto_java.RPCError, proto_java.RPCError.Builder, proto_java.RPCErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto_java.NotifyVirtualDaaScoreChangedResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.NotifyVirtualDaaScoreChangedResponseMessage)
  private static final proto_java.NotifyVirtualDaaScoreChangedResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.NotifyVirtualDaaScoreChangedResponseMessage();
  }

  public static proto_java.NotifyVirtualDaaScoreChangedResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotifyVirtualDaaScoreChangedResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<NotifyVirtualDaaScoreChangedResponseMessage>() {
    @java.lang.Override
    public NotifyVirtualDaaScoreChangedResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NotifyVirtualDaaScoreChangedResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NotifyVirtualDaaScoreChangedResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotifyVirtualDaaScoreChangedResponseMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.NotifyVirtualDaaScoreChangedResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
