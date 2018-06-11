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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList
import kotlin.collections.MutableMap

suspend fun RedisClient.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun RedisClient.append(key: String, value: String): Long {
  return awaitResult { this.append(key, value, it) }
}

suspend fun RedisClient.auth(password: String): String {
  return awaitResult { this.auth(password, it) }
}

suspend fun RedisClient.bgrewriteaof(): String {
  return awaitResult { this.bgrewriteaof(it) }
}

suspend fun RedisClient.bgsave(): String {
  return awaitResult { this.bgsave(it) }
}

suspend fun RedisClient.bitcount(key: String): Long {
  return awaitResult { this.bitcount(key, it) }
}

suspend fun RedisClient.bitcountRange(
  key: String,
  start: Long,
  end: Long
): Long {
  return awaitResult { this.bitcountRange(key, start, end, it) }
}

suspend fun RedisClient.bitop(
  operation: BitOperation,
  destkey: String,
  keys: MutableList<String>
): Long {
  return awaitResult { this.bitop(operation, destkey, keys, it) }
}

suspend fun RedisClient.bitpos(key: String, bit: Int): Long {
  return awaitResult { this.bitpos(key, bit, it) }
}

suspend fun RedisClient.bitposFrom(
  key: String,
  bit: Int,
  start: Int
): Long {
  return awaitResult { this.bitposFrom(key, bit, start, it) }
}

suspend fun RedisClient.bitposRange(
  key: String,
  bit: Int,
  start: Int,
  stop: Int
): Long {
  return awaitResult { this.bitposRange(key, bit, start, stop, it) }
}

suspend fun RedisClient.blpop(key: String, seconds: Int): JsonArray {
  return awaitResult { this.blpop(key, seconds, it) }
}

suspend fun RedisClient.blpopMany(keys: MutableList<String>, seconds: Int): JsonArray {
  return awaitResult { this.blpopMany(keys, seconds, it) }
}

suspend fun RedisClient.brpop(key: String, seconds: Int): JsonArray {
  return awaitResult { this.brpop(key, seconds, it) }
}

suspend fun RedisClient.brpopMany(keys: MutableList<String>, seconds: Int): JsonArray {
  return awaitResult { this.brpopMany(keys, seconds, it) }
}

suspend fun RedisClient.brpoplpush(
  key: String,
  destkey: String,
  seconds: Int
): String {
  return awaitResult { this.brpoplpush(key, destkey, seconds, it) }
}

suspend fun RedisClient.clientKill(filter: KillFilter): Long {
  return awaitResult { this.clientKill(filter, it) }
}

suspend fun RedisClient.clientList(): String {
  return awaitResult { this.clientList(it) }
}

suspend fun RedisClient.clientGetname(): String {
  return awaitResult { this.clientGetname(it) }
}

suspend fun RedisClient.clientPause(millis: Long): String {
  return awaitResult { this.clientPause(millis, it) }
}

suspend fun RedisClient.clientSetname(name: String): String {
  return awaitResult { this.clientSetname(name, it) }
}

suspend fun RedisClient.clusterAddslots(slots: MutableList<Long>) {
  awaitResult<Void?> { this.clusterAddslots(slots, it) }
}

suspend fun RedisClient.clusterCountFailureReports(nodeId: String): Long {
  return awaitResult { this.clusterCountFailureReports(nodeId, it) }
}

suspend fun RedisClient.clusterCountkeysinslot(slot: Long): Long {
  return awaitResult { this.clusterCountkeysinslot(slot, it) }
}

suspend fun RedisClient.clusterDelslots(slot: Long) {
  awaitResult<Void?> { this.clusterDelslots(slot, it) }
}

suspend fun RedisClient.clusterDelslotsMany(slots: MutableList<Long>) {
  awaitResult<Void?> { this.clusterDelslotsMany(slots, it) }
}

suspend fun RedisClient.clusterFailover() {
  awaitResult<Void?> { this.clusterFailover(it) }
}

suspend fun RedisClient.clusterFailOverWithOptions(options: FailoverOptions) {
  awaitResult<Void?> { this.clusterFailOverWithOptions(options, it) }
}

suspend fun RedisClient.clusterForget(nodeId: String) {
  awaitResult<Void?> { this.clusterForget(nodeId, it) }
}

suspend fun RedisClient.clusterGetkeysinslot(slot: Long, count: Long): JsonArray {
  return awaitResult { this.clusterGetkeysinslot(slot, count, it) }
}

