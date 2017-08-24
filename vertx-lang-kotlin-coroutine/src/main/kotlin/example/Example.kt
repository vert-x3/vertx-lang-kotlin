package example

import io.vertx.core.CompositeFuture
import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.http.HttpServer
import io.vertx.kotlin.coroutines.*

// tag::runCoroutineExample[]
fun runCoroutineExample() {
  val vertx = Vertx.vertx()
  vertx.deployVerticle(ExampleVerticle())

  vertx.runCoroutine {
    val timerId = asyncEvent<Long> { vertx.setTimer(1000, it) }
    println("Event fired from timer with id ${timerId}")
  }
}
// end::runCoroutineExample[]

// tag::CoroutineVerticle[]
class MyVerticle : CoroutineVerticle() {
  suspend override fun start() {
    // ...
  }
}
// end::CoroutineVerticle[]

class ExampleVerticle : CoroutineVerticle() {
  suspend override fun start() {
    asyncEventExample()
    asyncResultExample()
    streamExample()
    handlerAndCoroutineExample()
    awaitingFuture()
  }

  // tag::asyncEvent[]
  private suspend fun asyncEventExample() {
    val id = asyncEvent<Long> { vertx.setTimer(2000L, it) }
    println("This should be fired in 2s by some time with id=$id")
  }
  // end::asyncEvent[]

  // tag::asyncResult[]
  private suspend fun asyncResultExample() {
    val consumer = vertx.eventBus().localConsumer<String>("a.b.c")
    consumer.handler { message ->
      println("Consumer received: ${message.body()}")
      message.reply("pong")
    }

    // Wait until the consumer has properly registered
    asyncResult<Void> { consumer.completionHandler(it) }

    // Send a message and wait for a reply
    val reply = asyncResult<Message<String>> {
      vertx.eventBus().send("a.b.c", "ping", it)
    }
    println("Reply received: ${reply.body()}")
  }
  // end::asyncResult[]

  // tag::streamExample[]
  private suspend fun streamExample() {
    val adapter = vertx.receiveChannelHandler<Message<Int>>()
    vertx.eventBus().localConsumer<Int>("a.b.c").handler(adapter)

    // Send 15 messages
    for (i in 0..15) vertx.eventBus().send("a.b.c", i)

    // Receive the first 10 messages
    for (i in 0..10) {
      val message = adapter.receive()
      println("Received: ${message.body()}")
    }
  }
  // end::streamExample[]

  private suspend fun awaitingFuture() {
    // tag::awaitingFuture[]
    val httpServerFuture = Future.future<HttpServer>()
    vertx.createHttpServer()
      .requestHandler { req -> req.response().end("Hello!") }
      .listen(8000, httpServerFuture)

    val httpServer = httpServerFuture.await()
    println("HTTP server port: ${httpServer.actualPort()}")

    val result = CompositeFuture.all(httpServerFuture, httpServerFuture).await()
    if (result.succeeded()) {
      println("The server is now running!")
    } else {
      result.cause().printStackTrace()
    }
    // end::awaitingFuture[]
  }

  // tag::handlerAndCoroutine[]
  private fun handlerAndCoroutineExample() {
    vertx.createHttpServer().requestHandler { req ->
      vertx.runCoroutine {
        val timerID = asyncEvent<Long> { vertx.setTimer(2000, it) }
        req.response().end("Hello, this is timerID $timerID after 2 seconds!")
      }
    }.listen(8081)
  }
  // end::handlerAndCoroutine[]
}
