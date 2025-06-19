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

import io.vertx.ext.mongo.UpdateOptions
import io.vertx.ext.mongo.CollationOptions
import io.vertx.ext.mongo.WriteOption

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.UpdateOptions] objects.
 *
 * Options for configuring updates.
 *
 * @param arrayFilters  Set the arrayFilters option
 * @param collation  Collation options
 * @param hint  Set the hint.
 * @param hintString  Set the hint string.
 * @param multi  Set whether multi is enabled
 * @param returningNewDocument  Set whether new document property is enabled. Valid only on findOneAnd* methods.
 * @param upsert  Set whether upsert is enabled
 * @param writeOption  Set the write option
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.UpdateOptions original] using Vert.x codegen.
 */
fun updateOptionsOf(
  arrayFilters: io.vertx.core.json.JsonArray? = null,
  collation: io.vertx.ext.mongo.CollationOptions? = null,
  hint: io.vertx.core.json.JsonObject? = null,
  hintString: String? = null,
  multi: Boolean? = null,
  returningNewDocument: Boolean? = null,
  upsert: Boolean? = null,
  writeOption: WriteOption? = null): UpdateOptions = io.vertx.ext.mongo.UpdateOptions().apply {

  if (arrayFilters != null) {
    this.setArrayFilters(arrayFilters)
  }
  if (collation != null) {
    this.setCollation(collation)
  }
  if (hint != null) {
    this.setHint(hint)
  }
  if (hintString != null) {
    this.setHintString(hintString)
  }
  if (multi != null) {
    this.setMulti(multi)
  }
  if (returningNewDocument != null) {
    this.setReturningNewDocument(returningNewDocument)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

