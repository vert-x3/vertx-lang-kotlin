package example

import io.vertx.core.*
import io.vertx.core.buffer.Buffer
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.eventbus.MessageProducer
import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpServer
import io.vertx.core.http.WebSocket
import io.vertx.core.parsetools.RecordParser
import io.vertx.core.streams.ReadStream
import io.vertx.kotlin.coroutines.*
import kotlinx.coroutines.experimental.channels.ReceiveChannel

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

  private suspend fun channel0() {
    // tag::channel0[]
    val stream = vertx.eventBus().consumer<Double>("temperature")
    val channel = toChannel(vertx, stream)

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
    // end::channel0[]
  }

  private fun channel1() {
    // tag::channel1[]
    val server = vertx.createNetServer().connectHandler { socket ->

      // The record parser provides a stream of buffers delimited by \r\n
      val stream = RecordParser.newDelimited("\r\n", socket)

      // Convert the stream to a Kotlin channel
      val channel = toChannel(vertx, stream)

      // Run the coroutine
      vertx.runCoroutine {

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

  private suspend fun channel2(stream : RecordParser, channel : ReceiveChannel<Buffer>, method: String, uri: String) {
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

  private suspend fun channel3(stream : RecordParser, channel : ReceiveChannel<Buffer>, method: String, uri: String, headers : Map<String, String>) {
    // tag::channel3[]
    // Receive the request body
    val transferEncoding = headers["transfer-encoding"]
    val contentLength = headers["content-length"]

    val body : Buffer?
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

    println("Received HTTP request ($method, $uri) with headers ${headers.keys} and body with size ${body?.length() ?: 0}")
    // end::channel3[]
  }

  private fun readTemperatureSensor() : Double {
    return 0.0
  }

  private suspend fun sendChannel() {
    // tag::sendChannel[]
    val stream = vertx.eventBus().publisher<Double>("temperature")
    val channel = toChannel(vertx, stream)

    while (true) {
      val temperature = readTemperatureSensor()

      // Broadcast the temperature
      // Non-blocking but could be suspended
      channel.send(temperature)

      // Wait for one second
      asyncEvent<Long> { vertx.setTimer(1000, it)  }
    }
    // end::sendChannel[]
  }

  val stream : MessageProducer<Double> = vertx.eventBus().publisher<Double>("temperature")

  // tag::broadcastTemperature[]
  fun broadcastTemperature() {

    // Check we can write in the stream
    if (stream.writeQueueFull()) {

      // We can't write so we set a drain handler to be called when we can write again
      stream.drainHandler { broadcastTemperature() }
    } else {

      // Read temperature
      val temperature = readTemperatureSensor()

      // Write it to the stream
      stream.write(temperature)

      // Wait for one second
      vertx.setTimer(1000) {
        broadcastTemperature()
      }
    }
  }
  // end::broadcastTemperature[]
}
