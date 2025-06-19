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

import io.vertx.ext.mongo.CountOptions
import io.vertx.ext.mongo.CollationOptions

fun countOptionsOf(
  collation: io.vertx.ext.mongo.CollationOptions? = null,
  hint: io.vertx.core.json.JsonObject? = null,
  hintString: String? = null,
  limit: Int? = null,
  maxTime: Long? = null,
  skip: Int? = null): CountOptions = io.vertx.ext.mongo.CountOptions().apply {

  if (collation != null) {
    this.setCollation(collation)
  }
  if (hint != null) {
    this.setHint(hint)
  }
  if (hintString != null) {
    this.setHintString(hintString)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (maxTime != null) {
    this.setMaxTime(maxTime)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
}

