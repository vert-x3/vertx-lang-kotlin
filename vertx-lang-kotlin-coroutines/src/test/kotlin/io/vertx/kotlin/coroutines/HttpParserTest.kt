/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.parsetools.RecordParser
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.launch
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
      GlobalScope.launch(vertx.dispatcher()) {
        val channel = recordParser.toChannel(vertx)
        val line = channel.receive().toString()
        val headers = HashMap<String, String>()
        while (true) {
          val header = channel.receive().toString()
          if (header.isEmpty()) {
            break
          }
          val pos = header.indexOf(':')
          headers[header.substring(0, pos).toLowerCase()] = header.substring(pos + 1).trim()
        }
        val transferEncoding = headers["transfer-encoding"]
        val contentLength = headers["content-length"]
        val request = when {
          transferEncoding == "chunked" -> recordParser.handleChunkedCase(channel, line)
          contentLength != null -> recordParser.handleFixedBody(channel, line, contentLength.toInt())
          else -> Request(line)
        }
        handler(request)
        socket.write("HTTP/1.1 200 OK\r\n\r\n")
      }
    }
    server.listen(8080, testContext.asyncAssertSuccess { async.complete() })
    async.awaitSuccess(20000)
  }

  private suspend fun RecordParser.handleChunkedCase(channel: ReceiveChannel<Buffer>, line: String): Request {
    val body = Buffer.buffer()
    while (true) {
      val len = channel.receive().toString().toInt(16)
      if (len == 0) {
        break
      }
      this.fixedSizeMode(len + 2)
      val chunk = channel.receive()
      body.appendBuffer(chunk, 0, chunk.length() - 2)
      this.delimitedMode("\r\n")
    }
    return Request(line, body)
  }

  private suspend fun RecordParser.handleFixedBody(
    channel: ReceiveChannel<Buffer>,
    line: String,
    contentLength: Int
  ): Request {
    this.fixedSizeMode(contentLength)
    val body = channel.receive()
    return Request(line, body)
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
    client.request(HttpMethod.GET, 8080, "localhost", "/foo", testContext.asyncAssertSuccess { request ->
      request.send(testContext.asyncAssertSuccess() { response ->

      });
    })
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
    client.request(HttpMethod.GET, 8080, "localhost", "/foo", testContext.asyncAssertSuccess { request ->
      request.send(Buffer.buffer("abc123"), testContext.asyncAssertSuccess() { response ->

      });
    })
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
    client.request(HttpMethod.PUT, 8080, "localhost", "/foo")
      .onComplete(testContext.asyncAssertSuccess() { req ->
        req.setChunked(true)
        req.write("abc")
        vertx.setTimer(1) {
          req.write("123")
          req.end()
        }
      })
  }
}
