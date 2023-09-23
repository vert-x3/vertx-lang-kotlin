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
package io.vertx.kotlin.sqlclient

import io.vertx.sqlclient.PoolOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.sqlclient.PoolOptions] objects.
 *
 * The options for configuring a connection pool.
 *
 * @param maxSize  Set the maximum pool size
 * @param maxWaitQueueSize  Set the maximum connection request allowed in the wait queue, any requests beyond the max size will result in an failure.  If the value is set to a negative number then the queue will be unbounded.
 * @param idleTimeoutUnit  Establish an idle timeout unit for pooled connections.
 * @param idleTimeout  Establish an idle timeout for pooled connections, a value of zero disables the idle timeout.
 * @param maxLifetimeUnit  Establish a max lifetime unit for pooled connections.
 * @param maxLifetime  Establish a max lifetime for pooled connections, a value of zero disables the maximum lifetime.
 * @param poolCleanerPeriod  Set the connection pool cleaner period in milli seconds, a non positive value disables expiration checks and connections will remain in the pool until they are closed.
 * @param connectionTimeoutUnit  Set the time unit of [io.vertx.sqlclient.PoolOptions]
 * @param connectionTimeout  Set the amount of time a client will wait for a connection from the pool. If the time is exceeded without a connection available, an exception is provided.
 * @param shared  Set to <code>true</code> to share the pool. <p> There can be multiple shared pools distinguished by [io.vertx.sqlclient.PoolOptions], when no specific name is set, the [io.vertx.sqlclient.PoolOptions] is used.
 * @param name  Set the pool name, used when the pool shared, otherwise ignored.
 * @param eventLoopSize  Set the number of event-loop the pool use. <ul>   <li>when the size is <code>0</code>, the client pool will use the current event-loop</li>   <li>otherwise the client will create and use its own event loop</li> </ul> The default size is <code>0</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.sqlclient.PoolOptions original] using Vert.x codegen.
 */
fun poolOptionsOf(
  maxSize: Int? = null,
  maxWaitQueueSize: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  idleTimeout: Int? = null,
  maxLifetimeUnit: TimeUnit? = null,
  maxLifetime: Int? = null,
  poolCleanerPeriod: Int? = null,
  connectionTimeoutUnit: TimeUnit? = null,
  connectionTimeout: Int? = null,
  shared: Boolean? = null,
  name: String? = null,
  eventLoopSize: Int? = null): PoolOptions = io.vertx.sqlclient.PoolOptions().apply {

  if (maxSize != null) {
    this.setMaxSize(maxSize)
  }
  if (maxWaitQueueSize != null) {
    this.setMaxWaitQueueSize(maxWaitQueueSize)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (maxLifetimeUnit != null) {
    this.setMaxLifetimeUnit(maxLifetimeUnit)
  }
  if (maxLifetime != null) {
    this.setMaxLifetime(maxLifetime)
  }
  if (poolCleanerPeriod != null) {
    this.setPoolCleanerPeriod(poolCleanerPeriod)
  }
  if (connectionTimeoutUnit != null) {
    this.setConnectionTimeoutUnit(connectionTimeoutUnit)
  }
  if (connectionTimeout != null) {
    this.setConnectionTimeout(connectionTimeout)
  }
  if (shared != null) {
    this.setShared(shared)
  }
  if (name != null) {
    this.setName(name)
  }
  if (eventLoopSize != null) {
    this.setEventLoopSize(eventLoopSize)
  }
}