suspend fun RedisClient.clusterInfo(): JsonArray {
  return awaitResult { this.clusterInfo(it) }
}

suspend fun RedisClient.clusterKeyslot(key: String): Long {
  return awaitResult { this.clusterKeyslot(key, it) }
}

suspend fun RedisClient.clusterMeet(ip: String, port: Long) {
  awaitResult<Void?> { this.clusterMeet(ip, port, it) }
}

suspend fun RedisClient.clusterNodes(): JsonArray {
  return awaitResult { this.clusterNodes(it) }
}

suspend fun RedisClient.clusterReplicate(nodeId: String) {
  awaitResult<Void?> { this.clusterReplicate(nodeId, it) }
}

suspend fun RedisClient.clusterReset() {
  awaitResult<Void?> { this.clusterReset(it) }
}

suspend fun RedisClient.clusterResetWithOptions(options: ResetOptions) {
  awaitResult<Void?> { this.clusterResetWithOptions(options, it) }
}

suspend fun RedisClient.clusterSaveconfig() {
  awaitResult<Void?> { this.clusterSaveconfig(it) }
}

suspend fun RedisClient.clusterSetConfigEpoch(epoch: Long) {
  awaitResult<Void?> { this.clusterSetConfigEpoch(epoch, it) }
}

suspend fun RedisClient.clusterSetslot(slot: Long, subcommand: SlotCmd) {
  awaitResult<Void?> { this.clusterSetslot(slot, subcommand, it) }
}

suspend fun RedisClient.clusterSetslotWithNode(
  slot: Long,
  subcommand: SlotCmd,
  nodeId: String
) {
  awaitResult<Void?> { this.clusterSetslotWithNode(slot, subcommand, nodeId, it) }
}

suspend fun RedisClient.clusterSlaves(nodeId: String): JsonArray {
  return awaitResult { this.clusterSlaves(nodeId, it) }
}

suspend fun RedisClient.clusterSlots(): JsonArray {
  return awaitResult { this.clusterSlots(it) }
}

suspend fun RedisClient.command(): JsonArray {
  return awaitResult { this.command(it) }
}

suspend fun RedisClient.commandCount(): Long {
  return awaitResult { this.commandCount(it) }
}

suspend fun RedisClient.commandGetkeys(): JsonArray {
  return awaitResult { this.commandGetkeys(it) }
}

suspend fun RedisClient.commandInfo(commands: MutableList<String>): JsonArray {
  return awaitResult { this.commandInfo(commands, it) }
}

suspend fun RedisClient.configGet(parameter: String): JsonArray {
  return awaitResult { this.configGet(parameter, it) }
}

suspend fun RedisClient.configRewrite(): String {
  return awaitResult { this.configRewrite(it) }
}

suspend fun RedisClient.configSet(parameter: String, value: String): String {
  return awaitResult { this.configSet(parameter, value, it) }
}

suspend fun RedisClient.configResetstat(): String {
  return awaitResult { this.configResetstat(it) }
}

suspend fun RedisClient.dbsize(): Long {
  return awaitResult { this.dbsize(it) }
}

suspend fun RedisClient.debugObject(key: String): String {
  return awaitResult { this.debugObject(key, it) }
}

suspend fun RedisClient.debugSegfault(): String {
  return awaitResult { this.debugSegfault(it) }
}

suspend fun RedisClient.decr(key: String): Long {
  return awaitResult { this.decr(key, it) }
}

suspend fun RedisClient.decrby(key: String, decrement: Long): Long {
  return awaitResult { this.decrby(key, decrement, it) }
}

suspend fun RedisClient.del(key: String): Long {
  return awaitResult { this.del(key, it) }
}

suspend fun RedisClient.delMany(keys: MutableList<String>): Long {
  return awaitResult { this.delMany(keys, it) }
}

suspend fun RedisClient.dump(key: String): String {
  return awaitResult { this.dump(key, it) }
}

suspend fun RedisClient.echo(message: String): String {
  return awaitResult { this.echo(message, it) }
}

suspend fun RedisClient.eval(
  script: String,
  keys: MutableList<String>,
  args: MutableList<String>
): JsonArray {
  return awaitResult { this.eval(script, keys, args, it) }
}

suspend fun RedisClient.evalsha(
  sha1: String,
  keys: MutableList<String>,
  values: MutableList<String>
): JsonArray {
  return awaitResult { this.evalsha(sha1, keys, values, it) }
}

suspend fun RedisClient.evalScript(
  script: Script,
  keys: MutableList<String>,
  args: MutableList<String>
): JsonArray {
  return awaitResult { this.evalScript(script, keys, args, it) }
}

