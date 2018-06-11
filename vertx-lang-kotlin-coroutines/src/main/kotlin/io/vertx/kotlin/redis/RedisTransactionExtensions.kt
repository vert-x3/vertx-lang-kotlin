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

suspend fun RedisTransaction.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun RedisTransaction.append(key: String, value: String): String {
  return awaitResult { this.append(key, value, it) }
}

suspend fun RedisTransaction.auth(password: String): String {
  return awaitResult { this.auth(password, it) }
}

suspend fun RedisTransaction.bgrewriteaof(): String {
  return awaitResult { this.bgrewriteaof(it) }
}

suspend fun RedisTransaction.bgsave(): String {
  return awaitResult { this.bgsave(it) }
}

suspend fun RedisTransaction.bitcount(key: String): String {
  return awaitResult { this.bitcount(key, it) }
}

suspend fun RedisTransaction.bitcountRange(
  key: String,
  start: Long,
  end: Long
): String {
  return awaitResult { this.bitcountRange(key, start, end, it) }
}

suspend fun RedisTransaction.bitop(
  operation: BitOperation,
  destkey: String,
  keys: MutableList<String>
): String {
  return awaitResult { this.bitop(operation, destkey, keys, it) }
}

suspend fun RedisTransaction.bitpos(key: String, bit: Int): String {
  return awaitResult { this.bitpos(key, bit, it) }
}

suspend fun RedisTransaction.bitposFrom(
  key: String,
  bit: Int,
  start: Int
): String {
  return awaitResult { this.bitposFrom(key, bit, start, it) }
}

suspend fun RedisTransaction.bitposRange(
  key: String,
  bit: Int,
  start: Int,
  stop: Int
): String {
  return awaitResult { this.bitposRange(key, bit, start, stop, it) }
}

suspend fun RedisTransaction.blpop(key: String, seconds: Int): String {
  return awaitResult { this.blpop(key, seconds, it) }
}

suspend fun RedisTransaction.blpopMany(keys: MutableList<String>, seconds: Int): String {
  return awaitResult { this.blpopMany(keys, seconds, it) }
}

suspend fun RedisTransaction.brpop(key: String, seconds: Int): String {
  return awaitResult { this.brpop(key, seconds, it) }
}

suspend fun RedisTransaction.brpopMany(keys: MutableList<String>, seconds: Int): String {
  return awaitResult { this.brpopMany(keys, seconds, it) }
}

suspend fun RedisTransaction.brpoplpush(
  key: String,
  destkey: String,
  seconds: Int
): String {
  return awaitResult { this.brpoplpush(key, destkey, seconds, it) }
}

suspend fun RedisTransaction.clientKill(filter: KillFilter): String {
  return awaitResult { this.clientKill(filter, it) }
}

suspend fun RedisTransaction.clientList(): String {
  return awaitResult { this.clientList(it) }
}

suspend fun RedisTransaction.clientGetname(): String {
  return awaitResult { this.clientGetname(it) }
}

suspend fun RedisTransaction.clientPause(millis: Long): String {
  return awaitResult { this.clientPause(millis, it) }
}

suspend fun RedisTransaction.clientSetname(name: String): String {
  return awaitResult { this.clientSetname(name, it) }
}

suspend fun RedisTransaction.clusterAddslots(slots: MutableList<String>): String {
  return awaitResult { this.clusterAddslots(slots, it) }
}

suspend fun RedisTransaction.clusterCountFailureReports(nodeId: String): String {
  return awaitResult { this.clusterCountFailureReports(nodeId, it) }
}

suspend fun RedisTransaction.clusterCountkeysinslot(slot: Long): String {
  return awaitResult { this.clusterCountkeysinslot(slot, it) }
}

suspend fun RedisTransaction.clusterDelslots(slot: Long): String {
  return awaitResult { this.clusterDelslots(slot, it) }
}

suspend fun RedisTransaction.clusterDelslotsMany(slots: MutableList<String>): String {
  return awaitResult { this.clusterDelslotsMany(slots, it) }
}

suspend fun RedisTransaction.clusterFailover(): String {
  return awaitResult { this.clusterFailover(it) }
}

suspend fun RedisTransaction.clusterFailOverWithOptions(options: FailoverOptions): String {
  return awaitResult { this.clusterFailOverWithOptions(options, it) }
}

