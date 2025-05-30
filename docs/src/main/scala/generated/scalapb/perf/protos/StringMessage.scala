// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package scalapb.perf.protos

@SerialVersionUID(0L)
final case class StringMessage(
    str1: _root_.scala.Predef.String = "",
    str2: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[StringMessage] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = str1
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = str2
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
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
      {
        val __v = str1
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = str2
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withStr1(__v: _root_.scala.Predef.String): StringMessage = copy(str1 = __v)
    def withStr2(__v: _root_.scala.Predef.String): StringMessage = copy(str2 = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = str1
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = str2
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(str1)
        case 2 => _root_.scalapb.descriptors.PString(str2)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: scalapb.perf.protos.StringMessage.type = scalapb.perf.protos.StringMessage
    // @@protoc_insertion_point(GeneratedMessage[scalapb.perf.StringMessage])
}

object StringMessage extends scalapb.GeneratedMessageCompanion[scalapb.perf.protos.StringMessage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.perf.protos.StringMessage] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.perf.protos.StringMessage = {
    var __str1: _root_.scala.Predef.String = ""
    var __str2: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __str1 = _input__.readStringRequireUtf8()
        case 18 =>
          __str2 = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          val _ = _unknownFields__.parseField(tag, _input__)
      }
    }
    scalapb.perf.protos.StringMessage(
        str1 = __str1,
        str2 = __str2,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.perf.protos.StringMessage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.perf.protos.StringMessage(
        str1 = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        str2 = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = scalapb.perf.protos.ProtosProto.javaDescriptor.getMessageTypes().get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = scalapb.perf.protos.ProtosProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.perf.protos.StringMessage(
    str1 = "",
    str2 = ""
  )
  implicit class StringMessageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.StringMessage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.perf.protos.StringMessage](_l) {
    def str1: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.str1)((c_, f_) => c_.copy(str1 = f_))
    def str2: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.str2)((c_, f_) => c_.copy(str2 = f_))
  }
  final val STR1_FIELD_NUMBER = 1
  final val STR2_FIELD_NUMBER = 2
  def of(
    str1: _root_.scala.Predef.String,
    str2: _root_.scala.Predef.String
  ): _root_.scalapb.perf.protos.StringMessage = _root_.scalapb.perf.protos.StringMessage(
    str1,
    str2
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.perf.StringMessage])
}
