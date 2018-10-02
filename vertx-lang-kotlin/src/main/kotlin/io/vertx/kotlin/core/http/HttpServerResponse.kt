package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like [io.vertx.core.http.HttpServerResponse] but providing a handler which will be notified once the file has been completely
 * written to the wire.
 *
 * @param filename path to the file to serve
 * @param resultHandler handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename : String) : Unit {
  return awaitResult{
    this.sendFile(filename, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] but providing a handler which will be notified once the file has been completely
 * written to the wire.
 *
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @param resultHandler handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] but providing a handler which will be notified once the file has been
 * completely written to the wire.
 *
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @param length the length to serve to
 * @param resultHandler handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] with no headers.
 *
 * @param method 
 * @param host 
 * @param path 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method : HttpMethod, host : String, path : String) : HttpServerResponse {
  return awaitResult{
    this.push(method, host, path, it)
  }
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] with the host copied from the current request.
 *
 * @param method 
 * @param path 
 * @param headers 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method : HttpMethod, path : String, headers : MultiMap) : HttpServerResponse {
  return awaitResult{
    this.push(method, path, headers, it)
  }
}

/**
 * Like [io.vertx.core.http.HttpServerResponse] with the host copied from the current request.
 *
 * @param method 
 * @param path 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method : HttpMethod, path : String) : HttpServerResponse {
  return awaitResult{
    this.push(method, path, it)
  }
}

/**
 * Push a response to the client.<p/>
 *
 * The <code>handler</code> will be notified with a <i>success</i> when the push can be sent and with
 * a <i>failure</i> when the client has disabled push or reset the push before it has been sent.<p/>
 *
 * The <code>handler</code> may be queued if the client has reduced the maximum number of streams the server can push
 * concurrently.<p/>
 *
 * Push can be sent only for peer initiated streams and if the response is not ended.
 *
 * @param method the method of the promised request
 * @param host the host of the promised request
 * @param path the path of the promised request
 * @param headers the headers of the promised request
 * @param handler the handler notified when the response can be written
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServerResponse original] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method : HttpMethod, host : String, path : String, headers : MultiMap) : HttpServerResponse {
  return awaitResult{
    this.push(method, host, path, headers, it)
  }
}

