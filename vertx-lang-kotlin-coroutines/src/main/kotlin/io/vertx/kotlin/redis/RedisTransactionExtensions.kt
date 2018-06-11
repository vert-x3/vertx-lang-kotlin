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

suspend fun RedisTransaction.append(key: String, value: String): String = awaitResult { this.append(key, value, it) }

suspend fun RedisTransaction.auth(password: String): String = awaitResult { this.auth(password, it) }

suspend fun RedisTransaction.bgrewriteaof(): String = awaitResult { this.bgrewriteaof(it) }

suspend fun RedisTransaction.bgsave(): String = awaitResult { this.bgsave(it) }

suspend fun RedisTransaction.bitcount(key: String): String = awaitResult { this.bitcount(key, it) }

suspend fun RedisTransaction.bitcountRange(
    key: String,
    start: Long,
    end: Long
): String = awaitResult { this.bitcountRange(key, start, end, it) }

suspend fun RedisTransaction.bitop(
    operation: BitOperation,
    destkey: String,
    keys: MutableList<String>
): String = awaitResult { this.bitop(operation, destkey, keys, it) }

suspend fun RedisTransaction.bitpos(key: String, bit: Int): String = awaitResult { this.bitpos(key, bit, it) }

suspend fun RedisTransaction.bitposFrom(
    key: String,
    bit: Int,
    start: Int
): String = awaitResult { this.bitposFrom(key, bit, start, it) }

suspend fun RedisTransaction.bitposRange(
    key: String,
    bit: Int,
    start: Int,
    stop: Int
): String = awaitResult { this.bitposRange(key, bit, start, stop, it) }

suspend fun RedisTransaction.blpop(key: String, seconds: Int): String = awaitResult { this.blpop(key, seconds, it) }

suspend fun RedisTransaction.blpopMany(keys: MutableList<String>, seconds: Int): String = awaitResult { this.blpopMany(keys, seconds, it) }

suspend fun RedisTransaction.brpop(key: String, seconds: Int): String = awaitResult { this.brpop(key, seconds, it) }

suspend fun RedisTransaction.brpopMany(keys: MutableList<String>, seconds: Int): String = awaitResult { this.brpopMany(keys, seconds, it) }

suspend fun RedisTransaction.brpoplpush(
    key: String,
    destkey: String,
    seconds: Int
): String = awaitResult { this.brpoplpush(key, destkey, seconds, it) }

suspend fun RedisTransaction.clientKill(filter: KillFilter): String = awaitResult { this.clientKill(filter, it) }

suspend fun RedisTransaction.clientList(): String = awaitResult { this.clientList(it) }

suspend fun RedisTransaction.clientGetname(): String = awaitResult { this.clientGetname(it) }

suspend fun RedisTransaction.clientPause(millis: Long): String = awaitResult { this.clientPause(millis, it) }

suspend fun RedisTransaction.clientSetname(name: String): String = awaitResult { this.clientSetname(name, it) }

suspend fun RedisTransaction.clusterAddslots(slots: MutableList<String>): String = awaitResult { this.clusterAddslots(slots, it) }

suspend fun RedisTransaction.clusterCountFailureReports(nodeId: String): String = awaitResult { this.clusterCountFailureReports(nodeId, it) }

suspend fun RedisTransaction.clusterCountkeysinslot(slot: Long): String = awaitResult { this.clusterCountkeysinslot(slot, it) }

suspend fun RedisTransaction.clusterDelslots(slot: Long): String = awaitResult { this.clusterDelslots(slot, it) }

suspend fun RedisTransaction.clusterDelslotsMany(slots: MutableList<String>): String = awaitResult { this.clusterDelslotsMany(slots, it) }

suspend fun RedisTransaction.clusterFailover(): String = awaitResult { this.clusterFailover(it) }

suspend fun RedisTransaction.clusterFailOverWithOptions(options: FailoverOptions): String = awaitResult { this.clusterFailOverWithOptions(options, it) }

suspend fun RedisTransaction.clusterForget(nodeId: String): String = awaitResult { this.clusterForget(nodeId, it) }

