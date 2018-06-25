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

suspend fun RedisTransaction.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisTransaction.appendAwait(key : String, value : String) : String {
    return awaitResult{
        this.append(key, value, it)
    }
}

suspend fun RedisTransaction.authAwait(password : String) : String {
    return awaitResult{
        this.auth(password, it)
    }
}

suspend fun RedisTransaction.bgrewriteaofAwait() : String {
    return awaitResult{
        this.bgrewriteaof(it)
    }
}

suspend fun RedisTransaction.bgsaveAwait() : String {
    return awaitResult{
        this.bgsave(it)
    }
}

suspend fun RedisTransaction.bitcountAwait(key : String) : String {
    return awaitResult{
        this.bitcount(key, it)
    }
}

suspend fun RedisTransaction.bitcountRangeAwait(key : String, start : Long, end : Long) : String {
    return awaitResult{
        this.bitcountRange(key, start, end, it)
    }
}

suspend fun RedisTransaction.bitopAwait(operation : BitOperation, destkey : String, keys : List<String>) : String {
    return awaitResult{
        this.bitop(operation, destkey, keys, it)
    }
}

suspend fun RedisTransaction.bitposAwait(key : String, bit : Int) : String {
    return awaitResult{
        this.bitpos(key, bit, it)
    }
}

suspend fun RedisTransaction.bitposFromAwait(key : String, bit : Int, start : Int) : String {
    return awaitResult{
        this.bitposFrom(key, bit, start, it)
    }
}

suspend fun RedisTransaction.bitposRangeAwait(key : String, bit : Int, start : Int, stop : Int) : String {
    return awaitResult{
        this.bitposRange(key, bit, start, stop, it)
    }
}

suspend fun RedisTransaction.blpopAwait(key : String, seconds : Int) : String {
    return awaitResult{
        this.blpop(key, seconds, it)
    }
}

suspend fun RedisTransaction.blpopManyAwait(keys : List<String>, seconds : Int) : String {
    return awaitResult{
        this.blpopMany(keys, seconds, it)
    }
}

suspend fun RedisTransaction.brpopAwait(key : String, seconds : Int) : String {
    return awaitResult{
        this.brpop(key, seconds, it)
    }
}

suspend fun RedisTransaction.brpopManyAwait(keys : List<String>, seconds : Int) : String {
    return awaitResult{
        this.brpopMany(keys, seconds, it)
    }
}

suspend fun RedisTransaction.brpoplpushAwait(key : String, destkey : String, seconds : Int) : String {
    return awaitResult{
        this.brpoplpush(key, destkey, seconds, it)
    }
}

suspend fun RedisTransaction.clientKillAwait(filter : KillFilter) : String {
    return awaitResult{
        this.clientKill(filter, it)
    }
}

suspend fun RedisTransaction.clientListAwait() : String {
    return awaitResult{
        this.clientList(it)
    }
}

suspend fun RedisTransaction.clientGetnameAwait() : String {
    return awaitResult{
        this.clientGetname(it)
    }
}

suspend fun RedisTransaction.clientPauseAwait(millis : Long) : String {
    return awaitResult{
        this.clientPause(millis, it)
    }
}

suspend fun RedisTransaction.clientSetnameAwait(name : String) : String {
    return awaitResult{
        this.clientSetname(name, it)
    }
}

suspend fun RedisTransaction.clusterAddslotsAwait(slots : List<String>) : String {
    return awaitResult{
        this.clusterAddslots(slots, it)
    }
}

suspend fun RedisTransaction.clusterCountFailureReportsAwait(nodeId : String) : String {
    return awaitResult{
        this.clusterCountFailureReports(nodeId, it)
    }
}

suspend fun RedisTransaction.clusterCountkeysinslotAwait(slot : Long) : String {
    return awaitResult{
        this.clusterCountkeysinslot(slot, it)
    }
}

suspend fun RedisTransaction.clusterDelslotsAwait(slot : Long) : String {
    return awaitResult{
        this.clusterDelslots(slot, it)
    }
}

suspend fun RedisTransaction.clusterDelslotsManyAwait(slots : List<String>) : String {
    return awaitResult{
        this.clusterDelslotsMany(slots, it)
    }
}

suspend fun RedisTransaction.clusterFailoverAwait() : String {
    return awaitResult{
        this.clusterFailover(it)
    }
}

suspend fun RedisTransaction.clusterFailOverWithOptionsAwait(options : FailoverOptions) : String {
    return awaitResult{
        this.clusterFailOverWithOptions(options, it)
    }
}

suspend fun RedisTransaction.clusterForgetAwait(nodeId : String) : String {
    return awaitResult{
        this.clusterForget(nodeId, it)
    }
}

suspend fun RedisTransaction.clusterGetkeysinslotAwait(slot : Long, count : Long) : String {
    return awaitResult{
        this.clusterGetkeysinslot(slot, count, it)
    }
}

