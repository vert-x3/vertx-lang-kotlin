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
package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.consumer.OffsetAndTimestamp

/**
 * A function providing a DSL for building [io.vertx.kafka.client.consumer.OffsetAndTimestamp] objects.
 *
 * Represent information related to a Offset with timestamp information
 *
 * @param offset  Set the offset
 * @param timestamp  Set the timestamp
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.OffsetAndTimestamp original] using Vert.x codegen.
 */
fun offsetAndTimestampOf(
  offset: Long? = null,
  timestamp: Long? = null): OffsetAndTimestamp = io.vertx.kafka.client.consumer.OffsetAndTimestamp().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
}

