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

suspend fun MongoClient.save(collection: String, document: JsonObject): String = awaitResult { this.save(collection, document, it) }

suspend fun MongoClient.saveWithOptions(
    collection: String,
    document: JsonObject,
    writeOption: WriteOption?
): String = awaitResult { this.saveWithOptions(collection, document, writeOption, it) }

suspend fun MongoClient.insert(collection: String, document: JsonObject): String = awaitResult { this.insert(collection, document, it) }

suspend fun MongoClient.insertWithOptions(
    collection: String,
    document: JsonObject,
    writeOption: WriteOption?
): String = awaitResult { this.insertWithOptions(collection, document, writeOption, it) }

@Deprecated("")
suspend fun MongoClient.update(
    collection: String,
    query: JsonObject,
    update: JsonObject
) {
  awaitResult<Void?> { this.update(collection, query, update, it) }
}

suspend fun MongoClient.updateCollection(
    collection: String,
    query: JsonObject,
    update: JsonObject
): MongoClientUpdateResult = awaitResult { this.updateCollection(collection, query, update, it) }

@Deprecated("")
suspend fun MongoClient.updateWithOptions(
    collection: String,
    query: JsonObject,
    update: JsonObject,
    options: UpdateOptions
) {
  awaitResult<Void?> { this.updateWithOptions(collection, query, update, options, it) }
}

suspend fun MongoClient.updateCollectionWithOptions(
    collection: String,
    query: JsonObject,
    update: JsonObject,
    options: UpdateOptions
): MongoClientUpdateResult = awaitResult { this.updateCollectionWithOptions(collection, query, update, options, it) }

@Deprecated("")
suspend fun MongoClient.replace(
    collection: String,
    query: JsonObject,
    replace: JsonObject
) {
  awaitResult<Void?> { this.replace(collection, query, replace, it) }
}

suspend fun MongoClient.replaceDocuments(
    collection: String,
    query: JsonObject,
    replace: JsonObject
): MongoClientUpdateResult = awaitResult { this.replaceDocuments(collection, query, replace, it) }

@Deprecated("")
suspend fun MongoClient.replaceWithOptions(
    collection: String,
    query: JsonObject,
    replace: JsonObject,
    options: UpdateOptions
) {
  awaitResult<Void?> { this.replaceWithOptions(collection, query, replace, options, it) }
}

suspend fun MongoClient.replaceDocumentsWithOptions(
    collection: String,
    query: JsonObject,
    replace: JsonObject,
    options: UpdateOptions
): MongoClientUpdateResult = awaitResult { this.replaceDocumentsWithOptions(collection, query, replace, options, it) }

suspend fun MongoClient.bulkWrite(collection: String, operations: MutableList<BulkOperation>): MongoClientBulkWriteResult = awaitResult { this.bulkWrite(collection, operations, it) }

suspend fun MongoClient.bulkWriteWithOptions(
    collection: String,
    operations: MutableList<BulkOperation>,
    bulkWriteOptions: BulkWriteOptions
): MongoClientBulkWriteResult = awaitResult { this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it) }

suspend fun MongoClient.find(collection: String, query: JsonObject): MutableList<JsonObject> = awaitResult { this.find(collection, query, it) }

suspend fun MongoClient.findWithOptions(
    collection: String,
    query: JsonObject,
    options: FindOptions
): MutableList<JsonObject> = awaitResult { this.findWithOptions(collection, query, options, it) }

suspend fun MongoClient.findOne(
    collection: String,
    query: JsonObject,
    fields: JsonObject?
): JsonObject = awaitResult { this.findOne(collection, query, fields, it) }

suspend fun MongoClient.findOneAndUpdate(
    collection: String,
    query: JsonObject,
    update: JsonObject
): JsonObject = awaitResult { this.findOneAndUpdate(collection, query, update, it) }

suspend fun MongoClient.findOneAndUpdateWithOptions(
    collection: String,
    query: JsonObject,
    update: JsonObject,
    findOptions: FindOptions,
    updateOptions: UpdateOptions
): JsonObject = awaitResult { this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it) }

suspend fun MongoClient.findOneAndReplace(
    collection: String,
    query: JsonObject,
    replace: JsonObject
): JsonObject = awaitResult { this.findOneAndReplace(collection, query, replace, it) }

