package io.vertx.kotlin.core

import io.vertx.core.DeploymentOptions
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.VertxOptions
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun clusteredVertxAwait(options : VertxOptions) : Vertx? {
    return awaitResult{
        Vertx.clusteredVertx(options, it)
    }
}

suspend fun Vertx.runOnContextAwait() : Void? {
    return awaitEvent{
        this.runOnContext(it)
    }
}

suspend fun Vertx.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun Vertx.deployVerticleAwait(name : String) : String? {
    return awaitResult{
        this.deployVerticle(name, it)
    }
}

suspend fun Vertx.deployVerticleAwait(name : String, options : DeploymentOptions) : String? {
    return awaitResult{
        this.deployVerticle(name, options, it)
    }
}

suspend fun Vertx.undeployAwait(deploymentID : String) : Void? {
    return awaitResult{
        this.undeploy(deploymentID, it)
    }
}

suspend fun <T> Vertx.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>, ordered : Boolean) : T? {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, ordered, it)
    }
}

suspend fun <T> Vertx.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>) : T? {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, it)
    }
}

suspend fun Vertx.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

