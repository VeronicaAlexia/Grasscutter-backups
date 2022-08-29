// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ModifierProperty.proto

package emu.grasscutter.net.proto;

public final class ModifierPropertyOuterClass {
  private ModifierPropertyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModifierPropertyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ModifierProperty)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilityString key = 15;</code>
     * @return Whether the key field is set.
     */
    boolean hasKey();
    /**
     * <code>.AbilityString key = 15;</code>
     * @return The key.
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getKey();
    /**
     * <code>.AbilityString key = 15;</code>
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getKeyOrBuilder();

    /**
     * <code>float value = 5;</code>
     * @return The value.
     */
    float getValue();
  }
  /**
   * Protobuf type {@code ModifierProperty}
   */
  public static final class ModifierProperty extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ModifierProperty)
      ModifierPropertyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModifierProperty.newBuilder() to construct.
    private ModifierProperty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModifierProperty() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ModifierProperty();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ModifierProperty(
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
            case 45: {

              value_ = input.readFloat();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
              if (key_ != null) {
                subBuilder = key_.toBuilder();
              }
              key_ = input.readMessage(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(key_);
                key_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.ModifierPropertyOuterClass.internal_static_ModifierProperty_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ModifierPropertyOuterClass.internal_static_ModifierProperty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.class, emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString key_;
    /**
     * <code>.AbilityString key = 15;</code>
     * @return Whether the key field is set.
     */
    @java.lang.Override
    public boolean hasKey() {
      return key_ != null;
    }
    /**
     * <code>.AbilityString key = 15;</code>
     * @return The key.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getKey() {
      return key_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : key_;
    }
    /**
     * <code>.AbilityString key = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getKeyOrBuilder() {
      return getKey();
    }

    public static final int VALUE_FIELD_NUMBER = 5;
    private float value_;
    /**
     * <code>float value = 5;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
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
      if (value_ != 0F) {
        output.writeFloat(5, value_);
      }
      if (key_ != null) {
        output.writeMessage(15, getKey());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, value_);
      }
      if (key_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getKey());
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
      if (!(obj instanceof emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty other = (emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty) obj;

      if (hasKey() != other.hasKey()) return false;
      if (hasKey()) {
        if (!getKey()
            .equals(other.getKey())) return false;
      }
      if (java.lang.Float.floatToIntBits(getValue())
          != java.lang.Float.floatToIntBits(
              other.getValue())) return false;
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
      if (hasKey()) {
        hash = (37 * hash) + KEY_FIELD_NUMBER;
        hash = (53 * hash) + getKey().hashCode();
      }
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getValue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty prototype) {
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
     * Protobuf type {@code ModifierProperty}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ModifierProperty)
        emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierPropertyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ModifierPropertyOuterClass.internal_static_ModifierProperty_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ModifierPropertyOuterClass.internal_static_ModifierProperty_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.class, emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.newBuilder()
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
        if (keyBuilder_ == null) {
          key_ = null;
        } else {
          key_ = null;
          keyBuilder_ = null;
        }
        value_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ModifierPropertyOuterClass.internal_static_ModifierProperty_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty build() {
        emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty buildPartial() {
        emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty result = new emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty(this);
        if (keyBuilder_ == null) {
          result.key_ = key_;
        } else {
          result.key_ = keyBuilder_.build();
        }
        result.value_ = value_;
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
        if (other instanceof emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty) {
          return mergeFrom((emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty other) {
        if (other == emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty.getDefaultInstance()) return this;
        if (other.hasKey()) {
          mergeKey(other.getKey());
        }
        if (other.getValue() != 0F) {
          setValue(other.getValue());
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
        emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString key_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> keyBuilder_;
      /**
       * <code>.AbilityString key = 15;</code>
       * @return Whether the key field is set.
       */
      public boolean hasKey() {
        return keyBuilder_ != null || key_ != null;
      }
      /**
       * <code>.AbilityString key = 15;</code>
       * @return The key.
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getKey() {
        if (keyBuilder_ == null) {
          return key_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : key_;
        } else {
          return keyBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      public Builder setKey(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (keyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          key_ = value;
          onChanged();
        } else {
          keyBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      public Builder setKey(
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (keyBuilder_ == null) {
          key_ = builderForValue.build();
          onChanged();
        } else {
          keyBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      public Builder mergeKey(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (keyBuilder_ == null) {
          if (key_ != null) {
            key_ =
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.newBuilder(key_).mergeFrom(value).buildPartial();
          } else {
            key_ = value;
          }
          onChanged();
        } else {
          keyBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      public Builder clearKey() {
        if (keyBuilder_ == null) {
          key_ = null;
          onChanged();
        } else {
          key_ = null;
          keyBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder getKeyBuilder() {
        
        onChanged();
        return getKeyFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getKeyOrBuilder() {
        if (keyBuilder_ != null) {
          return keyBuilder_.getMessageOrBuilder();
        } else {
          return key_ == null ?
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : key_;
        }
      }
      /**
       * <code>.AbilityString key = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getKeyFieldBuilder() {
        if (keyBuilder_ == null) {
          keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getKey(),
                  getParentForChildren(),
                  isClean());
          key_ = null;
        }
        return keyBuilder_;
      }

      private float value_ ;
      /**
       * <code>float value = 5;</code>
       * @return The value.
       */
      @java.lang.Override
      public float getValue() {
        return value_;
      }
      /**
       * <code>float value = 5;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(float value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float value = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:ModifierProperty)
    }

    // @@protoc_insertion_point(class_scope:ModifierProperty)
    private static final emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty();
    }

    public static emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ModifierProperty>
        PARSER = new com.google.protobuf.AbstractParser<ModifierProperty>() {
      @java.lang.Override
      public ModifierProperty parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ModifierProperty(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ModifierProperty> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ModifierProperty> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ModifierPropertyOuterClass.ModifierProperty getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifierProperty_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifierProperty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ModifierProperty.proto\032\023AbilityString." +
      "proto\">\n\020ModifierProperty\022\033\n\003key\030\017 \001(\0132\016" +
      ".AbilityString\022\r\n\005value\030\005 \001(\002B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityStringOuterClass.getDescriptor(),
        });
    internal_static_ModifierProperty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ModifierProperty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifierProperty_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AbilityStringOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
