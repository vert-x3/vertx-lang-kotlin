package io.vertx.kotlin.core

import io.vertx.core.DeploymentOptions
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.VertxOptions
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Boolean
import kotlin.String

/**
 *  Like [Vertx.close] but the completionHandler will be called when the close is complete */
suspend fun Vertx.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Like [Vertx.deployVerticle] but the completionHandler will be notified when the deployment is complete.
 *  <p>
 *  If the deployment is successful the result will contain a String representing the unique deployment ID of the
 *  deployment.
 *  <p>
 *  This deployment ID can subsequently be used to undeploy the verticle.
 * @param name  The identifier */
suspend fun Vertx.deployVerticleSuspending(name: String): String {
  return awaitResult { this.deployVerticle(name, it) }
}

/**
 *  Like [Vertx.deployVerticle] but [io.vertx.core.DeploymentOptions] are provided to configure the
 *  deployment.
 * @param name  the name
 * @param options  the deployment options. */
suspend fun Vertx.deployVerticleSuspending(name: String, options: DeploymentOptions): String {
  return awaitResult { this.deployVerticle(name, options, it) }
}

/**
 *  Like [Vertx.undeploy ] but the completionHandler will be notified when the undeployment is complete.
 * @param deploymentID  the deployment ID */
suspend fun Vertx.undeploySuspending(deploymentID: String) {
  awaitResult<Void?> { this.undeploy(deploymentID, it) }
}

/**
 *  Safely execute some blocking code.
 *  <p>
 *  Executes the blocking code in the handler `blockingCodeHandler` using a thread from the worker pool.
 *  <p>
 *  When the code is complete the handler `resultHandler` will be called with the result on the original context
 *  (e.g. on the original event loop of the caller).
 *  <p>
 *  A `Future` instance is passed into `blockingCodeHandler`. When the blocking code successfully completes,
 *  the handler should call the [Future.complete] or [Future.complete] method, or the [Future.fail]
 *  method if it failed.
 *  <p>
 *  In the `blockingCodeHandler` the current context remains the original context and therefore any task
 *  scheduled in the `blockingCodeHandler` will be executed on the this context and not on the worker thread.
 * @param blockingCodeHandler  handler representing the blocking code to run
 * @param ordered  if true then if executeBlocking is called several times on the same context, the executions
 *                  for that context will be executed serially, not in parallel. if false then they will be no ordering
 *                  guarantees
 * @param <T> the type of the result
 */
suspend fun <T : Any> Vertx.executeBlocking(blockingCodeHandler: Handler<Future<T>>, ordered: Boolean): T {
  return awaitResult { this.executeBlocking(blockingCodeHandler, ordered, it) }
}

/**
 *  Like [Vertx.executeBlocking] called with ordered = true.
 */
suspend fun <T : Any> Vertx.executeBlocking(blockingCodeHandler: Handler<Future<T>>): T {
  return awaitResult { this.executeBlocking(blockingCodeHandler, it) }
}

object VertxExtensions {
 /**
  *  Creates a clustered instance using the specified options.
  *  <p>
  *  The instance is created asynchronously and the resultHandler is called with the result when it is ready.
  * @param options  the options to use */
 suspend fun clusteredVertx(options: VertxOptions): Vertx {
   return awaitResult { Vertx.clusteredVertx(options, it) }
 }
}
