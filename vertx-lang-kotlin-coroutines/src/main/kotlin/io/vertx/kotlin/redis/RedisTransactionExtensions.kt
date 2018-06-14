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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList
import kotlin.collections.MutableMap

/**
 *  Close the client - when it is fully closed the handler will be called. */
suspend fun RedisTransaction.close() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Append a value to a key
 * @param key     Key string
 * @param value   Value to append
 * @since Redis 2.0.0
 *  group: string
 */
suspend fun RedisTransaction.append(key: String, value: String): String {
  return awaitResult { this.append(key, value, it) }
}

/**
 *  Authenticate to the server
 * @param password Password for authentication
 * @since Redis 1.0.0
 *  group: connection
 */
suspend fun RedisTransaction.auth(password: String): String {
  return awaitResult { this.auth(password, it) }
}

/**
 *  Asynchronously rewrite the append-only file
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.bgrewriteaof(): String {
  return awaitResult { this.bgrewriteaof(it) }
}

/**
 *  Asynchronously save the dataset to disk
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.bgsave(): String {
  return awaitResult { this.bgsave(it) }
}

/**
 *  Count set bits in a string
 * @param key     Key string
 * @since Redis 2.6.0
 *  group: string
 */
suspend fun RedisTransaction.bitcount(key: String): String {
  return awaitResult { this.bitcount(key, it) }
}

/**
 *  Count set bits in a string
 * @param key     Key string
 * @param start   Start index
 * @param end     End index
 * @since Redis 2.6.0
 *  group: string
 */
suspend fun RedisTransaction.bitcountRange(
  key: String,
  start: Long,
  end: Long
): String {
  return awaitResult { this.bitcountRange(key, start, end, it) }
}

/**
 *  Perform bitwise operations between strings
 * @param operation Bitwise operation to perform
 * @param destkey   Destination key where result is stored
 * @param keys      List of keys on which to perform the operation
 * @since Redis 2.6.0
 *  group: string
 */
suspend fun RedisTransaction.bitop(
  operation: BitOperation,
  destkey: String,
  keys: MutableList<String>
): String {
  return awaitResult { this.bitop(operation, destkey, keys, it) }
}

/**
 *  Find first bit set or clear in a string
 * @param key     Key string
 * @param bit     What bit value to look for - must be 1, or 0
 * @since Redis 2.8.7
 *  group: string
 */
suspend fun RedisTransaction.bitpos(key: String, bit: Int): String {
  return awaitResult { this.bitpos(key, bit, it) }
}

/**
 *  Find first bit set or clear in a string
 *  <p>
 *  See also bitposRange() method, which takes start, and stop offset.
 * @param key     Key string
 * @param bit     What bit value to look for - must be 1, or 0
 * @param start   Start offset
 * @since Redis 2.8.7
 *  group: string
 */
suspend fun RedisTransaction.bitposFrom(
  key: String,
  bit: Int,
  start: Int
): String {
  return awaitResult { this.bitposFrom(key, bit, start, it) }
}

/**
 *  Find first bit set or clear in a string
 *  <p>
 *  Note: when both start, and stop offsets are specified,
 *  behaviour is slightly different than if only start is specified
 * @param key     Key string
 * @param bit     What bit value to look for - must be 1, or 0
 * @param start   Start offset
 * @param stop    End offset - inclusive
 * @since Redis 2.8.7
 *  group: string
 */
suspend fun RedisTransaction.bitposRange(
  key: String,
  bit: Int,
  start: Int,
  stop: Int
): String {
  return awaitResult { this.bitposRange(key, bit, start, stop, it) }
}

/**
 *  Remove and get the first element in a list, or block until one is available
 * @param key     Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @since Redis 2.0.0
 *  group: list
 */
suspend fun RedisTransaction.blpop(key: String, seconds: Int): String {
  return awaitResult { this.blpop(key, seconds, it) }
}

/**
 *  Remove and get the first element in any of the lists, or block until one is available
 * @param keys    List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @since Redis 2.0.0
 *  group: list
 */
suspend fun RedisTransaction.blpopMany(keys: MutableList<String>, seconds: Int): String {
  return awaitResult { this.blpopMany(keys, seconds, it) }
}

/**
 *  Remove and get the last element in a list, or block until one is available
 * @param key     Key string identifying a list to watch
 * @param seconds Timeout in seconds
 * @since Redis 2.0.0
 *  group: list
 */
suspend fun RedisTransaction.brpop(key: String, seconds: Int): String {
  return awaitResult { this.brpop(key, seconds, it) }
}

/**
 *  Remove and get the last element in any of the lists, or block until one is available
 * @param keys    List of key strings identifying lists to watch
 * @param seconds Timeout in seconds
 * @since Redis 2.0.0
 *  group: list
 */
suspend fun RedisTransaction.brpopMany(keys: MutableList<String>, seconds: Int): String {
  return awaitResult { this.brpopMany(keys, seconds, it) }
}

/**
 *  Pop a value from a list, push it to another list and return it; or block until one is available
 * @param key     Key string identifying the source list
 * @param destkey Key string identifying the destination list
 * @param seconds Timeout in seconds
 * @since Redis 2.2.0
 *  group: list
 */
suspend fun RedisTransaction.brpoplpush(
  key: String,
  destkey: String,
  seconds: Int
): String {
  return awaitResult { this.brpoplpush(key, destkey, seconds, it) }
}

/**
 *  Kill the connection of a client
 * @param filter  Filter options
 * @since Redis 2.4.0
 *  group: server
 */
suspend fun RedisTransaction.clientKill(filter: KillFilter): String {
  return awaitResult { this.clientKill(filter, it) }
}

/**
 *  Get the list of client connections
 * @since Redis 2.4.0
 *  group: server
 */
suspend fun RedisTransaction.clientList(): String {
  return awaitResult { this.clientList(it) }
}

/**
 *  Get the current connection name
 * @since Redis 2.6.9
 *  group: server
 */
suspend fun RedisTransaction.clientGetname(): String {
  return awaitResult { this.clientGetname(it) }
}

/**
 *  Stop processing commands from clients for some time
 * @param millis  Pause time in milliseconds
 * @since Redis 2.9.50
 *  group: server
 */
suspend fun RedisTransaction.clientPause(millis: Long): String {
  return awaitResult { this.clientPause(millis, it) }
}

/**
 *  Set the current connection name
 * @param name    New name for current connection
 * @since Redis 2.6.9
 *  group: server
 */
suspend fun RedisTransaction.clientSetname(name: String): String {
  return awaitResult { this.clientSetname(name, it) }
}

/**
 *  Assign new hash slots to receiving node.
 * @param slots
 * @since Redis 3.0.0
 *  group: server
 */
suspend fun RedisTransaction.clusterAddslots(slots: MutableList<String>): String {
  return awaitResult { this.clusterAddslots(slots, it) }
}