suspend fun RedisTransaction.clusterForget(nodeId: String): String {
  return awaitResult { this.clusterForget(nodeId, it) }
}

suspend fun RedisTransaction.clusterGetkeysinslot(slot: Long, count: Long): String {
  return awaitResult { this.clusterGetkeysinslot(slot, count, it) }
}

suspend fun RedisTransaction.clusterInfo(): String {
  return awaitResult { this.clusterInfo(it) }
}

suspend fun RedisTransaction.clusterKeyslot(key: String): String {
  return awaitResult { this.clusterKeyslot(key, it) }
}

suspend fun RedisTransaction.clusterMeet(ip: String, port: Long): String {
  return awaitResult { this.clusterMeet(ip, port, it) }
}

suspend fun RedisTransaction.clusterNodes(): String {
  return awaitResult { this.clusterNodes(it) }
}

suspend fun RedisTransaction.clusterReplicate(nodeId: String): String {
  return awaitResult { this.clusterReplicate(nodeId, it) }
}

suspend fun RedisTransaction.clusterReset(): String {
  return awaitResult { this.clusterReset(it) }
}

suspend fun RedisTransaction.clusterResetWithOptions(options: ResetOptions): String {
  return awaitResult { this.clusterResetWithOptions(options, it) }
}

suspend fun RedisTransaction.clusterSaveconfig(): String {
  return awaitResult { this.clusterSaveconfig(it) }
}

suspend fun RedisTransaction.clusterSetConfigEpoch(epoch: Long): String {
  return awaitResult { this.clusterSetConfigEpoch(epoch, it) }
}

suspend fun RedisTransaction.clusterSetslot(slot: Long, subcommand: SlotCmd): String {
  return awaitResult { this.clusterSetslot(slot, subcommand, it) }
}

suspend fun RedisTransaction.clusterSetslotWithNode(
  slot: Long,
  subcommand: SlotCmd,
  nodeId: String
): String {
  return awaitResult { this.clusterSetslotWithNode(slot, subcommand, nodeId, it) }
}

suspend fun RedisTransaction.clusterSlaves(nodeId: String): String {
  return awaitResult { this.clusterSlaves(nodeId, it) }
}

suspend fun RedisTransaction.clusterSlots(): String {
  return awaitResult { this.clusterSlots(it) }
}

suspend fun RedisTransaction.command(): String {
  return awaitResult { this.command(it) }
}

suspend fun RedisTransaction.commandCount(): String {
  return awaitResult { this.commandCount(it) }
}

suspend fun RedisTransaction.commandGetkeys(): String {
  return awaitResult { this.commandGetkeys(it) }
}

suspend fun RedisTransaction.commandInfo(commands: MutableList<String>): String {
  return awaitResult { this.commandInfo(commands, it) }
}

suspend fun RedisTransaction.configGet(parameter: String): String {
  return awaitResult { this.configGet(parameter, it) }
}

suspend fun RedisTransaction.configRewrite(): String {
  return awaitResult { this.configRewrite(it) }
}

suspend fun RedisTransaction.configSet(parameter: String, value: String): String {
  return awaitResult { this.configSet(parameter, value, it) }
}

suspend fun RedisTransaction.configResetstat(): String {
  return awaitResult { this.configResetstat(it) }
}

suspend fun RedisTransaction.dbsize(): String {
  return awaitResult { this.dbsize(it) }
}

suspend fun RedisTransaction.debugObject(key: String): String {
  return awaitResult { this.debugObject(key, it) }
}

suspend fun RedisTransaction.debugSegfault(): String {
  return awaitResult { this.debugSegfault(it) }
}

suspend fun RedisTransaction.decr(key: String): String {
  return awaitResult { this.decr(key, it) }
}

suspend fun RedisTransaction.decrby(key: String, decrement: Long): String {
  return awaitResult { this.decrby(key, decrement, it) }
}

suspend fun RedisTransaction.del(key: String): String {
  return awaitResult { this.del(key, it) }
}

suspend fun RedisTransaction.delMany(keys: MutableList<String>): String {
  return awaitResult { this.delMany(keys, it) }
}

suspend fun RedisTransaction.discard(): String {
  return awaitResult { this.discard(it) }
}

suspend fun RedisTransaction.dump(key: String): String {
  return awaitResult { this.dump(key, it) }
}

