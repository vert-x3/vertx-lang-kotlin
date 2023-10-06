@file:Suppress("UNUSED")
@file:OptIn(DelicateCoroutinesApi::class)

package examples

import io.vertx.core.CompositeFuture
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.buffer.Buffer
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.ReplyException
import io.vertx.core.http.HttpServerResponse
import io.vertx.core.parsetools.RecordParser
import io.vertx.kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel

fun launchCoroutineExample() {
  // tag::launchCoroutine[]
  val vertx = Vertx.vertx()

  GlobalScope.launch(vertx.dispatcher()) {
    val timerId = awaitEvent<Long> { handler ->
      vertx.setTimer(1000, handler)
    }
    println("Event fired from timer with id $timerId")
  }
  // end::launchCoroutine[]
}

// tag::CoroutineVerticle[]
class MyVerticle : CoroutineVerticle() {
  override suspend fun start() {
    // ...
  }

  override suspend fun stop() {
    // ...
  }
}
// end::CoroutineVerticle[]

class ExampleVerticle : CoroutineVerticle() {

  override suspend fun start() {
    coroutineScope {
      awaitResultExample()
      awaitEventExample()
      streamExample()
      handlerAndCoroutineExample()
      awaitingFuture(Future.succeededFuture("hello"))
      generatedSuspendingExtensionMethod()
    }
  }

  // tag::awaitResult[]
  suspend fun awaitResultExample() {
    val consumer = vertx.eventBus().localConsumer<String>("a.b.c")
    consumer.handler { message ->
      println("Consumer received: ${message.body()}")
      message.reply("pong")
    }

    // Send a message and wait for a reply
    val reply = awaitResult<Message<String>> { h ->
      vertx.eventBus().request("a.b.c", "ping", h)
    }
    println("Reply received: ${reply.body()}")
  }
  // end::awaitResult[]

  // tag::awaitResultFailure[]
  suspend fun awaitResultFailureExample() {
    val consumer = vertx.eventBus().localConsumer<String>("a.b.c")
    consumer.handler { message ->
      // The consumer will get a failure
      message.fail(0, "it failed!!!")
    }

    // Send a message and wait for a reply
    try {
      awaitResult<Message<String>> { h ->
        vertx.eventBus().request("a.b.c", "ping", h)
      }
    } catch (e: ReplyException) {
      // Handle specific reply exception here
      println("Reply failure: ${e.message}")
    }
  }
  // end::awaitResultFailure[]

  // tag::awaitEvent[]
  suspend fun awaitEventExample() {
    val id = awaitEvent<Long> { h -> vertx.setTimer(2000L, h) }
    println("This should be fired in 2s by some time with id=$id")
  }
  // end::awaitEvent[]

  // tag::awaitBlocking[]
  suspend fun awaitBlockingExample() {
    awaitBlocking {
      Thread.sleep(1000)
      "some-string"
    }
  }
  // end::awaitBlocking[]