suspend fun RedisTransaction.clusterInfoAwait() : String {
    return awaitResult{
        this.clusterInfo(it)
    }
}

suspend fun RedisTransaction.clusterKeyslotAwait(key : String) : String {
    return awaitResult{
        this.clusterKeyslot(key, it)
    }
}

suspend fun RedisTransaction.clusterMeetAwait(ip : String, port : Long) : String {
    return awaitResult{
        this.clusterMeet(ip, port, it)
    }
}

suspend fun RedisTransaction.clusterNodesAwait() : String {
    return awaitResult{
        this.clusterNodes(it)
    }
}

suspend fun RedisTransaction.clusterReplicateAwait(nodeId : String) : String {
    return awaitResult{
        this.clusterReplicate(nodeId, it)
    }
}

suspend fun RedisTransaction.clusterResetAwait() : String {
    return awaitResult{
        this.clusterReset(it)
    }
}

suspend fun RedisTransaction.clusterResetWithOptionsAwait(options : ResetOptions) : String {
    return awaitResult{
        this.clusterResetWithOptions(options, it)
    }
}

suspend fun RedisTransaction.clusterSaveconfigAwait() : String {
    return awaitResult{
        this.clusterSaveconfig(it)
    }
}

suspend fun RedisTransaction.clusterSetConfigEpochAwait(epoch : Long) : String {
    return awaitResult{
        this.clusterSetConfigEpoch(epoch, it)
    }
}

suspend fun RedisTransaction.clusterSetslotAwait(slot : Long, subcommand : SlotCmd) : String {
    return awaitResult{
        this.clusterSetslot(slot, subcommand, it)
    }
}

suspend fun RedisTransaction.clusterSetslotWithNodeAwait(slot : Long, subcommand : SlotCmd, nodeId : String) : String {
    return awaitResult{
        this.clusterSetslotWithNode(slot, subcommand, nodeId, it)
    }
}

suspend fun RedisTransaction.clusterSlavesAwait(nodeId : String) : String {
    return awaitResult{
        this.clusterSlaves(nodeId, it)
    }
}

suspend fun RedisTransaction.clusterSlotsAwait() : String {
    return awaitResult{
        this.clusterSlots(it)
    }
}

suspend fun RedisTransaction.commandAwait() : String {
    return awaitResult{
        this.command(it)
    }
}

suspend fun RedisTransaction.commandCountAwait() : String {
    return awaitResult{
        this.commandCount(it)
    }
}

suspend fun RedisTransaction.commandGetkeysAwait() : String {
    return awaitResult{
        this.commandGetkeys(it)
    }
}

suspend fun RedisTransaction.commandInfoAwait(commands : List<String>) : String {
    return awaitResult{
        this.commandInfo(commands, it)
    }
}

suspend fun RedisTransaction.configGetAwait(parameter : String) : String {
    return awaitResult{
        this.configGet(parameter, it)
    }
}

suspend fun RedisTransaction.configRewriteAwait() : String {
    return awaitResult{
        this.configRewrite(it)
    }
}

suspend fun RedisTransaction.configSetAwait(parameter : String, value : String) : String {
    return awaitResult{
        this.configSet(parameter, value, it)
    }
}

suspend fun RedisTransaction.configResetstatAwait() : String {
    return awaitResult{
        this.configResetstat(it)
    }
}

suspend fun RedisTransaction.dbsizeAwait() : String {
    return awaitResult{
        this.dbsize(it)
    }
}

suspend fun RedisTransaction.debugObjectAwait(key : String) : String {
    return awaitResult{
        this.debugObject(key, it)
    }
}

suspend fun RedisTransaction.debugSegfaultAwait() : String {
    return awaitResult{
        this.debugSegfault(it)
    }
}

suspend fun RedisTransaction.decrAwait(key : String) : String {
    return awaitResult{
        this.decr(key, it)
    }
}

suspend fun RedisTransaction.decrbyAwait(key : String, decrement : Long) : String {
    return awaitResult{
        this.decrby(key, decrement, it)
    }
}

suspend fun RedisTransaction.delAwait(key : String) : String {
    return awaitResult{
        this.del(key, it)
    }
}

suspend fun RedisTransaction.delManyAwait(keys : List<String>) : String {
    return awaitResult{
        this.delMany(keys, it)
    }
}

suspend fun RedisTransaction.discardAwait() : String {
    return awaitResult{
        this.discard(it)
    }
}

suspend fun RedisTransaction.dumpAwait(key : String) : String {
    return awaitResult{
        this.dump(key, it)
    }
}

suspend fun RedisTransaction.echoAwait(message : String) : String {
    return awaitResult{
        this.echo(message, it)
    }
}

suspend fun RedisTransaction.evalAwait(script : String, keys : List<String>, args : List<String>) : String {
    return awaitResult{
        this.eval(script, keys, args, it)
    }
}

