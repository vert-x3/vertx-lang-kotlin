package io.vertx.kotlin.core

import io.vertx.core.DeploymentOptions
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx as VertxVertxAlias
import io.vertx.core.VertxOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like [io.vertx.core.Vertx] but the completionHandler will be called when the close is complete
 *
 * @param completionHandler The handler will be notified when the close is complete.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
suspend fun VertxVertxAlias.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.Vertx] but the completionHandler will be notified when the deployment is complete.
 * <p>
 * If the deployment is successful the result will contain a String representing the unique deployment ID of the
 * deployment.
 * <p>
 * This deployment ID can subsequently be used to undeploy the verticle.
 *
 * @param name The identifier
 * @param completionHandler a handler which will be notified when the deployment is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
suspend fun VertxVertxAlias.deployVerticleAwait(name : String) : String {
  return awaitResult{
    this.deployVerticle(name, it)
  }
}

/**
 * Like [io.vertx.core.Vertx] but [io.vertx.core.DeploymentOptions] are provided to configure the
 * deployment.
 *
 * @param name the name
 * @param options the deployment options.
 * @param completionHandler a handler which will be notified when the deployment is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
suspend fun VertxVertxAlias.deployVerticleAwait(name : String, options : DeploymentOptions) : String {
  return awaitResult{
    this.deployVerticle(name, options, it)
  }
}

/**
 * Like [io.vertx.core.Vertx][#undeploy(String)][io.vertx.core.Vertx] but the completionHandler will be notified when the undeployment is complete.
 *
 * @param deploymentID the deployment ID
 * @param completionHandler a handler which will be notified when the undeployment is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
suspend fun VertxVertxAlias.undeployAwait(deploymentID : String) : Unit {
  return awaitResult{
    this.undeploy(deploymentID, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Safely execute some blocking code.
 * <p>
 * Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.
 * <p>
 * When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context
 * (e.g. on the original event loop of the caller).
 * <p>
 * A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,
 * the handler should call the [io.vertx.core.Future] or [io.vertx.core.Future] method, or the [io.vertx.core.Future]
 * method if it failed.
 * <p>
 * In the <code>blockingCodeHandler</code> the current context remains the original context and therefore any task
 * scheduled in the <code>blockingCodeHandler</code> will be executed on the this context and not on the worker thread.
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
 * @param resultHandler handler that will be called when the blocking code is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
suspend fun <T> VertxVertxAlias.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>, ordered : Boolean) : T? {
  return awaitResult{
    this.executeBlocking(blockingCodeHandler, ordered, it)
  }
}

/**
 * Like [io.vertx.core.Vertx] called with ordered = true.
 *
 * @param blockingCodeHandler 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
suspend fun <T> VertxVertxAlias.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>) : T? {
  return awaitResult{
    this.executeBlocking(blockingCodeHandler, it)
  }
}

object Vertx {
/**
 * Creates a clustered instance using the specified options.
 * <p>
 * The instance is created asynchronously and the resultHandler is called with the result when it is ready.
 *
 * @param options the options to use
 * @param resultHandler the result handler that will receive the result
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Vertx original] using Vert.x codegen.
 */
  suspend fun clusteredVertxAwait(options : VertxOptions) : VertxVertxAlias {
    return awaitResult{
      VertxVertxAlias.clusteredVertx(options, it)
    }
  }

}
