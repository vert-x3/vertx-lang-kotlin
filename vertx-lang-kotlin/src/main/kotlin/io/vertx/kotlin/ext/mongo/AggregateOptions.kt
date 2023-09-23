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
 * @param collation  Optional. <p> Specifies the collation to use for the operation. <p> Collation allows users to specify language-specific rules for string comparison, such as rules for lettercase and accent marks.
 * @param maxTime  Set the time limit in milliseconds for processing operations on a cursor.
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param allowDiskUse  Set the flag if writing to temporary files is enabled.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.AggregateOptions original] using Vert.x codegen.
 */
fun aggregateOptionsOf(
  collation: io.vertx.ext.mongo.CollationOptions? = null,
  maxTime: Long? = null,
  batchSize: Int? = null,
  allowDiskUse: Boolean? = null): AggregateOptions = io.vertx.ext.mongo.AggregateOptions().apply {

  if (collation != null) {
    this.setCollation(collation)
  }
  if (maxTime != null) {
    this.setMaxTime(maxTime)
  }
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (allowDiskUse != null) {
    this.setAllowDiskUse(allowDiskUse)
  }
}

