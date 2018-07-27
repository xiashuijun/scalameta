// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scala.meta.internal.semanticidx

sealed trait Entry {
  final def isEmpty = this.isInstanceOf[scala.meta.internal.semanticidx.Entry.Empty.type]
  final def isDefined = !isEmpty
  final def asMessage: scala.meta.internal.semanticidx.EntryMessage = scala.meta.internal.semanticidx.Entry.EntryTypeMapper.toBase(this)
}

object Entry {
  case object Empty extends scala.meta.internal.semanticidx.Entry
  
  def defaultInstance: scala.meta.internal.semanticidx.Entry = Empty
  
  implicit val EntryTypeMapper: _root_.scalapb.TypeMapper[scala.meta.internal.semanticidx.EntryMessage, scala.meta.internal.semanticidx.Entry] = new _root_.scalapb.TypeMapper[scala.meta.internal.semanticidx.EntryMessage, scala.meta.internal.semanticidx.Entry] {
    override def toCustom(__base: scala.meta.internal.semanticidx.EntryMessage): scala.meta.internal.semanticidx.Entry = __base.sealedValue match {
      case __v: scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry => __v.value
      case __v: scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry => __v.value
      case scala.meta.internal.semanticidx.EntryMessage.SealedValue.Empty => Empty
    }
    override def toBase(__custom: scala.meta.internal.semanticidx.Entry): scala.meta.internal.semanticidx.EntryMessage = scala.meta.internal.semanticidx.EntryMessage(__custom match {
      case __v: scala.meta.internal.semanticidx.PackageEntry => scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry(__v)
      case __v: scala.meta.internal.semanticidx.ToplevelEntry => scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry(__v)
      case Empty => scala.meta.internal.semanticidx.EntryMessage.SealedValue.Empty
    })
  }
}
@SerialVersionUID(0L)
final case class EntryMessage(
    sealedValue: scala.meta.internal.semanticidx.EntryMessage.SealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.Empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[EntryMessage] with scalapb.lenses.Updatable[EntryMessage] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (sealedValue.packageEntry.isDefined) {
        val __value = sealedValue.packageEntry.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sealedValue.toplevelEntry.isDefined) {
        val __value = sealedValue.toplevelEntry.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      sealedValue.packageEntry.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sealedValue.toplevelEntry.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scala.meta.internal.semanticidx.EntryMessage = {
      var __sealedValue = this.sealedValue
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry(_root_.scalapb.LiteParser.readMessage(_input__, sealedValue.packageEntry.getOrElse(scala.meta.internal.semanticidx.PackageEntry.defaultInstance)))
          case 18 =>
            __sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry(_root_.scalapb.LiteParser.readMessage(_input__, sealedValue.toplevelEntry.getOrElse(scala.meta.internal.semanticidx.ToplevelEntry.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      scala.meta.internal.semanticidx.EntryMessage(
          sealedValue = __sealedValue
      )
    }
    def getPackageEntry: scala.meta.internal.semanticidx.PackageEntry = sealedValue.packageEntry.getOrElse(scala.meta.internal.semanticidx.PackageEntry.defaultInstance)
    def withPackageEntry(__v: scala.meta.internal.semanticidx.PackageEntry): EntryMessage = copy(sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry(__v))
    def getToplevelEntry: scala.meta.internal.semanticidx.ToplevelEntry = sealedValue.toplevelEntry.getOrElse(scala.meta.internal.semanticidx.ToplevelEntry.defaultInstance)
    def withToplevelEntry(__v: scala.meta.internal.semanticidx.ToplevelEntry): EntryMessage = copy(sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry(__v))
    def clearSealedValue: EntryMessage = copy(sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.Empty)
    def withSealedValue(__v: scala.meta.internal.semanticidx.EntryMessage.SealedValue): EntryMessage = copy(sealedValue = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => sealedValue.packageEntry.orNull
        case 2 => sealedValue.toplevelEntry.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => sealedValue.packageEntry.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => sealedValue.toplevelEntry.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scala.meta.internal.semanticidx.EntryMessage
    def toEntry: scala.meta.internal.semanticidx.Entry = scala.meta.internal.semanticidx.Entry.EntryTypeMapper.toCustom(this)
}

object EntryMessage extends scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticidx.EntryMessage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticidx.EntryMessage] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): scala.meta.internal.semanticidx.EntryMessage = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scala.meta.internal.semanticidx.EntryMessage(
      sealedValue = __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[scala.meta.internal.semanticidx.PackageEntry]].map(scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry)
    .orElse[scala.meta.internal.semanticidx.EntryMessage.SealedValue](__fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[scala.meta.internal.semanticidx.ToplevelEntry]].map(scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry))
    .getOrElse(scala.meta.internal.semanticidx.EntryMessage.SealedValue.Empty)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scala.meta.internal.semanticidx.EntryMessage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scala.meta.internal.semanticidx.EntryMessage(
        sealedValue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[scala.meta.internal.semanticidx.PackageEntry]]).map(scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry)
    .orElse[scala.meta.internal.semanticidx.EntryMessage.SealedValue](__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[scala.meta.internal.semanticidx.ToplevelEntry]]).map(scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry))
    .getOrElse(scala.meta.internal.semanticidx.EntryMessage.SealedValue.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SemanticidxProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SemanticidxProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = scala.meta.internal.semanticidx.PackageEntry
      case 2 => __out = scala.meta.internal.semanticidx.ToplevelEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scala.meta.internal.semanticidx.EntryMessage(
  )
  sealed trait SealedValue extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isPackageEntry: _root_.scala.Boolean = false
    def isToplevelEntry: _root_.scala.Boolean = false
    def packageEntry: _root_.scala.Option[scala.meta.internal.semanticidx.PackageEntry] = None
    def toplevelEntry: _root_.scala.Option[scala.meta.internal.semanticidx.ToplevelEntry] = None
  }
  object SealedValue extends {
    @SerialVersionUID(0L)
    case object Empty extends scala.meta.internal.semanticidx.EntryMessage.SealedValue {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class PackageEntry(value: scala.meta.internal.semanticidx.PackageEntry) extends scala.meta.internal.semanticidx.EntryMessage.SealedValue {
      type ValueType = scala.meta.internal.semanticidx.PackageEntry
      override def isPackageEntry: _root_.scala.Boolean = true
      override def packageEntry: _root_.scala.Option[scala.meta.internal.semanticidx.PackageEntry] = Some(value)
      override def number: _root_.scala.Int = 1
    }
    @SerialVersionUID(0L)
    final case class ToplevelEntry(value: scala.meta.internal.semanticidx.ToplevelEntry) extends scala.meta.internal.semanticidx.EntryMessage.SealedValue {
      type ValueType = scala.meta.internal.semanticidx.ToplevelEntry
      override def isToplevelEntry: _root_.scala.Boolean = true
      override def toplevelEntry: _root_.scala.Option[scala.meta.internal.semanticidx.ToplevelEntry] = Some(value)
      override def number: _root_.scala.Int = 2
    }
  }
  implicit class EntryMessageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticidx.EntryMessage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scala.meta.internal.semanticidx.EntryMessage](_l) {
    def packageEntry: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticidx.PackageEntry] = field(_.getPackageEntry)((c_, f_) => c_.copy(sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.PackageEntry(f_)))
    def toplevelEntry: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticidx.ToplevelEntry] = field(_.getToplevelEntry)((c_, f_) => c_.copy(sealedValue = scala.meta.internal.semanticidx.EntryMessage.SealedValue.ToplevelEntry(f_)))
    def sealedValue: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticidx.EntryMessage.SealedValue] = field(_.sealedValue)((c_, f_) => c_.copy(sealedValue = f_))
  }
  final val PACKAGEENTRY_FIELD_NUMBER = 1
  final val TOPLEVELENTRY_FIELD_NUMBER = 2
}

