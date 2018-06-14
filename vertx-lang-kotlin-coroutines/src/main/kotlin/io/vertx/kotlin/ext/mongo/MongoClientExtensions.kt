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
import kotlin.Deprecated
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Save a document in the specified collection
 *  <p>
 *  This operation might change <i>_id</i> field of <i>document</i> parameter
 * @param collection  the collection
 * @param document  the document */
suspend fun MongoClient.save(collection: String, document: JsonObject): String {
  return awaitResult { this.save(collection, document, it) }
}

/**
 *  Save a document in the specified collection with the specified write option
 *  <p>
 *  This operation might change <i>_id</i> field of <i>document</i> parameter
 * @param collection  the collection
 * @param document  the document
 * @param writeOption  the write option to use */
suspend fun MongoClient.saveWithOptions(
  collection: String,
  document: JsonObject,
  writeOption: WriteOption?
): String {
  return awaitResult { this.saveWithOptions(collection, document, writeOption, it) }
}

/**
 *  Insert a document in the specified collection
 *  <p>
 *  This operation might change <i>_id</i> field of <i>document</i> parameter
 * @param collection  the collection
 * @param document  the document */
suspend fun MongoClient.insert(collection: String, document: JsonObject): String {
  return awaitResult { this.insert(collection, document, it) }
}

/**
 *  Insert a document in the specified collection with the specified write option
 *  <p>
 *  This operation might change <i>_id</i> field of <i>document</i> parameter
 * @param collection  the collection
 * @param document  the document
 * @param writeOption  the write option to use */
suspend fun MongoClient.insertWithOptions(
  collection: String,
  document: JsonObject,
  writeOption: WriteOption?
): String {
  return awaitResult { this.insertWithOptions(collection, document, writeOption, it) }
}

/**
 *  Update matching documents in the specified collection
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param update used to describe how the documents will be updated */
@Deprecated("")
suspend fun MongoClient.update(
  collection: String,
  query: JsonObject,
  update: JsonObject
) {
  awaitResult<Void?> { this.update(collection, query, update, it) }
}

/**
 *  Update matching documents in the specified collection and return the handler with MongoClientUpdateResult result
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param update used to describe how the documents will be updated */
suspend fun MongoClient.updateCollection(
  collection: String,
  query: JsonObject,
  update: JsonObject
): MongoClientUpdateResult {
  return awaitResult { this.updateCollection(collection, query, update, it) }
}

/**
 *  Update matching documents in the specified collection, specifying options
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param update used to describe how the documents will be updated
 * @param options options to configure the update */
@Deprecated("")
suspend fun MongoClient.updateWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  options: UpdateOptions
) {
  awaitResult<Void?> { this.updateWithOptions(collection, query, update, options, it) }
}

/**
 *  Update matching documents in the specified collection, specifying options and return the handler with MongoClientUpdateResult result
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param update used to describe how the documents will be updated
 * @param options options to configure the update */
suspend fun MongoClient.updateCollectionWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  options: UpdateOptions
): MongoClientUpdateResult {
  return awaitResult { this.updateCollectionWithOptions(collection, query, update, options, it) }
}

/**
 *  Replace matching documents in the specified collection
 *  <p>
 *  This operation might change <i>_id</i> field of <i>replace</i> parameter
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param replace  all matching documents will be replaced with this */
@Deprecated("")
suspend fun MongoClient.replace(
  collection: String,
  query: JsonObject,
  replace: JsonObject
) {
  awaitResult<Void?> { this.replace(collection, query, replace, it) }
}

/**
 *  Replace matching documents in the specified collection and return the handler with MongoClientUpdateResult result
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param replace  all matching documents will be replaced with this */
suspend fun MongoClient.replaceDocuments(
  collection: String,
  query: JsonObject,
  replace: JsonObject
): MongoClientUpdateResult {
  return awaitResult { this.replaceDocuments(collection, query, replace, it) }
}

/**
 *  Replace matching documents in the specified collection, specifying options
 *  <p>
 *  This operation might change <i>_id</i> field of <i>replace</i> parameter
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param replace  all matching documents will be replaced with this
 * @param options options to configure the replace */
@Deprecated("")
suspend fun MongoClient.replaceWithOptions(
  collection: String,
  query: JsonObject,
  replace: JsonObject,
  options: UpdateOptions
) {
  awaitResult<Void?> { this.replaceWithOptions(collection, query, replace, options, it) }
}

/**
 *  Replace matching documents in the specified collection, specifying options and return the handler with MongoClientUpdateResult result
 * @param collection  the collection
 * @param query  query used to match the documents
 * @param replace  all matching documents will be replaced with this
 * @param options options to configure the replace */
suspend fun MongoClient.replaceDocumentsWithOptions(
  collection: String,
  query: JsonObject,
  replace: JsonObject,
  options: UpdateOptions
): MongoClientUpdateResult {
  return awaitResult { this.replaceDocumentsWithOptions(collection, query, replace, options, it) }
}

/**
 *  Execute a bulk operation. Can insert, update, replace, and/or delete multiple documents with one request.
 * @param collection
 *           the collection
 * @param operations
 *           the operations to execute */
