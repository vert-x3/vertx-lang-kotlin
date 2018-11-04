package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.buffer.Buffer
import io.vertx.core.parsetools.RecordParser
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.launch
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class HttpParserTest {

  private lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = Vertx.vertx()
  }

  @After
  fun after(testContext: TestContext) {
    vertx.close(testContext.asyncAssertSuccess())
  }

  class Request(line: String, val body: Buffer? = null) {
    val s = line.split(" ")
    val method = s[0]
    val uri = s[1]
    val version = s[2]
  }

  private fun startServer(testContext: TestContext, handler: (Request) -> Unit) {
    val async = testContext.async()
    val server = vertx.createNetServer().connectHandler { socket ->
      val recordParser = RecordParser.newDelimited("\r\n", socket)
      val channel = recordParser.toChannel(vertx, 0)
      GlobalScope.launch(vertx.dispatcher()) {
        println("[${Thread.currentThread().hashCode()}] Receive line")
        val line = channel.receive().toString()
        println("[${Thread.currentThread().hashCode()}] Received $line")
        val headers = HashMap<String, String>()
        while (true) {
          println("[${Thread.currentThread().hashCode()}] Receive header")
          val header = channel.receive().toString()
          println("[${Thread.currentThread().hashCode()}] Received $header")
          if (header.isEmpty()) {
            break
          }
          val pos = header.indexOf(':')
          headers[header.substring(0, pos).toLowerCase()] = header.substring(pos + 1).trim()
        }
        val transferEncoding = headers["transfer-encoding"]
        val contentLength = headers["content-length"]
        val request = when {
          transferEncoding == "chunked" -> {
            val body = Buffer.buffer()
            while (true) {
              val len = channel.receive().toString().toInt(16)
              if (len == 0) {
                break
              }
              recordParser.fixedSizeMode(len + 2)
              val chunk = channel.receive()
              body.appendBuffer(chunk, 0, chunk.length() - 2)
              recordParser.delimitedMode("\r\n")
            }
            Request(line, body)
          }
          contentLength != null -> {
            recordParser.fixedSizeMode(contentLength.toInt())
            val body = channel.receive()
            Request(line, body)
          }
          else -> Request(line)
        }
        handler(request)
        socket.write("HTTP/1.1 200 OK\r\n\r\n")
      }
    }
    server.listen(8080, testContext.asyncAssertSuccess { async.complete() })
    async.awaitSuccess(20000)
  }

  @Test
  fun `test get`(testContext: TestContext) {
    val async = testContext.async()
    startServer(testContext) { req ->
      testContext.assertEquals("GET", req.method)
      testContext.assertEquals("/foo", req.uri)
      testContext.assertEquals("HTTP/1.1", req.version)
      testContext.assertNull(req.body)
      async.complete()
    }
    val client = vertx.createHttpClient()
    client.get(8080, "localhost", "/foo") {}
      .exceptionHandler { err -> testContext.fail(err) }
      .end()
  }

  @Test
  fun `test put`(testContext: TestContext) {
    val async = testContext.async()
    startServer(testContext) { req ->
      testContext.assertEquals("PUT", req.method)
      testContext.assertEquals("/foo", req.uri)
      testContext.assertEquals("HTTP/1.1", req.version)
      testContext.assertEquals("abc123", req.body.toString())
      async.complete()
    }
    val client = vertx.createHttpClient()
    client.put(8080, "localhost", "/foo") {}
      .exceptionHandler { err -> testContext.fail(err) }
      .end("abc123")
  }

  @Test
  fun `test put chunked`(testContext: TestContext) {
    val async = testContext.async()
    startServer(testContext) { req ->
      testContext.assertEquals("PUT", req.method)
      testContext.assertEquals("/foo", req.uri)
      testContext.assertEquals("HTTP/1.1", req.version)
      testContext.assertEquals("abc123", req.body.toString())
      async.complete()
    }
    val client = vertx.createHttpClient()
    val req = client.put(8080, "localhost", "/foo") {}
      .exceptionHandler { err -> testContext.fail(err) }
      .setChunked(true)
    req.write("abc")
    vertx.setTimer(1) {
      req.write("123")
      req.end()
    }
  }
}
