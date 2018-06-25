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

suspend fun MongoClient.saveAwait(collection : String, document : JsonObject) : String {
    return awaitResult{
        this.save(collection, document, it)
    }
}

suspend fun MongoClient.saveWithOptionsAwait(collection : String, document : JsonObject, writeOption : WriteOption) : String {
    return awaitResult{
        this.saveWithOptions(collection, document, writeOption, it)
    }
}

suspend fun MongoClient.insertAwait(collection : String, document : JsonObject) : String {
    return awaitResult{
        this.insert(collection, document, it)
    }
}

suspend fun MongoClient.insertWithOptionsAwait(collection : String, document : JsonObject, writeOption : WriteOption) : String {
    return awaitResult{
        this.insertWithOptions(collection, document, writeOption, it)
    }
}

suspend fun MongoClient.updateCollectionAwait(collection : String, query : JsonObject, update : JsonObject) : MongoClientUpdateResult {
    return awaitResult{
        this.updateCollection(collection, query, update, it)
    }
}

suspend fun MongoClient.updateCollectionWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, options : UpdateOptions) : MongoClientUpdateResult {
    return awaitResult{
        this.updateCollectionWithOptions(collection, query, update, options, it)
    }
}

suspend fun MongoClient.replaceDocumentsAwait(collection : String, query : JsonObject, replace : JsonObject) : MongoClientUpdateResult {
    return awaitResult{
        this.replaceDocuments(collection, query, replace, it)
    }
}

suspend fun MongoClient.replaceDocumentsWithOptionsAwait(collection : String, query : JsonObject, replace : JsonObject, options : UpdateOptions) : MongoClientUpdateResult {
    return awaitResult{
        this.replaceDocumentsWithOptions(collection, query, replace, options, it)
    }
}

suspend fun MongoClient.bulkWriteAwait(collection : String, operations : List<BulkOperation>) : MongoClientBulkWriteResult {
    return awaitResult{
        this.bulkWrite(collection, operations, it)
    }
}

suspend fun MongoClient.bulkWriteWithOptionsAwait(collection : String, operations : List<BulkOperation>, bulkWriteOptions : BulkWriteOptions) : MongoClientBulkWriteResult {
    return awaitResult{
        this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it)
    }
}

suspend fun MongoClient.findAwait(collection : String, query : JsonObject) : List<JsonObject> {
    return awaitResult{
        this.find(collection, query, it)
    }
}

suspend fun MongoClient.findWithOptionsAwait(collection : String, query : JsonObject, options : FindOptions) : List<JsonObject> {
    return awaitResult{
        this.findWithOptions(collection, query, options, it)
    }
}

suspend fun MongoClient.findOneAwait(collection : String, query : JsonObject, fields : JsonObject) : JsonObject {
    return awaitResult{
        this.findOne(collection, query, fields, it)
    }
}

suspend fun MongoClient.findOneAndUpdateAwait(collection : String, query : JsonObject, update : JsonObject) : JsonObject {
    return awaitResult{
        this.findOneAndUpdate(collection, query, update, it)
    }
}

suspend fun MongoClient.findOneAndUpdateWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, findOptions : FindOptions, updateOptions : UpdateOptions) : JsonObject {
    return awaitResult{
        this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it)
    }
}

suspend fun MongoClient.findOneAndReplaceAwait(collection : String, query : JsonObject, replace : JsonObject) : JsonObject {
    return awaitResult{
        this.findOneAndReplace(collection, query, replace, it)
    }
}

suspend fun MongoClient.findOneAndReplaceWithOptionsAwait(collection : String, query : JsonObject, replace : JsonObject, findOptions : FindOptions, updateOptions : UpdateOptions) : JsonObject {
    return awaitResult{
        this.findOneAndReplaceWithOptions(collection, query, replace, findOptions, updateOptions, it)
    }
}

suspend fun MongoClient.findOneAndDeleteAwait(collection : String, query : JsonObject) : JsonObject {
    return awaitResult{
        this.findOneAndDelete(collection, query, it)
    }
}

suspend fun MongoClient.findOneAndDeleteWithOptionsAwait(collection : String, query : JsonObject, findOptions : FindOptions) : JsonObject {
    return awaitResult{
        this.findOneAndDeleteWithOptions(collection, query, findOptions, it)
    }
}

suspend fun MongoClient.countAwait(collection : String, query : JsonObject) : Long {
    return awaitResult{
        this.count(collection, query, it)
    }
}

suspend fun MongoClient.removeDocumentsAwait(collection : String, query : JsonObject) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocuments(collection, query, it)
    }
}

suspend fun MongoClient.removeDocumentsWithOptionsAwait(collection : String, query : JsonObject, writeOption : WriteOption) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocumentsWithOptions(collection, query, writeOption, it)
    }
}

suspend fun MongoClient.removeDocumentAwait(collection : String, query : JsonObject) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocument(collection, query, it)
    }
}

suspend fun MongoClient.removeDocumentWithOptionsAwait(collection : String, query : JsonObject, writeOption : WriteOption) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocumentWithOptions(collection, query, writeOption, it)
    }
}

suspend fun MongoClient.createCollectionAwait(collectionName : String) : Unit {
    return awaitResult{
        this.createCollection(collectionName, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoClient.getCollectionsAwait() : List<String> {
    return awaitResult{
        this.getCollections(it)
    }
}

suspend fun MongoClient.dropCollectionAwait(collection : String) : Unit {
    return awaitResult{
        this.dropCollection(collection, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoClient.createIndexAwait(collection : String, key : JsonObject) : Unit {
    return awaitResult{
        this.createIndex(collection, key, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoClient.createIndexWithOptionsAwait(collection : String, key : JsonObject, options : IndexOptions) : Unit {
    return awaitResult{
        this.createIndexWithOptions(collection, key, options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoClient.listIndexesAwait(collection : String) : JsonArray {
    return awaitResult{
        this.listIndexes(collection, it)
    }
}

suspend fun MongoClient.dropIndexAwait(collection : String, indexName : String) : Unit {
    return awaitResult{
        this.dropIndex(collection, indexName, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoClient.runCommandAwait(commandName : String, command : JsonObject) : JsonObject {
    return awaitResult{
        this.runCommand(commandName, command, it)
    }
}

suspend fun MongoClient.distinctAwait(collection : String, fieldName : String, resultClassname : String) : JsonArray {
    return awaitResult{
        this.distinct(collection, fieldName, resultClassname, it)
    }
}

suspend fun MongoClient.distinctWithQueryAwait(collection : String, fieldName : String, resultClassname : String, query : JsonObject) : JsonArray {
    return awaitResult{
        this.distinctWithQuery(collection, fieldName, resultClassname, query, it)
    }
}