suspend fun RedisTransaction.evalshaAwait(sha1 : String, keys : List<String>, values : List<String>) : String {
    return awaitResult{
        this.evalsha(sha1, keys, values, it)
    }
}

suspend fun RedisTransaction.execAwait() : JsonArray {
    return awaitResult{
        this.exec(it)
    }
}

suspend fun RedisTransaction.existsAwait(key : String) : String {
    return awaitResult{
        this.exists(key, it)
    }
}

suspend fun RedisTransaction.existsManyAwait(keys : List<String>) : String {
    return awaitResult{
        this.existsMany(keys, it)
    }
}

suspend fun RedisTransaction.expireAwait(key : String, seconds : Int) : String {
    return awaitResult{
        this.expire(key, seconds, it)
    }
}

suspend fun RedisTransaction.expireatAwait(key : String, seconds : Long) : String {
    return awaitResult{
        this.expireat(key, seconds, it)
    }
}

suspend fun RedisTransaction.flushallAwait() : String {
    return awaitResult{
        this.flushall(it)
    }
}

suspend fun RedisTransaction.flushdbAwait() : String {
    return awaitResult{
        this.flushdb(it)
    }
}

suspend fun RedisTransaction.getAwait(key : String) : String {
    return awaitResult{
        this.get(key, it)
    }
}

suspend fun RedisTransaction.getBinaryAwait(key : String) : Buffer {
    return awaitResult{
        this.getBinary(key, it)
    }
}

suspend fun RedisTransaction.getbitAwait(key : String, offset : Long) : String {
    return awaitResult{
        this.getbit(key, offset, it)
    }
}

suspend fun RedisTransaction.getrangeAwait(key : String, start : Long, end : Long) : String {
    return awaitResult{
        this.getrange(key, start, end, it)
    }
}

suspend fun RedisTransaction.getsetAwait(key : String, value : String) : String {
    return awaitResult{
        this.getset(key, value, it)
    }
}

suspend fun RedisTransaction.hdelAwait(key : String, field : String) : String {
    return awaitResult{
        this.hdel(key, field, it)
    }
}

suspend fun RedisTransaction.hdelManyAwait(key : String, fields : List<String>) : String {
    return awaitResult{
        this.hdelMany(key, fields, it)
    }
}

suspend fun RedisTransaction.hexistsAwait(key : String, field : String) : String {
    return awaitResult{
        this.hexists(key, field, it)
    }
}

suspend fun RedisTransaction.hgetAwait(key : String, field : String) : String {
    return awaitResult{
        this.hget(key, field, it)
    }
}

suspend fun RedisTransaction.hgetallAwait(key : String) : String {
    return awaitResult{
        this.hgetall(key, it)
    }
}

suspend fun RedisTransaction.hincrbyAwait(key : String, field : String, increment : Long) : String {
    return awaitResult{
        this.hincrby(key, field, increment, it)
    }
}

suspend fun RedisTransaction.hincrbyfloatAwait(key : String, field : String, increment : Double) : String {
    return awaitResult{
        this.hincrbyfloat(key, field, increment, it)
    }
}

suspend fun RedisTransaction.hkeysAwait(key : String) : String {
    return awaitResult{
        this.hkeys(key, it)
    }
}

suspend fun RedisTransaction.hlenAwait(key : String) : String {
    return awaitResult{
        this.hlen(key, it)
    }
}

suspend fun RedisTransaction.hmgetAwait(key : String, fields : List<String>) : String {
    return awaitResult{
        this.hmget(key, fields, it)
    }
}

suspend fun RedisTransaction.hmsetAwait(key : String, values : JsonObject) : String {
    return awaitResult{
        this.hmset(key, values, it)
    }
}

suspend fun RedisTransaction.hsetAwait(key : String, field : String, value : String) : String {
    return awaitResult{
        this.hset(key, field, value, it)
    }
}

suspend fun RedisTransaction.hsetnxAwait(key : String, field : String, value : String) : String {
    return awaitResult{
        this.hsetnx(key, field, value, it)
    }
}

suspend fun RedisTransaction.hvalsAwait(key : String) : String {
    return awaitResult{
        this.hvals(key, it)
    }
}

suspend fun RedisTransaction.incrAwait(key : String) : String {
    return awaitResult{
        this.incr(key, it)
    }
}

suspend fun RedisTransaction.incrbyAwait(key : String, increment : Long) : String {
    return awaitResult{
        this.incrby(key, increment, it)
    }
}

suspend fun RedisTransaction.incrbyfloatAwait(key : String, increment : Double) : String {
    return awaitResult{
        this.incrbyfloat(key, increment, it)
    }
}

suspend fun RedisTransaction.infoAwait() : String {
    return awaitResult{
        this.info(it)
    }
}