/**
 *  Return the number of failure reports active for a given node.
 * @param nodeId
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterCountFailureReports(nodeId: String): String {
  return awaitResult { this.clusterCountFailureReports(nodeId, it) }
}

/**
 *  Return the number of local keys in the specified hash slot.
 * @param slot
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterCountkeysinslot(slot: Long): String {
  return awaitResult { this.clusterCountkeysinslot(slot, it) }
}

/**
 *  Set hash slots as unbound in receiving node.
 * @param slot
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterDelslots(slot: Long): String {
  return awaitResult { this.clusterDelslots(slot, it) }
}

/**
 *  Set hash slots as unbound in receiving node.
 * @param slots
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterDelslotsMany(slots: MutableList<String>): String {
  return awaitResult { this.clusterDelslotsMany(slots, it) }
}

/**
 *  Forces a slave to perform a manual failover of its master.
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterFailover(): String {
  return awaitResult { this.clusterFailover(it) }
}

/**
 *  Forces a slave to perform a manual failover of its master.
 * @param options
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterFailOverWithOptions(options: FailoverOptions): String {
  return awaitResult { this.clusterFailOverWithOptions(options, it) }
}

/**
 *  Remove a node from the nodes table.
 * @param nodeId
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterForget(nodeId: String): String {
  return awaitResult { this.clusterForget(nodeId, it) }
}

/**
 *  Return local key names in the specified hash slot.
 * @param slot
 * @param count
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterGetkeysinslot(slot: Long, count: Long): String {
  return awaitResult { this.clusterGetkeysinslot(slot, count, it) }
}

/**
 *  Provides info about Redis Cluster node state.
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterInfo(): String {
  return awaitResult { this.clusterInfo(it) }
}

/**
 *  Returns the hash slot of the specified key.
 * @param key
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterKeyslot(key: String): String {
  return awaitResult { this.clusterKeyslot(key, it) }
}

/**
 *  Force a node cluster to handshake with another node.
 * @param ip
 * @param port
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterMeet(ip: String, port: Long): String {
  return awaitResult { this.clusterMeet(ip, port, it) }
}

/**
 *  Get Cluster config for the node.
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterNodes(): String {
  return awaitResult { this.clusterNodes(it) }
}

/**
 *  Reconfigure a node as a slave of the specified master node.
 * @param nodeId
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterReplicate(nodeId: String): String {
  return awaitResult { this.clusterReplicate(nodeId, it) }
}

/**
 *  Reset a Redis Cluster node.
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterReset(): String {
  return awaitResult { this.clusterReset(it) }
}

/**
 *  Reset a Redis Cluster node.
 * @param options
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterResetWithOptions(options: ResetOptions): String {
  return awaitResult { this.clusterResetWithOptions(options, it) }
}

/**
 *  Forces the node to save cluster state on disk.
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterSaveconfig(): String {
  return awaitResult { this.clusterSaveconfig(it) }
}

/**
 *  Set the configuration epoch in a new node.
 * @param epoch
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterSetConfigEpoch(epoch: Long): String {
  return awaitResult { this.clusterSetConfigEpoch(epoch, it) }
}

/**
 *  Bind an hash slot to a specific node.
 * @param slot
 * @param subcommand
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterSetslot(slot: Long, subcommand: SlotCmd): String {
  return awaitResult { this.clusterSetslot(slot, subcommand, it) }
}

/**
 *  Bind an hash slot to a specific node.
 * @param slot
 * @param subcommand
 * @param nodeId
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterSetslotWithNode(
  slot: Long,
  subcommand: SlotCmd,
  nodeId: String
): String {
  return awaitResult { this.clusterSetslotWithNode(slot, subcommand, nodeId, it) }
}

/**
 *  List slave nodes of the specified master node.
 * @param nodeId
 * @since Redis 3.0.0
 *  group: cluster
 */
suspend fun RedisTransaction.clusterSlaves(nodeId: String): String {
  return awaitResult { this.clusterSlaves(nodeId, it) }
}

/**
 *  Get array of Cluster slot to node mappings
 * @since Redis 3.0.0
 *  group: server
 */
suspend fun RedisTransaction.clusterSlots(): String {
  return awaitResult { this.clusterSlots(it) }
}

/**
 *  Get array of Redis command details
 * @since Redis 2.8.13
 *  group: server
 */
suspend fun RedisTransaction.command(): String {
  return awaitResult { this.command(it) }
}

/**
 *  Get total number of Redis commands
 * @since Redis 2.8.13
 *  group: server
 */
suspend fun RedisTransaction.commandCount(): String {
  return awaitResult { this.commandCount(it) }
}

/**
 *  Extract keys given a full Redis command
 * @since Redis 2.8.13
 *  group: server
 */
suspend fun RedisTransaction.commandGetkeys(): String {
  return awaitResult { this.commandGetkeys(it) }
}

/**
 *  Get array of specific Redis command details
 * @param commands List of commands to get info for
 * @since Redis 2.8.13
 *  group: server
 */
suspend fun RedisTransaction.commandInfo(commands: MutableList<String>): String {
  return awaitResult { this.commandInfo(commands, it) }
}

/**
 *  Get the value of a configuration parameter
 * @param parameter Configuration parameter
 * @since Redis 2.0.0
 *  group: server
 */
suspend fun RedisTransaction.configGet(parameter: String): String {
  return awaitResult { this.configGet(parameter, it) }
}

/**
 *  Rewrite the configuration file with the in memory configuration
 * @since Redis 2.8.0
 *  group: server
 */
suspend fun RedisTransaction.configRewrite(): String {
  return awaitResult { this.configRewrite(it) }
}

/**
 *  Set a configuration parameter to the given value
 * @param parameter Configuration parameter
 * @param value     New value
 * @since Redis 2.0.0
 *  group: server
 */
suspend fun RedisTransaction.configSet(parameter: String, value: String): String {
  return awaitResult { this.configSet(parameter, value, it) }
}

/**
 *  Reset the stats returned by INFO
 * @since Redis 2.0.0
 *  group: server
 */
suspend fun RedisTransaction.configResetstat(): String {
  return awaitResult { this.configResetstat(it) }
}

/**
 *  Return the number of keys in the selected database
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.dbsize(): String {
  return awaitResult { this.dbsize(it) }
}

/**
 *  Get debugging information about a key
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.debugObject(key: String): String {
  return awaitResult { this.debugObject(key, it) }
}

/**
 *  Make the server crash
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.debugSegfault(): String {
  return awaitResult { this.debugSegfault(it) }
}

/**
 *  Decrement the integer value of a key by one
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.decr(key: String): String {
  return awaitResult { this.decr(key, it) }
}

/**
 *  Decrement the integer value of a key by the given number
 * @param key       Key string
 * @param decrement Value by which to decrement
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.decrby(key: String, decrement: Long): String {
  return awaitResult { this.decrby(key, decrement, it) }
}

/**
 *  Delete a key
 * @param key     Keys to delete
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.del(key: String): String {
  return awaitResult { this.del(key, it) }
}

/**
 *  Delete many keys
 * @param keys    List of keys to delete
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.delMany(keys: MutableList<String>): String {
  return awaitResult { this.delMany(keys, it) }
}

/**
 *  Discard all commands issued after MULTI
 * @since Redis 2.0.0
 *  group: RedisTransactions
 */
suspend fun RedisTransaction.discard(): String {
  return awaitResult { this.discard(it) }
}

/**
 *  Return a serialized version of the value stored at the specified key.
 * @param key     Key string
 * @since Redis 2.6.0
 *  group: generic
 */
suspend fun RedisTransaction.dump(key: String): String {
  return awaitResult { this.dump(key, it) }
}

/**
 *  Echo the given string
 * @param message String to echo
 * @since Redis 1.0.0
 *  group: connection
 */
suspend fun RedisTransaction.echo(message: String): String {
  return awaitResult { this.echo(message, it) }
}

/**
 *  Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
 *  for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
 *  <p>
 *  When a reply if for example a String the handler will be called with a JsonArray with a single element containing
 *  the String.
 * @param script  Lua script to evaluate
 * @param keys    List of keys
 * @param args    List of argument values
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.eval(
  script: String,
  keys: MutableList<String>,
  args: MutableList<String>
): String {
  return awaitResult { this.eval(script, keys, args, it) }
}

/**
 *  Execute a Lua script server side. Due to the dynamic nature of this command any response type could be returned
 *  for This reason and to ensure type safety the reply is always guaranteed to be a JsonArray.
 *  <p>
 *  When a reply if for example a String the handler will be called with a JsonArray with a single element containing
 *  the String.
 * @param sha1    SHA1 digest of the script cached on the server
 * @param keys    List of keys
 * @param values  List of values
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.evalsha(
  sha1: String,
  keys: MutableList<String>,
  values: MutableList<String>
): String {
  return awaitResult { this.evalsha(sha1, keys, values, it) }
}

/**
 *  Execute all commands issued after MULTI
 * @since Redis 1.2.0
 *  group: RedisTransactions
 */
