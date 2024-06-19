/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.ReplyException
import io.vertx.core.eventbus.ReplyFailure
import io.vertx.core.internal.ContextInternal
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@OptIn(DelicateCoroutinesApi::class)
@RunWith(VertxUnitRunner::class)
class EventBusTest {

  private lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = Vertx.vertx()
  }

  @After
  fun after(testContext: TestContext) {
    vertx.close().onComplete(testContext.asyncAssertSuccess())
  }


  @Test
  fun `test EventBus consumer with handler supports suspending functions`(testContext: TestContext) {
    val async = testContext.async()
    val bus = vertx.eventBus()
    GlobalScope.coroutineEventBus {
      bus.coConsumer<String>("some-address") {
        // Making sure that we have some kind of suspending function here
        withContext(Dispatchers.IO) {
          Thread.sleep(100)
        }
        testContext.assertTrue(ContextInternal.current().isDuplicate)
        async.complete()
      }
    }
    bus.send("some-address", "some message")
  }

  @Test
  fun `test EventBus consumer supports suspending functions`(testContext: TestContext) {
    val async = testContext.async()
    val bus = vertx.eventBus()
    GlobalScope.coroutineEventBus {
      bus.consumer<String>("some-address").coHandler {
        // Making sure that we have some kind of suspending function here
        withContext(Dispatchers.IO) {
          Thread.sleep(100)
        }
        testContext.assertTrue(ContextInternal.current().isDuplicate)
        async.complete()
      }
    }
    bus.send("some-address", "some message")
  }

  @Test
  fun `test unregister`(testContext: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = consumer.bodyStream().toReceiveChannel(vertx)
    val async = testContext.async()
    val list = Collections.synchronizedList(ArrayList<Int>())
    GlobalScope.launch(vertx.dispatcher()) {
      for (msg in channel) {
        list += msg
      }
      testContext.assertEquals(listOf(0, 1, 2, 3, 4), list)
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4)) {
      bus.send("the-address", index)
    }
    vertx.setPeriodic(50) { id ->
      if (list.size == 5) {
        consumer.unregister()
        vertx.cancelTimer(id)
      }
    }
  }

  @Test
  fun `test unregister 2`(testCtx: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = consumer.bodyStream().toReceiveChannel(vertx)
    val async = testCtx.async()

    GlobalScope.launch(vertx.dispatcher()) {
      val list = mutableListOf<Int>()

      println("Processing messages in channel...")
      for (msg in channel) list += msg
      println("List: $list")
      testCtx.assertEquals(listOf(0, 1, 2, 3, 4), list)
    }
    (0..4).forEachIndexed { index, _ ->
      bus.send("the-address", index)
    }
    vertx.setTimer(50L) {
      consumer.unregister()
      println("Unregistered consumer.")
    }
    async.complete()
    println(Thread.currentThread())
    Thread.sleep(1000)
    if (consumer.isRegistered) testCtx.fail("Consumer didn't get unregistered.")
  }

  @Test
  fun `test reply`(testContext: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = consumer.bodyStream().toReceiveChannel(vertx)
    val async = testContext.async()
    bus.consumer<Int>("another-address") { msg ->
      val v = msg.body()
      if (v < 5) {
        println("replying")
        msg.reply(4)
      } else {
        println("ending")
        msg.reply(null)
      }
    }
    GlobalScope.launch(vertx.dispatcher()) {
      var count = 0
      for (msg in channel) {
        val reply = awaitResult<Message<Int?>> {
          bus.request<Int>("another-address", msg).onComplete(it)
        }
        val v = reply.body()
        if (v == null) {
          break
        } else {
          count += v
        }
      }
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4, 5)) {
      bus.send("the-address", index)
    }
  }

  @Test
  fun `test failure in reply`(testContext: TestContext) {
    val bus = vertx.eventBus()
    val async = testContext.async()
    bus.consumer<Int>("the-address") { msg ->
      msg.fail(5, "it-failed")
    }
    GlobalScope.launch(vertx.dispatcher()) {
      try {
        awaitResult<Message<Int?>> {
          bus.request<Int>("the-address", "the-body").onComplete(it)
        }
      } catch (e: Exception) {
        testContext.assertTrue(e is ReplyException)
        val err: ReplyException = e as ReplyException
        testContext.assertEquals(5, err.failureCode())
        testContext.assertEquals(ReplyFailure.RECIPIENT_FAILURE, err.failureType())
        testContext.assertEquals("it-failed", err.message)
        async.complete()
      }
    }
  }
}

