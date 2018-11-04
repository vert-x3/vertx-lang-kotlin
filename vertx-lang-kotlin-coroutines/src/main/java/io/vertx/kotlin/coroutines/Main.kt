package io.vertx.kotlin.coroutines

import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking


fun main(args: Array<String>) {

  runBlocking {
    val ch = Channel<String>(0)
    GlobalScope.launch {
      println("${Thread.currentThread()} Receive")
      val s1 = ch.receive();
      println("${Thread.currentThread()} Received ${s1}")
      println("${Thread.currentThread()} Receive")
      val s2 = ch.receive();
      println("${Thread.currentThread()} Received ${s2}")
    }
    GlobalScope.launch {
      println("${Thread.currentThread()} Sending a")
      ch.send("a")
      println("${Thread.currentThread()} Sent a")
    }
    GlobalScope.launch {
      println("${Thread.currentThread()} Sending b")
      ch.send("b")
      println("${Thread.currentThread()} Sent b")
    }
  }


}
