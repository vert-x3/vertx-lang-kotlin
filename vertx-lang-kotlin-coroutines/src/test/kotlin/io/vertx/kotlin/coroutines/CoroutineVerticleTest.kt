package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import kotlinx.coroutines.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.time.Duration
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CoroutineVerticleTest {
  private lateinit var vertx: Vertx

  @Before
  fun `initialize vertx`() { vertx = Vertx.vertx() }

  @After
  fun `close vertx`() { vertx.close() }

  @Test
  fun `a child coroutine launched from a coroutine verticle gets canceled upon vertx undeployment`() {
    runBlocking {
      val deploymentId = vertx.deployVerticle(coroutineVerticleMock).await();
      assertTrue { coroutineVerticleMock.isStartCalled }
      assertFalse { coroutineVerticleMock.isStopCalled }
      assertTrue { coroutineVerticleMock.childJob.isActive }

      vertx.undeploy(deploymentId).await();
      assertTrue { coroutineVerticleMock.isStopCalled }
      assertEventually(delay = Duration.ofSeconds(1)) { coroutineVerticleMock.childJob.isCancelled }
    }
  }
}

private val coroutineVerticleMock = object : CoroutineVerticle() {
  var isStartCalled = false
  var isStopCalled = false
  lateinit var childJob: Job


  override suspend fun start() {
    isStartCalled = true
    childJob = launch { while (true) { delay(1000) } }
  }

  override suspend fun stop() { isStopCalled = true }
}

private fun assertEventually(delay: Duration, condition: () -> Boolean) = runBlocking {
  try {
    withTimeout(delay.toMillis()) { while (!condition()) { ensureActive() } }
  } catch (_: CancellationException) {
    throw AssertionError("Assertion was not fulfilled within $delay timeout.")
  }
}