suspend fun RedisTransaction.infoSectionAwait(section : String) : String {
    return awaitResult{
        this.infoSection(section, it)
    }
}

suspend fun RedisTransaction.keysAwait(pattern : String) : String {
    return awaitResult{
        this.keys(pattern, it)
    }
}

suspend fun RedisTransaction.lastsaveAwait() : String {
    return awaitResult{
        this.lastsave(it)
    }
}

suspend fun RedisTransaction.lindexAwait(key : String, index : Int) : String {
    return awaitResult{
        this.lindex(key, index, it)
    }
}

suspend fun RedisTransaction.linsertAwait(key : String, option : InsertOptions, pivot : String, value : String) : String {
    return awaitResult{
        this.linsert(key, option, pivot, value, it)
    }
}

suspend fun RedisTransaction.llenAwait(key : String) : String {
    return awaitResult{
        this.llen(key, it)
    }
}

suspend fun RedisTransaction.lpopAwait(key : String) : String {
    return awaitResult{
        this.lpop(key, it)
    }
}

suspend fun RedisTransaction.lpushManyAwait(key : String, values : List<String>) : String {
    return awaitResult{
        this.lpushMany(key, values, it)
    }
}

suspend fun RedisTransaction.lpushAwait(key : String, value : String) : String {
    return awaitResult{
        this.lpush(key, value, it)
    }
}

suspend fun RedisTransaction.lpushxAwait(key : String, value : String) : String {
    return awaitResult{
        this.lpushx(key, value, it)
    }
}

suspend fun RedisTransaction.lrangeAwait(key : String, from : Long, to : Long) : String {
    return awaitResult{
        this.lrange(key, from, to, it)
    }
}

suspend fun RedisTransaction.lremAwait(key : String, count : Long, value : String) : String {
    return awaitResult{
        this.lrem(key, count, value, it)
    }
}

suspend fun RedisTransaction.lsetAwait(key : String, index : Long, value : String) : String {
    return awaitResult{
        this.lset(key, index, value, it)
    }
}

suspend fun RedisTransaction.ltrimAwait(key : String, from : Long, to : Long) : String {
    return awaitResult{
        this.ltrim(key, from, to, it)
    }
}

suspend fun RedisTransaction.mgetAwait(key : String) : String {
    return awaitResult{
        this.mget(key, it)
    }
}

suspend fun RedisTransaction.mgetManyAwait(keys : List<String>) : String {
    return awaitResult{
        this.mgetMany(keys, it)
    }
}

suspend fun RedisTransaction.migrateAwait(host : String, port : Int, key : String, destdb : Int, timeout : Long, options : MigrateOptions) : String {
    return awaitResult{
        this.migrate(host, port, key, destdb, timeout, options, it)
    }
}

suspend fun RedisTransaction.monitorAwait() : String {
    return awaitResult{
        this.monitor(it)
    }
}

suspend fun RedisTransaction.moveAwait(key : String, destdb : Int) : String {
    return awaitResult{
        this.move(key, destdb, it)
    }
}

suspend fun RedisTransaction.msetAwait(keyvals : JsonObject) : String {
    return awaitResult{
        this.mset(keyvals, it)
    }
}

suspend fun RedisTransaction.msetnxAwait(keyvals : JsonObject) : String {
    return awaitResult{
        this.msetnx(keyvals, it)
    }
}

suspend fun RedisTransaction.multiAwait() : String {
    return awaitResult{
        this.multi(it)
    }
}

suspend fun RedisTransaction.objectAwait(key : String, cmd : ObjectCmd) : String {
    return awaitResult{
        this.`object`(key, cmd, it)
    }
}

suspend fun RedisTransaction.persistAwait(key : String) : String {
    return awaitResult{
        this.persist(key, it)
    }
}

suspend fun RedisTransaction.pexpireAwait(key : String, millis : Long) : String {
    return awaitResult{
        this.pexpire(key, millis, it)
    }
}

suspend fun RedisTransaction.pexpireatAwait(key : String, millis : Long) : String {
    return awaitResult{
        this.pexpireat(key, millis, it)
    }
}

suspend fun RedisTransaction.pfaddAwait(key : String, element : String) : String {
    return awaitResult{
        this.pfadd(key, element, it)
    }
}

suspend fun RedisTransaction.pfaddManyAwait(key : String, elements : List<String>) : String {
    return awaitResult{
        this.pfaddMany(key, elements, it)
    }
}

suspend fun RedisTransaction.pfcountAwait(key : String) : String {
    return awaitResult{
        this.pfcount(key, it)
    }
}

suspend fun RedisTransaction.pfcountManyAwait(keys : List<String>) : String {
    return awaitResult{
        this.pfcountMany(keys, it)
    }
}

suspend fun RedisTransaction.pfmergeAwait(destkey : String, keys : List<String>) : String {
    return awaitResult{
        this.pfmerge(destkey, keys, it)
    }
}

