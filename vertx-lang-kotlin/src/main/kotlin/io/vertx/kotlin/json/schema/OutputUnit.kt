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
package io.vertx.kotlin.json.schema

import io.vertx.json.schema.OutputUnit

fun outputUnitOf(
  annotations: Iterable<io.vertx.json.schema.OutputUnit>? = null,
  error: String? = null,
  errors: Iterable<io.vertx.json.schema.OutputUnit>? = null,
  instanceLocation: String? = null,
  keyword: String? = null,
  keywordLocation: String? = null,
  valid: Boolean? = null): OutputUnit = io.vertx.json.schema.OutputUnit().apply {

  if (annotations != null) {
    this.setAnnotations(annotations.toList())
  }
  if (error != null) {
    this.setError(error)
  }
  if (errors != null) {
    this.setErrors(errors.toList())
  }
  if (instanceLocation != null) {
    this.setInstanceLocation(instanceLocation)
  }
  if (keyword != null) {
    this.setKeyword(keyword)
  }
  if (keywordLocation != null) {
    this.setKeywordLocation(keywordLocation)
  }
  if (valid != null) {
    this.setValid(valid)
  }
}

