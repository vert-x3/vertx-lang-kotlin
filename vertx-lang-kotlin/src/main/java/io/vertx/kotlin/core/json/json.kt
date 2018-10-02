package io.vertx.kotlin.core.json

import io.vertx.core.json.*
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.*

object Json

// JsonObject creation

fun JsonObject(vararg fields: Pair<String, Any?>): JsonObject {
    val processedCases = fields.map {
        when {
            // @See io.vertx.core.json.JsonObject.put(java.lang.String, java.time.Instant)
            it.second is Instant -> return@map (Pair(it.first, DateTimeFormatter.ISO_INSTANT.format(it.second as Instant)))
            // @See   io.vertx.core.json.JsonObject.put(java.lang.String, byte[])
            it.second is ByteArray -> return@map(Pair(it.first, Base64.getEncoder().encodeToString(it.second as ByteArray)))
            else -> return@map it
        }

    }.toTypedArray()

    return JsonObject(linkedMapOf(*processedCases))
}

fun JsonArray(vararg values: Any?): JsonArray = io.vertx.core.json.JsonArray(arrayListOf(*values))

/**
 * The json builder for creating [io.vertx.core.json.JsonObject] or [io.vertx.core.json.JsonArray]
 *
 * @param block the json building block
 * @return a JSON object or array returned by the building block
 */
inline fun <T> json(block: Json.() -> T): T = Json.block()

/**
 * A [io.vertx.core.json.JsonObject] builder from a varargs of fields, i.e a varargs of `Pair<String, Any?>`
 *
 * @param fields the varargs of json fields
 * @return a [io.vertx.core.json.JsonObject]
 */
fun Json.obj(vararg fields: Pair<String, Any?>): JsonObject = JsonObject(*fields)

/**
 * A [io.vertx.core.json.JsonArray] builder from a varargs of values, i.e a varargs of `Any?`
 *
 * @param fields the varargs of json values
 * @return a [io.vertx.core.json.JsonArray]
 */
fun Json.array(vararg values: Any?): JsonArray = JsonArray(*values)

/**
 * A [io.vertx.core.json.JsonObject] builder from an [Iterable] of fields, i.e an [Iterable] of `Pair<String, Any?>`
 *
 * @param fields the [Iterable] of json fields
 * @return a [io.vertx.core.json.JsonObject]
 */
fun Json.obj(fields: Iterable<Pair<String, Any?>>): JsonObject = JsonObject(*fields.toList().toTypedArray())

/**
 * A [io.vertx.core.json.JsonObject] builder from an [Map] of fields, i.e a `Map<String, Any?>`
 *
 * @param fields the [Map] of json fields
 * @return a [io.vertx.core.json.JsonObject]
 */
fun Json.obj(fields: Map<String, Any?>): JsonObject = JsonObject(fields)

/**
 * A [io.vertx.core.json.JsonArray] builder from an [Iterable] of values, i.e an [Iterable] of `Any?`
 *
 * @param fields the [Iterable] of json values
 * @return a [io.vertx.core.json.JsonArray]
 */
fun Json.array(values: Iterable<Any?>): JsonArray = JsonArray(*values.toList().toTypedArray())

/**
 * A function for applying a block onto a [io.vertx.core.json.JsonObject].
 */
fun Json.obj(block: JsonObject.() -> Unit): JsonObject = JsonObject().apply(block)

/**
 * A function for applying a block onto a [io.vertx.core.json.JsonArray].
 */
fun Json.array(block: JsonArray.() -> Unit): JsonArray = JsonArray().apply(block)

// Those are needed for avoid inference mismatch
fun Json.array(value: JsonObject): JsonArray = JsonArray(value)
fun Json.array(value: JsonArray): JsonArray = JsonArray(value)

/**
 * The postscript operator for [JsonObject].
 */
@Suppress("UNCHECKED_CAST") operator fun <T> JsonObject.get(key: String): T = getValue(key) as T

/**
 * The postscript operator for [JsonArray].
 */
@Suppress("UNCHECKED_CAST") operator fun <T> JsonArray.get(index: Int): T = getValue(index) as T
