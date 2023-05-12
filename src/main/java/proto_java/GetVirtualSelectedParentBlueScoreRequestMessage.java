// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package proto_java;

/**
 * <pre>
 * GetVirtualSelectedParentBlueScoreRequestMessage requests the blue score of the current selected parent
 * of the virtual block.
 * </pre>
 *
 * Protobuf type {@code proto_java.GetVirtualSelectedParentBlueScoreRequestMessage}
 */
public final class GetVirtualSelectedParentBlueScoreRequestMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.GetVirtualSelectedParentBlueScoreRequestMessage)
    GetVirtualSelectedParentBlueScoreRequestMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetVirtualSelectedParentBlueScoreRequestMessage.newBuilder() to construct.
  private GetVirtualSelectedParentBlueScoreRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetVirtualSelectedParentBlueScoreRequestMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetVirtualSelectedParentBlueScoreRequestMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetVirtualSelectedParentBlueScoreRequestMessage(
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
    return proto_java.Rpc.internal_static_org_example_grpc_GetVirtualSelectedParentBlueScoreRequestMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.Rpc.internal_static_org_example_grpc_GetVirtualSelectedParentBlueScoreRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.class, proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto_java.GetVirtualSelectedParentBlueScoreRequestMessage)) {
      return super.equals(obj);
    }
    proto_java.GetVirtualSelectedParentBlueScoreRequestMessage other = (proto_java.GetVirtualSelectedParentBlueScoreRequestMessage) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parseFrom(
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
  public static Builder newBuilder(proto_java.GetVirtualSelectedParentBlueScoreRequestMessage prototype) {
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
   * <pre>
   * GetVirtualSelectedParentBlueScoreRequestMessage requests the blue score of the current selected parent
   * of the virtual block.
   * </pre>
   *
   * Protobuf type {@code proto_java.GetVirtualSelectedParentBlueScoreRequestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.GetVirtualSelectedParentBlueScoreRequestMessage)
      proto_java.GetVirtualSelectedParentBlueScoreRequestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.Rpc.internal_static_org_example_grpc_GetVirtualSelectedParentBlueScoreRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.Rpc.internal_static_org_example_grpc_GetVirtualSelectedParentBlueScoreRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.class, proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.Builder.class);
    }

    // Construct using proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.Rpc.internal_static_org_example_grpc_GetVirtualSelectedParentBlueScoreRequestMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.GetVirtualSelectedParentBlueScoreRequestMessage getDefaultInstanceForType() {
      return proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.GetVirtualSelectedParentBlueScoreRequestMessage build() {
      proto_java.GetVirtualSelectedParentBlueScoreRequestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.GetVirtualSelectedParentBlueScoreRequestMessage buildPartial() {
      proto_java.GetVirtualSelectedParentBlueScoreRequestMessage result = new proto_java.GetVirtualSelectedParentBlueScoreRequestMessage(this);
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
      if (other instanceof proto_java.GetVirtualSelectedParentBlueScoreRequestMessage) {
        return mergeFrom((proto_java.GetVirtualSelectedParentBlueScoreRequestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.GetVirtualSelectedParentBlueScoreRequestMessage other) {
      if (other == proto_java.GetVirtualSelectedParentBlueScoreRequestMessage.getDefaultInstance()) return this;
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
      proto_java.GetVirtualSelectedParentBlueScoreRequestMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.GetVirtualSelectedParentBlueScoreRequestMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:proto_java.GetVirtualSelectedParentBlueScoreRequestMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.GetVirtualSelectedParentBlueScoreRequestMessage)
  private static final proto_java.GetVirtualSelectedParentBlueScoreRequestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.GetVirtualSelectedParentBlueScoreRequestMessage();
  }

  public static proto_java.GetVirtualSelectedParentBlueScoreRequestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVirtualSelectedParentBlueScoreRequestMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetVirtualSelectedParentBlueScoreRequestMessage>() {
    @java.lang.Override
    public GetVirtualSelectedParentBlueScoreRequestMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetVirtualSelectedParentBlueScoreRequestMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetVirtualSelectedParentBlueScoreRequestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVirtualSelectedParentBlueScoreRequestMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.GetVirtualSelectedParentBlueScoreRequestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