suspend fun RedisTransaction.pingAwait() : String {
    return awaitResult{
        this.ping(it)
    }
}

suspend fun RedisTransaction.psetexAwait(key : String, millis : Long, value : String) : String {
    return awaitResult{
        this.psetex(key, millis, value, it)
    }
}

suspend fun RedisTransaction.psubscribeAwait(pattern : String) : String {
    return awaitResult{
        this.psubscribe(pattern, it)
    }
}

suspend fun RedisTransaction.psubscribeManyAwait(patterns : List<String>) : String {
    return awaitResult{
        this.psubscribeMany(patterns, it)
    }
}

suspend fun RedisTransaction.pubsubChannelsAwait(pattern : String) : String {
    return awaitResult{
        this.pubsubChannels(pattern, it)
    }
}

suspend fun RedisTransaction.pubsubNumsubAwait(channels : List<String>) : String {
    return awaitResult{
        this.pubsubNumsub(channels, it)
    }
}

suspend fun RedisTransaction.pubsubNumpatAwait() : String {
    return awaitResult{
        this.pubsubNumpat(it)
    }
}

suspend fun RedisTransaction.pttlAwait(key : String) : String {
    return awaitResult{
        this.pttl(key, it)
    }
}

suspend fun RedisTransaction.publishAwait(channel : String, message : String) : String {
    return awaitResult{
        this.publish(channel, message, it)
    }
}

suspend fun RedisTransaction.punsubscribeAwait(patterns : List<String>) : String {
    return awaitResult{
        this.punsubscribe(patterns, it)
    }
}

suspend fun RedisTransaction.randomkeyAwait() : String {
    return awaitResult{
        this.randomkey(it)
    }
}

suspend fun RedisTransaction.renameAwait(key : String, newkey : String) : String {
    return awaitResult{
        this.rename(key, newkey, it)
    }
}

suspend fun RedisTransaction.renamenxAwait(key : String, newkey : String) : String {
    return awaitResult{
        this.renamenx(key, newkey, it)
    }
}

suspend fun RedisTransaction.restoreAwait(key : String, millis : Long, serialized : String) : String {
    return awaitResult{
        this.restore(key, millis, serialized, it)
    }
}

suspend fun RedisTransaction.roleAwait() : String {
    return awaitResult{
        this.role(it)
    }
}

suspend fun RedisTransaction.rpopAwait(key : String) : String {
    return awaitResult{
        this.rpop(key, it)
    }
}

suspend fun RedisTransaction.rpoplpushAwait(key : String, destkey : String) : String {
    return awaitResult{
        this.rpoplpush(key, destkey, it)
    }
}

suspend fun RedisTransaction.rpushManyAwait(key : String, values : List<String>) : String {
    return awaitResult{
        this.rpushMany(key, values, it)
    }
}

suspend fun RedisTransaction.rpushAwait(key : String, value : String) : String {
    return awaitResult{
        this.rpush(key, value, it)
    }
}

suspend fun RedisTransaction.rpushxAwait(key : String, value : String) : String {
    return awaitResult{
        this.rpushx(key, value, it)
    }
}

suspend fun RedisTransaction.saddAwait(key : String, member : String) : String {
    return awaitResult{
        this.sadd(key, member, it)
    }
}

suspend fun RedisTransaction.saddManyAwait(key : String, members : List<String>) : String {
    return awaitResult{
        this.saddMany(key, members, it)
    }
}

suspend fun RedisTransaction.saveAwait() : String {
    return awaitResult{
        this.save(it)
    }
}

suspend fun RedisTransaction.scardAwait(key : String) : String {
    return awaitResult{
        this.scard(key, it)
    }
}

suspend fun RedisTransaction.scriptExistsAwait(script : String) : String {
    return awaitResult{
        this.scriptExists(script, it)
    }
}

suspend fun RedisTransaction.scriptExistsManyAwait(scripts : List<String>) : String {
    return awaitResult{
        this.scriptExistsMany(scripts, it)
    }
}

suspend fun RedisTransaction.scriptFlushAwait() : String {
    return awaitResult{
        this.scriptFlush(it)
    }
}

suspend fun RedisTransaction.scriptKillAwait() : String {
    return awaitResult{
        this.scriptKill(it)
    }
}

suspend fun RedisTransaction.scriptLoadAwait(script : String) : String {
    return awaitResult{
        this.scriptLoad(script, it)
    }
}

suspend fun RedisTransaction.sdiffAwait(key : String, cmpkeys : List<String>) : String {
    return awaitResult{
        this.sdiff(key, cmpkeys, it)
    }
}

suspend fun RedisTransaction.sdiffstoreAwait(destkey : String, key : String, cmpkeys : List<String>) : String {
    return awaitResult{
        this.sdiffstore(destkey, key, cmpkeys, it)
    }
}

