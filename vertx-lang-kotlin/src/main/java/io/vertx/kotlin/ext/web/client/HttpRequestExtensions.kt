package io.vertx.kotlin.ext.web.client

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.client.HttpRequest
import io.vertx.ext.web.codec.BodyCodec

/**
 * Configure the request to decode the response as a [U].
 *
 * @receiver An [HttpRequest] with [Buffer] response.
 * @param U the class to which the response should be decoded to.
 * @param codec what to use to decode [U]. By default, [BodyCodec.json] is used.
 * @return a reference to the [HttpRequest] with type [U].
 */
inline fun <reified U> HttpRequest<Buffer>.mapTo(
  codec: (Class<U>) -> BodyCodec<U> = { BodyCodec.json(it) }
): HttpRequest<U> = `as`(codec(U::class.java))
