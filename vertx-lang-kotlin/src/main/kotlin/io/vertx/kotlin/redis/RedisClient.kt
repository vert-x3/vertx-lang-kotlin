package io.vertx.kotlin.redis

import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.RedisClient
import io.vertx.redis.Script
import io.vertx.redis.op.AggregateOptions
import io.vertx.redis.op.BitFieldOptions
import io.vertx.redis.op.BitFieldOverflowOptions
import io.vertx.redis.op.BitOperation
import io.vertx.redis.op.ClientReplyOptions
import io.vertx.redis.op.FailoverOptions
import io.vertx.redis.op.GeoMember
import io.vertx.redis.op.GeoRadiusOptions
import io.vertx.redis.op.GeoUnit
import io.vertx.redis.op.InsertOptions
import io.vertx.redis.op.KillFilter
import io.vertx.redis.op.LimitOptions
import io.vertx.redis.op.MigrateOptions
import io.vertx.redis.op.ObjectCmd
import io.vertx.redis.op.RangeLimitOptions
import io.vertx.redis.op.RangeOptions
import io.vertx.redis.op.ResetOptions
import io.vertx.redis.op.ScanOptions
import io.vertx.redis.op.ScriptDebugOptions
import io.vertx.redis.op.SetOptions
import io.vertx.redis.op.SlotCmd
import io.vertx.redis.op.SortOptions