suspend fun RedisTransaction.selectAwait(dbindex : Int) : String {
    return awaitResult{
        this.select(dbindex, it)
    }
}

suspend fun RedisTransaction.setAwait(key : String, value : String) : String {
    return awaitResult{
        this.set(key, value, it)
    }
}

suspend fun RedisTransaction.setWithOptionsAwait(key : String, value : String, options : SetOptions) : String {
    return awaitResult{
        this.setWithOptions(key, value, options, it)
    }
}

suspend fun RedisTransaction.setBinaryAwait(key : String, value : Buffer) : String {
    return awaitResult{
        this.setBinary(key, value, it)
    }
}

suspend fun RedisTransaction.setBinaryWithOptionsAwait(key : String, value : Buffer, options : SetOptions) : String {
    return awaitResult{
        this.setBinaryWithOptions(key, value, options, it)
    }
}

suspend fun RedisTransaction.setbitAwait(key : String, offset : Long, bit : Int) : String {
    return awaitResult{
        this.setbit(key, offset, bit, it)
    }
}

suspend fun RedisTransaction.setexAwait(key : String, seconds : Long, value : String) : String {
    return awaitResult{
        this.setex(key, seconds, value, it)
    }
}

suspend fun RedisTransaction.setnxAwait(key : String, value : String) : String {
    return awaitResult{
        this.setnx(key, value, it)
    }
}

suspend fun RedisTransaction.setrangeAwait(key : String, offset : Int, value : String) : String {
    return awaitResult{
        this.setrange(key, offset, value, it)
    }
}

suspend fun RedisTransaction.sinterAwait(keys : List<String>) : String {
    return awaitResult{
        this.sinter(keys, it)
    }
}

suspend fun RedisTransaction.sinterstoreAwait(destkey : String, keys : List<String>) : String {
    return awaitResult{
        this.sinterstore(destkey, keys, it)
    }
}

suspend fun RedisTransaction.sismemberAwait(key : String, member : String) : String {
    return awaitResult{
        this.sismember(key, member, it)
    }
}

suspend fun RedisTransaction.slaveofAwait(host : String, port : Int) : String {
    return awaitResult{
        this.slaveof(host, port, it)
    }
}

suspend fun RedisTransaction.slaveofNooneAwait() : String {
    return awaitResult{
        this.slaveofNoone(it)
    }
}

suspend fun RedisTransaction.slowlogGetAwait(limit : Int) : String {
    return awaitResult{
        this.slowlogGet(limit, it)
    }
}

suspend fun RedisTransaction.slowlogLenAwait() : String {
    return awaitResult{
        this.slowlogLen(it)
    }
}

suspend fun RedisTransaction.slowlogResetAwait() : String {
    return awaitResult{
        this.slowlogReset(it)
    }
}

suspend fun RedisTransaction.smembersAwait(key : String) : JsonArray {
    return awaitResult{
        this.smembers(key, it)
    }
}

suspend fun RedisTransaction.smoveAwait(key : String, destkey : String, member : String) : String {
    return awaitResult{
        this.smove(key, destkey, member, it)
    }
}

suspend fun RedisTransaction.sortAwait(key : String, options : SortOptions) : String {
    return awaitResult{
        this.sort(key, options, it)
    }
}

suspend fun RedisTransaction.spopAwait(key : String) : String {
    return awaitResult{
        this.spop(key, it)
    }
}

suspend fun RedisTransaction.spopManyAwait(key : String, count : Int) : String {
    return awaitResult{
        this.spopMany(key, count, it)
    }
}

suspend fun RedisTransaction.srandmemberAwait(key : String) : String {
    return awaitResult{
        this.srandmember(key, it)
    }
}

suspend fun RedisTransaction.srandmemberCountAwait(key : String, count : Int) : String {
    return awaitResult{
        this.srandmemberCount(key, count, it)
    }
}

suspend fun RedisTransaction.sremAwait(key : String, member : String) : String {
    return awaitResult{
        this.srem(key, member, it)
    }
}

suspend fun RedisTransaction.sremManyAwait(key : String, members : List<String>) : String {
    return awaitResult{
        this.sremMany(key, members, it)
    }
}

suspend fun RedisTransaction.strlenAwait(key : String) : String {
    return awaitResult{
        this.strlen(key, it)
    }
}

suspend fun RedisTransaction.subscribeAwait(channel : String) : String {
    return awaitResult{
        this.subscribe(channel, it)
    }
}

suspend fun RedisTransaction.subscribeManyAwait(channels : List<String>) : String {
    return awaitResult{
        this.subscribeMany(channels, it)
    }
}

suspend fun RedisTransaction.sunionAwait(keys : List<String>) : String {
    return awaitResult{
        this.sunion(keys, it)
    }
}

