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
package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.BulkWriteOptions
import io.vertx.ext.mongo.WriteOption

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.BulkWriteOptions] objects.
 *
 * Options for configuring bulk write operations.
 *
 * @param writeOption  Set the write option
 * @param ordered  Set the ordered option
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.BulkWriteOptions original] using Vert.x codegen.
 */
fun bulkWriteOptionsOf(
  writeOption: WriteOption? = null,
  ordered: Boolean? = null): BulkWriteOptions = io.vertx.ext.mongo.BulkWriteOptions().apply {

  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
  if (ordered != null) {
    this.setOrdered(ordered)
  }
}

