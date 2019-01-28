package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.RequestOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Sends an HTTP GET request to the server with the specified options, specifying a response handler to receive
 * the response
 *
 * @param options the request options
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(options : RequestOptions) : HttpClientResponse {
  return awaitResult{
    this.getNow(options, it)
  }
}

/**
 * Sends an HTTP GET request to the server at the specified host and port, specifying a response handler to receive
 * the response
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.getNow(port, host, requestURI, it)
  }
}

/**
 * Sends an HTTP GET request to the server at the specified host and default port, specifying a response handler to receive
 * the response
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(host : String, requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.getNow(host, requestURI, it)
  }
}

/**
 * Sends an HTTP GET request  to the server at the default host and port, specifying a response handler to receive
 * the response
 *
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.getNow(requestURI, it)
  }
}

/**
 * Sends an HTTP HEAD request to the server with the specified options, specifying a response handler to receive
 * the response
 *
 * @param options the request options
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(options : RequestOptions) : HttpClientResponse {
  return awaitResult{
    this.headNow(options, it)
  }
}

/**
 * Sends an HTTP HEAD request to the server at the specified host and port, specifying a response handler to receive
 * the response
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.headNow(port, host, requestURI, it)
  }
}

/**
 * Sends an HTTP HEAD request to the server at the specified host and default port, specifying a response handler to receive
 * the response
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(host : String, requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.headNow(host, requestURI, it)
  }
}

/**
 * Sends an HTTP HEAD request  to the server at the default host and port, specifying a response handler to receive
 * the response
 *
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.headNow(requestURI, it)
  }
}

/**
 * Sends an HTTP OPTIONS request to the server with the specified options, specifying a response handler to receive
 * the response
 *
 * @param options the request options
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(options : RequestOptions) : HttpClientResponse {
  return awaitResult{
    this.optionsNow(options, it)
  }
}

/**
 * Sends an HTTP OPTIONS request to the server at the specified host and port, specifying a response handler to receive
 * the response
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.optionsNow(port, host, requestURI, it)
  }
}

/**
 * Sends an HTTP OPTIONS request to the server at the specified host and default port, specifying a response handler to receive
 * the response
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(host : String, requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.optionsNow(host, requestURI, it)
  }
}

/**
 * Sends an HTTP OPTIONS request  to the server at the default host and port, specifying a response handler to receive
 * the response
 *
 * @param requestURI the relative URI
 * @param responseHandler the response handler
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpClient original] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(requestURI : String) : HttpClientResponse {
  return awaitResult{
    this.optionsNow(requestURI, it)
  }
}

