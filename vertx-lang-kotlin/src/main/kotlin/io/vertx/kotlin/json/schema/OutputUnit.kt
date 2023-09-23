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
  valid: Boolean? = null,
  absoluteKeywordLocation: String? = null,
  keywordLocation: String? = null,
  instanceLocation: String? = null,
  error: String? = null,
  errors: Iterable<io.vertx.json.schema.OutputUnit>? = null,
  annotations: Iterable<io.vertx.json.schema.OutputUnit>? = null): OutputUnit = io.vertx.json.schema.OutputUnit().apply {

  if (valid != null) {
    this.setValid(valid)
  }
  if (absoluteKeywordLocation != null) {
    this.setAbsoluteKeywordLocation(absoluteKeywordLocation)
  }
  if (keywordLocation != null) {
    this.setKeywordLocation(keywordLocation)
  }
  if (instanceLocation != null) {
    this.setInstanceLocation(instanceLocation)
  }
  if (error != null) {
    this.setError(error)
  }
  if (errors != null) {
    this.setErrors(errors.toList())
  }
  if (annotations != null) {
    this.setAnnotations(annotations.toList())
  }
}

