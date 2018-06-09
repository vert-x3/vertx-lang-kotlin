package io.vertx.kotlin.config

import io.vertx.config.ConfigChange
import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ConfigRetriever.getConfigAwait() : JsonObject {
    return awaitResult{
        this.getConfig(it)
    }
}

suspend fun ConfigRetriever.listenAwait() : ConfigChange {
    return awaitEvent{
        this.listen(it)
    }
}

