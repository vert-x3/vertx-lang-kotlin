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
package io.vertx.kotlin.core.streams

import io.vertx.core.buffer.*
import io.vertx.core.streams.*
import io.vertx.kotlin.core.json.Json
import io.vertx.kotlin.core.buffer.*

/**
 * Encode an object to json and write it to the write stream.
 *
 * @receiver a Vert.x [WriteStream] of [Buffer]
 * @param pretty wether or not to pretty format the json output
 * @param block the json producing block to use
 * @return a reference to this, so the API can be used fluently
 */
inline fun <S : WriteStream<Buffer>> S.write(pretty: Boolean = false, block: Json.() -> Any): S {
  write(Buffer.buffer().appendJson(pretty, block))
  return this
}

/**
 * End the stream with an object encoded to json.
 *
 * @receiver a Vert.x [WriteStream] of [Buffer]
 * @param pretty wether or not to pretty format the json output
 * @param block the json producing block to use
 * @return a reference to this, so the API can be used fluently
 */
inline fun <S : WriteStream<Buffer>> S.end(pretty: Boolean = false, block: Json.() -> Any): S {
  end(Buffer.buffer().appendJson(pretty, block))
  return this
}
