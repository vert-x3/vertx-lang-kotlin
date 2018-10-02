package io.vertx.kotlin.redis.sentinel

import io.vertx.core.json.JsonArray
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.sentinel.RedisSentinel

/**
 * Close the client - when it is fully closed the handler will be called.
 *
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Show a list of monitored masters and their state
 *
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.mastersAwait() : JsonArray {
  return awaitResult{
    this.masters(it)
  }
}

/**
 * Show the state and info of the specified master
 *
 * @param name master name
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.masterAwait(name : String) : JsonArray {
  return awaitResult{
    this.master(name, it)
  }
}

/**
 * Show a list of slaves for this master, and their state
 *
 * @param name master name
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.slavesAwait(name : String) : JsonArray {
  return awaitResult{
    this.slaves(name, it)
  }
}

/**
 * Show a list of sentinel instances for this master, and their state
 *
 * @param name master name
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.sentinelsAwait(name : String) : JsonArray {
  return awaitResult{
    this.sentinels(name, it)
  }
}

/**
 * Return the ip and port number of the master with that name.
 * If a failover is in progress or terminated successfully for this master
 * it returns the address and port of the promoted slave
 *
 * @param name master name
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.getMasterAddrByNameAwait(name : String) : JsonArray {
  return awaitResult{
    this.getMasterAddrByName(name, it)
  }
}

/**
 * Reset all the masters with matching name.
 * The pattern argument is a glob-style pattern.
 * The reset process clears any previous state in a master (including a failover in pro
 *
 * @param pattern pattern String
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.resetAwait(pattern : String) : Unit {
  return awaitResult{
    this.reset(pattern, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Force a failover as if the master was not reachable, and without asking for agreement to other Sentinels
 * (however a new version of the configuration will be published so that the other Sentinels
 * will update their configurations)
 *
 * @param name master name
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.failoverAwait(name : String) : String {
  return awaitResult{
    this.failover(name, it)
  }
}

/**
 * Check if the current Sentinel configuration is able to reach the quorum needed to failover a master,
 * and the majority needed to authorize the failover. This command should be used in monitoring systems
 * to check if a Sentinel deployment is ok.
 *
 * @param name master name
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.ckquorumAwait(name : String) : String {
  return awaitResult{
    this.ckquorum(name, it)
  }
}

/**
 * Force Sentinel to rewrite its configuration on disk, including the current Sentinel state.
 * Normally Sentinel rewrites the configuration every time something changes in its state
 * (in the context of the subset of the state which is persisted on disk across restart).
 * However sometimes it is possible that the configuration file is lost because of operation errors,
 * disk failures, package upgrade scripts or configuration managers. In those cases a way to to force Sentinel to
 * rewrite the configuration file is handy. This command works even if the previous configuration file
 * is completely missing.
 *
 * @param handler Handler for the result of this call
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.sentinel.RedisSentinel original] using Vert.x codegen.
 */
suspend fun RedisSentinel.flushConfigAwait() : Unit {
  return awaitResult{
    this.flushConfig({ ar -> it.handle(ar.mapEmpty()) })}
}

