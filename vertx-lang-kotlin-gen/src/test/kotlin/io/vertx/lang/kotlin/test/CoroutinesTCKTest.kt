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
package io.vertx.lang.kotlin.test

import io.vertx.codegen.testmodel.TestInterface
import io.vertx.codegen.testmodel.TestInterfaceImpl
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerAsyncResultStringAwait
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import org.junit.Assert.fail
import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class CoroutinesTCKTest {

  private val tck: TestInterface = TestInterfaceImpl()

  @Test
  fun testAsyncResultSuccess() {
    val s = coroutinesTest { tck.methodWithHandlerAsyncResultStringAwait(false) }
    assertEquals("quux!", s)
  }

  @Test
  fun testAsyncResultFailure() {
    try {
      coroutinesTest { tck.methodWithHandlerAsyncResultStringAwait(true) }
      fail()
    } catch (e: Exception) {
      assertEquals("foobar!", e.message)
    }
  }

  private fun <T> coroutinesTest(block: suspend () -> T) : T {
    val deferred = GlobalScope.async(Dispatchers.Unconfined) {
      block()
    }
    return deferred.getCompleted()
  }
}