suspend fun RedisClient.exists(key: String): Long {
  return awaitResult { this.exists(key, it) }
}

suspend fun RedisClient.existsMany(keys: MutableList<String>): Long {
  return awaitResult { this.existsMany(keys, it) }
}

suspend fun RedisClient.expire(key: String, seconds: Long): Long {
  return awaitResult { this.expire(key, seconds, it) }
}

suspend fun RedisClient.expireat(key: String, seconds: Long): Long {
  return awaitResult { this.expireat(key, seconds, it) }
}

suspend fun RedisClient.flushall(): String {
  return awaitResult { this.flushall(it) }
}

suspend fun RedisClient.flushdb(): String {
  return awaitResult { this.flushdb(it) }
}

suspend fun RedisClient.get(key: String): String {
  return awaitResult { this.get(key, it) }
}

suspend fun RedisClient.getBinary(key: String): Buffer {
  return awaitResult { this.getBinary(key, it) }
}

suspend fun RedisClient.getbit(key: String, offset: Long): Long {
  return awaitResult { this.getbit(key, offset, it) }
}

suspend fun RedisClient.getrange(
  key: String,
  start: Long,
  end: Long
): String {
  return awaitResult { this.getrange(key, start, end, it) }
}

suspend fun RedisClient.getset(key: String, value: String): String {
  return awaitResult { this.getset(key, value, it) }
}

suspend fun RedisClient.hdel(key: String, field: String): Long {
  return awaitResult { this.hdel(key, field, it) }
}

suspend fun RedisClient.hdelMany(key: String, fields: MutableList<String>): Long {
  return awaitResult { this.hdelMany(key, fields, it) }
}

suspend fun RedisClient.hexists(key: String, field: String): Long {
  return awaitResult { this.hexists(key, field, it) }
}

suspend fun RedisClient.hget(key: String, field: String): String {
  return awaitResult { this.hget(key, field, it) }
}

suspend fun RedisClient.hgetall(key: String): JsonObject {
  return awaitResult { this.hgetall(key, it) }
}

suspend fun RedisClient.hincrby(
  key: String,
  field: String,
  increment: Long
): Long {
  return awaitResult { this.hincrby(key, field, increment, it) }
}

suspend fun RedisClient.hincrbyfloat(
  key: String,
  field: String,
  increment: Double
): String {
  return awaitResult { this.hincrbyfloat(key, field, increment, it) }
}

suspend fun RedisClient.hkeys(key: String): JsonArray {
  return awaitResult { this.hkeys(key, it) }
}

suspend fun RedisClient.hlen(key: String): Long {
  return awaitResult { this.hlen(key, it) }
}

suspend fun RedisClient.hmget(key: String, fields: MutableList<String>): JsonArray {
  return awaitResult { this.hmget(key, fields, it) }
}

suspend fun RedisClient.hmset(key: String, values: JsonObject): String {
  return awaitResult { this.hmset(key, values, it) }
}

suspend fun RedisClient.hset(
  key: String,
  field: String,
  value: String
): Long {
  return awaitResult { this.hset(key, field, value, it) }
}

suspend fun RedisClient.hsetnx(
  key: String,
  field: String,
  value: String
): Long {
  return awaitResult { this.hsetnx(key, field, value, it) }
}

suspend fun RedisClient.hvals(key: String): JsonArray {
  return awaitResult { this.hvals(key, it) }
}

suspend fun RedisClient.incr(key: String): Long {
  return awaitResult { this.incr(key, it) }
}

suspend fun RedisClient.incrby(key: String, increment: Long): Long {
  return awaitResult { this.incrby(key, increment, it) }
}

suspend fun RedisClient.incrbyfloat(key: String, increment: Double): String {
  return awaitResult { this.incrbyfloat(key, increment, it) }
}

suspend fun RedisClient.info(): JsonObject {
  return awaitResult { this.info(it) }
}

suspend fun RedisClient.infoSection(section: String): JsonObject {
  return awaitResult { this.infoSection(section, it) }
}

suspend fun RedisClient.keys(pattern: String): JsonArray {
  return awaitResult { this.keys(pattern, it) }
}

suspend fun RedisClient.lastsave(): Long {
  return awaitResult { this.lastsave(it) }
}

suspend fun RedisClient.lindex(key: String, index: Int): String {
  return awaitResult { this.lindex(key, index, it) }
}

