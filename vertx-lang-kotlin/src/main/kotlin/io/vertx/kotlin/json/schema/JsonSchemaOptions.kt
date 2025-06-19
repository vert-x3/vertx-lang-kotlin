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

import io.vertx.json.schema.JsonSchemaOptions
import io.vertx.json.schema.Draft
import io.vertx.json.schema.OutputFormat

/**
 * A function providing a DSL for building [io.vertx.json.schema.JsonSchemaOptions] objects.
 *
 * Configuration options for the Json-Schema validator
 *
 * @param baseUri 
 * @param draft 
 * @param outputFormat 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.json.schema.JsonSchemaOptions original] using Vert.x codegen.
 */
fun jsonSchemaOptionsOf(
  baseUri: String? = null,
  draft: Draft? = null,
  outputFormat: OutputFormat? = null): JsonSchemaOptions = io.vertx.json.schema.JsonSchemaOptions().apply {

  if (baseUri != null) {
    this.setBaseUri(baseUri)
  }
  if (draft != null) {
    this.setDraft(draft)
  }
  if (outputFormat != null) {
    this.setOutputFormat(outputFormat)
  }
}

