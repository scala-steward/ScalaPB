// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.descriptor

/** Describes a value within an enum.
  */
@SerialVersionUID(0L)
final case class EnumValueDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    number: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    options: _root_.scala.Option[com.google.protobuf.descriptor.EnumValueOptions] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EnumValueDescriptorProto] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (number.isDefined) {
        val __value = number.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
      };
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      number.foreach { __v =>
        val __m = __v
        _output__.writeInt32(2, __m)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: EnumValueDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): EnumValueDescriptorProto = copy(name = _root_.scala.Option(__v))
    def getNumber: _root_.scala.Int = number.getOrElse(0)
    def clearNumber: EnumValueDescriptorProto = copy(number = _root_.scala.None)
    def withNumber(__v: _root_.scala.Int): EnumValueDescriptorProto = copy(number = _root_.scala.Option(__v))
    def getOptions: com.google.protobuf.descriptor.EnumValueOptions = options.getOrElse(com.google.protobuf.descriptor.EnumValueOptions.defaultInstance)
    def clearOptions: EnumValueDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.EnumValueOptions): EnumValueDescriptorProto = copy(options = _root_.scala.Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => number.orNull
        case 3 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => number.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.descriptor.EnumValueDescriptorProto.type = com.google.protobuf.descriptor.EnumValueDescriptorProto
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.EnumValueDescriptorProto])
}

object EnumValueDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumValueDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumValueDescriptorProto, com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumValueDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.EnumValueDescriptorProto, com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.EnumValueDescriptorProto): com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    scalaPbSource.number.foreach(javaPbOut.setNumber)
    scalaPbSource.options.map(com.google.protobuf.descriptor.EnumValueOptions.toJavaProto(_)).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto): com.google.protobuf.descriptor.EnumValueDescriptorProto = com.google.protobuf.descriptor.EnumValueDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
    number = if (javaPbSource.hasNumber) Some(javaPbSource.getNumber.intValue) else _root_.scala.None,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.EnumValueOptions.fromJavaProto(javaPbSource.getOptions)) else _root_.scala.None
  )
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumValueDescriptorProto = {
    var __name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var __number: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None
    var __options: _root_.scala.Option[com.google.protobuf.descriptor.EnumValueOptions] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 16 =>
          __number = _root_.scala.Option(_input__.readInt32())
        case 26 =>
          __options = _root_.scala.Option(__options.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.EnumValueOptions](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          val _ = _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.descriptor.EnumValueDescriptorProto(
        name = __name,
        number = __number,
        options = __options,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.EnumValueDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.EnumValueDescriptorProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        number = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.EnumValueOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.google.protobuf.descriptor.EnumValueOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumValueDescriptorProto(
    name = _root_.scala.None,
    number = _root_.scala.None,
    options = _root_.scala.None
  )
  implicit class EnumValueDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumValueDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumValueDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = _root_.scala.Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def number: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getNumber)((c_, f_) => c_.copy(number = _root_.scala.Option(f_)))
    def optionalNumber: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.number)((c_, f_) => c_.copy(number = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumValueOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = _root_.scala.Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.EnumValueOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val NUMBER_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    number: _root_.scala.Option[_root_.scala.Int],
    options: _root_.scala.Option[com.google.protobuf.descriptor.EnumValueOptions]
  ): _root_.com.google.protobuf.descriptor.EnumValueDescriptorProto = _root_.com.google.protobuf.descriptor.EnumValueDescriptorProto(
    name,
    number,
    options
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.EnumValueDescriptorProto])
}
