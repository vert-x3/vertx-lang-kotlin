/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.redis.client

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.client.RedisAPI
import io.vertx.redis.client.Response

suspend fun RedisAPI.appendAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.append(arg0, arg1, it)
  }
}

suspend fun RedisAPI.askingAwait() : Response {
  return awaitResult{
    this.asking(it)
  }
}

suspend fun RedisAPI.authAwait(arg0 : String) : Response {
  return awaitResult{
    this.auth(arg0, it)
  }
}

suspend fun RedisAPI.bgrewriteaofAwait() : Response {
  return awaitResult{
    this.bgrewriteaof(it)
  }
}

suspend fun RedisAPI.bgsaveAwait(args : List<String>) : Response {
  return awaitResult{
    this.bgsave(args, it)
  }
}

suspend fun RedisAPI.bitcountAwait(args : List<String>) : Response {
  return awaitResult{
    this.bitcount(args, it)
  }
}

suspend fun RedisAPI.bitfieldAwait(args : List<String>) : Response {
  return awaitResult{
    this.bitfield(args, it)
  }
}

suspend fun RedisAPI.bitopAwait(args : List<String>) : Response {
  return awaitResult{
    this.bitop(args, it)
  }
}

suspend fun RedisAPI.bitposAwait(args : List<String>) : Response {
  return awaitResult{
    this.bitpos(args, it)
  }
}

suspend fun RedisAPI.blpopAwait(args : List<String>) : Response {
  return awaitResult{
    this.blpop(args, it)
  }
}

suspend fun RedisAPI.brpopAwait(args : List<String>) : Response {
  return awaitResult{
    this.brpop(args, it)
  }
}

suspend fun RedisAPI.brpoplpushAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.brpoplpush(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.bzpopmaxAwait(args : List<String>) : Response {
  return awaitResult{
    this.bzpopmax(args, it)
  }
}

suspend fun RedisAPI.bzpopminAwait(args : List<String>) : Response {
  return awaitResult{
    this.bzpopmin(args, it)
  }
}

suspend fun RedisAPI.clientAwait(args : List<String>) : Response {
  return awaitResult{
    this.client(args, it)
  }
}

suspend fun RedisAPI.clusterAwait(args : List<String>) : Response {
  return awaitResult{
    this.cluster(args, it)
  }
}

suspend fun RedisAPI.commandAwait(args : List<String>) : Response {
  return awaitResult{
    this.command(args, it)
  }
}

suspend fun RedisAPI.configAwait(args : List<String>) : Response {
  return awaitResult{
    this.config(args, it)
  }
}

suspend fun RedisAPI.dbsizeAwait() : Response {
  return awaitResult{
    this.dbsize(it)
  }
}

suspend fun RedisAPI.debugAwait(args : List<String>) : Response {
  return awaitResult{
    this.debug(args, it)
  }
}

suspend fun RedisAPI.decrAwait(arg0 : String) : Response {
  return awaitResult{
    this.decr(arg0, it)
  }
}

suspend fun RedisAPI.decrbyAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.decrby(arg0, arg1, it)
  }
}

suspend fun RedisAPI.delAwait(args : List<String>) : Response {
  return awaitResult{
    this.del(args, it)
  }
}

suspend fun RedisAPI.discardAwait() : Response {
  return awaitResult{
    this.discard(it)
  }
}

suspend fun RedisAPI.dumpAwait(arg0 : String) : Response {
  return awaitResult{
    this.dump(arg0, it)
  }
}

suspend fun RedisAPI.echoAwait(arg0 : String) : Response {
  return awaitResult{
    this.echo(arg0, it)
  }
}

suspend fun RedisAPI.evalAwait(args : List<String>) : Response {
  return awaitResult{
    this.eval(args, it)
  }
}

suspend fun RedisAPI.evalshaAwait(args : List<String>) : Response {
  return awaitResult{
    this.evalsha(args, it)
  }
}

suspend fun RedisAPI.execAwait() : Response {
  return awaitResult{
    this.exec(it)
  }
}

suspend fun RedisAPI.existsAwait(args : List<String>) : Response {
  return awaitResult{
    this.exists(args, it)
  }
}