  // tag::streamExample[]
  suspend fun streamExample() {
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

  // tag::awaitingFuture[]
  suspend fun awaitingFuture(anotherFuture: Future<String>) {
    // Getting a future
    val httpServerFuture = vertx.createHttpServer()
      .requestHandler { req -> req.response().end("Hello!") }
      .listen(8000)

    val httpServer = httpServerFuture.await()
    println("HTTP server port: ${httpServer.actualPort()}")

    // It also works for composite futures
    val result = CompositeFuture.all(httpServerFuture, anotherFuture).await()
    if (result.succeeded()) {
      println("The server is now running!")
    } else {
      result.cause().printStackTrace()
    }
  }
  // end::awaitingFuture[]

  // tag::generatedSuspendingExtensionMethod[]
  suspend fun generatedSuspendingExtensionMethod() {
    // Use the extension instead of wrapping with awaitResult
    val client = vertx.createNetClient()
    val socket = client.connect(1234, "localhost").await()
  }
  // end::generatedSuspendingExtensionMethod[]

  fun handlerAndCoroutineExample() {
    // tag::handlerAndCoroutine[]
    vertx.createHttpServer().requestHandler { req ->
      launch {
        val timerID = awaitEvent<Long> { h -> vertx.setTimer(2000, h) }
        req.response().end("Hello, this is timerID $timerID after 2 seconds!")
      }
    }.listen(8081)
    // end::handlerAndCoroutine[]
  }

  // tag::channel0[]
  suspend fun handleTemperatureStream() {
    val stream = vertx.eventBus().consumer<Double>("temperature")
    val channel = stream.toChannel(vertx)

    var min = Double.MAX_VALUE
    var max = Double.MIN_VALUE

    // Iterate until the stream is closed
    // Non-blocking
    for (msg in channel) {
      val temperature = msg.body()
      min = Math.min(min, temperature)
      max = Math.max(max, temperature)
    }

    // The stream is now closed
  }
  // end::channel0[]

  private fun channel1() {
    // tag::channel1[]
    vertx.createNetServer().connectHandler { socket ->

      // The record parser provides a stream of buffers delimited by \r\n
      val stream = RecordParser.newDelimited("\r\n", socket)

      // Convert the stream to a Kotlin channel
      val channel = stream.toChannel(vertx)

      // Run the coroutine
      launch {

        // Receive the request-line
        // Non-blocking
        val line = channel.receive().toString().split(" ")
        val method = line[0]
        val uri = line[1]

        println("Received HTTP request ($method, $uri)")

        // Still need to parse headers and body...
      }
    }
    // end::channel1[]
  }

  suspend fun channel2(stream: RecordParser, channel: ReceiveChannel<Buffer>, method: String, uri: String) {
    // tag::channel2[]
    // Receive HTTP headers
    val headers = HashMap<String, String>()
    while (true) {

      // Non-blocking
      val header = channel.receive().toString()

      // Done with parsing headers
      if (header.isEmpty()) {
        break
      }

      val pos = header.indexOf(':')
      headers[header.substring(0, pos).toLowerCase()] = header.substring(pos + 1).trim()
    }

    println("Received HTTP request ($method, $uri) with headers ${headers.keys}")
    // end::channel2[]
  }

  suspend fun channel3(stream: RecordParser, channel: ReceiveChannel<Buffer>, method: String, uri: String, headers: Map<String, String>) {
    // tag::channel3[]
    // Receive the request body
    val transferEncoding = headers["transfer-encoding"]
    val contentLength = headers["content-length"]

    val body: Buffer?
    if (transferEncoding == "chunked") {

      // Handle chunked encoding, e.g
      // 5\r\n
      // HELLO\r\n
      // 0\r\n
      // \r\n

      body = Buffer.buffer()
      while (true) {

        // Parse length chunk
        // Non-blocking
        val len = channel.receive().toString().toInt(16)
        if (len == 0) {
          break
        }

        // The stream is flipped to parse a chunk of the exact size
        stream.fixedSizeMode(len + 2)

        // Receive the chunk and append it
        // Non-blocking
        val chunk = channel.receive()
        body.appendBuffer(chunk, 0, chunk.length() - 2)

        // The stream is flipped back to the \r\n delimiter to parse the next chunk
        stream.delimitedMode("\r\n")
      }
    } else if (contentLength != null) {

      // The stream is flipped to parse a body of the exact size
      stream.fixedSizeMode(contentLength.toInt())

      // Non-blocking
      body = channel.receive()
    } else {
      body = null
    }

    val bodySize = body?.length() ?: 0
    println("Received HTTP request ($method, $uri) with headers ${headers.keys} and body with size $bodySize")
    // end::channel3[]
  }

  private fun readBuffer(): Buffer {
    return Buffer.buffer()
  }

  // tag::sendChannel[]
  suspend fun sendChannel(httpResponse : HttpServerResponse) {
    val channel = httpResponse.toChannel(vertx)

    while (true) {
      val buffer = readBuffer()

      // Broadcast the temperature
      // Non-blocking but could be suspended
      channel.send(buffer)

      // Wait for one second
      awaitEvent<Long> { vertx.setTimer(1000, it) }
    }
  }
  // end::sendChannel[]

  fun delayExample() {
    // tag::delay[]
    launch {
      // Set a one second Vertx timer
      delay(1000)
    }
    // end::delay[]
  }

  fun cancellationExample() {
    // tag::cancellation[]
    val job = launch {
      // Set a one second Vertx timer
      while (true) {
        delay(1000)
        // Do something periodically
      }
    }

    // Sometimes later
    job.cancel()
    // end::cancellation[]
  }

  fun withTimeoutExample() {
    // tag::withTimeout[]
    launch {
      try {
        val id = withTimeout<String>(1000) {
          awaitEvent { anAsyncMethod(it) }
        }
      } catch (e: TimeoutCancellationException) {
        // Cancelled
      }
    }
    // end::withTimeout[]
  }

  fun anAsyncMethod(handler: Handler<String>) {
    TODO()
  }

  fun vertxFutureCoroutineBuilderExample() {
    // tag::vertxFutureCoroutineBuilder[]

    // Can be called on any thread
    val future1: Future<String> = vertxFuture(vertx) {
      computeSomethingWithSuspendingFunction()
    }

    // Can be called only when running on a Vert.x context
    val future2: Future<String> = vertxFuture {
      computeSomethingWithSuspendingFunction()
    }

    // end::vertxFutureCoroutineBuilder[]
  }

  private suspend fun computeSomethingWithSuspendingFunction(): String = "42"

  fun usingCoroutineEventBus() {
    // tag::usingCoroutineEventBus[]
    val bus = vertx.coEventBus()
    bus.consumer<String>("some-address") {
      computeSomethingWithSuspendingFunction()
      it.reply("done")
    }
    // tag::usingCoroutineEventBus[]
  }
}
