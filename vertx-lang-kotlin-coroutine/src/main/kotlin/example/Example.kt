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
    val timerId = asyncEvent<Long> { handler ->
      vertx.setTimer(1000, handler)
    }
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
    futureToAwait()
  }

  // tag::asyncEvent[]
  private suspend fun asyncEventExample() {
    val id = asyncEvent<Long> { h -> vertx.setTimer(2000L, h) }
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
    asyncResult<Void> { h -> consumer.completionHandler(h) }

    // Send a message and wait for a reply
    val reply = asyncResult<Message<String>> { h ->
      vertx.eventBus().send("a.b.c", "ping", h)
    }
    println("Reply received: ${reply.body()}")
  }
  // end::asyncResult[]

  // tag::streamExample[]
  private suspend fun streamExample() {
    val adapter = ReceiveChannelHandler<Message<Int>>(vertx.orCreateContext)
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

  //Convert future to await
  private suspend fun futureToAwait() {
    val httpServerFuture = Future.future<HttpServer>()
    vertx.createHttpServer().requestHandler { _ -> }.listen(8000, httpServerFuture.completer())
    //we can get httpServer by await on future instance.
    val httpServer = httpServerFuture.await()
    println("http port is ${httpServer.actualPort()}")

    //await composite future.
    val result = CompositeFuture.all(httpServerFuture, httpServerFuture).await()
    if (result.succeeded()) {
      println("all have start up.")
    } else {
      result.cause().printStackTrace()
    }
  }

  // tag::handlerAndCoroutine[]
  private fun handlerAndCoroutineExample() {
    vertx.createHttpServer().requestHandler { req ->
      vertx.runCoroutine {
        val timerID = asyncEvent<Long> { h -> vertx.setTimer(2000, h) }
        req.response().end("Hello, this is timerID $timerID after 2 seconds!")
      }
    }.listen(8081)
  }
  // end::handlerAndCoroutine[]
}
