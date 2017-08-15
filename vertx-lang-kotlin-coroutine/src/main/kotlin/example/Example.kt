package example

import io.vertx.core.CompositeFuture
import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.http.HttpServer
import io.vertx.kotlin.coroutines.*

/**
 * Created by stream.
 */

fun example() {
  val vertx = Vertx.vertx()
  vertx.deployVerticle(ExampleVerticle())

  //embed style with out extends CoroutineVerticle, working on Main method directly.
  attachVertxToCoroutine(vertx)
  runVertxCoroutine {
    asyncEvent<Long> { h -> vertx.setTimer(1000L, h) }.await()
    println("fired by embed vert.x")
  }
}

class ExampleVerticle : CoroutineVerticle() {
  suspend override fun start() {
    syncEventExample()
    syncResultExample()
    streamExample()
    coroutineHandlerExample()
    futureToAwait()
  }

  //asyncEvent
  private suspend fun syncEventExample() {
    asyncEvent<Long> { h -> vertx.setTimer(2000L, h) }.await()
    println("This would be fire in 2s.")
  }

  //asyncResult
  private suspend fun syncResultExample() {
    val consumer = vertx.eventBus().localConsumer<String>("someAddressA")
    consumer.handler { message ->
      println("consumer receive message ${message.body()}")
      message.reply("pong")
    }
    //wait consumer to complete register synchronously
    asyncResult<Void> { h -> consumer.completionHandler(h) }

    //send message and wait reply synchronously
    val reply = asyncResult<Message<String>> { h -> vertx.eventBus().send("someAddressA", "ping", h) }
    println("Receive reply ${reply.body()}")
  }

  //streamAdaptor
  private suspend fun streamExample() {
    val adaptor = streamAdaptor<Message<Int>>()
    vertx.eventBus().localConsumer<Int>("someAddress").handler(adaptor)

    //send 10 message to consumer
    for (i in 0..10) vertx.eventBus().send("someAddress", i)

    //Receive 10 message from the consumer
    for (i in 0..10) {
      val message = adaptor.receive()
      println("got message: ${message.body()}")
    }
  }

  //Convert future to await
  private suspend fun futureToAwait() {
    val httpServerFuture = Future.future<HttpServer>()
    vertx.createHttpServer().requestHandler({ _ -> }).listen(8000, httpServerFuture.completer())
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

  //run coroutine in requestHandler
  private fun coroutineHandlerExample() {
    vertx.createHttpServer().requestHandler { req ->
      runVertxCoroutine {
        val timerID = asyncEvent<Long> { h -> vertx.setTimer(2000L, h) }.await()
        req.response().end("Hello, this is timerID $timerID")
      }
    }.listen(8081)
  }
}
