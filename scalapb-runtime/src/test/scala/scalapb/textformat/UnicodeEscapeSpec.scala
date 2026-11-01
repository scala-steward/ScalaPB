package scalapb.textformat

import com.google.protobuf.{ByteString, wrappers}
import munit.FunSuite
import scalapb.TextFormat

class UnicodeEscapeSpec extends FunSuite {
  private val slash = "\\"

  test("short Unicode escapes decode into UTF-8 for strings and bytes") {
    for ((digits, expected) <- Seq("0000" -> "\u0000", "1234" -> "\u1234", "FFFF" -> "\uffff")) {
      val input = "value: '" + slash + "u" + digits + "'"
      assertEquals(
        TextFormat.fromAscii(wrappers.StringValue, input),
        Right(wrappers.StringValue(expected))
      )
      assertEquals(
        TextFormat.fromAscii(wrappers.BytesValue, input),
        Right(wrappers.BytesValue(ByteString.copyFromUtf8(expected)))
      )
    }
    assertEquals(TextFormatUtils.unescapeText(slash + "u1234" + slash + "n!"), Right("\u1234\n!"))
  }

  test("short Unicode escapes reject incomplete digits and surrogate code points") {
    for (digits <- Seq("", "0", "123", "12xz", "d800", "dfff", "d801" + slash + "udc37")) {
      assert(TextFormatUtils.unescapeBytes(slash + "u" + digits).isLeft, digits)
    }
  }
}
