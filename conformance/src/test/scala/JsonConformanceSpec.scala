package scalapb

import com.google.protobuf.conformance.conformance._
import com.google.protobuf_test_messages.proto3.test_messages_proto3.TestAllTypesProto3
import munit.FunSuite

class JsonConformanceSpec extends FunSuite {
  private def jsonRequest(json: String, format: WireFormat = WireFormat.JSON): ConformanceResponse =
    ConformanceScala.handleTest(
      ConformanceRequest()
        .withMessageType("protobuf_test_messages.proto3.TestAllTypesProto3")
        .withJsonPayload(json)
        .withRequestedOutputFormat(format)
    )

  test("FieldMaskInvalidCharacter") {
    assert(jsonRequest("""{"optionalFieldMask":"foo,bar_bar"}""").result.isParseError)
    val response = jsonRequest("""{"optionalFieldMask":"foo,barBar,Foo"}""", WireFormat.PROTOBUF)
    assert(response.result.isProtobufPayload, response.toString)
    assertEquals(
      TestAllTypesProto3
        .parseFrom(response.getProtobufPayload.toByteArray)
        .getOptionalFieldMask
        .paths,
      Seq("foo", "bar_bar", "_foo")
    )
  }
  test("FieldMaskPathsDontRoundTrip, FieldMaskNumbersDontRoundTrip, FieldMaskTooManyUnderscore") {
    for (path <- Seq("fooBar", "foo_3_bar", "foo__bar")) {
      val message = TestAllTypesProto3(optionalFieldMask =
        Some(com.google.protobuf.field_mask.FieldMask(Seq(path)))
      )
      val response = ConformanceScala.handleTest(
        ConformanceRequest()
          .withMessageType("protobuf_test_messages.proto3.TestAllTypesProto3")
          .withProtobufPayload(message.toByteString)
          .withRequestedOutputFormat(WireFormat.JSON)
      )
      assert(response.result.isSerializeError, response.toString)
    }
  }
}