suspend fun RedisAPI.expireAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.expire(arg0, arg1, it)
  }
}

suspend fun RedisAPI.expireatAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.expireat(arg0, arg1, it)
  }
}

suspend fun RedisAPI.flushallAwait(args : List<String>) : Response {
  return awaitResult{
    this.flushall(args, it)
  }
}

suspend fun RedisAPI.flushdbAwait(args : List<String>) : Response {
  return awaitResult{
    this.flushdb(args, it)
  }
}

suspend fun RedisAPI.geoaddAwait(args : List<String>) : Response {
  return awaitResult{
    this.geoadd(args, it)
  }
}

suspend fun RedisAPI.geodistAwait(args : List<String>) : Response {
  return awaitResult{
    this.geodist(args, it)
  }
}

suspend fun RedisAPI.geohashAwait(args : List<String>) : Response {
  return awaitResult{
    this.geohash(args, it)
  }
}

suspend fun RedisAPI.geoposAwait(args : List<String>) : Response {
  return awaitResult{
    this.geopos(args, it)
  }
}

suspend fun RedisAPI.georadiusAwait(args : List<String>) : Response {
  return awaitResult{
    this.georadius(args, it)
  }
}

suspend fun RedisAPI.georadiusRoAwait(args : List<String>) : Response {
  return awaitResult{
    this.georadiusRo(args, it)
  }
}

suspend fun RedisAPI.georadiusbymemberAwait(args : List<String>) : Response {
  return awaitResult{
    this.georadiusbymember(args, it)
  }
}

suspend fun RedisAPI.georadiusbymemberRoAwait(args : List<String>) : Response {
  return awaitResult{
    this.georadiusbymemberRo(args, it)
  }
}

suspend fun RedisAPI.getAwait(arg0 : String) : Response {
  return awaitResult{
    this.get(arg0, it)
  }
}

suspend fun RedisAPI.getbitAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.getbit(arg0, arg1, it)
  }
}

suspend fun RedisAPI.getrangeAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.getrange(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.getsetAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.getset(arg0, arg1, it)
  }
}

suspend fun RedisAPI.hdelAwait(args : List<String>) : Response {
  return awaitResult{
    this.hdel(args, it)
  }
}

suspend fun RedisAPI.hexistsAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.hexists(arg0, arg1, it)
  }
}

suspend fun RedisAPI.hgetAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.hget(arg0, arg1, it)
  }
}

suspend fun RedisAPI.hgetallAwait(arg0 : String) : Response {
  return awaitResult{
    this.hgetall(arg0, it)
  }
}

suspend fun RedisAPI.hincrbyAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.hincrby(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.hincrbyfloatAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.hincrbyfloat(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.hkeysAwait(arg0 : String) : Response {
  return awaitResult{
    this.hkeys(arg0, it)
  }
}

suspend fun RedisAPI.hlenAwait(arg0 : String) : Response {
  return awaitResult{
    this.hlen(arg0, it)
  }
}

suspend fun RedisAPI.hmgetAwait(args : List<String>) : Response {
  return awaitResult{
    this.hmget(args, it)
  }
}

suspend fun RedisAPI.hmsetAwait(args : List<String>) : Response {
  return awaitResult{
    this.hmset(args, it)
  }
}

suspend fun RedisAPI.hostAwait(args : List<String>) : Response {
  return awaitResult{
    this.host(args, it)
  }
}

suspend fun RedisAPI.hscanAwait(args : List<String>) : Response {
  return awaitResult{
    this.hscan(args, it)
  }
}

suspend fun RedisAPI.hsetAwait(args : List<String>) : Response {
  return awaitResult{
    this.hset(args, it)
  }
}

suspend fun RedisAPI.hsetnxAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.hsetnx(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.hstrlenAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.hstrlen(arg0, arg1, it)
  }
}

suspend fun RedisAPI.hvalsAwait(arg0 : String) : Response {
  return awaitResult{
    this.hvals(arg0, it)
  }
}

suspend fun RedisAPI.incrAwait(arg0 : String) : Response {
  return awaitResult{
    this.incr(arg0, it)
  }
}

suspend fun RedisAPI.incrbyAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.incrby(arg0, arg1, it)
  }
}

