package io.vertx.kotlin.coroutines

import io.vertx.test.fakestream.FakeStream
import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.channels.produce
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking


fun main(args: Array<String>) {

  runBlocking {

    val stream = FakeStream<String>();
    stream.pause()

    val producer = produce<String> {

      stream.handler { elt ->
        println("GOT ELT")
        launch() {
          send(elt)
          stream.fetch(1)
        }
      }
      // stream.fetch(1)
      println("producer setup")
    }

    launch() {
      println("iterating")
      for (elt in producer) {
        println("Receive ${elt}")
      }
    }

    println("emit")
    stream.emit("a")
    stream.emit("b")
    stream.emit("c")


  }


}
