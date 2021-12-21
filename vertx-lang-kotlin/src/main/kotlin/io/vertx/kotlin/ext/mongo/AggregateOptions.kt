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

import io.vertx.ext.mongo.AggregateOptions
import io.vertx.ext.mongo.CollationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.AggregateOptions] objects.
 *
 * Options used to configure aggregate operations.
 *
 * @param allowDiskUse  Set the flag if writing to temporary files is enabled.
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param collationOptions  Optional. Specifies the collation to use for the operation. Collation allows users to specify language-specific rules for string comparison, such as rules for lettercase and accent marks.
 * @param maxTime  Set the time limit in milliseconds for processing operations on a cursor.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.AggregateOptions original] using Vert.x codegen.
 */
fun aggregateOptionsOf(
  allowDiskUse: Boolean? = null,
  batchSize: Int? = null,
  collationOptions: io.vertx.ext.mongo.CollationOptions? = null,
  maxTime: Long? = null): AggregateOptions = io.vertx.ext.mongo.AggregateOptions().apply {

  if (allowDiskUse != null) {
    this.setAllowDiskUse(allowDiskUse)
  }
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (collationOptions != null) {
    this.setCollationOptions(collationOptions)
  }
  if (maxTime != null) {
    this.setMaxTime(maxTime)
  }
}