suspend fun RedisAPI.incrbyfloatAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.incrbyfloat(arg0, arg1, it)
  }
}

suspend fun RedisAPI.infoAwait(args : List<String>) : Response {
  return awaitResult{
    this.info(args, it)
  }
}

suspend fun RedisAPI.keysAwait(arg0 : String) : Response {
  return awaitResult{
    this.keys(arg0, it)
  }
}

suspend fun RedisAPI.lastsaveAwait() : Response {
  return awaitResult{
    this.lastsave(it)
  }
}

suspend fun RedisAPI.latencyAwait(args : List<String>) : Response {
  return awaitResult{
    this.latency(args, it)
  }
}

suspend fun RedisAPI.lindexAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.lindex(arg0, arg1, it)
  }
}

suspend fun RedisAPI.linsertAwait(arg0 : String, arg1 : String, arg2 : String, arg3 : String) : Response {
  return awaitResult{
    this.linsert(arg0, arg1, arg2, arg3, it)
  }
}

suspend fun RedisAPI.llenAwait(arg0 : String) : Response {
  return awaitResult{
    this.llen(arg0, it)
  }
}

suspend fun RedisAPI.lolwutAwait(args : List<String>) : Response {
  return awaitResult{
    this.lolwut(args, it)
  }
}

suspend fun RedisAPI.lpopAwait(arg0 : String) : Response {
  return awaitResult{
    this.lpop(arg0, it)
  }
}

suspend fun RedisAPI.lpushAwait(args : List<String>) : Response {
  return awaitResult{
    this.lpush(args, it)
  }
}

suspend fun RedisAPI.lpushxAwait(args : List<String>) : Response {
  return awaitResult{
    this.lpushx(args, it)
  }
}

suspend fun RedisAPI.lrangeAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.lrange(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.lremAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.lrem(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.lsetAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.lset(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.ltrimAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.ltrim(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.memoryAwait(args : List<String>) : Response {
  return awaitResult{
    this.memory(args, it)
  }
}

suspend fun RedisAPI.mgetAwait(args : List<String>) : Response {
  return awaitResult{
    this.mget(args, it)
  }
}

suspend fun RedisAPI.migrateAwait(args : List<String>) : Response {
  return awaitResult{
    this.migrate(args, it)
  }
}

suspend fun RedisAPI.moduleAwait(args : List<String>) : Response {
  return awaitResult{
    this.module(args, it)
  }
}

suspend fun RedisAPI.monitorAwait() : Response {
  return awaitResult{
    this.monitor(it)
  }
}

suspend fun RedisAPI.moveAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.move(arg0, arg1, it)
  }
}

suspend fun RedisAPI.msetAwait(args : List<String>) : Response {
  return awaitResult{
    this.mset(args, it)
  }
}

suspend fun RedisAPI.msetnxAwait(args : List<String>) : Response {
  return awaitResult{
    this.msetnx(args, it)
  }
}

suspend fun RedisAPI.multiAwait() : Response {
  return awaitResult{
    this.multi(it)
  }
}

suspend fun RedisAPI.objectAwait(args : List<String>) : Response {
  return awaitResult{
    this.`object`(args, it)
  }
}

suspend fun RedisAPI.persistAwait(arg0 : String) : Response {
  return awaitResult{
    this.persist(arg0, it)
  }
}

suspend fun RedisAPI.pexpireAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.pexpire(arg0, arg1, it)
  }
}

suspend fun RedisAPI.pexpireatAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.pexpireat(arg0, arg1, it)
  }
}

suspend fun RedisAPI.pfaddAwait(args : List<String>) : Response {
  return awaitResult{
    this.pfadd(args, it)
  }
}

suspend fun RedisAPI.pfcountAwait(args : List<String>) : Response {
  return awaitResult{
    this.pfcount(args, it)
  }
}

suspend fun RedisAPI.pfdebugAwait(args : List<String>) : Response {
  return awaitResult{
    this.pfdebug(args, it)
  }
}

suspend fun RedisAPI.pfmergeAwait(args : List<String>) : Response {
  return awaitResult{
    this.pfmerge(args, it)
  }
}

