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
package io.vertx.json.schema.kotlin

import io.vertx.core.json.pointer.JsonPointer
import io.vertx.json.schema.Schema
import io.vertx.json.schema.SchemaParser
import io.vertx.json.schema.SchemaRouter
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.json.schema.SchemaRouter.resolveRef]
 *
 * @param pointer 
 * @param scope 
 * @param schemaParser 
 * @return [Schema]
 *
 * NOTE: This function has been automatically generated from [io.vertx.json.schema.SchemaRouter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use resolveRef returning a future and chain with await()", replaceWith = ReplaceWith("resolveRef(pointer, scope, schemaParser).await()"))
suspend fun SchemaRouter.resolveRefAwait(pointer: JsonPointer, scope: JsonPointer, schemaParser: SchemaParser): Schema {
  return awaitResult {
    this.resolveRef(pointer, scope, schemaParser, it)
  }
}

