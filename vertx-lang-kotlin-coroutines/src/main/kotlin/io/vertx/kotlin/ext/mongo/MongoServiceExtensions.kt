package io.vertx.kotlin.ext.mongo

import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.BulkOperation
import io.vertx.ext.mongo.BulkWriteOptions
import io.vertx.ext.mongo.FindOptions
import io.vertx.ext.mongo.IndexOptions
import io.vertx.ext.mongo.MongoClientBulkWriteResult
import io.vertx.ext.mongo.MongoClientDeleteResult
import io.vertx.ext.mongo.MongoClientUpdateResult
import io.vertx.ext.mongo.MongoService
import io.vertx.ext.mongo.UpdateOptions
import io.vertx.ext.mongo.WriteOption
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Deprecated
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList

suspend fun MongoService.save(collection: String, document: JsonObject): String {
  return awaitResult { this.save(collection, document, it) }
}

suspend fun MongoService.saveWithOptions(
  collection: String,
  document: JsonObject,
  writeOption: WriteOption?
): String {
  return awaitResult { this.saveWithOptions(collection, document, writeOption, it) }
}

suspend fun MongoService.insert(collection: String, document: JsonObject): String {
  return awaitResult { this.insert(collection, document, it) }
}

suspend fun MongoService.insertWithOptions(
  collection: String,
  document: JsonObject,
  writeOption: WriteOption?
): String {
  return awaitResult { this.insertWithOptions(collection, document, writeOption, it) }
}

@Deprecated("")
suspend fun MongoService.update(
  collection: String,
  query: JsonObject,
  update: JsonObject
) {
  awaitResult<Void?> { this.update(collection, query, update, it) }
}

suspend fun MongoService.updateCollection(
  collection: String,
  query: JsonObject,
  update: JsonObject
): MongoClientUpdateResult {
  return awaitResult { this.updateCollection(collection, query, update, it) }
}

@Deprecated("")
suspend fun MongoService.updateWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  options: UpdateOptions
) {
  awaitResult<Void?> { this.updateWithOptions(collection, query, update, options, it) }
}

suspend fun MongoService.updateCollectionWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  options: UpdateOptions
): MongoClientUpdateResult {
  return awaitResult { this.updateCollectionWithOptions(collection, query, update, options, it) }
}

@Deprecated("")
suspend fun MongoService.replace(
  collection: String,
  query: JsonObject,
  replace: JsonObject
) {
  awaitResult<Void?> { this.replace(collection, query, replace, it) }
}

suspend fun MongoService.replaceDocuments(
  collection: String,
  query: JsonObject,
  replace: JsonObject
): MongoClientUpdateResult {
  return awaitResult { this.replaceDocuments(collection, query, replace, it) }
}

@Deprecated("")
suspend fun MongoService.replaceWithOptions(
  collection: String,
  query: JsonObject,
  replace: JsonObject,
  options: UpdateOptions
) {
  awaitResult<Void?> { this.replaceWithOptions(collection, query, replace, options, it) }
}

suspend fun MongoService.replaceDocumentsWithOptions(
  collection: String,
  query: JsonObject,
  replace: JsonObject,
  options: UpdateOptions
): MongoClientUpdateResult {
  return awaitResult { this.replaceDocumentsWithOptions(collection, query, replace, options, it) }
}

suspend fun MongoService.bulkWrite(collection: String, operations: MutableList<BulkOperation>): MongoClientBulkWriteResult {
  return awaitResult { this.bulkWrite(collection, operations, it) }
}

suspend fun MongoService.bulkWriteWithOptions(
  collection: String,
  operations: MutableList<BulkOperation>,
  bulkWriteOptions: BulkWriteOptions
): MongoClientBulkWriteResult {
  return awaitResult { this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it) }
}

suspend fun MongoService.find(collection: String, query: JsonObject): MutableList<JsonObject> {
  return awaitResult { this.find(collection, query, it) }
}

suspend fun MongoService.findWithOptions(
  collection: String,
  query: JsonObject,
  options: FindOptions
): MutableList<JsonObject> {
  return awaitResult { this.findWithOptions(collection, query, options, it) }
}

suspend fun MongoService.findOne(
  collection: String,
  query: JsonObject,
  fields: JsonObject?
): JsonObject {
  return awaitResult { this.findOne(collection, query, fields, it) }
}

suspend fun MongoService.findOneAndUpdate(
  collection: String,
  query: JsonObject,
  update: JsonObject
): JsonObject {
  return awaitResult { this.findOneAndUpdate(collection, query, update, it) }
}

