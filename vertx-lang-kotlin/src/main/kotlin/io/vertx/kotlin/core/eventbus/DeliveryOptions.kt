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

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.tracing.TracingPolicy

/**
 * A function providing a DSL for building [io.vertx.core.eventbus.DeliveryOptions] objects.
 *
 * Delivery options are used to configure message delivery.
 * <p>
 * Delivery options allow to configure delivery timeout and message codec name, and to provide any headers
 * that you wish to send with the message.
 *
 * @param codecName  Set the codec name.
 * @param headers  Add a message header. <p> Message headers can be sent with any message and will be accessible with [io.vertx.core.eventbus.Message] at the recipient.
 * @param localOnly  Whether a message should be delivered to local consumers only. Defaults to <code>false</code>. <p> <strong>This option is effective in clustered mode only and does not apply to reply messages</strong>.
 * @param sendTimeout  Set the send timeout.
 * @param tracingPolicy  Set the tracing policy when Vert.x has tracing enabled.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.DeliveryOptions original] using Vert.x codegen.
 */
fun deliveryOptionsOf(
  codecName: String? = null,
  headers: Map<String, String>? = null,
  localOnly: Boolean? = null,
  sendTimeout: Long? = null,
  tracingPolicy: TracingPolicy? = null): DeliveryOptions = io.vertx.core.eventbus.DeliveryOptions().apply {

  if (codecName != null) {
    this.setCodecName(codecName)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (localOnly != null) {
    this.setLocalOnly(localOnly)
  }
  if (sendTimeout != null) {
    this.setSendTimeout(sendTimeout)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
}

