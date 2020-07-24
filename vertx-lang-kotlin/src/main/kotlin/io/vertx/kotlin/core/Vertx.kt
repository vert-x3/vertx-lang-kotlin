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
package io.vertx.kotlin.core

import io.vertx.core.DeploymentOptions
import io.vertx.core.Promise
import io.vertx.core.Verticle
import io.vertx.core.Vertx as VertxVertxAlias
import io.vertx.core.VertxOptions
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Supplier

/**
 * Suspending version of method [io.vertx.core.Vertx.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future that can yield a result ", replaceWith = ReplaceWith("close().await()"))
suspend fun VertxVertxAlias.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.deployVerticle]
 *
 * @param name The identifier
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deployVerticle returning a future that can yield a result ", replaceWith = ReplaceWith("deployVerticle(name).await()"))
suspend fun VertxVertxAlias.deployVerticleAwait(name: String): String {
  return awaitResult {
    this.deployVerticle(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.deployVerticle]
 *
 * @param name the name
 * @param options the deployment options.
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deployVerticle returning a future that can yield a result ", replaceWith = ReplaceWith("deployVerticle(name, options).await()"))
suspend fun VertxVertxAlias.deployVerticleAwait(name: String, options: DeploymentOptions): String {
  return awaitResult {
    this.deployVerticle(name, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.undeploy]
 *
 * @param deploymentID the deployment ID
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use undeploy returning a future that can yield a result ", replaceWith = ReplaceWith("undeploy(deploymentID).await()"))
suspend fun VertxVertxAlias.undeployAwait(deploymentID: String): Unit {
  return awaitResult {
    this.undeploy(deploymentID, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.executeBlocking]
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeBlocking returning a future that can yield a result ", replaceWith = ReplaceWith("executeBlocking(blockingCodeHandler, ordered).await()"))
suspend fun <T> VertxVertxAlias.executeBlockingAwait(blockingCodeHandler: (Promise<T>) -> Unit, ordered: Boolean): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, ordered, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.executeBlocking]
 *
 * @param blockingCodeHandler 
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeBlocking returning a future that can yield a result ", replaceWith = ReplaceWith("executeBlocking(blockingCodeHandler).await()"))
suspend fun <T> VertxVertxAlias.executeBlockingAwait(blockingCodeHandler: (Promise<T>) -> Unit): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.deployVerticle]
 *
 * @param verticle the verticle instance to deploy
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deployVerticle returning a future that can yield a result ", replaceWith = ReplaceWith("deployVerticle(verticle).await()"))
suspend fun VertxVertxAlias.deployVerticleAwait(verticle: Verticle): String {
  return awaitResult {
    this.deployVerticle(verticle, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.deployVerticle]
 *
 * @param verticle the verticle instance to deploy
 * @param options the deployment options.
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deployVerticle returning a future that can yield a result ", replaceWith = ReplaceWith("deployVerticle(verticle, options).await()"))
suspend fun VertxVertxAlias.deployVerticleAwait(verticle: Verticle, options: DeploymentOptions): String {
  return awaitResult {
    this.deployVerticle(verticle, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.Vertx.deployVerticle]
 *
 * @param verticleSupplier 
 * @param options 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deployVerticle returning a future that can yield a result ", replaceWith = ReplaceWith("deployVerticle(verticleSupplier, options).await()"))
suspend fun VertxVertxAlias.deployVerticleAwait(verticleSupplier: Supplier<Verticle>, options: DeploymentOptions): String {
  return awaitResult {
    this.deployVerticle(verticleSupplier, options, it)
  }
}

object Vertx {
  /**
   * Suspending version of method [io.vertx.core.Vertx.clusteredVertx]
   *
   * @param options the options to use
   * @return [VertxVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.core.Vertx] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use clusteredVertx returning a future that can yield a result ", replaceWith = ReplaceWith("clusteredVertx(options).await()"))
  suspend fun clusteredVertxAwait(options: VertxOptions): VertxVertxAlias {
    return awaitResult {
      VertxVertxAlias.clusteredVertx(options, it)
    }
  }

}