suspend fun MongoClient.bulkWrite(collection: String, operations: MutableList<BulkOperation>): MongoClientBulkWriteResult {
  return awaitResult { this.bulkWrite(collection, operations, it) }
}

/**
 *  Execute a bulk operation with the specified write options. Can insert, update, replace, and/or delete multiple
 *  documents with one request.
 * @param collection
 *           the collection
 * @param operations
 *           the operations to execute
 * @param bulkWriteOptions
 *           the write options */
suspend fun MongoClient.bulkWriteWithOptions(
  collection: String,
  operations: MutableList<BulkOperation>,
  bulkWriteOptions: BulkWriteOptions
): MongoClientBulkWriteResult {
  return awaitResult { this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it) }
}

/**
 *  Find matching documents in the specified collection
 * @param collection  the collection
 * @param query  query used to match documents */
suspend fun MongoClient.find(collection: String, query: JsonObject): MutableList<JsonObject> {
  return awaitResult { this.find(collection, query, it) }
}

/**
 *  Find matching documents in the specified collection, specifying options
 * @param collection  the collection
 * @param query  query used to match documents
 * @param options options to configure the find */
suspend fun MongoClient.findWithOptions(
  collection: String,
  query: JsonObject,
  options: FindOptions
): MutableList<JsonObject> {
  return awaitResult { this.findWithOptions(collection, query, options, it) }
}

/**
 *  Find a single matching document in the specified collection
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document
 * @param fields  the fields */
suspend fun MongoClient.findOne(
  collection: String,
  query: JsonObject,
  fields: JsonObject?
): JsonObject {
  return awaitResult { this.findOne(collection, query, fields, it) }
}

/**
 *  Find a single matching document in the specified collection and update it.
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document
 * @param update used to describe how the documents will be updated */
suspend fun MongoClient.findOneAndUpdate(
  collection: String,
  query: JsonObject,
  update: JsonObject
): JsonObject {
  return awaitResult { this.findOneAndUpdate(collection, query, update, it) }
}

/**
 *  Find a single matching document in the specified collection and update it.
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document
 * @param update used to describe how the documents will be updated
 * @param findOptions options to configure the find
 * @param updateOptions options to configure the update */
suspend fun MongoClient.findOneAndUpdateWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  findOptions: FindOptions,
  updateOptions: UpdateOptions
): JsonObject {
  return awaitResult { this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it) }
}

/**
 *  Find a single matching document in the specified collection and replace it.
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document
 * @param replace  the replacement document */
suspend fun MongoClient.findOneAndReplace(
  collection: String,
  query: JsonObject,
  replace: JsonObject
): JsonObject {
  return awaitResult { this.findOneAndReplace(collection, query, replace, it) }
}

/**
 *  Find a single matching document in the specified collection and replace it.
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document
 * @param replace  the replacement document
 * @param findOptions options to configure the find
 * @param updateOptions options to configure the update */
suspend fun MongoClient.findOneAndReplaceWithOptions(
  collection: String,
  query: JsonObject,
  replace: JsonObject,
  findOptions: FindOptions,
  updateOptions: UpdateOptions
): JsonObject {
  return awaitResult { this.findOneAndReplaceWithOptions(collection, query, replace, findOptions, updateOptions, it) }
}

/**
 *  Find a single matching document in the specified collection and delete it.
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document */
suspend fun MongoClient.findOneAndDelete(collection: String, query: JsonObject): JsonObject {
  return awaitResult { this.findOneAndDelete(collection, query, it) }
}

/**
 *  Find a single matching document in the specified collection and delete it.
 *  <p>
 *  This operation might change <i>_id</i> field of <i>query</i> parameter
 * @param collection  the collection
 * @param query  the query used to match the document
 * @param findOptions options to configure the find */
suspend fun MongoClient.findOneAndDeleteWithOptions(
  collection: String,
  query: JsonObject,
  findOptions: FindOptions
): JsonObject {
  return awaitResult { this.findOneAndDeleteWithOptions(collection, query, findOptions, it) }
}

/**
 *  Count matching documents in a collection.
 * @param collection  the collection
 * @param query  query used to match documents */
suspend fun MongoClient.count(collection: String, query: JsonObject): Long {
  return awaitResult { this.count(collection, query, it) }
}

/**
 *  Remove matching documents from a collection
 * @param collection  the collection
 * @param query  query used to match documents */
@Deprecated("")
suspend fun MongoClient.remove(collection: String, query: JsonObject) {
  awaitResult<Void?> { this.remove(collection, query, it) }
}

/**
 *  Remove matching documents from a collection and return the handler with MongoClientDeleteResult result
 * @param collection  the collection
 * @param query  query used to match documents */
suspend fun MongoClient.removeDocuments(collection: String, query: JsonObject): MongoClientDeleteResult {
  return awaitResult { this.removeDocuments(collection, query, it) }
}

/**
 *  Remove matching documents from a collection with the specified write option
 * @param collection  the collection
 * @param query  query used to match documents
 * @param writeOption  the write option to use */
