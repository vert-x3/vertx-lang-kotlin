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

import io.vertx.core.DeploymentOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.DeploymentOptions] objects.
 *
 * Options for configuring a verticle deployment.
 * <p>
 *
 * @param classLoader  Set the classloader to use for deploying the Verticle. <p> The <code>VerticleFactory</code> will use this classloader for creating the Verticle and the Verticle [io.vertx.core.Context] will set this classloader as context classloader for the tasks execution on context. <p> By default no classloader is required and the deployment will use the current thread context classloader.
 * @param config  Set the JSON configuration that will be passed to the verticle(s) when it's deployed
 * @param ha  Set whether the verticle(s) will be deployed as HA.
 * @param instances  Set the number of instances that should be deployed.
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in [io.vertx.core.DeploymentOptions]. <p> The default value of [io.vertx.core.DeploymentOptions] is 
 * @param maxWorkerExecuteTimeUnit  Set the time unit of <code>maxWorkerExecuteTime</code>
 * @param worker  Set whether the verticle(s) should be deployed as a worker verticle
 * @param workerPoolName  Set the worker pool name to use for this verticle. When no name is set, the Vert.x worker pool will be used, when a name is set, the verticle will use a named worker pool.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.DeploymentOptions original] using Vert.x codegen.
 */
fun deploymentOptionsOf(
  classLoader: java.lang.ClassLoader? = null,
  config: io.vertx.core.json.JsonObject? = null,
  ha: Boolean? = null,
  instances: Int? = null,
  maxWorkerExecuteTime: Long? = null,
  maxWorkerExecuteTimeUnit: TimeUnit? = null,
  worker: Boolean? = null,
  workerPoolName: String? = null,
  workerPoolSize: Int? = null): DeploymentOptions = io.vertx.core.DeploymentOptions().apply {

  if (classLoader != null) {
    this.setClassLoader(classLoader)
  }
  if (config != null) {
    this.setConfig(config)
  }
  if (ha != null) {
    this.setHa(ha)
  }
  if (instances != null) {
    this.setInstances(instances)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (maxWorkerExecuteTimeUnit != null) {
    this.setMaxWorkerExecuteTimeUnit(maxWorkerExecuteTimeUnit)
  }
  if (worker != null) {
    this.setWorker(worker)
  }
  if (workerPoolName != null) {
    this.setWorkerPoolName(workerPoolName)
  }
  if (workerPoolSize != null) {
    this.setWorkerPoolSize(workerPoolSize)
  }
}

