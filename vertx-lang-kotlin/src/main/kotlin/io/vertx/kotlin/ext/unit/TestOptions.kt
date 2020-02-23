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
package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestOptions

/**
 * A function providing a DSL for building [io.vertx.ext.unit.TestOptions] objects.
 *
 * Test execution options:
 *
 * <ul>
 *   <li>the <code>timeout</code> in milliseconds, the default value is 2 minutes </li>
 *   <li>the <code>useEventLoop</code></li> configures the event loop usage
 *     <ul>
 *       <li><code>true</code> always runs with an event loop</li>
 *       <li><code>false</code> never runs with an event loop</li>
 *       <li><code>null</code> uses an event loop if there is one (provided by [io.vertx.core.Vertx])
 *       otherwise run without</li>
 *     </ul>
 *   </li>
 *   <li>the <code>reporters</code> is an array of reporter configurations</li>
 * </ul>
 *
 * @param reporters  Replace the current list of reporters with a new one.
 * @param timeout  Set the test timeout.
 * @param useEventLoop  Configure the execution to use an event loop when there is no one existing.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestOptions original] using Vert.x codegen.
 */
fun testOptionsOf(
  reporters: Iterable<io.vertx.ext.unit.report.ReportOptions>? = null,
  timeout: Long? = null,
  useEventLoop: Boolean? = null): TestOptions = io.vertx.ext.unit.TestOptions().apply {

  if (reporters != null) {
    this.setReporters(reporters.toList())
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (useEventLoop != null) {
    this.setUseEventLoop(useEventLoop)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.unit.TestOptions] objects.
 *
 * Test execution options:
 *
 * <ul>
 *   <li>the <code>timeout</code> in milliseconds, the default value is 2 minutes </li>
 *   <li>the <code>useEventLoop</code></li> configures the event loop usage
 *     <ul>
 *       <li><code>true</code> always runs with an event loop</li>
 *       <li><code>false</code> never runs with an event loop</li>
 *       <li><code>null</code> uses an event loop if there is one (provided by [io.vertx.core.Vertx])
 *       otherwise run without</li>
 *     </ul>
 *   </li>
 *   <li>the <code>reporters</code> is an array of reporter configurations</li>
 * </ul>
 *
 * @param reporters  Replace the current list of reporters with a new one.
 * @param timeout  Set the test timeout.
 * @param useEventLoop  Configure the execution to use an event loop when there is no one existing.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.TestOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("testOptionsOf(reporters, timeout, useEventLoop)")
)
fun TestOptions(
  reporters: Iterable<io.vertx.ext.unit.report.ReportOptions>? = null,
  timeout: Long? = null,
  useEventLoop: Boolean? = null): TestOptions = io.vertx.ext.unit.TestOptions().apply {

  if (reporters != null) {
    this.setReporters(reporters.toList())
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (useEventLoop != null) {
    this.setUseEventLoop(useEventLoop)
  }
}