suspend fun RedisTransaction.exec(): JsonArray {
  return awaitResult { this.exec(it) }
}

/**
 *  Determine if a key exists
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.exists(key: String): String {
  return awaitResult { this.exists(key, it) }
}

/**
 *  Determine if one or many keys exist
 * @param keys    List of key strings
 * @since Redis 3.0.3
 *  group: generic
 */
suspend fun RedisTransaction.existsMany(keys: MutableList<String>): String {
  return awaitResult { this.existsMany(keys, it) }
}

/**
 *  Set a key's time to live in seconds
 * @param key     Key string
 * @param seconds Time to live in seconds
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.expire(key: String, seconds: Int): String {
  return awaitResult { this.expire(key, seconds, it) }
}

/**
 *  Set the expiration for a key as a UNIX timestamp
 * @param key     Key string
 * @param seconds Expiry time as Unix timestamp in seconds
 * @since Redis 1.2.0
 *  group: generic
 */
suspend fun RedisTransaction.expireat(key: String, seconds: Long): String {
  return awaitResult { this.expireat(key, seconds, it) }
}

/**
 *  Remove all keys from all databases
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.flushall(): String {
  return awaitResult { this.flushall(it) }
}

/**
 *  Remove all keys from the current database
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.flushdb(): String {
  return awaitResult { this.flushdb(it) }
}

/**
 *  Get the value of a key
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.get(key: String): String {
  return awaitResult { this.get(key, it) }
}

/**
 *  Get the value of a key - without decoding as utf-8
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.getBinary(key: String): Buffer {
  return awaitResult { this.getBinary(key, it) }
}

/**
 *  Returns the bit value at offset in the string value stored at key
 * @param key     Key string
 * @param offset  Offset in bits
 * @since Redis 2.2.0
 *  group: string
 */
suspend fun RedisTransaction.getbit(key: String, offset: Long): String {
  return awaitResult { this.getbit(key, offset, it) }
}

/**
 *  Get a substring of the string stored at a key
 * @param key     Key string
 * @param start   Start offset
 * @param end     End offset - inclusive
 * @since Redis 2.4.0
 *  group: string
 */
suspend fun RedisTransaction.getrange(
  key: String,
  start: Long,
  end: Long
): String {
  return awaitResult { this.getrange(key, start, end, it) }
}

/**
 *  Set the string value of a key and return its old value
 * @param key     Key of which value to set
 * @param value   New value for the key
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.getset(key: String, value: String): String {
  return awaitResult { this.getset(key, value, it) }
}

/**
 *  Delete one or more hash fields
 * @param key     Key string
 * @param field   Field name
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hdel(key: String, field: String): String {
  return awaitResult { this.hdel(key, field, it) }
}

/**
 *  Delete one or more hash fields
 * @param key     Key string
 * @param fields  Field names
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hdelMany(key: String, fields: MutableList<String>): String {
  return awaitResult { this.hdelMany(key, fields, it) }
}

/**
 *  Determine if a hash field exists
 * @param key     Key string
 * @param field   Field name
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hexists(key: String, field: String): String {
  return awaitResult { this.hexists(key, field, it) }
}

/**
 *  Get the value of a hash field
 * @param key     Key string
 * @param field   Field name
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hget(key: String, field: String): String {
  return awaitResult { this.hget(key, field, it) }
}

/**
 *  Get all the fields and values in a hash
 * @param key     Key string
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hgetall(key: String): String {
  return awaitResult { this.hgetall(key, it) }
}

/**
 *  Increment the integer value of a hash field by the given number
 * @param key       Key string
 * @param field     Field name
 * @param increment Value by which to increment
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hincrby(
  key: String,
  field: String,
  increment: Long
): String {
  return awaitResult { this.hincrby(key, field, increment, it) }
}

/**
 *  Increment the float value of a hash field by the given amount
 * @param key       Key string
 * @param field     Field name
 * @param increment Value by which to increment
 * @since Redis 2.6.0
 *  group: hash
 */
suspend fun RedisTransaction.hincrbyfloat(
  key: String,
  field: String,
  increment: Double
): String {
  return awaitResult { this.hincrbyfloat(key, field, increment, it) }
}

/**
 *  Get all the fields in a hash
 * @param key     Key string
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hkeys(key: String): String {
  return awaitResult { this.hkeys(key, it) }
}

/**
 *  Get the number of fields in a hash
 * @param key     Key string
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hlen(key: String): String {
  return awaitResult { this.hlen(key, it) }
}

/**
 *  Get the values of all the given hash fields
 * @param key     Key string
 * @param fields  Field names
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hmget(key: String, fields: MutableList<String>): String {
  return awaitResult { this.hmget(key, fields, it) }
}

/**
 *  Set multiple hash fields to multiple values
 * @param key     Key string
 * @param values  Map of field:value pairs
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hmset(key: String, values: JsonObject): String {
  return awaitResult { this.hmset(key, values, it) }
}

/**
 *  Set the string value of a hash field
 * @param key     Key string
 * @param field   Field name
 * @param value   New value
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hset(
  key: String,
  field: String,
  value: String
): String {
  return awaitResult { this.hset(key, field, value, it) }
}

/**
 *  Set the value of a hash field, only if the field does not exist
 * @param key     Key string
 * @param field   Field name
 * @param value   New value
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hsetnx(
  key: String,
  field: String,
  value: String
): String {
  return awaitResult { this.hsetnx(key, field, value, it) }
}

/**
 *  Get all the values in a hash
 * @param key     Key string
 * @since Redis 2.0.0
 *  group: hash
 */
suspend fun RedisTransaction.hvals(key: String): String {
  return awaitResult { this.hvals(key, it) }
}

/**
 *  Increment the integer value of a key by one
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.incr(key: String): String {
  return awaitResult { this.incr(key, it) }
}

/**
 *  Increment the integer value of a key by the given amount
 * @param key       Key string
 * @param increment Value by which to increment
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.incrby(key: String, increment: Long): String {
  return awaitResult { this.incrby(key, increment, it) }
}

/**
 *  Increment the float value of a key by the given amount
 * @param key       Key string
 * @param increment Value by which to increment
 * @since Redis 2.6.0
 *  group: string
 */
suspend fun RedisTransaction.incrbyfloat(key: String, increment: Double): String {
  return awaitResult { this.incrbyfloat(key, increment, it) }
}

/**
 *  Get information and statistics about the server
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.info(): String {
  return awaitResult { this.info(it) }
}

/**
 *  Get information and statistics about the server
 * @param section Specific section of information to return
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.infoSection(section: String): String {
  return awaitResult { this.infoSection(section, it) }
}

/**
 *  Find all keys matching the given pattern
 * @param pattern Pattern to limit the keys returned
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.keys(pattern: String): String {
  return awaitResult { this.keys(pattern, it) }
}

/**
 *  Get the UNIX time stamp of the last successful save to disk
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.lastsave(): String {
  return awaitResult { this.lastsave(it) }
}

/**
 *  Get an element from a list by its index
 * @param key     Key string
 * @param index   Index of list element to get
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lindex(key: String, index: Int): String {
  return awaitResult { this.lindex(key, index, it) }
}

/**
 *  Insert an element before or after another element in a list
 * @param key     Key string
 * @param option  BEFORE or AFTER
 * @param pivot   Key to use as a pivot
 * @param value   Value to be inserted before or after the pivot
 * @since Redis 2.2.0
 *  group: list
 */
suspend fun RedisTransaction.linsert(
  key: String,
  option: InsertOptions,
  pivot: String,
  value: String
): String {
  return awaitResult { this.linsert(key, option, pivot, value, it) }
}

