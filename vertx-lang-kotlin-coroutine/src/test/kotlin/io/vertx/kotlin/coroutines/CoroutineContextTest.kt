package io.vertx.kotlin.coroutines

import io.vertx.core.AbstractVerticle
import io.vertx.core.DeploymentOptions
import io.vertx.core.Vertx
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicLong

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class CoroutineContextTest {

  private lateinit var vertx: Vertx
  private lateinit var ai: AsyncInterface

  @Before
  fun before() {
    vertx = Vertx.vertx()
    ai = AsyncInterfaceImpl(vertx)
  }

  @Test
  fun testNoContext(testContext: TestContext) {
    val async = testContext.async()
    vertx.runCoroutine {
      runTest(testContext)
      async.complete()
    }
  }

  @Test
  fun testEventLoopContext(testContext: TestContext) {
    val async = testContext.async()
    val ctx = vertx.getOrCreateContext()
    ctx.runOnContext {
      vertx.runCoroutine {
        runTest(testContext)
        async.complete()
      }
    }
  }

  @Test
  fun testWorkerContext(testContext: TestContext) {
    val async = testContext.async()
    vertx.deployVerticle(object: AbstractVerticle() {
      override fun start() {
        vertx.runCoroutine {
          runTest(testContext)
        }
      }
    }, DeploymentOptions().setWorker(true), testContext.asyncAssertSuccess {
      async.complete()
    })
  }

  @Test
  fun testMultithreadedWorkerContext(testContext: TestContext) {
    val async = testContext.async()
    vertx.deployVerticle(object: AbstractVerticle() {
      override fun start() {
        vertx.runCoroutine {
          runTest(testContext)
        }
      }
    }, DeploymentOptions().setWorker(true).setMultiThreaded(true), testContext.asyncAssertFailure {
      async.complete()
    })
  }

  suspend fun runTest(testContext: TestContext) {
    val a = AtomicLong()
    val id = asyncEvent<Long> { handler ->
      a.set(vertx.setTimer(10, handler))
    }
    testContext.assertEquals(id, a.get())
  }
}