suspend fun RedisTransaction.echo(message: String): String {
  return awaitResult { this.echo(message, it) }
}

suspend fun RedisTransaction.eval(
  script: String,
  keys: MutableList<String>,
  args: MutableList<String>
): String {
  return awaitResult { this.eval(script, keys, args, it) }
}

suspend fun RedisTransaction.evalsha(
  sha1: String,
  keys: MutableList<String>,
  values: MutableList<String>
): String {
  return awaitResult { this.evalsha(sha1, keys, values, it) }
}

suspend fun RedisTransaction.exec(): JsonArray {
  return awaitResult { this.exec(it) }
}

suspend fun RedisTransaction.exists(key: String): String {
  return awaitResult { this.exists(key, it) }
}

suspend fun RedisTransaction.existsMany(keys: MutableList<String>): String {
  return awaitResult { this.existsMany(keys, it) }
}

suspend fun RedisTransaction.expire(key: String, seconds: Int): String {
  return awaitResult { this.expire(key, seconds, it) }
}

suspend fun RedisTransaction.expireat(key: String, seconds: Long): String {
  return awaitResult { this.expireat(key, seconds, it) }
}

suspend fun RedisTransaction.flushall(): String {
  return awaitResult { this.flushall(it) }
}

suspend fun RedisTransaction.flushdb(): String {
  return awaitResult { this.flushdb(it) }
}

suspend fun RedisTransaction.get(key: String): String {
  return awaitResult { this.get(key, it) }
}

suspend fun RedisTransaction.getBinary(key: String): Buffer {
  return awaitResult { this.getBinary(key, it) }
}

suspend fun RedisTransaction.getbit(key: String, offset: Long): String {
  return awaitResult { this.getbit(key, offset, it) }
}

suspend fun RedisTransaction.getrange(
  key: String,
  start: Long,
  end: Long
): String {
  return awaitResult { this.getrange(key, start, end, it) }
}

suspend fun RedisTransaction.getset(key: String, value: String): String {
  return awaitResult { this.getset(key, value, it) }
}

suspend fun RedisTransaction.hdel(key: String, field: String): String {
  return awaitResult { this.hdel(key, field, it) }
}

suspend fun RedisTransaction.hdelMany(key: String, fields: MutableList<String>): String {
  return awaitResult { this.hdelMany(key, fields, it) }
}

suspend fun RedisTransaction.hexists(key: String, field: String): String {
  return awaitResult { this.hexists(key, field, it) }
}

suspend fun RedisTransaction.hget(key: String, field: String): String {
  return awaitResult { this.hget(key, field, it) }
}

suspend fun RedisTransaction.hgetall(key: String): String {
  return awaitResult { this.hgetall(key, it) }
}

suspend fun RedisTransaction.hincrby(
  key: String,
  field: String,
  increment: Long
): String {
  return awaitResult { this.hincrby(key, field, increment, it) }
}

suspend fun RedisTransaction.hincrbyfloat(
  key: String,
  field: String,
  increment: Double
): String {
  return awaitResult { this.hincrbyfloat(key, field, increment, it) }
}

suspend fun RedisTransaction.hkeys(key: String): String {
  return awaitResult { this.hkeys(key, it) }
}

suspend fun RedisTransaction.hlen(key: String): String {
  return awaitResult { this.hlen(key, it) }
}

suspend fun RedisTransaction.hmget(key: String, fields: MutableList<String>): String {
  return awaitResult { this.hmget(key, fields, it) }
}

suspend fun RedisTransaction.hmset(key: String, values: JsonObject): String {
  return awaitResult { this.hmset(key, values, it) }
}

suspend fun RedisTransaction.hset(
  key: String,
  field: String,
  value: String
): String {
  return awaitResult { this.hset(key, field, value, it) }
}

suspend fun RedisTransaction.hsetnx(
  key: String,
  field: String,
  value: String
): String {
  return awaitResult { this.hsetnx(key, field, value, it) }
}

suspend fun RedisTransaction.hvals(key: String): String {
  return awaitResult { this.hvals(key, it) }
}

suspend fun RedisTransaction.incr(key: String): String {
  return awaitResult { this.incr(key, it) }
}

suspend fun RedisTransaction.incrby(key: String, increment: Long): String {
  return awaitResult { this.incrby(key, increment, it) }
}