/**
 *  Get the length of a list
 * @param key     String key
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.llen(key: String): String {
  return awaitResult { this.llen(key, it) }
}

/**
 *  Remove and get the first element in a list
 * @param key     String key
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lpop(key: String): String {
  return awaitResult { this.lpop(key, it) }
}

/**
 *  Prepend one or multiple values to a list
 * @param key     Key string
 * @param values  Values to be added at the beginning of the list, one by one
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lpushMany(key: String, values: MutableList<String>): String {
  return awaitResult { this.lpushMany(key, values, it) }
}

/**
 *  Prepend one value to a list
 * @param key     Key string
 * @param value   Value to be added at the beginning of the list
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lpush(key: String, value: String): String {
  return awaitResult { this.lpush(key, value, it) }
}

/**
 *  Prepend a value to a list, only if the list exists
 * @param key     Key string
 * @param value   Value to add at the beginning of the list
 * @since Redis 2.2.0
 *  group: list
 */
suspend fun RedisTransaction.lpushx(key: String, value: String): String {
  return awaitResult { this.lpushx(key, value, it) }
}

/**
 *  Get a range of elements from a list
 * @param key     Key string
 * @param from    Start index
 * @param to      Stop index
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lrange(
  key: String,
  from: Long,
  to: Long
): String {
  return awaitResult { this.lrange(key, from, to, it) }
}

/**
 *  Remove elements from a list
 * @param key     Key string
 * @param count   Number of first found occurrences equal to $value to remove from the list
 * @param value   Value to be removed
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lrem(
  key: String,
  count: Long,
  value: String
): String {
  return awaitResult { this.lrem(key, count, value, it) }
}

/**
 *  Set the value of an element in a list by its index
 * @param key     Key string
 * @param index   Position within list
 * @param value   New value
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.lset(
  key: String,
  index: Long,
  value: String
): String {
  return awaitResult { this.lset(key, index, value, it) }
}

/**
 *  Trim a list to the specified range
 * @param key     Key string
 * @param from    Start index
 * @param to      Stop index
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.ltrim(
  key: String,
  from: Long,
  to: Long
): String {
  return awaitResult { this.ltrim(key, from, to, it) }
}

/**
 *  Get the value of the given key
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.mget(key: String): String {
  return awaitResult { this.mget(key, it) }
}

/**
 *  Get the values of all the given keys
 * @param keys    List of keys to get
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.mgetMany(keys: MutableList<String>): String {
  return awaitResult { this.mgetMany(keys, it) }
}

/**
 *  Atomically transfer a key from a Redis instance to another one.
 * @param host    Destination host
 * @param port    Destination port
 * @param key     Key to migrate
 * @param destdb  Destination database index
 * @param options Migrate options
 * @since Redis 2.6.0
 *  group: generic
 */
suspend fun RedisTransaction.migrate(
  host: String,
  port: Int,
  key: String,
  destdb: Int,
  timeout: Long,
  options: MigrateOptions
): String {
  return awaitResult { this.migrate(host, port, key, destdb, timeout, options, it) }
}

/**
 *  Listen for all requests received by the server in real time
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.monitor(): String {
  return awaitResult { this.monitor(it) }
}

/**
 *  Move a key to another database
 * @param key     Key to migrate
 * @param destdb  Destination database index
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.move(key: String, destdb: Int): String {
  return awaitResult { this.move(key, destdb, it) }
}

/**
 *  Set multiple keys to multiple values
 * @param keyvals Key value pairs to set
 * @since Redis 1.0.1
 *  group: string
 */
suspend fun RedisTransaction.mset(keyvals: JsonObject): String {
  return awaitResult { this.mset(keyvals, it) }
}

/**
 *  Set multiple keys to multiple values, only if none of the keys exist
 * @param keyvals Key value pairs to set
 * @since Redis 1.0.1
 *  group: string
 */
suspend fun RedisTransaction.msetnx(keyvals: JsonObject): String {
  return awaitResult { this.msetnx(keyvals, it) }
}

/**
 *  Mark the start of a RedisTransaction block
 * @since Redis 1.2.0
 *  group: RedisTransactions
 */
suspend fun RedisTransaction.multi(): String {
  return awaitResult { this.multi(it) }
}

/**
 *  Inspect the internals of Redis objects
 * @param key     Key string
 * @param cmd     Object sub command
 * @since Redis 2.2.3
 *  group: generic
 */
suspend fun RedisTransaction.`object`(key: String, cmd: ObjectCmd): String {
  return awaitResult { this.`object`(key, cmd, it) }
}

/**
 *  Remove the expiration from a key
 * @param key     Key string
 * @since Redis 2.2.0
 *  group: generic
 */
suspend fun RedisTransaction.persist(key: String): String {
  return awaitResult { this.persist(key, it) }
}

/**
 *  Set a key's time to live in milliseconds
 * @param key     String key
 * @param millis  Time to live in milliseconds
 * @since Redis 2.6.0
 *  group: generic
 */
suspend fun RedisTransaction.pexpire(key: String, millis: Long): String {
  return awaitResult { this.pexpire(key, millis, it) }
}

/**
 *  Set the expiration for a key as a UNIX timestamp specified in milliseconds
 * @param key     Key string
 * @param millis  Expiry time as Unix timestamp in milliseconds
 * @since Redis 2.6.0
 *  group: generic
 */
suspend fun RedisTransaction.pexpireat(key: String, millis: Long): String {
  return awaitResult { this.pexpireat(key, millis, it) }
}

/**
 *  Adds the specified element to the specified HyperLogLog.
 * @param key     Key string
 * @param element Element to add
 * @since Redis 2.8.9
 *  group: hyperloglog
 */
suspend fun RedisTransaction.pfadd(key: String, element: String): String {
  return awaitResult { this.pfadd(key, element, it) }
}

/**
 *  Adds the specified elements to the specified HyperLogLog.
 * @param key      Key string
 * @param elements Elementa to add
 * @since Redis 2.8.9
 *  group: hyperloglog
 */
suspend fun RedisTransaction.pfaddMany(key: String, elements: MutableList<String>): String {
  return awaitResult { this.pfaddMany(key, elements, it) }
}

/**
 *  Return the approximated cardinality of the set observed by the HyperLogLog at key.
 * @param key     Key string
 * @since Redis 2.8.9
 *  group: hyperloglog
 */
suspend fun RedisTransaction.pfcount(key: String): String {
  return awaitResult { this.pfcount(key, it) }
}

/**
 *  Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
 * @param keys    List of keys
 * @since Redis 2.8.9
 *  group: hyperloglog
 */
suspend fun RedisTransaction.pfcountMany(keys: MutableList<String>): String {
  return awaitResult { this.pfcountMany(keys, it) }
}

/**
 *  Merge N different HyperLogLogs into a single one.
 * @param destkey Destination key
 * @param keys    List of source keys
 * @since Redis 2.8.9
 *  group: hyperloglog
 */
suspend fun RedisTransaction.pfmerge(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.pfmerge(destkey, keys, it) }
}

/**
 *  Ping the server
 * @since Redis 1.0.0
 *  group: connection
 */
suspend fun RedisTransaction.ping(): String {
  return awaitResult { this.ping(it) }
}

/**
 *  Set the value and expiration in milliseconds of a key
 * @param key     Key string
 * @param millis  Number of milliseconds until the key expires
 * @param value   New value for key
 * @since Redis 2.6.0
 *  group: string
 */
suspend fun RedisTransaction.psetex(
  key: String,
  millis: Long,
  value: String
): String {
  return awaitResult { this.psetex(key, millis, value, it) }
}

