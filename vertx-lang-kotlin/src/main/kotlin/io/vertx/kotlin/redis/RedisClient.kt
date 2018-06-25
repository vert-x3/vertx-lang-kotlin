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

suspend fun RedisClient.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.appendAwait(key : String, value : String) : Long {
    return awaitResult{
        this.append(key, value, it)
    }
}

suspend fun RedisClient.authAwait(password : String) : String {
    return awaitResult{
        this.auth(password, it)
    }
}

suspend fun RedisClient.bgrewriteaofAwait() : String {
    return awaitResult{
        this.bgrewriteaof(it)
    }
}

suspend fun RedisClient.bgsaveAwait() : String {
    return awaitResult{
        this.bgsave(it)
    }
}

suspend fun RedisClient.bitcountAwait(key : String) : Long {
    return awaitResult{
        this.bitcount(key, it)
    }
}

suspend fun RedisClient.bitcountRangeAwait(key : String, start : Long, end : Long) : Long {
    return awaitResult{
        this.bitcountRange(key, start, end, it)
    }
}

suspend fun RedisClient.bitopAwait(operation : BitOperation, destkey : String, keys : List<String>) : Long {
    return awaitResult{
        this.bitop(operation, destkey, keys, it)
    }
}

suspend fun RedisClient.bitposAwait(key : String, bit : Int) : Long {
    return awaitResult{
        this.bitpos(key, bit, it)
    }
}

suspend fun RedisClient.bitposFromAwait(key : String, bit : Int, start : Int) : Long {
    return awaitResult{
        this.bitposFrom(key, bit, start, it)
    }
}

suspend fun RedisClient.bitposRangeAwait(key : String, bit : Int, start : Int, stop : Int) : Long {
    return awaitResult{
        this.bitposRange(key, bit, start, stop, it)
    }
}

suspend fun RedisClient.blpopAwait(key : String, seconds : Int) : JsonArray {
    return awaitResult{
        this.blpop(key, seconds, it)
    }
}

suspend fun RedisClient.blpopManyAwait(keys : List<String>, seconds : Int) : JsonArray {
    return awaitResult{
        this.blpopMany(keys, seconds, it)
    }
}

suspend fun RedisClient.brpopAwait(key : String, seconds : Int) : JsonArray {
    return awaitResult{
        this.brpop(key, seconds, it)
    }
}

suspend fun RedisClient.brpopManyAwait(keys : List<String>, seconds : Int) : JsonArray {
    return awaitResult{
        this.brpopMany(keys, seconds, it)
    }
}

suspend fun RedisClient.brpoplpushAwait(key : String, destkey : String, seconds : Int) : String {
    return awaitResult{
        this.brpoplpush(key, destkey, seconds, it)
    }
}

suspend fun RedisClient.clientKillAwait(filter : KillFilter) : Long {
    return awaitResult{
        this.clientKill(filter, it)
    }
}

suspend fun RedisClient.clientListAwait() : String {
    return awaitResult{
        this.clientList(it)
    }
}

suspend fun RedisClient.clientGetnameAwait() : String {
    return awaitResult{
        this.clientGetname(it)
    }
}

suspend fun RedisClient.clientPauseAwait(millis : Long) : String {
    return awaitResult{
        this.clientPause(millis, it)
    }
}

suspend fun RedisClient.clientSetnameAwait(name : String) : String {
    return awaitResult{
        this.clientSetname(name, it)
    }
}