suspend fun RedisTransaction.clusterGetkeysinslot(slot: Long, count: Long): String = awaitResult { this.clusterGetkeysinslot(slot, count, it) }

suspend fun RedisTransaction.clusterInfo(): String = awaitResult { this.clusterInfo(it) }

suspend fun RedisTransaction.clusterKeyslot(key: String): String = awaitResult { this.clusterKeyslot(key, it) }

suspend fun RedisTransaction.clusterMeet(ip: String, port: Long): String = awaitResult { this.clusterMeet(ip, port, it) }

suspend fun RedisTransaction.clusterNodes(): String = awaitResult { this.clusterNodes(it) }

suspend fun RedisTransaction.clusterReplicate(nodeId: String): String = awaitResult { this.clusterReplicate(nodeId, it) }

suspend fun RedisTransaction.clusterReset(): String = awaitResult { this.clusterReset(it) }

suspend fun RedisTransaction.clusterResetWithOptions(options: ResetOptions): String = awaitResult { this.clusterResetWithOptions(options, it) }

suspend fun RedisTransaction.clusterSaveconfig(): String = awaitResult { this.clusterSaveconfig(it) }

suspend fun RedisTransaction.clusterSetConfigEpoch(epoch: Long): String = awaitResult { this.clusterSetConfigEpoch(epoch, it) }

suspend fun RedisTransaction.clusterSetslot(slot: Long, subcommand: SlotCmd): String = awaitResult { this.clusterSetslot(slot, subcommand, it) }

suspend fun RedisTransaction.clusterSetslotWithNode(
    slot: Long,
    subcommand: SlotCmd,
    nodeId: String
): String = awaitResult { this.clusterSetslotWithNode(slot, subcommand, nodeId, it) }

suspend fun RedisTransaction.clusterSlaves(nodeId: String): String = awaitResult { this.clusterSlaves(nodeId, it) }

suspend fun RedisTransaction.clusterSlots(): String = awaitResult { this.clusterSlots(it) }

suspend fun RedisTransaction.command(): String = awaitResult { this.command(it) }

suspend fun RedisTransaction.commandCount(): String = awaitResult { this.commandCount(it) }

suspend fun RedisTransaction.commandGetkeys(): String = awaitResult { this.commandGetkeys(it) }

suspend fun RedisTransaction.commandInfo(commands: MutableList<String>): String = awaitResult { this.commandInfo(commands, it) }

suspend fun RedisTransaction.configGet(parameter: String): String = awaitResult { this.configGet(parameter, it) }

suspend fun RedisTransaction.configRewrite(): String = awaitResult { this.configRewrite(it) }

suspend fun RedisTransaction.configSet(parameter: String, value: String): String = awaitResult { this.configSet(parameter, value, it) }

suspend fun RedisTransaction.configResetstat(): String = awaitResult { this.configResetstat(it) }

suspend fun RedisTransaction.dbsize(): String = awaitResult { this.dbsize(it) }

suspend fun RedisTransaction.debugObject(key: String): String = awaitResult { this.debugObject(key, it) }

suspend fun RedisTransaction.debugSegfault(): String = awaitResult { this.debugSegfault(it) }

suspend fun RedisTransaction.decr(key: String): String = awaitResult { this.decr(key, it) }

suspend fun RedisTransaction.decrby(key: String, decrement: Long): String = awaitResult { this.decrby(key, decrement, it) }

suspend fun RedisTransaction.del(key: String): String = awaitResult { this.del(key, it) }

suspend fun RedisTransaction.delMany(keys: MutableList<String>): String = awaitResult { this.delMany(keys, it) }

suspend fun RedisTransaction.discard(): String = awaitResult { this.discard(it) }

suspend fun RedisTransaction.dump(key: String): String = awaitResult { this.dump(key, it) }

suspend fun RedisTransaction.echo(message: String): String = awaitResult { this.echo(message, it) }

suspend fun RedisTransaction.eval(
    script: String,
    keys: MutableList<String>,
    args: MutableList<String>
): String = awaitResult { this.eval(script, keys, args, it) }