suspend fun RedisTransaction.incrbyfloat(key: String, increment: Double): String {
  return awaitResult { this.incrbyfloat(key, increment, it) }
}

suspend fun RedisTransaction.info(): String {
  return awaitResult { this.info(it) }
}

suspend fun RedisTransaction.infoSection(section: String): String {
  return awaitResult { this.infoSection(section, it) }
}

suspend fun RedisTransaction.keys(pattern: String): String {
  return awaitResult { this.keys(pattern, it) }
}

suspend fun RedisTransaction.lastsave(): String {
  return awaitResult { this.lastsave(it) }
}

suspend fun RedisTransaction.lindex(key: String, index: Int): String {
  return awaitResult { this.lindex(key, index, it) }
}

suspend fun RedisTransaction.linsert(
  key: String,
  option: InsertOptions,
  pivot: String,
  value: String
): String {
  return awaitResult { this.linsert(key, option, pivot, value, it) }
}

suspend fun RedisTransaction.llen(key: String): String {
  return awaitResult { this.llen(key, it) }
}

suspend fun RedisTransaction.lpop(key: String): String {
  return awaitResult { this.lpop(key, it) }
}

suspend fun RedisTransaction.lpushMany(key: String, values: MutableList<String>): String {
  return awaitResult { this.lpushMany(key, values, it) }
}

suspend fun RedisTransaction.lpush(key: String, value: String): String {
  return awaitResult { this.lpush(key, value, it) }
}

suspend fun RedisTransaction.lpushx(key: String, value: String): String {
  return awaitResult { this.lpushx(key, value, it) }
}

suspend fun RedisTransaction.lrange(
  key: String,
  from: Long,
  to: Long
): String {
  return awaitResult { this.lrange(key, from, to, it) }
}

suspend fun RedisTransaction.lrem(
  key: String,
  count: Long,
  value: String
): String {
  return awaitResult { this.lrem(key, count, value, it) }
}

suspend fun RedisTransaction.lset(
  key: String,
  index: Long,
  value: String
): String {
  return awaitResult { this.lset(key, index, value, it) }
}

suspend fun RedisTransaction.ltrim(
  key: String,
  from: Long,
  to: Long
): String {
  return awaitResult { this.ltrim(key, from, to, it) }
}

suspend fun RedisTransaction.mget(key: String): String {
  return awaitResult { this.mget(key, it) }
}

suspend fun RedisTransaction.mgetMany(keys: MutableList<String>): String {
  return awaitResult { this.mgetMany(keys, it) }
}

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

suspend fun RedisTransaction.monitor(): String {
  return awaitResult { this.monitor(it) }
}

suspend fun RedisTransaction.move(key: String, destdb: Int): String {
  return awaitResult { this.move(key, destdb, it) }
}

suspend fun RedisTransaction.mset(keyvals: JsonObject): String {
  return awaitResult { this.mset(keyvals, it) }
}

suspend fun RedisTransaction.msetnx(keyvals: JsonObject): String {
  return awaitResult { this.msetnx(keyvals, it) }
}

suspend fun RedisTransaction.multi(): String {
  return awaitResult { this.multi(it) }
}

suspend fun RedisTransaction.`object`(key: String, cmd: ObjectCmd): String {
  return awaitResult { this.`object`(key, cmd, it) }
}

suspend fun RedisTransaction.persist(key: String): String {
  return awaitResult { this.persist(key, it) }
}

suspend fun RedisTransaction.pexpire(key: String, millis: Long): String {
  return awaitResult { this.pexpire(key, millis, it) }
}

suspend fun RedisTransaction.pexpireat(key: String, millis: Long): String {
  return awaitResult { this.pexpireat(key, millis, it) }
}

suspend fun RedisTransaction.pfadd(key: String, element: String): String {
  return awaitResult { this.pfadd(key, element, it) }
}

suspend fun RedisTransaction.pfaddMany(key: String, elements: MutableList<String>): String {
  return awaitResult { this.pfaddMany(key, elements, it) }
}

suspend fun RedisTransaction.pfcount(key: String): String {
  return awaitResult { this.pfcount(key, it) }
}

suspend fun RedisTransaction.pfcountMany(keys: MutableList<String>): String {
  return awaitResult { this.pfcountMany(keys, it) }
}

suspend fun RedisTransaction.pfmerge(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.pfmerge(destkey, keys, it) }
}

