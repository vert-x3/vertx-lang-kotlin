package io.vertx

import io.vertx.core.*
import org.junit.Test
import org.junit.After
import java.util.concurrent.*
import kotlin.test.*

class KotlinVerticleFactoryTest {
  val vertx = Vertx.vertx()!!

  @After
  fun tearDown() {
    vertx.close()
  }

  @Test
  fun testSingle() {
    vertx.deployVerticleBlocking("singleVerticle.kt")
  }

  @Test
  fun testCompiledVerticle() {
    vertx.deployVerticleBlocking("kt:io.vertx.verticle.KotlinVerticle")
    vertx.deployVerticleBlocking("kts:io.vertx.verticle.KotlinVerticle")
  }

  @Test
  fun testMultiple() {
    vertx.deployVerticleBlocking("multipleVerticles.kt")

    // all the verticles need to be initialized properly
    for (i in 1..3) {
      assertEquals(i.toString(), vertx.sharedData().getLocalMap<String, String>("M")["M$i"])
    }
  }

  @Test
  fun testScript() {
    val fut = CompletableFuture<String>()
    vertx.eventBus().consumer<String>("test-address", { fut.complete(it.body()) })
    val id = vertx.deployVerticleBlocking("scriptVerticle.kts")
    assertEquals(id, fut.get(10L, TimeUnit.SECONDS));
  }

  @Test
  fun testScriptAsyncStart() {
    val fut = CompletableFuture<String>()
    vertx.eventBus().consumer<String>("test-address", { fut.complete(it.body()) })
    val id = vertx.deployVerticleBlocking("scriptVerticleWithAsyncStart.kts")
    assertEquals(id, fut.get(10L, TimeUnit.SECONDS));
  }

  @Test
  fun testScriptWithStop() {
    val fut = CompletableFuture<String>()
    vertx.eventBus().consumer<String>("test-address", { fut.complete(it.body()) })
    val id = vertx.deployVerticleBlocking("scriptVerticleWithStop.kts")
    vertx.undeploy(id)
    assertEquals(id, fut.get(10L, TimeUnit.SECONDS));
  }

  @Test
  fun testScriptWithAsyncStop() {
    val fut = CompletableFuture<String>()
    vertx.eventBus().consumer<String>("test-address", { fut.complete(it.body()) })
    val id = vertx.deployVerticleBlocking("scriptVerticleWithAsyncStop.kts")
    vertx.undeploy(id)
    assertEquals(id, fut.get(10L, TimeUnit.SECONDS));
  }

  @Test
  fun testIndirectInheritance() {
    vertx.deployVerticleBlocking("singleNonDirectInheritance.kt")
    assertEquals("true", vertx.sharedData().getLocalMap<String, String>("V2")["started"])
  }

  @Test
  fun testIncompleteTypes() {
    vertx.deployVerticleBlocking("withAbstractTypes.kt")
    assertEquals("true", vertx.sharedData().getLocalMap<String, String>("V3")["started"])
  }

  @Test
  fun testPrivateTypes() {
    vertx.sharedData().getLocalMap<String, String>("V4").put("privateStarted", "false")
    vertx.deployVerticleBlocking("privateVerticles.kt")

    assertEquals("true", vertx.sharedData().getLocalMap<String, String>("V4")["started"])
    assertEquals("false", vertx.sharedData().getLocalMap<String, String>("V4")["privateStarted"])
  }

  @Test
  fun testSealedVerticles() {
    vertx.deployVerticleBlocking("sealedVerticles.kt")

    assertEquals("started", vertx.sharedData().getLocalMap<String, String>("sealed")["V5"])
  }

  @Test
  fun testPackageSpecified() {
    vertx.deployVerticleBlocking("packageSpecified.kt")
    assertEquals("started", vertx.sharedData().getLocalMap<String, String>("P")["V"])
  }

  @Test
  fun testRelativePath() {
    vertx.deployVerticleBlocking("src/test/resources/singleVerticle.kt")
  }

  private fun Vertx.deployVerticleBlocking(name: String) : String {
    val fut = CompletableFuture<String>()
    deployVerticle(name) {
      if (it.failed()) {
        fut.completeExceptionally(it.cause());
      } else {
        fut.complete(it.result())
      }
    }
    return fut.get(10L, TimeUnit.SECONDS);
  }
}