suspend fun RedisClient.linsert(
  key: String,
  option: InsertOptions,
  pivot: String,
  value: String
): Long {
  return awaitResult { this.linsert(key, option, pivot, value, it) }
}

suspend fun RedisClient.llen(key: String): Long {
  return awaitResult { this.llen(key, it) }
}

suspend fun RedisClient.lpop(key: String): String {
  return awaitResult { this.lpop(key, it) }
}

suspend fun RedisClient.lpushMany(key: String, values: MutableList<String>): Long {
  return awaitResult { this.lpushMany(key, values, it) }
}

suspend fun RedisClient.lpush(key: String, value: String): Long {
  return awaitResult { this.lpush(key, value, it) }
}

suspend fun RedisClient.lpushx(key: String, value: String): Long {
  return awaitResult { this.lpushx(key, value, it) }
}

suspend fun RedisClient.lrange(
  key: String,
  from: Long,
  to: Long
): JsonArray {
  return awaitResult { this.lrange(key, from, to, it) }
}

suspend fun RedisClient.lrem(
  key: String,
  count: Long,
  value: String
): Long {
  return awaitResult { this.lrem(key, count, value, it) }
}

suspend fun RedisClient.lset(
  key: String,
  index: Long,
  value: String
): String {
  return awaitResult { this.lset(key, index, value, it) }
}

suspend fun RedisClient.ltrim(
  key: String,
  from: Long,
  to: Long
): String {
  return awaitResult { this.ltrim(key, from, to, it) }
}

suspend fun RedisClient.mget(key: String): JsonArray {
  return awaitResult { this.mget(key, it) }
}

suspend fun RedisClient.mgetMany(keys: MutableList<String>): JsonArray {
  return awaitResult { this.mgetMany(keys, it) }
}

suspend fun RedisClient.migrate(
  host: String,
  port: Int,
  key: String,
  destdb: Int,
  timeout: Long,
  options: MigrateOptions
): String {
  return awaitResult { this.migrate(host, port, key, destdb, timeout, options, it) }
}

suspend fun RedisClient.monitor() {
  awaitResult<Void?> { this.monitor(it) }
}

suspend fun RedisClient.move(key: String, destdb: Int): Long {
  return awaitResult { this.move(key, destdb, it) }
}

suspend fun RedisClient.mset(keyvals: JsonObject): String {
  return awaitResult { this.mset(keyvals, it) }
}

suspend fun RedisClient.msetnx(keyvals: JsonObject): Long {
  return awaitResult { this.msetnx(keyvals, it) }
}

suspend fun RedisClient.`object`(key: String, cmd: ObjectCmd) {
  awaitResult<Void?> { this.`object`(key, cmd, it) }
}

suspend fun RedisClient.persist(key: String): Long {
  return awaitResult { this.persist(key, it) }
}

suspend fun RedisClient.pexpire(key: String, millis: Long): Long {
  return awaitResult { this.pexpire(key, millis, it) }
}

suspend fun RedisClient.pexpireat(key: String, millis: Long): Long {
  return awaitResult { this.pexpireat(key, millis, it) }
}

suspend fun RedisClient.pfadd(key: String, element: String): Long {
  return awaitResult { this.pfadd(key, element, it) }
}

suspend fun RedisClient.pfaddMany(key: String, elements: MutableList<String>): Long {
  return awaitResult { this.pfaddMany(key, elements, it) }
}

suspend fun RedisClient.pfcount(key: String): Long {
  return awaitResult { this.pfcount(key, it) }
}

suspend fun RedisClient.pfcountMany(keys: MutableList<String>): Long {
  return awaitResult { this.pfcountMany(keys, it) }
}

suspend fun RedisClient.pfmerge(destkey: String, keys: MutableList<String>): String {
  return awaitResult { this.pfmerge(destkey, keys, it) }
}

suspend fun RedisClient.ping(): String {
  return awaitResult { this.ping(it) }
}

suspend fun RedisClient.psetex(
  key: String,
  millis: Long,
  value: String
) {
  awaitResult<Void?> { this.psetex(key, millis, value, it) }
}

suspend fun RedisClient.psubscribe(pattern: String): JsonArray {
  return awaitResult { this.psubscribe(pattern, it) }
}

suspend fun RedisClient.psubscribeMany(patterns: MutableList<String>): JsonArray {
  return awaitResult { this.psubscribeMany(patterns, it) }
}

suspend fun RedisClient.pubsubChannels(pattern: String): JsonArray {
  return awaitResult { this.pubsubChannels(pattern, it) }
}