suspend fun RedisTransaction.ping(): String {
  return awaitResult { this.ping(it) }
}

suspend fun RedisTransaction.psetex(
  key: String,
  millis: Long,
  value: String
): String {
  return awaitResult { this.psetex(key, millis, value, it) }
}

suspend fun RedisTransaction.psubscribe(pattern: String): String {
  return awaitResult { this.psubscribe(pattern, it) }
}

suspend fun RedisTransaction.psubscribeMany(patterns: MutableList<String>): String {
  return awaitResult { this.psubscribeMany(patterns, it) }
}

suspend fun RedisTransaction.pubsubChannels(pattern: String): String {
  return awaitResult { this.pubsubChannels(pattern, it) }
}

suspend fun RedisTransaction.pubsubNumsub(channels: MutableList<String>): String {
  return awaitResult { this.pubsubNumsub(channels, it) }
}

suspend fun RedisTransaction.pubsubNumpat(): String {
  return awaitResult { this.pubsubNumpat(it) }
}

suspend fun RedisTransaction.pttl(key: String): String {
  return awaitResult { this.pttl(key, it) }
}

suspend fun RedisTransaction.publish(channel: String, message: String): String {
  return awaitResult { this.publish(channel, message, it) }
}

suspend fun RedisTransaction.punsubscribe(patterns: MutableList<String>): String {
  return awaitResult { this.punsubscribe(patterns, it) }
}

suspend fun RedisTransaction.randomkey(): String {
  return awaitResult { this.randomkey(it) }
}

suspend fun RedisTransaction.rename(key: String, newkey: String): String {
  return awaitResult { this.rename(key, newkey, it) }
}

suspend fun RedisTransaction.renamenx(key: String, newkey: String): String {
  return awaitResult { this.renamenx(key, newkey, it) }
}

suspend fun RedisTransaction.restore(
  key: String,
  millis: Long,
  serialized: String
): String {
  return awaitResult { this.restore(key, millis, serialized, it) }
}

suspend fun RedisTransaction.role(): String {
  return awaitResult { this.role(it) }
}

suspend fun RedisTransaction.rpop(key: String): String {
  return awaitResult { this.rpop(key, it) }
}

suspend fun RedisTransaction.rpoplpush(key: String, destkey: String): String {
  return awaitResult { this.rpoplpush(key, destkey, it) }
}

suspend fun RedisTransaction.rpushMany(key: String, values: MutableList<String>): String {
  return awaitResult { this.rpushMany(key, values, it) }
}

suspend fun RedisTransaction.rpush(key: String, value: String): String {
  return awaitResult { this.rpush(key, value, it) }
}

suspend fun RedisTransaction.rpushx(key: String, value: String): String {
  return awaitResult { this.rpushx(key, value, it) }
}

suspend fun RedisTransaction.sadd(key: String, member: String): String {
  return awaitResult { this.sadd(key, member, it) }
}

suspend fun RedisTransaction.saddMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.saddMany(key, members, it) }
}

suspend fun RedisTransaction.save(): String {
  return awaitResult { this.save(it) }
}

suspend fun RedisTransaction.scard(key: String): String {
  return awaitResult { this.scard(key, it) }
}

suspend fun RedisTransaction.scriptExists(script: String): String {
  return awaitResult { this.scriptExists(script, it) }
}

suspend fun RedisTransaction.scriptExistsMany(scripts: MutableList<String>): String {
  return awaitResult { this.scriptExistsMany(scripts, it) }
}

suspend fun RedisTransaction.scriptFlush(): String {
  return awaitResult { this.scriptFlush(it) }
}

suspend fun RedisTransaction.scriptKill(): String {
  return awaitResult { this.scriptKill(it) }
}

suspend fun RedisTransaction.scriptLoad(script: String): String {
  return awaitResult { this.scriptLoad(script, it) }
}

suspend fun RedisTransaction.sdiff(key: String, cmpkeys: MutableList<String>): String {
  return awaitResult { this.sdiff(key, cmpkeys, it) }
}

suspend fun RedisTransaction.sdiffstore(
  destkey: String,
  key: String,
  cmpkeys: MutableList<String>
): String {
  return awaitResult { this.sdiffstore(destkey, key, cmpkeys, it) }
}

suspend fun RedisTransaction.select(dbindex: Int): String {
  return awaitResult { this.select(dbindex, it) }
}

