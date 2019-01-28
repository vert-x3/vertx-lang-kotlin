package io.vertx.lang.kotlin.test

import io.vertx.codegen.testmodel.DataObjectTCK
import io.vertx.codegen.testmodel.DataObjectTCKImpl
import io.vertx.codegen.testmodel.TestEnum
import io.vertx.codegen.testmodel.TestGenEnum
import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.codegen.testmodel.dataObjectWithBufferOf
import io.vertx.kotlin.codegen.testmodel.dataObjectWithListAddersOf
import io.vertx.kotlin.codegen.testmodel.dataObjectWithListsOf
import io.vertx.kotlin.codegen.testmodel.dataObjectWithMapAddersOf
import io.vertx.kotlin.codegen.testmodel.dataObjectWithMapsOf
import io.vertx.kotlin.codegen.testmodel.dataObjectWithNestedBufferOf
import io.vertx.kotlin.codegen.testmodel.dataObjectWithValuesOf
import io.vertx.kotlin.codegen.testmodel.testDataObjectOf
import org.junit.Test
import java.time.Instant

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class DataObjectTCKTest {

  private val tck: DataObjectTCK = DataObjectTCKImpl()

  @Test
  fun testDataObjectWithValues() {
    val tck: DataObjectTCK = DataObjectTCKImpl()
    tck.dataObjectWithValues = dataObjectWithValuesOf(
      booleanValue = true,
      shortValue = 520,
      intValue = 123456,
      longValue = 123456789L,
      floatValue = 1.1f,
      doubleValue = 1.11,
      boxedBooleanValue = true,
      boxedShortValue = 1040,
      boxedIntValue = 654321,
      boxedLongValue = 987654321L,
      boxedFloatValue = 2.2f,
      boxedDoubleValue = 2.22,
      stringValue = "wibble",
      instantValue = Instant.parse("1984-05-27T00:05:00Z"),
      jsonObjectValue = JsonObject().put("foo", "eek").put("bar", "wibble"),
      jsonArrayValue = JsonArray().add("eek").add("wibble"),
      enumValue = TestEnum.TIM,
      genEnumValue = TestGenEnum.MIKE,
      dataObjectValue = testDataObjectOf(
        foo = "1",
        bar = 1,
        wibble = 1.1
      )
    )
  }

  @Test
  fun testDataObjectWithLists() {
    tck.dataObjectWithLists = dataObjectWithListsOf(
      booleanValues = listOf(true, false, true),
      shortValues = listOf(0, 520, 1040),
      integerValues = listOf(0, 123456, 654321),
      longValues = listOf(0L, 123456789L, 987654321L),
      floatValues = listOf(1.1f, 2.2f, 3.3f),
      doubleValues = listOf(1.11, 2.22, 3.33),
      stringValues = listOf("stringValues1", "stringValues2", "stringValues3"),
      instantValues = listOf(Instant.parse("1984-05-27T00:05:00Z"), Instant.parse("2018-07-05T08:23:21Z")),
      jsonObjectValues = listOf(JsonObject().put("foo", "eek"), JsonObject().put("foo", "wibble")),
      jsonArrayValues = listOf(JsonArray().add("foo"), JsonArray().add("bar")),
      dataObjectValues = listOf(
        testDataObjectOf(foo = "1", bar = 1, wibble = 1.1),
        testDataObjectOf(foo = "2", bar = 2, wibble = 2.2)
      ),
      enumValues = listOf(TestEnum.TIM, TestEnum.JULIEN),
      genEnumValues = listOf(TestGenEnum.BOB, TestGenEnum.LAURA)
    )
  }

  @Test
  fun testDataObjectWithMaps() {
    tck.dataObjectWithMaps = dataObjectWithMapsOf(
      booleanValues = mapOf("1" to true, "2" to false),
      shortValues = mapOf("1" to 520.toShort(), "2" to 1040.toShort()),
      integerValues = mapOf("1" to 123456, "2" to 654321),
      longValues = mapOf("1" to 123456789L, "2" to 987654321L),
      floatValues = mapOf("1" to 1.1f, "2" to 2.2f),
      doubleValues = mapOf("1" to 1.11, "2" to 2.22),
      stringValues = mapOf("1" to "stringValues1", "2" to "stringValues2"),
      instantValues = mapOf("1" to Instant.parse("1984-05-27T00:05:00Z"), "2" to Instant.parse("2018-07-05T08:23:21Z")),
      jsonObjectValues = mapOf("1" to JsonObject().put("foo", "eek"), "2" to JsonObject().put("foo", "wibble")),
      jsonArrayValues = mapOf("1" to JsonArray().add("foo"), "2" to JsonArray().add("bar")),
      dataObjectValues = mapOf(
        "1" to testDataObjectOf(foo = "1", bar = 1, wibble = 1.1),
        "2" to testDataObjectOf(foo = "2", bar = 2, wibble = 2.2)
      ),
      enumValues = mapOf("1" to TestEnum.TIM, "2" to TestEnum.JULIEN),
      genEnumValues = mapOf("1" to TestGenEnum.BOB, "2" to TestGenEnum.LAURA)
    )
  }

  @Test
  fun testDataObjectWithBuffer() {
    tck.setDataObjectWithBuffer(dataObjectWithNestedBufferOf(
      buffer = Buffer.buffer("Hello World"),
      nested = dataObjectWithBufferOf(buffer = Buffer.buffer("Bye World")),
      buffers = listOf(Buffer.buffer("one"), Buffer.buffer("two"))
    ))
  }

  @Test
  fun testDataObjectWithListAdders() {
    tck.setDataObjectWithListAdders(dataObjectWithListAddersOf(
      booleanValues = listOf(true, false, true),
      shortValues = listOf(0, 520, 1040),
      integerValues = listOf(0, 123456, 654321),
      longValues = listOf(0L, 123456789L, 987654321L),
      floatValues = listOf(1.1f, 2.2f, 3.3f),
      doubleValues = listOf(1.11, 2.22, 3.33),
      stringValues = listOf("stringValues1", "stringValues2", "stringValues3"),
      instantValues = listOf(Instant.parse("1984-05-27T00:05:00Z"), Instant.parse("2018-07-05T08:23:21Z")),
      jsonObjectValues = listOf(JsonObject().put("foo", "eek"), JsonObject().put("foo", "wibble")),
      jsonArrayValues = listOf(JsonArray().add("foo"), JsonArray().add("bar")),
      dataObjectValues = listOf(
        testDataObjectOf(foo = "1", bar = 1, wibble = 1.1),
        testDataObjectOf(foo = "2", bar = 2, wibble = 2.2)
      ),
      enumValues = listOf(TestEnum.TIM, TestEnum.JULIEN),
      genEnumValues = listOf(TestGenEnum.BOB, TestGenEnum.LAURA)
    ))
  }

  @Test
  fun testDataObjectWithMapAdders() {
    tck.setDataObjectWithMapAdders(dataObjectWithMapAddersOf(
      booleanValues = mapOf("1" to true, "2" to false),
      shortValues = mapOf("1" to 520.toShort(), "2" to 1040.toShort()),
      integerValues = mapOf("1" to 123456, "2" to 654321),
      longValues = mapOf("1" to 123456789L, "2" to 987654321L),
      floatValues = mapOf("1" to 1.1f, "2" to 2.2f),
      doubleValues = mapOf("1" to 1.11, "2" to 2.22),
      stringValues = mapOf("1" to "stringValues1", "2" to "stringValues2"),
      instantValues = mapOf("1" to Instant.parse("1984-05-27T00:05:00Z"), "2" to Instant.parse("2018-07-05T08:23:21Z")),
      jsonObjectValues = mapOf("1" to JsonObject().put("foo", "eek"), "2" to JsonObject().put("foo", "wibble")),
      jsonArrayValues = mapOf("1" to JsonArray().add("foo"), "2" to JsonArray().add("bar")),
      dataObjectValues = mapOf(
        "1" to testDataObjectOf(foo = "1", bar = 1, wibble = 1.1),
        "2" to testDataObjectOf(foo = "2", bar = 2, wibble = 2.2)
      ),
      enumValues = mapOf("1" to TestEnum.TIM, "2" to TestEnum.JULIEN),
      genEnumValues = mapOf("1" to TestGenEnum.BOB, "2" to TestGenEnum.LAURA)
    ))
  }
}
