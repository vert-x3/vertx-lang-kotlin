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
package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.UpdateResult

/**
 * A function providing a DSL for building [io.vertx.ext.sql.UpdateResult] objects.
 *
 * Represents the result of an update/insert/delete operation on the database.
 * <p>
 * The number of rows updated is available with [io.vertx.ext.sql.UpdateResult] and any generated
 * keys are available with [io.vertx.ext.sql.UpdateResult].
 *
 * @param keys  Get any generated keys
 * @param updated  Get the number of rows updated
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.UpdateResult original] using Vert.x codegen.
 */
fun updateResultOf(
  keys: io.vertx.core.json.JsonArray? = null,
  updated: Int? = null): UpdateResult = io.vertx.ext.sql.UpdateResult().apply {

  if (keys != null) {
    this.setKeys(keys)
  }
  if (updated != null) {
    this.setUpdated(updated)
  }
}