suspend fun MongoService.findOneAndUpdateWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  findOptions: FindOptions,
  updateOptions: UpdateOptions
): JsonObject {
  return awaitResult { this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it) }
}

suspend fun MongoService.findOneAndReplace(
  collection: String,
  query: JsonObject,
  replace: JsonObject
): JsonObject {
  return awaitResult { this.findOneAndReplace(collection, query, replace, it) }
}

suspend fun MongoService.findOneAndReplaceWithOptions(
  collection: String,
  query: JsonObject,
  update: JsonObject,
  findOptions: FindOptions,
  updateOptions: UpdateOptions
): JsonObject {
  return awaitResult { this.findOneAndReplaceWithOptions(collection, query, update, findOptions, updateOptions, it) }
}

suspend fun MongoService.findOneAndDelete(collection: String, query: JsonObject): JsonObject {
  return awaitResult { this.findOneAndDelete(collection, query, it) }
}

suspend fun MongoService.findOneAndDeleteWithOptions(
  collection: String,
  query: JsonObject,
  findOptions: FindOptions
): JsonObject {
  return awaitResult { this.findOneAndDeleteWithOptions(collection, query, findOptions, it) }
}

suspend fun MongoService.count(collection: String, query: JsonObject): Long {
  return awaitResult { this.count(collection, query, it) }
}

@Deprecated("")
suspend fun MongoService.remove(collection: String, query: JsonObject) {
  awaitResult<Void?> { this.remove(collection, query, it) }
}

suspend fun MongoService.removeDocuments(collection: String, query: JsonObject): MongoClientDeleteResult {
  return awaitResult { this.removeDocuments(collection, query, it) }
}

@Deprecated("")
suspend fun MongoService.removeWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption
) {
  awaitResult<Void?> { this.removeWithOptions(collection, query, writeOption, it) }
}

suspend fun MongoService.removeDocumentsWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption?
): MongoClientDeleteResult {
  return awaitResult { this.removeDocumentsWithOptions(collection, query, writeOption, it) }
}

@Deprecated("")
suspend fun MongoService.removeOne(collection: String, query: JsonObject) {
  awaitResult<Void?> { this.removeOne(collection, query, it) }
}

suspend fun MongoService.removeDocument(collection: String, query: JsonObject): MongoClientDeleteResult {
  return awaitResult { this.removeDocument(collection, query, it) }
}

@Deprecated("")
suspend fun MongoService.removeOneWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption
) {
  awaitResult<Void?> { this.removeOneWithOptions(collection, query, writeOption, it) }
}

suspend fun MongoService.removeDocumentWithOptions(
  collection: String,
  query: JsonObject,
  writeOption: WriteOption?
): MongoClientDeleteResult {
  return awaitResult { this.removeDocumentWithOptions(collection, query, writeOption, it) }
}

suspend fun MongoService.createCollection(collectionName: String) {
  awaitResult<Void?> { this.createCollection(collectionName, it) }
}

suspend fun MongoService.getCollections(): MutableList<String> {
  return awaitResult { this.getCollections(it) }
}

suspend fun MongoService.dropCollection(collection: String) {
  awaitResult<Void?> { this.dropCollection(collection, it) }
}

suspend fun MongoService.createIndex(collection: String, key: JsonObject) {
  awaitResult<Void?> { this.createIndex(collection, key, it) }
}

suspend fun MongoService.createIndexWithOptions(
  collection: String,
  key: JsonObject,
  options: IndexOptions
) {
  awaitResult<Void?> { this.createIndexWithOptions(collection, key, options, it) }
}

suspend fun MongoService.listIndexes(collection: String): JsonArray {
  return awaitResult { this.listIndexes(collection, it) }
}

suspend fun MongoService.dropIndex(collection: String, indexName: String) {
  awaitResult<Void?> { this.dropIndex(collection, indexName, it) }
}

suspend fun MongoService.runCommand(commandName: String, command: JsonObject): JsonObject {
  return awaitResult { this.runCommand(commandName, command, it) }
}

suspend fun MongoService.distinct(
  collection: String,
  fieldName: String,
  resultClassname: String
): JsonArray {
  return awaitResult { this.distinct(collection, fieldName, resultClassname, it) }
}

suspend fun MongoService.distinctWithQuery(
  collection: String,
  fieldName: String,
  resultClassname: String,
  query: JsonObject
): JsonArray {
  return awaitResult { this.distinctWithQuery(collection, fieldName, resultClassname, query, it) }
}
