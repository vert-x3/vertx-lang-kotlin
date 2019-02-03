package io.vertx.kotlin.ext.mongo

import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.BulkOperation
import io.vertx.ext.mongo.BulkWriteOptions
import io.vertx.ext.mongo.FindOptions
import io.vertx.ext.mongo.IndexOptions
import io.vertx.ext.mongo.MongoClient
import io.vertx.ext.mongo.MongoClientBulkWriteResult
import io.vertx.ext.mongo.MongoClientDeleteResult
import io.vertx.ext.mongo.MongoClientUpdateResult
import io.vertx.ext.mongo.UpdateOptions
import io.vertx.ext.mongo.WriteOption
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.save]
 *
 * @param collection the collection
 * @param document the document
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.saveAwait(collection: String, document: JsonObject): String? {
  return awaitResult {
    this.save(collection, document, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.saveWithOptions]
 *
 * @param collection the collection
 * @param document the document
 * @param writeOption the write option to use
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.saveWithOptionsAwait(collection: String, document: JsonObject, writeOption: WriteOption): String? {
  return awaitResult {
    this.saveWithOptions(collection, document, writeOption, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.insert]
 *
 * @param collection the collection
 * @param document the document
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.insertAwait(collection: String, document: JsonObject): String? {
  return awaitResult {
    this.insert(collection, document, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.insertWithOptions]
 *
 * @param collection the collection
 * @param document the document
 * @param writeOption the write option to use
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.insertWithOptionsAwait(collection: String, document: JsonObject, writeOption: WriteOption): String? {
  return awaitResult {
    this.insertWithOptions(collection, document, writeOption, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.updateCollection]
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param update used to describe how the documents will be updated
 * @return [MongoClientUpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.updateCollectionAwait(collection: String, query: JsonObject, update: JsonObject): MongoClientUpdateResult {
  return awaitResult {
    this.updateCollection(collection, query, update, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.updateCollectionWithOptions]
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param update used to describe how the documents will be updated
 * @param options options to configure the update
 * @return [MongoClientUpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.updateCollectionWithOptionsAwait(collection: String, query: JsonObject, update: JsonObject, options: UpdateOptions): MongoClientUpdateResult {
  return awaitResult {
    this.updateCollectionWithOptions(collection, query, update, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.replaceDocuments]
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param replace all matching documents will be replaced with this
 * @return [MongoClientUpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.replaceDocumentsAwait(collection: String, query: JsonObject, replace: JsonObject): MongoClientUpdateResult {
  return awaitResult {
    this.replaceDocuments(collection, query, replace, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.replaceDocumentsWithOptions]
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param replace all matching documents will be replaced with this
 * @param options options to configure the replace
 * @return [MongoClientUpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.replaceDocumentsWithOptionsAwait(collection: String, query: JsonObject, replace: JsonObject, options: UpdateOptions): MongoClientUpdateResult {
  return awaitResult {
    this.replaceDocumentsWithOptions(collection, query, replace, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.bulkWrite]
 *
 * @param collection the collection
 * @param operations the operations to execute
 * @return [MongoClientBulkWriteResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.bulkWriteAwait(collection: String, operations: List<BulkOperation>): MongoClientBulkWriteResult {
  return awaitResult {
    this.bulkWrite(collection, operations, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.bulkWriteWithOptions]
 *
 * @param collection the collection
 * @param operations the operations to execute
 * @param bulkWriteOptions the write options
 * @return [MongoClientBulkWriteResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.bulkWriteWithOptionsAwait(collection: String, operations: List<BulkOperation>, bulkWriteOptions: BulkWriteOptions): MongoClientBulkWriteResult {
  return awaitResult {
    this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.find]
 *
 * @param collection the collection
 * @param query query used to match documents
 * @return [List<JsonObject>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findAwait(collection: String, query: JsonObject): List<JsonObject> {
  return awaitResult {
    this.find(collection, query, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findWithOptions]
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param options options to configure the find
 * @return [List<JsonObject>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findWithOptionsAwait(collection: String, query: JsonObject, options: FindOptions): List<JsonObject> {
  return awaitResult {
    this.findWithOptions(collection, query, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOne]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param fields the fields
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAwait(collection: String, query: JsonObject, fields: JsonObject): JsonObject? {
  return awaitResult {
    this.findOne(collection, query, fields, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOneAndUpdate]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param update used to describe how the documents will be updated
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndUpdateAwait(collection: String, query: JsonObject, update: JsonObject): JsonObject? {
  return awaitResult {
    this.findOneAndUpdate(collection, query, update, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOneAndUpdateWithOptions]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param update used to describe how the documents will be updated
 * @param findOptions options to configure the find
 * @param updateOptions options to configure the update
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndUpdateWithOptionsAwait(collection: String, query: JsonObject, update: JsonObject, findOptions: FindOptions, updateOptions: UpdateOptions): JsonObject? {
  return awaitResult {
    this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOneAndReplace]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param replace the replacement document
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndReplaceAwait(collection: String, query: JsonObject, replace: JsonObject): JsonObject? {
  return awaitResult {
    this.findOneAndReplace(collection, query, replace, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOneAndReplaceWithOptions]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param replace the replacement document
 * @param findOptions options to configure the find
 * @param updateOptions options to configure the update
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndReplaceWithOptionsAwait(collection: String, query: JsonObject, replace: JsonObject, findOptions: FindOptions, updateOptions: UpdateOptions): JsonObject? {
  return awaitResult {
    this.findOneAndReplaceWithOptions(collection, query, replace, findOptions, updateOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOneAndDelete]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndDeleteAwait(collection: String, query: JsonObject): JsonObject? {
  return awaitResult {
    this.findOneAndDelete(collection, query, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.findOneAndDeleteWithOptions]
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param findOptions options to configure the find
 * @return [JsonObject?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndDeleteWithOptionsAwait(collection: String, query: JsonObject, findOptions: FindOptions): JsonObject? {
  return awaitResult {
    this.findOneAndDeleteWithOptions(collection, query, findOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.count]
 *
 * @param collection the collection
 * @param query query used to match documents
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.countAwait(collection: String, query: JsonObject): Long {
  return awaitResult {
    this.count(collection, query, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.removeDocuments]
 *
 * @param collection the collection
 * @param query query used to match documents
 * @return [MongoClientDeleteResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentsAwait(collection: String, query: JsonObject): MongoClientDeleteResult {
  return awaitResult {
    this.removeDocuments(collection, query, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.removeDocumentsWithOptions]
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param writeOption the write option to use
 * @return [MongoClientDeleteResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentsWithOptionsAwait(collection: String, query: JsonObject, writeOption: WriteOption): MongoClientDeleteResult {
  return awaitResult {
    this.removeDocumentsWithOptions(collection, query, writeOption, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.removeDocument]
 *
 * @param collection the collection
 * @param query query used to match document
 * @return [MongoClientDeleteResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentAwait(collection: String, query: JsonObject): MongoClientDeleteResult {
  return awaitResult {
    this.removeDocument(collection, query, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.removeDocumentWithOptions]
 *
 * @param collection the collection
 * @param query query used to match document
 * @param writeOption the write option to use
 * @return [MongoClientDeleteResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentWithOptionsAwait(collection: String, query: JsonObject, writeOption: WriteOption): MongoClientDeleteResult {
  return awaitResult {
    this.removeDocumentWithOptions(collection, query, writeOption, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.createCollection]
 *
 * @param collectionName the name of the collection
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.createCollectionAwait(collectionName: String): Unit {
  return awaitResult {
    this.createCollection(collectionName) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.getCollections]
 *
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.getCollectionsAwait(): List<String> {
  return awaitResult {
    this.getCollections(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.dropCollection]
 *
 * @param collection the collection
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.dropCollectionAwait(collection: String): Unit {
  return awaitResult {
    this.dropCollection(collection) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.createIndex]
 *
 * @param collection the collection
 * @param key A document that contains the field and value pairs where the field is the index key and the value describes the type of index for that field. For an ascending index on a field, specify a value of 1; for descending index, specify a value of -1.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.createIndexAwait(collection: String, key: JsonObject): Unit {
  return awaitResult {
    this.createIndex(collection, key) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.createIndexWithOptions]
 *
 * @param collection the collection
 * @param key A document that contains the field and value pairs where the field is the index key and the value describes the type of index for that field. For an ascending index on a field, specify a value of 1; for descending index, specify a value of -1.
 * @param options the options for the index
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.createIndexWithOptionsAwait(collection: String, key: JsonObject, options: IndexOptions): Unit {
  return awaitResult {
    this.createIndexWithOptions(collection, key, options) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.listIndexes]
 *
 * @param collection the collection
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.listIndexesAwait(collection: String): JsonArray {
  return awaitResult {
    this.listIndexes(collection, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.dropIndex]
 *
 * @param collection the collection
 * @param indexName the name of the index to remove
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.dropIndexAwait(collection: String, indexName: String): Unit {
  return awaitResult {
    this.dropIndex(collection, indexName) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.runCommand]
 *
 * @param commandName the name of the command
 * @param command the command
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.runCommandAwait(commandName: String, command: JsonObject): JsonObject {
  return awaitResult {
    this.runCommand(commandName, command, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.distinct]
 *
 * @param collection the collection
 * @param fieldName the field name
 * @param resultClassname 
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.distinctAwait(collection: String, fieldName: String, resultClassname: String): JsonArray {
  return awaitResult {
    this.distinct(collection, fieldName, resultClassname, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mongo.MongoClient.distinctWithQuery]
 *
 * @param collection the collection
 * @param fieldName the field name
 * @param resultClassname 
 * @param query the query
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mongo.MongoClient] using Vert.x codegen.
 */
suspend fun MongoClient.distinctWithQueryAwait(collection: String, fieldName: String, resultClassname: String, query: JsonObject): JsonArray {
  return awaitResult {
    this.distinctWithQuery(collection, fieldName, resultClassname, query, it)
  }
}

