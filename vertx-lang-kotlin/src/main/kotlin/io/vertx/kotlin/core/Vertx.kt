package io.vertx.kotlin.core

import io.vertx.core.DeploymentOptions
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx as VertxVertxAlias
import io.vertx.core.VertxOptions
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun VertxVertxAlias.runOnContextAwait() : Unit {
    return awaitEvent{
        this.runOnContext({ v -> it.handle(null) })}
}

suspend fun VertxVertxAlias.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun VertxVertxAlias.deployVerticleAwait(name : String) : String {
    return awaitResult{
        this.deployVerticle(name, it)
    }
}

suspend fun VertxVertxAlias.deployVerticleAwait(name : String, options : DeploymentOptions) : String {
    return awaitResult{
        this.deployVerticle(name, options, it)
    }
}

suspend fun VertxVertxAlias.undeployAwait(deploymentID : String) : Unit {
    return awaitResult{
        this.undeploy(deploymentID, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <T> VertxVertxAlias.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>, ordered : Boolean) : T {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, ordered, it)
    }
}

suspend fun <T> VertxVertxAlias.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>) : T {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, it)
    }
}

suspend fun VertxVertxAlias.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

object Vertx {
    suspend fun clusteredVertxAwait(options : VertxOptions) : VertxVertxAlias {
        return awaitResult{
            VertxVertxAlias.clusteredVertx(options, it)
        }
    }

}
