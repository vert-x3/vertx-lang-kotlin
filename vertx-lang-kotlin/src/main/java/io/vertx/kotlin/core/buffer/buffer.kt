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
package io.vertx.kotlin.core.buffer

import io.vertx.core.buffer.*
import io.vertx.kotlin.core.json.Json

/**
 * Appends the specified json {@code block} to the end of this Buffer. The buffer will expand as necessary to accommodate
 * any bytes written.<p>
 *
 * @receiver a Vert.x [Buffer]
 * @param pretty wether or not to pretty format the json output
 * @param block the json producing block to write
 * @return a reference to this, so the API can be used fluently
 */
inline fun Buffer.appendJson(pretty: Boolean = false, block: Json.() -> Any): Buffer =
    block(Json).let { json ->
      if (pretty)
        io.vertx.core.json.Json.encodePrettily(json)
      else
        io.vertx.core.json.Json.encode(json)
    }.let { encoded -> appendString(encoded) }