suspend fun RedisClient.pubsubNumsub(channels: MutableList<String>): JsonArray {
  return awaitResult { this.pubsubNumsub(channels, it) }
}

suspend fun RedisClient.pubsubNumpat(): Long {
  return awaitResult { this.pubsubNumpat(it) }
}

suspend fun RedisClient.pttl(key: String): Long {
  return awaitResult { this.pttl(key, it) }
}

suspend fun RedisClient.publish(channel: String, message: String): Long {
  return awaitResult { this.publish(channel, message, it) }
}

suspend fun RedisClient.punsubscribe(patterns: MutableList<String>) {
  awaitResult<Void?> { this.punsubscribe(patterns, it) }
}

suspend fun RedisClient.randomkey(): String {
  return awaitResult { this.randomkey(it) }
}

suspend fun RedisClient.rename(key: String, newkey: String): String {
  return awaitResult { this.rename(key, newkey, it) }
}

suspend fun RedisClient.renamenx(key: String, newkey: String): Long {
  return awaitResult { this.renamenx(key, newkey, it) }
}

suspend fun RedisClient.restore(
  key: String,
  millis: Long,
  serialized: String
): String {
  return awaitResult { this.restore(key, millis, serialized, it) }
}

suspend fun RedisClient.role(): JsonArray {
  return awaitResult { this.role(it) }
}

suspend fun RedisClient.rpop(key: String): String {
  return awaitResult { this.rpop(key, it) }
}

suspend fun RedisClient.rpoplpush(key: String, destkey: String): String {
  return awaitResult { this.rpoplpush(key, destkey, it) }
}

suspend fun RedisClient.rpushMany(key: String, values: MutableList<String>): Long {
  return awaitResult { this.rpushMany(key, values, it) }
}

suspend fun RedisClient.rpush(key: String, value: String): Long {
  return awaitResult { this.rpush(key, value, it) }
}

suspend fun RedisClient.rpushx(key: String, value: String): Long {
  return awaitResult { this.rpushx(key, value, it) }
}

suspend fun RedisClient.sadd(key: String, member: String): Long {
  return awaitResult { this.sadd(key, member, it) }
}

suspend fun RedisClient.saddMany(key: String, members: MutableList<String>): Long {
  return awaitResult { this.saddMany(key, members, it) }
}

suspend fun RedisClient.save(): String {
  return awaitResult { this.save(it) }
}

suspend fun RedisClient.scard(key: String): Long {
  return awaitResult { this.scard(key, it) }
}

suspend fun RedisClient.scriptExists(script: String): JsonArray {
  return awaitResult { this.scriptExists(script, it) }
}

suspend fun RedisClient.scriptExistsMany(scripts: MutableList<String>): JsonArray {
  return awaitResult { this.scriptExistsMany(scripts, it) }
}

suspend fun RedisClient.scriptFlush(): String {
  return awaitResult { this.scriptFlush(it) }
}

suspend fun RedisClient.scriptKill(): String {
  return awaitResult { this.scriptKill(it) }
}

suspend fun RedisClient.scriptLoad(script: String): String {
  return awaitResult { this.scriptLoad(script, it) }
}

suspend fun RedisClient.sdiff(key: String, cmpkeys: MutableList<String>): JsonArray {
  return awaitResult { this.sdiff(key, cmpkeys, it) }
}

suspend fun RedisClient.sdiffstore(
  destkey: String,
  key: String,
  cmpkeys: MutableList<String>
): Long {
  return awaitResult { this.sdiffstore(destkey, key, cmpkeys, it) }
}

suspend fun RedisClient.select(dbindex: Int): String {
  return awaitResult { this.select(dbindex, it) }
}

suspend fun RedisClient.set(key: String, value: String) {
  awaitResult<Void?> { this.set(key, value, it) }
}

suspend fun RedisClient.setWithOptions(
  key: String,
  value: String,
  options: SetOptions
): String {
  return awaitResult { this.setWithOptions(key, value, options, it) }
}

suspend fun RedisClient.setBinary(key: String, value: Buffer) {
  awaitResult<Void?> { this.setBinary(key, value, it) }
}

suspend fun RedisClient.setBinaryWithOptions(
  key: String,
  value: Buffer,
  options: SetOptions
) {
  awaitResult<Void?> { this.setBinaryWithOptions(key, value, options, it) }
}

suspend fun RedisClient.setbit(
  key: String,
  offset: Long,
  bit: Int
): Long {
  return awaitResult { this.setbit(key, offset, bit, it) }
}

