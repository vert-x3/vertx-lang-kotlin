package io.vertx.kotlin.coroutines

import io.vertx.core.MultiMap
import io.vertx.core.Vertx
import io.vertx.core.buffer.Buffer
import io.vertx.core.parsetools.RecordParser
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
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

  suspend fun readChunk(parser : RecordParser) : Buffer {
    return asyncEvent { parser.setOutput(it) }
  }

  class Request(val line : String, val body : Buffer? = null) {
  }

  fun startServer(testContext: TestContext, handler: (Request) -> Unit) {
    val async = testContext.async()
    val server = vertx.createNetServer().connectHandler { so ->
      val recordParser = RecordParser.newDelimited("\r\n")
      so.handler(recordParser)
      vertx.runCoroutine {
        val line = readChunk(recordParser).toString()
        val headers = MultiMap.caseInsensitiveMultiMap()
        while (true) {
          val header = readChunk(recordParser).toString()
          if (header.isEmpty()) {
            break
          }
          val pos = header.indexOf(':')
          headers[header.substring(0, pos)] = header.substring(pos + 1).trim()
        }
        val transferEncoding = headers.get("transfer-encoding")
        val contentLength = headers.get("content-length")
        val request : Request
        if (transferEncoding == "chunked") {
          val body = Buffer.buffer()
          while (true) {
            val len = readChunk(recordParser).toString().toInt(16)
            if (len == 0) {
              break
            }
            recordParser.fixedSizeMode(len + 2)
            val chunk = readChunk(recordParser)
            body.appendBuffer(chunk, 0, chunk.length() - 2)
            recordParser.delimitedMode("\r\n")
          }
          request = Request(line, body)
        } else if (contentLength != null) {
          recordParser.fixedSizeMode(contentLength.toInt())
          val body = readChunk(recordParser)
          request = Request(line, body)
        } else {
          request = Request(line)
        }
        handler(request)
        so.write("HTTP/1.1 200 OK\r\n\r\n")
      }
    }
    server.listen(8080, testContext.asyncAssertSuccess { async.complete() })
    async.awaitSuccess(20000)
  }

  @Test
  fun testGet(testContext: TestContext) {
    val async = testContext.async()
    startServer(testContext) { req ->
      testContext.assertEquals("GET /foo HTTP/1.1", req.line)
      testContext.assertNull(req.body)
      async.complete()
    }
    val client = vertx.createHttpClient()
    client.get(8080, "localhost", "/foo") { resp ->

    }.exceptionHandler { err ->
      testContext.fail(err)
    }.end()
  }

  @Test
  fun testPut(testContext: TestContext) {
    val async = testContext.async()
    startServer(testContext) { req ->
      testContext.assertEquals("PUT /foo HTTP/1.1", req.line)
      testContext.assertEquals("abc123", req.body.toString())
      async.complete()
    }
    val client = vertx.createHttpClient()
    client.put(8080, "localhost", "/foo") { resp ->

    }.exceptionHandler { err ->
      testContext.fail(err)
    }.end("abc123")
  }

  @Test
  fun testPutChunked(testContext: TestContext) {
    val async = testContext.async()
    startServer(testContext) { req ->
      testContext.assertEquals("PUT /foo HTTP/1.1", req.line)
      testContext.assertEquals("abc123", req.body.toString())
      async.complete()
    }
    val client = vertx.createHttpClient()
    val req = client.put(8080, "localhost", "/foo") { resp ->

    }.exceptionHandler { err ->
      testContext.fail(err)
    }.setChunked(true)
    req.write("abc")
    vertx.setTimer(1) {
      req.write("123")
      req.end()
    }
  }
}