suspend fun RedisTransaction.evalsha(
    sha1: String,
    keys: MutableList<String>,
    values: MutableList<String>
): String = awaitResult { this.evalsha(sha1, keys, values, it) }

suspend fun RedisTransaction.exec(): JsonArray = awaitResult { this.exec(it) }

suspend fun RedisTransaction.exists(key: String): String = awaitResult { this.exists(key, it) }

suspend fun RedisTransaction.existsMany(keys: MutableList<String>): String = awaitResult { this.existsMany(keys, it) }

suspend fun RedisTransaction.expire(key: String, seconds: Int): String = awaitResult { this.expire(key, seconds, it) }

suspend fun RedisTransaction.expireat(key: String, seconds: Long): String = awaitResult { this.expireat(key, seconds, it) }

suspend fun RedisTransaction.flushall(): String = awaitResult { this.flushall(it) }

suspend fun RedisTransaction.flushdb(): String = awaitResult { this.flushdb(it) }

suspend fun RedisTransaction.get(key: String): String = awaitResult { this.get(key, it) }

suspend fun RedisTransaction.getBinary(key: String): Buffer = awaitResult { this.getBinary(key, it) }

suspend fun RedisTransaction.getbit(key: String, offset: Long): String = awaitResult { this.getbit(key, offset, it) }

suspend fun RedisTransaction.getrange(
    key: String,
    start: Long,
    end: Long
): String = awaitResult { this.getrange(key, start, end, it) }

suspend fun RedisTransaction.getset(key: String, value: String): String = awaitResult { this.getset(key, value, it) }

suspend fun RedisTransaction.hdel(key: String, field: String): String = awaitResult { this.hdel(key, field, it) }

suspend fun RedisTransaction.hdelMany(key: String, fields: MutableList<String>): String = awaitResult { this.hdelMany(key, fields, it) }

suspend fun RedisTransaction.hexists(key: String, field: String): String = awaitResult { this.hexists(key, field, it) }

suspend fun RedisTransaction.hget(key: String, field: String): String = awaitResult { this.hget(key, field, it) }

suspend fun RedisTransaction.hgetall(key: String): String = awaitResult { this.hgetall(key, it) }

suspend fun RedisTransaction.hincrby(
    key: String,
    field: String,
    increment: Long
): String = awaitResult { this.hincrby(key, field, increment, it) }

suspend fun RedisTransaction.hincrbyfloat(
    key: String,
    field: String,
    increment: Double
): String = awaitResult { this.hincrbyfloat(key, field, increment, it) }

suspend fun RedisTransaction.hkeys(key: String): String = awaitResult { this.hkeys(key, it) }

suspend fun RedisTransaction.hlen(key: String): String = awaitResult { this.hlen(key, it) }

suspend fun RedisTransaction.hmget(key: String, fields: MutableList<String>): String = awaitResult { this.hmget(key, fields, it) }

suspend fun RedisTransaction.hmset(key: String, values: JsonObject): String = awaitResult { this.hmset(key, values, it) }

suspend fun RedisTransaction.hset(
    key: String,
    field: String,
    value: String
): String = awaitResult { this.hset(key, field, value, it) }

suspend fun RedisTransaction.hsetnx(
    key: String,
    field: String,
    value: String
): String = awaitResult { this.hsetnx(key, field, value, it) }

suspend fun RedisTransaction.hvals(key: String): String = awaitResult { this.hvals(key, it) }

suspend fun RedisTransaction.incr(key: String): String = awaitResult { this.incr(key, it) }

suspend fun RedisTransaction.incrby(key: String, increment: Long): String = awaitResult { this.incrby(key, increment, it) }

suspend fun RedisTransaction.incrbyfloat(key: String, increment: Double): String = awaitResult { this.incrbyfloat(key, increment, it) }

suspend fun RedisTransaction.info(): String = awaitResult { this.info(it) }

suspend fun RedisTransaction.infoSection(section: String): String = awaitResult { this.infoSection(section, it) }

suspend fun RedisTransaction.keys(pattern: String): String = awaitResult { this.keys(pattern, it) }