suspend fun RedisTransaction.sunionstoreAwait(destkey : String, keys : List<String>) : String {
    return awaitResult{
        this.sunionstore(destkey, keys, it)
    }
}

suspend fun RedisTransaction.syncAwait() : String {
    return awaitResult{
        this.sync(it)
    }
}

suspend fun RedisTransaction.timeAwait() : String {
    return awaitResult{
        this.time(it)
    }
}

suspend fun RedisTransaction.ttlAwait(key : String) : String {
    return awaitResult{
        this.ttl(key, it)
    }
}

suspend fun RedisTransaction.typeAwait(key : String) : String {
    return awaitResult{
        this.type(key, it)
    }
}

suspend fun RedisTransaction.unsubscribeAwait(channels : List<String>) : String {
    return awaitResult{
        this.unsubscribe(channels, it)
    }
}

suspend fun RedisTransaction.unwatchAwait() : String {
    return awaitResult{
        this.unwatch(it)
    }
}

suspend fun RedisTransaction.waitAwait(numSlaves : Long, timeout : Long) : String {
    return awaitResult{
        this.wait(numSlaves, timeout, it)
    }
}

suspend fun RedisTransaction.watchAwait(key : String) : String {
    return awaitResult{
        this.watch(key, it)
    }
}

suspend fun RedisTransaction.watchManyAwait(keys : List<String>) : String {
    return awaitResult{
        this.watchMany(keys, it)
    }
}

suspend fun RedisTransaction.zaddAwait(key : String, score : Double, member : String) : String {
    return awaitResult{
        this.zadd(key, score, member, it)
    }
}

suspend fun RedisTransaction.zaddManyAwait(key : String, members : Map<String,Double>) : String {
    return awaitResult{
        this.zaddMany(key, members, it)
    }
}

suspend fun RedisTransaction.zcardAwait(key : String) : String {
    return awaitResult{
        this.zcard(key, it)
    }
}

suspend fun RedisTransaction.zcountAwait(key : String, min : Double, max : Double) : String {
    return awaitResult{
        this.zcount(key, min, max, it)
    }
}

suspend fun RedisTransaction.zincrbyAwait(key : String, increment : Double, member : String) : String {
    return awaitResult{
        this.zincrby(key, increment, member, it)
    }
}

suspend fun RedisTransaction.zinterstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : String {
    return awaitResult{
        this.zinterstore(destkey, sets, options, it)
    }
}

suspend fun RedisTransaction.zinterstoreWeighedAwait(destkey : String, sets : Map<String,Double>, options : AggregateOptions) : String {
    return awaitResult{
        this.zinterstoreWeighed(destkey, sets, options, it)
    }
}

suspend fun RedisTransaction.zlexcountAwait(key : String, min : String, max : String) : String {
    return awaitResult{
        this.zlexcount(key, min, max, it)
    }
}

suspend fun RedisTransaction.zrangeAwait(key : String, start : Long, stop : Long) : String {
    return awaitResult{
        this.zrange(key, start, stop, it)
    }
}

suspend fun RedisTransaction.zrangeWithOptionsAwait(key : String, start : Long, stop : Long, options : RangeOptions) : String {
    return awaitResult{
        this.zrangeWithOptions(key, start, stop, options, it)
    }
}

suspend fun RedisTransaction.zrangebylexAwait(key : String, min : String, max : String, options : LimitOptions) : String {
    return awaitResult{
        this.zrangebylex(key, min, max, options, it)
    }
}

suspend fun RedisTransaction.zrangebyscoreAwait(key : String, min : String, max : String, options : RangeLimitOptions) : String {
    return awaitResult{
        this.zrangebyscore(key, min, max, options, it)
    }
}

suspend fun RedisTransaction.zrankAwait(key : String, member : String) : String {
    return awaitResult{
        this.zrank(key, member, it)
    }
}

suspend fun RedisTransaction.zremAwait(key : String, member : String) : String {
    return awaitResult{
        this.zrem(key, member, it)
    }
}

suspend fun RedisTransaction.zremManyAwait(key : String, members : List<String>) : String {
    return awaitResult{
        this.zremMany(key, members, it)
    }
}

suspend fun RedisTransaction.zremrangebylexAwait(key : String, min : String, max : String) : String {
    return awaitResult{
        this.zremrangebylex(key, min, max, it)
    }
}

suspend fun RedisTransaction.zremrangebyrankAwait(key : String, start : Long, stop : Long) : String {
    return awaitResult{
        this.zremrangebyrank(key, start, stop, it)
    }
}

suspend fun RedisTransaction.zremrangebyscoreAwait(key : String, min : String, max : String) : String {
    return awaitResult{
        this.zremrangebyscore(key, min, max, it)
    }
}

suspend fun RedisTransaction.zrevrangeAwait(key : String, start : Long, stop : Long, options : RangeOptions) : String {
    return awaitResult{
        this.zrevrange(key, start, stop, options, it)
    }
}