suspend fun RedisTransaction.set(key: String, value: String): String {
  return awaitResult { this.set(key, value, it) }
}

suspend fun RedisTransaction.setWithOptions(
  key: String,
  value: String,
  options: SetOptions
): String {
  return awaitResult { this.setWithOptions(key, value, options, it) }
}

suspend fun RedisTransaction.setBinary(key: String, value: Buffer): String {
  return awaitResult { this.setBinary(key, value, it) }
}

suspend fun RedisTransaction.setBinaryWithOptions(
  key: String,
  value: Buffer,
  options: SetOptions
): String {
  return awaitResult { this.setBinaryWithOptions(key, value, options, it) }
}

suspend fun RedisTransaction.setbit(
  key: String,
  offset: Long,
  bit: Int
): String {
  return awaitResult { this.setbit(key, offset, bit, it) }
}

suspend fun RedisTransaction.setex(
  key: String,
  seconds: Long,
  value: String
): String {
  return awaitResult { this.setex(key, seconds, value, it) }
}

suspend fun RedisTransaction.setnx(key: String, value: String): String {
  return awaitResult { this.setnx(key, value, it) }
}

suspend fun RedisTransaction.setrange(
  key: String,
  offset: Int,
  value: String
): String {
  return awaitResult { this.setrange(key, offset, value, it) }
}

suspend fun RedisTransaction.sinter(keys: MutableList<String>): String {
  return awaitResult { this.sinter(keys, it) }
}

suspend fun RedisTransaction.sinterstore(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.sinterstore(destkey, keys, it) }
}

suspend fun RedisTransaction.sismember(key: String, member: String): String {
  return awaitResult { this.sismember(key, member, it) }
}

suspend fun RedisTransaction.slaveof(host: String, port: Int): String {
  return awaitResult { this.slaveof(host, port, it) }
}

suspend fun RedisTransaction.slaveofNoone(): String {
  return awaitResult { this.slaveofNoone(it) }
}

suspend fun RedisTransaction.slowlogGet(limit: Int): String {
  return awaitResult { this.slowlogGet(limit, it) }
}

suspend fun RedisTransaction.slowlogLen(): String {
  return awaitResult { this.slowlogLen(it) }
}

suspend fun RedisTransaction.slowlogReset(): String {
  return awaitResult { this.slowlogReset(it) }
}

suspend fun RedisTransaction.smembers(key: String): JsonArray {
  return awaitResult { this.smembers(key, it) }
}

suspend fun RedisTransaction.smove(
  key: String,
  destkey: String,
  member: String
): String {
  return awaitResult { this.smove(key, destkey, member, it) }
}

suspend fun RedisTransaction.sort(key: String, options: SortOptions): String {
  return awaitResult { this.sort(key, options, it) }
}

suspend fun RedisTransaction.spop(key: String): String {
  return awaitResult { this.spop(key, it) }
}

suspend fun RedisTransaction.spopMany(key: String, count: Int): String {
  return awaitResult { this.spopMany(key, count, it) }
}

suspend fun RedisTransaction.srandmember(key: String): String {
  return awaitResult { this.srandmember(key, it) }
}

suspend fun RedisTransaction.srandmemberCount(key: String, count: Int): String {
  return awaitResult { this.srandmemberCount(key, count, it) }
}

suspend fun RedisTransaction.srem(key: String, member: String): String {
  return awaitResult { this.srem(key, member, it) }
}

suspend fun RedisTransaction.sremMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.sremMany(key, members, it) }
}

suspend fun RedisTransaction.strlen(key: String): String {
  return awaitResult { this.strlen(key, it) }
}

suspend fun RedisTransaction.subscribe(channel: String): String {
  return awaitResult { this.subscribe(channel, it) }
}

suspend fun RedisTransaction.subscribeMany(channels: MutableList<String>): String {
  return awaitResult { this.subscribeMany(channels, it) }
}

suspend fun RedisTransaction.sunion(keys: MutableList<String>): String {
  return awaitResult { this.sunion(keys, it) }
}

suspend fun RedisTransaction.sunionstore(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.sunionstore(destkey, keys, it) }
}

suspend fun RedisTransaction.sync(): String {
  return awaitResult { this.sync(it) }
}

suspend fun RedisTransaction.time(): String {
  return awaitResult { this.time(it) }
}

