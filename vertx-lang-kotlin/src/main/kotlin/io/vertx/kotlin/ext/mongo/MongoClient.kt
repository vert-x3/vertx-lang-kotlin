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
 * Save a document in the specified collection
 * <p>
 * This operation might change <i>_id</i> field of <i>document</i> parameter
 *
 * @param collection the collection
 * @param document the document
 * @param resultHandler result handler will be provided with the id if document didn't already have one
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.saveAwait(collection : String, document : JsonObject) : String {
  return awaitResult{
    this.save(collection, document, it)
  }
}

/**
 * Save a document in the specified collection with the specified write option
 * <p>
 * This operation might change <i>_id</i> field of <i>document</i> parameter
 *
 * @param collection the collection
 * @param document the document
 * @param writeOption the write option to use
 * @param resultHandler result handler will be provided with the id if document didn't already have one
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.saveWithOptionsAwait(collection : String, document : JsonObject, writeOption : WriteOption) : String {
  return awaitResult{
    this.saveWithOptions(collection, document, writeOption, it)
  }
}

/**
 * Insert a document in the specified collection
 * <p>
 * This operation might change <i>_id</i> field of <i>document</i> parameter
 *
 * @param collection the collection
 * @param document the document
 * @param resultHandler result handler will be provided with the id if document didn't already have one
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.insertAwait(collection : String, document : JsonObject) : String {
  return awaitResult{
    this.insert(collection, document, it)
  }
}

/**
 * Insert a document in the specified collection with the specified write option
 * <p>
 * This operation might change <i>_id</i> field of <i>document</i> parameter
 *
 * @param collection the collection
 * @param document the document
 * @param writeOption the write option to use
 * @param resultHandler result handler will be provided with the id if document didn't already have one
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.insertWithOptionsAwait(collection : String, document : JsonObject, writeOption : WriteOption) : String {
  return awaitResult{
    this.insertWithOptions(collection, document, writeOption, it)
  }
}

/**
 * Update matching documents in the specified collection and return the handler with MongoClientUpdateResult result
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param update used to describe how the documents will be updated
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.updateCollectionAwait(collection : String, query : JsonObject, update : JsonObject) : MongoClientUpdateResult {
  return awaitResult{
    this.updateCollection(collection, query, update, it)
  }
}

/**
 * Update matching documents in the specified collection, specifying options and return the handler with MongoClientUpdateResult result
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param update used to describe how the documents will be updated
 * @param options options to configure the update
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.updateCollectionWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, options : UpdateOptions) : MongoClientUpdateResult {
  return awaitResult{
    this.updateCollectionWithOptions(collection, query, update, options, it)
  }
}

/**
 * Replace matching documents in the specified collection and return the handler with MongoClientUpdateResult result
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param replace all matching documents will be replaced with this
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.replaceDocumentsAwait(collection : String, query : JsonObject, replace : JsonObject) : MongoClientUpdateResult {
  return awaitResult{
    this.replaceDocuments(collection, query, replace, it)
  }
}

/**
 * Replace matching documents in the specified collection, specifying options and return the handler with MongoClientUpdateResult result
 *
 * @param collection the collection
 * @param query query used to match the documents
 * @param replace all matching documents will be replaced with this
 * @param options options to configure the replace
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.replaceDocumentsWithOptionsAwait(collection : String, query : JsonObject, replace : JsonObject, options : UpdateOptions) : MongoClientUpdateResult {
  return awaitResult{
    this.replaceDocumentsWithOptions(collection, query, replace, options, it)
  }
}

/**
 * Execute a bulk operation. Can insert, update, replace, and/or delete multiple documents with one request.
 *
 * @param collection the collection
 * @param operations the operations to execute
 * @param resultHandler will be called with a [io.vertx.ext.mongo.MongoClientBulkWriteResult] when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.bulkWriteAwait(collection : String, operations : List<BulkOperation>) : MongoClientBulkWriteResult {
  return awaitResult{
    this.bulkWrite(collection, operations, it)
  }
}

/**
 * Execute a bulk operation with the specified write options. Can insert, update, replace, and/or delete multiple
 * documents with one request.
 *
 * @param collection the collection
 * @param operations the operations to execute
 * @param bulkWriteOptions the write options
 * @param resultHandler will be called with a [io.vertx.ext.mongo.MongoClientBulkWriteResult] when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.bulkWriteWithOptionsAwait(collection : String, operations : List<BulkOperation>, bulkWriteOptions : BulkWriteOptions) : MongoClientBulkWriteResult {
  return awaitResult{
    this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it)
  }
}

/**
 * Find matching documents in the specified collection
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param resultHandler will be provided with list of documents
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findAwait(collection : String, query : JsonObject) : List<JsonObject> {
  return awaitResult{
    this.find(collection, query, it)
  }
}

/**
 * Find matching documents in the specified collection, specifying options
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param options options to configure the find
 * @param resultHandler will be provided with list of documents
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findWithOptionsAwait(collection : String, query : JsonObject, options : FindOptions) : List<JsonObject> {
  return awaitResult{
    this.findWithOptions(collection, query, options, it)
  }
}

/**
 * Find a single matching document in the specified collection
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param fields the fields
 * @param resultHandler will be provided with the document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAwait(collection : String, query : JsonObject, fields : JsonObject) : JsonObject {
  return awaitResult{
    this.findOne(collection, query, fields, it)
  }
}

/**
 * Find a single matching document in the specified collection and update it.
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param update used to describe how the documents will be updated
 * @param resultHandler will be provided with the document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndUpdateAwait(collection : String, query : JsonObject, update : JsonObject) : JsonObject {
  return awaitResult{
    this.findOneAndUpdate(collection, query, update, it)
  }
}

/**
 * Find a single matching document in the specified collection and update it.
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param update used to describe how the documents will be updated
 * @param findOptions options to configure the find
 * @param updateOptions options to configure the update
 * @param resultHandler will be provided with the document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndUpdateWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, findOptions : FindOptions, updateOptions : UpdateOptions) : JsonObject {
  return awaitResult{
    this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it)
  }
}

/**
 * Find a single matching document in the specified collection and replace it.
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param replace the replacement document
 * @param resultHandler will be provided with the document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndReplaceAwait(collection : String, query : JsonObject, replace : JsonObject) : JsonObject {
  return awaitResult{
    this.findOneAndReplace(collection, query, replace, it)
  }
}

/**
 * Find a single matching document in the specified collection and replace it.
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param replace the replacement document
 * @param findOptions options to configure the find
 * @param updateOptions options to configure the update
 * @param resultHandler will be provided with the document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndReplaceWithOptionsAwait(collection : String, query : JsonObject, replace : JsonObject, findOptions : FindOptions, updateOptions : UpdateOptions) : JsonObject {
  return awaitResult{
    this.findOneAndReplaceWithOptions(collection, query, replace, findOptions, updateOptions, it)
  }
}

/**
 * Find a single matching document in the specified collection and delete it.
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param resultHandler will be provided with the deleted document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndDeleteAwait(collection : String, query : JsonObject) : JsonObject {
  return awaitResult{
    this.findOneAndDelete(collection, query, it)
  }
}

/**
 * Find a single matching document in the specified collection and delete it.
 * <p>
 * This operation might change <i>_id</i> field of <i>query</i> parameter
 *
 * @param collection the collection
 * @param query the query used to match the document
 * @param findOptions options to configure the find
 * @param resultHandler will be provided with the deleted document, if any
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.findOneAndDeleteWithOptionsAwait(collection : String, query : JsonObject, findOptions : FindOptions) : JsonObject {
  return awaitResult{
    this.findOneAndDeleteWithOptions(collection, query, findOptions, it)
  }
}

/**
 * Count matching documents in a collection.
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param resultHandler will be provided with the number of matching documents
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.countAwait(collection : String, query : JsonObject) : Long {
  return awaitResult{
    this.count(collection, query, it)
  }
}

/**
 * Remove matching documents from a collection and return the handler with MongoClientDeleteResult result
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentsAwait(collection : String, query : JsonObject) : MongoClientDeleteResult {
  return awaitResult{
    this.removeDocuments(collection, query, it)
  }
}

/**
 * Remove matching documents from a collection with the specified write option and return the handler with MongoClientDeleteResult result
 *
 * @param collection the collection
 * @param query query used to match documents
 * @param writeOption the write option to use
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentsWithOptionsAwait(collection : String, query : JsonObject, writeOption : WriteOption) : MongoClientDeleteResult {
  return awaitResult{
    this.removeDocumentsWithOptions(collection, query, writeOption, it)
  }
}

/**
 * Remove a single matching document from a collection and return the handler with MongoClientDeleteResult result
 *
 * @param collection the collection
 * @param query query used to match document
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentAwait(collection : String, query : JsonObject) : MongoClientDeleteResult {
  return awaitResult{
    this.removeDocument(collection, query, it)
  }
}

/**
 * Remove a single matching document from a collection with the specified write option and return the handler with MongoClientDeleteResult result
 *
 * @param collection the collection
 * @param query query used to match document
 * @param writeOption the write option to use
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.removeDocumentWithOptionsAwait(collection : String, query : JsonObject, writeOption : WriteOption) : MongoClientDeleteResult {
  return awaitResult{
    this.removeDocumentWithOptions(collection, query, writeOption, it)
  }
}

/**
 * Create a new collection
 *
 * @param collectionName the name of the collection
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.createCollectionAwait(collectionName : String) : Unit {
  return awaitResult{
    this.createCollection(collectionName, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get a list of all collections in the database.
 *
 * @param resultHandler will be called with a list of collections.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.getCollectionsAwait() : List<String> {
  return awaitResult{
    this.getCollections(it)
  }
}

/**
 * Drop a collection
 *
 * @param collection the collection
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.dropCollectionAwait(collection : String) : Unit {
  return awaitResult{
    this.dropCollection(collection, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Creates an index.
 *
 * @param collection the collection
 * @param key A document that contains the field and value pairs where the field is the index key and the value describes the type of index for that field. For an ascending index on a field, specify a value of 1; for descending index, specify a value of -1.
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.createIndexAwait(collection : String, key : JsonObject) : Unit {
  return awaitResult{
    this.createIndex(collection, key, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Creates an index.
 *
 * @param collection the collection
 * @param key A document that contains the field and value pairs where the field is the index key and the value describes the type of index for that field. For an ascending index on a field, specify a value of 1; for descending index, specify a value of -1.
 * @param options the options for the index
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.createIndexWithOptionsAwait(collection : String, key : JsonObject, options : IndexOptions) : Unit {
  return awaitResult{
    this.createIndexWithOptions(collection, key, options, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get all the indexes in this collection.
 *
 * @param collection the collection
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.listIndexesAwait(collection : String) : JsonArray {
  return awaitResult{
    this.listIndexes(collection, it)
  }
}

/**
 * Drops the index given its name.
 *
 * @param collection the collection
 * @param indexName the name of the index to remove
 * @param resultHandler will be called when complete
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.dropIndexAwait(collection : String, indexName : String) : Unit {
  return awaitResult{
    this.dropIndex(collection, indexName, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Run an arbitrary MongoDB command.
 *
 * @param commandName the name of the command
 * @param command the command
 * @param resultHandler will be called with the result.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.runCommandAwait(commandName : String, command : JsonObject) : JsonObject {
  return awaitResult{
    this.runCommand(commandName, command, it)
  }
}

/**
 * Gets the distinct values of the specified field name.
 * Return a JsonArray containing distinct values (eg: [ 1 , 89 ])
 *
 * @param collection the collection
 * @param fieldName the field name
 * @param resultClassname 
 * @param resultHandler will be provided with array of values.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.distinctAwait(collection : String, fieldName : String, resultClassname : String) : JsonArray {
  return awaitResult{
    this.distinct(collection, fieldName, resultClassname, it)
  }
}

/**
 * Gets the distinct values of the specified field name filtered by specified query.
 * Return a JsonArray containing distinct values (eg: [ 1 , 89 ])
 *
 * @param collection the collection
 * @param fieldName the field name
 * @param resultClassname 
 * @param query the query
 * @param resultHandler will be provided with array of values.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.MongoClient original] using Vert.x codegen.
 */
suspend fun MongoClient.distinctWithQueryAwait(collection : String, fieldName : String, resultClassname : String, query : JsonObject) : JsonArray {
  return awaitResult{
    this.distinctWithQuery(collection, fieldName, resultClassname, query, it)
  }
}

