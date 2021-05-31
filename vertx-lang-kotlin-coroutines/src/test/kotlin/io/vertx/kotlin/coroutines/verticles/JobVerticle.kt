package io.vertx.kotlin.coroutines.verticles

import io.vertx.core.Context
import io.vertx.kotlin.coroutines.CoroutineVerticle
import io.vertx.kotlin.coroutines.await
import kotlinx.coroutines.*

class JobVerticle : CoroutineVerticle() {

  val jobs: MutableList<Job> = mutableListOf()

  override suspend fun start(): Unit = coroutineScope {
    println("Starting jobs...")
    for (i in 1..2) {
      val job = launch {
        while (true) {
          println("job $i in ${Thread.currentThread().name} is active: isActive=$isActive")
          delay(1000)
        }
      }
      jobs.add(job)
    }

    println("Verticle deployed")
  }

  override suspend fun stop() = coroutineScope {
    super.stop()
    println("Stopping verticle... coroutine job: isActive=$isActive")
  }
}
