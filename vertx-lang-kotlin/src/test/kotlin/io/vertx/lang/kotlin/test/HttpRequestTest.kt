package io.vertx.lang.kotlin.test

import io.vertx.core.http.HttpTestBase
import io.vertx.ext.web.client.WebClient
import io.vertx.ext.web.codec.BodyCodec
import io.vertx.kotlin.core.http.HttpClientOptions
import io.vertx.kotlin.core.http.HttpServerOptions
import io.vertx.kotlin.core.json.JsonObject
import io.vertx.kotlin.ext.web.client.mapTo
import io.vertx.lang.kotlin.test.jackson.WineAndCheese
import org.junit.Before
import org.junit.Test


class HttpRequestTest : HttpTestBase() {

  private lateinit var webClient: WebClient

  @Before
  fun setup() {
    super.setUp()
    client = vertx.createHttpClient(HttpClientOptions(defaultPort = 8080, defaultHost = "localhost"))
    webClient = WebClient.wrap(client)
    server.close()
    server = vertx.createHttpServer(HttpServerOptions(port = DEFAULT_HTTP_PORT, host = DEFAULT_HTTP_HOST))
  }

  @Test
  fun `test response body mapped to a different json object`() {
    val expected = JsonObject("cheese" to "Goat Cheese", "wine" to "Condrieu")
    server.requestHandler { req -> req.response().end(expected.encode()) }
    startServer()

    webClient
      .get(DEFAULT_HTTP_PORT, DEFAULT_HTTP_HOST, "/somepath")
      .mapTo<WineAndCheese>()
      .send(onSuccess { resp ->
        assertEquals(200, resp.statusCode())
        assertEquals(WineAndCheese().setCheese("Goat Cheese").setWine("Condrieu"), resp.body())
        testComplete()
      })
    await()
  }

  @Test
  fun `test response body mapped to a different json object with explicit codec`() {
    val expected = JsonObject("cheese" to "Goat Cheese", "wine" to "Condrieu")
    server.requestHandler { req -> req.response().end(expected.encode()) }
    startServer()

    webClient
      .get(DEFAULT_HTTP_PORT, DEFAULT_HTTP_HOST, "/somepath")
      .mapTo<WineAndCheese> { BodyCodec.json(it) }
      .send(onSuccess { resp ->
        assertEquals(200, resp.statusCode())
        assertEquals(WineAndCheese().setCheese("Goat Cheese").setWine("Condrieu"), resp.body())
        testComplete()
      })
    await()
  }
}
