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
 * @param config  Set the JSON configuration that will be passed to the verticle(s) when it's deployed
 * @param extraClasspath  Set any extra classpath to be used when deploying the verticle. <p> Ignored if no isolation group is set.
 * @param ha  Set whether the verticle(s) will be deployed as HA.
 * @param instances  Set the number of instances that should be deployed.
 * @param isolatedClasses  Set the isolated class names.
 * @param isolationGroup  Set the isolation group that will be used when deploying the verticle(s)
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in [io.vertx.core.DeploymentOptions]. <p> The default value of [io.vertx.core.DeploymentOptions] is 
 * @param maxWorkerExecuteTimeUnit  Set the time unit of <code>maxWorkerExecuteTime</code>
 * @param multiThreaded  Set whether the verticle(s) should be deployed as a multi-threaded worker verticle. <p> <strong>WARNING</strong>: Multi-threaded worker verticles are a deprecated feature. <p> Most applications will have no need for them. Because of the concurrency in these verticles you have to be very careful to keep the verticle in a consistent state using standard Java techniques for multi-threaded programming. <p> You can read the documentation that explains how you can replace this feature by the usage of custom worker pools or <code>executeBlocking</code> calls.
 * @param worker  Set whether the verticle(s) should be deployed as a worker verticle
 * @param workerPoolName  Set the worker pool name to use for this verticle. When no name is set, the Vert.x worker pool will be used, when a name is set, the verticle will use a named worker pool.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.DeploymentOptions original] using Vert.x codegen.
 */
fun deploymentOptionsOf(
  config: io.vertx.core.json.JsonObject? = null,
  extraClasspath: Iterable<String>? = null,
  ha: Boolean? = null,
  instances: Int? = null,
  isolatedClasses: Iterable<String>? = null,
  isolationGroup: String? = null,
  maxWorkerExecuteTime: Long? = null,
  maxWorkerExecuteTimeUnit: TimeUnit? = null,
  multiThreaded: Boolean? = null,
  worker: Boolean? = null,
  workerPoolName: String? = null,
  workerPoolSize: Int? = null): DeploymentOptions = io.vertx.core.DeploymentOptions().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (extraClasspath != null) {
    this.setExtraClasspath(extraClasspath.toList())
  }
  if (ha != null) {
    this.setHa(ha)
  }
  if (instances != null) {
    this.setInstances(instances)
  }
  if (isolatedClasses != null) {
    this.setIsolatedClasses(isolatedClasses.toList())
  }
  if (isolationGroup != null) {
    this.setIsolationGroup(isolationGroup)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (maxWorkerExecuteTimeUnit != null) {
    this.setMaxWorkerExecuteTimeUnit(maxWorkerExecuteTimeUnit)
  }
  if (multiThreaded != null) {
    this.setMultiThreaded(multiThreaded)
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

/**
 * A function providing a DSL for building [io.vertx.core.DeploymentOptions] objects.
 *
 * Options for configuring a verticle deployment.
 * <p>
 *
 * @param config  Set the JSON configuration that will be passed to the verticle(s) when it's deployed
 * @param extraClasspath  Set any extra classpath to be used when deploying the verticle. <p> Ignored if no isolation group is set.
 * @param ha  Set whether the verticle(s) will be deployed as HA.
 * @param instances  Set the number of instances that should be deployed.
 * @param isolatedClasses  Set the isolated class names.
 * @param isolationGroup  Set the isolation group that will be used when deploying the verticle(s)
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in [io.vertx.core.DeploymentOptions]. <p> The default value of [io.vertx.core.DeploymentOptions] is 
 * @param maxWorkerExecuteTimeUnit  Set the time unit of <code>maxWorkerExecuteTime</code>
 * @param multiThreaded  Set whether the verticle(s) should be deployed as a multi-threaded worker verticle. <p> <strong>WARNING</strong>: Multi-threaded worker verticles are a deprecated feature. <p> Most applications will have no need for them. Because of the concurrency in these verticles you have to be very careful to keep the verticle in a consistent state using standard Java techniques for multi-threaded programming. <p> You can read the documentation that explains how you can replace this feature by the usage of custom worker pools or <code>executeBlocking</code> calls.
 * @param worker  Set whether the verticle(s) should be deployed as a worker verticle
 * @param workerPoolName  Set the worker pool name to use for this verticle. When no name is set, the Vert.x worker pool will be used, when a name is set, the verticle will use a named worker pool.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.DeploymentOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("deploymentOptionsOf(config, extraClasspath, ha, instances, isolatedClasses, isolationGroup, maxWorkerExecuteTime, maxWorkerExecuteTimeUnit, multiThreaded, worker, workerPoolName, workerPoolSize)")
)
fun DeploymentOptions(
  config: io.vertx.core.json.JsonObject? = null,
  extraClasspath: Iterable<String>? = null,
  ha: Boolean? = null,
  instances: Int? = null,
  isolatedClasses: Iterable<String>? = null,
  isolationGroup: String? = null,
  maxWorkerExecuteTime: Long? = null,
  maxWorkerExecuteTimeUnit: TimeUnit? = null,
  multiThreaded: Boolean? = null,
  worker: Boolean? = null,
  workerPoolName: String? = null,
  workerPoolSize: Int? = null): DeploymentOptions = io.vertx.core.DeploymentOptions().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (extraClasspath != null) {
    this.setExtraClasspath(extraClasspath.toList())
  }
  if (ha != null) {
    this.setHa(ha)
  }
  if (instances != null) {
    this.setInstances(instances)
  }
  if (isolatedClasses != null) {
    this.setIsolatedClasses(isolatedClasses.toList())
  }
  if (isolationGroup != null) {
    this.setIsolationGroup(isolationGroup)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (maxWorkerExecuteTimeUnit != null) {
    this.setMaxWorkerExecuteTimeUnit(maxWorkerExecuteTimeUnit)
  }
  if (multiThreaded != null) {
    this.setMultiThreaded(multiThreaded)
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