/**
 * Suspending version of method [io.vertx.redis.RedisClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.append]
 *
 * @param key Key string
 * @param value Value to append
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.appendAwait(key: String, value: String): Long {
  return awaitResult {
    this.append(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.auth]
 *
 * @param password Password for authentication
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.authAwait(password: String): String {
  return awaitResult {
    this.auth(password, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bgrewriteaof]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bgrewriteaofAwait(): String {
  return awaitResult {
    this.bgrewriteaof(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bgsave]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bgsaveAwait(): String {
  return awaitResult {
    this.bgsave(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitcount]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitcountAwait(key: String): Long {
  return awaitResult {
    this.bitcount(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitcountRange]
 *
 * @param key Key string
 * @param start Start index
 * @param end End index
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitcountRangeAwait(key: String, start: Long, end: Long): Long {
  return awaitResult {
    this.bitcountRange(key, start, end, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitop]
 *
 * @param operation Bitwise operation to perform
 * @param destkey Destination key where result is stored
 * @param keys List of keys on which to perform the operation
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitopAwait(operation: BitOperation, destkey: String, keys: List<String>): Long {
  return awaitResult {
    this.bitop(operation, destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitpos]
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitposAwait(key: String, bit: Int): Long {
  return awaitResult {
    this.bitpos(key, bit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitposFrom]
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitposFromAwait(key: String, bit: Int, start: Int): Long {
  return awaitResult {
    this.bitposFrom(key, bit, start, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitposRange]
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @param stop End offset - inclusive
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitposRangeAwait(key: String, bit: Int, start: Int, stop: Int): Long {
  return awaitResult {
    this.bitposRange(key, bit, start, stop, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.blpop]
 *
 * @param key Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.blpopAwait(key: String, seconds: Int): JsonArray {
  return awaitResult {
    this.blpop(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.blpopMany]
 *
 * @param keys List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.blpopManyAwait(keys: List<String>, seconds: Int): JsonArray {
  return awaitResult {
    this.blpopMany(keys, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.brpop]
 *
 * @param key Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.brpopAwait(key: String, seconds: Int): JsonArray {
  return awaitResult {
    this.brpop(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.brpopMany]
 *
 * @param keys List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.brpopManyAwait(keys: List<String>, seconds: Int): JsonArray {
  return awaitResult {
    this.brpopMany(keys, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.brpoplpush]
 *
 * @param key Key string identifying the source list
 * @param destkey Key string identifying the destination list
 * @param seconds Timeout in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.brpoplpushAwait(key: String, destkey: String, seconds: Int): String {
  return awaitResult {
    this.brpoplpush(key, destkey, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clientKill]
 *
 * @param filter Filter options
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clientKillAwait(filter: KillFilter): Long {
  return awaitResult {
    this.clientKill(filter, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clientList]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clientListAwait(): String {
  return awaitResult {
    this.clientList(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clientGetname]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clientGetnameAwait(): String {
  return awaitResult {
    this.clientGetname(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clientPause]
 *
 * @param millis Pause time in milliseconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clientPauseAwait(millis: Long): String {
  return awaitResult {
    this.clientPause(millis, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clientSetname]
 *
 * @param name New name for current connection
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clientSetnameAwait(name: String): String {
  return awaitResult {
    this.clientSetname(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterAddslots]
 *
 * @param slots 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterAddslotsAwait(slots: List<Long>): Unit {
  return awaitResult {
    this.clusterAddslots(slots) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterCountFailureReports]
 *
 * @param nodeId 
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterCountFailureReportsAwait(nodeId: String): Long {
  return awaitResult {
    this.clusterCountFailureReports(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterCountkeysinslot]
 *
 * @param slot 
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterCountkeysinslotAwait(slot: Long): Long {
  return awaitResult {
    this.clusterCountkeysinslot(slot, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterDelslots]
 *
 * @param slot 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterDelslotsAwait(slot: Long): Unit {
  return awaitResult {
    this.clusterDelslots(slot) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterDelslotsMany]
 *
 * @param slots 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterDelslotsManyAwait(slots: List<Long>): Unit {
  return awaitResult {
    this.clusterDelslotsMany(slots) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterFailover]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterFailoverAwait(): Unit {
  return awaitResult {
    this.clusterFailover { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterFailOverWithOptions]
 *
 * @param options 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterFailOverWithOptionsAwait(options: FailoverOptions): Unit {
  return awaitResult {
    this.clusterFailOverWithOptions(options) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterForget]
 *
 * @param nodeId 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterForgetAwait(nodeId: String): Unit {
  return awaitResult {
    this.clusterForget(nodeId) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterGetkeysinslot]
 *
 * @param slot 
 * @param count 
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterGetkeysinslotAwait(slot: Long, count: Long): JsonArray {
  return awaitResult {
    this.clusterGetkeysinslot(slot, count, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterInfo]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterInfoAwait(): JsonArray {
  return awaitResult {
    this.clusterInfo(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterKeyslot]
 *
 * @param key 
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterKeyslotAwait(key: String): Long {
  return awaitResult {
    this.clusterKeyslot(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterMeet]
 *
 * @param ip 
 * @param port 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterMeetAwait(ip: String, port: Long): Unit {
  return awaitResult {
    this.clusterMeet(ip, port) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterNodes]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterNodesAwait(): JsonArray {
  return awaitResult {
    this.clusterNodes(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterReplicate]
 *
 * @param nodeId 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterReplicateAwait(nodeId: String): Unit {
  return awaitResult {
    this.clusterReplicate(nodeId) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterReset]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterResetAwait(): Unit {
  return awaitResult {
    this.clusterReset { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterResetWithOptions]
 *
 * @param options 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterResetWithOptionsAwait(options: ResetOptions): Unit {
  return awaitResult {
    this.clusterResetWithOptions(options) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterSaveconfig]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSaveconfigAwait(): Unit {
  return awaitResult {
    this.clusterSaveconfig { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterSetConfigEpoch]
 *
 * @param epoch 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSetConfigEpochAwait(epoch: Long): Unit {
  return awaitResult {
    this.clusterSetConfigEpoch(epoch) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterSetslot]
 *
 * @param slot 
 * @param subcommand 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSetslotAwait(slot: Long, subcommand: SlotCmd): Unit {
  return awaitResult {
    this.clusterSetslot(slot, subcommand) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterSetslotWithNode]
 *
 * @param slot 
 * @param subcommand 
 * @param nodeId 
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSetslotWithNodeAwait(slot: Long, subcommand: SlotCmd, nodeId: String): Unit {
  return awaitResult {
    this.clusterSetslotWithNode(slot, subcommand, nodeId) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterSlaves]
 *
 * @param nodeId 
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSlavesAwait(nodeId: String): JsonArray {
  return awaitResult {
    this.clusterSlaves(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clusterSlots]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSlotsAwait(): JsonArray {
  return awaitResult {
    this.clusterSlots(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.command]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.commandAwait(): JsonArray {
  return awaitResult {
    this.command(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.commandCount]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.commandCountAwait(): Long {
  return awaitResult {
    this.commandCount(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.commandGetkeys]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.commandGetkeysAwait(): JsonArray {
  return awaitResult {
    this.commandGetkeys(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.commandInfo]
 *
 * @param commands List of commands to get info for
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.commandInfoAwait(commands: List<String>): JsonArray {
  return awaitResult {
    this.commandInfo(commands, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.configGet]
 *
 * @param parameter Configuration parameter
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.configGetAwait(parameter: String): JsonArray {
  return awaitResult {
    this.configGet(parameter, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.configRewrite]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.configRewriteAwait(): String {
  return awaitResult {
    this.configRewrite(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.configSet]
 *
 * @param parameter Configuration parameter
 * @param value New value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.configSetAwait(parameter: String, value: String): String {
  return awaitResult {
    this.configSet(parameter, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.configResetstat]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.configResetstatAwait(): String {
  return awaitResult {
    this.configResetstat(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.dbsize]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.dbsizeAwait(): Long {
  return awaitResult {
    this.dbsize(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.debugObject]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.debugObjectAwait(key: String): String {
  return awaitResult {
    this.debugObject(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.debugSegfault]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.debugSegfaultAwait(): String {
  return awaitResult {
    this.debugSegfault(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.decr]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.decrAwait(key: String): Long {
  return awaitResult {
    this.decr(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.decrby]
 *
 * @param key Key string
 * @param decrement Value by which to decrement
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.decrbyAwait(key: String, decrement: Long): Long {
  return awaitResult {
    this.decrby(key, decrement, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.del]
 *
 * @param key Keys to delete
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.delAwait(key: String): Long {
  return awaitResult {
    this.del(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.delMany]
 *
 * @param keys List of keys to delete
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.delManyAwait(keys: List<String>): Long {
  return awaitResult {
    this.delMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.dump]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.dumpAwait(key: String): String {
  return awaitResult {
    this.dump(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.echo]
 *
 * @param message String to echo
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.echoAwait(message: String): String {
  return awaitResult {
    this.echo(message, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.eval]
 *
 * @param script Lua script to evaluate
 * @param keys List of keys
 * @param args List of argument values
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.evalAwait(script: String, keys: List<String>, args: List<String>): JsonArray {
  return awaitResult {
    this.eval(script, keys, args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.evalsha]
 *
 * @param sha1 SHA1 digest of the script cached on the server
 * @param keys List of keys
 * @param values List of values
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.evalshaAwait(sha1: String, keys: List<String>, values: List<String>): JsonArray {
  return awaitResult {
    this.evalsha(sha1, keys, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.evalScript]
 *
 * @param script Lua script and its SHA1 digest
 * @param keys List of keys
 * @param args List of argument values
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.evalScriptAwait(script: Script, keys: List<String>, args: List<String>): JsonArray {
  return awaitResult {
    this.evalScript(script, keys, args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.exists]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.existsAwait(key: String): Long {
  return awaitResult {
    this.exists(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.existsMany]
 *
 * @param keys List of key strings
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.existsManyAwait(keys: List<String>): Long {
  return awaitResult {
    this.existsMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.expire]
 *
 * @param key Key string
 * @param seconds Time to live in seconds
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.expireAwait(key: String, seconds: Long): Long {
  return awaitResult {
    this.expire(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.expireat]
 *
 * @param key Key string
 * @param seconds Expiry time as Unix timestamp in seconds
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.expireatAwait(key: String, seconds: Long): Long {
  return awaitResult {
    this.expireat(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.flushall]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.flushallAwait(): String {
  return awaitResult {
    this.flushall(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.flushdb]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.flushdbAwait(): String {
  return awaitResult {
    this.flushdb(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.get]
 *
 * @param key Key string
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.getAwait(key: String): String? {
  return awaitResult {
    this.get(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.getBinary]
 *
 * @param key Key string
 * @return [Buffer?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.getBinaryAwait(key: String): Buffer? {
  return awaitResult {
    this.getBinary(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.getbit]
 *
 * @param key Key string
 * @param offset Offset in bits
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.getbitAwait(key: String, offset: Long): Long {
  return awaitResult {
    this.getbit(key, offset, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.getrange]
 *
 * @param key Key string
 * @param start Start offset
 * @param end End offset - inclusive
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.getrangeAwait(key: String, start: Long, end: Long): String {
  return awaitResult {
    this.getrange(key, start, end, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.getset]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.getsetAwait(key: String, value: String): String? {
  return awaitResult {
    this.getset(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hdel]
 *
 * @param key Key string
 * @param field Field name
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hdelAwait(key: String, field: String): Long {
  return awaitResult {
    this.hdel(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hdelMany]
 *
 * @param key Key string
 * @param fields Field names
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hdelManyAwait(key: String, fields: List<String>): Long {
  return awaitResult {
    this.hdelMany(key, fields, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hexists]
 *
 * @param key Key string
 * @param field Field name
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hexistsAwait(key: String, field: String): Long {
  return awaitResult {
    this.hexists(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hget]
 *
 * @param key Key string
 * @param field Field name
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hgetAwait(key: String, field: String): String? {
  return awaitResult {
    this.hget(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hgetall]
 *
 * @param key Key string
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hgetallAwait(key: String): JsonObject {
  return awaitResult {
    this.hgetall(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hincrby]
 *
 * @param key Key string
 * @param field Field name
 * @param increment Value by which to increment
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hincrbyAwait(key: String, field: String, increment: Long): Long {
  return awaitResult {
    this.hincrby(key, field, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hincrbyfloat]
 *
 * @param key Key string
 * @param field Field name
 * @param increment Value by which to increment
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hincrbyfloatAwait(key: String, field: String, increment: Double): String {
  return awaitResult {
    this.hincrbyfloat(key, field, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hkeys]
 *
 * @param key Key string
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hkeysAwait(key: String): JsonArray {
  return awaitResult {
    this.hkeys(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hlen]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hlenAwait(key: String): Long {
  return awaitResult {
    this.hlen(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hmget]
 *
 * @param key Key string
 * @param fields Field names
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hmgetAwait(key: String, fields: List<String>): JsonArray {
  return awaitResult {
    this.hmget(key, fields, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hmset]
 *
 * @param key Key string
 * @param values Map of field:value pairs
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hmsetAwait(key: String, values: JsonObject): String {
  return awaitResult {
    this.hmset(key, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hset]
 *
 * @param key Key string
 * @param field Field name
 * @param value New value
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hsetAwait(key: String, field: String, value: String): Long {
  return awaitResult {
    this.hset(key, field, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hsetnx]
 *
 * @param key Key string
 * @param field Field name
 * @param value New value
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hsetnxAwait(key: String, field: String, value: String): Long {
  return awaitResult {
    this.hsetnx(key, field, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hvals]
 *
 * @param key Key string
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hvalsAwait(key: String): JsonArray {
  return awaitResult {
    this.hvals(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.incr]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.incrAwait(key: String): Long {
  return awaitResult {
    this.incr(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.incrby]
 *
 * @param key Key string
 * @param increment Value by which to increment
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.incrbyAwait(key: String, increment: Long): Long {
  return awaitResult {
    this.incrby(key, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.incrbyfloat]
 *
 * @param key Key string
 * @param increment Value by which to increment
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.incrbyfloatAwait(key: String, increment: Double): String {
  return awaitResult {
    this.incrbyfloat(key, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.info]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.infoAwait(): JsonObject {
  return awaitResult {
    this.info(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.infoSection]
 *
 * @param section Specific section of information to return
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.infoSectionAwait(section: String): JsonObject {
  return awaitResult {
    this.infoSection(section, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.keys]
 *
 * @param pattern Pattern to limit the keys returned
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.keysAwait(pattern: String): JsonArray {
  return awaitResult {
    this.keys(pattern, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lastsave]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lastsaveAwait(): Long {
  return awaitResult {
    this.lastsave(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lindex]
 *
 * @param key Key string
 * @param index Index of list element to get
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lindexAwait(key: String, index: Int): String {
  return awaitResult {
    this.lindex(key, index, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.linsert]
 *
 * @param key Key string
 * @param option BEFORE or AFTER
 * @param pivot Key to use as a pivot
 * @param value Value to be inserted before or after the pivot
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.linsertAwait(key: String, option: InsertOptions, pivot: String, value: String): Long {
  return awaitResult {
    this.linsert(key, option, pivot, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.llen]
 *
 * @param key String key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.llenAwait(key: String): Long {
  return awaitResult {
    this.llen(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lpop]
 *
 * @param key String key
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lpopAwait(key: String): String? {
  return awaitResult {
    this.lpop(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lpushMany]
 *
 * @param key Key string
 * @param values Values to be added at the beginning of the list, one by one
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lpushManyAwait(key: String, values: List<String>): Long {
  return awaitResult {
    this.lpushMany(key, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lpush]
 *
 * @param key Key string
 * @param value Value to be added at the beginning of the list
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lpushAwait(key: String, value: String): Long {
  return awaitResult {
    this.lpush(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lpushx]
 *
 * @param key Key string
 * @param value Value to add at the beginning of the list
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lpushxAwait(key: String, value: String): Long {
  return awaitResult {
    this.lpushx(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lrange]
 *
 * @param key Key string
 * @param from Start index
 * @param to Stop index
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lrangeAwait(key: String, from: Long, to: Long): JsonArray {
  return awaitResult {
    this.lrange(key, from, to, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lrem]
 *
 * @param key Key string
 * @param count Number of first found occurrences equal to $value to remove from the list
 * @param value Value to be removed
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lremAwait(key: String, count: Long, value: String): Long {
  return awaitResult {
    this.lrem(key, count, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.lset]
 *
 * @param key Key string
 * @param index Position within list
 * @param value New value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.lsetAwait(key: String, index: Long, value: String): String {
  return awaitResult {
    this.lset(key, index, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.ltrim]
 *
 * @param key Key string
 * @param from Start index
 * @param to Stop index
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.ltrimAwait(key: String, from: Long, to: Long): String {
  return awaitResult {
    this.ltrim(key, from, to, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.mget]
 *
 * @param key Key string
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.mgetAwait(key: String): JsonArray {
  return awaitResult {
    this.mget(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.mgetMany]
 *
 * @param keys List of keys to get
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.mgetManyAwait(keys: List<String>): JsonArray {
  return awaitResult {
    this.mgetMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.migrate]
 *
 * @param host Destination host
 * @param port Destination port
 * @param key Key to migrate
 * @param destdb Destination database index
 * @param timeout 
 * @param options Migrate options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.migrateAwait(host: String, port: Int, key: String, destdb: Int, timeout: Long, options: MigrateOptions): String {
  return awaitResult {
    this.migrate(host, port, key, destdb, timeout, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.monitor]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.monitorAwait(): Unit {
  return awaitResult {
    this.monitor { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.move]
 *
 * @param key Key to migrate
 * @param destdb Destination database index
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.moveAwait(key: String, destdb: Int): Long {
  return awaitResult {
    this.move(key, destdb, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.mset]
 *
 * @param keyvals Key value pairs to set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.msetAwait(keyvals: JsonObject): String {
  return awaitResult {
    this.mset(keyvals, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.msetnx]
 *
 * @param keyvals Key value pairs to set
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.msetnxAwait(keyvals: JsonObject): Long {
  return awaitResult {
    this.msetnx(keyvals, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.object]
 *
 * @param key Key string
 * @param cmd Object sub command
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.objectAwait(key: String, cmd: ObjectCmd): Unit {
  return awaitResult {
    this.`object`(key, cmd) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.persist]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.persistAwait(key: String): Long {
  return awaitResult {
    this.persist(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pexpire]
 *
 * @param key String key
 * @param millis Time to live in milliseconds
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pexpireAwait(key: String, millis: Long): Long {
  return awaitResult {
    this.pexpire(key, millis, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pexpireat]
 *
 * @param key Key string
 * @param millis Expiry time as Unix timestamp in milliseconds
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pexpireatAwait(key: String, millis: Long): Long {
  return awaitResult {
    this.pexpireat(key, millis, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pfadd]
 *
 * @param key Key string
 * @param element Element to add
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pfaddAwait(key: String, element: String): Long {
  return awaitResult {
    this.pfadd(key, element, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pfaddMany]
 *
 * @param key Key string
 * @param elements Elementa to add
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pfaddManyAwait(key: String, elements: List<String>): Long {
  return awaitResult {
    this.pfaddMany(key, elements, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pfcount]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pfcountAwait(key: String): Long {
  return awaitResult {
    this.pfcount(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pfcountMany]
 *
 * @param keys List of keys
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pfcountManyAwait(keys: List<String>): Long {
  return awaitResult {
    this.pfcountMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pfmerge]
 *
 * @param destkey Destination key
 * @param keys List of source keys
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pfmergeAwait(destkey: String, keys: List<String>): String {
  return awaitResult {
    this.pfmerge(destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.ping]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pingAwait(): String {
  return awaitResult {
    this.ping(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.psetex]
 *
 * @param key Key string
 * @param millis Number of milliseconds until the key expires
 * @param value New value for key
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.psetexAwait(key: String, millis: Long, value: String): Unit {
  return awaitResult {
    this.psetex(key, millis, value) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.psubscribe]
 *
 * @param pattern Pattern string
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.psubscribeAwait(pattern: String): JsonArray {
  return awaitResult {
    this.psubscribe(pattern, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.psubscribeMany]
 *
 * @param patterns List of patterns
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.psubscribeManyAwait(patterns: List<String>): JsonArray {
  return awaitResult {
    this.psubscribeMany(patterns, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pubsubChannels]
 *
 * @param pattern A glob-style pattern - an empty string means no pattern
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pubsubChannelsAwait(pattern: String): JsonArray {
  return awaitResult {
    this.pubsubChannels(pattern, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pubsubNumsub]
 *
 * @param channels List of channels
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pubsubNumsubAwait(channels: List<String>): JsonArray {
  return awaitResult {
    this.pubsubNumsub(channels, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pubsubNumpat]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pubsubNumpatAwait(): Long {
  return awaitResult {
    this.pubsubNumpat(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.pttl]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.pttlAwait(key: String): Long {
  return awaitResult {
    this.pttl(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.publish]
 *
 * @param channel Channel key
 * @param message Message to send to channel
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.publishAwait(channel: String, message: String): Long {
  return awaitResult {
    this.publish(channel, message, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.punsubscribe]
 *
 * @param patterns List of patterns to match against
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.punsubscribeAwait(patterns: List<String>): Unit {
  return awaitResult {
    this.punsubscribe(patterns) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.randomkey]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.randomkeyAwait(): String {
  return awaitResult {
    this.randomkey(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.rename]
 *
 * @param key Key string to be renamed
 * @param newkey New key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.renameAwait(key: String, newkey: String): String {
  return awaitResult {
    this.rename(key, newkey, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.renamenx]
 *
 * @param key Key string to be renamed
 * @param newkey New key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.renamenxAwait(key: String, newkey: String): Long {
  return awaitResult {
    this.renamenx(key, newkey, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.restore]
 *
 * @param key Key string
 * @param millis Expiry time in milliseconds to set on the key
 * @param serialized Serialized form of the key value as obtained using DUMP
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.restoreAwait(key: String, millis: Long, serialized: String): String {
  return awaitResult {
    this.restore(key, millis, serialized, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.role]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.roleAwait(): JsonArray {
  return awaitResult {
    this.role(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.rpop]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.rpopAwait(key: String): String {
  return awaitResult {
    this.rpop(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.rpoplpush]
 *
 * @param key Key string identifying source list
 * @param destkey Key string identifying destination list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.rpoplpushAwait(key: String, destkey: String): String {
  return awaitResult {
    this.rpoplpush(key, destkey, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.rpushMany]
 *
 * @param key Key string
 * @param values List of values to add to the end of the list
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.rpushManyAwait(key: String, values: List<String>): Long {
  return awaitResult {
    this.rpushMany(key, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.rpush]
 *
 * @param key Key string
 * @param value Value to be added to the end of the list
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.rpushAwait(key: String, value: String): Long {
  return awaitResult {
    this.rpush(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.rpushx]
 *
 * @param key Key string
 * @param value Value to be added to the end of the list
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.rpushxAwait(key: String, value: String): Long {
  return awaitResult {
    this.rpushx(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sadd]
 *
 * @param key Key string
 * @param member Value to be added to the set
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.saddAwait(key: String, member: String): Long {
  return awaitResult {
    this.sadd(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.saddMany]
 *
 * @param key Key string
 * @param members Values to be added to the set
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.saddManyAwait(key: String, members: List<String>): Long {
  return awaitResult {
    this.saddMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.save]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.saveAwait(): String {
  return awaitResult {
    this.save(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scard]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scardAwait(key: String): Long {
  return awaitResult {
    this.scard(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scriptExists]
 *
 * @param script SHA1 digest identifying a script in the script cache
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scriptExistsAwait(script: String): JsonArray {
  return awaitResult {
    this.scriptExists(script, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scriptExistsMany]
 *
 * @param scripts List of SHA1 digests identifying scripts in the script cache
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scriptExistsManyAwait(scripts: List<String>): JsonArray {
  return awaitResult {
    this.scriptExistsMany(scripts, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scriptFlush]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scriptFlushAwait(): String {
  return awaitResult {
    this.scriptFlush(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scriptKill]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scriptKillAwait(): String {
  return awaitResult {
    this.scriptKill(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scriptLoad]
 *
 * @param script Lua script
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scriptLoadAwait(script: String): String {
  return awaitResult {
    this.scriptLoad(script, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sdiff]
 *
 * @param key Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sdiffAwait(key: String, cmpkeys: List<String>): JsonArray {
  return awaitResult {
    this.sdiff(key, cmpkeys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sdiffstore]
 *
 * @param destkey Destination key where the result should be stored
 * @param key Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sdiffstoreAwait(destkey: String, key: String, cmpkeys: List<String>): Long {
  return awaitResult {
    this.sdiffstore(destkey, key, cmpkeys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.select]
 *
 * @param dbindex Index identifying the new active database
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.selectAwait(dbindex: Int): String {
  return awaitResult {
    this.select(dbindex, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.set]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setAwait(key: String, value: String): Unit {
  return awaitResult {
    this.set(key, value) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setWithOptions]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param options Set options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setWithOptionsAwait(key: String, value: String, options: SetOptions): String {
  return awaitResult {
    this.setWithOptions(key, value, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setBinary]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setBinaryAwait(key: String, value: Buffer): Unit {
  return awaitResult {
    this.setBinary(key, value) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setBinaryWithOptions]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param options Set options
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setBinaryWithOptionsAwait(key: String, value: Buffer, options: SetOptions): Unit {
  return awaitResult {
    this.setBinaryWithOptions(key, value, options) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setbit]
 *
 * @param key Key string
 * @param offset Bit offset
 * @param bit New value - must be 1 or 0
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setbitAwait(key: String, offset: Long, bit: Int): Long {
  return awaitResult {
    this.setbit(key, offset, bit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setex]
 *
 * @param key Key string
 * @param seconds Number of seconds until the key expires
 * @param value New value for key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setexAwait(key: String, seconds: Long, value: String): String {
  return awaitResult {
    this.setex(key, seconds, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setnx]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setnxAwait(key: String, value: String): Long {
  return awaitResult {
    this.setnx(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.setrange]
 *
 * @param key Key string
 * @param offset Offset - the maximum offset that you can set is 2^29 -1 (536870911), as Redis Strings are limited to 512 megabytes
 * @param value Value to overwrite with
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.setrangeAwait(key: String, offset: Int, value: String): Long {
  return awaitResult {
    this.setrange(key, offset, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sinter]
 *
 * @param keys List of keys to perform intersection on
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sinterAwait(keys: List<String>): JsonArray {
  return awaitResult {
    this.sinter(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sinterstore]
 *
 * @param destkey Key where to store the results
 * @param keys List of keys to perform intersection on
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sinterstoreAwait(destkey: String, keys: List<String>): Long {
  return awaitResult {
    this.sinterstore(destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sismember]
 *
 * @param key Key string
 * @param member Member to look for
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sismemberAwait(key: String, member: String): Long {
  return awaitResult {
    this.sismember(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.slaveof]
 *
 * @param host Host to become this server's master
 * @param port Port of our new master
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.slaveofAwait(host: String, port: Int): String {
  return awaitResult {
    this.slaveof(host, port, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.slaveofNoone]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.slaveofNooneAwait(): String {
  return awaitResult {
    this.slaveofNoone(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.slowlogGet]
 *
 * @param limit Number of log entries to return. If value is less than zero all entries are returned
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.slowlogGetAwait(limit: Int): JsonArray {
  return awaitResult {
    this.slowlogGet(limit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.slowlogLen]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.slowlogLenAwait(): Long {
  return awaitResult {
    this.slowlogLen(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.slowlogReset]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.slowlogResetAwait(): Unit {
  return awaitResult {
    this.slowlogReset { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.smembers]
 *
 * @param key Key string
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.smembersAwait(key: String): JsonArray {
  return awaitResult {
    this.smembers(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.smove]
 *
 * @param key Key of source set currently containing the member
 * @param destkey Key identifying the destination set
 * @param member Member to move
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.smoveAwait(key: String, destkey: String, member: String): Long {
  return awaitResult {
    this.smove(key, destkey, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sort]
 *
 * @param key Key string
 * @param options Sort options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sortAwait(key: String, options: SortOptions): JsonArray {
  return awaitResult {
    this.sort(key, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.spop]
 *
 * @param key Key string
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.spopAwait(key: String): String? {
  return awaitResult {
    this.spop(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.spopMany]
 *
 * @param key Key string
 * @param count Number of members to remove
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.spopManyAwait(key: String, count: Int): JsonArray {
  return awaitResult {
    this.spopMany(key, count, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.srandmember]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.srandmemberAwait(key: String): String {
  return awaitResult {
    this.srandmember(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.srandmemberCount]
 *
 * @param key Key string
 * @param count Number of members to get
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.srandmemberCountAwait(key: String, count: Int): JsonArray {
  return awaitResult {
    this.srandmemberCount(key, count, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.srem]
 *
 * @param key Key string
 * @param member Member to remove
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sremAwait(key: String, member: String): Long {
  return awaitResult {
    this.srem(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sremMany]
 *
 * @param key Key string
 * @param members Members to remove
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sremManyAwait(key: String, members: List<String>): Long {
  return awaitResult {
    this.sremMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.strlen]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.strlenAwait(key: String): Long {
  return awaitResult {
    this.strlen(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.subscribe]
 *
 * @param channel Channel to subscribe to
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.subscribeAwait(channel: String): JsonArray {
  return awaitResult {
    this.subscribe(channel, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.subscribeMany]
 *
 * @param channels List of channels to subscribe to
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.subscribeManyAwait(channels: List<String>): JsonArray {
  return awaitResult {
    this.subscribeMany(channels, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sunion]
 *
 * @param keys List of keys identifying sets to add up
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sunionAwait(keys: List<String>): JsonArray {
  return awaitResult {
    this.sunion(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sunionstore]
 *
 * @param destkey Destination key
 * @param keys List of keys identifying sets to add up
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sunionstoreAwait(destkey: String, keys: List<String>): Long {
  return awaitResult {
    this.sunionstore(destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sync]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.syncAwait(): Unit {
  return awaitResult {
    this.sync { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.time]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.timeAwait(): JsonArray {
  return awaitResult {
    this.time(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.ttl]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.ttlAwait(key: String): Long {
  return awaitResult {
    this.ttl(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.type]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.typeAwait(key: String): String {
  return awaitResult {
    this.type(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.unsubscribe]
 *
 * @param channels List of channels to subscribe to
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.unsubscribeAwait(channels: List<String>): Unit {
  return awaitResult {
    this.unsubscribe(channels) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.wait]
 *
 * @param numSlaves 
 * @param timeout 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.waitAwait(numSlaves: Long, timeout: Long): String {
  return awaitResult {
    this.wait(numSlaves, timeout, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zadd]
 *
 * @param key Key string
 * @param score Score used for sorting
 * @param member New member key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zaddAwait(key: String, score: Double, member: String): Long {
  return awaitResult {
    this.zadd(key, score, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zaddMany]
 *
 * @param key Key string
 * @param members New member keys and their scores
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zaddManyAwait(key: String, members: Map<String,Double>): Long {
  return awaitResult {
    this.zaddMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zcard]
 *
 * @param key Key string
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zcardAwait(key: String): Long {
  return awaitResult {
    this.zcard(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zcount]
 *
 * @param key Key string
 * @param min Minimum score
 * @param max Maximum score
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zcountAwait(key: String, min: Double, max: Double): Long {
  return awaitResult {
    this.zcount(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zincrby]
 *
 * @param key Key string
 * @param increment Increment amount
 * @param member Member key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zincrbyAwait(key: String, increment: Double, member: String): String {
  return awaitResult {
    this.zincrby(key, increment, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zinterstore]
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zinterstoreAwait(destkey: String, sets: List<String>, options: AggregateOptions): Long {
  return awaitResult {
    this.zinterstore(destkey, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zinterstoreWeighed]
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zinterstoreWeighedAwait(destkey: String, sets: Map<String,Double>, options: AggregateOptions): Long {
  return awaitResult {
    this.zinterstoreWeighed(destkey, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zlexcount]
 *
 * @param key Key string
 * @param min Pattern to compare against for minimum value
 * @param max Pattern to compare against for maximum value
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zlexcountAwait(key: String, min: String, max: String): Long {
  return awaitResult {
    this.zlexcount(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrange]
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrangeAwait(key: String, start: Long, stop: Long): JsonArray {
  return awaitResult {
    this.zrange(key, start, stop, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrangeWithOptions]
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param options Range options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrangeWithOptionsAwait(key: String, start: Long, stop: Long, options: RangeOptions): JsonArray {
  return awaitResult {
    this.zrangeWithOptions(key, start, stop, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrangebylex]
 *
 * @param key Key string
 * @param min Pattern representing a minimum allowed value
 * @param max Pattern representing a maximum allowed value
 * @param options Limit options where limit can be specified
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrangebylexAwait(key: String, min: String, max: String, options: LimitOptions): JsonArray {
  return awaitResult {
    this.zrangebylex(key, min, max, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrangebyscore]
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @param options Range and limit options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrangebyscoreAwait(key: String, min: String, max: String, options: RangeLimitOptions): JsonArray {
  return awaitResult {
    this.zrangebyscore(key, min, max, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrank]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrankAwait(key: String, member: String): Long {
  return awaitResult {
    this.zrank(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrem]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zremAwait(key: String, member: String): Long {
  return awaitResult {
    this.zrem(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zremMany]
 *
 * @param key Key string
 * @param members Members in the sorted set identified by key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zremManyAwait(key: String, members: List<String>): Long {
  return awaitResult {
    this.zremMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zremrangebylex]
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zremrangebylexAwait(key: String, min: String, max: String): Long {
  return awaitResult {
    this.zremrangebylex(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zremrangebyrank]
 *
 * @param key Key string
 * @param start Start index
 * @param stop Stop index
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zremrangebyrankAwait(key: String, start: Long, stop: Long): Long {
  return awaitResult {
    this.zremrangebyrank(key, start, stop, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zremrangebyscore]
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zremrangebyscoreAwait(key: String, min: String, max: String): Long {
  return awaitResult {
    this.zremrangebyscore(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrevrange]
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param options Range options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrangeAwait(key: String, start: Long, stop: Long, options: RangeOptions): JsonArray {
  return awaitResult {
    this.zrevrange(key, start, stop, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrevrangebylex]
 *
 * @param key Key string
 * @param max Pattern defining a maximum value
 * @param min Pattern defining a minimum value
 * @param options Limit options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrangebylexAwait(key: String, max: String, min: String, options: LimitOptions): JsonArray {
  return awaitResult {
    this.zrevrangebylex(key, max, min, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrevrangebyscore]
 *
 * @param key Key string
 * @param max Pattern defining a maximum value
 * @param min Pattern defining a minimum value
 * @param options Range and limit options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrangebyscoreAwait(key: String, max: String, min: String, options: RangeLimitOptions): JsonArray {
  return awaitResult {
    this.zrevrangebyscore(key, max, min, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zrevrank]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrankAwait(key: String, member: String): Long {
  return awaitResult {
    this.zrevrank(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zscore]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zscoreAwait(key: String, member: String): String {
  return awaitResult {
    this.zscore(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zunionstore]
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets
 * @param options Aggregation options
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zunionstoreAwait(destkey: String, sets: List<String>, options: AggregateOptions): Long {
  return awaitResult {
    this.zunionstore(destkey, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zunionstoreWeighed]
 *
 * @param key Destination key
 * @param sets Map containing set-key:weight pairs
 * @param options Aggregation options
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zunionstoreWeighedAwait(key: String, sets: Map<String,Double>, options: AggregateOptions): Long {
  return awaitResult {
    this.zunionstoreWeighed(key, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scan]
 *
 * @param cursor Cursor id
 * @param options Scan options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scanAwait(cursor: String, options: ScanOptions): JsonArray {
  return awaitResult {
    this.scan(cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.sscan]
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.sscanAwait(key: String, cursor: String, options: ScanOptions): JsonArray {
  return awaitResult {
    this.sscan(key, cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hscan]
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hscanAwait(key: String, cursor: String, options: ScanOptions): JsonArray {
  return awaitResult {
    this.hscan(key, cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.zscan]
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.zscanAwait(key: String, cursor: String, options: ScanOptions): JsonArray {
  return awaitResult {
    this.zscan(key, cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geoadd]
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param member member
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geoaddAwait(key: String, longitude: Double, latitude: Double, member: String): Long {
  return awaitResult {
    this.geoadd(key, longitude, latitude, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geoaddMany]
 *
 * @param key Key string
 * @param members list of &lt;lon, lat, member&gt;
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geoaddManyAwait(key: String, members: List<GeoMember>): Long {
  return awaitResult {
    this.geoaddMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geohash]
 *
 * @param key Key string
 * @param member member
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geohashAwait(key: String, member: String): JsonArray {
  return awaitResult {
    this.geohash(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geohashMany]
 *
 * @param key Key string
 * @param members list of members
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geohashManyAwait(key: String, members: List<String>): JsonArray {
  return awaitResult {
    this.geohashMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geopos]
 *
 * @param key Key string
 * @param member member
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geoposAwait(key: String, member: String): JsonArray {
  return awaitResult {
    this.geopos(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geoposMany]
 *
 * @param key Key string
 * @param members list of members
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geoposManyAwait(key: String, members: List<String>): JsonArray {
  return awaitResult {
    this.geoposMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geodist]
 *
 * @param key Key string
 * @param member1 member 1
 * @param member2 member 2
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geodistAwait(key: String, member1: String, member2: String): String {
  return awaitResult {
    this.geodist(key, member1, member2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.geodistWithUnit]
 *
 * @param key Key string
 * @param member1 member 1
 * @param member2 member 2
 * @param unit geo unit
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.geodistWithUnitAwait(key: String, member1: String, member2: String, unit: GeoUnit): String {
  return awaitResult {
    this.geodistWithUnit(key, member1, member2, unit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.georadius]
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusAwait(key: String, longitude: Double, latitude: Double, radius: Double, unit: GeoUnit): JsonArray {
  return awaitResult {
    this.georadius(key, longitude, latitude, radius, unit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.georadiusWithOptions]
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusWithOptionsAwait(key: String, longitude: Double, latitude: Double, radius: Double, unit: GeoUnit, options: GeoRadiusOptions): JsonArray {
  return awaitResult {
    this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.georadiusbymember]
 *
 * @param key Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusbymemberAwait(key: String, member: String, radius: Double, unit: GeoUnit): JsonArray {
  return awaitResult {
    this.georadiusbymember(key, member, radius, unit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.georadiusbymemberWithOptions]
 *
 * @param key Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusbymemberWithOptionsAwait(key: String, member: String, radius: Double, unit: GeoUnit, options: GeoRadiusOptions): JsonArray {
  return awaitResult {
    this.georadiusbymemberWithOptions(key, member, radius, unit, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.clientReply]
 *
 * @param options 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.clientReplyAwait(options: ClientReplyOptions): String {
  return awaitResult {
    this.clientReply(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.hstrlen]
 *
 * @param key Key String
 * @param field field
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.hstrlenAwait(key: String, field: String): Long {
  return awaitResult {
    this.hstrlen(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.touch]
 *
 * @param key Key String
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.touchAwait(key: String): Long {
  return awaitResult {
    this.touch(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.touchMany]
 *
 * @param keys list of keys
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.touchManyAwait(keys: List<String>): Long {
  return awaitResult {
    this.touchMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.scriptDebug]
 *
 * @param scriptDebugOptions the option
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.scriptDebugAwait(scriptDebugOptions: ScriptDebugOptions): String {
  return awaitResult {
    this.scriptDebug(scriptDebugOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitfield]
 *
 * @param key Key string
 * @param bitFieldOptions 
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitfieldAwait(key: String, bitFieldOptions: BitFieldOptions): JsonArray {
  return awaitResult {
    this.bitfield(key, bitFieldOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.bitfieldWithOverflow]
 *
 * @param key Key string
 * @param commands 
 * @param overflow 
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.bitfieldWithOverflowAwait(key: String, commands: BitFieldOptions, overflow: BitFieldOverflowOptions): JsonArray {
  return awaitResult {
    this.bitfieldWithOverflow(key, commands, overflow, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.unlink]
 *
 * @param key Key to delete
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.unlinkAwait(key: String): Long {
  return awaitResult {
    this.unlink(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.unlinkMany]
 *
 * @param keys List of keys to delete
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.unlinkManyAwait(keys: List<String>): Long {
  return awaitResult {
    this.unlinkMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisClient.swapdb]
 *
 * @param index1 index of first database to swap
 * @param index2 index of second database to swap
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisClient] using Vert.x codegen.
 */
suspend fun RedisClient.swapdbAwait(index1: Int, index2: Int): String {
  return awaitResult {
    this.swapdb(index1, index2, it)
  }
}

