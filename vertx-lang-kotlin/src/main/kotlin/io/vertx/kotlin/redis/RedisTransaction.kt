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
 * Close the client - when it is fully closed the handler will be called.
 *
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.closeAwait() : Unit {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.appendAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.authAwait(password : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bgrewriteaofAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bgsaveAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitcountAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitcountRangeAwait(key : String, start : Long, end : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitopAwait(operation : BitOperation, destkey : String, keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitposAwait(key : String, bit : Int) : String {
  return awaitResult{
    this.bitpos(key, bit, it)
  }
}

/**
 * Find first bit set or clear in a string
 * <p>
 * See also bitposRange() method, which takes start, and stop offset.
 *
 * @param key Key string
 * @param bit What bit value to look for - must be 1, or 0
 * @param start Start offset
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitposFromAwait(key : String, bit : Int, start : Int) : String {
  return awaitResult{
    this.bitposFrom(key, bit, start, it)
  }
}

/**
 * Find first bit set or clear in a string
 * <p>
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.bitposRangeAwait(key : String, bit : Int, start : Int, stop : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.blpopAwait(key : String, seconds : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.blpopManyAwait(keys : List<String>, seconds : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.brpopAwait(key : String, seconds : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.brpopManyAwait(keys : List<String>, seconds : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.brpoplpushAwait(key : String, destkey : String, seconds : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientKillAwait(filter : KillFilter) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientListAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientGetnameAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientPauseAwait(millis : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clientSetnameAwait(name : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterAddslotsAwait(slots : List<String>) : String {
  return awaitResult{
    this.clusterAddslots(slots, it)
  }
}

/**
 * Return the number of failure reports active for a given node.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterCountFailureReportsAwait(nodeId : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterCountkeysinslotAwait(slot : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterDelslotsAwait(slot : Long) : String {
  return awaitResult{
    this.clusterDelslots(slot, it)
  }
}

/**
 * Set hash slots as unbound in receiving node.
 *
 * @param slots 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterDelslotsManyAwait(slots : List<String>) : String {
  return awaitResult{
    this.clusterDelslotsMany(slots, it)
  }
}

/**
 * Forces a slave to perform a manual failover of its master.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterFailoverAwait() : String {
  return awaitResult{
    this.clusterFailover(it)
  }
}

/**
 * Forces a slave to perform a manual failover of its master.
 *
 * @param options 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterFailOverWithOptionsAwait(options : FailoverOptions) : String {
  return awaitResult{
    this.clusterFailOverWithOptions(options, it)
  }
}

/**
 * Remove a node from the nodes table.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterForgetAwait(nodeId : String) : String {
  return awaitResult{
    this.clusterForget(nodeId, it)
  }
}

/**
 * Return local key names in the specified hash slot.
 *
 * @param slot 
 * @param count 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterGetkeysinslotAwait(slot : Long, count : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterInfoAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterKeyslotAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterMeetAwait(ip : String, port : Long) : String {
  return awaitResult{
    this.clusterMeet(ip, port, it)
  }
}

/**
 * Get Cluster config for the node.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterNodesAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterReplicateAwait(nodeId : String) : String {
  return awaitResult{
    this.clusterReplicate(nodeId, it)
  }
}

/**
 * Reset a Redis Cluster node.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterResetAwait() : String {
  return awaitResult{
    this.clusterReset(it)
  }
}

/**
 * Reset a Redis Cluster node.
 *
 * @param options 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterResetWithOptionsAwait(options : ResetOptions) : String {
  return awaitResult{
    this.clusterResetWithOptions(options, it)
  }
}

/**
 * Forces the node to save cluster state on disk.
 *
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSaveconfigAwait() : String {
  return awaitResult{
    this.clusterSaveconfig(it)
  }
}

/**
 * Set the configuration epoch in a new node.
 *
 * @param epoch 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSetConfigEpochAwait(epoch : Long) : String {
  return awaitResult{
    this.clusterSetConfigEpoch(epoch, it)
  }
}

/**
 * Bind an hash slot to a specific node.
 *
 * @param slot 
 * @param subcommand 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSetslotAwait(slot : Long, subcommand : SlotCmd) : String {
  return awaitResult{
    this.clusterSetslot(slot, subcommand, it)
  }
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSetslotWithNodeAwait(slot : Long, subcommand : SlotCmd, nodeId : String) : String {
  return awaitResult{
    this.clusterSetslotWithNode(slot, subcommand, nodeId, it)
  }
}

/**
 * List slave nodes of the specified master node.
 *
 * @param nodeId 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSlavesAwait(nodeId : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.clusterSlotsAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandCountAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandGetkeysAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.commandInfoAwait(commands : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.configGetAwait(parameter : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.configRewriteAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.configSetAwait(parameter : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.configResetstatAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.dbsizeAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.debugObjectAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.debugSegfaultAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.decrAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.decrbyAwait(key : String, decrement : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.delAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.delManyAwait(keys : List<String>) : String {
  return awaitResult{
    this.delMany(keys, it)
  }
}

/**
 * Discard all commands issued after MULTI
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.discardAwait() : String {
  return awaitResult{
    this.discard(it)
  }
}

/**
 * Return a serialized version of the value stored at the specified key.
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.dumpAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.echoAwait(message : String) : String {
  return awaitResult{
    this.echo(message, it)
  }
}

/**
 * Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
 * for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
 * <p>
 * When a reply if for example a String the handler will be called with a JsonArray with a single element containing
 * the String.
 *
 * @param script Lua script to evaluate
 * @param keys List of keys
 * @param args List of argument values
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.evalAwait(script : String, keys : List<String>, args : List<String>) : String {
  return awaitResult{
    this.eval(script, keys, args, it)
  }
}

/**
 * Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
 * for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
 * <p>
 * When a reply if for example a String the handler will be called with a JsonArray with a single element containing
 * the String.
 *
 * @param sha1 SHA1 digest of the script cached on the server
 * @param keys List of keys
 * @param values List of values
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.evalshaAwait(sha1 : String, keys : List<String>, values : List<String>) : String {
  return awaitResult{
    this.evalsha(sha1, keys, values, it)
  }
}

/**
 * Execute all commands issued after MULTI
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.execAwait() : JsonArray {
  return awaitResult{
    this.exec(it)
  }
}

/**
 * Determine if a key exists
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.existsAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.existsManyAwait(keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.expireAwait(key : String, seconds : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.expireatAwait(key : String, seconds : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.flushallAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.flushdbAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.getAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.getBinaryAwait(key : String) : Buffer {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.getbitAwait(key : String, offset : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.getrangeAwait(key : String, start : Long, end : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.getsetAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hdelAwait(key : String, field : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hdelManyAwait(key : String, fields : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hexistsAwait(key : String, field : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hgetAwait(key : String, field : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hgetallAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hincrbyAwait(key : String, field : String, increment : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hincrbyfloatAwait(key : String, field : String, increment : Double) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hkeysAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hlenAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hmgetAwait(key : String, fields : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hmsetAwait(key : String, values : JsonObject) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hsetAwait(key : String, field : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hsetnxAwait(key : String, field : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hvalsAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.incrAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.incrbyAwait(key : String, increment : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.incrbyfloatAwait(key : String, increment : Double) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.infoAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.infoSectionAwait(section : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.keysAwait(pattern : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lastsaveAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lindexAwait(key : String, index : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.linsertAwait(key : String, option : InsertOptions, pivot : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.llenAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpopAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpushManyAwait(key : String, values : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpushAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lpushxAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lrangeAwait(key : String, from : Long, to : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lremAwait(key : String, count : Long, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.lsetAwait(key : String, index : Long, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.ltrimAwait(key : String, from : Long, to : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.mgetAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.mgetManyAwait(keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.migrateAwait(host : String, port : Int, key : String, destdb : Int, timeout : Long, options : MigrateOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.monitorAwait() : String {
  return awaitResult{
    this.monitor(it)
  }
}

/**
 * Move a key to another database
 *
 * @param key Key to migrate
 * @param destdb Destination database index
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.moveAwait(key : String, destdb : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.msetAwait(keyvals : JsonObject) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.msetnxAwait(keyvals : JsonObject) : String {
  return awaitResult{
    this.msetnx(keyvals, it)
  }
}

/**
 * Mark the start of a RedisTransaction block
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.multiAwait() : String {
  return awaitResult{
    this.multi(it)
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.objectAwait(key : String, cmd : ObjectCmd) : String {
  return awaitResult{
    this.`object`(key, cmd, it)
  }
}

/**
 * Remove the expiration from a key
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.persistAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pexpireAwait(key : String, millis : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pexpireatAwait(key : String, millis : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfaddAwait(key : String, element : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfaddManyAwait(key : String, elements : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfcountAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfcountManyAwait(keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pfmergeAwait(destkey : String, keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pingAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.psetexAwait(key : String, millis : Long, value : String) : String {
  return awaitResult{
    this.psetex(key, millis, value, it)
  }
}

/**
 * Listen for messages published to channels matching the given pattern
 *
 * @param pattern Pattern string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.psubscribeAwait(pattern : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.psubscribeManyAwait(patterns : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pubsubChannelsAwait(pattern : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pubsubNumsubAwait(channels : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pubsubNumpatAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.pttlAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.publishAwait(channel : String, message : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.punsubscribeAwait(patterns : List<String>) : String {
  return awaitResult{
    this.punsubscribe(patterns, it)
  }
}

/**
 * Return a random key from the keyspace
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.randomkeyAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.renameAwait(key : String, newkey : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.renamenxAwait(key : String, newkey : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.restoreAwait(key : String, millis : Long, serialized : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.roleAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpopAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpoplpushAwait(key : String, destkey : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpushManyAwait(key : String, values : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpushAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.rpushxAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.saddAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.saddManyAwait(key : String, members : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.saveAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scardAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptExistsAwait(script : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptExistsManyAwait(scripts : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptFlushAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptKillAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scriptLoadAwait(script : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sdiffAwait(key : String, cmpkeys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sdiffstoreAwait(destkey : String, key : String, cmpkeys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.selectAwait(dbindex : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setAwait(key : String, value : String) : String {
  return awaitResult{
    this.set(key, value, it)
  }
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setWithOptionsAwait(key : String, value : String, options : SetOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setBinaryAwait(key : String, value : Buffer) : String {
  return awaitResult{
    this.setBinary(key, value, it)
  }
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setBinaryWithOptionsAwait(key : String, value : Buffer, options : SetOptions) : String {
  return awaitResult{
    this.setBinaryWithOptions(key, value, options, it)
  }
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setbitAwait(key : String, offset : Long, bit : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setexAwait(key : String, seconds : Long, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setnxAwait(key : String, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.setrangeAwait(key : String, offset : Int, value : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sinterAwait(keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sinterstoreAwait(destkey : String, keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sismemberAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.slaveofAwait(host : String, port : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.slaveofNooneAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.slowlogGetAwait(limit : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.slowlogLenAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.slowlogResetAwait() : String {
  return awaitResult{
    this.slowlogReset(it)
  }
}

/**
 * Get all the members in a set
 *
 * @param key Key string
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.smembersAwait(key : String) : JsonArray {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.smoveAwait(key : String, destkey : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sortAwait(key : String, options : SortOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.spopAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.spopManyAwait(key : String, count : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.srandmemberAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.srandmemberCountAwait(key : String, count : Int) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sremAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sremManyAwait(key : String, members : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.strlenAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.subscribeAwait(channel : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.subscribeManyAwait(channels : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sunionAwait(keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sunionstoreAwait(destkey : String, keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.syncAwait() : String {
  return awaitResult{
    this.sync(it)
  }
}

/**
 * Return the current server time
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.timeAwait() : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.ttlAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.typeAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.unsubscribeAwait(channels : List<String>) : String {
  return awaitResult{
    this.unsubscribe(channels, it)
  }
}

/**
 * Forget about all watched keys
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.unwatchAwait() : String {
  return awaitResult{
    this.unwatch(it)
  }
}

/**
 * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
 *
 * @param numSlaves 
 * @param timeout 
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.waitAwait(numSlaves : Long, timeout : Long) : String {
  return awaitResult{
    this.wait(numSlaves, timeout, it)
  }
}

/**
 * Watch the given keys to determine execution of the MULTI/EXEC block
 *
 * @param key Key to watch
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.watchAwait(key : String) : String {
  return awaitResult{
    this.watch(key, it)
  }
}

/**
 * Watch the given keys to determine execution of the MULTI/EXEC block
 *
 * @param keys List of keys to watch
 * @param handler Handler for the result of this call.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.watchManyAwait(keys : List<String>) : String {
  return awaitResult{
    this.watchMany(keys, it)
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zaddAwait(key : String, score : Double, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zaddManyAwait(key : String, members : Map<String,Double>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zcardAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zcountAwait(key : String, min : Double, max : Double) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zincrbyAwait(key : String, increment : Double, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zinterstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zinterstoreWeighedAwait(destkey : String, sets : Map<String,Double>, options : AggregateOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zlexcountAwait(key : String, min : String, max : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangeAwait(key : String, start : Long, stop : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangeWithOptionsAwait(key : String, start : Long, stop : Long, options : RangeOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangebylexAwait(key : String, min : String, max : String, options : LimitOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrangebyscoreAwait(key : String, min : String, max : String, options : RangeLimitOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrankAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremManyAwait(key : String, members : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremrangebylexAwait(key : String, min : String, max : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremrangebyrankAwait(key : String, start : Long, stop : Long) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zremrangebyscoreAwait(key : String, min : String, max : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrangeAwait(key : String, start : Long, stop : Long, options : RangeOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrangebylexAwait(key : String, max : String, min : String, options : LimitOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrangebyscoreAwait(key : String, max : String, min : String, options : RangeLimitOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zrevrankAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zscoreAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zunionstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zunionstoreWeighedAwait(key : String, sets : Map<String,Double>, options : AggregateOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.scanAwait(cursor : String, options : ScanOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.sscanAwait(key : String, cursor : String, options : ScanOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.hscanAwait(key : String, cursor : String, options : ScanOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.zscanAwait(key : String, cursor : String, options : ScanOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoaddAwait(key : String, longitude : Double, latitude : Double, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoaddManyAwait(key : String, members : List<GeoMember>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geohashAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geohashManyAwait(key : String, members : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoposAwait(key : String, member : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geoposManyAwait(key : String, members : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geodistAwait(key : String, member1 : String, member2 : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.geodistWithUnitAwait(key : String, member1 : String, member2 : String, unit : GeoUnit) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusWithOptionsAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusbymemberAwait(key : String, member : String, radius : Double, unit : GeoUnit) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.georadiusbymemberWithOptionsAwait(key : String, member : String, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : String {
  return awaitResult{
    this.georadiusbymemberWithOptions(key, member, radius, unit, options, it)
  }
}

/**
 * Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
 *
 * @param key Key string
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.unlinkAwait(key : String) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.unlinkManyAwait(keys : List<String>) : String {
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
 * NOTE: This function has been automatically generated from the [io.vertx.redis.RedisTransaction original] using Vert.x codegen.
 */
suspend fun RedisTransaction.swapdbAwait(index1 : Int, index2 : Int) : String {
  return awaitResult{
    this.swapdb(index1, index2, it)
  }
}

