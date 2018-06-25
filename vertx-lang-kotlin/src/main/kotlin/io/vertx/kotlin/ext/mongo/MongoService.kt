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

suspend fun MongoService.saveAwait(collection : String, document : JsonObject) : String {
    return awaitResult{
        this.save(collection, document, it)
    }
}

suspend fun MongoService.saveWithOptionsAwait(collection : String, document : JsonObject, writeOption : WriteOption) : String {
    return awaitResult{
        this.saveWithOptions(collection, document, writeOption, it)
    }
}

suspend fun MongoService.insertAwait(collection : String, document : JsonObject) : String {
    return awaitResult{
        this.insert(collection, document, it)
    }
}

suspend fun MongoService.insertWithOptionsAwait(collection : String, document : JsonObject, writeOption : WriteOption) : String {
    return awaitResult{
        this.insertWithOptions(collection, document, writeOption, it)
    }
}

suspend fun MongoService.updateCollectionAwait(collection : String, query : JsonObject, update : JsonObject) : MongoClientUpdateResult {
    return awaitResult{
        this.updateCollection(collection, query, update, it)
    }
}

suspend fun MongoService.updateCollectionWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, options : UpdateOptions) : MongoClientUpdateResult {
    return awaitResult{
        this.updateCollectionWithOptions(collection, query, update, options, it)
    }
}

suspend fun MongoService.replaceDocumentsAwait(collection : String, query : JsonObject, replace : JsonObject) : MongoClientUpdateResult {
    return awaitResult{
        this.replaceDocuments(collection, query, replace, it)
    }
}

suspend fun MongoService.replaceDocumentsWithOptionsAwait(collection : String, query : JsonObject, replace : JsonObject, options : UpdateOptions) : MongoClientUpdateResult {
    return awaitResult{
        this.replaceDocumentsWithOptions(collection, query, replace, options, it)
    }
}

suspend fun MongoService.bulkWriteAwait(collection : String, operations : List<BulkOperation>) : MongoClientBulkWriteResult {
    return awaitResult{
        this.bulkWrite(collection, operations, it)
    }
}

suspend fun MongoService.bulkWriteWithOptionsAwait(collection : String, operations : List<BulkOperation>, bulkWriteOptions : BulkWriteOptions) : MongoClientBulkWriteResult {
    return awaitResult{
        this.bulkWriteWithOptions(collection, operations, bulkWriteOptions, it)
    }
}

suspend fun MongoService.findAwait(collection : String, query : JsonObject) : List<JsonObject> {
    return awaitResult{
        this.find(collection, query, it)
    }
}

suspend fun MongoService.findWithOptionsAwait(collection : String, query : JsonObject, options : FindOptions) : List<JsonObject> {
    return awaitResult{
        this.findWithOptions(collection, query, options, it)
    }
}

suspend fun MongoService.findOneAwait(collection : String, query : JsonObject, fields : JsonObject) : JsonObject {
    return awaitResult{
        this.findOne(collection, query, fields, it)
    }
}

suspend fun MongoService.findOneAndUpdateAwait(collection : String, query : JsonObject, update : JsonObject) : JsonObject {
    return awaitResult{
        this.findOneAndUpdate(collection, query, update, it)
    }
}

suspend fun MongoService.findOneAndUpdateWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, findOptions : FindOptions, updateOptions : UpdateOptions) : JsonObject {
    return awaitResult{
        this.findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, it)
    }
}

suspend fun MongoService.findOneAndReplaceAwait(collection : String, query : JsonObject, replace : JsonObject) : JsonObject {
    return awaitResult{
        this.findOneAndReplace(collection, query, replace, it)
    }
}

suspend fun MongoService.findOneAndReplaceWithOptionsAwait(collection : String, query : JsonObject, update : JsonObject, findOptions : FindOptions, updateOptions : UpdateOptions) : JsonObject {
    return awaitResult{
        this.findOneAndReplaceWithOptions(collection, query, update, findOptions, updateOptions, it)
    }
}

suspend fun MongoService.findOneAndDeleteAwait(collection : String, query : JsonObject) : JsonObject {
    return awaitResult{
        this.findOneAndDelete(collection, query, it)
    }
}

suspend fun MongoService.findOneAndDeleteWithOptionsAwait(collection : String, query : JsonObject, findOptions : FindOptions) : JsonObject {
    return awaitResult{
        this.findOneAndDeleteWithOptions(collection, query, findOptions, it)
    }
}

suspend fun MongoService.countAwait(collection : String, query : JsonObject) : Long {
    return awaitResult{
        this.count(collection, query, it)
    }
}

suspend fun MongoService.removeDocumentsAwait(collection : String, query : JsonObject) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocuments(collection, query, it)
    }
}

suspend fun MongoService.removeDocumentsWithOptionsAwait(collection : String, query : JsonObject, writeOption : WriteOption) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocumentsWithOptions(collection, query, writeOption, it)
    }
}

suspend fun MongoService.removeDocumentAwait(collection : String, query : JsonObject) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocument(collection, query, it)
    }
}

suspend fun MongoService.removeDocumentWithOptionsAwait(collection : String, query : JsonObject, writeOption : WriteOption) : MongoClientDeleteResult {
    return awaitResult{
        this.removeDocumentWithOptions(collection, query, writeOption, it)
    }
}

suspend fun MongoService.createCollectionAwait(collectionName : String) : Unit {
    return awaitResult{
        this.createCollection(collectionName, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoService.getCollectionsAwait() : List<String> {
    return awaitResult{
        this.getCollections(it)
    }
}

suspend fun MongoService.dropCollectionAwait(collection : String) : Unit {
    return awaitResult{
        this.dropCollection(collection, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoService.createIndexAwait(collection : String, key : JsonObject) : Unit {
    return awaitResult{
        this.createIndex(collection, key, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoService.createIndexWithOptionsAwait(collection : String, key : JsonObject, options : IndexOptions) : Unit {
    return awaitResult{
        this.createIndexWithOptions(collection, key, options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoService.listIndexesAwait(collection : String) : JsonArray {
    return awaitResult{
        this.listIndexes(collection, it)
    }
}

suspend fun MongoService.dropIndexAwait(collection : String, indexName : String) : Unit {
    return awaitResult{
        this.dropIndex(collection, indexName, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MongoService.runCommandAwait(commandName : String, command : JsonObject) : JsonObject {
    return awaitResult{
        this.runCommand(commandName, command, it)
    }
}

suspend fun MongoService.distinctAwait(collection : String, fieldName : String, resultClassname : String) : JsonArray {
    return awaitResult{
        this.distinct(collection, fieldName, resultClassname, it)
    }
}

suspend fun MongoService.distinctWithQueryAwait(collection : String, fieldName : String, resultClassname : String, query : JsonObject) : JsonArray {
    return awaitResult{
        this.distinctWithQuery(collection, fieldName, resultClassname, query, it)
    }
}

