// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package scalapb.options

/** Represents a custom Collection type in Scala. This allows ScalaPB to integrate with
  * collection types that are different enough from the ones in the standard library.
  *
  * @param type
  *   Type of the collection
  * @param nonEmpty
  *   Set to true if this collection type is not allowed to be empty, for example
  *   cats.data.NonEmptyList.  When true, ScalaPB will not generate `clearX` for the repeated
  *   field and not provide a default argument in the constructor.
  * @param adapter
  *   An Adapter is a Scala object available at runtime that provides certain static methods
  *   that can operate on this collection type.
  */
@SerialVersionUID(0L)
final case class Collection(
    `type`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    nonEmpty: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    adapter: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Collection] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (nonEmpty.isDefined) {
        val __value = nonEmpty.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      if (adapter.isDefined) {
        val __value = adapter.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      nonEmpty.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      adapter.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: Collection = copy(`type` = _root_.scala.None)
    def withType(__v: _root_.scala.Predef.String): Collection = copy(`type` = _root_.scala.Option(__v))
    def getNonEmpty: _root_.scala.Boolean = nonEmpty.getOrElse(false)
    def clearNonEmpty: Collection = copy(nonEmpty = _root_.scala.None)
    def withNonEmpty(__v: _root_.scala.Boolean): Collection = copy(nonEmpty = _root_.scala.Option(__v))
    def getAdapter: _root_.scala.Predef.String = adapter.getOrElse("")
    def clearAdapter: Collection = copy(adapter = _root_.scala.None)
    def withAdapter(__v: _root_.scala.Predef.String): Collection = copy(adapter = _root_.scala.Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `type`.orNull
        case 2 => nonEmpty.orNull
        case 3 => adapter.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => `type`.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => nonEmpty.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => adapter.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: scalapb.options.Collection.type = scalapb.options.Collection
    // @@protoc_insertion_point(GeneratedMessage[scalapb.Collection])
}

object Collection extends scalapb.GeneratedMessageCompanion[scalapb.options.Collection] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.Collection] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.Collection = {
    var __type: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var __nonEmpty: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    var __adapter: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __type = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 16 =>
          __nonEmpty = _root_.scala.Option(_input__.readBool())
        case 26 =>
          __adapter = _root_.scala.Option(_input__.readStringRequireUtf8())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          val _ = _unknownFields__.parseField(tag, _input__)
      }
    }
    scalapb.options.Collection(
        `type` = __type,
        nonEmpty = __nonEmpty,
        adapter = __adapter,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.Collection] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.Collection(
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        nonEmpty = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        adapter = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = scalapb.options.ScalapbProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = scalapb.options.ScalapbProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.Collection(
    `type` = _root_.scala.None,
    nonEmpty = _root_.scala.None,
    adapter = _root_.scala.None
  )
  implicit class CollectionLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.Collection]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.Collection](_l) {
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = _root_.scala.Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def nonEmpty: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNonEmpty)((c_, f_) => c_.copy(nonEmpty = _root_.scala.Option(f_)))
    def optionalNonEmpty: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.nonEmpty)((c_, f_) => c_.copy(nonEmpty = f_))
    def adapter: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getAdapter)((c_, f_) => c_.copy(adapter = _root_.scala.Option(f_)))
    def optionalAdapter: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.adapter)((c_, f_) => c_.copy(adapter = f_))
  }
  final val TYPE_FIELD_NUMBER = 1
  final val NON_EMPTY_FIELD_NUMBER = 2
  final val ADAPTER_FIELD_NUMBER = 3
  def of(
    `type`: _root_.scala.Option[_root_.scala.Predef.String],
    nonEmpty: _root_.scala.Option[_root_.scala.Boolean],
    adapter: _root_.scala.Option[_root_.scala.Predef.String]
  ): _root_.scalapb.options.Collection = _root_.scalapb.options.Collection(
    `type`,
    nonEmpty,
    adapter
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.Collection])
}