suspend fun RedisTransaction.lastsave(): String = awaitResult { this.lastsave(it) }

suspend fun RedisTransaction.lindex(key: String, index: Int): String = awaitResult { this.lindex(key, index, it) }

suspend fun RedisTransaction.linsert(
    key: String,
    option: InsertOptions,
    pivot: String,
    value: String
): String = awaitResult { this.linsert(key, option, pivot, value, it) }

suspend fun RedisTransaction.llen(key: String): String = awaitResult { this.llen(key, it) }

suspend fun RedisTransaction.lpop(key: String): String = awaitResult { this.lpop(key, it) }

suspend fun RedisTransaction.lpushMany(key: String, values: MutableList<String>): String = awaitResult { this.lpushMany(key, values, it) }

suspend fun RedisTransaction.lpush(key: String, value: String): String = awaitResult { this.lpush(key, value, it) }

suspend fun RedisTransaction.lpushx(key: String, value: String): String = awaitResult { this.lpushx(key, value, it) }

suspend fun RedisTransaction.lrange(
    key: String,
    from: Long,
    to: Long
): String = awaitResult { this.lrange(key, from, to, it) }

suspend fun RedisTransaction.lrem(
    key: String,
    count: Long,
    value: String
): String = awaitResult { this.lrem(key, count, value, it) }

suspend fun RedisTransaction.lset(
    key: String,
    index: Long,
    value: String
): String = awaitResult { this.lset(key, index, value, it) }

suspend fun RedisTransaction.ltrim(
    key: String,
    from: Long,
    to: Long
): String = awaitResult { this.ltrim(key, from, to, it) }

suspend fun RedisTransaction.mget(key: String): String = awaitResult { this.mget(key, it) }

suspend fun RedisTransaction.mgetMany(keys: MutableList<String>): String = awaitResult { this.mgetMany(keys, it) }

suspend fun RedisTransaction.migrate(
    host: String,
    port: Int,
    key: String,
    destdb: Int,
    timeout: Long,
    options: MigrateOptions
): String = awaitResult { this.migrate(host, port, key, destdb, timeout, options, it) }

suspend fun RedisTransaction.monitor(): String = awaitResult { this.monitor(it) }

suspend fun RedisTransaction.move(key: String, destdb: Int): String = awaitResult { this.move(key, destdb, it) }

suspend fun RedisTransaction.mset(keyvals: JsonObject): String = awaitResult { this.mset(keyvals, it) }

suspend fun RedisTransaction.msetnx(keyvals: JsonObject): String = awaitResult { this.msetnx(keyvals, it) }

suspend fun RedisTransaction.multi(): String = awaitResult { this.multi(it) }

suspend fun RedisTransaction.`object`(key: String, cmd: ObjectCmd): String = awaitResult { this.`object`(key, cmd, it) }

suspend fun RedisTransaction.persist(key: String): String = awaitResult { this.persist(key, it) }

suspend fun RedisTransaction.pexpire(key: String, millis: Long): String = awaitResult { this.pexpire(key, millis, it) }

suspend fun RedisTransaction.pexpireat(key: String, millis: Long): String = awaitResult { this.pexpireat(key, millis, it) }

suspend fun RedisTransaction.pfadd(key: String, element: String): String = awaitResult { this.pfadd(key, element, it) }

suspend fun RedisTransaction.pfaddMany(key: String, elements: MutableList<String>): String = awaitResult { this.pfaddMany(key, elements, it) }

suspend fun RedisTransaction.pfcount(key: String): String = awaitResult { this.pfcount(key, it) }

suspend fun RedisTransaction.pfcountMany(keys: MutableList<String>): String = awaitResult { this.pfcountMany(keys, it) }

suspend fun RedisTransaction.pfmerge(destkey: String, keys: MutableList<String>): String = awaitResult { this.pfmerge(destkey, keys, it) }

suspend fun RedisTransaction.ping(): String = awaitResult { this.ping(it) }

suspend fun RedisTransaction.psetex(
    key: String,
    millis: Long,
    value: String
): String = awaitResult { this.psetex(key, millis, value, it) }

