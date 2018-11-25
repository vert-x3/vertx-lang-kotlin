package io.vertx.kotlin.core.web

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.client.HttpRequest
import io.vertx.ext.web.codec.BodyCodec

/**
 * Configure the request to decode the response as a [U].
 *
 * @receiver An [HttpRequest] with [Buffer] response.
 * @param U The class to which the response should be decoded to.
 * @return a reference to the [HttpRequest] with type [U].
 */
inline fun <reified U> HttpRequest<Buffer>.like(): HttpRequest<U> = `as`(BodyCodec.json(U::class.java))
