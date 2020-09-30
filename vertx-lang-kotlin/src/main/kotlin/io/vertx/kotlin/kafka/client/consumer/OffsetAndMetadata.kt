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

import io.vertx.kafka.client.consumer.OffsetAndMetadata

/**
 * A function providing a DSL for building [io.vertx.kafka.client.consumer.OffsetAndMetadata] objects.
 *
 * Provide additional metadata when an offset is committed
 *
 * @param metadata  Set additional metadata for the offset committed
 * @param offset  Set the offset to commit
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.OffsetAndMetadata original] using Vert.x codegen.
 */
fun offsetAndMetadataOf(
  metadata: String? = null,
  offset: Long? = null): OffsetAndMetadata = io.vertx.kafka.client.consumer.OffsetAndMetadata().apply {

  if (metadata != null) {
    this.setMetadata(metadata)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