suspend fun RedisTransaction.ttl(key: String): String {
  return awaitResult { this.ttl(key, it) }
}

suspend fun RedisTransaction.type(key: String): String {
  return awaitResult { this.type(key, it) }
}

suspend fun RedisTransaction.unsubscribe(channels: MutableList<String>): String {
  return awaitResult { this.unsubscribe(channels, it) }
}

suspend fun RedisTransaction.unwatch(): String {
  return awaitResult { this.unwatch(it) }
}

suspend fun RedisTransaction.wait(numSlaves: Long, timeout: Long): String {
  return awaitResult { this.wait(numSlaves, timeout, it) }
}

suspend fun RedisTransaction.watch(key: String): String {
  return awaitResult { this.watch(key, it) }
}

suspend fun RedisTransaction.watchMany(keys: MutableList<String>): String {
  return awaitResult { this.watchMany(keys, it) }
}

suspend fun RedisTransaction.zadd(
  key: String,
  score: Double,
  member: String
): String {
  return awaitResult { this.zadd(key, score, member, it) }
}

suspend fun RedisTransaction.zaddMany(key: String, members: MutableMap<String, Double>): String {
  return awaitResult { this.zaddMany(key, members, it) }
}

suspend fun RedisTransaction.zcard(key: String): String {
  return awaitResult { this.zcard(key, it) }
}

suspend fun RedisTransaction.zcount(
  key: String,
  min: Double,
  max: Double
): String {
  return awaitResult { this.zcount(key, min, max, it) }
}

suspend fun RedisTransaction.zincrby(
  key: String,
  increment: Double,
  member: String
): String {
  return awaitResult { this.zincrby(key, increment, member, it) }
}

suspend fun RedisTransaction.zinterstore(
  destkey: String,
  sets: MutableList<String>,
  options: AggregateOptions
): String {
  return awaitResult { this.zinterstore(destkey, sets, options, it) }
}

suspend fun RedisTransaction.zinterstoreWeighed(
  destkey: String,
  sets: MutableMap<String, Double>,
  options: AggregateOptions
): String {
  return awaitResult { this.zinterstoreWeighed(destkey, sets, options, it) }
}

suspend fun RedisTransaction.zlexcount(
  key: String,
  min: String,
  max: String
): String {
  return awaitResult { this.zlexcount(key, min, max, it) }
}

suspend fun RedisTransaction.zrange(
  key: String,
  start: Long,
  stop: Long
): String {
  return awaitResult { this.zrange(key, start, stop, it) }
}

suspend fun RedisTransaction.zrangeWithOptions(
  key: String,
  start: Long,
  stop: Long,
  options: RangeOptions
): String {
  return awaitResult { this.zrangeWithOptions(key, start, stop, options, it) }
}

suspend fun RedisTransaction.zrangebylex(
  key: String,
  min: String,
  max: String,
  options: LimitOptions
): String {
  return awaitResult { this.zrangebylex(key, min, max, options, it) }
}

suspend fun RedisTransaction.zrangebyscore(
  key: String,
  min: String,
  max: String,
  options: RangeLimitOptions
): String {
  return awaitResult { this.zrangebyscore(key, min, max, options, it) }
}

suspend fun RedisTransaction.zrank(key: String, member: String): String {
  return awaitResult { this.zrank(key, member, it) }
}

suspend fun RedisTransaction.zrem(key: String, member: String): String {
  return awaitResult { this.zrem(key, member, it) }
}

suspend fun RedisTransaction.zremMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.zremMany(key, members, it) }
}

suspend fun RedisTransaction.zremrangebylex(
  key: String,
  min: String,
  max: String
): String {
  return awaitResult { this.zremrangebylex(key, min, max, it) }
}

suspend fun RedisTransaction.zremrangebyrank(
  key: String,
  start: Long,
  stop: Long
): String {
  return awaitResult { this.zremrangebyrank(key, start, stop, it) }
}

suspend fun RedisTransaction.zremrangebyscore(
  key: String,
  min: String,
  max: String
): String {
  return awaitResult { this.zremrangebyscore(key, min, max, it) }
}

suspend fun RedisTransaction.zrevrange(
  key: String,
  start: Long,
  stop: Long,
  options: RangeOptions
): String {
  return awaitResult { this.zrevrange(key, start, stop, options, it) }
}

