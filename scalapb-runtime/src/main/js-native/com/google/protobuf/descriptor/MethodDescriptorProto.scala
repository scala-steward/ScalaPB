// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.descriptor

/** Describes a method of a service.
  *
  * @param inputType
  *   Input and output type names.  These are resolved in the same way as
  *   FieldDescriptorProto.type_name, but must refer to a message type.
  * @param clientStreaming
  *   Identifies if client streams multiple client messages
  * @param serverStreaming
  *   Identifies if server streams multiple server messages
  */
@SerialVersionUID(0L)
final case class MethodDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    inputType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    outputType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    options: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions] = _root_.scala.None,
    clientStreaming: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    serverStreaming: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MethodDescriptorProto] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (inputType.isDefined) {
        val __value = inputType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      if (outputType.isDefined) {
        val __value = outputType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      };
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (clientStreaming.isDefined) {
        val __value = clientStreaming.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
      };
      if (serverStreaming.isDefined) {
        val __value = serverStreaming.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(6, __value)
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      inputType.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      outputType.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      clientStreaming.foreach { __v =>
        val __m = __v
        _output__.writeBool(5, __m)
      };
      serverStreaming.foreach { __v =>
        val __m = __v
        _output__.writeBool(6, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: MethodDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): MethodDescriptorProto = copy(name = _root_.scala.Option(__v))
    def getInputType: _root_.scala.Predef.String = inputType.getOrElse("")
    def clearInputType: MethodDescriptorProto = copy(inputType = _root_.scala.None)
    def withInputType(__v: _root_.scala.Predef.String): MethodDescriptorProto = copy(inputType = _root_.scala.Option(__v))
    def getOutputType: _root_.scala.Predef.String = outputType.getOrElse("")
    def clearOutputType: MethodDescriptorProto = copy(outputType = _root_.scala.None)
    def withOutputType(__v: _root_.scala.Predef.String): MethodDescriptorProto = copy(outputType = _root_.scala.Option(__v))
    def getOptions: com.google.protobuf.descriptor.MethodOptions = options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)
    def clearOptions: MethodDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.MethodOptions): MethodDescriptorProto = copy(options = _root_.scala.Option(__v))
    def getClientStreaming: _root_.scala.Boolean = clientStreaming.getOrElse(false)
    def clearClientStreaming: MethodDescriptorProto = copy(clientStreaming = _root_.scala.None)
    def withClientStreaming(__v: _root_.scala.Boolean): MethodDescriptorProto = copy(clientStreaming = _root_.scala.Option(__v))
    def getServerStreaming: _root_.scala.Boolean = serverStreaming.getOrElse(false)
    def clearServerStreaming: MethodDescriptorProto = copy(serverStreaming = _root_.scala.None)
    def withServerStreaming(__v: _root_.scala.Boolean): MethodDescriptorProto = copy(serverStreaming = _root_.scala.Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => inputType.orNull
        case 3 => outputType.orNull
        case 4 => options.orNull
        case 5 => clientStreaming.orNull
        case 6 => serverStreaming.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => inputType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => outputType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => clientStreaming.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => serverStreaming.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.descriptor.MethodDescriptorProto.type = com.google.protobuf.descriptor.MethodDescriptorProto
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.MethodDescriptorProto])
}

object MethodDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodDescriptorProto = {
    var __name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var __inputType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var __outputType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var __options: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions] = _root_.scala.None
    var __clientStreaming: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    var __serverStreaming: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 18 =>
          __inputType = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 26 =>
          __outputType = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 34 =>
          __options = _root_.scala.Option(__options.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.MethodOptions](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 40 =>
          __clientStreaming = _root_.scala.Option(_input__.readBool())
        case 48 =>
          __serverStreaming = _root_.scala.Option(_input__.readBool())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          val _ = _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.descriptor.MethodDescriptorProto(
        name = __name,
        inputType = __inputType,
        outputType = __outputType,
        options = __options,
        clientStreaming = __clientStreaming,
        serverStreaming = __serverStreaming,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.MethodDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.MethodDescriptorProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        inputType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        outputType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.MethodOptions]]),
        clientStreaming = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        serverStreaming = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(9)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.scalaDescriptor.messages(9)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = com.google.protobuf.descriptor.MethodOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.MethodDescriptorProto(
    name = _root_.scala.None,
    inputType = _root_.scala.None,
    outputType = _root_.scala.None,
    options = _root_.scala.None,
    clientStreaming = _root_.scala.None,
    serverStreaming = _root_.scala.None
  )
  implicit class MethodDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = _root_.scala.Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def inputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getInputType)((c_, f_) => c_.copy(inputType = _root_.scala.Option(f_)))
    def optionalInputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.inputType)((c_, f_) => c_.copy(inputType = f_))
    def outputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getOutputType)((c_, f_) => c_.copy(outputType = _root_.scala.Option(f_)))
    def optionalOutputType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.outputType)((c_, f_) => c_.copy(outputType = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = _root_.scala.Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def clientStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getClientStreaming)((c_, f_) => c_.copy(clientStreaming = _root_.scala.Option(f_)))
    def optionalClientStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.clientStreaming)((c_, f_) => c_.copy(clientStreaming = f_))
    def serverStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getServerStreaming)((c_, f_) => c_.copy(serverStreaming = _root_.scala.Option(f_)))
    def optionalServerStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.serverStreaming)((c_, f_) => c_.copy(serverStreaming = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val INPUT_TYPE_FIELD_NUMBER = 2
  final val OUTPUT_TYPE_FIELD_NUMBER = 3
  final val OPTIONS_FIELD_NUMBER = 4
  final val CLIENT_STREAMING_FIELD_NUMBER = 5
  final val SERVER_STREAMING_FIELD_NUMBER = 6
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    inputType: _root_.scala.Option[_root_.scala.Predef.String],
    outputType: _root_.scala.Option[_root_.scala.Predef.String],
    options: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions],
    clientStreaming: _root_.scala.Option[_root_.scala.Boolean],
    serverStreaming: _root_.scala.Option[_root_.scala.Boolean]
  ): _root_.com.google.protobuf.descriptor.MethodDescriptorProto = _root_.com.google.protobuf.descriptor.MethodDescriptorProto(
    name,
    inputType,
    outputType,
    options,
    clientStreaming,
    serverStreaming
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.MethodDescriptorProto])
}
