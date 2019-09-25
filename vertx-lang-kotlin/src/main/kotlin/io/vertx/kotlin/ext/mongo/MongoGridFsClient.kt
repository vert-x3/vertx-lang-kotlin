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

import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonObject
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import io.vertx.ext.mongo.GridFsDownloadOptions
import io.vertx.ext.mongo.GridFsUploadOptions
import io.vertx.ext.mongo.MongoGridFsClient
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.delete]
 *
 * @param id the identifier of the file
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.deleteAwait(id: String): Unit {
  return awaitResult {
    this.delete(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun MongoGridFsClient.downloadByFileNameAwait(stream: WriteStream<Buffer>, fileName: String): Long {
  return awaitResult {
    this.downloadByFileName(stream, fileName, it)
  }
}

suspend fun MongoGridFsClient.downloadByFileNameWithOptionsAwait(stream: WriteStream<Buffer>, fileName: String, options: GridFsDownloadOptions): Long {
  return awaitResult {
    this.downloadByFileNameWithOptions(stream, fileName, options, it)
  }
}

suspend fun MongoGridFsClient.downloadByIdAwait(stream: WriteStream<Buffer>, id: String): Long {
  return awaitResult {
    this.downloadById(stream, id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.downloadFile]
 *
 * @param fileName the name of the file to download
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.downloadFileAwait(fileName: String): Long {
  return awaitResult {
    this.downloadFile(fileName, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.downloadFileAs]
 *
 * @param fileName the name of the file to download
 * @param newFileName the name the file should be saved as
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.downloadFileAsAwait(fileName: String, newFileName: String): Long {
  return awaitResult {
    this.downloadFileAs(fileName, newFileName, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.downloadFileByID]
 *
 * @param id the GridFs Object ID of the file to download
 * @param fileName 
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.downloadFileByIDAwait(id: String, fileName: String): Long {
  return awaitResult {
    this.downloadFileByID(id, fileName, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.drop]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.dropAwait(): Unit {
  return awaitResult {
    this.drop(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.findAllIds]
 *
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.findAllIdsAwait(): List<String> {
  return awaitResult {
    this.findAllIds(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.findIds]
 *
 * @param query a bson query expressed as json that will be used to match files
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.findIdsAwait(query: JsonObject): List<String> {
  return awaitResult {
    this.findIds(query, it)
  }
}

suspend fun MongoGridFsClient.uploadByFileNameAwait(stream: ReadStream<Buffer>, fileName: String): String {
  return awaitResult {
    this.uploadByFileName(stream, fileName, it)
  }
}

suspend fun MongoGridFsClient.uploadByFileNameWithOptionsAwait(stream: ReadStream<Buffer>, fileName: String, options: GridFsUploadOptions): String {
  return awaitResult {
    this.uploadByFileNameWithOptions(stream, fileName, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.uploadFile]
 *
 * @param fileName the name of the file to store in gridfs
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.uploadFileAwait(fileName: String): String {
  return awaitResult {
    this.uploadFile(fileName, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoGridFsClient.uploadFileWithOptions]
 *
 * @param fileName the name of the file to store in gridfs
 * @param options [io.vertx.ext.mongo.GridFsUploadOptions] for specifying metadata and chunk size
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoGridFsClient] using Vert.x codegen.
 */
suspend fun MongoGridFsClient.uploadFileWithOptionsAwait(fileName: String, options: GridFsUploadOptions): String {
  return awaitResult {
    this.uploadFileWithOptions(fileName, options, it)
  }
}

