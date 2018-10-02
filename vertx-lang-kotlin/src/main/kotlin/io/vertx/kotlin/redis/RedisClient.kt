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
 * Close the client - when it is fully closed the handler will be called.
 *
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Append a value to a key
 *
 * @param key Key string
 * @param value Value to append
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.appendAwait(key : String, value : String) : Long {
  return awaitResult{
    this.append(key, value, it)
  }
}

/**
 * Authenticate to the server
 *
 * @param password Password for authentication
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.authAwait(password : String) : String {
  return awaitResult{
    this.auth(password, it)
  }
}

/**
 * Asynchronously rewrite the append-only file
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bgrewriteaofAwait() : String {
  return awaitResult{
    this.bgrewriteaof(it)
  }
}

/**
 * Asynchronously save the dataset to disk
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bgsaveAwait() : String {
  return awaitResult{
    this.bgsave(it)
  }
}

/**
 * Count set bits in a string
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitcountAwait(key : String) : Long {
  return awaitResult{
    this.bitcount(key, it)
  }
}

/**
 * Count set bits in a string
 *
 * @param key Key string
 * @param start Start index
 * @param end End index
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitcountRangeAwait(key : String, start : Long, end : Long) : Long {
  return awaitResult{
    this.bitcountRange(key, start, end, it)
  }
}

/**
 * Perform bitwise operations between strings
 *
 * @param operation Bitwise operation to perform
 * @param destkey Destination key where result is stored
 * @param keys List of keys on which to perform the operation
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitopAwait(operation : BitOperation, destkey : String, keys : List<String>) : Long {
  return awaitResult{
    this.bitop(operation, destkey, keys, it)
  }
}

/**
 * Find first bit set or clear in a string
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitposAwait(key : String, bit : Int) : Long {
  return awaitResult{
    this.bitpos(key, bit, it)
  }
}

/**
 * Find first bit set or clear in a string
 *
 * See also bitposRange() method, which takes start, and stop offset.
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitposFromAwait(key : String, bit : Int, start : Int) : Long {
  return awaitResult{
    this.bitposFrom(key, bit, start, it)
  }
}

/**
 * Find first bit set or clear in a string
 *
 * Note: when both start, and stop offsets are specified,
 * behaviour is slightly different than if only start is specified
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @param stop End offset - inclusive
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitposRangeAwait(key : String, bit : Int, start : Int, stop : Int) : Long {
  return awaitResult{
    this.bitposRange(key, bit, start, stop, it)
  }
}

/**
 * Remove and get the first element in a list, or block until one is available
 *
 * @param key Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.blpopAwait(key : String, seconds : Int) : JsonArray {
  return awaitResult{
    this.blpop(key, seconds, it)
  }
}

/**
 * Remove and get the first element in any of the lists, or block until one is available
 *
 * @param keys List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.blpopManyAwait(keys : List<String>, seconds : Int) : JsonArray {
  return awaitResult{
    this.blpopMany(keys, seconds, it)
  }
}

/**
 * Remove and get the last element in a list, or block until one is available
 *
 * @param key Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.brpopAwait(key : String, seconds : Int) : JsonArray {
  return awaitResult{
    this.brpop(key, seconds, it)
  }
}

/**
 * Remove and get the last element in any of the lists, or block until one is available
 *
 * @param keys List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.brpopManyAwait(keys : List<String>, seconds : Int) : JsonArray {
  return awaitResult{
    this.brpopMany(keys, seconds, it)
  }
}

/**
 * Pop a value from a list, push it to another list and return it; or block until one is available
 *
 * @param key Key string identifying the source list
 * @param destkey Key string identifying the destination list
 * @param seconds Timeout in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.brpoplpushAwait(key : String, destkey : String, seconds : Int) : String {
  return awaitResult{
    this.brpoplpush(key, destkey, seconds, it)
  }
}

/**
 * Kill the connection of a client
 *
 * @param filter Filter options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clientKillAwait(filter : KillFilter) : Long {
  return awaitResult{
    this.clientKill(filter, it)
  }
}

/**
 * Get the list of client connections
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clientListAwait() : String {
  return awaitResult{
    this.clientList(it)
  }
}

/**
 * Get the current connection name
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clientGetnameAwait() : String {
  return awaitResult{
    this.clientGetname(it)
  }
}

/**
 * Stop processing commands from clients for some time
 *
 * @param millis Pause time in milliseconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clientPauseAwait(millis : Long) : String {
  return awaitResult{
    this.clientPause(millis, it)
  }
}

/**
 * Set the current connection name
 *
 * @param name New name for current connection
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clientSetnameAwait(name : String) : String {
  return awaitResult{
    this.clientSetname(name, it)
  }
}

/**
 * Assign new hash slots to receiving node.
 *
 * @param slots 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterAddslotsAwait(slots : List<Long>) : Unit {
  return awaitResult{
    this.clusterAddslots(slots, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Return the number of failure reports active for a given node.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterCountFailureReportsAwait(nodeId : String) : Long {
  return awaitResult{
    this.clusterCountFailureReports(nodeId, it)
  }
}

/**
 * Return the number of local keys in the specified hash slot.
 *
 * @param slot 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterCountkeysinslotAwait(slot : Long) : Long {
  return awaitResult{
    this.clusterCountkeysinslot(slot, it)
  }
}

/**
 * Set hash slots as unbound in receiving node.
 *
 * @param slot 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterDelslotsAwait(slot : Long) : Unit {
  return awaitResult{
    this.clusterDelslots(slot, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set hash slots as unbound in receiving node.
 *
 * @param slots 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterDelslotsManyAwait(slots : List<Long>) : Unit {
  return awaitResult{
    this.clusterDelslotsMany(slots, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Forces a slave to perform a manual failover of its master.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterFailoverAwait() : Unit {
  return awaitResult{
    this.clusterFailover({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Forces a slave to perform a manual failover of its master.
 *
 * @param options 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterFailOverWithOptionsAwait(options : FailoverOptions) : Unit {
  return awaitResult{
    this.clusterFailOverWithOptions(options, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Remove a node from the nodes table.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterForgetAwait(nodeId : String) : Unit {
  return awaitResult{
    this.clusterForget(nodeId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Return local key names in the specified hash slot.
 *
 * @param slot 
 * @param count 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterGetkeysinslotAwait(slot : Long, count : Long) : JsonArray {
  return awaitResult{
    this.clusterGetkeysinslot(slot, count, it)
  }
}

/**
 * Provides info about Redis Cluster node state.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterInfoAwait() : JsonArray {
  return awaitResult{
    this.clusterInfo(it)
  }
}

/**
 * Returns the hash slot of the specified key.
 *
 * @param key 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterKeyslotAwait(key : String) : Long {
  return awaitResult{
    this.clusterKeyslot(key, it)
  }
}

/**
 * Force a node cluster to handshake with another node.
 *
 * @param ip 
 * @param port 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterMeetAwait(ip : String, port : Long) : Unit {
  return awaitResult{
    this.clusterMeet(ip, port, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get Cluster config for the node.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterNodesAwait() : JsonArray {
  return awaitResult{
    this.clusterNodes(it)
  }
}

/**
 * Reconfigure a node as a slave of the specified master node.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterReplicateAwait(nodeId : String) : Unit {
  return awaitResult{
    this.clusterReplicate(nodeId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Reset a Redis Cluster node.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterResetAwait() : Unit {
  return awaitResult{
    this.clusterReset({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Reset a Redis Cluster node.
 *
 * @param options 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterResetWithOptionsAwait(options : ResetOptions) : Unit {
  return awaitResult{
    this.clusterResetWithOptions(options, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Forces the node to save cluster state on disk.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSaveconfigAwait() : Unit {
  return awaitResult{
    this.clusterSaveconfig({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set the configuration epoch in a new node.
 *
 * @param epoch 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSetConfigEpochAwait(epoch : Long) : Unit {
  return awaitResult{
    this.clusterSetConfigEpoch(epoch, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Bind an hash slot to a specific node.
 *
 * @param slot 
 * @param subcommand 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSetslotAwait(slot : Long, subcommand : SlotCmd) : Unit {
  return awaitResult{
    this.clusterSetslot(slot, subcommand, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Bind an hash slot to a specific node.
 *
 * @param slot 
 * @param subcommand 
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSetslotWithNodeAwait(slot : Long, subcommand : SlotCmd, nodeId : String) : Unit {
  return awaitResult{
    this.clusterSetslotWithNode(slot, subcommand, nodeId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * List slave nodes of the specified master node.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSlavesAwait(nodeId : String) : JsonArray {
  return awaitResult{
    this.clusterSlaves(nodeId, it)
  }
}

/**
 * Get array of Cluster slot to node mappings
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clusterSlotsAwait() : JsonArray {
  return awaitResult{
    this.clusterSlots(it)
  }
}

/**
 * Get array of Redis command details
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.commandAwait() : JsonArray {
  return awaitResult{
    this.command(it)
  }
}

/**
 * Get total number of Redis commands
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.commandCountAwait() : Long {
  return awaitResult{
    this.commandCount(it)
  }
}

/**
 * Extract keys given a full Redis command
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.commandGetkeysAwait() : JsonArray {
  return awaitResult{
    this.commandGetkeys(it)
  }
}

/**
 * Get array of specific Redis command details
 *
 * @param commands List of commands to get info for
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.commandInfoAwait(commands : List<String>) : JsonArray {
  return awaitResult{
    this.commandInfo(commands, it)
  }
}

/**
 * Get the value of a configuration parameter
 *
 * @param parameter Configuration parameter
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.configGetAwait(parameter : String) : JsonArray {
  return awaitResult{
    this.configGet(parameter, it)
  }
}

/**
 * Rewrite the configuration file with the in memory configuration
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.configRewriteAwait() : String {
  return awaitResult{
    this.configRewrite(it)
  }
}

/**
 * Set a configuration parameter to the given value
 *
 * @param parameter Configuration parameter
 * @param value New value
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.configSetAwait(parameter : String, value : String) : String {
  return awaitResult{
    this.configSet(parameter, value, it)
  }
}

/**
 * Reset the stats returned by INFO
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.configResetstatAwait() : String {
  return awaitResult{
    this.configResetstat(it)
  }
}

/**
 * Return the number of keys in the selected database
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.dbsizeAwait() : Long {
  return awaitResult{
    this.dbsize(it)
  }
}

/**
 * Get debugging information about a key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.debugObjectAwait(key : String) : String {
  return awaitResult{
    this.debugObject(key, it)
  }
}

/**
 * Make the server crash
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.debugSegfaultAwait() : String {
  return awaitResult{
    this.debugSegfault(it)
  }
}

/**
 * Decrement the integer value of a key by one
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.decrAwait(key : String) : Long {
  return awaitResult{
    this.decr(key, it)
  }
}

/**
 * Decrement the integer value of a key by the given number
 *
 * @param key Key string
 * @param decrement Value by which to decrement
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.decrbyAwait(key : String, decrement : Long) : Long {
  return awaitResult{
    this.decrby(key, decrement, it)
  }
}

/**
 * Delete a key
 *
 * @param key Keys to delete
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.delAwait(key : String) : Long {
  return awaitResult{
    this.del(key, it)
  }
}

/**
 * Delete many keys
 *
 * @param keys List of keys to delete
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.delManyAwait(keys : List<String>) : Long {
  return awaitResult{
    this.delMany(keys, it)
  }
}

/**
 * Return a serialized version of the value stored at the specified key.
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.dumpAwait(key : String) : String {
  return awaitResult{
    this.dump(key, it)
  }
}

/**
 * Echo the given string
 *
 * @param message String to echo
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.echoAwait(message : String) : String {
  return awaitResult{
    this.echo(message, it)
  }
}

/**
 * Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
 * for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
 *
 * When a reply if for example a String the handler will be called with a JsonArray with a single element containing
 * the String.
 *
 * @param script Lua script to evaluate
 * @param keys List of keys
 * @param args List of argument values
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.evalAwait(script : String, keys : List<String>, args : List<String>) : JsonArray {
  return awaitResult{
    this.eval(script, keys, args, it)
  }
}

/**
 * Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
 * for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
 *
 * When a reply if for example a String the handler will be called with a JsonArray with a single element containing
 * the String.
 *
 * @param sha1 SHA1 digest of the script cached on the server
 * @param keys List of keys
 * @param values List of values
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.evalshaAwait(sha1 : String, keys : List<String>, values : List<String>) : JsonArray {
  return awaitResult{
    this.evalsha(sha1, keys, values, it)
  }
}

/**
 * Execute a Lua script server side. This method is a high level wrapper around EVAL and EVALSHA
 * using the latter if possible, falling back to EVAL if the script is not cached by the server yet.
 * According to Redis documentation, executed scripts are guaranteed to be in the script cache of a
 * given execution of a Redis instance forever, which means typically the overhead incurred by
 * optimistically sending EVALSHA is minimal, while improving performance and saving bandwidth
 * compared to using EVAL every time.
 *
 * @param script Lua script and its SHA1 digest
 * @param keys List of keys
 * @param args List of argument values
 * @param handler Handler for the result of this call. group: scripting
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.evalScriptAwait(script : Script, keys : List<String>, args : List<String>) : JsonArray {
  return awaitResult{
    this.evalScript(script, keys, args, it)
  }
}

/**
 * Determine if a key exists
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.existsAwait(key : String) : Long {
  return awaitResult{
    this.exists(key, it)
  }
}

/**
 * Determine if one or many keys exist
 *
 * @param keys List of key strings
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.existsManyAwait(keys : List<String>) : Long {
  return awaitResult{
    this.existsMany(keys, it)
  }
}

/**
 * Set a key's time to live in seconds
 *
 * @param key Key string
 * @param seconds Time to live in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.expireAwait(key : String, seconds : Long) : Long {
  return awaitResult{
    this.expire(key, seconds, it)
  }
}

/**
 * Set the expiration for a key as a UNIX timestamp
 *
 * @param key Key string
 * @param seconds Expiry time as Unix timestamp in seconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.expireatAwait(key : String, seconds : Long) : Long {
  return awaitResult{
    this.expireat(key, seconds, it)
  }
}

/**
 * Remove all keys from all databases
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.flushallAwait() : String {
  return awaitResult{
    this.flushall(it)
  }
}

/**
 * Remove all keys from the current database
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.flushdbAwait() : String {
  return awaitResult{
    this.flushdb(it)
  }
}

/**
 * Get the value of a key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.getAwait(key : String) : String? {
  return awaitResult{
    this.get(key, it)
  }
}

/**
 * Get the value of a key - without decoding as utf-8
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.getBinaryAwait(key : String) : Buffer? {
  return awaitResult{
    this.getBinary(key, it)
  }
}

/**
 * Returns the bit value at offset in the string value stored at key
 *
 * @param key Key string
 * @param offset Offset in bits
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.getbitAwait(key : String, offset : Long) : Long {
  return awaitResult{
    this.getbit(key, offset, it)
  }
}

/**
 * Get a substring of the string stored at a key
 *
 * @param key Key string
 * @param start Start offset
 * @param end End offset - inclusive
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.getrangeAwait(key : String, start : Long, end : Long) : String {
  return awaitResult{
    this.getrange(key, start, end, it)
  }
}

/**
 * Set the string value of a key and return its old value
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.getsetAwait(key : String, value : String) : String? {
  return awaitResult{
    this.getset(key, value, it)
  }
}

/**
 * Delete one or more hash fields
 *
 * @param key Key string
 * @param field Field name
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hdelAwait(key : String, field : String) : Long {
  return awaitResult{
    this.hdel(key, field, it)
  }
}

/**
 * Delete one or more hash fields
 *
 * @param key Key string
 * @param fields Field names
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hdelManyAwait(key : String, fields : List<String>) : Long {
  return awaitResult{
    this.hdelMany(key, fields, it)
  }
}

/**
 * Determine if a hash field exists
 *
 * @param key Key string
 * @param field Field name
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hexistsAwait(key : String, field : String) : Long {
  return awaitResult{
    this.hexists(key, field, it)
  }
}

/**
 * Get the value of a hash field
 *
 * @param key Key string
 * @param field Field name
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hgetAwait(key : String, field : String) : String? {
  return awaitResult{
    this.hget(key, field, it)
  }
}

/**
 * Get all the fields and values in a hash
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hgetallAwait(key : String) : JsonObject {
  return awaitResult{
    this.hgetall(key, it)
  }
}

/**
 * Increment the integer value of a hash field by the given number
 *
 * @param key Key string
 * @param field Field name
 * @param increment Value by which to increment
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hincrbyAwait(key : String, field : String, increment : Long) : Long {
  return awaitResult{
    this.hincrby(key, field, increment, it)
  }
}

/**
 * Increment the float value of a hash field by the given amount
 *
 * @param key Key string
 * @param field Field name
 * @param increment Value by which to increment
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hincrbyfloatAwait(key : String, field : String, increment : Double) : String {
  return awaitResult{
    this.hincrbyfloat(key, field, increment, it)
  }
}

/**
 * Get all the fields in a hash
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hkeysAwait(key : String) : JsonArray {
  return awaitResult{
    this.hkeys(key, it)
  }
}

/**
 * Get the number of fields in a hash
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hlenAwait(key : String) : Long {
  return awaitResult{
    this.hlen(key, it)
  }
}

/**
 * Get the values of all the given hash fields
 *
 * @param key Key string
 * @param fields Field names
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hmgetAwait(key : String, fields : List<String>) : JsonArray {
  return awaitResult{
    this.hmget(key, fields, it)
  }
}

/**
 * Set multiple hash fields to multiple values
 *
 * @param key Key string
 * @param values Map of field:value pairs
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hmsetAwait(key : String, values : JsonObject) : String {
  return awaitResult{
    this.hmset(key, values, it)
  }
}

/**
 * Set the string value of a hash field
 *
 * @param key Key string
 * @param field Field name
 * @param value New value
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hsetAwait(key : String, field : String, value : String) : Long {
  return awaitResult{
    this.hset(key, field, value, it)
  }
}

/**
 * Set the value of a hash field, only if the field does not exist
 *
 * @param key Key string
 * @param field Field name
 * @param value New value
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hsetnxAwait(key : String, field : String, value : String) : Long {
  return awaitResult{
    this.hsetnx(key, field, value, it)
  }
}

/**
 * Get all the values in a hash
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hvalsAwait(key : String) : JsonArray {
  return awaitResult{
    this.hvals(key, it)
  }
}

/**
 * Increment the integer value of a key by one
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.incrAwait(key : String) : Long {
  return awaitResult{
    this.incr(key, it)
  }
}

/**
 * Increment the integer value of a key by the given amount
 *
 * @param key Key string
 * @param increment Value by which to increment
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.incrbyAwait(key : String, increment : Long) : Long {
  return awaitResult{
    this.incrby(key, increment, it)
  }
}

/**
 * Increment the float value of a key by the given amount
 *
 * @param key Key string
 * @param increment Value by which to increment
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.incrbyfloatAwait(key : String, increment : Double) : String {
  return awaitResult{
    this.incrbyfloat(key, increment, it)
  }
}

/**
 * Get information and statistics about the server
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.infoAwait() : JsonObject {
  return awaitResult{
    this.info(it)
  }
}

/**
 * Get information and statistics about the server
 *
 * @param section Specific section of information to return
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.infoSectionAwait(section : String) : JsonObject {
  return awaitResult{
    this.infoSection(section, it)
  }
}

/**
 * Find all keys matching the given pattern
 *
 * @param pattern Pattern to limit the keys returned
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.keysAwait(pattern : String) : JsonArray {
  return awaitResult{
    this.keys(pattern, it)
  }
}

/**
 * Get the UNIX time stamp of the last successful save to disk
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lastsaveAwait() : Long {
  return awaitResult{
    this.lastsave(it)
  }
}

/**
 * Get an element from a list by its index
 *
 * @param key Key string
 * @param index Index of list element to get
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lindexAwait(key : String, index : Int) : String {
  return awaitResult{
    this.lindex(key, index, it)
  }
}

/**
 * Insert an element before or after another element in a list
 *
 * @param key Key string
 * @param option BEFORE or AFTER
 * @param pivot Key to use as a pivot
 * @param value Value to be inserted before or after the pivot
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.linsertAwait(key : String, option : InsertOptions, pivot : String, value : String) : Long {
  return awaitResult{
    this.linsert(key, option, pivot, value, it)
  }
}

/**
 * Get the length of a list
 *
 * @param key String key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.llenAwait(key : String) : Long {
  return awaitResult{
    this.llen(key, it)
  }
}

/**
 * Remove and get the first element in a list
 *
 * @param key String key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lpopAwait(key : String) : String? {
  return awaitResult{
    this.lpop(key, it)
  }
}

/**
 * Prepend one or multiple values to a list
 *
 * @param key Key string
 * @param values Values to be added at the beginning of the list, one by one
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lpushManyAwait(key : String, values : List<String>) : Long {
  return awaitResult{
    this.lpushMany(key, values, it)
  }
}

/**
 * Prepend one value to a list
 *
 * @param key Key string
 * @param value Value to be added at the beginning of the list
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lpushAwait(key : String, value : String) : Long {
  return awaitResult{
    this.lpush(key, value, it)
  }
}

/**
 * Prepend a value to a list, only if the list exists
 *
 * @param key Key string
 * @param value Value to add at the beginning of the list
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lpushxAwait(key : String, value : String) : Long {
  return awaitResult{
    this.lpushx(key, value, it)
  }
}

/**
 * Get a range of elements from a list
 *
 * @param key Key string
 * @param from Start index
 * @param to Stop index
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lrangeAwait(key : String, from : Long, to : Long) : JsonArray {
  return awaitResult{
    this.lrange(key, from, to, it)
  }
}

/**
 * Remove elements from a list
 *
 * @param key Key string
 * @param count Number of first found occurrences equal to $value to remove from the list
 * @param value Value to be removed
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lremAwait(key : String, count : Long, value : String) : Long {
  return awaitResult{
    this.lrem(key, count, value, it)
  }
}

/**
 * Set the value of an element in a list by its index
 *
 * @param key Key string
 * @param index Position within list
 * @param value New value
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.lsetAwait(key : String, index : Long, value : String) : String {
  return awaitResult{
    this.lset(key, index, value, it)
  }
}

/**
 * Trim a list to the specified range
 *
 * @param key Key string
 * @param from Start index
 * @param to Stop index
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.ltrimAwait(key : String, from : Long, to : Long) : String {
  return awaitResult{
    this.ltrim(key, from, to, it)
  }
}

/**
 * Get the value of the given key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.mgetAwait(key : String) : JsonArray {
  return awaitResult{
    this.mget(key, it)
  }
}

/**
 * Get the values of all the given keys
 *
 * @param keys List of keys to get
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.mgetManyAwait(keys : List<String>) : JsonArray {
  return awaitResult{
    this.mgetMany(keys, it)
  }
}

/**
 * Atomically transfer a key from a Redis instance to another one.
 *
 * @param host Destination host
 * @param port Destination port
 * @param key Key to migrate
 * @param destdb Destination database index
 * @param timeout 
 * @param options Migrate options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.migrateAwait(host : String, port : Int, key : String, destdb : Int, timeout : Long, options : MigrateOptions) : String {
  return awaitResult{
    this.migrate(host, port, key, destdb, timeout, options, it)
  }
}

/**
 * Listen for all requests received by the server in real time
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.monitorAwait() : Unit {
  return awaitResult{
    this.monitor({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Move a key to another database
 *
 * @param key Key to migrate
 * @param destdb Destination database index
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.moveAwait(key : String, destdb : Int) : Long {
  return awaitResult{
    this.move(key, destdb, it)
  }
}

/**
 * Set multiple keys to multiple values
 *
 * @param keyvals Key value pairs to set
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.msetAwait(keyvals : JsonObject) : String {
  return awaitResult{
    this.mset(keyvals, it)
  }
}

/**
 * Set multiple keys to multiple values, only if none of the keys exist
 *
 * @param keyvals Key value pairs to set
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.msetnxAwait(keyvals : JsonObject) : Long {
  return awaitResult{
    this.msetnx(keyvals, it)
  }
}

/**
 * Inspect the internals of Redis objects
 *
 * @param key Key string
 * @param cmd Object sub command
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.objectAwait(key : String, cmd : ObjectCmd) : Unit {
  return awaitResult{
    this.`object`(key, cmd, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Remove the expiration from a key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.persistAwait(key : String) : Long {
  return awaitResult{
    this.persist(key, it)
  }
}

/**
 * Set a key's time to live in milliseconds
 *
 * @param key String key
 * @param millis Time to live in milliseconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pexpireAwait(key : String, millis : Long) : Long {
  return awaitResult{
    this.pexpire(key, millis, it)
  }
}

/**
 * Set the expiration for a key as a UNIX timestamp specified in milliseconds
 *
 * @param key Key string
 * @param millis Expiry time as Unix timestamp in milliseconds
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pexpireatAwait(key : String, millis : Long) : Long {
  return awaitResult{
    this.pexpireat(key, millis, it)
  }
}

/**
 * Adds the specified element to the specified HyperLogLog.
 *
 * @param key Key string
 * @param element Element to add
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pfaddAwait(key : String, element : String) : Long {
  return awaitResult{
    this.pfadd(key, element, it)
  }
}

/**
 * Adds the specified elements to the specified HyperLogLog.
 *
 * @param key Key string
 * @param elements Elementa to add
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pfaddManyAwait(key : String, elements : List<String>) : Long {
  return awaitResult{
    this.pfaddMany(key, elements, it)
  }
}

/**
 * Return the approximated cardinality of the set observed by the HyperLogLog at key.
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pfcountAwait(key : String) : Long {
  return awaitResult{
    this.pfcount(key, it)
  }
}

/**
 * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
 *
 * @param keys List of keys
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pfcountManyAwait(keys : List<String>) : Long {
  return awaitResult{
    this.pfcountMany(keys, it)
  }
}

/**
 * Merge N different HyperLogLogs into a single one.
 *
 * @param destkey Destination key
 * @param keys List of source keys
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pfmergeAwait(destkey : String, keys : List<String>) : String {
  return awaitResult{
    this.pfmerge(destkey, keys, it)
  }
}

/**
 * Ping the server
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pingAwait() : String {
  return awaitResult{
    this.ping(it)
  }
}

/**
 * Set the value and expiration in milliseconds of a key
 *
 * @param key Key string
 * @param millis Number of milliseconds until the key expires
 * @param value New value for key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.psetexAwait(key : String, millis : Long, value : String) : Unit {
  return awaitResult{
    this.psetex(key, millis, value, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Listen for messages published to channels matching the given pattern
 *
 * @param pattern Pattern string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.psubscribeAwait(pattern : String) : JsonArray {
  return awaitResult{
    this.psubscribe(pattern, it)
  }
}

/**
 * Listen for messages published to channels matching the given patterns
 *
 * @param patterns List of patterns
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.psubscribeManyAwait(patterns : List<String>) : JsonArray {
  return awaitResult{
    this.psubscribeMany(patterns, it)
  }
}

/**
 * Lists the currently active channels - only those matching the pattern
 *
 * @param pattern A glob-style pattern - an empty string means no pattern
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pubsubChannelsAwait(pattern : String) : JsonArray {
  return awaitResult{
    this.pubsubChannels(pattern, it)
  }
}

/**
 * Returns the number of subscribers (not counting clients subscribed to patterns) for the specified channels
 *
 * @param channels List of channels
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pubsubNumsubAwait(channels : List<String>) : JsonArray {
  return awaitResult{
    this.pubsubNumsub(channels, it)
  }
}

/**
 * Returns the number of subscriptions to patterns (that are performed using the PSUBSCRIBE command)
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pubsubNumpatAwait() : Long {
  return awaitResult{
    this.pubsubNumpat(it)
  }
}

/**
 * Get the time to live for a key in milliseconds
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.pttlAwait(key : String) : Long {
  return awaitResult{
    this.pttl(key, it)
  }
}

/**
 * Post a message to a channel
 *
 * @param channel Channel key
 * @param message Message to send to channel
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.publishAwait(channel : String, message : String) : Long {
  return awaitResult{
    this.publish(channel, message, it)
  }
}

/**
 * Stop listening for messages posted to channels matching the given patterns
 *
 * @param patterns List of patterns to match against
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.punsubscribeAwait(patterns : List<String>) : Unit {
  return awaitResult{
    this.punsubscribe(patterns, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Return a random key from the keyspace
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.randomkeyAwait() : String {
  return awaitResult{
    this.randomkey(it)
  }
}

/**
 * Rename a key
 *
 * @param key Key string to be renamed
 * @param newkey New key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.renameAwait(key : String, newkey : String) : String {
  return awaitResult{
    this.rename(key, newkey, it)
  }
}

/**
 * Rename a key, only if the new key does not exist
 *
 * @param key Key string to be renamed
 * @param newkey New key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.renamenxAwait(key : String, newkey : String) : Long {
  return awaitResult{
    this.renamenx(key, newkey, it)
  }
}

/**
 * Create a key using the provided serialized value, previously obtained using DUMP.
 *
 * @param key Key string
 * @param millis Expiry time in milliseconds to set on the key
 * @param serialized Serialized form of the key value as obtained using DUMP
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.restoreAwait(key : String, millis : Long, serialized : String) : String {
  return awaitResult{
    this.restore(key, millis, serialized, it)
  }
}

/**
 * Return the role of the instance in the context of replication
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.roleAwait() : JsonArray {
  return awaitResult{
    this.role(it)
  }
}

/**
 * Remove and get the last element in a list
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.rpopAwait(key : String) : String {
  return awaitResult{
    this.rpop(key, it)
  }
}

/**
 * Remove the last element in a list, append it to another list and return it
 *
 * @param key Key string identifying source list
 * @param destkey Key string identifying destination list
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.rpoplpushAwait(key : String, destkey : String) : String {
  return awaitResult{
    this.rpoplpush(key, destkey, it)
  }
}

/**
 * Append one or multiple values to a list
 *
 * @param key Key string
 * @param values List of values to add to the end of the list
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.rpushManyAwait(key : String, values : List<String>) : Long {
  return awaitResult{
    this.rpushMany(key, values, it)
  }
}

/**
 * Append one or multiple values to a list
 *
 * @param key Key string
 * @param value Value to be added to the end of the list
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.rpushAwait(key : String, value : String) : Long {
  return awaitResult{
    this.rpush(key, value, it)
  }
}

/**
 * Append a value to a list, only if the list exists
 *
 * @param key Key string
 * @param value Value to be added to the end of the list
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.rpushxAwait(key : String, value : String) : Long {
  return awaitResult{
    this.rpushx(key, value, it)
  }
}

/**
 * Add a member to a set
 *
 * @param key Key string
 * @param member Value to be added to the set
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.saddAwait(key : String, member : String) : Long {
  return awaitResult{
    this.sadd(key, member, it)
  }
}

/**
 * Add one or more members to a set
 *
 * @param key Key string
 * @param members Values to be added to the set
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.saddManyAwait(key : String, members : List<String>) : Long {
  return awaitResult{
    this.saddMany(key, members, it)
  }
}

/**
 * Synchronously save the dataset to disk
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.saveAwait() : String {
  return awaitResult{
    this.save(it)
  }
}

/**
 * Get the number of members in a set
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scardAwait(key : String) : Long {
  return awaitResult{
    this.scard(key, it)
  }
}

/**
 * Check existence of script in the script cache.
 *
 * @param script SHA1 digest identifying a script in the script cache
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scriptExistsAwait(script : String) : JsonArray {
  return awaitResult{
    this.scriptExists(script, it)
  }
}

/**
 * Check existence of scripts in the script cache.
 *
 * @param scripts List of SHA1 digests identifying scripts in the script cache
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scriptExistsManyAwait(scripts : List<String>) : JsonArray {
  return awaitResult{
    this.scriptExistsMany(scripts, it)
  }
}

/**
 * Remove all the scripts from the script cache.
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scriptFlushAwait() : String {
  return awaitResult{
    this.scriptFlush(it)
  }
}

/**
 * Kill the script currently in execution.
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scriptKillAwait() : String {
  return awaitResult{
    this.scriptKill(it)
  }
}

/**
 * Load the specified Lua script into the script cache.
 *
 * @param script Lua script
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scriptLoadAwait(script : String) : String {
  return awaitResult{
    this.scriptLoad(script, it)
  }
}

/**
 * Subtract multiple sets
 *
 * @param key Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sdiffAwait(key : String, cmpkeys : List<String>) : JsonArray {
  return awaitResult{
    this.sdiff(key, cmpkeys, it)
  }
}

/**
 * Subtract multiple sets and store the resulting set in a key
 *
 * @param destkey Destination key where the result should be stored
 * @param key Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sdiffstoreAwait(destkey : String, key : String, cmpkeys : List<String>) : Long {
  return awaitResult{
    this.sdiffstore(destkey, key, cmpkeys, it)
  }
}

/**
 * Change the selected database for the current connection
 *
 * @param dbindex Index identifying the new active database
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.selectAwait(dbindex : Int) : String {
  return awaitResult{
    this.select(dbindex, it)
  }
}

/**
 * Set the string value of a key
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setAwait(key : String, value : String) : Unit {
  return awaitResult{
    this.set(key, value, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set the string value of a key
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param options Set options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setWithOptionsAwait(key : String, value : String, options : SetOptions) : String {
  return awaitResult{
    this.setWithOptions(key, value, options, it)
  }
}

/**
 * Set the binary string value of a key - without encoding as utf-8
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setBinaryAwait(key : String, value : Buffer) : Unit {
  return awaitResult{
    this.setBinary(key, value, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set the string value of a key
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param options Set options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setBinaryWithOptionsAwait(key : String, value : Buffer, options : SetOptions) : Unit {
  return awaitResult{
    this.setBinaryWithOptions(key, value, options, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Sets or clears the bit at offset in the string value stored at key
 *
 * @param key Key string
 * @param offset Bit offset
 * @param bit New value - must be 1 or 0
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setbitAwait(key : String, offset : Long, bit : Int) : Long {
  return awaitResult{
    this.setbit(key, offset, bit, it)
  }
}

/**
 * Set the value and expiration of a key
 *
 * @param key Key string
 * @param seconds Number of seconds until the key expires
 * @param value New value for key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setexAwait(key : String, seconds : Long, value : String) : String {
  return awaitResult{
    this.setex(key, seconds, value, it)
  }
}

/**
 * Set the value of a key, only if the key does not exist
 *
 * @param key Key of which value to set
 * @param value New value for the key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setnxAwait(key : String, value : String) : Long {
  return awaitResult{
    this.setnx(key, value, it)
  }
}

/**
 * Overwrite part of a string at key starting at the specified offset
 *
 * @param key Key string
 * @param offset Offset - the maximum offset that you can set is 2^29 -1 (536870911), as Redis Strings are limited to 512 megabytes
 * @param value Value to overwrite with
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.setrangeAwait(key : String, offset : Int, value : String) : Long {
  return awaitResult{
    this.setrange(key, offset, value, it)
  }
}

/**
 * Intersect multiple sets
 *
 * @param keys List of keys to perform intersection on
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sinterAwait(keys : List<String>) : JsonArray {
  return awaitResult{
    this.sinter(keys, it)
  }
}

/**
 * Intersect multiple sets and store the resulting set in a key
 *
 * @param destkey Key where to store the results
 * @param keys List of keys to perform intersection on
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sinterstoreAwait(destkey : String, keys : List<String>) : Long {
  return awaitResult{
    this.sinterstore(destkey, keys, it)
  }
}

/**
 * Determine if a given value is a member of a set
 *
 * @param key Key string
 * @param member Member to look for
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sismemberAwait(key : String, member : String) : Long {
  return awaitResult{
    this.sismember(key, member, it)
  }
}

/**
 * Make the server a slave of another instance
 *
 * @param host Host to become this server's master
 * @param port Port of our new master
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.slaveofAwait(host : String, port : Int) : String {
  return awaitResult{
    this.slaveof(host, port, it)
  }
}

/**
 * Make this server a master
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.slaveofNooneAwait() : String {
  return awaitResult{
    this.slaveofNoone(it)
  }
}

/**
 * Read the Redis slow queries log
 *
 * @param limit Number of log entries to return. If value is less than zero all entries are returned
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.slowlogGetAwait(limit : Int) : JsonArray {
  return awaitResult{
    this.slowlogGet(limit, it)
  }
}

/**
 * Get the length of the Redis slow queries log
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.slowlogLenAwait() : Long {
  return awaitResult{
    this.slowlogLen(it)
  }
}

/**
 * Reset the Redis slow queries log
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.slowlogResetAwait() : Unit {
  return awaitResult{
    this.slowlogReset({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get all the members in a set
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.smembersAwait(key : String) : JsonArray {
  return awaitResult{
    this.smembers(key, it)
  }
}

/**
 * Move a member from one set to another
 *
 * @param key Key of source set currently containing the member
 * @param destkey Key identifying the destination set
 * @param member Member to move
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.smoveAwait(key : String, destkey : String, member : String) : Long {
  return awaitResult{
    this.smove(key, destkey, member, it)
  }
}

/**
 * Sort the elements in a list, set or sorted set
 *
 * @param key Key string
 * @param options Sort options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sortAwait(key : String, options : SortOptions) : JsonArray {
  return awaitResult{
    this.sort(key, options, it)
  }
}

/**
 * Remove and return a random member from a set
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.spopAwait(key : String) : String? {
  return awaitResult{
    this.spop(key, it)
  }
}

/**
 * Remove and return random members from a set
 *
 * @param key Key string
 * @param count Number of members to remove
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.spopManyAwait(key : String, count : Int) : JsonArray {
  return awaitResult{
    this.spopMany(key, count, it)
  }
}

/**
 * Get one or multiple random members from a set
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.srandmemberAwait(key : String) : String {
  return awaitResult{
    this.srandmember(key, it)
  }
}

/**
 * Get one or multiple random members from a set
 *
 * @param key Key string
 * @param count Number of members to get
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.srandmemberCountAwait(key : String, count : Int) : JsonArray {
  return awaitResult{
    this.srandmemberCount(key, count, it)
  }
}

/**
 * Remove one member from a set
 *
 * @param key Key string
 * @param member Member to remove
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sremAwait(key : String, member : String) : Long {
  return awaitResult{
    this.srem(key, member, it)
  }
}

/**
 * Remove one or more members from a set
 *
 * @param key Key string
 * @param members Members to remove
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sremManyAwait(key : String, members : List<String>) : Long {
  return awaitResult{
    this.sremMany(key, members, it)
  }
}

/**
 * Get the length of the value stored in a key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.strlenAwait(key : String) : Long {
  return awaitResult{
    this.strlen(key, it)
  }
}

/**
 * Listen for messages published to the given channels
 *
 * @param channel Channel to subscribe to
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.subscribeAwait(channel : String) : JsonArray {
  return awaitResult{
    this.subscribe(channel, it)
  }
}

/**
 * Listen for messages published to the given channels
 *
 * @param channels List of channels to subscribe to
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.subscribeManyAwait(channels : List<String>) : JsonArray {
  return awaitResult{
    this.subscribeMany(channels, it)
  }
}

/**
 * Add multiple sets
 *
 * @param keys List of keys identifying sets to add up
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sunionAwait(keys : List<String>) : JsonArray {
  return awaitResult{
    this.sunion(keys, it)
  }
}

/**
 * Add multiple sets and store the resulting set in a key
 *
 * @param destkey Destination key
 * @param keys List of keys identifying sets to add up
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sunionstoreAwait(destkey : String, keys : List<String>) : Long {
  return awaitResult{
    this.sunionstore(destkey, keys, it)
  }
}

/**
 * Internal command used for replication
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.syncAwait() : Unit {
  return awaitResult{
    this.sync({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Return the current server time
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.timeAwait() : JsonArray {
  return awaitResult{
    this.time(it)
  }
}

/**
 * Get the time to live for a key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.ttlAwait(key : String) : Long {
  return awaitResult{
    this.ttl(key, it)
  }
}

/**
 * Determine the type stored at key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.typeAwait(key : String) : String {
  return awaitResult{
    this.type(key, it)
  }
}

/**
 * Stop listening for messages posted to the given channels
 *
 * @param channels List of channels to subscribe to
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.unsubscribeAwait(channels : List<String>) : Unit {
  return awaitResult{
    this.unsubscribe(channels, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
 *
 * @param numSlaves 
 * @param timeout 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.waitAwait(numSlaves : Long, timeout : Long) : String {
  return awaitResult{
    this.wait(numSlaves, timeout, it)
  }
}

/**
 * Add one or more members to a sorted set, or update its score if it already exists
 *
 * @param key Key string
 * @param score Score used for sorting
 * @param member New member key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zaddAwait(key : String, score : Double, member : String) : Long {
  return awaitResult{
    this.zadd(key, score, member, it)
  }
}

/**
 * Add one or more members to a sorted set, or update its score if it already exists
 *
 * @param key Key string
 * @param members New member keys and their scores
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zaddManyAwait(key : String, members : Map<String,Double>) : Long {
  return awaitResult{
    this.zaddMany(key, members, it)
  }
}

/**
 * Get the number of members in a sorted set
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zcardAwait(key : String) : Long {
  return awaitResult{
    this.zcard(key, it)
  }
}

/**
 * Count the members in a sorted set with scores within the given values
 *
 * @param key Key string
 * @param min Minimum score
 * @param max Maximum score
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zcountAwait(key : String, min : Double, max : Double) : Long {
  return awaitResult{
    this.zcount(key, min, max, it)
  }
}

/**
 * Increment the score of a member in a sorted set
 *
 * @param key Key string
 * @param increment Increment amount
 * @param member Member key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zincrbyAwait(key : String, increment : Double, member : String) : String {
  return awaitResult{
    this.zincrby(key, increment, member, it)
  }
}

/**
 * Intersect multiple sorted sets and store the resulting sorted set in a new key
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zinterstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : Long {
  return awaitResult{
    this.zinterstore(destkey, sets, options, it)
  }
}

/**
 * Intersect multiple sorted sets and store the resulting sorted set in a new key using weights for scoring
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zinterstoreWeighedAwait(destkey : String, sets : Map<String,Double>, options : AggregateOptions) : Long {
  return awaitResult{
    this.zinterstoreWeighed(destkey, sets, options, it)
  }
}

/**
 * Count the number of members in a sorted set between a given lexicographical range
 *
 * @param key Key string
 * @param min Pattern to compare against for minimum value
 * @param max Pattern to compare against for maximum value
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zlexcountAwait(key : String, min : String, max : String) : Long {
  return awaitResult{
    this.zlexcount(key, min, max, it)
  }
}

/**
 * Return a range of members in a sorted set, by index
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrangeAwait(key : String, start : Long, stop : Long) : JsonArray {
  return awaitResult{
    this.zrange(key, start, stop, it)
  }
}

/**
 * Return a range of members in a sorted set, by index
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param options Range options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrangeWithOptionsAwait(key : String, start : Long, stop : Long, options : RangeOptions) : JsonArray {
  return awaitResult{
    this.zrangeWithOptions(key, start, stop, options, it)
  }
}

/**
 * Return a range of members in a sorted set, by lexicographical range
 *
 * @param key Key string
 * @param min Pattern representing a minimum allowed value
 * @param max Pattern representing a maximum allowed value
 * @param options Limit options where limit can be specified
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrangebylexAwait(key : String, min : String, max : String, options : LimitOptions) : JsonArray {
  return awaitResult{
    this.zrangebylex(key, min, max, options, it)
  }
}

/**
 * Return a range of members in a sorted set, by score
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @param options Range and limit options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrangebyscoreAwait(key : String, min : String, max : String, options : RangeLimitOptions) : JsonArray {
  return awaitResult{
    this.zrangebyscore(key, min, max, options, it)
  }
}

/**
 * Determine the index of a member in a sorted set
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrankAwait(key : String, member : String) : Long {
  return awaitResult{
    this.zrank(key, member, it)
  }
}

/**
 * Remove one member from a sorted set
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zremAwait(key : String, member : String) : Long {
  return awaitResult{
    this.zrem(key, member, it)
  }
}

/**
 * Remove one or more members from a sorted set
 *
 * @param key Key string
 * @param members Members in the sorted set identified by key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zremManyAwait(key : String, members : List<String>) : Long {
  return awaitResult{
    this.zremMany(key, members, it)
  }
}

/**
 * Remove all members in a sorted set between the given lexicographical range
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zremrangebylexAwait(key : String, min : String, max : String) : Long {
  return awaitResult{
    this.zremrangebylex(key, min, max, it)
  }
}

/**
 * Remove all members in a sorted set within the given indexes
 *
 * @param key Key string
 * @param start Start index
 * @param stop Stop index
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zremrangebyrankAwait(key : String, start : Long, stop : Long) : Long {
  return awaitResult{
    this.zremrangebyrank(key, start, stop, it)
  }
}

/**
 * Remove all members in a sorted set within the given scores
 *
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zremrangebyscoreAwait(key : String, min : String, max : String) : Long {
  return awaitResult{
    this.zremrangebyscore(key, min, max, it)
  }
}

/**
 * Return a range of members in a sorted set, by index, with scores ordered from high to low
 *
 * @param key Key string
 * @param start Start index for the range
 * @param stop Stop index for the range - inclusive
 * @param options Range options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrangeAwait(key : String, start : Long, stop : Long, options : RangeOptions) : JsonArray {
  return awaitResult{
    this.zrevrange(key, start, stop, options, it)
  }
}

/**
 * Return a range of members in a sorted set, by score, between the given lexicographical range with scores ordered from high to low
 *
 * @param key Key string
 * @param max Pattern defining a maximum value
 * @param min Pattern defining a minimum value
 * @param options Limit options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrangebylexAwait(key : String, max : String, min : String, options : LimitOptions) : JsonArray {
  return awaitResult{
    this.zrevrangebylex(key, max, min, options, it)
  }
}

/**
 * Return a range of members in a sorted set, by score, with scores ordered from high to low
 *
 * @param key Key string
 * @param max Pattern defining a maximum value
 * @param min Pattern defining a minimum value
 * @param options Range and limit options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrangebyscoreAwait(key : String, max : String, min : String, options : RangeLimitOptions) : JsonArray {
  return awaitResult{
    this.zrevrangebyscore(key, max, min, options, it)
  }
}

/**
 * Determine the index of a member in a sorted set, with scores ordered from high to low
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zrevrankAwait(key : String, member : String) : Long {
  return awaitResult{
    this.zrevrank(key, member, it)
  }
}

/**
 * Get the score associated with the given member in a sorted set
 *
 * @param key Key string
 * @param member Member in the sorted set identified by key
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zscoreAwait(key : String, member : String) : String {
  return awaitResult{
    this.zscore(key, member, it)
  }
}

/**
 * Add multiple sorted sets and store the resulting sorted set in a new key
 *
 * @param destkey Destination key
 * @param sets List of keys identifying sorted sets
 * @param options Aggregation options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zunionstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : Long {
  return awaitResult{
    this.zunionstore(destkey, sets, options, it)
  }
}

/**
 * Add multiple sorted sets using weights, and store the resulting sorted set in a new key
 *
 * @param key Destination key
 * @param sets Map containing set-key:weight pairs
 * @param options Aggregation options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zunionstoreWeighedAwait(key : String, sets : Map<String,Double>, options : AggregateOptions) : Long {
  return awaitResult{
    this.zunionstoreWeighed(key, sets, options, it)
  }
}

/**
 * Incrementally iterate the keys space
 *
 * @param cursor Cursor id
 * @param options Scan options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scanAwait(cursor : String, options : ScanOptions) : JsonArray {
  return awaitResult{
    this.scan(cursor, options, it)
  }
}

/**
 * Incrementally iterate Set elements
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.sscanAwait(key : String, cursor : String, options : ScanOptions) : JsonArray {
  return awaitResult{
    this.sscan(key, cursor, options, it)
  }
}

/**
 * Incrementally iterate hash fields and associated values
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hscanAwait(key : String, cursor : String, options : ScanOptions) : JsonArray {
  return awaitResult{
    this.hscan(key, cursor, options, it)
  }
}

/**
 * Incrementally iterate sorted sets elements and associated scores
 *
 * @param key Key string
 * @param cursor Cursor id
 * @param options Scan options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.zscanAwait(key : String, cursor : String, options : ScanOptions) : JsonArray {
  return awaitResult{
    this.zscan(key, cursor, options, it)
  }
}

/**
 * Add one or more geospatial items in the geospatial index represented using a sorted set.
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param member member
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geoaddAwait(key : String, longitude : Double, latitude : Double, member : String) : Long {
  return awaitResult{
    this.geoadd(key, longitude, latitude, member, it)
  }
}

/**
 * Add one or more geospatial items in the geospatial index represented using a sorted set.
 *
 * @param key Key string
 * @param members list of &lt;lon, lat, member&gt;
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geoaddManyAwait(key : String, members : List<GeoMember>) : Long {
  return awaitResult{
    this.geoaddMany(key, members, it)
  }
}

/**
 * Return valid Geohash strings representing the position of one or more elements in a sorted set value representing
 * a geospatial index (where elements were added using GEOADD).
 *
 * @param key Key string
 * @param member member
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geohashAwait(key : String, member : String) : JsonArray {
  return awaitResult{
    this.geohash(key, member, it)
  }
}

/**
 * Return valid Geohash strings representing the position of one or more elements in a sorted set value representing
 * a geospatial index (where elements were added using GEOADD).
 *
 * @param key Key string
 * @param members list of members
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geohashManyAwait(key : String, members : List<String>) : JsonArray {
  return awaitResult{
    this.geohashMany(key, members, it)
  }
}

/**
 * Return the positions (longitude,latitude) of all the specified members of the geospatial index represented by the
 * sorted set at key.
 *
 * @param key Key string
 * @param member member
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geoposAwait(key : String, member : String) : JsonArray {
  return awaitResult{
    this.geopos(key, member, it)
  }
}

/**
 * Return the positions (longitude,latitude) of all the specified members of the geospatial index represented by the
 * sorted set at key.
 *
 * @param key Key string
 * @param members list of members
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geoposManyAwait(key : String, members : List<String>) : JsonArray {
  return awaitResult{
    this.geoposMany(key, members, it)
  }
}

/**
 * Return the distance between two members in the geospatial index represented by the sorted set.
 *
 * @param key Key string
 * @param member1 member 1
 * @param member2 member 2
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geodistAwait(key : String, member1 : String, member2 : String) : String {
  return awaitResult{
    this.geodist(key, member1, member2, it)
  }
}

/**
 * Return the distance between two members in the geospatial index represented by the sorted set.
 *
 * @param key Key string
 * @param member1 member 1
 * @param member2 member 2
 * @param unit geo unit
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.geodistWithUnitAwait(key : String, member1 : String, member2 : String, unit : GeoUnit) : String {
  return awaitResult{
    this.geodistWithUnit(key, member1, member2, unit, it)
  }
}

/**
 * Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders
 * of the area specified with the center location and the maximum distance from the center (the radius).
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit) : JsonArray {
  return awaitResult{
    this.georadius(key, longitude, latitude, radius, unit, it)
  }
}

/**
 * Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders
 * of the area specified with the center location and the maximum distance from the center (the radius).
 *
 * @param key Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusWithOptionsAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : JsonArray {
  return awaitResult{
    this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it)
  }
}

/**
 * This command is exactly like GEORADIUS with the sole difference that instead of taking, as the center of the area
 * to query, a longitude and latitude value, it takes the name of a member already existing inside the geospatial
 * index represented by the sorted set.
 *
 * @param key Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusbymemberAwait(key : String, member : String, radius : Double, unit : GeoUnit) : JsonArray {
  return awaitResult{
    this.georadiusbymember(key, member, radius, unit, it)
  }
}

/**
 * This command is exactly like GEORADIUS with the sole difference that instead of taking, as the center of the area
 * to query, a longitude and latitude value, it takes the name of a member already existing inside the geospatial
 * index represented by the sorted set.
 *
 * @param key Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.georadiusbymemberWithOptionsAwait(key : String, member : String, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : JsonArray {
  return awaitResult{
    this.georadiusbymemberWithOptions(key, member, radius, unit, options, it)
  }
}

/**
 * Instruct the server whether to reply to commands.
 *
 * @param options 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.clientReplyAwait(options : ClientReplyOptions) : String {
  return awaitResult{
    this.clientReply(options, it)
  }
}

/**
 * Get the length of the value of a hash field.
 *
 * @param key Key String
 * @param field field
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.hstrlenAwait(key : String, field : String) : Long {
  return awaitResult{
    this.hstrlen(key, field, it)
  }
}

/**
 * Alters the last access time of a key(s). Returns the number of existing keys specified.
 *
 * @param key Key String
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.touchAwait(key : String) : Long {
  return awaitResult{
    this.touch(key, it)
  }
}

/**
 * Alters the last access time of a key(s). Returns the number of existing keys specified.
 *
 * @param keys list of keys
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.touchManyAwait(keys : List<String>) : Long {
  return awaitResult{
    this.touchMany(keys, it)
  }
}

/**
 * Set the debug mode for executed scripts.
 *
 * @param scriptDebugOptions the option
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.scriptDebugAwait(scriptDebugOptions : ScriptDebugOptions) : String {
  return awaitResult{
    this.scriptDebug(scriptDebugOptions, it)
  }
}

/**
 * Perform arbitrary bitfield integer operations on strings.
 *
 * @param key Key string
 * @param bitFieldOptions 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitfieldAwait(key : String, bitFieldOptions : BitFieldOptions) : JsonArray {
  return awaitResult{
    this.bitfield(key, bitFieldOptions, it)
  }
}

/**
 * Perform arbitrary bitfield integer operations on strings.
 *
 * @param key Key string
 * @param commands 
 * @param overflow 
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.bitfieldWithOverflowAwait(key : String, commands : BitFieldOptions, overflow : BitFieldOverflowOptions) : JsonArray {
  return awaitResult{
    this.bitfieldWithOverflow(key, commands, overflow, it)
  }
}

/**
 * Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
 *
 * @param key Key to delete
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.unlinkAwait(key : String) : Long {
  return awaitResult{
    this.unlink(key, it)
  }
}

/**
 * Delete multiple keys asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
 *
 * @param keys List of keys to delete
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.unlinkManyAwait(keys : List<String>) : Long {
  return awaitResult{
    this.unlinkMany(keys, it)
  }
}

/**
 * Swaps two Redis databases
 *
 * @param index1 index of first database to swap
 * @param index2 index of second database to swap
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisClient original] using Vert.x codegen.
 */
suspend fun RedisClient.swapdbAwait(index1 : Int, index2 : Int) : String {
  return awaitResult{
    this.swapdb(index1, index2, it)
  }
}

