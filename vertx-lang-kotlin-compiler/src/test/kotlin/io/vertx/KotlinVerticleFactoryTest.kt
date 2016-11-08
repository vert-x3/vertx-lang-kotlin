package io.vertx

import io.vertx.core.*
import org.junit.*
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
  fun testMultiple() {
    vertx.deployVerticleBlocking("multipleVerticles.kt")

    // all the verticles need to be initialized properly
    for (i in 1..3) {
      assertEquals(i.toString(), vertx.sharedData().getLocalMap<String, String>("M")["M$i"])
    }
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

  private fun Vertx.deployVerticleBlocking(name: String) {
    val latch = CountDownLatch(1)
    var e: Throwable? = null

    deployVerticle(name) {
      if (it.failed()) {
        e = it.cause()
      }

      latch.countDown()
    }

    if (!latch.await(10L, TimeUnit.SECONDS)) {
      throw TimeoutException("Verticle $name deployment timeout ")
    }

    e?.let { throw it }
  }
}
