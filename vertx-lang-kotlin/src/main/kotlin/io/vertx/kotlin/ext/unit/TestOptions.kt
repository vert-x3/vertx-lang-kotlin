package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestOptions
import io.vertx.ext.unit.report.ReportOptions

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

