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
package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.KafkaClientOptions
import io.vertx.core.tracing.TracingPolicy

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.KafkaClientOptions] objects.
 *
 * Generic KafkaClient options.
 *
 * @param config  Set the Kafka config.
 * @param tracePeerAddress  Set the Kafka address to show in trace tags. Or leave it unset to automatically pick up bootstrap server from config instead.
 * @param tracingPolicy  Set the Kafka tracing policy.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.KafkaClientOptions original] using Vert.x codegen.
 */
fun kafkaClientOptionsOf(
  config: Map<String, Any>? = null,
  tracePeerAddress: String? = null,
  tracingPolicy: TracingPolicy? = null): KafkaClientOptions = io.vertx.kafka.client.common.KafkaClientOptions().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (tracePeerAddress != null) {
    this.setTracePeerAddress(tracePeerAddress)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
}

