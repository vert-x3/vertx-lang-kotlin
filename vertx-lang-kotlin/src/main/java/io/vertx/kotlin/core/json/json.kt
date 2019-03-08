/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.json

import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.Base64

object Json

/**
 * A function providing a DSL for building [io.vertx.core.json.JsonObject]
 *
 * @param fields key:value pairs to create the instance
 * @return [JsonObject]
 */
fun jsonObjectOf(vararg fields: Pair<String, Any?>): JsonObject {
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

/**
 * A function providing a DSL for building [io.vertx.core.json.JsonObject]
 *
 * @param fields key:value pairs to create the instance
 * @return [JsonObject]
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jsonObjectOf(*fields)")
)
fun JsonObject(vararg fields: Pair<String, Any?>): JsonObject {
  return jsonObjectOf(*fields)
}

/**
 * A function providing a DSL for building [io.vertx.core.json.JsonArray]
 *
 * @param values objects that should be part of the array
 * @return [JsonArray]
 */
fun jsonArrayOf(vararg values: Any?): JsonArray = io.vertx.core.json.JsonArray(arrayListOf(*values))

/**
 * A function providing a DSL for building [io.vertx.core.json.JsonArray]
 *
 * @param values objects that should be part of the array
 * @return [JsonArray]
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jsonArrayOf(*values)")
)
fun JsonArray(vararg values: Any?): JsonArray = jsonArrayOf(*values)

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
fun Json.obj(vararg fields: Pair<String, Any?>): JsonObject = jsonObjectOf(*fields)

/**
 * A [io.vertx.core.json.JsonArray] builder from a varargs of values, i.e a varargs of `Any?`
 *
 * @param values the varargs of json values
 * @return a [io.vertx.core.json.JsonArray]
 */
fun Json.array(vararg values: Any?): JsonArray = jsonArrayOf(*values)

/**
 * A [io.vertx.core.json.JsonObject] builder from an [Iterable] of fields, i.e an [Iterable] of `Pair<String, Any?>`
 *
 * @param fields the [Iterable] of json fields
 * @return a [io.vertx.core.json.JsonObject]
 */
fun Json.obj(fields: Iterable<Pair<String, Any?>>): JsonObject = jsonObjectOf(*fields.toList().toTypedArray())

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
 * @param values the [Iterable] of json values
 * @return a [io.vertx.core.json.JsonArray]
 */
fun Json.array(values: Iterable<Any?>): JsonArray = jsonArrayOf(*values.toList().toTypedArray())

/**
 * A function for applying a block onto a [io.vertx.core.json.JsonObject].
 */
fun Json.obj(block: JsonObject.() -> Unit): JsonObject = jsonObjectOf().apply(block)

/**
 * A function for applying a block onto a [io.vertx.core.json.JsonArray].
 */
fun Json.array(block: JsonArray.() -> Unit): JsonArray = jsonArrayOf().apply(block)

// Those are needed for avoid inference mismatch
fun Json.array(value: JsonObject): JsonArray = jsonArrayOf(value)
fun Json.array(value: JsonArray): JsonArray = jsonArrayOf(value)

/**
 * The postscript operator for [JsonObject].
 */
@Suppress("UNCHECKED_CAST") operator fun <T> JsonObject.get(key: String): T = getValue(key) as T

/**
 * The postscript operator for [JsonArray].
 */
@Suppress("UNCHECKED_CAST") operator fun <T> JsonArray.get(index: Int): T = getValue(index) as T
