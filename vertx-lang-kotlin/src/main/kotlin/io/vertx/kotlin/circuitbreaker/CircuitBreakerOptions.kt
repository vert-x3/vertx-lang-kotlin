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
package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreakerOptions

/**
 * A function providing a DSL for building [io.vertx.circuitbreaker.CircuitBreakerOptions] objects.
 *
 * Circuit breaker configuration options. All time values are in milliseconds.
 *
 * @param maxFailures  Sets the maximum number of failures before opening the circuit breaker.
 * @param timeout  Sets the timeout in milliseconds. If an action does not complete before this timeout, the action is considered as a failure.
 * @param fallbackOnFailure  Sets whether the fallback is executed on failure, even when the circuit breaker is closed.
 * @param resetTimeout  Sets the time in milliseconds before an open circuit breaker moves to half-open (in an attempt to re-close). If the circuit breaker is closed when the timeout is reached, nothing happens. <code>-1</code> disables this feature.
 * @param notificationLocalOnly  Sets whether circuit breaker state events should be delivered only to local consumers.
 * @param notificationAddress  Sets the event bus address on which the circuit breaker publishes its state changes.
 * @param notificationPeriod  Sets the period in milliseconds in which the circuit breaker sends notifications on the event bus with its current state.
 * @param metricsRollingWindow  Sets the rolling window length used for metrics.
 * @param failuresRollingWindow  Sets the rolling window length used for failures.
 * @param metricsRollingBuckets  Sets the number of buckets the metrics rolling window is divided into. <p> The following must be true: <code>metricsRollingWindow % metricsRollingBuckets == 0</code>, otherwise an exception will be thrown. For example, 10000/10 is okay, so is 10000/20, but 10000/7 is not.
 * @param maxRetries  Sets the number of times the circuit breaker retries an operation before failing.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreakerOptions original] using Vert.x codegen.
 */
fun circuitBreakerOptionsOf(
  maxFailures: Int? = null,
  timeout: Long? = null,
  fallbackOnFailure: Boolean? = null,
  resetTimeout: Long? = null,
  notificationLocalOnly: Boolean? = null,
  notificationAddress: String? = null,
  notificationPeriod: Long? = null,
  metricsRollingWindow: Long? = null,
  failuresRollingWindow: Long? = null,
  metricsRollingBuckets: Int? = null,
  maxRetries: Int? = null): CircuitBreakerOptions = io.vertx.circuitbreaker.CircuitBreakerOptions().apply {

  if (maxFailures != null) {
    this.setMaxFailures(maxFailures)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (fallbackOnFailure != null) {
    this.setFallbackOnFailure(fallbackOnFailure)
  }
  if (resetTimeout != null) {
    this.setResetTimeout(resetTimeout)
  }
  if (notificationLocalOnly != null) {
    this.setNotificationLocalOnly(notificationLocalOnly)
  }
  if (notificationAddress != null) {
    this.setNotificationAddress(notificationAddress)
  }
  if (notificationPeriod != null) {
    this.setNotificationPeriod(notificationPeriod)
  }
  if (metricsRollingWindow != null) {
    this.setMetricsRollingWindow(metricsRollingWindow)
  }
  if (failuresRollingWindow != null) {
    this.setFailuresRollingWindow(failuresRollingWindow)
  }
  if (metricsRollingBuckets != null) {
    this.setMetricsRollingBuckets(metricsRollingBuckets)
  }
  if (maxRetries != null) {
    this.setMaxRetries(maxRetries)
  }
}

