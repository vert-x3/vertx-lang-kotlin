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

import io.vertx.ext.mongo.IndexOptions
import io.vertx.ext.mongo.CollationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.IndexOptions] objects.
 *
 * Options used to configure index.
 *
 * @param collation  Optional. Specifies the collation for the index. <p> Collation allows users to specify language-specific rules for string comparison, such as rules for lettercase and accent marks. <p> If you have specified a collation at the collection level, then: If you do not specify a collation when creating the index, MongoDB creates the index with the collection's default collation. If you do specify a collation when creating the index, MongoDB creates the index with the specified collation. When specifying collation, the locale field is mandatory; all other collation fields are optional. For descriptions of the fields, see <a href="https://docs.mongodb.com/manual/reference/collation/#std-label-collation-document-fields">Collation Document</a>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.IndexOptions original] using Vert.x codegen.
 */
fun indexOptionsOf(
  collation: io.vertx.ext.mongo.CollationOptions? = null): IndexOptions = io.vertx.ext.mongo.IndexOptions().apply {

  if (collation != null) {
    this.setCollation(collation)
  }
}

