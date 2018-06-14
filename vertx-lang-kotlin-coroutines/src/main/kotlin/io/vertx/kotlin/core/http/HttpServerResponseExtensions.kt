package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Long
import kotlin.String

/**
 *  Like [HttpServerResponse.sendFile] but providing a handler which will be notified once the file has been completely
 *  written to the wire.
 * @param filename path to the file to serve
 * @return a reference to this, so the API can be used fluently
 */
suspend fun HttpServerResponse.sendFileSuspending(filename: String) {
  awaitResult<Void?> { this.sendFile(filename, it) }
}

/**
 *  Like [HttpServerResponse.sendFile] but providing a handler which will be notified once the file has been completely
 *  written to the wire.
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @return a reference to this, so the API can be used fluently
 */
suspend fun HttpServerResponse.sendFileSuspending(filename: String, offset: Long) {
  awaitResult<Void?> { this.sendFile(filename, offset, it) }
}

/**
 *  Like [HttpServerResponse.sendFile] but providing a handler which will be notified once the file has been
 *  completely written to the wire.
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @param length the length to serve to
 * @return a reference to this, so the API can be used fluently
 */
suspend fun HttpServerResponse.sendFileSuspending(
  filename: String,
  offset: Long,
  length: Long
) {
  awaitResult<Void?> { this.sendFile(filename, offset, length, it) }
}

/**
 *  Like [HttpServerResponse.push] with the host copied from the current request.
 */
suspend fun HttpServerResponse.push(method: HttpMethod, path: String): HttpServerResponse {
  return awaitResult { this.push(method, path, it) }
}

/**
 *  Push a response to the client.<p/>
 *  The `handler` will be notified with a <i>success</i> when the push can be sent and with
 *  a <i>failure</i> when the client has disabled push or reset the push before it has been sent.<p/>
 *
 *  The `handler` may be queued if the client has reduced the maximum number of streams the server can push
 *  concurrently.<p/>
 *
 *  Push can be sent only for peer initiated streams and if the response is not ended.
 *
 * @param method the method of the promised request
 * @param host the host of the promised request
 * @param path the path of the promised request
 * @param headers the headers of the promised request
 * @return a reference to this, so the API can be used fluently
 */
suspend fun HttpServerResponse.push(
  method: HttpMethod,
  host: String,
  path: String,
  headers: MultiMap
): HttpServerResponse {
  return awaitResult { this.push(method, host, path, headers, it) }
}
