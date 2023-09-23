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
package io.vertx.kotlin.core

import io.vertx.core.WorkerPoolOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.WorkerPoolOptions] objects.
 *
 * Worker pool options.
 *
 * @param name  Set the worker pool name to use.
 * @param size  Set the maximum number of worker threads to be used by the pool.
 * @param maxExecuteTime  Sets the value of max worker execute time, in [io.vertx.core.DeploymentOptions]. <p> The default value of [io.vertx.core.DeploymentOptions] is 
 * @param maxExecuteTimeUnit  Set the time unit of [io.vertx.core.WorkerPoolOptions]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.WorkerPoolOptions original] using Vert.x codegen.
 */
fun workerPoolOptionsOf(
  name: String? = null,
  size: Int? = null,
  maxExecuteTime: Long? = null,
  maxExecuteTimeUnit: TimeUnit? = null): WorkerPoolOptions = io.vertx.core.WorkerPoolOptions().apply {

  if (name != null) {
    this.setName(name)
  }
  if (size != null) {
    this.setSize(size)
  }
  if (maxExecuteTime != null) {
    this.setMaxExecuteTime(maxExecuteTime)
  }
  if (maxExecuteTimeUnit != null) {
    this.setMaxExecuteTimeUnit(maxExecuteTimeUnit)
  }
}

