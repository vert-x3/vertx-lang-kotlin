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
package io.vertx.kotlin.coroutines.verticles

import io.vertx.core.Context
import io.vertx.core.DeploymentOptions
import io.vertx.core.Vertx
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import io.vertx.kotlin.coroutines.*
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.junit.After
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class VerticleCoroutineTest {

  private lateinit var vertx: Vertx
  private lateinit var ai: AsyncInterface

  @Before
  fun before() {
    vertx = Vertx.vertx()
    ai = AsyncInterfaceImpl(vertx)
  }

  @After
  fun after() {
    vertx.close()
  }

  @Test
  fun `test in Worker context`(testContext: TestContext) {
    val async = testContext.async()
    val verticle = JobVerticle()

    GlobalScope.launch(vertx.dispatcher()) {
      // Deploy the verticle
      val deploymentId = vertx.deployVerticle(verticle).await()

      println("Asserting jobs")
      // Wait for the jobs to start.
      testContext.assertTrue(verticle.jobs.isNotEmpty())
      println("Asserting jobs active")
      verticle.jobs.forEach {
        testContext.assertTrue(it.isActive)
      }


      // Cancel the verticle.
      println("Cancelling the verticle...")
      vertx.undeploy(deploymentId).await()

      println("Jobs should be cancelled...")
      verticle.jobs.forEach {
        testContext.assertTrue(it.isCancelled)
      }

      println("complete...")
      async.complete()
    }
  }

}
