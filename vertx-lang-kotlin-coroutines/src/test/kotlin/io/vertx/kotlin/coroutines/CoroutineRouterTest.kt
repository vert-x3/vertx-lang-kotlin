/*
 * Copyright 2023 Red Hat, Inc.
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
import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientOptions
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpMethod.GET
import io.vertx.core.impl.ContextInternal
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(VertxUnitRunner::class)
class CoroutineRouterTest {

  private lateinit var vertx: Vertx
  private lateinit var httpClient: HttpClient

  @Before
  fun before(testContext: TestContext) {
    vertx = Vertx.vertx()
    val testVerticle = TestVerticle()
    vertx.deployVerticle(testVerticle).onComplete(testContext.asyncAssertSuccess {
      httpClient = vertx.createHttpClient(HttpClientOptions().setDefaultPort(testVerticle.actualPort))
    })
  }

  @After
  fun after(testContext: TestContext) {
    httpClient.close()
    vertx.close().onComplete(testContext.asyncAssertSuccess())
  }

  @Test
  fun `test CoroutineRoute supports suspending handler`(testContext: TestContext) {
    doTest(testContext, "/suspendingHandler") { resp ->
      testContext.assertEquals(200, resp.statusCode())
    }
  }

  @Test
  fun `test CoroutineRoute supports suspending respond`(testContext: TestContext) {
    doTest(testContext, "/suspendingRespond") { resp ->
      testContext.assertEquals(200, resp.statusCode())
      testContext.assertEquals("foobar", resp.body().result().toString())
    }
  }

  @Test
  fun `test CoroutineRoute supports suspending failureHandler`(testContext: TestContext) {
    doTest(testContext, "/suspendingFailureHandler") { resp ->
      testContext.assertEquals(200, resp.statusCode())
      testContext.assertEquals("baz", resp.body().result().toString())
    }
  }

  @Test
  fun `test CoroutineRouter supports suspending errorHandler`(testContext: TestContext) {
    doTest(testContext, "/doesnotexist") { resp ->
      testContext.assertEquals(404, resp.statusCode())
      testContext.assertEquals("Too bad...", resp.body().result().toString())
    }
  }

  @Test
  fun `test external CoroutineRoute supports coroutine builders`(testContext: TestContext) {
    doTest(testContext, "/externalRoute") { resp ->
      testContext.assertEquals(200, resp.statusCode())
      testContext.assertEquals("someone kicked the ball", resp.body().result().toString())
    }
  }

  @Test
  fun `test external sub router supports coroutine builders`(testContext: TestContext) {
    doTest(testContext, "/parent/child") { resp ->
      testContext.assertEquals(200, resp.statusCode())
      testContext.assertEquals("Hello, IT", resp.body().result().toString())
    }
  }

  private fun doTest(
    testContext: TestContext,
    requestURI: String,
    block: (HttpClientResponse) -> Unit
  ) {
    httpClient.request(GET, requestURI).compose { req ->
      req.send().compose { resp -> resp.body().map(resp) }
    }.onComplete(testContext.asyncAssertSuccess(block))
  }
}

class TestVerticle : CoroutineVerticle(), CoroutineRouterSupport {

  @Volatile
  var actualPort: Int = 0

  override suspend fun start() {
    val router = Router.router(vertx)
    router.coErrorHandler(404) { rc ->
      delay(100)
      rc.response().setStatusCode(404).end("Too bad...")
    }
    router.route().handler { rc ->
      rc.put("capturedContext", ContextInternal.current())
      rc.next()
    }
    router.get("/suspendingHandler").coHandler { rc ->
      delay(100)
      val current = ContextInternal.current()
      if (current.isDuplicate && current == rc.get("capturedContext")) {
        rc.end()
      } else {
        rc.fail(500)
      }
    }
    router.get("/suspendingRespond").coRespond { rc ->
      delay(100)
      val current = ContextInternal.current()
      if (!current.isDuplicate || current != rc.get("capturedContext")) {
        throw RuntimeException()
      }
      "foobar"
    }
    router.get("/suspendingFailureHandler").coHandler { it.fail(RuntimeException()) }.coFailureHandler { rc ->
      delay(100)
      val current = ContextInternal.current()
      if (current.isDuplicate && current == rc.get("capturedContext")) {
        rc.end("baz")
      } else {
        rc.response().setStatusCode(500).end()
      }
    }
    val externalRouteHandler = ExternalRouteHandler()
    router.get("/externalRoute").coHandler { externalRouteHandler.handle(it) }
    router.route("/parent/*").subRouter(createSubRouter(vertx))
    val httpServer = vertx.createHttpServer()
      .requestHandler(router)
      .listen(0)
      .await()
    actualPort = httpServer.actualPort()
  }
}

class ExternalRouteHandler {
  suspend fun handle(rc: RoutingContext) {
    delay(100)
    val current = ContextInternal.current()
    if (!current.isDuplicate || current != rc.get("capturedContext")) {
      rc.fail(500)
    }
    rc.end("someone kicked the ball")
  }
}

fun CoroutineScope.createSubRouter(vertx: Vertx): Router {
  val router = Router.router(vertx)
  coroutineRouter(vertx) {
    router.get("/child").coRespond { rc ->
      delay(100)
      val current = ContextInternal.current()
      if (!current.isDuplicate || current != rc.get("capturedContext")) {
        throw RuntimeException()
      }
      "Hello, IT"
    }
  }
  return router
}
