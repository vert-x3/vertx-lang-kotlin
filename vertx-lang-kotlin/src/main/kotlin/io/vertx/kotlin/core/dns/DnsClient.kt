package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClient
import io.vertx.core.dns.MxRecord
import io.vertx.core.dns.SrvRecord
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.lookup]
 *
 * @param name the name to resolve
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.lookupAwait(name: String): String? {
  return awaitResult {
    this.lookup(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.lookup4]
 *
 * @param name the name to resolve
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.lookup4Await(name: String): String? {
  return awaitResult {
    this.lookup4(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.lookup6]
 *
 * @param name the name to resolve
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.lookup6Await(name: String): String? {
  return awaitResult {
    this.lookup6(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveA]
 *
 * @param name the name to resolve
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveAAwait(name: String): List<String> {
  return awaitResult {
    this.resolveA(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveAAAA]
 *
 * @param name the name to resolve
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveAAAAAwait(name: String): List<String> {
  return awaitResult {
    this.resolveAAAA(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveCNAME]
 *
 * @param name the name to resolve the CNAME for
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveCNAMEAwait(name: String): List<String> {
  return awaitResult {
    this.resolveCNAME(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveMX]
 *
 * @param name the name for which the MX records should be resolved
 * @return [List<MxRecord>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveMXAwait(name: String): List<MxRecord> {
  return awaitResult {
    this.resolveMX(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveTXT]
 *
 * @param name the name for which the TXT records should be resolved
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveTXTAwait(name: String): List<String> {
  return awaitResult {
    this.resolveTXT(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolvePTR]
 *
 * @param name the name to resolve the PTR for
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolvePTRAwait(name: String): String? {
  return awaitResult {
    this.resolvePTR(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveNS]
 *
 * @param name the name for which the NS records should be resolved
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveNSAwait(name: String): List<String> {
  return awaitResult {
    this.resolveNS(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.resolveSRV]
 *
 * @param name the name for which the SRV records should be resolved
 * @return [List<SrvRecord>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.resolveSRVAwait(name: String): List<SrvRecord> {
  return awaitResult {
    this.resolveSRV(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.dns.DnsClient.reverseLookup]
 *
 * @param ipaddress the IP address to resolve the PTR for
 * @return [String?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.dns.DnsClient] using Vert.x codegen.
 */
suspend fun DnsClient.reverseLookupAwait(ipaddress: String): String? {
  return awaitResult {
    this.reverseLookup(ipaddress, it)
  }
}

