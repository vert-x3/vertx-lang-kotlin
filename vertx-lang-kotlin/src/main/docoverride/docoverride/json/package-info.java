/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

/**
 *
 * == JSON
 *
 * Unlike some other languages, Java does not have first class support for http://json.org/[JSON] so we provide
 * two classes to make handling JSON in your Vert.x applications a bit easier.
 *
 * Use the {@link io.vertx.core.json.JsonObject} class to represent JSON objects and the {@link io.vertx.core.json.JsonArray}
 * class to represent JSON arrays, you can refer to the Java documentation for more details.
 *
 * === Builders
 *
 * Builders are provided to provide a more fluent JSON construction:
 *
 * [source, kotlin]
 * ----
 * // The json builder declares a JSON structure
 * val result = json {
 *
 *   // in this structure the obj function can be used
 *
 *   // takes a vararg of Kotlin pairs
 *   obj(
 *     "key_1" to 1,
 *     "key_2" to 2,
 *     "key_3" to 3
 *   )
 *
 *   // or an iterable of Kotlin pairs
 *   obj((1..3).map { "key_$it" to it })
 *
 *   // or a Map<String, Any?>
 *   obj(someMap)
 *
 *   // apply function on object receiver
 *   obj {
 *     for (i in 1..3) {
 *       put("key_$i", i)
 *     }
 *   }
 * }
 * ----
 *
 * You can also build JSON arrays:
 *
 * [source, kotlin]
 * ----
 * // The json builder declares a JSON structure
 * val result = json {
 *
 *   // in this structure the array function can be used
 *
 *   // takes a vararg of values
 *   array("1", "2", "3")
 *
 *   // or an iterable of values
 *   array((1..3).map { "$it" })
 *
 *   // apply function on array receiver
 *   array {
 *     for (i in 1..3) {
 *       add("$i")
 *     }
 *   }
 * }
 * ----
 *
 * Of course it is possible to mix objects and arrays
 *
 * [source, kotlin]
 * ----
 * // The json builder declares a JSON structure
 * val result = json {
 *   "firstName" to "Dale",
 *   "lastName" to "Cooper",
 *   "age" to 64,
 *   "names" to array("Dale", "Bartholomew")
 * }
 * ----
 *
 * === Postscript operator overloading
 *
 * The Kotlin postscript operator is overloaded for JSON object and array:
 *
 * [source, kotlin]
 * ----
 * print(someObject["firstName"]);
 * print(someArray[4]);
 * ----
 *
 */
@Document(fileName = "override/json.adoc")
package docoverride.json;

import io.vertx.docgen.Document;