suspend fun RedisAPI.pfselftestAwait() : Response {
  return awaitResult{
    this.pfselftest(it)
  }
}

suspend fun RedisAPI.pingAwait(args : List<String>) : Response {
  return awaitResult{
    this.ping(args, it)
  }
}

suspend fun RedisAPI.postAwait(args : List<String>) : Response {
  return awaitResult{
    this.post(args, it)
  }
}

suspend fun RedisAPI.psetexAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.psetex(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.psubscribeAwait(args : List<String>) : Response {
  return awaitResult{
    this.psubscribe(args, it)
  }
}

suspend fun RedisAPI.psyncAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.psync(arg0, arg1, it)
  }
}

suspend fun RedisAPI.pttlAwait(arg0 : String) : Response {
  return awaitResult{
    this.pttl(arg0, it)
  }
}

suspend fun RedisAPI.publishAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.publish(arg0, arg1, it)
  }
}

suspend fun RedisAPI.pubsubAwait(args : List<String>) : Response {
  return awaitResult{
    this.pubsub(args, it)
  }
}

suspend fun RedisAPI.punsubscribeAwait(args : List<String>) : Response {
  return awaitResult{
    this.punsubscribe(args, it)
  }
}

suspend fun RedisAPI.randomkeyAwait() : Response {
  return awaitResult{
    this.randomkey(it)
  }
}

suspend fun RedisAPI.readonlyAwait() : Response {
  return awaitResult{
    this.readonly(it)
  }
}

suspend fun RedisAPI.readwriteAwait() : Response {
  return awaitResult{
    this.readwrite(it)
  }
}

suspend fun RedisAPI.renameAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.rename(arg0, arg1, it)
  }
}

suspend fun RedisAPI.renamenxAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.renamenx(arg0, arg1, it)
  }
}

suspend fun RedisAPI.replconfAwait(args : List<String>) : Response {
  return awaitResult{
    this.replconf(args, it)
  }
}

suspend fun RedisAPI.replicaofAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.replicaof(arg0, arg1, it)
  }
}

suspend fun RedisAPI.restoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.restore(args, it)
  }
}

suspend fun RedisAPI.restoreAskingAwait(args : List<String>) : Response {
  return awaitResult{
    this.restoreAsking(args, it)
  }
}

suspend fun RedisAPI.roleAwait() : Response {
  return awaitResult{
    this.role(it)
  }
}

suspend fun RedisAPI.rpopAwait(arg0 : String) : Response {
  return awaitResult{
    this.rpop(arg0, it)
  }
}

suspend fun RedisAPI.rpoplpushAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.rpoplpush(arg0, arg1, it)
  }
}

suspend fun RedisAPI.rpushAwait(args : List<String>) : Response {
  return awaitResult{
    this.rpush(args, it)
  }
}

suspend fun RedisAPI.rpushxAwait(args : List<String>) : Response {
  return awaitResult{
    this.rpushx(args, it)
  }
}

suspend fun RedisAPI.saddAwait(args : List<String>) : Response {
  return awaitResult{
    this.sadd(args, it)
  }
}

suspend fun RedisAPI.saveAwait() : Response {
  return awaitResult{
    this.save(it)
  }
}

suspend fun RedisAPI.scanAwait(args : List<String>) : Response {
  return awaitResult{
    this.scan(args, it)
  }
}

suspend fun RedisAPI.scardAwait(arg0 : String) : Response {
  return awaitResult{
    this.scard(arg0, it)
  }
}

suspend fun RedisAPI.scriptAwait(args : List<String>) : Response {
  return awaitResult{
    this.script(args, it)
  }
}

suspend fun RedisAPI.sdiffAwait(args : List<String>) : Response {
  return awaitResult{
    this.sdiff(args, it)
  }
}

suspend fun RedisAPI.sdiffstoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.sdiffstore(args, it)
  }
}

suspend fun RedisAPI.selectAwait(arg0 : String) : Response {
  return awaitResult{
    this.select(arg0, it)
  }
}

suspend fun RedisAPI.setAwait(args : List<String>) : Response {
  return awaitResult{
    this.set(args, it)
  }
}

