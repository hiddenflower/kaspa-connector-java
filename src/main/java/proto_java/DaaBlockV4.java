// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p2p.proto

package proto_java;

/**
 * Protobuf type {@code proto_java.DaaBlockV4}
 */
public final class DaaBlockV4 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto_java.DaaBlockV4)
    DaaBlockV4OrBuilder {
private static final long serialVersionUID = 0L;
  // Use DaaBlockV4.newBuilder() to construct.
  private DaaBlockV4(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DaaBlockV4() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DaaBlockV4();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DaaBlockV4(
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
            proto_java.BlockHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(proto_java.BlockHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            proto_java.GhostdagData.Builder subBuilder = null;
            if (ghostdagData_ != null) {
              subBuilder = ghostdagData_.toBuilder();
            }
            ghostdagData_ = input.readMessage(proto_java.GhostdagData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ghostdagData_);
              ghostdagData_ = subBuilder.buildPartial();
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
    return proto_java.P2P.internal_static_org_example_grpc_DaaBlockV4_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto_java.P2P.internal_static_org_example_grpc_DaaBlockV4_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto_java.DaaBlockV4.class, proto_java.DaaBlockV4.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private proto_java.BlockHeader header_;
  /**
   * <code>.proto_java.BlockHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.proto_java.BlockHeader header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public proto_java.BlockHeader getHeader() {
    return header_ == null ? proto_java.BlockHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.proto_java.BlockHeader header = 1;</code>
   */
  @java.lang.Override
  public proto_java.BlockHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int GHOSTDAGDATA_FIELD_NUMBER = 2;
  private proto_java.GhostdagData ghostdagData_;
  /**
   * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
   * @return Whether the ghostdagData field is set.
   */
  @java.lang.Override
  public boolean hasGhostdagData() {
    return ghostdagData_ != null;
  }
  /**
   * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
   * @return The ghostdagData.
   */
  @java.lang.Override
  public proto_java.GhostdagData getGhostdagData() {
    return ghostdagData_ == null ? proto_java.GhostdagData.getDefaultInstance() : ghostdagData_;
  }
  /**
   * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
   */
  @java.lang.Override
  public proto_java.GhostdagDataOrBuilder getGhostdagDataOrBuilder() {
    return getGhostdagData();
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
    if (ghostdagData_ != null) {
      output.writeMessage(2, getGhostdagData());
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
    if (ghostdagData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGhostdagData());
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
    if (!(obj instanceof proto_java.DaaBlockV4)) {
      return super.equals(obj);
    }
    proto_java.DaaBlockV4 other = (proto_java.DaaBlockV4) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (hasGhostdagData() != other.hasGhostdagData()) return false;
    if (hasGhostdagData()) {
      if (!getGhostdagData()
          .equals(other.getGhostdagData())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasGhostdagData()) {
      hash = (37 * hash) + GHOSTDAGDATA_FIELD_NUMBER;
      hash = (53 * hash) + getGhostdagData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto_java.DaaBlockV4 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.DaaBlockV4 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.DaaBlockV4 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.DaaBlockV4 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.DaaBlockV4 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto_java.DaaBlockV4 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto_java.DaaBlockV4 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.DaaBlockV4 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.DaaBlockV4 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto_java.DaaBlockV4 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto_java.DaaBlockV4 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto_java.DaaBlockV4 parseFrom(
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
  public static Builder newBuilder(proto_java.DaaBlockV4 prototype) {
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
   * Protobuf type {@code proto_java.DaaBlockV4}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto_java.DaaBlockV4)
      proto_java.DaaBlockV4OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto_java.P2P.internal_static_org_example_grpc_DaaBlockV4_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto_java.P2P.internal_static_org_example_grpc_DaaBlockV4_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto_java.DaaBlockV4.class, proto_java.DaaBlockV4.Builder.class);
    }

    // Construct using proto_java.DaaBlockV4.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (ghostdagDataBuilder_ == null) {
        ghostdagData_ = null;
      } else {
        ghostdagData_ = null;
        ghostdagDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto_java.P2P.internal_static_org_example_grpc_DaaBlockV4_descriptor;
    }

    @java.lang.Override
    public proto_java.DaaBlockV4 getDefaultInstanceForType() {
      return proto_java.DaaBlockV4.getDefaultInstance();
    }

    @java.lang.Override
    public proto_java.DaaBlockV4 build() {
      proto_java.DaaBlockV4 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto_java.DaaBlockV4 buildPartial() {
      proto_java.DaaBlockV4 result = new proto_java.DaaBlockV4(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (ghostdagDataBuilder_ == null) {
        result.ghostdagData_ = ghostdagData_;
      } else {
        result.ghostdagData_ = ghostdagDataBuilder_.build();
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
      if (other instanceof proto_java.DaaBlockV4) {
        return mergeFrom((proto_java.DaaBlockV4)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto_java.DaaBlockV4 other) {
      if (other == proto_java.DaaBlockV4.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasGhostdagData()) {
        mergeGhostdagData(other.getGhostdagData());
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
      proto_java.DaaBlockV4 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto_java.DaaBlockV4) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private proto_java.BlockHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.BlockHeader, proto_java.BlockHeader.Builder, proto_java.BlockHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.proto_java.BlockHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.proto_java.BlockHeader header = 1;</code>
     * @return The header.
     */
    public proto_java.BlockHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? proto_java.BlockHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto_java.BlockHeader header = 1;</code>
     */
    public Builder setHeader(proto_java.BlockHeader value) {
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
     * <code>.proto_java.BlockHeader header = 1;</code>
     */
    public Builder setHeader(
        proto_java.BlockHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto_java.BlockHeader header = 1;</code>
     */
    public Builder mergeHeader(proto_java.BlockHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            proto_java.BlockHeader.newBuilder(header_).mergeFrom(value).buildPartial();
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
     * <code>.proto_java.BlockHeader header = 1;</code>
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
     * <code>.proto_java.BlockHeader header = 1;</code>
     */
    public proto_java.BlockHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto_java.BlockHeader header = 1;</code>
     */
    public proto_java.BlockHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            proto_java.BlockHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.proto_java.BlockHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.BlockHeader, proto_java.BlockHeader.Builder, proto_java.BlockHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto_java.BlockHeader, proto_java.BlockHeader.Builder, proto_java.BlockHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private proto_java.GhostdagData ghostdagData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.GhostdagData, proto_java.GhostdagData.Builder, proto_java.GhostdagDataOrBuilder> ghostdagDataBuilder_;
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     * @return Whether the ghostdagData field is set.
     */
    public boolean hasGhostdagData() {
      return ghostdagDataBuilder_ != null || ghostdagData_ != null;
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     * @return The ghostdagData.
     */
    public proto_java.GhostdagData getGhostdagData() {
      if (ghostdagDataBuilder_ == null) {
        return ghostdagData_ == null ? proto_java.GhostdagData.getDefaultInstance() : ghostdagData_;
      } else {
        return ghostdagDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    public Builder setGhostdagData(proto_java.GhostdagData value) {
      if (ghostdagDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ghostdagData_ = value;
        onChanged();
      } else {
        ghostdagDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    public Builder setGhostdagData(
        proto_java.GhostdagData.Builder builderForValue) {
      if (ghostdagDataBuilder_ == null) {
        ghostdagData_ = builderForValue.build();
        onChanged();
      } else {
        ghostdagDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    public Builder mergeGhostdagData(proto_java.GhostdagData value) {
      if (ghostdagDataBuilder_ == null) {
        if (ghostdagData_ != null) {
          ghostdagData_ =
            proto_java.GhostdagData.newBuilder(ghostdagData_).mergeFrom(value).buildPartial();
        } else {
          ghostdagData_ = value;
        }
        onChanged();
      } else {
        ghostdagDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    public Builder clearGhostdagData() {
      if (ghostdagDataBuilder_ == null) {
        ghostdagData_ = null;
        onChanged();
      } else {
        ghostdagData_ = null;
        ghostdagDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    public proto_java.GhostdagData.Builder getGhostdagDataBuilder() {
      
      onChanged();
      return getGhostdagDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    public proto_java.GhostdagDataOrBuilder getGhostdagDataOrBuilder() {
      if (ghostdagDataBuilder_ != null) {
        return ghostdagDataBuilder_.getMessageOrBuilder();
      } else {
        return ghostdagData_ == null ?
            proto_java.GhostdagData.getDefaultInstance() : ghostdagData_;
      }
    }
    /**
     * <code>.proto_java.GhostdagData ghostdagData = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto_java.GhostdagData, proto_java.GhostdagData.Builder, proto_java.GhostdagDataOrBuilder> 
        getGhostdagDataFieldBuilder() {
      if (ghostdagDataBuilder_ == null) {
        ghostdagDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto_java.GhostdagData, proto_java.GhostdagData.Builder, proto_java.GhostdagDataOrBuilder>(
                getGhostdagData(),
                getParentForChildren(),
                isClean());
        ghostdagData_ = null;
      }
      return ghostdagDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto_java.DaaBlockV4)
  }

  // @@protoc_insertion_point(class_scope:proto_java.DaaBlockV4)
  private static final proto_java.DaaBlockV4 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto_java.DaaBlockV4();
  }

  public static proto_java.DaaBlockV4 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DaaBlockV4>
      PARSER = new com.google.protobuf.AbstractParser<DaaBlockV4>() {
    @java.lang.Override
    public DaaBlockV4 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DaaBlockV4(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DaaBlockV4> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DaaBlockV4> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto_java.DaaBlockV4 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
