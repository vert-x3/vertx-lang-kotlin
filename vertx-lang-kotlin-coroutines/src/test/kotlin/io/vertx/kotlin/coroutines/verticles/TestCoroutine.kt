package io.vertx.kotlin.coroutines.verticles

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class Verticle : CoroutineScope {
  override val coroutineContext: CoroutineContext = Job()

  val jobs: MutableList<Job> = mutableListOf()

  suspend fun start(): Unit {
    createJobs()

    println("Verticle deployed")
  }

  suspend fun createJobs(): Unit {
    println("Starting jobs...")
    for (i in 1..2) {
      val job = launch {
        while (true) {
          println("job $i in ${Thread.currentThread().name} is active: isActive=$isActive")
          yield()
          delay(1000)
        }
      }
      jobs.add(job)
    }
    println("jobs started")
  }

  suspend fun stop() = coroutineScope {
    coroutineContext.cancel()
    println("Stopping verticle... coroutine job: isActive=$isActive")
  }

}

fun main() = runBlocking {
  println("Global vertx scope ${Thread.currentThread().name}")
  try {
    val verticle = Verticle()
    verticle.start()
    println("Verticle is started")
    delay(2_000)
    verticle.stop()
    println("Stopped 1")
  } finally {
    delay(2_000)
    this.cancel("Cancelling GlobalScope.launch { }")
    println("Stopped 2")
  }
}