suspend fun RedisClient.clusterAddslotsAwait(slots : List<Long>) : Unit {
    return awaitResult{
        this.clusterAddslots(slots, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterCountFailureReportsAwait(nodeId : String) : Long {
    return awaitResult{
        this.clusterCountFailureReports(nodeId, it)
    }
}

suspend fun RedisClient.clusterCountkeysinslotAwait(slot : Long) : Long {
    return awaitResult{
        this.clusterCountkeysinslot(slot, it)
    }
}

suspend fun RedisClient.clusterDelslotsAwait(slot : Long) : Unit {
    return awaitResult{
        this.clusterDelslots(slot, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterDelslotsManyAwait(slots : List<Long>) : Unit {
    return awaitResult{
        this.clusterDelslotsMany(slots, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterFailoverAwait() : Unit {
    return awaitResult{
        this.clusterFailover({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterFailOverWithOptionsAwait(options : FailoverOptions) : Unit {
    return awaitResult{
        this.clusterFailOverWithOptions(options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterForgetAwait(nodeId : String) : Unit {
    return awaitResult{
        this.clusterForget(nodeId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterGetkeysinslotAwait(slot : Long, count : Long) : JsonArray {
    return awaitResult{
        this.clusterGetkeysinslot(slot, count, it)
    }
}

suspend fun RedisClient.clusterInfoAwait() : JsonArray {
    return awaitResult{
        this.clusterInfo(it)
    }
}

suspend fun RedisClient.clusterKeyslotAwait(key : String) : Long {
    return awaitResult{
        this.clusterKeyslot(key, it)
    }
}

suspend fun RedisClient.clusterMeetAwait(ip : String, port : Long) : Unit {
    return awaitResult{
        this.clusterMeet(ip, port, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterNodesAwait() : JsonArray {
    return awaitResult{
        this.clusterNodes(it)
    }
}

suspend fun RedisClient.clusterReplicateAwait(nodeId : String) : Unit {
    return awaitResult{
        this.clusterReplicate(nodeId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterResetAwait() : Unit {
    return awaitResult{
        this.clusterReset({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterResetWithOptionsAwait(options : ResetOptions) : Unit {
    return awaitResult{
        this.clusterResetWithOptions(options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterSaveconfigAwait() : Unit {
    return awaitResult{
        this.clusterSaveconfig({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterSetConfigEpochAwait(epoch : Long) : Unit {
    return awaitResult{
        this.clusterSetConfigEpoch(epoch, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterSetslotAwait(slot : Long, subcommand : SlotCmd) : Unit {
    return awaitResult{
        this.clusterSetslot(slot, subcommand, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterSetslotWithNodeAwait(slot : Long, subcommand : SlotCmd, nodeId : String) : Unit {
    return awaitResult{
        this.clusterSetslotWithNode(slot, subcommand, nodeId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.clusterSlavesAwait(nodeId : String) : JsonArray {
    return awaitResult{
        this.clusterSlaves(nodeId, it)
    }
}

suspend fun RedisClient.clusterSlotsAwait() : JsonArray {
    return awaitResult{
        this.clusterSlots(it)
    }
}

suspend fun RedisClient.commandAwait() : JsonArray {
    return awaitResult{
        this.command(it)
    }
}

suspend fun RedisClient.commandCountAwait() : Long {
    return awaitResult{
        this.commandCount(it)
    }
}

suspend fun RedisClient.commandGetkeysAwait() : JsonArray {
    return awaitResult{
        this.commandGetkeys(it)
    }
}

suspend fun RedisClient.commandInfoAwait(commands : List<String>) : JsonArray {
    return awaitResult{
        this.commandInfo(commands, it)
    }
}

suspend fun RedisClient.configGetAwait(parameter : String) : JsonArray {
    return awaitResult{
        this.configGet(parameter, it)
    }
}

suspend fun RedisClient.configRewriteAwait() : String {
    return awaitResult{
        this.configRewrite(it)
    }
}

suspend fun RedisClient.configSetAwait(parameter : String, value : String) : String {
    return awaitResult{
        this.configSet(parameter, value, it)
    }
}

suspend fun RedisClient.configResetstatAwait() : String {
    return awaitResult{
        this.configResetstat(it)
    }
}

suspend fun RedisClient.dbsizeAwait() : Long {
    return awaitResult{
        this.dbsize(it)
    }
}

suspend fun RedisClient.debugObjectAwait(key : String) : String {
    return awaitResult{
        this.debugObject(key, it)
    }
}

suspend fun RedisClient.debugSegfaultAwait() : String {
    return awaitResult{
        this.debugSegfault(it)
    }
}

suspend fun RedisClient.decrAwait(key : String) : Long {
    return awaitResult{
        this.decr(key, it)
    }
}

suspend fun RedisClient.decrbyAwait(key : String, decrement : Long) : Long {
    return awaitResult{
        this.decrby(key, decrement, it)
    }
}

suspend fun RedisClient.delAwait(key : String) : Long {
    return awaitResult{
        this.del(key, it)
    }
}

suspend fun RedisClient.delManyAwait(keys : List<String>) : Long {
    return awaitResult{
        this.delMany(keys, it)
    }
}

suspend fun RedisClient.dumpAwait(key : String) : String {
    return awaitResult{
        this.dump(key, it)
    }
}

suspend fun RedisClient.echoAwait(message : String) : String {
    return awaitResult{
        this.echo(message, it)
    }
}

suspend fun RedisClient.evalAwait(script : String, keys : List<String>, args : List<String>) : JsonArray {
    return awaitResult{
        this.eval(script, keys, args, it)
    }
}

suspend fun RedisClient.evalshaAwait(sha1 : String, keys : List<String>, values : List<String>) : JsonArray {
    return awaitResult{
        this.evalsha(sha1, keys, values, it)
    }
}

suspend fun RedisClient.evalScriptAwait(script : Script, keys : List<String>, args : List<String>) : JsonArray {
    return awaitResult{
        this.evalScript(script, keys, args, it)
    }
}

suspend fun RedisClient.existsAwait(key : String) : Long {
    return awaitResult{
        this.exists(key, it)
    }
}

suspend fun RedisClient.existsManyAwait(keys : List<String>) : Long {
    return awaitResult{
        this.existsMany(keys, it)
    }
}

suspend fun RedisClient.expireAwait(key : String, seconds : Long) : Long {
    return awaitResult{
        this.expire(key, seconds, it)
    }
}

suspend fun RedisClient.expireatAwait(key : String, seconds : Long) : Long {
    return awaitResult{
        this.expireat(key, seconds, it)
    }
}

suspend fun RedisClient.flushallAwait() : String {
    return awaitResult{
        this.flushall(it)
    }
}

suspend fun RedisClient.flushdbAwait() : String {
    return awaitResult{
        this.flushdb(it)
    }
}

suspend fun RedisClient.getAwait(key : String) : String {
    return awaitResult{
        this.get(key, it)
    }
}

suspend fun RedisClient.getBinaryAwait(key : String) : Buffer {
    return awaitResult{
        this.getBinary(key, it)
    }
}

suspend fun RedisClient.getbitAwait(key : String, offset : Long) : Long {
    return awaitResult{
        this.getbit(key, offset, it)
    }
}

suspend fun RedisClient.getrangeAwait(key : String, start : Long, end : Long) : String {
    return awaitResult{
        this.getrange(key, start, end, it)
    }
}

suspend fun RedisClient.getsetAwait(key : String, value : String) : String {
    return awaitResult{
        this.getset(key, value, it)
    }
}

suspend fun RedisClient.hdelAwait(key : String, field : String) : Long {
    return awaitResult{
        this.hdel(key, field, it)
    }
}

suspend fun RedisClient.hdelManyAwait(key : String, fields : List<String>) : Long {
    return awaitResult{
        this.hdelMany(key, fields, it)
    }
}

suspend fun RedisClient.hexistsAwait(key : String, field : String) : Long {
    return awaitResult{
        this.hexists(key, field, it)
    }
}

suspend fun RedisClient.hgetAwait(key : String, field : String) : String {
    return awaitResult{
        this.hget(key, field, it)
    }
}

suspend fun RedisClient.hgetallAwait(key : String) : JsonObject {
    return awaitResult{
        this.hgetall(key, it)
    }
}

suspend fun RedisClient.hincrbyAwait(key : String, field : String, increment : Long) : Long {
    return awaitResult{
        this.hincrby(key, field, increment, it)
    }
}

suspend fun RedisClient.hincrbyfloatAwait(key : String, field : String, increment : Double) : String {
    return awaitResult{
        this.hincrbyfloat(key, field, increment, it)
    }
}

suspend fun RedisClient.hkeysAwait(key : String) : JsonArray {
    return awaitResult{
        this.hkeys(key, it)
    }
}

suspend fun RedisClient.hlenAwait(key : String) : Long {
    return awaitResult{
        this.hlen(key, it)
    }
}

suspend fun RedisClient.hmgetAwait(key : String, fields : List<String>) : JsonArray {
    return awaitResult{
        this.hmget(key, fields, it)
    }
}

suspend fun RedisClient.hmsetAwait(key : String, values : JsonObject) : String {
    return awaitResult{
        this.hmset(key, values, it)
    }
}

suspend fun RedisClient.hsetAwait(key : String, field : String, value : String) : Long {
    return awaitResult{
        this.hset(key, field, value, it)
    }
}

suspend fun RedisClient.hsetnxAwait(key : String, field : String, value : String) : Long {
    return awaitResult{
        this.hsetnx(key, field, value, it)
    }
}

suspend fun RedisClient.hvalsAwait(key : String) : JsonArray {
    return awaitResult{
        this.hvals(key, it)
    }
}

suspend fun RedisClient.incrAwait(key : String) : Long {
    return awaitResult{
        this.incr(key, it)
    }
}

suspend fun RedisClient.incrbyAwait(key : String, increment : Long) : Long {
    return awaitResult{
        this.incrby(key, increment, it)
    }
}

suspend fun RedisClient.incrbyfloatAwait(key : String, increment : Double) : String {
    return awaitResult{
        this.incrbyfloat(key, increment, it)
    }
}

suspend fun RedisClient.infoAwait() : JsonObject {
    return awaitResult{
        this.info(it)
    }
}

suspend fun RedisClient.infoSectionAwait(section : String) : JsonObject {
    return awaitResult{
        this.infoSection(section, it)
    }
}

suspend fun RedisClient.keysAwait(pattern : String) : JsonArray {
    return awaitResult{
        this.keys(pattern, it)
    }
}

suspend fun RedisClient.lastsaveAwait() : Long {
    return awaitResult{
        this.lastsave(it)
    }
}

suspend fun RedisClient.lindexAwait(key : String, index : Int) : String {
    return awaitResult{
        this.lindex(key, index, it)
    }
}

suspend fun RedisClient.linsertAwait(key : String, option : InsertOptions, pivot : String, value : String) : Long {
    return awaitResult{
        this.linsert(key, option, pivot, value, it)
    }
}

suspend fun RedisClient.llenAwait(key : String) : Long {
    return awaitResult{
        this.llen(key, it)
    }
}

suspend fun RedisClient.lpopAwait(key : String) : String {
    return awaitResult{
        this.lpop(key, it)
    }
}

suspend fun RedisClient.lpushManyAwait(key : String, values : List<String>) : Long {
    return awaitResult{
        this.lpushMany(key, values, it)
    }
}

suspend fun RedisClient.lpushAwait(key : String, value : String) : Long {
    return awaitResult{
        this.lpush(key, value, it)
    }
}

suspend fun RedisClient.lpushxAwait(key : String, value : String) : Long {
    return awaitResult{
        this.lpushx(key, value, it)
    }
}

suspend fun RedisClient.lrangeAwait(key : String, from : Long, to : Long) : JsonArray {
    return awaitResult{
        this.lrange(key, from, to, it)
    }
}

suspend fun RedisClient.lremAwait(key : String, count : Long, value : String) : Long {
    return awaitResult{
        this.lrem(key, count, value, it)
    }
}

suspend fun RedisClient.lsetAwait(key : String, index : Long, value : String) : String {
    return awaitResult{
        this.lset(key, index, value, it)
    }
}

suspend fun RedisClient.ltrimAwait(key : String, from : Long, to : Long) : String {
    return awaitResult{
        this.ltrim(key, from, to, it)
    }
}

suspend fun RedisClient.mgetAwait(key : String) : JsonArray {
    return awaitResult{
        this.mget(key, it)
    }
}

suspend fun RedisClient.mgetManyAwait(keys : List<String>) : JsonArray {
    return awaitResult{
        this.mgetMany(keys, it)
    }
}

suspend fun RedisClient.migrateAwait(host : String, port : Int, key : String, destdb : Int, timeout : Long, options : MigrateOptions) : String {
    return awaitResult{
        this.migrate(host, port, key, destdb, timeout, options, it)
    }
}

suspend fun RedisClient.monitorAwait() : Unit {
    return awaitResult{
        this.monitor({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.moveAwait(key : String, destdb : Int) : Long {
    return awaitResult{
        this.move(key, destdb, it)
    }
}

suspend fun RedisClient.msetAwait(keyvals : JsonObject) : String {
    return awaitResult{
        this.mset(keyvals, it)
    }
}

suspend fun RedisClient.msetnxAwait(keyvals : JsonObject) : Long {
    return awaitResult{
        this.msetnx(keyvals, it)
    }
}

suspend fun RedisClient.objectAwait(key : String, cmd : ObjectCmd) : Unit {
    return awaitResult{
        this.`object`(key, cmd, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.persistAwait(key : String) : Long {
    return awaitResult{
        this.persist(key, it)
    }
}

suspend fun RedisClient.pexpireAwait(key : String, millis : Long) : Long {
    return awaitResult{
        this.pexpire(key, millis, it)
    }
}

suspend fun RedisClient.pexpireatAwait(key : String, millis : Long) : Long {
    return awaitResult{
        this.pexpireat(key, millis, it)
    }
}

suspend fun RedisClient.pfaddAwait(key : String, element : String) : Long {
    return awaitResult{
        this.pfadd(key, element, it)
    }
}

suspend fun RedisClient.pfaddManyAwait(key : String, elements : List<String>) : Long {
    return awaitResult{
        this.pfaddMany(key, elements, it)
    }
}

suspend fun RedisClient.pfcountAwait(key : String) : Long {
    return awaitResult{
        this.pfcount(key, it)
    }
}

suspend fun RedisClient.pfcountManyAwait(keys : List<String>) : Long {
    return awaitResult{
        this.pfcountMany(keys, it)
    }
}

suspend fun RedisClient.pfmergeAwait(destkey : String, keys : List<String>) : String {
    return awaitResult{
        this.pfmerge(destkey, keys, it)
    }
}

suspend fun RedisClient.pingAwait() : String {
    return awaitResult{
        this.ping(it)
    }
}

suspend fun RedisClient.psetexAwait(key : String, millis : Long, value : String) : Unit {
    return awaitResult{
        this.psetex(key, millis, value, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.psubscribeAwait(pattern : String) : JsonArray {
    return awaitResult{
        this.psubscribe(pattern, it)
    }
}

suspend fun RedisClient.psubscribeManyAwait(patterns : List<String>) : JsonArray {
    return awaitResult{
        this.psubscribeMany(patterns, it)
    }
}

suspend fun RedisClient.pubsubChannelsAwait(pattern : String) : JsonArray {
    return awaitResult{
        this.pubsubChannels(pattern, it)
    }
}

suspend fun RedisClient.pubsubNumsubAwait(channels : List<String>) : JsonArray {
    return awaitResult{
        this.pubsubNumsub(channels, it)
    }
}

suspend fun RedisClient.pubsubNumpatAwait() : Long {
    return awaitResult{
        this.pubsubNumpat(it)
    }
}

suspend fun RedisClient.pttlAwait(key : String) : Long {
    return awaitResult{
        this.pttl(key, it)
    }
}

suspend fun RedisClient.publishAwait(channel : String, message : String) : Long {
    return awaitResult{
        this.publish(channel, message, it)
    }
}

suspend fun RedisClient.punsubscribeAwait(patterns : List<String>) : Unit {
    return awaitResult{
        this.punsubscribe(patterns, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.randomkeyAwait() : String {
    return awaitResult{
        this.randomkey(it)
    }
}

suspend fun RedisClient.renameAwait(key : String, newkey : String) : String {
    return awaitResult{
        this.rename(key, newkey, it)
    }
}

suspend fun RedisClient.renamenxAwait(key : String, newkey : String) : Long {
    return awaitResult{
        this.renamenx(key, newkey, it)
    }
}

suspend fun RedisClient.restoreAwait(key : String, millis : Long, serialized : String) : String {
    return awaitResult{
        this.restore(key, millis, serialized, it)
    }
}

suspend fun RedisClient.roleAwait() : JsonArray {
    return awaitResult{
        this.role(it)
    }
}

suspend fun RedisClient.rpopAwait(key : String) : String {
    return awaitResult{
        this.rpop(key, it)
    }
}

suspend fun RedisClient.rpoplpushAwait(key : String, destkey : String) : String {
    return awaitResult{
        this.rpoplpush(key, destkey, it)
    }
}

suspend fun RedisClient.rpushManyAwait(key : String, values : List<String>) : Long {
    return awaitResult{
        this.rpushMany(key, values, it)
    }
}

suspend fun RedisClient.rpushAwait(key : String, value : String) : Long {
    return awaitResult{
        this.rpush(key, value, it)
    }
}

suspend fun RedisClient.rpushxAwait(key : String, value : String) : Long {
    return awaitResult{
        this.rpushx(key, value, it)
    }
}

suspend fun RedisClient.saddAwait(key : String, member : String) : Long {
    return awaitResult{
        this.sadd(key, member, it)
    }
}

suspend fun RedisClient.saddManyAwait(key : String, members : List<String>) : Long {
    return awaitResult{
        this.saddMany(key, members, it)
    }
}

suspend fun RedisClient.saveAwait() : String {
    return awaitResult{
        this.save(it)
    }
}

suspend fun RedisClient.scardAwait(key : String) : Long {
    return awaitResult{
        this.scard(key, it)
    }
}

suspend fun RedisClient.scriptExistsAwait(script : String) : JsonArray {
    return awaitResult{
        this.scriptExists(script, it)
    }
}

suspend fun RedisClient.scriptExistsManyAwait(scripts : List<String>) : JsonArray {
    return awaitResult{
        this.scriptExistsMany(scripts, it)
    }
}

suspend fun RedisClient.scriptFlushAwait() : String {
    return awaitResult{
        this.scriptFlush(it)
    }
}

suspend fun RedisClient.scriptKillAwait() : String {
    return awaitResult{
        this.scriptKill(it)
    }
}

suspend fun RedisClient.scriptLoadAwait(script : String) : String {
    return awaitResult{
        this.scriptLoad(script, it)
    }
}

suspend fun RedisClient.sdiffAwait(key : String, cmpkeys : List<String>) : JsonArray {
    return awaitResult{
        this.sdiff(key, cmpkeys, it)
    }
}

suspend fun RedisClient.sdiffstoreAwait(destkey : String, key : String, cmpkeys : List<String>) : Long {
    return awaitResult{
        this.sdiffstore(destkey, key, cmpkeys, it)
    }
}

suspend fun RedisClient.selectAwait(dbindex : Int) : String {
    return awaitResult{
        this.select(dbindex, it)
    }
}

suspend fun RedisClient.setAwait(key : String, value : String) : Unit {
    return awaitResult{
        this.set(key, value, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.setWithOptionsAwait(key : String, value : String, options : SetOptions) : String {
    return awaitResult{
        this.setWithOptions(key, value, options, it)
    }
}

suspend fun RedisClient.setBinaryAwait(key : String, value : Buffer) : Unit {
    return awaitResult{
        this.setBinary(key, value, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.setBinaryWithOptionsAwait(key : String, value : Buffer, options : SetOptions) : Unit {
    return awaitResult{
        this.setBinaryWithOptions(key, value, options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.setbitAwait(key : String, offset : Long, bit : Int) : Long {
    return awaitResult{
        this.setbit(key, offset, bit, it)
    }
}

suspend fun RedisClient.setexAwait(key : String, seconds : Long, value : String) : String {
    return awaitResult{
        this.setex(key, seconds, value, it)
    }
}

suspend fun RedisClient.setnxAwait(key : String, value : String) : Long {
    return awaitResult{
        this.setnx(key, value, it)
    }
}

suspend fun RedisClient.setrangeAwait(key : String, offset : Int, value : String) : Long {
    return awaitResult{
        this.setrange(key, offset, value, it)
    }
}

suspend fun RedisClient.sinterAwait(keys : List<String>) : JsonArray {
    return awaitResult{
        this.sinter(keys, it)
    }
}

suspend fun RedisClient.sinterstoreAwait(destkey : String, keys : List<String>) : Long {
    return awaitResult{
        this.sinterstore(destkey, keys, it)
    }
}

suspend fun RedisClient.sismemberAwait(key : String, member : String) : Long {
    return awaitResult{
        this.sismember(key, member, it)
    }
}

suspend fun RedisClient.slaveofAwait(host : String, port : Int) : String {
    return awaitResult{
        this.slaveof(host, port, it)
    }
}

suspend fun RedisClient.slaveofNooneAwait() : String {
    return awaitResult{
        this.slaveofNoone(it)
    }
}

suspend fun RedisClient.slowlogGetAwait(limit : Int) : JsonArray {
    return awaitResult{
        this.slowlogGet(limit, it)
    }
}

suspend fun RedisClient.slowlogLenAwait() : Long {
    return awaitResult{
        this.slowlogLen(it)
    }
}

suspend fun RedisClient.slowlogResetAwait() : Unit {
    return awaitResult{
        this.slowlogReset({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.smembersAwait(key : String) : JsonArray {
    return awaitResult{
        this.smembers(key, it)
    }
}

suspend fun RedisClient.smoveAwait(key : String, destkey : String, member : String) : Long {
    return awaitResult{
        this.smove(key, destkey, member, it)
    }
}

suspend fun RedisClient.sortAwait(key : String, options : SortOptions) : JsonArray {
    return awaitResult{
        this.sort(key, options, it)
    }
}

suspend fun RedisClient.spopAwait(key : String) : String {
    return awaitResult{
        this.spop(key, it)
    }
}

suspend fun RedisClient.spopManyAwait(key : String, count : Int) : JsonArray {
    return awaitResult{
        this.spopMany(key, count, it)
    }
}

suspend fun RedisClient.srandmemberAwait(key : String) : String {
    return awaitResult{
        this.srandmember(key, it)
    }
}

suspend fun RedisClient.srandmemberCountAwait(key : String, count : Int) : JsonArray {
    return awaitResult{
        this.srandmemberCount(key, count, it)
    }
}

suspend fun RedisClient.sremAwait(key : String, member : String) : Long {
    return awaitResult{
        this.srem(key, member, it)
    }
}

suspend fun RedisClient.sremManyAwait(key : String, members : List<String>) : Long {
    return awaitResult{
        this.sremMany(key, members, it)
    }
}

suspend fun RedisClient.strlenAwait(key : String) : Long {
    return awaitResult{
        this.strlen(key, it)
    }
}

suspend fun RedisClient.subscribeAwait(channel : String) : JsonArray {
    return awaitResult{
        this.subscribe(channel, it)
    }
}

suspend fun RedisClient.subscribeManyAwait(channels : List<String>) : JsonArray {
    return awaitResult{
        this.subscribeMany(channels, it)
    }
}

suspend fun RedisClient.sunionAwait(keys : List<String>) : JsonArray {
    return awaitResult{
        this.sunion(keys, it)
    }
}

suspend fun RedisClient.sunionstoreAwait(destkey : String, keys : List<String>) : Long {
    return awaitResult{
        this.sunionstore(destkey, keys, it)
    }
}

suspend fun RedisClient.syncAwait() : Unit {
    return awaitResult{
        this.sync({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.timeAwait() : JsonArray {
    return awaitResult{
        this.time(it)
    }
}

suspend fun RedisClient.ttlAwait(key : String) : Long {
    return awaitResult{
        this.ttl(key, it)
    }
}

suspend fun RedisClient.typeAwait(key : String) : String {
    return awaitResult{
        this.type(key, it)
    }
}

suspend fun RedisClient.unsubscribeAwait(channels : List<String>) : Unit {
    return awaitResult{
        this.unsubscribe(channels, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisClient.waitAwait(numSlaves : Long, timeout : Long) : String {
    return awaitResult{
        this.wait(numSlaves, timeout, it)
    }
}

suspend fun RedisClient.zaddAwait(key : String, score : Double, member : String) : Long {
    return awaitResult{
        this.zadd(key, score, member, it)
    }
}

suspend fun RedisClient.zaddManyAwait(key : String, members : Map<String,Double>) : Long {
    return awaitResult{
        this.zaddMany(key, members, it)
    }
}

suspend fun RedisClient.zcardAwait(key : String) : Long {
    return awaitResult{
        this.zcard(key, it)
    }
}

suspend fun RedisClient.zcountAwait(key : String, min : Double, max : Double) : Long {
    return awaitResult{
        this.zcount(key, min, max, it)
    }
}

suspend fun RedisClient.zincrbyAwait(key : String, increment : Double, member : String) : String {
    return awaitResult{
        this.zincrby(key, increment, member, it)
    }
}

suspend fun RedisClient.zinterstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : Long {
    return awaitResult{
        this.zinterstore(destkey, sets, options, it)
    }
}

suspend fun RedisClient.zinterstoreWeighedAwait(destkey : String, sets : Map<String,Double>, options : AggregateOptions) : Long {
    return awaitResult{
        this.zinterstoreWeighed(destkey, sets, options, it)
    }
}

suspend fun RedisClient.zlexcountAwait(key : String, min : String, max : String) : Long {
    return awaitResult{
        this.zlexcount(key, min, max, it)
    }
}

suspend fun RedisClient.zrangeAwait(key : String, start : Long, stop : Long) : JsonArray {
    return awaitResult{
        this.zrange(key, start, stop, it)
    }
}

suspend fun RedisClient.zrangeWithOptionsAwait(key : String, start : Long, stop : Long, options : RangeOptions) : JsonArray {
    return awaitResult{
        this.zrangeWithOptions(key, start, stop, options, it)
    }
}

suspend fun RedisClient.zrangebylexAwait(key : String, min : String, max : String, options : LimitOptions) : JsonArray {
    return awaitResult{
        this.zrangebylex(key, min, max, options, it)
    }
}

suspend fun RedisClient.zrangebyscoreAwait(key : String, min : String, max : String, options : RangeLimitOptions) : JsonArray {
    return awaitResult{
        this.zrangebyscore(key, min, max, options, it)
    }
}

suspend fun RedisClient.zrankAwait(key : String, member : String) : Long {
    return awaitResult{
        this.zrank(key, member, it)
    }
}

suspend fun RedisClient.zremAwait(key : String, member : String) : Long {
    return awaitResult{
        this.zrem(key, member, it)
    }
}

suspend fun RedisClient.zremManyAwait(key : String, members : List<String>) : Long {
    return awaitResult{
        this.zremMany(key, members, it)
    }
}

suspend fun RedisClient.zremrangebylexAwait(key : String, min : String, max : String) : Long {
    return awaitResult{
        this.zremrangebylex(key, min, max, it)
    }
}

suspend fun RedisClient.zremrangebyrankAwait(key : String, start : Long, stop : Long) : Long {
    return awaitResult{
        this.zremrangebyrank(key, start, stop, it)
    }
}

suspend fun RedisClient.zremrangebyscoreAwait(key : String, min : String, max : String) : Long {
    return awaitResult{
        this.zremrangebyscore(key, min, max, it)
    }
}

suspend fun RedisClient.zrevrangeAwait(key : String, start : Long, stop : Long, options : RangeOptions) : JsonArray {
    return awaitResult{
        this.zrevrange(key, start, stop, options, it)
    }
}

suspend fun RedisClient.zrevrangebylexAwait(key : String, max : String, min : String, options : LimitOptions) : JsonArray {
    return awaitResult{
        this.zrevrangebylex(key, max, min, options, it)
    }
}

suspend fun RedisClient.zrevrangebyscoreAwait(key : String, max : String, min : String, options : RangeLimitOptions) : JsonArray {
    return awaitResult{
        this.zrevrangebyscore(key, max, min, options, it)
    }
}

suspend fun RedisClient.zrevrankAwait(key : String, member : String) : Long {
    return awaitResult{
        this.zrevrank(key, member, it)
    }
}

suspend fun RedisClient.zscoreAwait(key : String, member : String) : String {
    return awaitResult{
        this.zscore(key, member, it)
    }
}

suspend fun RedisClient.zunionstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : Long {
    return awaitResult{
        this.zunionstore(destkey, sets, options, it)
    }
}

suspend fun RedisClient.zunionstoreWeighedAwait(key : String, sets : Map<String,Double>, options : AggregateOptions) : Long {
    return awaitResult{
        this.zunionstoreWeighed(key, sets, options, it)
    }
}

suspend fun RedisClient.scanAwait(cursor : String, options : ScanOptions) : JsonArray {
    return awaitResult{
        this.scan(cursor, options, it)
    }
}

suspend fun RedisClient.sscanAwait(key : String, cursor : String, options : ScanOptions) : JsonArray {
    return awaitResult{
        this.sscan(key, cursor, options, it)
    }
}

suspend fun RedisClient.hscanAwait(key : String, cursor : String, options : ScanOptions) : JsonArray {
    return awaitResult{
        this.hscan(key, cursor, options, it)
    }
}

suspend fun RedisClient.zscanAwait(key : String, cursor : String, options : ScanOptions) : JsonArray {
    return awaitResult{
        this.zscan(key, cursor, options, it)
    }
}

suspend fun RedisClient.geoaddAwait(key : String, longitude : Double, latitude : Double, member : String) : Long {
    return awaitResult{
        this.geoadd(key, longitude, latitude, member, it)
    }
}

suspend fun RedisClient.geoaddManyAwait(key : String, members : List<GeoMember>) : Long {
    return awaitResult{
        this.geoaddMany(key, members, it)
    }
}

suspend fun RedisClient.geohashAwait(key : String, member : String) : JsonArray {
    return awaitResult{
        this.geohash(key, member, it)
    }
}

suspend fun RedisClient.geohashManyAwait(key : String, members : List<String>) : JsonArray {
    return awaitResult{
        this.geohashMany(key, members, it)
    }
}

suspend fun RedisClient.geoposAwait(key : String, member : String) : JsonArray {
    return awaitResult{
        this.geopos(key, member, it)
    }
}

suspend fun RedisClient.geoposManyAwait(key : String, members : List<String>) : JsonArray {
    return awaitResult{
        this.geoposMany(key, members, it)
    }
}

suspend fun RedisClient.geodistAwait(key : String, member1 : String, member2 : String) : String {
    return awaitResult{
        this.geodist(key, member1, member2, it)
    }
}

suspend fun RedisClient.geodistWithUnitAwait(key : String, member1 : String, member2 : String, unit : GeoUnit) : String {
    return awaitResult{
        this.geodistWithUnit(key, member1, member2, unit, it)
    }
}

suspend fun RedisClient.georadiusAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit) : JsonArray {
    return awaitResult{
        this.georadius(key, longitude, latitude, radius, unit, it)
    }
}

suspend fun RedisClient.georadiusWithOptionsAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : JsonArray {
    return awaitResult{
        this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it)
    }
}

suspend fun RedisClient.georadiusbymemberAwait(key : String, member : String, radius : Double, unit : GeoUnit) : JsonArray {
    return awaitResult{
        this.georadiusbymember(key, member, radius, unit, it)
    }
}

suspend fun RedisClient.georadiusbymemberWithOptionsAwait(key : String, member : String, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : JsonArray {
    return awaitResult{
        this.georadiusbymemberWithOptions(key, member, radius, unit, options, it)
    }
}

suspend fun RedisClient.clientReplyAwait(options : ClientReplyOptions) : String {
    return awaitResult{
        this.clientReply(options, it)
    }
}

suspend fun RedisClient.hstrlenAwait(key : String, field : String) : Long {
    return awaitResult{
        this.hstrlen(key, field, it)
    }
}

suspend fun RedisClient.touchAwait(key : String) : Long {
    return awaitResult{
        this.touch(key, it)
    }
}

suspend fun RedisClient.touchManyAwait(keys : List<String>) : Long {
    return awaitResult{
        this.touchMany(keys, it)
    }
}

suspend fun RedisClient.scriptDebugAwait(scriptDebugOptions : ScriptDebugOptions) : String {
    return awaitResult{
        this.scriptDebug(scriptDebugOptions, it)
    }
}

suspend fun RedisClient.bitfieldAwait(key : String, bitFieldOptions : BitFieldOptions) : JsonArray {
    return awaitResult{
        this.bitfield(key, bitFieldOptions, it)
    }
}

suspend fun RedisClient.bitfieldWithOverflowAwait(key : String, commands : BitFieldOptions, overflow : BitFieldOverflowOptions) : JsonArray {
    return awaitResult{
        this.bitfieldWithOverflow(key, commands, overflow, it)
    }
}

suspend fun RedisClient.unlinkAwait(key : String) : Long {
    return awaitResult{
        this.unlink(key, it)
    }
}

suspend fun RedisClient.unlinkManyAwait(keys : List<String>) : Long {
    return awaitResult{
        this.unlinkMany(keys, it)
    }
}

suspend fun RedisClient.swapdbAwait(index1 : Int, index2 : Int) : String {
    return awaitResult{
        this.swapdb(index1, index2, it)
    }
}

