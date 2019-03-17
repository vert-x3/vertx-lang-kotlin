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
package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Get the current value of the counter
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.getAwait() : Long {
  return awaitResult{
    this.get(it)
  }
}

/**
 * Increment the counter atomically and return the new count
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.incrementAndGetAwait() : Long {
  return awaitResult{
    this.incrementAndGet(it)
  }
}

/**
 * Increment the counter atomically and return the value before the increment.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.getAndIncrementAwait() : Long {
  return awaitResult{
    this.getAndIncrement(it)
  }
}

/**
 * Decrement the counter atomically and return the new count
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.decrementAndGetAwait() : Long {
  return awaitResult{
    this.decrementAndGet(it)
  }
}

/**
 * Add the value to the counter atomically and return the new count
 *
 * @param value the value to add
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.addAndGetAwait(value : Long) : Long {
  return awaitResult{
    this.addAndGet(value, it)
  }
}

/**
 * Add the value to the counter atomically and return the value before the add
 *
 * @param value the value to add
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.getAndAddAwait(value : Long) : Long {
  return awaitResult{
    this.getAndAdd(value, it)
  }
}

/**
 * Set the counter to the specified value only if the current value is the expectec value. This happens
 * atomically.
 *
 * @param expected the expected value
 * @param value the new value
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.Counter original] using Vert.x codegen.
 */
suspend fun Counter.compareAndSetAwait(expected : Long, value : Long) : Boolean {
  return awaitResult{
    this.compareAndSet(expected, value, it)
  }
}