suspend fun RedisAPI.setbitAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.setbit(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.setexAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.setex(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.setnxAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.setnx(arg0, arg1, it)
  }
}

suspend fun RedisAPI.setrangeAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.setrange(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.shutdownAwait(args : List<String>) : Response {
  return awaitResult{
    this.shutdown(args, it)
  }
}

suspend fun RedisAPI.sinterAwait(args : List<String>) : Response {
  return awaitResult{
    this.sinter(args, it)
  }
}

suspend fun RedisAPI.sinterstoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.sinterstore(args, it)
  }
}

suspend fun RedisAPI.sismemberAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.sismember(arg0, arg1, it)
  }
}

suspend fun RedisAPI.slaveofAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.slaveof(arg0, arg1, it)
  }
}

suspend fun RedisAPI.slowlogAwait(args : List<String>) : Response {
  return awaitResult{
    this.slowlog(args, it)
  }
}

suspend fun RedisAPI.smembersAwait(arg0 : String) : Response {
  return awaitResult{
    this.smembers(arg0, it)
  }
}

suspend fun RedisAPI.smoveAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.smove(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.sortAwait(args : List<String>) : Response {
  return awaitResult{
    this.sort(args, it)
  }
}

suspend fun RedisAPI.spopAwait(args : List<String>) : Response {
  return awaitResult{
    this.spop(args, it)
  }
}

suspend fun RedisAPI.srandmemberAwait(args : List<String>) : Response {
  return awaitResult{
    this.srandmember(args, it)
  }
}

suspend fun RedisAPI.sremAwait(args : List<String>) : Response {
  return awaitResult{
    this.srem(args, it)
  }
}

suspend fun RedisAPI.sscanAwait(args : List<String>) : Response {
  return awaitResult{
    this.sscan(args, it)
  }
}

suspend fun RedisAPI.strlenAwait(arg0 : String) : Response {
  return awaitResult{
    this.strlen(arg0, it)
  }
}

suspend fun RedisAPI.subscribeAwait(args : List<String>) : Response {
  return awaitResult{
    this.subscribe(args, it)
  }
}

suspend fun RedisAPI.substrAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.substr(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.sunionAwait(args : List<String>) : Response {
  return awaitResult{
    this.sunion(args, it)
  }
}

suspend fun RedisAPI.sunionstoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.sunionstore(args, it)
  }
}

suspend fun RedisAPI.swapdbAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.swapdb(arg0, arg1, it)
  }
}

suspend fun RedisAPI.syncAwait() : Response {
  return awaitResult{
    this.sync(it)
  }
}

suspend fun RedisAPI.timeAwait() : Response {
  return awaitResult{
    this.time(it)
  }
}

suspend fun RedisAPI.touchAwait(args : List<String>) : Response {
  return awaitResult{
    this.touch(args, it)
  }
}

suspend fun RedisAPI.ttlAwait(arg0 : String) : Response {
  return awaitResult{
    this.ttl(arg0, it)
  }
}

suspend fun RedisAPI.typeAwait(arg0 : String) : Response {
  return awaitResult{
    this.type(arg0, it)
  }
}

suspend fun RedisAPI.unlinkAwait(args : List<String>) : Response {
  return awaitResult{
    this.unlink(args, it)
  }
}

suspend fun RedisAPI.unsubscribeAwait(args : List<String>) : Response {
  return awaitResult{
    this.unsubscribe(args, it)
  }
}

suspend fun RedisAPI.unwatchAwait() : Response {
  return awaitResult{
    this.unwatch(it)
  }
}

suspend fun RedisAPI.waitAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.wait(arg0, arg1, it)
  }
}

suspend fun RedisAPI.watchAwait(args : List<String>) : Response {
  return awaitResult{
    this.watch(args, it)
  }
}

suspend fun RedisAPI.xackAwait(args : List<String>) : Response {
  return awaitResult{
    this.xack(args, it)
  }
}

suspend fun RedisAPI.xaddAwait(args : List<String>) : Response {
  return awaitResult{
    this.xadd(args, it)
  }
}

