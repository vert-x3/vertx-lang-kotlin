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

fun Json.obj(vararg fields: Pair<String, Any?>): JsonObject = JsonObject(*fields)
fun Json.obj(fields: Iterable<Pair<String, Any?>>): JsonObject = JsonObject(*fields.toList().toTypedArray())
fun Json.obj(fields: Map<String, Any?>): JsonObject = JsonObject(fields)
fun Json.obj(block: JsonObject.() -> Unit): JsonObject = JsonObject().apply(block)

// JsonArray creation

fun JsonArray(vararg values: Any?): JsonArray = io.vertx.core.json.JsonArray(arrayListOf(*values))
fun Json.array(vararg values: Any?): JsonArray = JsonArray(*values)
fun Json.array(values: Iterable<Any?>): JsonArray = JsonArray(*values.toList().toTypedArray())
fun Json.array(value: JsonObject): JsonArray = JsonArray(value)
fun Json.array(value: JsonArray): JsonArray = JsonArray(value)
fun Json.array(values: List<Any?>): JsonArray = io.vertx.core.json.JsonArray(values)
fun Json.array(block: JsonArray.() -> Unit): JsonArray = JsonArray().apply(block)

inline fun <T> json(block: Json.() -> T): T = Json.block()

/**
 * The postscript operator for [JsonObject].
 */
@Suppress("UNCHECKED_CAST") operator fun <T> JsonObject.get(key: String): T = getValue(key) as T

/**
 * The postscript operator for [JsonArray].
 */
@Suppress("UNCHECKED_CAST") operator fun <T> JsonArray.get(index: Int): T = getValue(index) as T