suspend fun RedisTransaction.psubscribe(pattern: String): String = awaitResult { this.psubscribe(pattern, it) }

suspend fun RedisTransaction.psubscribeMany(patterns: MutableList<String>): String = awaitResult { this.psubscribeMany(patterns, it) }

suspend fun RedisTransaction.pubsubChannels(pattern: String): String = awaitResult { this.pubsubChannels(pattern, it) }

suspend fun RedisTransaction.pubsubNumsub(channels: MutableList<String>): String = awaitResult { this.pubsubNumsub(channels, it) }

suspend fun RedisTransaction.pubsubNumpat(): String = awaitResult { this.pubsubNumpat(it) }

suspend fun RedisTransaction.pttl(key: String): String = awaitResult { this.pttl(key, it) }

suspend fun RedisTransaction.publish(channel: String, message: String): String = awaitResult { this.publish(channel, message, it) }

suspend fun RedisTransaction.punsubscribe(patterns: MutableList<String>): String = awaitResult { this.punsubscribe(patterns, it) }

suspend fun RedisTransaction.randomkey(): String = awaitResult { this.randomkey(it) }

suspend fun RedisTransaction.rename(key: String, newkey: String): String = awaitResult { this.rename(key, newkey, it) }

suspend fun RedisTransaction.renamenx(key: String, newkey: String): String = awaitResult { this.renamenx(key, newkey, it) }

suspend fun RedisTransaction.restore(
    key: String,
    millis: Long,
    serialized: String
): String = awaitResult { this.restore(key, millis, serialized, it) }

suspend fun RedisTransaction.role(): String = awaitResult { this.role(it) }

suspend fun RedisTransaction.rpop(key: String): String = awaitResult { this.rpop(key, it) }

suspend fun RedisTransaction.rpoplpush(key: String, destkey: String): String = awaitResult { this.rpoplpush(key, destkey, it) }

suspend fun RedisTransaction.rpushMany(key: String, values: MutableList<String>): String = awaitResult { this.rpushMany(key, values, it) }

suspend fun RedisTransaction.rpush(key: String, value: String): String = awaitResult { this.rpush(key, value, it) }

suspend fun RedisTransaction.rpushx(key: String, value: String): String = awaitResult { this.rpushx(key, value, it) }

suspend fun RedisTransaction.sadd(key: String, member: String): String = awaitResult { this.sadd(key, member, it) }

suspend fun RedisTransaction.saddMany(key: String, members: MutableList<String>): String = awaitResult { this.saddMany(key, members, it) }

suspend fun RedisTransaction.save(): String = awaitResult { this.save(it) }

suspend fun RedisTransaction.scard(key: String): String = awaitResult { this.scard(key, it) }

suspend fun RedisTransaction.scriptExists(script: String): String = awaitResult { this.scriptExists(script, it) }

suspend fun RedisTransaction.scriptExistsMany(scripts: MutableList<String>): String = awaitResult { this.scriptExistsMany(scripts, it) }

suspend fun RedisTransaction.scriptFlush(): String = awaitResult { this.scriptFlush(it) }

suspend fun RedisTransaction.scriptKill(): String = awaitResult { this.scriptKill(it) }

suspend fun RedisTransaction.scriptLoad(script: String): String = awaitResult { this.scriptLoad(script, it) }

suspend fun RedisTransaction.sdiff(key: String, cmpkeys: MutableList<String>): String = awaitResult { this.sdiff(key, cmpkeys, it) }

suspend fun RedisTransaction.sdiffstore(
    destkey: String,
    key: String,
    cmpkeys: MutableList<String>
): String = awaitResult { this.sdiffstore(destkey, key, cmpkeys, it) }

suspend fun RedisTransaction.select(dbindex: Int): String = awaitResult { this.select(dbindex, it) }

suspend fun RedisTransaction.set(key: String, value: String): String = awaitResult { this.set(key, value, it) }

suspend fun RedisTransaction.setWithOptions(
    key: String,
    value: String,
    options: SetOptions
): String = awaitResult { this.setWithOptions(key, value, options, it) }