suspend fun RedisClient.setex(
  key: String,
  seconds: Long,
  value: String
): String {
  return awaitResult { this.setex(key, seconds, value, it) }
}

suspend fun RedisClient.setnx(key: String, value: String): Long {
  return awaitResult { this.setnx(key, value, it) }
}

suspend fun RedisClient.setrange(
  key: String,
  offset: Int,
  value: String
): Long {
  return awaitResult { this.setrange(key, offset, value, it) }
}

suspend fun RedisClient.sinter(keys: MutableList<String>): JsonArray {
  return awaitResult { this.sinter(keys, it) }
}

suspend fun RedisClient.sinterstore(destkey: String, keys: MutableList<String>): Long {
  return awaitResult { this.sinterstore(destkey, keys, it) }
}

suspend fun RedisClient.sismember(key: String, member: String): Long {
  return awaitResult { this.sismember(key, member, it) }
}

suspend fun RedisClient.slaveof(host: String, port: Int): String {
  return awaitResult { this.slaveof(host, port, it) }
}

suspend fun RedisClient.slaveofNoone(): String {
  return awaitResult { this.slaveofNoone(it) }
}

suspend fun RedisClient.slowlogGet(limit: Int): JsonArray {
  return awaitResult { this.slowlogGet(limit, it) }
}

suspend fun RedisClient.slowlogLen(): Long {
  return awaitResult { this.slowlogLen(it) }
}

suspend fun RedisClient.slowlogReset() {
  awaitResult<Void?> { this.slowlogReset(it) }
}

suspend fun RedisClient.smembers(key: String): JsonArray {
  return awaitResult { this.smembers(key, it) }
}

suspend fun RedisClient.smove(
  key: String,
  destkey: String,
  member: String
): Long {
  return awaitResult { this.smove(key, destkey, member, it) }
}

suspend fun RedisClient.sort(key: String, options: SortOptions): JsonArray {
  return awaitResult { this.sort(key, options, it) }
}

suspend fun RedisClient.spop(key: String): String {
  return awaitResult { this.spop(key, it) }
}

suspend fun RedisClient.spopMany(key: String, count: Int): JsonArray {
  return awaitResult { this.spopMany(key, count, it) }
}

suspend fun RedisClient.srandmember(key: String): String {
  return awaitResult { this.srandmember(key, it) }
}

suspend fun RedisClient.srandmemberCount(key: String, count: Int): JsonArray {
  return awaitResult { this.srandmemberCount(key, count, it) }
}

suspend fun RedisClient.srem(key: String, member: String): Long {
  return awaitResult { this.srem(key, member, it) }
}

suspend fun RedisClient.sremMany(key: String, members: MutableList<String>): Long {
  return awaitResult { this.sremMany(key, members, it) }
}

suspend fun RedisClient.strlen(key: String): Long {
  return awaitResult { this.strlen(key, it) }
}

suspend fun RedisClient.subscribe(channel: String): JsonArray {
  return awaitResult { this.subscribe(channel, it) }
}

suspend fun RedisClient.subscribeMany(channels: MutableList<String>): JsonArray {
  return awaitResult { this.subscribeMany(channels, it) }
}

suspend fun RedisClient.sunion(keys: MutableList<String>): JsonArray {
  return awaitResult { this.sunion(keys, it) }
}

suspend fun RedisClient.sunionstore(destkey: String, keys: MutableList<String>): Long {
  return awaitResult { this.sunionstore(destkey, keys, it) }
}

suspend fun RedisClient.sync() {
  awaitResult<Void?> { this.sync(it) }
}

suspend fun RedisClient.time(): JsonArray {
  return awaitResult { this.time(it) }
}

suspend fun RedisClient.ttl(key: String): Long {
  return awaitResult { this.ttl(key, it) }
}

suspend fun RedisClient.type(key: String): String {
  return awaitResult { this.type(key, it) }
}

suspend fun RedisClient.unsubscribe(channels: MutableList<String>) {
  awaitResult<Void?> { this.unsubscribe(channels, it) }
}

suspend fun RedisClient.wait(numSlaves: Long, timeout: Long): String {
  return awaitResult { this.wait(numSlaves, timeout, it) }
}

suspend fun RedisClient.zadd(
  key: String,
  score: Double,
  member: String
): Long {
  return awaitResult { this.zadd(key, score, member, it) }
}

suspend fun RedisClient.zaddMany(key: String, members: MutableMap<String, Double>): Long {
  return awaitResult { this.zaddMany(key, members, it) }
}

