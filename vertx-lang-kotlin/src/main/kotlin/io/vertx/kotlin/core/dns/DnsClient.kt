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
@Deprecated(message = "Instead use lookup returning a future and chain with await()", replaceWith = ReplaceWith("lookup(name).await()"))
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
@Deprecated(message = "Instead use lookup4 returning a future and chain with await()", replaceWith = ReplaceWith("lookup4(name).await()"))
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
@Deprecated(message = "Instead use lookup6 returning a future and chain with await()", replaceWith = ReplaceWith("lookup6(name).await()"))
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
@Deprecated(message = "Instead use resolveA returning a future and chain with await()", replaceWith = ReplaceWith("resolveA(name).await()"))
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
@Deprecated(message = "Instead use resolveAAAA returning a future and chain with await()", replaceWith = ReplaceWith("resolveAAAA(name).await()"))
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
@Deprecated(message = "Instead use resolveCNAME returning a future and chain with await()", replaceWith = ReplaceWith("resolveCNAME(name).await()"))
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
@Deprecated(message = "Instead use resolveMX returning a future and chain with await()", replaceWith = ReplaceWith("resolveMX(name).await()"))
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
@Deprecated(message = "Instead use resolveTXT returning a future and chain with await()", replaceWith = ReplaceWith("resolveTXT(name).await()"))
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
@Deprecated(message = "Instead use resolvePTR returning a future and chain with await()", replaceWith = ReplaceWith("resolvePTR(name).await()"))
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
@Deprecated(message = "Instead use resolveNS returning a future and chain with await()", replaceWith = ReplaceWith("resolveNS(name).await()"))
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
@Deprecated(message = "Instead use resolveSRV returning a future and chain with await()", replaceWith = ReplaceWith("resolveSRV(name).await()"))
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
@Deprecated(message = "Instead use reverseLookup returning a future and chain with await()", replaceWith = ReplaceWith("reverseLookup(ipaddress).await()"))
suspend fun DnsClient.reverseLookupAwait(ipaddress: String): String? {
  return awaitResult {
    this.reverseLookup(ipaddress, it)
  }
}