/**
 *  Listen for messages published to channels matching the given pattern
 * @param pattern Pattern string
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.psubscribe(pattern: String): String {
  return awaitResult { this.psubscribe(pattern, it) }
}

/**
 *  Listen for messages published to channels matching the given patterns
 * @param patterns List of patterns
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.psubscribeMany(patterns: MutableList<String>): String {
  return awaitResult { this.psubscribeMany(patterns, it) }
}

/**
 *  Lists the currently active channels - only those matching the pattern
 * @param pattern A glob-style pattern - an empty string means no pattern
 * @since Redis 2.8.0
 *  group: pubsub
 */
suspend fun RedisTransaction.pubsubChannels(pattern: String): String {
  return awaitResult { this.pubsubChannels(pattern, it) }
}

/**
 *  Returns the number of subscribers (not counting clients subscribed to patterns) for the specified channels
 * @param channels List of channels
 * @since Redis 2.8.0
 *  group: pubsub
 */
suspend fun RedisTransaction.pubsubNumsub(channels: MutableList<String>): String {
  return awaitResult { this.pubsubNumsub(channels, it) }
}

/**
 *  Returns the number of subscriptions to patterns (that are performed using the PSUBSCRIBE command)
 * @since Redis 2.8.0
 *  group: pubsub
 */
suspend fun RedisTransaction.pubsubNumpat(): String {
  return awaitResult { this.pubsubNumpat(it) }
}

/**
 *  Get the time to live for a key in milliseconds
 * @param key     Key string
 * @since Redis 2.6.0
 *  group: generic
 */
suspend fun RedisTransaction.pttl(key: String): String {
  return awaitResult { this.pttl(key, it) }
}

/**
 *  Post a message to a channel
 * @param channel Channel key
 * @param message Message to send to channel
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.publish(channel: String, message: String): String {
  return awaitResult { this.publish(channel, message, it) }
}

/**
 *  Stop listening for messages posted to channels matching the given patterns
 * @param patterns List of patterns to match against
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.punsubscribe(patterns: MutableList<String>): String {
  return awaitResult { this.punsubscribe(patterns, it) }
}

/**
 *  Return a random key from the keyspace
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.randomkey(): String {
  return awaitResult { this.randomkey(it) }
}

/**
 *  Rename a key
 * @param key     Key string to be renamed
 * @param newkey  New key string
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.rename(key: String, newkey: String): String {
  return awaitResult { this.rename(key, newkey, it) }
}

/**
 *  Rename a key, only if the new key does not exist
 * @param key     Key string to be renamed
 * @param newkey  New key string
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.renamenx(key: String, newkey: String): String {
  return awaitResult { this.renamenx(key, newkey, it) }
}

/**
 *  Create a key using the provided serialized value, previously obtained using DUMP.
 * @param key        Key string
 * @param millis     Expiry time in milliseconds to set on the key
 * @param serialized Serialized form of the key value as obtained using DUMP
 * @since Redis 2.6.0
 *  group: generic
 */
suspend fun RedisTransaction.restore(
  key: String,
  millis: Long,
  serialized: String
): String {
  return awaitResult { this.restore(key, millis, serialized, it) }
}

/**
 *  Return the role of the instance in the context of replication
 * @since Redis 2.8.12
 *  group: server
 */
suspend fun RedisTransaction.role(): String {
  return awaitResult { this.role(it) }
}

/**
 *  Remove and get the last element in a list
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.rpop(key: String): String {
  return awaitResult { this.rpop(key, it) }
}

/**
 *  Remove the last element in a list, append it to another list and return it
 * @param key     Key string identifying source list
 * @param destkey Key string identifying destination list
 * @since Redis 1.2.0
 *  group: list
 */
suspend fun RedisTransaction.rpoplpush(key: String, destkey: String): String {
  return awaitResult { this.rpoplpush(key, destkey, it) }
}

/**
 *  Append one or multiple values to a list
 * @param key     Key string
 * @param values  List of values to add to the end of the list
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.rpushMany(key: String, values: MutableList<String>): String {
  return awaitResult { this.rpushMany(key, values, it) }
}

/**
 *  Append one or multiple values to a list
 * @param key     Key string
 * @param value   Value to be added to the end of the list
 * @since Redis 1.0.0
 *  group: list
 */
suspend fun RedisTransaction.rpush(key: String, value: String): String {
  return awaitResult { this.rpush(key, value, it) }
}

/**
 *  Append a value to a list, only if the list exists
 * @param key     Key string
 * @param value   Value to be added to the end of the list
 * @since Redis 2.2.0
 *  group: list
 */
suspend fun RedisTransaction.rpushx(key: String, value: String): String {
  return awaitResult { this.rpushx(key, value, it) }
}

/**
 *  Add a member to a set
 * @param key     Key string
 * @param member  Value to be added to the set
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sadd(key: String, member: String): String {
  return awaitResult { this.sadd(key, member, it) }
}

/**
 *  Add one or more members to a set
 * @param key     Key string
 * @param members Values to be added to the set
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.saddMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.saddMany(key, members, it) }
}

/**
 *  Synchronously save the dataset to disk
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.save(): String {
  return awaitResult { this.save(it) }
}

/**
 *  Get the number of members in a set
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.scard(key: String): String {
  return awaitResult { this.scard(key, it) }
}

/**
 *  Check existence of script in the script cache.
 * @param script  SHA1 digest identifying a script in the script cache
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.scriptExists(script: String): String {
  return awaitResult { this.scriptExists(script, it) }
}

/**
 *  Check existence of scripts in the script cache.
 * @param scripts List of SHA1 digests identifying scripts in the script cache
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.scriptExistsMany(scripts: MutableList<String>): String {
  return awaitResult { this.scriptExistsMany(scripts, it) }
}

/**
 *  Remove all the scripts from the script cache.
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.scriptFlush(): String {
  return awaitResult { this.scriptFlush(it) }
}

/**
 *  Kill the script currently in execution.
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.scriptKill(): String {
  return awaitResult { this.scriptKill(it) }
}

/**
 *  Load the specified Lua script into the script cache.
 * @param script  Lua script
 * @since Redis 2.6.0
 *  group: scripting
 */
suspend fun RedisTransaction.scriptLoad(script: String): String {
  return awaitResult { this.scriptLoad(script, it) }
}

/**
 *  Subtract multiple sets
 * @param key     Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sdiff(key: String, cmpkeys: MutableList<String>): String {
  return awaitResult { this.sdiff(key, cmpkeys, it) }
}

/**
 *  Subtract multiple sets and store the resulting set in a key
 * @param destkey Destination key where the result should be stored
 * @param key     Key identifying the set to compare with all other sets combined
 * @param cmpkeys List of keys identifying sets to subtract from the key set
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sdiffstore(
  destkey: String,
  key: String,
  cmpkeys: MutableList<String>
): String {
  return awaitResult { this.sdiffstore(destkey, key, cmpkeys, it) }
}

/**
 *  Change the selected database for the current connection
 * @param dbindex Index identifying the new active database
 * @since Redis 1.0.0
 *  group: connection
 */
suspend fun RedisTransaction.select(dbindex: Int): String {
  return awaitResult { this.select(dbindex, it) }
}

/**
 *  Set the string value of a key
 * @param key     Key of which value to set
 * @param value   New value for the key
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.set(key: String, value: String): String {
  return awaitResult { this.set(key, value, it) }
}

/**
 *  Set the string value of a key
 * @param key     Key of which value to set
 * @param value   New value for the key
 * @param options Set options
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.setWithOptions(
  key: String,
  value: String,
  options: SetOptions
): String {
  return awaitResult { this.setWithOptions(key, value, options, it) }
}

/**
 *  Set the binary string value of a key - without encoding as utf-8
 * @param key     Key of which value to set
 * @param value   New value for the key
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.setBinary(key: String, value: Buffer): String {
  return awaitResult { this.setBinary(key, value, it) }
}

/**
 *  Set the string value of a key
 * @param key     Key of which value to set
 * @param value   New value for the key
 * @param options Set options
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.setBinaryWithOptions(
  key: String,
  value: Buffer,
  options: SetOptions
): String {
  return awaitResult { this.setBinaryWithOptions(key, value, options, it) }
}

/**
 *  Sets or clears the bit at offset in the string value stored at key
 * @param key     Key string
 * @param offset  Bit offset
 * @param bit     New value - must be 1 or 0
 * @since Redis 2.2.0
 *  group: string
 */
