// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

/**
 * Protobuf type {@code proto_java.PruningPointProofMessage}
 */
public final class PruningPointProofMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.PruningPointProofMessage)
    PruningPointProofMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PruningPointProofMessage.newBuilder() to construct.
  private PruningPointProofMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PruningPointProofMessage() {
    headers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PruningPointProofMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PruningPointProofMessage(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              headers_ = new java.util.ArrayList<proto_java.PruningPointProofHeaderArray>();
              mutable_bitField0_ |= 0x00000001;
            }
            headers_.add(
                input.readMessage(proto_java.PruningPointProofHeaderArray.parser(), extensionRegistry));
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
        headers_ = java.util.Collections.unmodifiableList(headers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto_java.P2P.internal_static_org_example_grpc_PruningPointProofMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.P2P.internal_static_org_example_grpc_PruningPointProofMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.PruningPointProofMessage.class, proto_java.PruningPointProofMessage.Builder.class);
  }

  public static final int HEADERS_FIELD_NUMBER = 1;
  private java.util.List<proto_java.PruningPointProofHeaderArray> headers_;
  /**
   * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto_java.PruningPointProofHeaderArray> getHeadersList() {
    return headers_;
  }
  /**
   * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto_java.PruningPointProofHeaderArrayOrBuilder> 
      getHeadersOrBuilderList() {
    return headers_;
  }
  /**
   * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
   */
  @java.lang.Override
  public int getHeadersCount() {
    return headers_.size();
  }
  /**
   * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
   */
  @java.lang.Override
  public proto_java.PruningPointProofHeaderArray getHeaders(int index) {
    return headers_.get(index);
  }
  /**
   * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
   */
  @java.lang.Override
  public proto_java.PruningPointProofHeaderArrayOrBuilder getHeadersOrBuilder(
      int index) {
    return headers_.get(index);
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
    for (int i = 0; i < headers_.size(); i++) {
      output.writeMessage(1, headers_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < headers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, headers_.get(i));
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
    if (!(obj instanceof proto_java.PruningPointProofMessage)) {
      return super.equals(obj);
    }
    proto_java.PruningPointProofMessage other = (proto_java.PruningPointProofMessage) obj;

    if (!getHeadersList()
        .equals(other.getHeadersList())) return false;
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
    if (getHeadersCount() > 0) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeadersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.PruningPointProofMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.PruningPointProofMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.PruningPointProofMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.PruningPointProofMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.PruningPointProofMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.PruningPointProofMessage parseFrom(
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
  public static Builder newBuilder(proto_java.PruningPointProofMessage prototype) {
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
   * Protobuf type {@code proto_java.PruningPointProofMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.PruningPointProofMessage)
      proto_java.PruningPointProofMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.P2P.internal_static_org_example_grpc_PruningPointProofMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.P2P.internal_static_org_example_grpc_PruningPointProofMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.PruningPointProofMessage.class, proto_java.PruningPointProofMessage.Builder.class);
    }

    // Construct using proto_java.PruningPointProofMessage.newBuilder()
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
        getHeadersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headersBuilder_ == null) {
        headers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        headersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.P2P.internal_static_org_example_grpc_PruningPointProofMessage_descriptor;
    }

    @java.lang.Override
    public proto_java.PruningPointProofMessage getDefaultInstanceForType() {
      return proto_java.PruningPointProofMessage.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.PruningPointProofMessage build() {
      proto_java.PruningPointProofMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.PruningPointProofMessage buildPartial() {
      proto_java.PruningPointProofMessage result = new proto_java.PruningPointProofMessage(this);
      int from_bitField0_ = bitField0_;
      if (headersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          headers_ = java.util.Collections.unmodifiableList(headers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.headers_ = headers_;
      } else {
        result.headers_ = headersBuilder_.build();
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
      if (other instanceof proto_java.PruningPointProofMessage) {
        return mergeFrom((proto_java.PruningPointProofMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.PruningPointProofMessage other) {
      if (other == proto_java.PruningPointProofMessage.getDefaultInstance()) return this;
      if (headersBuilder_ == null) {
        if (!other.headers_.isEmpty()) {
          if (headers_.isEmpty()) {
            headers_ = other.headers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHeadersIsMutable();
            headers_.addAll(other.headers_);
          }
          onChanged();
        }
      } else {
        if (!other.headers_.isEmpty()) {
          if (headersBuilder_.isEmpty()) {
            headersBuilder_.dispose();
            headersBuilder_ = null;
            headers_ = other.headers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            headersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHeadersFieldBuilder() : null;
          } else {
            headersBuilder_.addAllMessages(other.headers_);
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
      proto_java.PruningPointProofMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.PruningPointProofMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto_java.PruningPointProofHeaderArray> headers_ =
      java.util.Collections.emptyList();
    private void ensureHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        headers_ = new java.util.ArrayList<proto_java.PruningPointProofHeaderArray>(headers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto_java.PruningPointProofHeaderArray, proto_java.PruningPointProofHeaderArray.Builder, proto_java.PruningPointProofHeaderArrayOrBuilder> headersBuilder_;

    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public java.util.List<proto_java.PruningPointProofHeaderArray> getHeadersList() {
      if (headersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(headers_);
      } else {
        return headersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public int getHeadersCount() {
      if (headersBuilder_ == null) {
        return headers_.size();
      } else {
        return headersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public proto_java.PruningPointProofHeaderArray getHeaders(int index) {
      if (headersBuilder_ == null) {
        return headers_.get(index);
      } else {
        return headersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder setHeaders(
        int index, proto_java.PruningPointProofHeaderArray value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.set(index, value);
        onChanged();
      } else {
        headersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder setHeaders(
        int index, proto_java.PruningPointProofHeaderArray.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.set(index, builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder addHeaders(proto_java.PruningPointProofHeaderArray value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.add(value);
        onChanged();
      } else {
        headersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder addHeaders(
        int index, proto_java.PruningPointProofHeaderArray value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.add(index, value);
        onChanged();
      } else {
        headersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder addHeaders(
        proto_java.PruningPointProofHeaderArray.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.add(builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder addHeaders(
        int index, proto_java.PruningPointProofHeaderArray.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.add(index, builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder addAllHeaders(
        java.lang.Iterable<? extends proto_java.PruningPointProofHeaderArray> values) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, headers_);
        onChanged();
      } else {
        headersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder clearHeaders() {
      if (headersBuilder_ == null) {
        headers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        headersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public Builder removeHeaders(int index) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.remove(index);
        onChanged();
      } else {
        headersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public proto_java.PruningPointProofHeaderArray.Builder getHeadersBuilder(
        int index) {
      return getHeadersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public proto_java.PruningPointProofHeaderArrayOrBuilder getHeadersOrBuilder(
        int index) {
      if (headersBuilder_ == null) {
        return headers_.get(index);  } else {
        return headersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public java.util.List<? extends proto_java.PruningPointProofHeaderArrayOrBuilder> 
         getHeadersOrBuilderList() {
      if (headersBuilder_ != null) {
        return headersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(headers_);
      }
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public proto_java.PruningPointProofHeaderArray.Builder addHeadersBuilder() {
      return getHeadersFieldBuilder().addBuilder(
          proto_java.PruningPointProofHeaderArray.getDefaultInstance());
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public proto_java.PruningPointProofHeaderArray.Builder addHeadersBuilder(
        int index) {
      return getHeadersFieldBuilder().addBuilder(
          index, proto_java.PruningPointProofHeaderArray.getDefaultInstance());
    }
    /**
     * <code>repeated .proto_java.PruningPointProofHeaderArray headers = 1;</code>
     */
    public java.util.List<proto_java.PruningPointProofHeaderArray.Builder> 
         getHeadersBuilderList() {
      return getHeadersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto_java.PruningPointProofHeaderArray, proto_java.PruningPointProofHeaderArray.Builder, proto_java.PruningPointProofHeaderArrayOrBuilder> 
        getHeadersFieldBuilder() {
      if (headersBuilder_ == null) {
        headersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto_java.PruningPointProofHeaderArray, proto_java.PruningPointProofHeaderArray.Builder, proto_java.PruningPointProofHeaderArrayOrBuilder>(
                headers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        headers_ = null;
      }
      return headersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto_java.PruningPointProofMessage)
  }

  // @@protoc_insertion_point(class_scope:proto_java.PruningPointProofMessage)
  private static final proto_java.PruningPointProofMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.PruningPointProofMessage();
  }

  public static proto_java.PruningPointProofMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PruningPointProofMessage>
      PARSER = new com.google.protobuf.AbstractParser<PruningPointProofMessage>() {
    @java.lang.Override
    public PruningPointProofMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PruningPointProofMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PruningPointProofMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PruningPointProofMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.PruningPointProofMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

