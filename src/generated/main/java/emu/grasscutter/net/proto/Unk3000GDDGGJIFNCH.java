// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_GDDGGJIFNCH.proto

package emu.grasscutter.net.proto;

public final class Unk3000GDDGGJIFNCH {
  private Unk3000GDDGGJIFNCH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_GDDGGJIFNCHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_GDDGGJIFNCH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3000_CFDMLGKNLKL = 8;</code>
     * @return The unk3000CFDMLGKNLKL.
     */
    int getUnk3000CFDMLGKNLKL();

    /**
     * <code>bool Unk3000_HONINDEHLNO = 15;</code>
     * @return The unk3000HONINDEHLNO.
     */
    boolean getUnk3000HONINDEHLNO();

    /**
     * <code>bool Unk3000_FIMENALCAKG = 10;</code>
     * @return The unk3000FIMENALCAKG.
     */
    boolean getUnk3000FIMENALCAKG();

    /**
     * <code>bool Unk3000_BJGNKDEGLGC = 6;</code>
     * @return The unk3000BJGNKDEGLGC.
     */
    boolean getUnk3000BJGNKDEGLGC();

    /**
     * <code>uint32 Unk3000_HPHLGFDHBON = 5;</code>
     * @return The unk3000HPHLGFDHBON.
     */
    int getUnk3000HPHLGFDHBON();
  }
  /**
   * Protobuf type {@code Unk3000_GDDGGJIFNCH}
   */
  public static final class Unk3000_GDDGGJIFNCH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_GDDGGJIFNCH)
      Unk3000_GDDGGJIFNCHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_GDDGGJIFNCH.newBuilder() to construct.
    private Unk3000_GDDGGJIFNCH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_GDDGGJIFNCH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_GDDGGJIFNCH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_GDDGGJIFNCH(
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
            case 40: {

              unk3000HPHLGFDHBON_ = input.readUInt32();
              break;
            }
            case 48: {

              unk3000BJGNKDEGLGC_ = input.readBool();
              break;
            }
            case 64: {

              unk3000CFDMLGKNLKL_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3000FIMENALCAKG_ = input.readBool();
              break;
            }
            case 120: {

              unk3000HONINDEHLNO_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.class, emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder.class);
    }

    public static final int UNK3000_CFDMLGKNLKL_FIELD_NUMBER = 8;
    private int unk3000CFDMLGKNLKL_;
    /**
     * <code>uint32 Unk3000_CFDMLGKNLKL = 8;</code>
     * @return The unk3000CFDMLGKNLKL.
     */
    @java.lang.Override
    public int getUnk3000CFDMLGKNLKL() {
      return unk3000CFDMLGKNLKL_;
    }

    public static final int UNK3000_HONINDEHLNO_FIELD_NUMBER = 15;
    private boolean unk3000HONINDEHLNO_;
    /**
     * <code>bool Unk3000_HONINDEHLNO = 15;</code>
     * @return The unk3000HONINDEHLNO.
     */
    @java.lang.Override
    public boolean getUnk3000HONINDEHLNO() {
      return unk3000HONINDEHLNO_;
    }

    public static final int UNK3000_FIMENALCAKG_FIELD_NUMBER = 10;
    private boolean unk3000FIMENALCAKG_;
    /**
     * <code>bool Unk3000_FIMENALCAKG = 10;</code>
     * @return The unk3000FIMENALCAKG.
     */
    @java.lang.Override
    public boolean getUnk3000FIMENALCAKG() {
      return unk3000FIMENALCAKG_;
    }

    public static final int UNK3000_BJGNKDEGLGC_FIELD_NUMBER = 6;
    private boolean unk3000BJGNKDEGLGC_;
    /**
     * <code>bool Unk3000_BJGNKDEGLGC = 6;</code>
     * @return The unk3000BJGNKDEGLGC.
     */
    @java.lang.Override
    public boolean getUnk3000BJGNKDEGLGC() {
      return unk3000BJGNKDEGLGC_;
    }

    public static final int UNK3000_HPHLGFDHBON_FIELD_NUMBER = 5;
    private int unk3000HPHLGFDHBON_;
    /**
     * <code>uint32 Unk3000_HPHLGFDHBON = 5;</code>
     * @return The unk3000HPHLGFDHBON.
     */
    @java.lang.Override
    public int getUnk3000HPHLGFDHBON() {
      return unk3000HPHLGFDHBON_;
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
      if (unk3000HPHLGFDHBON_ != 0) {
        output.writeUInt32(5, unk3000HPHLGFDHBON_);
      }
      if (unk3000BJGNKDEGLGC_ != false) {
        output.writeBool(6, unk3000BJGNKDEGLGC_);
      }
      if (unk3000CFDMLGKNLKL_ != 0) {
        output.writeUInt32(8, unk3000CFDMLGKNLKL_);
      }
      if (unk3000FIMENALCAKG_ != false) {
        output.writeBool(10, unk3000FIMENALCAKG_);
      }
      if (unk3000HONINDEHLNO_ != false) {
        output.writeBool(15, unk3000HONINDEHLNO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000HPHLGFDHBON_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3000HPHLGFDHBON_);
      }
      if (unk3000BJGNKDEGLGC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, unk3000BJGNKDEGLGC_);
      }
      if (unk3000CFDMLGKNLKL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3000CFDMLGKNLKL_);
      }
      if (unk3000FIMENALCAKG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, unk3000FIMENALCAKG_);
      }
      if (unk3000HONINDEHLNO_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, unk3000HONINDEHLNO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH other = (emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH) obj;

      if (getUnk3000CFDMLGKNLKL()
          != other.getUnk3000CFDMLGKNLKL()) return false;
      if (getUnk3000HONINDEHLNO()
          != other.getUnk3000HONINDEHLNO()) return false;
      if (getUnk3000FIMENALCAKG()
          != other.getUnk3000FIMENALCAKG()) return false;
      if (getUnk3000BJGNKDEGLGC()
          != other.getUnk3000BJGNKDEGLGC()) return false;
      if (getUnk3000HPHLGFDHBON()
          != other.getUnk3000HPHLGFDHBON()) return false;
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
      hash = (37 * hash) + UNK3000_CFDMLGKNLKL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000CFDMLGKNLKL();
      hash = (37 * hash) + UNK3000_HONINDEHLNO_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000HONINDEHLNO());
      hash = (37 * hash) + UNK3000_FIMENALCAKG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000FIMENALCAKG());
      hash = (37 * hash) + UNK3000_BJGNKDEGLGC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000BJGNKDEGLGC());
      hash = (37 * hash) + UNK3000_HPHLGFDHBON_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000HPHLGFDHBON();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH prototype) {
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
     * Protobuf type {@code Unk3000_GDDGGJIFNCH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_GDDGGJIFNCH)
        emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.class, emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.newBuilder()
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
        unk3000CFDMLGKNLKL_ = 0;

        unk3000HONINDEHLNO_ = false;

        unk3000FIMENALCAKG_ = false;

        unk3000BJGNKDEGLGC_ = false;

        unk3000HPHLGFDHBON_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.internal_static_Unk3000_GDDGGJIFNCH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH build() {
        emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH buildPartial() {
        emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH result = new emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH(this);
        result.unk3000CFDMLGKNLKL_ = unk3000CFDMLGKNLKL_;
        result.unk3000HONINDEHLNO_ = unk3000HONINDEHLNO_;
        result.unk3000FIMENALCAKG_ = unk3000FIMENALCAKG_;
        result.unk3000BJGNKDEGLGC_ = unk3000BJGNKDEGLGC_;
        result.unk3000HPHLGFDHBON_ = unk3000HPHLGFDHBON_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH other) {
        if (other == emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.getDefaultInstance()) return this;
        if (other.getUnk3000CFDMLGKNLKL() != 0) {
          setUnk3000CFDMLGKNLKL(other.getUnk3000CFDMLGKNLKL());
        }
        if (other.getUnk3000HONINDEHLNO() != false) {
          setUnk3000HONINDEHLNO(other.getUnk3000HONINDEHLNO());
        }
        if (other.getUnk3000FIMENALCAKG() != false) {
          setUnk3000FIMENALCAKG(other.getUnk3000FIMENALCAKG());
        }
        if (other.getUnk3000BJGNKDEGLGC() != false) {
          setUnk3000BJGNKDEGLGC(other.getUnk3000BJGNKDEGLGC());
        }
        if (other.getUnk3000HPHLGFDHBON() != 0) {
          setUnk3000HPHLGFDHBON(other.getUnk3000HPHLGFDHBON());
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
        emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3000CFDMLGKNLKL_ ;
      /**
       * <code>uint32 Unk3000_CFDMLGKNLKL = 8;</code>
       * @return The unk3000CFDMLGKNLKL.
       */
      @java.lang.Override
      public int getUnk3000CFDMLGKNLKL() {
        return unk3000CFDMLGKNLKL_;
      }
      /**
       * <code>uint32 Unk3000_CFDMLGKNLKL = 8;</code>
       * @param value The unk3000CFDMLGKNLKL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CFDMLGKNLKL(int value) {
        
        unk3000CFDMLGKNLKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_CFDMLGKNLKL = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CFDMLGKNLKL() {
        
        unk3000CFDMLGKNLKL_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3000HONINDEHLNO_ ;
      /**
       * <code>bool Unk3000_HONINDEHLNO = 15;</code>
       * @return The unk3000HONINDEHLNO.
       */
      @java.lang.Override
      public boolean getUnk3000HONINDEHLNO() {
        return unk3000HONINDEHLNO_;
      }
      /**
       * <code>bool Unk3000_HONINDEHLNO = 15;</code>
       * @param value The unk3000HONINDEHLNO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000HONINDEHLNO(boolean value) {
        
        unk3000HONINDEHLNO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_HONINDEHLNO = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000HONINDEHLNO() {
        
        unk3000HONINDEHLNO_ = false;
        onChanged();
        return this;
      }

      private boolean unk3000FIMENALCAKG_ ;
      /**
       * <code>bool Unk3000_FIMENALCAKG = 10;</code>
       * @return The unk3000FIMENALCAKG.
       */
      @java.lang.Override
      public boolean getUnk3000FIMENALCAKG() {
        return unk3000FIMENALCAKG_;
      }
      /**
       * <code>bool Unk3000_FIMENALCAKG = 10;</code>
       * @param value The unk3000FIMENALCAKG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000FIMENALCAKG(boolean value) {
        
        unk3000FIMENALCAKG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_FIMENALCAKG = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000FIMENALCAKG() {
        
        unk3000FIMENALCAKG_ = false;
        onChanged();
        return this;
      }

      private boolean unk3000BJGNKDEGLGC_ ;
      /**
       * <code>bool Unk3000_BJGNKDEGLGC = 6;</code>
       * @return The unk3000BJGNKDEGLGC.
       */
      @java.lang.Override
      public boolean getUnk3000BJGNKDEGLGC() {
        return unk3000BJGNKDEGLGC_;
      }
      /**
       * <code>bool Unk3000_BJGNKDEGLGC = 6;</code>
       * @param value The unk3000BJGNKDEGLGC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000BJGNKDEGLGC(boolean value) {
        
        unk3000BJGNKDEGLGC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_BJGNKDEGLGC = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000BJGNKDEGLGC() {
        
        unk3000BJGNKDEGLGC_ = false;
        onChanged();
        return this;
      }

      private int unk3000HPHLGFDHBON_ ;
      /**
       * <code>uint32 Unk3000_HPHLGFDHBON = 5;</code>
       * @return The unk3000HPHLGFDHBON.
       */
      @java.lang.Override
      public int getUnk3000HPHLGFDHBON() {
        return unk3000HPHLGFDHBON_;
      }
      /**
       * <code>uint32 Unk3000_HPHLGFDHBON = 5;</code>
       * @param value The unk3000HPHLGFDHBON to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000HPHLGFDHBON(int value) {
        
        unk3000HPHLGFDHBON_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_HPHLGFDHBON = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000HPHLGFDHBON() {
        
        unk3000HPHLGFDHBON_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_GDDGGJIFNCH)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_GDDGGJIFNCH)
    private static final emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH();
    }

    public static emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_GDDGGJIFNCH>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_GDDGGJIFNCH>() {
      @java.lang.Override
      public Unk3000_GDDGGJIFNCH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_GDDGGJIFNCH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_GDDGGJIFNCH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_GDDGGJIFNCH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_GDDGGJIFNCH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_GDDGGJIFNCH.proto\"\246\001\n\023Unk3000_" +
      "GDDGGJIFNCH\022\033\n\023Unk3000_CFDMLGKNLKL\030\010 \001(\r" +
      "\022\033\n\023Unk3000_HONINDEHLNO\030\017 \001(\010\022\033\n\023Unk3000" +
      "_FIMENALCAKG\030\n \001(\010\022\033\n\023Unk3000_BJGNKDEGLG" +
      "C\030\006 \001(\010\022\033\n\023Unk3000_HPHLGFDHBON\030\005 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_GDDGGJIFNCH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_GDDGGJIFNCH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_GDDGGJIFNCH_descriptor,
        new java.lang.String[] { "Unk3000CFDMLGKNLKL", "Unk3000HONINDEHLNO", "Unk3000FIMENALCAKG", "Unk3000BJGNKDEGLGC", "Unk3000HPHLGFDHBON", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