suspend fun RedisTransaction.setbit(
  key: String,
  offset: Long,
  bit: Int
): String {
  return awaitResult { this.setbit(key, offset, bit, it) }
}

/**
 *  Set the value and expiration of a key
 * @param key     Key string
 * @param seconds Number of seconds until the key expires
 * @param value   New value for key
 * @since Redis 2.0.0
 *  group: string
 */
suspend fun RedisTransaction.setex(
  key: String,
  seconds: Long,
  value: String
): String {
  return awaitResult { this.setex(key, seconds, value, it) }
}

/**
 *  Set the value of a key, only if the key does not exist
 * @param key     Key of which value to set
 * @param value   New value for the key
 * @since Redis 1.0.0
 *  group: string
 */
suspend fun RedisTransaction.setnx(key: String, value: String): String {
  return awaitResult { this.setnx(key, value, it) }
}

/**
 *  Overwrite part of a string at key starting at the specified offset
 * @param key     Key string
 * @param offset  Offset - the maximum offset that you can set is 2^29 -1 (536870911), as Redis Strings are limited to 512 megabytes
 * @param value   Value to overwrite with
 * @since Redis 2.2.0
 *  group: string
 */
suspend fun RedisTransaction.setrange(
  key: String,
  offset: Int,
  value: String
): String {
  return awaitResult { this.setrange(key, offset, value, it) }
}

/**
 *  Intersect multiple sets
 * @param keys    List of keys to perform intersection on
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sinter(keys: MutableList<String>): String {
  return awaitResult { this.sinter(keys, it) }
}

/**
 *  Intersect multiple sets and store the resulting set in a key
 * @param destkey Key where to store the results
 * @param keys    List of keys to perform intersection on
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sinterstore(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.sinterstore(destkey, keys, it) }
}

/**
 *  Determine if a given value is a member of a set
 * @param key     Key string
 * @param member  Member to look for
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sismember(key: String, member: String): String {
  return awaitResult { this.sismember(key, member, it) }
}

/**
 *  Make the server a slave of another instance
 * @param host    Host to become this server's master
 * @param port    Port of our new master
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.slaveof(host: String, port: Int): String {
  return awaitResult { this.slaveof(host, port, it) }
}

/**
 *  Make this server a master
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.slaveofNoone(): String {
  return awaitResult { this.slaveofNoone(it) }
}

/**
 *  Read the Redis slow queries log
 * @param limit   Number of log entries to return. If value is less than zero all entries are returned
 * @since Redis 2.2.12
 *  group: server
 */
suspend fun RedisTransaction.slowlogGet(limit: Int): String {
  return awaitResult { this.slowlogGet(limit, it) }
}

/**
 *  Get the length of the Redis slow queries log
 * @since Redis 2.2.12
 *  group: server
 */
suspend fun RedisTransaction.slowlogLen(): String {
  return awaitResult { this.slowlogLen(it) }
}

/**
 *  Reset the Redis slow queries log
 * @since Redis 2.2.12
 *  group: server
 */
suspend fun RedisTransaction.slowlogReset(): String {
  return awaitResult { this.slowlogReset(it) }
}

/**
 *  Get all the members in a set
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.smembers(key: String): JsonArray {
  return awaitResult { this.smembers(key, it) }
}

/**
 *  Move a member from one set to another
 * @param key     Key of source set currently containing the member
 * @param destkey Key identifying the destination set
 * @param member  Member to move
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.smove(
  key: String,
  destkey: String,
  member: String
): String {
  return awaitResult { this.smove(key, destkey, member, it) }
}

/**
 *  Sort the elements in a list, set or sorted set
 * @param key     Key string
 * @param options Sort options
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.sort(key: String, options: SortOptions): String {
  return awaitResult { this.sort(key, options, it) }
}

/**
 *  Remove and return a random member from a set
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.spop(key: String): String {
  return awaitResult { this.spop(key, it) }
}

/**
 *  Remove and return random members from a set
 * @param key     Key string
 * @param count   Number of members to remove
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.spopMany(key: String, count: Int): String {
  return awaitResult { this.spopMany(key, count, it) }
}

/**
 *  Get one or multiple random members from a set
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.srandmember(key: String): String {
  return awaitResult { this.srandmember(key, it) }
}

/**
 *  Get one or multiple random members from a set
 * @param key     Key string
 * @param count   Number of members to get
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.srandmemberCount(key: String, count: Int): String {
  return awaitResult { this.srandmemberCount(key, count, it) }
}

/**
 *  Remove one member from a set
 * @param key     Key string
 * @param member  Member to remove
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.srem(key: String, member: String): String {
  return awaitResult { this.srem(key, member, it) }
}

/**
 *  Remove one or more members from a set
 * @param key     Key string
 * @param members Members to remove
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sremMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.sremMany(key, members, it) }
}

/**
 *  Get the length of the value stored in a key
 * @param key     Key string
 * @since Redis 2.2.0
 *  group: string
 */
suspend fun RedisTransaction.strlen(key: String): String {
  return awaitResult { this.strlen(key, it) }
}

/**
 *  Listen for messages published to the given channels
 * @param channel Channel to subscribe to
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.subscribe(channel: String): String {
  return awaitResult { this.subscribe(channel, it) }
}

/**
 *  Listen for messages published to the given channels
 * @param channels List of channels to subscribe to
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.subscribeMany(channels: MutableList<String>): String {
  return awaitResult { this.subscribeMany(channels, it) }
}

/**
 *  Add multiple sets
 * @param keys    List of keys identifying sets to add up
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sunion(keys: MutableList<String>): String {
  return awaitResult { this.sunion(keys, it) }
}

/**
 *  Add multiple sets and store the resulting set in a key
 * @param destkey Destination key
 * @param keys    List of keys identifying sets to add up
 * @since Redis 1.0.0
 *  group: set
 */
suspend fun RedisTransaction.sunionstore(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.sunionstore(destkey, keys, it) }
}

/**
 *  Internal command used for replication
 * @since Redis 1.0.0
 *  group: server
 */
suspend fun RedisTransaction.sync(): String {
  return awaitResult { this.sync(it) }
}

/**
 *  Return the current server time
 * @since Redis 2.6.0
 *  group: server
 */
suspend fun RedisTransaction.time(): String {
  return awaitResult { this.time(it) }
}

/**
 *  Get the time to live for a key
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.ttl(key: String): String {
  return awaitResult { this.ttl(key, it) }
}

/**
 *  Determine the type stored at key
 * @param key     Key string
 * @since Redis 1.0.0
 *  group: generic
 */
suspend fun RedisTransaction.type(key: String): String {
  return awaitResult { this.type(key, it) }
}

/**
 *  Stop listening for messages posted to the given channels
 * @param channels List of channels to subscribe to
 * @since Redis 2.0.0
 *  group: pubsub
 */
suspend fun RedisTransaction.unsubscribe(channels: MutableList<String>): String {
  return awaitResult { this.unsubscribe(channels, it) }
}

/**
 *  Forget about all watched keys
 * @since Redis 2.2.0
 *  group: RedisTransactions
 */
suspend fun RedisTransaction.unwatch(): String {
  return awaitResult { this.unwatch(it) }
}

/**
 *  Wait for the synchronous replication of all the write commands sent in the context of the current connection.
 * @param numSlaves
 * @param timeout
 * @since Redis 3.0.0
 *  group: generic
 */
suspend fun RedisTransaction.wait(numSlaves: Long, timeout: Long): String {
  return awaitResult { this.wait(numSlaves, timeout, it) }
}

