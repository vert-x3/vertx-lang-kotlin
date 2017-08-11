package io.vertx.kotlin.coroutines

import io.vertx.core.*

/**
 * Created by stream.
 */

interface ReturnedInterface {
  fun methodWithParamsAndHandlerNoReturn(foo: String, bar: Long, resultHandler: Handler<AsyncResult<String>>)
}

interface AsyncInterface {

  // Non Handler<AsyncResult<>> methods
  fun someMethod(foo: String, bar: Long): String

  // Methods with Handler<AsyncResult<>>
  fun methodWithParamsAndHandlerNoReturn(foo: String, bar: Long, resultHandler: Handler<AsyncResult<String>>)

  fun methodWithNoParamsAndHandlerNoReturn(resultHandler: Handler<AsyncResult<String>>)

  fun methodWithParamsAndHandlerWithReturn(foo: String, bar: Long, resultHandler: Handler<AsyncResult<String>>): String

  fun methodWithNoParamsAndHandlerWithReturn(resultHandler: Handler<AsyncResult<String>>): String

  fun methodWithParamsAndHandlerInterface(foo: String, bar: Long, resultHandler: Handler<AsyncResult<ReturnedInterface>>)

  fun methodThatFails(foo: String, resultHandler: Handler<AsyncResult<String>>)

  fun methodWithNoParamsAndHandlerWithReturnTimeout(resultHandler: Handler<AsyncResult<String?>>, timeout: Long): String
}

class ReturnedInterfaceImpl(private val vertx: Vertx) : ReturnedInterface {
  override fun methodWithParamsAndHandlerNoReturn(foo: String, bar: Long, resultHandler: Handler<AsyncResult<String>>) {
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture(foo + bar)) }
  }
}

class AsyncInterfaceImpl(private val vertx: Vertx) : AsyncInterface {

  override fun someMethod(foo: String, bar: Long): String {
    return foo + bar
  }

  override fun methodWithParamsAndHandlerNoReturn(foo: String, bar: Long, resultHandler: Handler<AsyncResult<String>>) {
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture(foo + bar)) }
  }

  override fun methodWithNoParamsAndHandlerNoReturn(resultHandler: Handler<AsyncResult<String>>) {
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture("wibble")) }
  }

  override fun methodWithParamsAndHandlerWithReturn(foo: String, bar: Long, resultHandler: Handler<AsyncResult<String>>): String {
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture(foo + bar)) }
    return "ooble"
  }

  override fun methodWithNoParamsAndHandlerWithReturn(resultHandler: Handler<AsyncResult<String>>): String {
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture("wibble")) }
    return "flooble"
  }

  override fun methodWithParamsAndHandlerInterface(foo: String, bar: Long, resultHandler: Handler<AsyncResult<ReturnedInterface>>) {
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture(ReturnedInterfaceImpl(vertx))) }
  }

  override fun methodThatFails(foo: String, resultHandler: Handler<AsyncResult<String>>) {
    vertx.runOnContext { resultHandler.handle(Future.failedFuture<String>(VertxException(foo))) }
  }

  override fun methodWithNoParamsAndHandlerWithReturnTimeout(resultHandler: Handler<AsyncResult<String?>>, timeout: Long): String {
    try {
      Thread.sleep(timeout)
    } catch (e: InterruptedException) {
      //
    }
    vertx.runOnContext { resultHandler.handle(Future.succeededFuture("wibble")) }
    return "flooble"
  }
}
