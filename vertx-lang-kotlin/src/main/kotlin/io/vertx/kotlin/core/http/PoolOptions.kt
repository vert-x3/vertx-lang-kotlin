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
package io.vertx.kotlin.core.http

import io.vertx.core.http.PoolOptions

/**
 * A function providing a DSL for building [io.vertx.core.http.PoolOptions] objects.
 *
 * Options configuring a .
 *
 * @param cleanerPeriod  Set the connection pool cleaner period in milli seconds, a non positive value disables expiration checks and connections will remain in the pool until they are closed.
 * @param eventLoopSize  Set the number of event-loop the pool use. <ul>   <li>when the size is <code>0</code>, the client pool will use the current event-loop</li>   <li>otherwise the client will create and use its own event loop</li> </ul> The default size is <code>0</code>.
 * @param http1MaxSize  Set the maximum pool size for HTTP/1.x connections
 * @param http2MaxSize  Set the maximum pool size for HTTP/2 connections
 * @param maxWaitQueueSize  Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.PoolOptions original] using Vert.x codegen.
 */
fun poolOptionsOf(
  cleanerPeriod: Int? = null,
  eventLoopSize: Int? = null,
  http1MaxSize: Int? = null,
  http2MaxSize: Int? = null,
  maxWaitQueueSize: Int? = null): PoolOptions = io.vertx.core.http.PoolOptions().apply {

  if (cleanerPeriod != null) {
    this.setCleanerPeriod(cleanerPeriod)
  }
  if (eventLoopSize != null) {
    this.setEventLoopSize(eventLoopSize)
  }
  if (http1MaxSize != null) {
    this.setHttp1MaxSize(http1MaxSize)
  }
  if (http2MaxSize != null) {
    this.setHttp2MaxSize(http2MaxSize)
  }
  if (maxWaitQueueSize != null) {
    this.setMaxWaitQueueSize(maxWaitQueueSize)
  }
}