/**
 *  Watch the given keys to determine execution of the MULTI/EXEC block
 * @param key     Key to watch
 * @since Redis 2.2.0
 *  group: RedisTransactions
 */
suspend fun RedisTransaction.watch(key: String): String {
  return awaitResult { this.watch(key, it) }
}

/**
 *  Watch the given keys to determine execution of the MULTI/EXEC block
 * @param keys    List of keys to watch
 * @since Redis 2.2.0
 *  group: RedisTransactions
 */
suspend fun RedisTransaction.watchMany(keys: MutableList<String>): String {
  return awaitResult { this.watchMany(keys, it) }
}

/**
 *  Add one or more members to a sorted set, or update its score if it already exists
 * @param key     Key string
 * @param score   Score used for sorting
 * @param member  New member key
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zadd(
  key: String,
  score: Double,
  member: String
): String {
  return awaitResult { this.zadd(key, score, member, it) }
}

/**
 *  Add one or more members to a sorted set, or update its score if it already exists
 * @param key     Key string
 * @param members New member keys and their scores
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zaddMany(key: String, members: MutableMap<String, Double>): String {
  return awaitResult { this.zaddMany(key, members, it) }
}

/**
 *  Get the number of members in a sorted set
 * @param key     Key string
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zcard(key: String): String {
  return awaitResult { this.zcard(key, it) }
}

/**
 *  Count the members in a sorted set with scores within the given values
 * @param key     Key string
 * @param min     Minimum score
 * @param max     Maximum score
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zcount(
  key: String,
  min: Double,
  max: Double
): String {
  return awaitResult { this.zcount(key, min, max, it) }
}

/**
 *  Increment the score of a member in a sorted set
 * @param key       Key string
 * @param increment Increment amount
 * @param member    Member key
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zincrby(
  key: String,
  increment: Double,
  member: String
): String {
  return awaitResult { this.zincrby(key, increment, member, it) }
}

/**
 *  Intersect multiple sorted sets and store the resulting sorted set in a new key
 * @param destkey Destination key
 * @param sets    List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zinterstore(
  destkey: String,
  sets: MutableList<String>,
  options: AggregateOptions
): String {
  return awaitResult { this.zinterstore(destkey, sets, options, it) }
}

/**
 *  Intersect multiple sorted sets and store the resulting sorted set in a new key using weights for scoring
 * @param destkey Destination key
 * @param sets    List of keys identifying sorted sets to intersect
 * @param options Aggregation options
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zinterstoreWeighed(
  destkey: String,
  sets: MutableMap<String, Double>,
  options: AggregateOptions
): String {
  return awaitResult { this.zinterstoreWeighed(destkey, sets, options, it) }
}

/**
 *  Count the number of members in a sorted set between a given lexicographical range
 * @param key     Key string
 * @param min     Pattern to compare against for minimum value
 * @param max     Pattern to compare against for maximum value
 * @since Redis 2.8.9
 *  group: sorted_set
 */
suspend fun RedisTransaction.zlexcount(
  key: String,
  min: String,
  max: String
): String {
  return awaitResult { this.zlexcount(key, min, max, it) }
}

/**
 *  Return a range of members in a sorted set, by index
 * @param key     Key string
 * @param start   Start index for the range
 * @param stop    Stop index for the range - inclusive
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrange(
  key: String,
  start: Long,
  stop: Long
): String {
  return awaitResult { this.zrange(key, start, stop, it) }
}

/**
 *  Return a range of members in a sorted set, by index
 * @param key     Key string
 * @param start   Start index for the range
 * @param stop    Stop index for the range - inclusive
 * @param options Range options
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrangeWithOptions(
  key: String,
  start: Long,
  stop: Long,
  options: RangeOptions
): String {
  return awaitResult { this.zrangeWithOptions(key, start, stop, options, it) }
}

/**
 *  Return a range of members in a sorted set, by lexicographical range
 * @param key     Key string
 * @param min     Pattern representing a minimum allowed value
 * @param max     Pattern representing a maximum allowed value
 * @param options Limit options where limit can be specified
 * @since Redis 2.8.9
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrangebylex(
  key: String,
  min: String,
  max: String,
  options: LimitOptions
): String {
  return awaitResult { this.zrangebylex(key, min, max, options, it) }
}

/**
 *  Return a range of members in a sorted set, by score
 * @param key     Key string
 * @param min     Pattern defining a minimum value
 * @param max     Pattern defining a maximum value
 * @param options Range and limit options
 * @since Redis 1.0.5
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrangebyscore(
  key: String,
  min: String,
  max: String,
  options: RangeLimitOptions
): String {
  return awaitResult { this.zrangebyscore(key, min, max, options, it) }
}

/**
 *  Determine the index of a member in a sorted set
 * @param key     Key string
 * @param member  Member in the sorted set identified by key
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrank(key: String, member: String): String {
  return awaitResult { this.zrank(key, member, it) }
}

/**
 *  Remove one member from a sorted set
 * @param key     Key string
 * @param member  Member in the sorted set identified by key
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrem(key: String, member: String): String {
  return awaitResult { this.zrem(key, member, it) }
}

/**
 *  Remove one or more members from a sorted set
 * @param key     Key string
 * @param members Members in the sorted set identified by key
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zremMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.zremMany(key, members, it) }
}

/**
 *  Remove all members in a sorted set between the given lexicographical range
 * @param key     Key string
 * @param min     Pattern defining a minimum value
 * @param max     Pattern defining a maximum value
 * @since Redis 2.8.9
 *  group: sorted_set
 */
suspend fun RedisTransaction.zremrangebylex(
  key: String,
  min: String,
  max: String
): String {
  return awaitResult { this.zremrangebylex(key, min, max, it) }
}

/**
 *  Remove all members in a sorted set within the given indexes
 * @param key     Key string
 * @param start   Start index
 * @param stop    Stop index
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zremrangebyrank(
  key: String,
  start: Long,
  stop: Long
): String {
  return awaitResult { this.zremrangebyrank(key, start, stop, it) }
}

/**
 *  Remove all members in a sorted set within the given scores
 * @param key Key string
 * @param min Pattern defining a minimum value
 * @param max Pattern defining a maximum value
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zremrangebyscore(
  key: String,
  min: String,
  max: String
): String {
  return awaitResult { this.zremrangebyscore(key, min, max, it) }
}

/**
 *  Return a range of members in a sorted set, by index, with scores ordered from high to low
 * @param key     Key string
 * @param start   Start index for the range
 * @param stop    Stop index for the range - inclusive
 * @param options Range options
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrevrange(
  key: String,
  start: Long,
  stop: Long,
  options: RangeOptions
): String {
  return awaitResult { this.zrevrange(key, start, stop, options, it) }
}

/**
 *  Return a range of members in a sorted set, by score, between the given lexicographical range with scores ordered from high to low
 * @param key     Key string
 * @param max     Pattern defining a maximum value
 * @param min     Pattern defining a minimum value
 * @param options Limit options
 * @since Redis 2.8.9
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrevrangebylex(
  key: String,
  max: String,
  min: String,
  options: LimitOptions
): String {
  return awaitResult { this.zrevrangebylex(key, max, min, options, it) }
}

/**
 *  Return a range of members in a sorted set, by score, with scores ordered from high to low
 * @param key     Key string
 * @param max     Pattern defining a maximum value
 * @param min     Pattern defining a minimum value
 * @param options Range and limit options
 * @since Redis 2.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrevrangebyscore(
  key: String,
  max: String,
  min: String,
  options: RangeLimitOptions
): String {
  return awaitResult { this.zrevrangebyscore(key, max, min, options, it) }
}

/**
 *  Determine the index of a member in a sorted set, with scores ordered from high to low
 * @param key     Key string
 * @param member  Member in the sorted set identified by key
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zrevrank(key: String, member: String): String {
  return awaitResult { this.zrevrank(key, member, it) }
}

/**
 *  Get the score associated with the given member in a sorted set
 * @param key     Key string
 * @param member  Member in the sorted set identified by key
 * @since Redis 1.2.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zscore(key: String, member: String): String {
  return awaitResult { this.zscore(key, member, it) }
}

/**
 *  Add multiple sorted sets and store the resulting sorted set in a new key
 * @param destkey Destination key
 * @param sets    List of keys identifying sorted sets
 * @param options Aggregation options
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zunionstore(
  destkey: String,
  sets: MutableList<String>,
  options: AggregateOptions
): String {
  return awaitResult { this.zunionstore(destkey, sets, options, it) }
}

/**
 *  Add multiple sorted sets using weights, and store the resulting sorted set in a new key
 * @param key     Destination key
 * @param sets    Map containing set-key:weight pairs
 * @param options Aggregation options
 * @since Redis 2.0.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zunionstoreWeighed(
  key: String,
  sets: MutableMap<String, Double>,
  options: AggregateOptions
): String {
  return awaitResult { this.zunionstoreWeighed(key, sets, options, it) }
}

/**
 *  Incrementally iterate the keys space
 * @param cursor  Cursor id
 * @param options Scan options
 * @since Redis 2.8.0
 *  group: generic
 */