@Deprecated("")
suspend fun MongoClient.removeWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption
) {
  awaitResult<Void?> { this.removeWithOptions(collection, query, writeOption, it) }
}

/**
 *  Remove matching documents from a collection with the specified write option and return the handler with MongoClientDeleteResult result
 * @param collection  the collection
 * @param query  query used to match documents
 * @param writeOption  the write option to use */
suspend fun MongoClient.removeDocumentsWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption?
): MongoClientDeleteResult {
  return awaitResult { this.removeDocumentsWithOptions(collection, query, writeOption, it) }
}

/**
 *  Remove a single matching document from a collection
 * @param collection  the collection
 * @param query  query used to match document */
@Deprecated("")
suspend fun MongoClient.removeOne(collection: String, query: JsonObject) {
  awaitResult<Void?> { this.removeOne(collection, query, it) }
}

/**
 *  Remove a single matching document from a collection and return the handler with MongoClientDeleteResult result
 * @param collection  the collection
 * @param query  query used to match document */
suspend fun MongoClient.removeDocument(collection: String, query: JsonObject): MongoClientDeleteResult {
  return awaitResult { this.removeDocument(collection, query, it) }
}

/**
 *  Remove a single matching document from a collection with the specified write option
 * @param collection  the collection
 * @param query  query used to match document
 * @param writeOption  the write option to use */
@Deprecated("")
suspend fun MongoClient.removeOneWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption
) {
  awaitResult<Void?> { this.removeOneWithOptions(collection, query, writeOption, it) }
}

/**
 *  Remove a single matching document from a collection with the specified write option and return the handler with MongoClientDeleteResult result
 * @param collection  the collection
 * @param query  query used to match document
 * @param writeOption  the write option to use */
suspend fun MongoClient.removeDocumentWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption?
): MongoClientDeleteResult {
  return awaitResult { this.removeDocumentWithOptions(collection, query, writeOption, it) }
}

/**
 *  Create a new collection
 * @param collectionName  the name of the collection */
suspend fun MongoClient.createCollection(collectionName: String) {
  awaitResult<Void?> { this.createCollection(collectionName, it) }
}

/**
 *  Get a list of all collections in the database. */
suspend fun MongoClient.getCollections(): MutableList<String> {
  return awaitResult { this.getCollections(it) }
}

/**
 *  Drop a collection
 * @param collection  the collection */
suspend fun MongoClient.dropCollection(collection: String) {
  awaitResult<Void?> { this.dropCollection(collection, it) }
}

/**
 *  Creates an index.
 * @param collection  the collection
 * @param key  A document that contains the field and value pairs where the field is the index key and the value
 *              describes the type of index for that field. For an ascending index on a field,
 *              specify a value of 1; for descending index, specify a value of -1. */
suspend fun MongoClient.createIndex(collection: String, key: JsonObject) {
  awaitResult<Void?> { this.createIndex(collection, key, it) }
}

/**
 *  Creates an index.
 * @param collection  the collection
 * @param key  A document that contains the field and value pairs where the field is the index key and the value
 *              describes the type of index for that field. For an ascending index on a field,
 *              specify a value of 1; for descending index, specify a value of -1.
 * @param options  the options for the index */
suspend fun MongoClient.createIndexWithOptions(
  collection: String,
  key: JsonObject,
  options: IndexOptions
) {
  awaitResult<Void?> { this.createIndexWithOptions(collection, key, options, it) }
}

/**
 *  Get all the indexes in this collection.
 * @param collection  the collection */
suspend fun MongoClient.listIndexes(collection: String): JsonArray {
  return awaitResult { this.listIndexes(collection, it) }
}

/**
 *  Drops the index given its name.
 * @param collection  the collection
 * @param indexName the name of the index to remove */
suspend fun MongoClient.dropIndex(collection: String, indexName: String) {
  awaitResult<Void?> { this.dropIndex(collection, indexName, it) }
}

/**
 *  Run an arbitrary MongoDB command.
 * @param commandName  the name of the command
 * @param command  the command */
suspend fun MongoClient.runCommand(commandName: String, command: JsonObject): JsonObject {
  return awaitResult { this.runCommand(commandName, command, it) }
}

/**
 *  Gets the distinct values of the specified field name.
 *  Return a JsonArray containing distinct values (eg: [ 1 , 89 ])
 * @param collection  the collection
 * @param fieldName  the field name */
suspend fun MongoClient.distinct(
  collection: String,
  fieldName: String,
  resultClassname: String
): JsonArray {
  return awaitResult { this.distinct(collection, fieldName, resultClassname, it) }
}

/**
 *  Gets the distinct values of the specified field name filtered by specified query.
 *  Return a JsonArray containing distinct values (eg: [ 1 , 89 ])
 * @param collection  the collection
 * @param fieldName  the field name
 * @param query the query */
suspend fun MongoClient.distinctWithQuery(
  collection: String,
  fieldName: String,
  resultClassname: String,
  query: JsonObject
): JsonArray {
  return awaitResult { this.distinctWithQuery(collection, fieldName, resultClassname, query, it) }
}
