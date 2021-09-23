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
package io.vertx.kotlin.ext.auth.webauthn

import io.vertx.ext.auth.webauthn.MetaDataService
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.MetaDataService.fetchTOC]
 *
 * @param url the url to the TOC
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.MetaDataService] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fetchTOC returning a future and chain with await()", replaceWith = ReplaceWith("fetchTOC(url).await()"))
suspend fun MetaDataService.fetchTOCAwait(url: String): Boolean {
  return awaitResult {
    this.fetchTOC(url, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.MetaDataService.fetchTOC]
 *
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.MetaDataService] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fetchTOC returning a future and chain with await()", replaceWith = ReplaceWith("fetchTOC().await()"))
suspend fun MetaDataService.fetchTOCAwait(): Boolean {
  return awaitResult {
    this.fetchTOC(it)
  }
}

