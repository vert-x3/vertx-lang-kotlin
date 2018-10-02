package io.vertx.lang.kotlin.test

import io.vertx.core.*
import io.vertx.core.buffer.*
import io.vertx.core.json.*
import io.vertx.core.streams.*
import io.vertx.kotlin.core.json.*
import io.vertx.kotlin.core.streams.*
import io.vertx.kotlin.core.buffer.*
import org.junit.Test
import java.time.Instant
import java.util.*
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.test.*

class JsonTest {
  @Test
  fun smoke() {
    val result = json {
      obj(
        "a" to array(1, 2, 3),
        "obj" to obj("b1" to 1, "b2" to "2"),
        "imperative-loop" to obj {
          for (i in 1..3) {
            put("k_$i", i)
          }
        },
        "map" to obj((1..3).map { "k_$it" to it }),
        "d" to "d"
      )
    }

    assertTrue { result is JsonObject }
    assertEquals("""{"a":[1,2,3],"obj":{"b1":1,"b2":"2"},"imperative-loop":{"k_1":1,"k_2":2,"k_3":3},"map":{"k_1":1,"k_2":2,"k_3":3},"d":"d"}""", result.toString())
  }

  @Test
  fun testMapToObj() {
    val result = json {
      obj(mapOf("k" to "v"))
    }

    assertTrue { result is JsonObject }
    assertEquals("{\"k\":\"v\"}", result.toString())
  }

  @Test
  fun testArrays() {
    val result = json {
      array(
        array(1, 2, 3),
        array(listOf(4, 5, 6)),
        array(setOf(7)),
        array {
          for (i in 8..10) {
            add(i)
          }
        }
      )
    }

    assertTrue { result is JsonArray }
    assertEquals("[[1,2,3],[4,5,6],[7],[8,9,10]]", result.toString())
  }

  @Test
  fun typeInference() {
    val r1: JsonObject = json { obj() }
    val r2: JsonArray = json { array() }

    assertNotNull(r1)
    assertNotNull(r2)
  }

  @Test
  fun testIndexAccessor() {
    assertEquals(1, json { array(1) }[0])
  }

  @Test
  fun testKeyAccessor() {
    assertEquals("v", json { obj("k" to "v") }["k"])
  }

  @Test
  fun testAppendJson() {
    val b = Buffer.buffer().appendJson {
      obj("k" to "v")
    }
    assertEquals("{\"k\":\"v\"}", b.toString(Charsets.UTF_8))
    val c = Buffer.buffer().appendJson { User("Julien", "Viet") }
    assertEquals("{\"firstName\":\"Julien\",\"lastName\":\"Viet\"}", c.toString(Charsets.UTF_8))
    val d = Buffer.buffer().appendJson(true, { User("Julien", "Viet") })
    assertEquals("{\n  \"firstName\" : \"Julien\",\n  \"lastName\" : \"Viet\"\n}", d.toString(Charsets.UTF_8))
  }

  class User(val firstName: String, val lastName: String) {
  }

  @Test
  fun testWriteJson() {
    val received = ArrayList<Buffer>()
    val ended = AtomicBoolean()
    val ws = object : WriteStream<Buffer> {
      override fun write(data: Buffer?): WriteStream<Buffer> {
        data?.let { received.add(it) }
        return this
      }

      override fun writeQueueFull(): Boolean {
        throw UnsupportedOperationException("not implemented")
      }

      override fun end() {
        ended.set(true)
      }

      override fun drainHandler(handler: Handler<Void>?): WriteStream<Buffer> {
        throw UnsupportedOperationException("not implemented")
      }

      override fun exceptionHandler(handler: Handler<Throwable>?): WriteStream<Buffer> {
        throw UnsupportedOperationException("not implemented")
      }

      override fun setWriteQueueMaxSize(maxSize: Int): WriteStream<Buffer> {
        throw UnsupportedOperationException("not implemented")
      }
    }

    ws.write {
      obj("k" to "v")
    }
    assertEquals(1, received.size)
    assertEquals("{\"k\":\"v\"}", received.single().toString(Charsets.UTF_8))
    assertFalse(ended.get())

    received.clear()
    ws.end {
      obj("k" to "v")
    }
    assertEquals(1, received.size)
    assertEquals("{\"k\":\"v\"}", received.single().toString(Charsets.UTF_8))
    assertTrue(ended.get())
  }

  @Test
  fun testInferenceObj() {
    val arr = json {
      array(obj(
        "foo" to "foo_value"
      ))
    }

    val obj: JsonObject = arr.getJsonObject(0)
    assertNotNull(obj)
    assertEquals("foo_value", obj.getString("foo"))
  }

  @Test
  fun testInferenceArray() {
    val arr = json {
      array(array(1))
    }

    val subArray: JsonArray = arr.getJsonArray(0)
    assertNotNull(subArray)
    assertEquals(1, subArray.getInteger(0))
  }

  @Test
  fun testInstantProcessing() {
    val expected = Instant.now()
    val json = JsonObject("time" to expected)

    val actual = json.getInstant("time")

    assertEquals(expected, actual)
  }

  @Test
  fun testByteArrayProcessing() {
    val expected = ByteArray(3)
    expected.set(0, 0)
    expected.set(1, 1)
    expected.set(2, 2)
    val json = JsonObject("bytes" to expected)

    val actual = json.getBinary("bytes")

    assertEquals(expected[0], actual[0])
    assertEquals(expected[1], actual[1])
    assertEquals(expected[2], actual[2])
  }

  @Test
  fun testNormalProcessing() {
    val expected = "A Value"
    val json = JsonObject("key" to expected)

    val actual = json.getString("key")

    assertEquals(expected, actual)
  }
}