suspend fun RedisTransaction.scan(cursor: String, options: ScanOptions): String {
  return awaitResult { this.scan(cursor, options, it) }
}

/**
 *  Incrementally iterate Set elements
 * @param key     Key string
 * @param cursor  Cursor id
 * @param options Scan options
 * @since Redis 2.8.0
 *  group: set
 */
suspend fun RedisTransaction.sscan(
  key: String,
  cursor: String,
  options: ScanOptions
): String {
  return awaitResult { this.sscan(key, cursor, options, it) }
}

/**
 *  Incrementally iterate hash fields and associated values
 * @param key     Key string
 * @param cursor  Cursor id
 * @param options Scan options
 * @since Redis 2.8.0
 *  group: hash
 */
suspend fun RedisTransaction.hscan(
  key: String,
  cursor: String,
  options: ScanOptions
): String {
  return awaitResult { this.hscan(key, cursor, options, it) }
}

/**
 *  Incrementally iterate sorted sets elements and associated scores
 * @param key     Key string
 * @param cursor  Cursor id
 * @param options Scan options
 * @since Redis 2.8.0
 *  group: sorted_set
 */
suspend fun RedisTransaction.zscan(
  key: String,
  cursor: String,
  options: ScanOptions
): String {
  return awaitResult { this.zscan(key, cursor, options, it) }
}

/**
 *  Add one or more geospatial items in the geospatial index represented using a sorted set.
 * @param key     Key string
 * @param longitude  longitude
 * @param latitude latitude
 * @param member member
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geoadd(
  key: String,
  longitude: Double,
  latitude: Double,
  member: String
): String {
  return awaitResult { this.geoadd(key, longitude, latitude, member, it) }
}

/**
 *  Add one or more geospatial items in the geospatial index represented using a sorted set.
 * @param key     Key string
 * @param members  list of &lt;lon, lat, member&gt;
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geoaddMany(key: String, members: MutableList<GeoMember>): String {
  return awaitResult { this.geoaddMany(key, members, it) }
}

/**
 *  Return valid Geohash strings representing the position of one or more elements in a sorted set value representing
 *  a geospatial index (where elements were added using GEOADD).
 * @param key     Key string
 * @param member member
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geohash(key: String, member: String): String {
  return awaitResult { this.geohash(key, member, it) }
}

/**
 *  Return valid Geohash strings representing the position of one or more elements in a sorted set value representing
 *  a geospatial index (where elements were added using GEOADD).
 * @param key     Key string
 * @param members  list of members
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geohashMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.geohashMany(key, members, it) }
}

/**
 *  Return the positions (longitude,latitude) of all the specified members of the geospatial index represented by the
 *  sorted set at key.
 * @param key     Key string
 * @param member member
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geopos(key: String, member: String): String {
  return awaitResult { this.geopos(key, member, it) }
}

/**
 *  Return the positions (longitude,latitude) of all the specified members of the geospatial index represented by the
 *  sorted set at key.
 * @param key     Key string
 * @param members  list of members
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geoposMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.geoposMany(key, members, it) }
}

/**
 *  Return the distance between two members in the geospatial index represented by the sorted set.
 * @param key     Key string
 * @param member1 member 1
 * @param member2 member 2
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geodist(
  key: String,
  member1: String,
  member2: String
): String {
  return awaitResult { this.geodist(key, member1, member2, it) }
}

/**
 *  Return the distance between two members in the geospatial index represented by the sorted set.
 * @param key     Key string
 * @param member1 member 1
 * @param member2 member 2
 * @param unit geo unit
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.geodistWithUnit(
  key: String,
  member1: String,
  member2: String,
  unit: GeoUnit
): String {
  return awaitResult { this.geodistWithUnit(key, member1, member2, unit, it) }
}

/**
 *  Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders
 *  of the area specified with the center location and the maximum distance from the center (the radius).
 * @param key     Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.georadius(
  key: String,
  longitude: Double,
  latitude: Double,
  radius: Double,
  unit: GeoUnit
): String {
  return awaitResult { this.georadius(key, longitude, latitude, radius, unit, it) }
}

/**
 *  Return the members of a sorted set populated with geospatial information using GEOADD, which are within the borders
 *  of the area specified with the center location and the maximum distance from the center (the radius).
 * @param key     Key string
 * @param longitude longitude
 * @param latitude latitude
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.georadiusWithOptions(
  key: String,
  longitude: Double,
  latitude: Double,
  radius: Double,
  unit: GeoUnit,
  options: GeoRadiusOptions
): String {
  return awaitResult { this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it) }
}

/**
 *  This command is exactly like GEORADIUS with the sole difference that instead of taking, as the center of the area
 *  to query, a longitude and latitude value, it takes the name of a member already existing inside the geospatial
 *  index represented by the sorted set.
 * @param key     Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.georadiusbymember(
  key: String,
  member: String,
  radius: Double,
  unit: GeoUnit
): String {
  return awaitResult { this.georadiusbymember(key, member, radius, unit, it) }
}

/**
 *  This command is exactly like GEORADIUS with the sole difference that instead of taking, as the center of the area
 *  to query, a longitude and latitude value, it takes the name of a member already existing inside the geospatial
 *  index represented by the sorted set.
 * @param key     Key string
 * @param member member
 * @param radius radius
 * @param unit geo unit
 * @param options geo radius options
 * @since Redis 3.2.0
 *  group: geo
 */
suspend fun RedisTransaction.georadiusbymemberWithOptions(
  key: String,
  member: String,
  radius: Double,
  unit: GeoUnit,
  options: GeoRadiusOptions
): String {
  return awaitResult { this.georadiusbymemberWithOptions(key, member, radius, unit, options, it) }
}

/**
 *  Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
 * @param key Key string
 * @since Redis 4.0.0
 *  group: generic
 */
suspend fun RedisTransaction.unlink(key: String): String {
  return awaitResult { this.unlink(key, it) }
}

/**
 *  Delete multiple keys asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
 * @param keys    List of keys to delete
 * @since Redis 4.0.0
 *  group: generic
 */
suspend fun RedisTransaction.unlinkMany(keys: MutableList<String>): String {
  return awaitResult { this.unlinkMany(keys, it) }
}

/**
 *  Swaps two Redis databases
 * @param index1  index of first database to swap
 * @param index2  index of second database to swap
 * @since Redis 4.0.0
 *  group: connection
 */
suspend fun RedisTransaction.swapdb(index1: Int, index2: Int): String {
  return awaitResult { this.swapdb(index1, index2, it) }
}