suspend fun RedisClient.zcard(key: String): Long {
  return awaitResult { this.zcard(key, it) }
}

suspend fun RedisClient.zcount(
  key: String,
  min: Double,
  max: Double
): Long {
  return awaitResult { this.zcount(key, min, max, it) }
}

suspend fun RedisClient.zincrby(
  key: String,
  increment: Double,
  member: String
): String {
  return awaitResult { this.zincrby(key, increment, member, it) }
}

suspend fun RedisClient.zinterstore(
  destkey: String,
  sets: MutableList<String>,
  options: AggregateOptions
): Long {
  return awaitResult { this.zinterstore(destkey, sets, options, it) }
}

suspend fun RedisClient.zinterstoreWeighed(
  destkey: String,
  sets: MutableMap<String, Double>,
  options: AggregateOptions
): Long {
  return awaitResult { this.zinterstoreWeighed(destkey, sets, options, it) }
}

suspend fun RedisClient.zlexcount(
  key: String,
  min: String,
  max: String
): Long {
  return awaitResult { this.zlexcount(key, min, max, it) }
}

suspend fun RedisClient.zrange(
  key: String,
  start: Long,
  stop: Long
): JsonArray {
  return awaitResult { this.zrange(key, start, stop, it) }
}

suspend fun RedisClient.zrangeWithOptions(
  key: String,
  start: Long,
  stop: Long,
  options: RangeOptions
): JsonArray {
  return awaitResult { this.zrangeWithOptions(key, start, stop, options, it) }
}

suspend fun RedisClient.zrangebylex(
  key: String,
  min: String,
  max: String,
  options: LimitOptions
): JsonArray {
  return awaitResult { this.zrangebylex(key, min, max, options, it) }
}

suspend fun RedisClient.zrangebyscore(
  key: String,
  min: String,
  max: String,
  options: RangeLimitOptions
): JsonArray {
  return awaitResult { this.zrangebyscore(key, min, max, options, it) }
}

suspend fun RedisClient.zrank(key: String, member: String): Long {
  return awaitResult { this.zrank(key, member, it) }
}

suspend fun RedisClient.zrem(key: String, member: String): Long {
  return awaitResult { this.zrem(key, member, it) }
}

suspend fun RedisClient.zremMany(key: String, members: MutableList<String>): Long {
  return awaitResult { this.zremMany(key, members, it) }
}

suspend fun RedisClient.zremrangebylex(
  key: String,
  min: String,
  max: String
): Long {
  return awaitResult { this.zremrangebylex(key, min, max, it) }
}

suspend fun RedisClient.zremrangebyrank(
  key: String,
  start: Long,
  stop: Long
): Long {
  return awaitResult { this.zremrangebyrank(key, start, stop, it) }
}

suspend fun RedisClient.zremrangebyscore(
  key: String,
  min: String,
  max: String
): Long {
  return awaitResult { this.zremrangebyscore(key, min, max, it) }
}

suspend fun RedisClient.zrevrange(
  key: String,
  start: Long,
  stop: Long,
  options: RangeOptions
): JsonArray {
  return awaitResult { this.zrevrange(key, start, stop, options, it) }
}

suspend fun RedisClient.zrevrangebylex(
  key: String,
  max: String,
  min: String,
  options: LimitOptions
): JsonArray {
  return awaitResult { this.zrevrangebylex(key, max, min, options, it) }
}

suspend fun RedisClient.zrevrangebyscore(
  key: String,
  max: String,
  min: String,
  options: RangeLimitOptions
): JsonArray {
  return awaitResult { this.zrevrangebyscore(key, max, min, options, it) }
}

suspend fun RedisClient.zrevrank(key: String, member: String): Long {
  return awaitResult { this.zrevrank(key, member, it) }
}

suspend fun RedisClient.zscore(key: String, member: String): String {
  return awaitResult { this.zscore(key, member, it) }
}

suspend fun RedisClient.zunionstore(
  destkey: String,
  sets: MutableList<String>,
  options: AggregateOptions
): Long {
  return awaitResult { this.zunionstore(destkey, sets, options, it) }
}

suspend fun RedisClient.zunionstoreWeighed(
  key: String,
  sets: MutableMap<String, Double>,
  options: AggregateOptions
): Long {
  return awaitResult { this.zunionstoreWeighed(key, sets, options, it) }
}

suspend fun RedisClient.scan(cursor: String, options: ScanOptions): JsonArray {
  return awaitResult { this.scan(cursor, options, it) }
}