suspend fun RedisTransaction.zrevrangebylex(
  key: String,
  max: String,
  min: String,
  options: LimitOptions
): String {
  return awaitResult { this.zrevrangebylex(key, max, min, options, it) }
}

suspend fun RedisTransaction.zrevrangebyscore(
  key: String,
  max: String,
  min: String,
  options: RangeLimitOptions
): String {
  return awaitResult { this.zrevrangebyscore(key, max, min, options, it) }
}

suspend fun RedisTransaction.zrevrank(key: String, member: String): String {
  return awaitResult { this.zrevrank(key, member, it) }
}

suspend fun RedisTransaction.zscore(key: String, member: String): String {
  return awaitResult { this.zscore(key, member, it) }
}

suspend fun RedisTransaction.zunionstore(
  destkey: String,
  sets: MutableList<String>,
  options: AggregateOptions
): String {
  return awaitResult { this.zunionstore(destkey, sets, options, it) }
}

suspend fun RedisTransaction.zunionstoreWeighed(
  key: String,
  sets: MutableMap<String, Double>,
  options: AggregateOptions
): String {
  return awaitResult { this.zunionstoreWeighed(key, sets, options, it) }
}

suspend fun RedisTransaction.scan(cursor: String, options: ScanOptions): String {
  return awaitResult { this.scan(cursor, options, it) }
}

suspend fun RedisTransaction.sscan(
  key: String,
  cursor: String,
  options: ScanOptions
): String {
  return awaitResult { this.sscan(key, cursor, options, it) }
}

suspend fun RedisTransaction.hscan(
  key: String,
  cursor: String,
  options: ScanOptions
): String {
  return awaitResult { this.hscan(key, cursor, options, it) }
}

suspend fun RedisTransaction.zscan(
  key: String,
  cursor: String,
  options: ScanOptions
): String {
  return awaitResult { this.zscan(key, cursor, options, it) }
}

suspend fun RedisTransaction.geoadd(
  key: String,
  longitude: Double,
  latitude: Double,
  member: String
): String {
  return awaitResult { this.geoadd(key, longitude, latitude, member, it) }
}

suspend fun RedisTransaction.geoaddMany(key: String, members: MutableList<GeoMember>): String {
  return awaitResult { this.geoaddMany(key, members, it) }
}

suspend fun RedisTransaction.geohash(key: String, member: String): String {
  return awaitResult { this.geohash(key, member, it) }
}

suspend fun RedisTransaction.geohashMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.geohashMany(key, members, it) }
}

suspend fun RedisTransaction.geopos(key: String, member: String): String {
  return awaitResult { this.geopos(key, member, it) }
}

suspend fun RedisTransaction.geoposMany(key: String, members: MutableList<String>): String {
  return awaitResult { this.geoposMany(key, members, it) }
}

suspend fun RedisTransaction.geodist(
  key: String,
  member1: String,
  member2: String
): String {
  return awaitResult { this.geodist(key, member1, member2, it) }
}

suspend fun RedisTransaction.geodistWithUnit(
  key: String,
  member1: String,
  member2: String,
  unit: GeoUnit
): String {
  return awaitResult { this.geodistWithUnit(key, member1, member2, unit, it) }
}

suspend fun RedisTransaction.georadius(
  key: String,
  longitude: Double,
  latitude: Double,
  radius: Double,
  unit: GeoUnit
): String {
  return awaitResult { this.georadius(key, longitude, latitude, radius, unit, it) }
}

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

suspend fun RedisTransaction.georadiusbymember(
  key: String,
  member: String,
  radius: Double,
  unit: GeoUnit
): String {
  return awaitResult { this.georadiusbymember(key, member, radius, unit, it) }
}

suspend fun RedisTransaction.georadiusbymemberWithOptions(
  key: String,
  member: String,
  radius: Double,
  unit: GeoUnit,
  options: GeoRadiusOptions
): String {
  return awaitResult { this.georadiusbymemberWithOptions(key, member, radius, unit, options, it) }
}

suspend fun RedisTransaction.unlink(key: String): String {
  return awaitResult { this.unlink(key, it) }
}

suspend fun RedisTransaction.unlinkMany(keys: MutableList<String>): String {
  return awaitResult { this.unlinkMany(keys, it) }
}

suspend fun RedisTransaction.swapdb(index1: Int, index2: Int): String {
  return awaitResult { this.swapdb(index1, index2, it) }
}
