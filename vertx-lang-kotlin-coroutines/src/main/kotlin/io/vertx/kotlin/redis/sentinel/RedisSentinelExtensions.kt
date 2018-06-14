package io.vertx.kotlin.redis.sentinel

import io.vertx.core.json.JsonArray
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.sentinel.RedisSentinel
import kotlin.String

/**
 *  Close the client - when it is fully closed the handler will be called. */
suspend fun RedisSentinel.close() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Show a list of monitored masters and their state */
suspend fun RedisSentinel.masters(): JsonArray {
  return awaitResult { this.masters(it) }
}

/**
 *  Show the state and info of the specified master
 * @param name    master name */
suspend fun RedisSentinel.master(name: String): JsonArray {
  return awaitResult { this.master(name, it) }
}

/**
 *  Show a list of slaves for this master, and their state
 * @param name    master name */
suspend fun RedisSentinel.slaves(name: String): JsonArray {
  return awaitResult { this.slaves(name, it) }
}

/**
 *  Show a list of sentinel instances for this master, and their state
 * @param name    master name */
suspend fun RedisSentinel.sentinels(name: String): JsonArray {
  return awaitResult { this.sentinels(name, it) }
}

/**
 *  Return the ip and port number of the master with that name.
 *  If a failover is in progress or terminated successfully for this master
 *  it returns the address and port of the promoted slave
 * @param name    master name */
suspend fun RedisSentinel.getMasterAddrByName(name: String): JsonArray {
  return awaitResult { this.getMasterAddrByName(name, it) }
}

/**
 *  Reset all the masters with matching name.
 *  The pattern argument is a glob-style pattern.
 *  The reset process clears any previous state in a master (including a failover in pro
 * @param pattern pattern String */
suspend fun RedisSentinel.reset(pattern: String) {
  awaitResult<Void?> { this.reset(pattern, it) }
}

/**
 *  Force a failover as if the master was not reachable, and without asking for agreement to other Sentinels
 *  (however a new version of the configuration will be published so that the other Sentinels
 *  will update their configurations)
 * @param name    master name */
suspend fun RedisSentinel.failover(name: String): String {
  return awaitResult { this.failover(name, it) }
}

/**
 *  Check if the current Sentinel configuration is able to reach the quorum needed to failover a master,
 *  and the majority needed to authorize the failover. This command should be used in monitoring systems
 *  to check if a Sentinel deployment is ok.
 * @param name    master name */
suspend fun RedisSentinel.ckquorum(name: String): String {
  return awaitResult { this.ckquorum(name, it) }
}

/**
 *  Force Sentinel to rewrite its configuration on disk, including the current Sentinel state.
 *  Normally Sentinel rewrites the configuration every time something changes in its state
 *  (in the context of the subset of the state which is persisted on disk across restart).
 *  However sometimes it is possible that the configuration file is lost because of operation errors,
 *  disk failures, package upgrade scripts or configuration managers. In those cases a way to to force Sentinel to
 *  rewrite the configuration file is handy. This command works even if the previous configuration file
 *  is completely missing. */
suspend fun RedisSentinel.flushConfig() {
  awaitResult<Void?> { this.flushConfig(it) }
}