suspend fun RedisClient.sscan(
  key: String,
  cursor: String,
  options: ScanOptions
): JsonArray {
  return awaitResult { this.sscan(key, cursor, options, it) }
}

suspend fun RedisClient.hscan(
  key: String,
  cursor: String,
  options: ScanOptions
): JsonArray {
  return awaitResult { this.hscan(key, cursor, options, it) }
}

suspend fun RedisClient.zscan(
  key: String,
  cursor: String,
  options: ScanOptions
): JsonArray {
  return awaitResult { this.zscan(key, cursor, options, it) }
}

suspend fun RedisClient.geoadd(
  key: String,
  longitude: Double,
  latitude: Double,
  member: String
): Long {
  return awaitResult { this.geoadd(key, longitude, latitude, member, it) }
}

suspend fun RedisClient.geoaddMany(key: String, members: MutableList<GeoMember>): Long {
  return awaitResult { this.geoaddMany(key, members, it) }
}

suspend fun RedisClient.geohash(key: String, member: String): JsonArray {
  return awaitResult { this.geohash(key, member, it) }
}

suspend fun RedisClient.geohashMany(key: String, members: MutableList<String>): JsonArray {
  return awaitResult { this.geohashMany(key, members, it) }
}

suspend fun RedisClient.geopos(key: String, member: String): JsonArray {
  return awaitResult { this.geopos(key, member, it) }
}

suspend fun RedisClient.geoposMany(key: String, members: MutableList<String>): JsonArray {
  return awaitResult { this.geoposMany(key, members, it) }
}

suspend fun RedisClient.geodist(
  key: String,
  member1: String,
  member2: String
): String {
  return awaitResult { this.geodist(key, member1, member2, it) }
}

suspend fun RedisClient.geodistWithUnit(
  key: String,
  member1: String,
  member2: String,
  unit: GeoUnit
): String {
  return awaitResult { this.geodistWithUnit(key, member1, member2, unit, it) }
}

suspend fun RedisClient.georadius(
  key: String,
  longitude: Double,
  latitude: Double,
  radius: Double,
  unit: GeoUnit
): JsonArray {
  return awaitResult { this.georadius(key, longitude, latitude, radius, unit, it) }
}

suspend fun RedisClient.georadiusWithOptions(
  key: String,
  longitude: Double,
  latitude: Double,
  radius: Double,
  unit: GeoUnit,
  options: GeoRadiusOptions
): JsonArray {
  return awaitResult { this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it) }
}

suspend fun RedisClient.georadiusbymember(
  key: String,
  member: String,
  radius: Double,
  unit: GeoUnit
): JsonArray {
  return awaitResult { this.georadiusbymember(key, member, radius, unit, it) }
}

suspend fun RedisClient.georadiusbymemberWithOptions(
  key: String,
  member: String,
  radius: Double,
  unit: GeoUnit,
  options: GeoRadiusOptions
): JsonArray {
  return awaitResult { this.georadiusbymemberWithOptions(key, member, radius, unit, options, it) }
}

suspend fun RedisClient.clientReply(options: ClientReplyOptions): String {
  return awaitResult { this.clientReply(options, it) }
}

suspend fun RedisClient.hstrlen(key: String, field: String): Long {
  return awaitResult { this.hstrlen(key, field, it) }
}

suspend fun RedisClient.touch(key: String): Long {
  return awaitResult { this.touch(key, it) }
}

suspend fun RedisClient.touchMany(keys: MutableList<String>): Long {
  return awaitResult { this.touchMany(keys, it) }
}

suspend fun RedisClient.scriptDebug(scriptDebugOptions: ScriptDebugOptions): String {
  return awaitResult { this.scriptDebug(scriptDebugOptions, it) }
}

suspend fun RedisClient.bitfield(key: String, bitFieldOptions: BitFieldOptions): JsonArray {
  return awaitResult { this.bitfield(key, bitFieldOptions, it) }
}

suspend fun RedisClient.bitfieldWithOverflow(
  key: String,
  commands: BitFieldOptions,
  overflow: BitFieldOverflowOptions
): JsonArray {
  return awaitResult { this.bitfieldWithOverflow(key, commands, overflow, it) }
}

suspend fun RedisClient.unlink(key: String): Long {
  return awaitResult { this.unlink(key, it) }
}

suspend fun RedisClient.unlinkMany(keys: MutableList<String>): Long {
  return awaitResult { this.unlinkMany(keys, it) }
}

suspend fun RedisClient.swapdb(index1: Int, index2: Int): String {
  return awaitResult { this.swapdb(index1, index2, it) }
}
