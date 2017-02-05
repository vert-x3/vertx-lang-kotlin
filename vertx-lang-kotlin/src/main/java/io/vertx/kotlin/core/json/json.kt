package io.vertx.kotlin.core.json

import io.vertx.core.json.*

object Json

// JsonObject creation

fun JsonObject(vararg fields: Pair<String, Any?>): JsonObject = JsonObject(linkedMapOf(*fields))
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