suspend fun RedisAPI.xclaimAwait(args : List<String>) : Response {
  return awaitResult{
    this.xclaim(args, it)
  }
}

suspend fun RedisAPI.xdelAwait(args : List<String>) : Response {
  return awaitResult{
    this.xdel(args, it)
  }
}

suspend fun RedisAPI.xgroupAwait(args : List<String>) : Response {
  return awaitResult{
    this.xgroup(args, it)
  }
}

suspend fun RedisAPI.xinfoAwait(args : List<String>) : Response {
  return awaitResult{
    this.xinfo(args, it)
  }
}

suspend fun RedisAPI.xlenAwait(arg0 : String) : Response {
  return awaitResult{
    this.xlen(arg0, it)
  }
}

suspend fun RedisAPI.xpendingAwait(args : List<String>) : Response {
  return awaitResult{
    this.xpending(args, it)
  }
}

suspend fun RedisAPI.xrangeAwait(args : List<String>) : Response {
  return awaitResult{
    this.xrange(args, it)
  }
}

suspend fun RedisAPI.xreadAwait(args : List<String>) : Response {
  return awaitResult{
    this.xread(args, it)
  }
}

suspend fun RedisAPI.xreadgroupAwait(args : List<String>) : Response {
  return awaitResult{
    this.xreadgroup(args, it)
  }
}

suspend fun RedisAPI.xrevrangeAwait(args : List<String>) : Response {
  return awaitResult{
    this.xrevrange(args, it)
  }
}

suspend fun RedisAPI.xsetidAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.xsetid(arg0, arg1, it)
  }
}

suspend fun RedisAPI.xtrimAwait(args : List<String>) : Response {
  return awaitResult{
    this.xtrim(args, it)
  }
}

suspend fun RedisAPI.zaddAwait(args : List<String>) : Response {
  return awaitResult{
    this.zadd(args, it)
  }
}

suspend fun RedisAPI.zcardAwait(arg0 : String) : Response {
  return awaitResult{
    this.zcard(arg0, it)
  }
}

suspend fun RedisAPI.zcountAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.zcount(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.zincrbyAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.zincrby(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.zinterstoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.zinterstore(args, it)
  }
}

suspend fun RedisAPI.zlexcountAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.zlexcount(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.zpopmaxAwait(args : List<String>) : Response {
  return awaitResult{
    this.zpopmax(args, it)
  }
}

suspend fun RedisAPI.zpopminAwait(args : List<String>) : Response {
  return awaitResult{
    this.zpopmin(args, it)
  }
}

suspend fun RedisAPI.zrangeAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrange(args, it)
  }
}

suspend fun RedisAPI.zrangebylexAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrangebylex(args, it)
  }
}

suspend fun RedisAPI.zrangebyscoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrangebyscore(args, it)
  }
}

suspend fun RedisAPI.zrankAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.zrank(arg0, arg1, it)
  }
}

suspend fun RedisAPI.zremAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrem(args, it)
  }
}

suspend fun RedisAPI.zremrangebylexAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.zremrangebylex(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.zremrangebyrankAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.zremrangebyrank(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.zremrangebyscoreAwait(arg0 : String, arg1 : String, arg2 : String) : Response {
  return awaitResult{
    this.zremrangebyscore(arg0, arg1, arg2, it)
  }
}

suspend fun RedisAPI.zrevrangeAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrevrange(args, it)
  }
}

suspend fun RedisAPI.zrevrangebylexAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrevrangebylex(args, it)
  }
}

suspend fun RedisAPI.zrevrangebyscoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.zrevrangebyscore(args, it)
  }
}

suspend fun RedisAPI.zrevrankAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.zrevrank(arg0, arg1, it)
  }
}

suspend fun RedisAPI.zscanAwait(args : List<String>) : Response {
  return awaitResult{
    this.zscan(args, it)
  }
}

suspend fun RedisAPI.zscoreAwait(arg0 : String, arg1 : String) : Response {
  return awaitResult{
    this.zscore(arg0, arg1, it)
  }
}

suspend fun RedisAPI.zunionstoreAwait(args : List<String>) : Response {
  return awaitResult{
    this.zunionstore(args, it)
  }
}

