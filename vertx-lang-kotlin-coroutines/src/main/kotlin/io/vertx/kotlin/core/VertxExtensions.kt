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

suspend fun Vertx.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun Vertx.deployVerticle(name: String): String = awaitResult { this.deployVerticle(name, it) }

suspend fun Vertx.deployVerticle(name: String, options: DeploymentOptions): String = awaitResult { this.deployVerticle(name, options, it) }

suspend fun Vertx.undeploy(deploymentID: String) {
  awaitResult<Void?> { this.undeploy(deploymentID, it) }
}

suspend fun <T : Any> Vertx.executeBlocking(blockingCodeHandler: Handler<Future<T>>, ordered: Boolean): T = awaitResult { this.executeBlocking(blockingCodeHandler, ordered, it) }

suspend fun <T : Any> Vertx.executeBlocking(blockingCodeHandler: Handler<Future<T>>): T = awaitResult { this.executeBlocking(blockingCodeHandler, it) }

object VertxExtensions {
  suspend fun clusteredVertx(options: VertxOptions): Vertx = awaitResult { Vertx.clusteredVertx(options, it) }
}