@SerialVersionUID(0L)
final case class PackageEntry(
    ) extends scala.meta.internal.semanticidx.Entry with scalapb.GeneratedMessage with scalapb.Message[PackageEntry] with scalapb.lenses.Updatable[PackageEntry] {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scala.meta.internal.semanticidx.PackageEntry = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => _input__.skipField(tag)
        }
      }
      scala.meta.internal.semanticidx.PackageEntry(
      )
    }
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = throw new MatchError(__fieldNumber)
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = throw new MatchError(__field)
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scala.meta.internal.semanticidx.PackageEntry
}

object PackageEntry extends scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticidx.PackageEntry] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticidx.PackageEntry] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): scala.meta.internal.semanticidx.PackageEntry = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    scala.meta.internal.semanticidx.PackageEntry(
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scala.meta.internal.semanticidx.PackageEntry] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scala.meta.internal.semanticidx.PackageEntry(
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SemanticidxProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SemanticidxProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scala.meta.internal.semanticidx.PackageEntry(
  )
  implicit class PackageEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticidx.PackageEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scala.meta.internal.semanticidx.PackageEntry](_l) {
  }
}

/** @param uri
  *   relative URI to semanticdb file containing full information
  */
@SerialVersionUID(0L)
final case class ToplevelEntry(
    uri: _root_.scala.Predef.String = ""
    ) extends scala.meta.internal.semanticidx.Entry with scalapb.GeneratedMessage with scalapb.Message[ToplevelEntry] with scalapb.lenses.Updatable[ToplevelEntry] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = uri
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = uri
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scala.meta.internal.semanticidx.ToplevelEntry = {
      var __uri = this.uri
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __uri = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      scala.meta.internal.semanticidx.ToplevelEntry(
          uri = __uri
      )
    }
    def withUri(__v: _root_.scala.Predef.String): ToplevelEntry = copy(uri = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = uri
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(uri)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scala.meta.internal.semanticidx.ToplevelEntry
}

object ToplevelEntry extends scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticidx.ToplevelEntry] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scala.meta.internal.semanticidx.ToplevelEntry] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): scala.meta.internal.semanticidx.ToplevelEntry = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scala.meta.internal.semanticidx.ToplevelEntry(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scala.meta.internal.semanticidx.ToplevelEntry] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scala.meta.internal.semanticidx.ToplevelEntry(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SemanticidxProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SemanticidxProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scala.meta.internal.semanticidx.ToplevelEntry(
  )
  implicit class ToplevelEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scala.meta.internal.semanticidx.ToplevelEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scala.meta.internal.semanticidx.ToplevelEntry](_l) {
    def uri: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.uri)((c_, f_) => c_.copy(uri = f_))
  }
  final val URI_FIELD_NUMBER = 1
}