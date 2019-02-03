package io.vertx.kotlin.redis

import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.RedisTransaction
import io.vertx.redis.op.AggregateOptions
import io.vertx.redis.op.BitOperation
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
import io.vertx.redis.op.SetOptions
import io.vertx.redis.op.SlotCmd
import io.vertx.redis.op.SortOptions

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.append]
 *
 * @param key Key string
 * @param value Value to append
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.appendAwait(key: String, value: String): String {
  return awaitResult {
    this.append(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.auth]
 *
 * @param password Password for authentication
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.authAwait(password: String): String {
  return awaitResult {
    this.auth(password, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bgrewriteaof]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bgrewriteaofAwait(): String {
  return awaitResult {
    this.bgrewriteaof(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bgsave]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bgsaveAwait(): String {
  return awaitResult {
    this.bgsave(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bitcount]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitcountAwait(key: String): String {
  return awaitResult {
    this.bitcount(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bitcountRange]
 *
 * @param key Key string
 * @param start Start index
 * @param end End index
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitcountRangeAwait(key: String, start: Long, end: Long): String {
  return awaitResult {
    this.bitcountRange(key, start, end, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bitop]
 *
 * @param operation Bitwise operation to perform
 * @param destkey Destination key where result is stored
 * @param keys List of keys on which to perform the operation
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitopAwait(operation: BitOperation, destkey: String, keys: List<String>): String {
  return awaitResult {
    this.bitop(operation, destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bitpos]
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitposAwait(key: String, bit: Int): String {
  return awaitResult {
    this.bitpos(key, bit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bitposFrom]
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitposFromAwait(key: String, bit: Int, start: Int): String {
  return awaitResult {
    this.bitposFrom(key, bit, start, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.bitposRange]
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @param stop End offset - inclusive
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitposRangeAwait(key: String, bit: Int, start: Int, stop: Int): String {
  return awaitResult {
    this.bitposRange(key, bit, start, stop, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.blpop]
 *
 * @param key Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.blpopAwait(key: String, seconds: Int): String {
  return awaitResult {
    this.blpop(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.blpopMany]
 *
 * @param keys List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.blpopManyAwait(keys: List<String>, seconds: Int): String {
  return awaitResult {
    this.blpopMany(keys, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.brpop]
 *
 * @param key Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.brpopAwait(key: String, seconds: Int): String {
  return awaitResult {
    this.brpop(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.brpopMany]
 *
 * @param keys List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.brpopManyAwait(keys: List<String>, seconds: Int): String {
  return awaitResult {
    this.brpopMany(keys, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.brpoplpush]
 *
 * @param key Key string identifying the source list
 * @param destkey Key string identifying the destination list
 * @param seconds Timeout in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.brpoplpushAwait(key: String, destkey: String, seconds: Int): String {
  return awaitResult {
    this.brpoplpush(key, destkey, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clientKill]
 *
 * @param filter Filter options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientKillAwait(filter: KillFilter): String {
  return awaitResult {
    this.clientKill(filter, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clientList]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientListAwait(): String {
  return awaitResult {
    this.clientList(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clientGetname]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientGetnameAwait(): String {
  return awaitResult {
    this.clientGetname(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clientPause]
 *
 * @param millis Pause time in milliseconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientPauseAwait(millis: Long): String {
  return awaitResult {
    this.clientPause(millis, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clientSetname]
 *
 * @param name New name for current connection
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientSetnameAwait(name: String): String {
  return awaitResult {
    this.clientSetname(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterAddslots]
 *
 * @param slots 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterAddslotsAwait(slots: List<String>): String {
  return awaitResult {
    this.clusterAddslots(slots, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterCountFailureReports]
 *
 * @param nodeId 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterCountFailureReportsAwait(nodeId: String): String {
  return awaitResult {
    this.clusterCountFailureReports(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterCountkeysinslot]
 *
 * @param slot 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterCountkeysinslotAwait(slot: Long): String {
  return awaitResult {
    this.clusterCountkeysinslot(slot, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterDelslots]
 *
 * @param slot 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterDelslotsAwait(slot: Long): String {
  return awaitResult {
    this.clusterDelslots(slot, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterDelslotsMany]
 *
 * @param slots 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterDelslotsManyAwait(slots: List<String>): String {
  return awaitResult {
    this.clusterDelslotsMany(slots, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterFailover]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterFailoverAwait(): String {
  return awaitResult {
    this.clusterFailover(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterFailOverWithOptions]
 *
 * @param options 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterFailOverWithOptionsAwait(options: FailoverOptions): String {
  return awaitResult {
    this.clusterFailOverWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterForget]
 *
 * @param nodeId 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterForgetAwait(nodeId: String): String {
  return awaitResult {
    this.clusterForget(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterGetkeysinslot]
 *
 * @param slot 
 * @param count 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterGetkeysinslotAwait(slot: Long, count: Long): String {
  return awaitResult {
    this.clusterGetkeysinslot(slot, count, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterInfo]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterInfoAwait(): String {
  return awaitResult {
    this.clusterInfo(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterKeyslot]
 *
 * @param key 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterKeyslotAwait(key: String): String {
  return awaitResult {
    this.clusterKeyslot(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterMeet]
 *
 * @param ip 
 * @param port 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterMeetAwait(ip: String, port: Long): String {
  return awaitResult {
    this.clusterMeet(ip, port, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterNodes]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterNodesAwait(): String {
  return awaitResult {
    this.clusterNodes(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterReplicate]
 *
 * @param nodeId 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterReplicateAwait(nodeId: String): String {
  return awaitResult {
    this.clusterReplicate(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterReset]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterResetAwait(): String {
  return awaitResult {
    this.clusterReset(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterResetWithOptions]
 *
 * @param options 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterResetWithOptionsAwait(options: ResetOptions): String {
  return awaitResult {
    this.clusterResetWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterSaveconfig]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSaveconfigAwait(): String {
  return awaitResult {
    this.clusterSaveconfig(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterSetConfigEpoch]
 *
 * @param epoch 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSetConfigEpochAwait(epoch: Long): String {
  return awaitResult {
    this.clusterSetConfigEpoch(epoch, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterSetslot]
 *
 * @param slot 
 * @param subcommand 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSetslotAwait(slot: Long, subcommand: SlotCmd): String {
  return awaitResult {
    this.clusterSetslot(slot, subcommand, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterSetslotWithNode]
 *
 * @param slot 
 * @param subcommand 
 * @param nodeId 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSetslotWithNodeAwait(slot: Long, subcommand: SlotCmd, nodeId: String): String {
  return awaitResult {
    this.clusterSetslotWithNode(slot, subcommand, nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterSlaves]
 *
 * @param nodeId 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSlavesAwait(nodeId: String): String {
  return awaitResult {
    this.clusterSlaves(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.clusterSlots]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSlotsAwait(): String {
  return awaitResult {
    this.clusterSlots(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.command]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandAwait(): String {
  return awaitResult {
    this.command(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.commandCount]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandCountAwait(): String {
  return awaitResult {
    this.commandCount(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.commandGetkeys]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandGetkeysAwait(): String {
  return awaitResult {
    this.commandGetkeys(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.commandInfo]
 *
 * @param commands List of commands to get info for
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandInfoAwait(commands: List<String>): String {
  return awaitResult {
    this.commandInfo(commands, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.configGet]
 *
 * @param parameter Configuration parameter
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.configGetAwait(parameter: String): String {
  return awaitResult {
    this.configGet(parameter, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.configRewrite]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.configRewriteAwait(): String {
  return awaitResult {
    this.configRewrite(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.configSet]
 *
 * @param parameter Configuration parameter
 * @param value New value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.configSetAwait(parameter: String, value: String): String {
  return awaitResult {
    this.configSet(parameter, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.configResetstat]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.configResetstatAwait(): String {
  return awaitResult {
    this.configResetstat(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.dbsize]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.dbsizeAwait(): String {
  return awaitResult {
    this.dbsize(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.debugObject]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.debugObjectAwait(key: String): String {
  return awaitResult {
    this.debugObject(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.debugSegfault]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.debugSegfaultAwait(): String {
  return awaitResult {
    this.debugSegfault(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.decr]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.decrAwait(key: String): String {
  return awaitResult {
    this.decr(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.decrby]
 *
 * @param key Key string
 * @param decrement Value by which to decrement
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.decrbyAwait(key: String, decrement: Long): String {
  return awaitResult {
    this.decrby(key, decrement, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.del]
 *
 * @param key Keys to delete
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.delAwait(key: String): String {
  return awaitResult {
    this.del(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.delMany]
 *
 * @param keys List of keys to delete
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.delManyAwait(keys: List<String>): String {
  return awaitResult {
    this.delMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.discard]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.discardAwait(): String {
  return awaitResult {
    this.discard(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.dump]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.dumpAwait(key: String): String {
  return awaitResult {
    this.dump(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.echo]
 *
 * @param message String to echo
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.echoAwait(message: String): String {
  return awaitResult {
    this.echo(message, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.eval]
 *
 * @param script Lua script to evaluate
 * @param keys List of keys
 * @param args List of argument values
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.evalAwait(script: String, keys: List<String>, args: List<String>): String {
  return awaitResult {
    this.eval(script, keys, args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.evalsha]
 *
 * @param sha1 SHA1 digest of the script cached on the server
 * @param keys List of keys
 * @param values List of values
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.evalshaAwait(sha1: String, keys: List<String>, values: List<String>): String {
  return awaitResult {
    this.evalsha(sha1, keys, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.exec]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.execAwait(): JsonArray {
  return awaitResult {
    this.exec(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.exists]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.existsAwait(key: String): String {
  return awaitResult {
    this.exists(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.existsMany]
 *
 * @param keys List of key strings
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.existsManyAwait(keys: List<String>): String {
  return awaitResult {
    this.existsMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.expire]
 *
 * @param key Key string
 * @param seconds Time to live in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.expireAwait(key: String, seconds: Int): String {
  return awaitResult {
    this.expire(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.expireat]
 *
 * @param key Key string
 * @param seconds Expiry time as Unix timestamp in seconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.expireatAwait(key: String, seconds: Long): String {
  return awaitResult {
    this.expireat(key, seconds, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.flushall]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.flushallAwait(): String {
  return awaitResult {
    this.flushall(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.flushdb]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.flushdbAwait(): String {
  return awaitResult {
    this.flushdb(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.get]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.getAwait(key: String): String {
  return awaitResult {
    this.get(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.getBinary]
 *
 * @param key Key string
 * @return [Buffer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.getBinaryAwait(key: String): Buffer {
  return awaitResult {
    this.getBinary(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.getbit]
 *
 * @param key Key string
 * @param offset Offset in bits
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.getbitAwait(key: String, offset: Long): String {
  return awaitResult {
    this.getbit(key, offset, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.getrange]
 *
 * @param key Key string
 * @param start Start offset
 * @param end End offset - inclusive
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.getrangeAwait(key: String, start: Long, end: Long): String {
  return awaitResult {
    this.getrange(key, start, end, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.getset]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.getsetAwait(key: String, value: String): String {
  return awaitResult {
    this.getset(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hdel]
 *
 * @param key Key string
 * @param field Field name
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hdelAwait(key: String, field: String): String {
  return awaitResult {
    this.hdel(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hdelMany]
 *
 * @param key Key string
 * @param fields Field names
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hdelManyAwait(key: String, fields: List<String>): String {
  return awaitResult {
    this.hdelMany(key, fields, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hexists]
 *
 * @param key Key string
 * @param field Field name
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hexistsAwait(key: String, field: String): String {
  return awaitResult {
    this.hexists(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hget]
 *
 * @param key Key string
 * @param field Field name
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hgetAwait(key: String, field: String): String {
  return awaitResult {
    this.hget(key, field, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hgetall]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hgetallAwait(key: String): String {
  return awaitResult {
    this.hgetall(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hincrby]
 *
 * @param key Key string
 * @param field Field name
 * @param increment Value by which to increment
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hincrbyAwait(key: String, field: String, increment: Long): String {
  return awaitResult {
    this.hincrby(key, field, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hincrbyfloat]
 *
 * @param key Key string
 * @param field Field name
 * @param increment Value by which to increment
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hincrbyfloatAwait(key: String, field: String, increment: Double): String {
  return awaitResult {
    this.hincrbyfloat(key, field, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hkeys]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hkeysAwait(key: String): String {
  return awaitResult {
    this.hkeys(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hlen]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hlenAwait(key: String): String {
  return awaitResult {
    this.hlen(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hmget]
 *
 * @param key Key string
 * @param fields Field names
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hmgetAwait(key: String, fields: List<String>): String {
  return awaitResult {
    this.hmget(key, fields, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hmset]
 *
 * @param key Key string
 * @param values Map of field:value pairs
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hmsetAwait(key: String, values: JsonObject): String {
  return awaitResult {
    this.hmset(key, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hset]
 *
 * @param key Key string
 * @param field Field name
 * @param value New value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hsetAwait(key: String, field: String, value: String): String {
  return awaitResult {
    this.hset(key, field, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hsetnx]
 *
 * @param key Key string
 * @param field Field name
 * @param value New value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hsetnxAwait(key: String, field: String, value: String): String {
  return awaitResult {
    this.hsetnx(key, field, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hvals]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hvalsAwait(key: String): String {
  return awaitResult {
    this.hvals(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.incr]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.incrAwait(key: String): String {
  return awaitResult {
    this.incr(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.incrby]
 *
 * @param key Key string
 * @param increment Value by which to increment
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.incrbyAwait(key: String, increment: Long): String {
  return awaitResult {
    this.incrby(key, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.incrbyfloat]
 *
 * @param key Key string
 * @param increment Value by which to increment
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.incrbyfloatAwait(key: String, increment: Double): String {
  return awaitResult {
    this.incrbyfloat(key, increment, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.info]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.infoAwait(): String {
  return awaitResult {
    this.info(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.infoSection]
 *
 * @param section Specific section of information to return
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.infoSectionAwait(section: String): String {
  return awaitResult {
    this.infoSection(section, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.keys]
 *
 * @param pattern Pattern to limit the keys returned
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.keysAwait(pattern: String): String {
  return awaitResult {
    this.keys(pattern, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lastsave]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lastsaveAwait(): String {
  return awaitResult {
    this.lastsave(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lindex]
 *
 * @param key Key string
 * @param index Index of list element to get
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lindexAwait(key: String, index: Int): String {
  return awaitResult {
    this.lindex(key, index, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.linsert]
 *
 * @param key Key string
 * @param option BEFORE or AFTER
 * @param pivot Key to use as a pivot
 * @param value Value to be inserted before or after the pivot
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.linsertAwait(key: String, option: InsertOptions, pivot: String, value: String): String {
  return awaitResult {
    this.linsert(key, option, pivot, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.llen]
 *
 * @param key String key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.llenAwait(key: String): String {
  return awaitResult {
    this.llen(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lpop]
 *
 * @param key String key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpopAwait(key: String): String {
  return awaitResult {
    this.lpop(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lpushMany]
 *
 * @param key Key string
 * @param values Values to be added at the beginning of the list, one by one
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpushManyAwait(key: String, values: List<String>): String {
  return awaitResult {
    this.lpushMany(key, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lpush]
 *
 * @param key Key string
 * @param value Value to be added at the beginning of the list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpushAwait(key: String, value: String): String {
  return awaitResult {
    this.lpush(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lpushx]
 *
 * @param key Key string
 * @param value Value to add at the beginning of the list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpushxAwait(key: String, value: String): String {
  return awaitResult {
    this.lpushx(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lrange]
 *
 * @param key Key string
 * @param from Start index
 * @param to Stop index
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lrangeAwait(key: String, from: Long, to: Long): String {
  return awaitResult {
    this.lrange(key, from, to, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lrem]
 *
 * @param key Key string
 * @param count Number of first found occurrences equal to $value to remove from the list
 * @param value Value to be removed
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lremAwait(key: String, count: Long, value: String): String {
  return awaitResult {
    this.lrem(key, count, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.lset]
 *
 * @param key Key string
 * @param index Position within list
 * @param value New value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.lsetAwait(key: String, index: Long, value: String): String {
  return awaitResult {
    this.lset(key, index, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.ltrim]
 *
 * @param key Key string
 * @param from Start index
 * @param to Stop index
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.ltrimAwait(key: String, from: Long, to: Long): String {
  return awaitResult {
    this.ltrim(key, from, to, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.mget]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.mgetAwait(key: String): String {
  return awaitResult {
    this.mget(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.mgetMany]
 *
 * @param keys List of keys to get
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.mgetManyAwait(keys: List<String>): String {
  return awaitResult {
    this.mgetMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.migrate]
 *
 * @param host Destination host
 * @param port Destination port
 * @param key Key to migrate
 * @param destdb Destination database index
 * @param timeout 
 * @param options Migrate options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.migrateAwait(host: String, port: Int, key: String, destdb: Int, timeout: Long, options: MigrateOptions): String {
  return awaitResult {
    this.migrate(host, port, key, destdb, timeout, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.monitor]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.monitorAwait(): String {
  return awaitResult {
    this.monitor(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.move]
 *
 * @param key Key to migrate
 * @param destdb Destination database index
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.moveAwait(key: String, destdb: Int): String {
  return awaitResult {
    this.move(key, destdb, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.mset]
 *
 * @param keyvals Key value pairs to set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.msetAwait(keyvals: JsonObject): String {
  return awaitResult {
    this.mset(keyvals, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.msetnx]
 *
 * @param keyvals Key value pairs to set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.msetnxAwait(keyvals: JsonObject): String {
  return awaitResult {
    this.msetnx(keyvals, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.multi]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.multiAwait(): String {
  return awaitResult {
    this.multi(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.object]
 *
 * @param key Key string
 * @param cmd Object sub command
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.objectAwait(key: String, cmd: ObjectCmd): String {
  return awaitResult {
    this.`object`(key, cmd, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.persist]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.persistAwait(key: String): String {
  return awaitResult {
    this.persist(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pexpire]
 *
 * @param key String key
 * @param millis Time to live in milliseconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pexpireAwait(key: String, millis: Long): String {
  return awaitResult {
    this.pexpire(key, millis, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pexpireat]
 *
 * @param key Key string
 * @param millis Expiry time as Unix timestamp in milliseconds
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pexpireatAwait(key: String, millis: Long): String {
  return awaitResult {
    this.pexpireat(key, millis, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pfadd]
 *
 * @param key Key string
 * @param element Element to add
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfaddAwait(key: String, element: String): String {
  return awaitResult {
    this.pfadd(key, element, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pfaddMany]
 *
 * @param key Key string
 * @param elements Elementa to add
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfaddManyAwait(key: String, elements: List<String>): String {
  return awaitResult {
    this.pfaddMany(key, elements, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pfcount]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfcountAwait(key: String): String {
  return awaitResult {
    this.pfcount(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pfcountMany]
 *
 * @param keys List of keys
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfcountManyAwait(keys: List<String>): String {
  return awaitResult {
    this.pfcountMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pfmerge]
 *
 * @param destkey Destination key
 * @param keys List of source keys
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfmergeAwait(destkey: String, keys: List<String>): String {
  return awaitResult {
    this.pfmerge(destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.ping]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pingAwait(): String {
  return awaitResult {
    this.ping(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.psetex]
 *
 * @param key Key string
 * @param millis Number of milliseconds until the key expires
 * @param value New value for key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.psetexAwait(key: String, millis: Long, value: String): String {
  return awaitResult {
    this.psetex(key, millis, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.psubscribe]
 *
 * @param pattern Pattern string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.psubscribeAwait(pattern: String): String {
  return awaitResult {
    this.psubscribe(pattern, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.psubscribeMany]
 *
 * @param patterns List of patterns
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.psubscribeManyAwait(patterns: List<String>): String {
  return awaitResult {
    this.psubscribeMany(patterns, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pubsubChannels]
 *
 * @param pattern A glob-style pattern - an empty string means no pattern
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pubsubChannelsAwait(pattern: String): String {
  return awaitResult {
    this.pubsubChannels(pattern, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pubsubNumsub]
 *
 * @param channels List of channels
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pubsubNumsubAwait(channels: List<String>): String {
  return awaitResult {
    this.pubsubNumsub(channels, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pubsubNumpat]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pubsubNumpatAwait(): String {
  return awaitResult {
    this.pubsubNumpat(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.pttl]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.pttlAwait(key: String): String {
  return awaitResult {
    this.pttl(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.publish]
 *
 * @param channel Channel key
 * @param message Message to send to channel
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.publishAwait(channel: String, message: String): String {
  return awaitResult {
    this.publish(channel, message, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.punsubscribe]
 *
 * @param patterns List of patterns to match against
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.punsubscribeAwait(patterns: List<String>): String {
  return awaitResult {
    this.punsubscribe(patterns, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.randomkey]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.randomkeyAwait(): String {
  return awaitResult {
    this.randomkey(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.rename]
 *
 * @param key Key string to be renamed
 * @param newkey New key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.renameAwait(key: String, newkey: String): String {
  return awaitResult {
    this.rename(key, newkey, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.renamenx]
 *
 * @param key Key string to be renamed
 * @param newkey New key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.renamenxAwait(key: String, newkey: String): String {
  return awaitResult {
    this.renamenx(key, newkey, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.restore]
 *
 * @param key Key string
 * @param millis Expiry time in milliseconds to set on the key
 * @param serialized Serialized form of the key value as obtained using DUMP
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.restoreAwait(key: String, millis: Long, serialized: String): String {
  return awaitResult {
    this.restore(key, millis, serialized, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.role]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.roleAwait(): String {
  return awaitResult {
    this.role(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.rpop]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpopAwait(key: String): String {
  return awaitResult {
    this.rpop(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.rpoplpush]
 *
 * @param key Key string identifying source list
 * @param destkey Key string identifying destination list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpoplpushAwait(key: String, destkey: String): String {
  return awaitResult {
    this.rpoplpush(key, destkey, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.rpushMany]
 *
 * @param key Key string
 * @param values List of values to add to the end of the list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpushManyAwait(key: String, values: List<String>): String {
  return awaitResult {
    this.rpushMany(key, values, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.rpush]
 *
 * @param key Key string
 * @param value Value to be added to the end of the list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpushAwait(key: String, value: String): String {
  return awaitResult {
    this.rpush(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.rpushx]
 *
 * @param key Key string
 * @param value Value to be added to the end of the list
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpushxAwait(key: String, value: String): String {
  return awaitResult {
    this.rpushx(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sadd]
 *
 * @param key Key string
 * @param member Value to be added to the set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.saddAwait(key: String, member: String): String {
  return awaitResult {
    this.sadd(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.saddMany]
 *
 * @param key Key string
 * @param members Values to be added to the set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.saddManyAwait(key: String, members: List<String>): String {
  return awaitResult {
    this.saddMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.save]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.saveAwait(): String {
  return awaitResult {
    this.save(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scard]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scardAwait(key: String): String {
  return awaitResult {
    this.scard(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scriptExists]
 *
 * @param script SHA1 digest identifying a script in the script cache
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptExistsAwait(script: String): String {
  return awaitResult {
    this.scriptExists(script, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scriptExistsMany]
 *
 * @param scripts List of SHA1 digests identifying scripts in the script cache
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptExistsManyAwait(scripts: List<String>): String {
  return awaitResult {
    this.scriptExistsMany(scripts, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scriptFlush]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptFlushAwait(): String {
  return awaitResult {
    this.scriptFlush(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scriptKill]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptKillAwait(): String {
  return awaitResult {
    this.scriptKill(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scriptLoad]
 *
 * @param script Lua script
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptLoadAwait(script: String): String {
  return awaitResult {
    this.scriptLoad(script, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sdiff]
 *
 * @param key Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sdiffAwait(key: String, cmpkeys: List<String>): String {
  return awaitResult {
    this.sdiff(key, cmpkeys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sdiffstore]
 *
 * @param destkey Destination key where the result should be stored
 * @param key Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sdiffstoreAwait(destkey: String, key: String, cmpkeys: List<String>): String {
  return awaitResult {
    this.sdiffstore(destkey, key, cmpkeys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.select]
 *
 * @param dbindex Index identifying the new active database
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.selectAwait(dbindex: Int): String {
  return awaitResult {
    this.select(dbindex, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.set]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setAwait(key: String, value: String): String {
  return awaitResult {
    this.set(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setWithOptions]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param options Set options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setWithOptionsAwait(key: String, value: String, options: SetOptions): String {
  return awaitResult {
    this.setWithOptions(key, value, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setBinary]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setBinaryAwait(key: String, value: Buffer): String {
  return awaitResult {
    this.setBinary(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setBinaryWithOptions]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param options Set options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setBinaryWithOptionsAwait(key: String, value: Buffer, options: SetOptions): String {
  return awaitResult {
    this.setBinaryWithOptions(key, value, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setbit]
 *
 * @param key Key string
 * @param offset Bit offset
 * @param bit New value - must be 1 or 0
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setbitAwait(key: String, offset: Long, bit: Int): String {
  return awaitResult {
    this.setbit(key, offset, bit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setex]
 *
 * @param key Key string
 * @param seconds Number of seconds until the key expires
 * @param value New value for key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setexAwait(key: String, seconds: Long, value: String): String {
  return awaitResult {
    this.setex(key, seconds, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setnx]
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setnxAwait(key: String, value: String): String {
  return awaitResult {
    this.setnx(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.setrange]
 *
 * @param key Key string
 * @param offset Offset - the maximum offset that you can set is 2^29 -1 (536870911), as Redis Strings are limited to 512 megabytes
 * @param value Value to overwrite with
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.setrangeAwait(key: String, offset: Int, value: String): String {
  return awaitResult {
    this.setrange(key, offset, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sinter]
 *
 * @param keys List of keys to perform intersection on
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sinterAwait(keys: List<String>): String {
  return awaitResult {
    this.sinter(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sinterstore]
 *
 * @param destkey Key where to store the results
 * @param keys List of keys to perform intersection on
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sinterstoreAwait(destkey: String, keys: List<String>): String {
  return awaitResult {
    this.sinterstore(destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sismember]
 *
 * @param key Key string
 * @param member Member to look for
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sismemberAwait(key: String, member: String): String {
  return awaitResult {
    this.sismember(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.slaveof]
 *
 * @param host Host to become this server's master
 * @param port Port of our new master
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.slaveofAwait(host: String, port: Int): String {
  return awaitResult {
    this.slaveof(host, port, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.slaveofNoone]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.slaveofNooneAwait(): String {
  return awaitResult {
    this.slaveofNoone(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.slowlogGet]
 *
 * @param limit Number of log entries to return. If value is less than zero all entries are returned
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.slowlogGetAwait(limit: Int): String {
  return awaitResult {
    this.slowlogGet(limit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.slowlogLen]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.slowlogLenAwait(): String {
  return awaitResult {
    this.slowlogLen(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.slowlogReset]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.slowlogResetAwait(): String {
  return awaitResult {
    this.slowlogReset(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.smembers]
 *
 * @param key Key string
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.smembersAwait(key: String): JsonArray {
  return awaitResult {
    this.smembers(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.smove]
 *
 * @param key Key of source set currently containing the member
 * @param destkey Key identifying the destination set
 * @param member Member to move
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.smoveAwait(key: String, destkey: String, member: String): String {
  return awaitResult {
    this.smove(key, destkey, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sort]
 *
 * @param key Key string
 * @param options Sort options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sortAwait(key: String, options: SortOptions): String {
  return awaitResult {
    this.sort(key, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.spop]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.spopAwait(key: String): String {
  return awaitResult {
    this.spop(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.spopMany]
 *
 * @param key Key string
 * @param count Number of members to remove
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.spopManyAwait(key: String, count: Int): String {
  return awaitResult {
    this.spopMany(key, count, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.srandmember]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.srandmemberAwait(key: String): String {
  return awaitResult {
    this.srandmember(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.srandmemberCount]
 *
 * @param key Key string
 * @param count Number of members to get
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.srandmemberCountAwait(key: String, count: Int): String {
  return awaitResult {
    this.srandmemberCount(key, count, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.srem]
 *
 * @param key Key string
 * @param member Member to remove
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sremAwait(key: String, member: String): String {
  return awaitResult {
    this.srem(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sremMany]
 *
 * @param key Key string
 * @param members Members to remove
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sremManyAwait(key: String, members: List<String>): String {
  return awaitResult {
    this.sremMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.strlen]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.strlenAwait(key: String): String {
  return awaitResult {
    this.strlen(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.subscribe]
 *
 * @param channel Channel to subscribe to
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.subscribeAwait(channel: String): String {
  return awaitResult {
    this.subscribe(channel, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.subscribeMany]
 *
 * @param channels List of channels to subscribe to
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.subscribeManyAwait(channels: List<String>): String {
  return awaitResult {
    this.subscribeMany(channels, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sunion]
 *
 * @param keys List of keys identifying sets to add up
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sunionAwait(keys: List<String>): String {
  return awaitResult {
    this.sunion(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sunionstore]
 *
 * @param destkey Destination key
 * @param keys List of keys identifying sets to add up
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sunionstoreAwait(destkey: String, keys: List<String>): String {
  return awaitResult {
    this.sunionstore(destkey, keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sync]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.syncAwait(): String {
  return awaitResult {
    this.sync(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.time]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.timeAwait(): String {
  return awaitResult {
    this.time(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.ttl]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.ttlAwait(key: String): String {
  return awaitResult {
    this.ttl(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.type]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.typeAwait(key: String): String {
  return awaitResult {
    this.type(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.unsubscribe]
 *
 * @param channels List of channels to subscribe to
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.unsubscribeAwait(channels: List<String>): String {
  return awaitResult {
    this.unsubscribe(channels, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.unwatch]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.unwatchAwait(): String {
  return awaitResult {
    this.unwatch(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.wait]
 *
 * @param numSlaves 
 * @param timeout 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.waitAwait(numSlaves: Long, timeout: Long): String {
  return awaitResult {
    this.wait(numSlaves, timeout, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.watch]
 *
 * @param key Key to watch
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.watchAwait(key: String): String {
  return awaitResult {
    this.watch(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.watchMany]
 *
 * @param keys List of keys to watch
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.watchManyAwait(keys: List<String>): String {
  return awaitResult {
    this.watchMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zadd]
 *
 * @param key Key string
 * @param score Score used for sorting
 * @param member New member key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zaddAwait(key: String, score: Double, member: String): String {
  return awaitResult {
    this.zadd(key, score, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zaddMany]
 *
 * @param key Key string
 * @param members New member keys and their scores
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zaddManyAwait(key: String, members: Map<String,Double>): String {
  return awaitResult {
    this.zaddMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zcard]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zcardAwait(key: String): String {
  return awaitResult {
    this.zcard(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zcount]
 *
 * @param key Key string
 * @param min Minimum score
 * @param max Maximum score
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zcountAwait(key: String, min: Double, max: Double): String {
  return awaitResult {
    this.zcount(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zincrby]
 *
 * @param key Key string
 * @param increment Increment amount
 * @param member Member key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zincrbyAwait(key: String, increment: Double, member: String): String {
  return awaitResult {
    this.zincrby(key, increment, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zinterstore]
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zinterstoreAwait(destkey: String, sets: List<String>, options: AggregateOptions): String {
  return awaitResult {
    this.zinterstore(destkey, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zinterstoreWeighed]
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zinterstoreWeighedAwait(destkey: String, sets: Map<String,Double>, options: AggregateOptions): String {
  return awaitResult {
    this.zinterstoreWeighed(destkey, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zlexcount]
 *
 * @param key Key string
 * @param min Pattern to compare against for minimum value
 * @param max Pattern to compare against for maximum value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zlexcountAwait(key: String, min: String, max: String): String {
  return awaitResult {
    this.zlexcount(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrange]
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangeAwait(key: String, start: Long, stop: Long): String {
  return awaitResult {
    this.zrange(key, start, stop, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrangeWithOptions]
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param options Range options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangeWithOptionsAwait(key: String, start: Long, stop: Long, options: RangeOptions): String {
  return awaitResult {
    this.zrangeWithOptions(key, start, stop, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrangebylex]
 *
 * @param key Key string
 * @param min Pattern representing a minimum allowed value
 * @param max Pattern representing a maximum allowed value
 * @param options Limit options where limit can be specified
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangebylexAwait(key: String, min: String, max: String, options: LimitOptions): String {
  return awaitResult {
    this.zrangebylex(key, min, max, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrangebyscore]
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @param options Range and limit options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangebyscoreAwait(key: String, min: String, max: String, options: RangeLimitOptions): String {
  return awaitResult {
    this.zrangebyscore(key, min, max, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrank]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrankAwait(key: String, member: String): String {
  return awaitResult {
    this.zrank(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrem]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremAwait(key: String, member: String): String {
  return awaitResult {
    this.zrem(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zremMany]
 *
 * @param key Key string
 * @param members Members in the sorted set identified by key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremManyAwait(key: String, members: List<String>): String {
  return awaitResult {
    this.zremMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zremrangebylex]
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremrangebylexAwait(key: String, min: String, max: String): String {
  return awaitResult {
    this.zremrangebylex(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zremrangebyrank]
 *
 * @param key Key string
 * @param start Start index
 * @param stop Stop index
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremrangebyrankAwait(key: String, start: Long, stop: Long): String {
  return awaitResult {
    this.zremrangebyrank(key, start, stop, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zremrangebyscore]
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremrangebyscoreAwait(key: String, min: String, max: String): String {
  return awaitResult {
    this.zremrangebyscore(key, min, max, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrevrange]
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param options Range options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrangeAwait(key: String, start: Long, stop: Long, options: RangeOptions): String {
  return awaitResult {
    this.zrevrange(key, start, stop, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrevrangebylex]
 *
 * @param key Key string
 * @param max Pattern defining a maximum value
 * @param min Pattern defining a minimum value
 * @param options Limit options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrangebylexAwait(key: String, max: String, min: String, options: LimitOptions): String {
  return awaitResult {
    this.zrevrangebylex(key, max, min, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrevrangebyscore]
 *
 * @param key Key string
 * @param max Pattern defining a maximum value
 * @param min Pattern defining a minimum value
 * @param options Range and limit options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrangebyscoreAwait(key: String, max: String, min: String, options: RangeLimitOptions): String {
  return awaitResult {
    this.zrevrangebyscore(key, max, min, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zrevrank]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrankAwait(key: String, member: String): String {
  return awaitResult {
    this.zrevrank(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zscore]
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zscoreAwait(key: String, member: String): String {
  return awaitResult {
    this.zscore(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zunionstore]
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets
 * @param options Aggregation options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zunionstoreAwait(destkey: String, sets: List<String>, options: AggregateOptions): String {
  return awaitResult {
    this.zunionstore(destkey, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zunionstoreWeighed]
 *
 * @param key Destination key
 * @param sets Map containing set-key:weight pairs
 * @param options Aggregation options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zunionstoreWeighedAwait(key: String, sets: Map<String,Double>, options: AggregateOptions): String {
  return awaitResult {
    this.zunionstoreWeighed(key, sets, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.scan]
 *
 * @param cursor Cursor id
 * @param options Scan options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.scanAwait(cursor: String, options: ScanOptions): String {
  return awaitResult {
    this.scan(cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.sscan]
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.sscanAwait(key: String, cursor: String, options: ScanOptions): String {
  return awaitResult {
    this.sscan(key, cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.hscan]
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.hscanAwait(key: String, cursor: String, options: ScanOptions): String {
  return awaitResult {
    this.hscan(key, cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.zscan]
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.zscanAwait(key: String, cursor: String, options: ScanOptions): String {
  return awaitResult {
    this.zscan(key, cursor, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geoadd]
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param member member
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoaddAwait(key: String, longitude: Double, latitude: Double, member: String): String {
  return awaitResult {
    this.geoadd(key, longitude, latitude, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geoaddMany]
 *
 * @param key Key string
 * @param members list of &lt;lon, lat, member&gt;
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoaddManyAwait(key: String, members: List<GeoMember>): String {
  return awaitResult {
    this.geoaddMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geohash]
 *
 * @param key Key string
 * @param member member
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geohashAwait(key: String, member: String): String {
  return awaitResult {
    this.geohash(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geohashMany]
 *
 * @param key Key string
 * @param members list of members
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geohashManyAwait(key: String, members: List<String>): String {
  return awaitResult {
    this.geohashMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geopos]
 *
 * @param key Key string
 * @param member member
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoposAwait(key: String, member: String): String {
  return awaitResult {
    this.geopos(key, member, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geoposMany]
 *
 * @param key Key string
 * @param members list of members
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoposManyAwait(key: String, members: List<String>): String {
  return awaitResult {
    this.geoposMany(key, members, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geodist]
 *
 * @param key Key string
 * @param member1 member 1
 * @param member2 member 2
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geodistAwait(key: String, member1: String, member2: String): String {
  return awaitResult {
    this.geodist(key, member1, member2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.geodistWithUnit]
 *
 * @param key Key string
 * @param member1 member 1
 * @param member2 member 2
 * @param unit geo unit
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.geodistWithUnitAwait(key: String, member1: String, member2: String, unit: GeoUnit): String {
  return awaitResult {
    this.geodistWithUnit(key, member1, member2, unit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.georadius]
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusAwait(key: String, longitude: Double, latitude: Double, radius: Double, unit: GeoUnit): String {
  return awaitResult {
    this.georadius(key, longitude, latitude, radius, unit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.georadiusWithOptions]
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusWithOptionsAwait(key: String, longitude: Double, latitude: Double, radius: Double, unit: GeoUnit, options: GeoRadiusOptions): String {
  return awaitResult {
    this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.georadiusbymember]
 *
 * @param key Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusbymemberAwait(key: String, member: String, radius: Double, unit: GeoUnit): String {
  return awaitResult {
    this.georadiusbymember(key, member, radius, unit, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.georadiusbymemberWithOptions]
 *
 * @param key Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusbymemberWithOptionsAwait(key: String, member: String, radius: Double, unit: GeoUnit, options: GeoRadiusOptions): String {
  return awaitResult {
    this.georadiusbymemberWithOptions(key, member, radius, unit, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.unlink]
 *
 * @param key Key string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.unlinkAwait(key: String): String {
  return awaitResult {
    this.unlink(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.unlinkMany]
 *
 * @param keys List of keys to delete
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.unlinkManyAwait(keys: List<String>): String {
  return awaitResult {
    this.unlinkMany(keys, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.RedisTransaction.swapdb]
 *
 * @param index1 index of first database to swap
 * @param index2 index of second database to swap
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.RedisTransaction] using Vert.x codegen.
 */
suspend fun RedisTransaction.swapdbAwait(index1: Int, index2: Int): String {
  return awaitResult {
    this.swapdb(index1, index2, it)
  }
}

