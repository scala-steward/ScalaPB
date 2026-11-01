package scalapb

import com.google.protobuf.{ByteString, DynamicMessage, TextFormat => JavaTextFormat}
import com.google.protobuf.conformance.conformance._
import com.google.protobuf_test_messages.proto3.test_messages_proto3.TestAllTypesProto3
import munit.FunSuite

class TextFormatConformanceSpec extends FunSuite {
  private def checkText(input: String, expected: TestAllTypesProto3): Unit = {
    for (format <- Seq(WireFormat.PROTOBUF, WireFormat.TEXT_FORMAT)) {
      val response = ConformanceScala.handleTest(
        ConformanceRequest()
          .withMessageType("protobuf_test_messages.proto3.TestAllTypesProto3")
          .withTextPayload(input)
          .withRequestedOutputFormat(format)
          .withTestCategory(TestCategory.TEXT_FORMAT_TEST)
      )
      if (format == WireFormat.PROTOBUF) {
        assert(response.result.isProtobufPayload, response.toString)
        assertEquals(
          TestAllTypesProto3.parseFrom(response.getProtobufPayload.toByteArray),
          expected
        )
      } else {
        assert(response.result.isTextPayload, response.toString)
        val parsed = DynamicMessage.newBuilder(TestAllTypesProto3.javaDescriptor)
        JavaTextFormat.getParser.merge(response.getTextPayload, parsed)
        assertEquals(
          parsed.build(),
          DynamicMessage.parseFrom(TestAllTypesProto3.javaDescriptor, expected.toByteArray)
        )
      }
    }
  }

  test("StringLiteralShortUnicodeEscapeString and Bytes") {
    val escape = "\\" + "u1234"
    checkText("optional_string: '" + escape + "'", TestAllTypesProto3(optionalString = "\u1234"))
    checkText(
      "optional_bytes: '" + escape + "'",
      TestAllTypesProto3(optionalBytes = ByteString.copyFromUtf8("\u1234"))
    )
  }
}