suspend fun RedisTransaction.zrevrangebylexAwait(key : String, max : String, min : String, options : LimitOptions) : String {
    return awaitResult{
        this.zrevrangebylex(key, max, min, options, it)
    }
}

suspend fun RedisTransaction.zrevrangebyscoreAwait(key : String, max : String, min : String, options : RangeLimitOptions) : String {
    return awaitResult{
        this.zrevrangebyscore(key, max, min, options, it)
    }
}

suspend fun RedisTransaction.zrevrankAwait(key : String, member : String) : String {
    return awaitResult{
        this.zrevrank(key, member, it)
    }
}

suspend fun RedisTransaction.zscoreAwait(key : String, member : String) : String {
    return awaitResult{
        this.zscore(key, member, it)
    }
}

suspend fun RedisTransaction.zunionstoreAwait(destkey : String, sets : List<String>, options : AggregateOptions) : String {
    return awaitResult{
        this.zunionstore(destkey, sets, options, it)
    }
}

suspend fun RedisTransaction.zunionstoreWeighedAwait(key : String, sets : Map<String,Double>, options : AggregateOptions) : String {
    return awaitResult{
        this.zunionstoreWeighed(key, sets, options, it)
    }
}

suspend fun RedisTransaction.scanAwait(cursor : String, options : ScanOptions) : String {
    return awaitResult{
        this.scan(cursor, options, it)
    }
}

suspend fun RedisTransaction.sscanAwait(key : String, cursor : String, options : ScanOptions) : String {
    return awaitResult{
        this.sscan(key, cursor, options, it)
    }
}

suspend fun RedisTransaction.hscanAwait(key : String, cursor : String, options : ScanOptions) : String {
    return awaitResult{
        this.hscan(key, cursor, options, it)
    }
}

suspend fun RedisTransaction.zscanAwait(key : String, cursor : String, options : ScanOptions) : String {
    return awaitResult{
        this.zscan(key, cursor, options, it)
    }
}

suspend fun RedisTransaction.geoaddAwait(key : String, longitude : Double, latitude : Double, member : String) : String {
    return awaitResult{
        this.geoadd(key, longitude, latitude, member, it)
    }
}

suspend fun RedisTransaction.geoaddManyAwait(key : String, members : List<GeoMember>) : String {
    return awaitResult{
        this.geoaddMany(key, members, it)
    }
}

suspend fun RedisTransaction.geohashAwait(key : String, member : String) : String {
    return awaitResult{
        this.geohash(key, member, it)
    }
}

suspend fun RedisTransaction.geohashManyAwait(key : String, members : List<String>) : String {
    return awaitResult{
        this.geohashMany(key, members, it)
    }
}

suspend fun RedisTransaction.geoposAwait(key : String, member : String) : String {
    return awaitResult{
        this.geopos(key, member, it)
    }
}

suspend fun RedisTransaction.geoposManyAwait(key : String, members : List<String>) : String {
    return awaitResult{
        this.geoposMany(key, members, it)
    }
}

suspend fun RedisTransaction.geodistAwait(key : String, member1 : String, member2 : String) : String {
    return awaitResult{
        this.geodist(key, member1, member2, it)
    }
}

suspend fun RedisTransaction.geodistWithUnitAwait(key : String, member1 : String, member2 : String, unit : GeoUnit) : String {
    return awaitResult{
        this.geodistWithUnit(key, member1, member2, unit, it)
    }
}

suspend fun RedisTransaction.georadiusAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit) : String {
    return awaitResult{
        this.georadius(key, longitude, latitude, radius, unit, it)
    }
}

suspend fun RedisTransaction.georadiusWithOptionsAwait(key : String, longitude : Double, latitude : Double, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : String {
    return awaitResult{
        this.georadiusWithOptions(key, longitude, latitude, radius, unit, options, it)
    }
}

suspend fun RedisTransaction.georadiusbymemberAwait(key : String, member : String, radius : Double, unit : GeoUnit) : String {
    return awaitResult{
        this.georadiusbymember(key, member, radius, unit, it)
    }
}

suspend fun RedisTransaction.georadiusbymemberWithOptionsAwait(key : String, member : String, radius : Double, unit : GeoUnit, options : GeoRadiusOptions) : String {
    return awaitResult{
        this.georadiusbymemberWithOptions(key, member, radius, unit, options, it)
    }
}

suspend fun RedisTransaction.unlinkAwait(key : String) : String {
    return awaitResult{
        this.unlink(key, it)
    }
}

suspend fun RedisTransaction.unlinkManyAwait(keys : List<String>) : String {
    return awaitResult{
        this.unlinkMany(keys, it)
    }
}

suspend fun RedisTransaction.swapdbAwait(index1 : Int, index2 : Int) : String {
    return awaitResult{
        this.swapdb(index1, index2, it)
    }
}

