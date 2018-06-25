package io.vertx.kotlin.redis.sentinel

import io.vertx.core.json.JsonArray
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.sentinel.RedisSentinel

suspend fun RedisSentinel.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisSentinel.mastersAwait() : JsonArray {
    return awaitResult{
        this.masters(it)
    }
}

suspend fun RedisSentinel.masterAwait(name : String) : JsonArray {
    return awaitResult{
        this.master(name, it)
    }
}

suspend fun RedisSentinel.slavesAwait(name : String) : JsonArray {
    return awaitResult{
        this.slaves(name, it)
    }
}

suspend fun RedisSentinel.sentinelsAwait(name : String) : JsonArray {
    return awaitResult{
        this.sentinels(name, it)
    }
}

suspend fun RedisSentinel.getMasterAddrByNameAwait(name : String) : JsonArray {
    return awaitResult{
        this.getMasterAddrByName(name, it)
    }
}

suspend fun RedisSentinel.resetAwait(pattern : String) : Unit {
    return awaitResult{
        this.reset(pattern, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisSentinel.failoverAwait(name : String) : String {
    return awaitResult{
        this.failover(name, it)
    }
}

suspend fun RedisSentinel.ckquorumAwait(name : String) : String {
    return awaitResult{
        this.ckquorum(name, it)
    }
}

suspend fun RedisSentinel.flushConfigAwait() : Unit {
    return awaitResult{
        this.flushConfig({ ar -> it.handle(ar.mapEmpty()) })}
}