suspend fun RedisTransaction.setBinary(key: String, value: Buffer): String = awaitResult { this.setBinary(key, value, it) }

suspend fun RedisTransaction.setBinaryWithOptions(
    key: String,
    value: Buffer,
    options: SetOptions
): String = awaitResult { this.setBinaryWithOptions(key, value, options, it) }

suspend fun RedisTransaction.setbit(
    key: String,
    offset: Long,
    bit: Int
): String = awaitResult { this.setbit(key, offset, bit, it) }

suspend fun RedisTransaction.setex(
    key: String,
    seconds: Long,
    value: String
): String = awaitResult { this.setex(key, seconds, value, it) }

suspend fun RedisTransaction.setnx(key: String, value: String): String = awaitResult { this.setnx(key, value, it) }

suspend fun RedisTransaction.setrange(
    key: String,
    offset: Int,
    value: String
): String = awaitResult { this.setrange(key, offset, value, it) }

suspend fun RedisTransaction.sinter(keys: MutableList<String>): String = awaitResult { this.sinter(keys, it) }

suspend fun RedisTransaction.sinterstore(destkey: String, keys: MutableList<String>): String = awaitResult { this.sinterstore(destkey, keys, it) }

suspend fun RedisTransaction.sismember(key: String, member: String): String = awaitResult { this.sismember(key, member, it) }

suspend fun RedisTransaction.slaveof(host: String, port: Int): String = awaitResult { this.slaveof(host, port, it) }

suspend fun RedisTransaction.slaveofNoone(): String = awaitResult { this.slaveofNoone(it) }

suspend fun RedisTransaction.slowlogGet(limit: Int): String = awaitResult { this.slowlogGet(limit, it) }

suspend fun RedisTransaction.slowlogLen(): String = awaitResult { this.slowlogLen(it) }

suspend fun RedisTransaction.slowlogReset(): String = awaitResult { this.slowlogReset(it) }

suspend fun RedisTransaction.smembers(key: String): JsonArray = awaitResult { this.smembers(key, it) }

suspend fun RedisTransaction.smove(
    key: String,
    destkey: String,
    member: String
): String = awaitResult { this.smove(key, destkey, member, it) }

suspend fun RedisTransaction.sort(key: String, options: SortOptions): String = awaitResult { this.sort(key, options, it) }

suspend fun RedisTransaction.spop(key: String): String = awaitResult { this.spop(key, it) }

suspend fun RedisTransaction.spopMany(key: String, count: Int): String = awaitResult { this.spopMany(key, count, it) }

suspend fun RedisTransaction.srandmember(key: String): String = awaitResult { this.srandmember(key, it) }

suspend fun RedisTransaction.srandmemberCount(key: String, count: Int): String = awaitResult { this.srandmemberCount(key, count, it) }

suspend fun RedisTransaction.srem(key: String, member: String): String = awaitResult { this.srem(key, member, it) }

suspend fun RedisTransaction.sremMany(key: String, members: MutableList<String>): String = awaitResult { this.sremMany(key, members, it) }

suspend fun RedisTransaction.strlen(key: String): String = awaitResult { this.strlen(key, it) }

suspend fun RedisTransaction.subscribe(channel: String): String = awaitResult { this.subscribe(channel, it) }

suspend fun RedisTransaction.subscribeMany(channels: MutableList<String>): String = awaitResult { this.subscribeMany(channels, it) }

suspend fun RedisTransaction.sunion(keys: MutableList<String>): String = awaitResult { this.sunion(keys, it) }

suspend fun RedisTransaction.sunionstore(destkey: String, keys: MutableList<String>): String = awaitResult { this.sunionstore(destkey, keys, it) }

suspend fun RedisTransaction.sync(): String = awaitResult { this.sync(it) }

suspend fun RedisTransaction.time(): String = awaitResult { this.time(it) }

suspend fun RedisTransaction.ttl(key: String): String = awaitResult { this.ttl(key, it) }

suspend fun RedisTransaction.type(key: String): String = awaitResult { this.type(key, it) }

suspend fun RedisTransaction.unsubscribe(channels: MutableList<String>): String = awaitResult { this.unsubscribe(channels, it) }

