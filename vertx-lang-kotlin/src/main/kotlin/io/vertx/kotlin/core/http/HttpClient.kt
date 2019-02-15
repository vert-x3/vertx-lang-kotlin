package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.RequestOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.getNow(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.getNow(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.getNow(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.getNow(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.headNow(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.headNow(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.headNow(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.headNow(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.optionsNow(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.optionsNow(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.optionsNow(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.optionsNow(requestURI, it)
  }
}