suspend fun MongoClient.findOneAndReplaceWithOptions(
    collection: String,
    query: JsonObject,
    replace: JsonObject,
    findOptions: FindOptions,
    updateOptions: UpdateOptions
): JsonObject = awaitResult { this.findOneAndReplaceWithOptions(collection, query, replace, findOptions, updateOptions, it) }

suspend fun MongoClient.findOneAndDelete(collection: String, query: JsonObject): JsonObject = awaitResult { this.findOneAndDelete(collection, query, it) }

suspend fun MongoClient.findOneAndDeleteWithOptions(
    collection: String,
    query: JsonObject,
    findOptions: FindOptions
): JsonObject = awaitResult { this.findOneAndDeleteWithOptions(collection, query, findOptions, it) }

suspend fun MongoClient.count(collection: String, query: JsonObject): Long = awaitResult { this.count(collection, query, it) }

@Deprecated("")
suspend fun MongoClient.remove(collection: String, query: JsonObject) {
  awaitResult<Void?> { this.remove(collection, query, it) }
}

suspend fun MongoClient.removeDocuments(collection: String, query: JsonObject): MongoClientDeleteResult = awaitResult { this.removeDocuments(collection, query, it) }

@Deprecated("")
suspend fun MongoClient.removeWithOptions(
    collection: String,
    query: JsonObject,
    writeOption: WriteOption
) {
  awaitResult<Void?> { this.removeWithOptions(collection, query, writeOption, it) }
}

suspend fun MongoClient.removeDocumentsWithOptions(
    collection: String,
    query: JsonObject,
    writeOption: WriteOption?
): MongoClientDeleteResult = awaitResult { this.removeDocumentsWithOptions(collection, query, writeOption, it) }

@Deprecated("")
suspend fun MongoClient.removeOne(collection: String, query: JsonObject) {
  awaitResult<Void?> { this.removeOne(collection, query, it) }
}

suspend fun MongoClient.removeDocument(collection: String, query: JsonObject): MongoClientDeleteResult = awaitResult { this.removeDocument(collection, query, it) }

@Deprecated("")
suspend fun MongoClient.removeOneWithOptions(
    collection: String,
    query: JsonObject,
    writeOption: WriteOption
) {
  awaitResult<Void?> { this.removeOneWithOptions(collection, query, writeOption, it) }
}

suspend fun MongoClient.removeDocumentWithOptions(
    collection: String,
    query: JsonObject,
    writeOption: WriteOption?
): MongoClientDeleteResult = awaitResult { this.removeDocumentWithOptions(collection, query, writeOption, it) }

suspend fun MongoClient.createCollection(collectionName: String) {
  awaitResult<Void?> { this.createCollection(collectionName, it) }
}

suspend fun MongoClient.getCollections(): MutableList<String> = awaitResult { this.getCollections(it) }

suspend fun MongoClient.dropCollection(collection: String) {
  awaitResult<Void?> { this.dropCollection(collection, it) }
}

suspend fun MongoClient.createIndex(collection: String, key: JsonObject) {
  awaitResult<Void?> { this.createIndex(collection, key, it) }
}

suspend fun MongoClient.createIndexWithOptions(
    collection: String,
    key: JsonObject,
    options: IndexOptions
) {
  awaitResult<Void?> { this.createIndexWithOptions(collection, key, options, it) }
}

suspend fun MongoClient.listIndexes(collection: String): JsonArray = awaitResult { this.listIndexes(collection, it) }

suspend fun MongoClient.dropIndex(collection: String, indexName: String) {
  awaitResult<Void?> { this.dropIndex(collection, indexName, it) }
}

suspend fun MongoClient.runCommand(commandName: String, command: JsonObject): JsonObject = awaitResult { this.runCommand(commandName, command, it) }

suspend fun MongoClient.distinct(
    collection: String,
    fieldName: String,
    resultClassname: String
): JsonArray = awaitResult { this.distinct(collection, fieldName, resultClassname, it) }

suspend fun MongoClient.distinctWithQuery(
    collection: String,
    fieldName: String,
    resultClassname: String,
    query: JsonObject
): JsonArray = awaitResult { this.distinctWithQuery(collection, fieldName, resultClassname, query, it) }
