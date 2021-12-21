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

import io.vertx.ext.mongo.CreateCollectionOptions
import io.vertx.ext.mongo.CollationOptions
import io.vertx.ext.mongo.ValidationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.CreateCollectionOptions] objects.
 *
 * Options for creating a collection
 *
 * @param capped  Optional. To create a capped collection, specify true. If you specify true, you must also set a maximum size in the size field.
 * @param collation  Specifies the default collation for the collection. Collation allows users to specify language-specific rules for string comparison, such as rules for lettercase and accent marks.
 * @param indexOptionDefaults  Optional. Allows users to specify a default configuration for indexes when creating a collection.
 * @param maxDocuments  Optional. The maximum number of documents allowed in the capped collection.           The size limit takes precedence over this limit.           If a capped collection reaches the size limit before it reaches the maximum number of documents,           MongoDB removes old documents.           If you prefer to use the max limit, ensure that the size limit,           which is required for a capped collection, is sufficient to contain the maximum number of documents.
 * @param sizeInBytes  Optional. Specify a maximum size in bytes for a capped collection. Once a capped collection reaches its maximum size, MongoDB removes the older documents to make space for the new documents.           The size field is required for capped collections and ignored for other collections.
 * @param storageEngineOptions  Optional. Available for the WiredTiger storage engine only. Allows users to specify configuration to the storage engine on a per-collection basis when creating a collection.
 * @param validationOptions 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.CreateCollectionOptions original] using Vert.x codegen.
 */
fun createCollectionOptionsOf(
  capped: Boolean? = null,
  collation: io.vertx.ext.mongo.CollationOptions? = null,
  indexOptionDefaults: io.vertx.core.json.JsonObject? = null,
  maxDocuments: Long? = null,
  sizeInBytes: Long? = null,
  storageEngineOptions: io.vertx.core.json.JsonObject? = null,
  validationOptions: io.vertx.ext.mongo.ValidationOptions? = null): CreateCollectionOptions = io.vertx.ext.mongo.CreateCollectionOptions().apply {

  if (capped != null) {
    this.setCapped(capped)
  }
  if (collation != null) {
    this.setCollation(collation)
  }
  if (indexOptionDefaults != null) {
    this.setIndexOptionDefaults(indexOptionDefaults)
  }
  if (maxDocuments != null) {
    this.setMaxDocuments(maxDocuments)
  }
  if (sizeInBytes != null) {
    this.setSizeInBytes(sizeInBytes)
  }
  if (storageEngineOptions != null) {
    this.setStorageEngineOptions(storageEngineOptions)
  }
  if (validationOptions != null) {
    this.setValidationOptions(validationOptions)
  }
}

