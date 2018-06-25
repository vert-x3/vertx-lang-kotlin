package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClient
import io.vertx.core.dns.MxRecord
import io.vertx.core.dns.SrvRecord
import io.vertx.kotlin.coroutines.awaitResult

suspend fun DnsClient.lookupAwait(name : String) : String? {
    return awaitResult{
        this.lookup(name, it)
    }
}

suspend fun DnsClient.lookup4Await(name : String) : String? {
    return awaitResult{
        this.lookup4(name, it)
    }
}

suspend fun DnsClient.lookup6Await(name : String) : String? {
    return awaitResult{
        this.lookup6(name, it)
    }
}

suspend fun DnsClient.resolveAAwait(name : String) : List<String> {
    return awaitResult{
        this.resolveA(name, it)
    }
}

suspend fun DnsClient.resolveAAAAAwait(name : String) : List<String> {
    return awaitResult{
        this.resolveAAAA(name, it)
    }
}

suspend fun DnsClient.resolveCNAMEAwait(name : String) : List<String> {
    return awaitResult{
        this.resolveCNAME(name, it)
    }
}

suspend fun DnsClient.resolveMXAwait(name : String) : List<MxRecord> {
    return awaitResult{
        this.resolveMX(name, it)
    }
}

suspend fun DnsClient.resolveTXTAwait(name : String) : List<String> {
    return awaitResult{
        this.resolveTXT(name, it)
    }
}

suspend fun DnsClient.resolvePTRAwait(name : String) : String? {
    return awaitResult{
        this.resolvePTR(name, it)
    }
}

suspend fun DnsClient.resolveNSAwait(name : String) : List<String> {
    return awaitResult{
        this.resolveNS(name, it)
    }
}

suspend fun DnsClient.resolveSRVAwait(name : String) : List<SrvRecord> {
    return awaitResult{
        this.resolveSRV(name, it)
    }
}

suspend fun DnsClient.reverseLookupAwait(ipaddress : String) : String? {
    return awaitResult{
        this.reverseLookup(ipaddress, it)
    }
}

