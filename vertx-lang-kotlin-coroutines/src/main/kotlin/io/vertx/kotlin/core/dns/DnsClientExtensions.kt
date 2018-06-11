package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClient
import io.vertx.core.dns.MxRecord
import io.vertx.core.dns.SrvRecord
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String
import kotlin.collections.MutableList

suspend fun DnsClient.lookup(name: String): String? {
  return awaitResult { this.lookup(name, it) }
}

suspend fun DnsClient.lookup4(name: String): String? {
  return awaitResult { this.lookup4(name, it) }
}

suspend fun DnsClient.lookup6(name: String): String? {
  return awaitResult { this.lookup6(name, it) }
}

suspend fun DnsClient.resolveA(name: String): MutableList<String> {
  return awaitResult { this.resolveA(name, it) }
}

suspend fun DnsClient.resolveAAAA(name: String): MutableList<String> {
  return awaitResult { this.resolveAAAA(name, it) }
}

suspend fun DnsClient.resolveCNAME(name: String): MutableList<String> {
  return awaitResult { this.resolveCNAME(name, it) }
}

suspend fun DnsClient.resolveMX(name: String): MutableList<MxRecord> {
  return awaitResult { this.resolveMX(name, it) }
}

suspend fun DnsClient.resolveTXT(name: String): MutableList<String> {
  return awaitResult { this.resolveTXT(name, it) }
}

suspend fun DnsClient.resolvePTR(name: String): String? {
  return awaitResult { this.resolvePTR(name, it) }
}

suspend fun DnsClient.resolveNS(name: String): MutableList<String> {
  return awaitResult { this.resolveNS(name, it) }
}

suspend fun DnsClient.resolveSRV(name: String): MutableList<SrvRecord> {
  return awaitResult { this.resolveSRV(name, it) }
}

suspend fun DnsClient.reverseLookup(ipaddress: String): String? {
  return awaitResult { this.reverseLookup(ipaddress, it) }
}