suspend fun RedisTransaction.unwatch(): String = awaitResult { this.unwatch(it) }

suspend fun RedisTransaction.wait(numSlaves: Long, timeout: Long): String = awaitResult { this.wait(numSlaves, timeout, it) }

suspend fun RedisTransaction.watch(key: String): String = awaitResult { this.watch(key, it) }

suspend fun RedisTransaction.watchMany(keys: MutableList<String>): String = awaitResult { this.watchMany(keys, it) }

suspend fun RedisTransaction.zadd(
    key: String,
    score: Double,
    member: String
): String = awaitResult { this.zadd(key, score, member, it) }

suspend fun RedisTransaction.zaddMany(key: String, members: MutableMap<String, Double>): String = awaitResult { this.zaddMany(key, members, it) }

suspend fun RedisTransaction.zcard(key: String): String = awaitResult { this.zcard(key, it) }

suspend fun RedisTransaction.zcount(
    key: String,
    min: Double,
    max: Double
): String = awaitResult { this.zcount(key, min, max, it) }

suspend fun RedisTransaction.zincrby(
    key: String,
    increment: Double,
    member: String
): String = awaitResult { this.zincrby(key, increment, member, it) }

suspend fun RedisTransaction.zinterstore(
    destkey: String,
    sets: MutableList<String>,
    options: AggregateOptions
): String = awaitResult { this.zinterstore(destkey, sets, options, it) }

suspend fun RedisTransaction.zinterstoreWeighed(
    destkey: String,
    sets: MutableMap<String, Double>,
    options: AggregateOptions
): String = awaitResult { this.zinterstoreWeighed(destkey, sets, options, it) }

suspend fun RedisTransaction.zlexcount(
    key: String,
    min: String,
    max: String
): String = awaitResult { this.zlexcount(key, min, max, it) }

suspend fun RedisTransaction.zrange(
    key: String,
    start: Long,
    stop: Long
): String = awaitResult { this.zrange(key, start, stop, it) }

suspend fun RedisTransaction.zrangeWithOptions(
    key: String,
    start: Long,
    stop: Long,
    options: RangeOptions
): String = awaitResult { this.zrangeWithOptions(key, start, stop, options, it) }

suspend fun RedisTransaction.zrangebylex(
    key: String,
    min: String,
    max: String,
    options: LimitOptions
): String = awaitResult { this.zrangebylex(key, min, max, options, it) }

suspend fun RedisTransaction.zrangebyscore(
    key: String,
    min: String,
    max: String,
    options: RangeLimitOptions
): String = awaitResult { this.zrangebyscore(key, min, max, options, it) }

suspend fun RedisTransaction.zrank(key: String, member: String): String = awaitResult { this.zrank(key, member, it) }

suspend fun RedisTransaction.zrem(key: String, member: String): String = awaitResult { this.zrem(key, member, it) }

suspend fun RedisTransaction.zremMany(key: String, members: MutableList<String>): String = awaitResult { this.zremMany(key, members, it) }

suspend fun RedisTransaction.zremrangebylex(
    key: String,
    min: String,
    max: String
): String = awaitResult { this.zremrangebylex(key, min, max, it) }

suspend fun RedisTransaction.zremrangebyrank(
    key: String,
    start: Long,
    stop: Long
): String = awaitResult { this.zremrangebyrank(key, start, stop, it) }

suspend fun RedisTransaction.zremrangebyscore(
    key: String,
    min: String,
    max: String
): String = awaitResult { this.zremrangebyscore(key, min, max, it) }

suspend fun RedisTransaction.zrevrange(
    key: String,
    start: Long,
    stop: Long,
    options: RangeOptions
): String = awaitResult { this.zrevrange(key, start, stop, options, it) }

suspend fun RedisTransaction.zrevrangebylex(
    key: String,
    max: String,
    min: String,
    options: LimitOptions
): String = awaitResult { this.zrevrangebylex(key, max, min, options, it) }

suspend fun RedisTransaction.zrevrangebyscore(
    key: String,
    max: String,
    min: String,
    options: RangeLimitOptions
): String = awaitResult { this.zrevrangebyscore(key, max, min, options, it) }

