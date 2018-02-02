package io.vertx.kotlin.coroutines

import io.vertx.core.AbstractVerticle
import io.vertx.core.Context
import io.vertx.core.DeploymentOptions
import io.vertx.core.Vertx
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import junit.framework.Assert.assertSame
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.sync.Mutex
import kotlinx.coroutines.experimental.sync.withLock
import org.junit.After
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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

  @After
  fun after() {
    vertx.close()
  }

  @Test
  fun testNoContext(testContext: TestContext) {
    val async = testContext.async()
    launch(vertx.dispatcher()) {
      runTest(testContext)
      async.complete()
    }
  }

  @Test
  fun testEventLoopContext(testContext: TestContext) {
    val async = testContext.async()
    val ctx = vertx.getOrCreateContext()
    ctx.runOnContext {
      launch(vertx.dispatcher()) {
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
        launch(vertx.dispatcher()) {
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
        launch(vertx.dispatcher()) {
          runTest(testContext)
        }
      }
    }, DeploymentOptions().setWorker(true).setMultiThreaded(true), testContext.asyncAssertFailure {
      async.complete()
    })
  }

  @Test
  fun testUnconfined(testContext: TestContext) {
    val async = testContext.async()
    val current = Thread.currentThread()
    launch(Unconfined) {
      testContext.assertEquals(current, Thread.currentThread())
      awaitEvent<Long> { vertx.setTimer(10, it) }
      testContext.assertTrue(Context.isOnEventLoopThread())
      async.complete()
    }
  }

  @Test
  fun testJoin(testContext: TestContext) {
    val done = AtomicBoolean()
    val job = launch(vertx.dispatcher()) {
      awaitEvent<Long> { vertx.setTimer(500, it) }
      done.set(true)
    }
    runBlocking {
      job.join()
      testContext.assertTrue(done.get())
    }
  }

  suspend fun runTest(testContext: TestContext) {
    testContext.assertTrue(Context.isOnVertxThread())
    val ctx = Vertx.currentContext()
    val a = AtomicLong()
    val id = awaitEvent<Long> { handler ->
      a.set(vertx.setTimer(10, handler))
    }
    testContext.assertEquals(id, a.get())
    testContext.assertTrue(Context.isOnEventLoopThread(), "Expected event loop thread instead of ${Thread.currentThread()}")
    testContext.assertEquals(ctx, Vertx.currentContext())
  }

  @Test
  fun testMutex(testContext: TestContext) {
    val mutex = Mutex()
    val dispatcher = vertx.dispatcher()
    val times = 10
    val latch = testContext.async(times)
    for (i in 0..times) {
      launch(dispatcher) {
        mutex.withLock {
          testContext.assertTrue(Context.isOnVertxThread())
          latch.countDown()
        }
      }
    }
    latch.await(5000)
  }

  @Test
  fun testDelay(testContext: TestContext) {
    val latch = testContext.async()
    launch(vertx.dispatcher()) {
      val ctx = Vertx.currentContext()
      delay(100)
      testContext.assertEquals(ctx, Vertx.currentContext())
      latch.complete()
    }
  }

  @Test
  fun testPeriodic(testContext: TestContext) {
    val count = AtomicInteger()
    val interrupted = AtomicBoolean()
    val job = launch(vertx.dispatcher()) {
      val ctx = Vertx.currentContext()
      try {
        testContext.assertEquals(ctx, Vertx.currentContext())
        repeat(1000) {
          count.incrementAndGet()
          delay(10)
        }
      } catch (e: Exception) {
        testContext.assertEquals(ctx, Vertx.currentContext())
        interrupted.set(true)
        throw e;
      }
    }
    Thread.sleep(100)
    job.cancel()
    testContext.assertTrue(count.get() > 5)
    testContext.assertTrue(interrupted.get())
  }

  @Test
  fun testAsyncBuilder(testContext: TestContext) {
    val async = async<Long>(vertx.dispatcher()) {
      assertTrue(Context.isOnEventLoopThread())
      val thread1 = Thread.currentThread()
      val thread2 = AtomicReference<Thread>()
      awaitEvent<Long> {
        thread2.set(Thread.currentThread())
        vertx.setTimer(100, it)
      }
      assertEquals(thread1, Thread.currentThread())
      assertEquals(thread2.get(), Thread.currentThread())
      5
    }
    while (!async.isCompleted) {
      Thread.sleep(10)
    }
    assertEquals(5, async.getCompleted())
  }

  @Test
  fun testRunBlockingBuilder(testContext: TestContext) {
    val async = runBlocking<Long>(vertx.dispatcher()) {
      assertTrue(Context.isOnEventLoopThread())
      val thread1 = Thread.currentThread()
      val thread2 = AtomicReference<Thread>()
      awaitEvent<Long> {
        thread2.set(Thread.currentThread())
        vertx.setTimer(100, it)
      }
      assertEquals(thread1, Thread.currentThread())
      assertEquals(thread2.get(), Thread.currentThread())
      5
    }
    assertEquals(5, async)
  }

  @Test
  fun testRunBlockingBuilderError() {
    val expected = Exception()
    var caught: Exception? = null
    try {
      runBlocking<Long>(vertx.dispatcher()) {
        throw expected
      }
    } catch (e: Exception) {
      caught = e
    }
    assertEquals(expected, caught)
  }

  @Test
  fun testRunBlockingBuilderFailure() {
    var caught: AssertionError? = null
    try {
      runBlocking(vertx.dispatcher()) {
        assertFalse("it was true", true)
      }
    } catch (e: AssertionError) {
      caught = e
    }
    assertNotNull(caught)
    assertEquals("it was true", caught!!.message)
  }
}
