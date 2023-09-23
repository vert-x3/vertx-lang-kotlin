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

import io.vertx.ext.mongo.ValidationOptions
import com.mongodb.client.model.ValidationAction
import com.mongodb.client.model.ValidationLevel

fun validationOptionsOf(
  validator: io.vertx.core.json.JsonObject? = null,
  validationLevel: ValidationLevel? = null,
  validationAction: ValidationAction? = null): ValidationOptions = io.vertx.ext.mongo.ValidationOptions().apply {

  if (validator != null) {
    this.setValidator(validator)
  }
  if (validationLevel != null) {
    this.setValidationLevel(validationLevel)
  }
  if (validationAction != null) {
    this.setValidationAction(validationAction)
  }
}