suspend fun RedisTransaction.zrevrank(key: String, member: String): String = awaitResult { this.zrevrank(key, member, it) }

suspend fun RedisTransaction.zscore(key: String, member: String): String = awaitResult { this.zscore(key, member, it) }

suspend fun RedisTransaction.zunionstore(
    destkey: String,
    sets: MutableList<String>,
    options: AggregateOptions
): String = awaitResult { this.zunionstore(destkey, sets, options, it) }

suspend fun RedisTransaction.zunionstoreWeighed(
    key: String,
    sets: MutableMap<String, Double>,
    options: AggregateOptions
): String = awaitResult { this.zunionstoreWeighed(key, sets, options, it) }

suspend fun RedisTransaction.scan(cursor: String, options: ScanOptions): String = awaitResult { this.scan(cursor, options, it) }

suspend fun RedisTransaction.sscan(
    key: String,
    cursor: String,
    options: ScanOptions
): String = awaitResult { this.sscan(key, cursor, options, it) }

suspend fun RedisTransaction.hscan(
    key: String,
    cursor: String,
    options: ScanOptions
): String = awaitResult { this.hscan(key, cursor, options, it) }

suspend fun RedisTransaction.zscan(
    key: String,
    cursor: String,
    options: ScanOptions
): String = awaitResult { this.zscan(key, cursor, options, it) }

suspend fun RedisTransaction.geoadd(
    key: String,
    longitude: Double,
    latitude: Double,
    member: String
): String = awaitResult { this.geoadd(key, longitude, latitude, member, it) }

suspend fun RedisTransaction.geoaddMany(key: String, members: MutableList<GeoMember>): String = awaitResult { this.geoaddMany(key, members, it) }

suspend fun RedisTransaction.geohash(key: String, member: String): String = awaitResult { this.geohash(key, member, it) }

suspend fun RedisTransaction.geohashMany(key: String, members: MutableList<String>): String = awaitResult { this.geohashMany(key, members, it) }

suspend fun RedisTransaction.geopos(key: String, member: String): String = awaitResult { this.geopos(key, member, it) }

suspend fun RedisTransaction.geoposMany(key: String, members: MutableList<String>): String = awaitResult { this.geoposMany(key, members, it) }

suspend fun RedisTransaction.geodist(
    key: String,
    member1: String,
    member2: String
): String = awaitResult { this.geodist(key, member1, member2, it) }

suspend fun RedisTransaction.geodistWithUnit(
    key: String,
    member1: String,
    member2: String,
    unit: GeoUnit
): String = awaitResult { this.geodistWithUnit(key, member1, member2, unit, it) }

suspend fun RedisTransaction.georadius(
    key: String,
    longitude: Double,
    latitude: Double,
    radius: Double,
    unit: GeoUnit
): String = awaitResult { this.georadius(key, longitude, latitude, radius, unit, it) }

suspend fun RedisTransaction.georadiusWithOptions(
    key: String,
    longitude: Double,
    latitude: Double,
    radius: Double,
    unit: GeoUnit,
    options: GeoRadiusOptions
): String = awaitResult { this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it) }

suspend fun RedisTransaction.georadiusbymember(
    key: String,
    member: String,
    radius: Double,
    unit: GeoUnit
): String = awaitResult { this.georadiusbymember(key, member, radius, unit, it) }

suspend fun RedisTransaction.georadiusbymemberWithOptions(
    key: String,
    member: String,
    radius: Double,
    unit: GeoUnit,
    options: GeoRadiusOptions
): String = awaitResult { this.georadiusbymemberWithOptions(key, member, radius, unit, options, it) }

suspend fun RedisTransaction.unlink(key: String): String = awaitResult { this.unlink(key, it) }

suspend fun RedisTransaction.unlinkMany(keys: MutableList<String>): String = awaitResult { this.unlinkMany(keys, it) }

suspend fun RedisTransaction.swapdb(index1: Int, index2: Int): String = awaitResult { this.swapdb(index1, index2, it) }
