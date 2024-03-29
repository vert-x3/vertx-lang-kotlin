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
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author <a href="mailto:alexey.soshin@gmail.com">Alexey Soshin</a>
 */
@RunWith(VertxUnitRunner::class)
class PeriodicTest {

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
  fun `test await function can be invoked from setPeriodic`(testContext: TestContext) {
    val async = testContext.async()
    runBlocking {
      vertx.setPeriodicAwait(100) {
        // Introduce some kind of suspending function
        delay(10)
        async.complete()
      }
    }

    async.awaitSuccess(1000)
  }
}

