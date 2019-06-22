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
package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageProducer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageProducer.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageProducer] using Vert.x codegen.
 */
suspend fun <T> MessageProducer<T>.writeAwait(data: T): Unit {
  return awaitResult {
    this.write(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageProducer.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageProducer] using Vert.x codegen.
 */
suspend fun <T> MessageProducer<T>.endAwait(data: T): Unit {
  return awaitResult {
    this.end(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageProducer.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageProducer] using Vert.x codegen.
 */
suspend fun <T> MessageProducer<T>.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageProducer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageProducer] using Vert.x codegen.
 */
suspend fun <T> MessageProducer<T>.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

