// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleInteractReq.proto

package emu.grasscutter.net.proto;

public final class VehicleInteractReqOuterClass {
  private VehicleInteractReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VehicleInteractReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VehicleInteractReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.VehicleInteractType interact_type = 8;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    int getInteractTypeValue();
    /**
     * <code>.VehicleInteractType interact_type = 8;</code>
     * @return The interactType.
     */
    emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType();

    /**
     * <code>uint32 pos = 12;</code>
     * @return The pos.
     */
    int getPos();

    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 865
   * EnetChannelId: 0
   * EnetIsReliable: false
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code VehicleInteractReq}
   */
  public static final class VehicleInteractReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VehicleInteractReq)
      VehicleInteractReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VehicleInteractReq.newBuilder() to construct.
    private VehicleInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VehicleInteractReq() {
      interactType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VehicleInteractReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VehicleInteractReq(
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
            case 64: {
              int rawValue = input.readEnum();

              interactType_ = rawValue;
              break;
            }
            case 96: {

              pos_ = input.readUInt32();
              break;
            }
            case 120: {

              entityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.class, emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.Builder.class);
    }

    public static final int INTERACT_TYPE_FIELD_NUMBER = 8;
    private int interactType_;
    /**
     * <code>.VehicleInteractType interact_type = 8;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.VehicleInteractType interact_type = 8;</code>
     * @return The interactType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType result = emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(interactType_);
      return result == null ? emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
    }

    public static final int POS_FIELD_NUMBER = 12;
    private int pos_;
    /**
     * <code>uint32 pos = 12;</code>
     * @return The pos.
     */
    @java.lang.Override
    public int getPos() {
      return pos_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 15;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (interactType_ != emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
        output.writeEnum(8, interactType_);
      }
      if (pos_ != 0) {
        output.writeUInt32(12, pos_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(15, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (interactType_ != emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, interactType_);
      }
      if (pos_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pos_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq other = (emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq) obj;

      if (interactType_ != other.interactType_) return false;
      if (getPos()
          != other.getPos()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + INTERACT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + interactType_;
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq prototype) {
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
     * CmdId: 865
     * EnetChannelId: 0
     * EnetIsReliable: false
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code VehicleInteractReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VehicleInteractReq)
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.class, emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.newBuilder()
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
        interactType_ = 0;

        pos_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq build() {
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq buildPartial() {
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq result = new emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq(this);
        result.interactType_ = interactType_;
        result.pos_ = pos_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq) {
          return mergeFrom((emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq other) {
        if (other == emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.getDefaultInstance()) return this;
        if (other.interactType_ != 0) {
          setInteractTypeValue(other.getInteractTypeValue());
        }
        if (other.getPos() != 0) {
          setPos(other.getPos());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int interactType_ = 0;
      /**
       * <code>.VehicleInteractType interact_type = 8;</code>
       * @return The enum numeric value on the wire for interactType.
       */
      @java.lang.Override public int getInteractTypeValue() {
        return interactType_;
      }
      /**
       * <code>.VehicleInteractType interact_type = 8;</code>
       * @param value The enum numeric value on the wire for interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractTypeValue(int value) {
        
        interactType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.VehicleInteractType interact_type = 8;</code>
       * @return The interactType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType result = emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(interactType_);
        return result == null ? emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VehicleInteractType interact_type = 8;</code>
       * @param value The interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractType(emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        interactType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VehicleInteractType interact_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearInteractType() {
        
        interactType_ = 0;
        onChanged();
        return this;
      }

      private int pos_ ;
      /**
       * <code>uint32 pos = 12;</code>
       * @return The pos.
       */
      @java.lang.Override
      public int getPos() {
        return pos_;
      }
      /**
       * <code>uint32 pos = 12;</code>
       * @param value The pos to set.
       * @return This builder for chaining.
       */
      public Builder setPos(int value) {
        
        pos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPos() {
        
        pos_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VehicleInteractReq)
    }

    // @@protoc_insertion_point(class_scope:VehicleInteractReq)
    private static final emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq();
    }

    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VehicleInteractReq>
        PARSER = new com.google.protobuf.AbstractParser<VehicleInteractReq>() {
      @java.lang.Override
      public VehicleInteractReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VehicleInteractReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VehicleInteractReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VehicleInteractReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VehicleInteractReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VehicleInteractReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030VehicleInteractReq.proto\032\031VehicleInter" +
      "actType.proto\"a\n\022VehicleInteractReq\022+\n\ri" +
      "nteract_type\030\010 \001(\0162\024.VehicleInteractType" +
      "\022\013\n\003pos\030\014 \001(\r\022\021\n\tentity_id\030\017 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor(),
        });
    internal_static_VehicleInteractReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VehicleInteractReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VehicleInteractReq_descriptor,
        new java.lang.String[] { "InteractType", "Pos", "EntityId", });
    emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
