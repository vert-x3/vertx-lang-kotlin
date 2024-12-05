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
package io.vertx.kotlin.ext.auth.oauth2.providers

import io.vertx.core.Vertx
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.ext.auth.oauth2.OAuth2Options
import io.vertx.ext.auth.oauth2.providers.IBMCloudAuth as IBMCloudAuthVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object IBMCloudAuth {
  /**
   * Suspending version of method [io.vertx.ext.auth.oauth2.providers.IBMCloudAuth.discover]
   *
   * @param vertx the vertx instance
   * @param config the initial config
   * @return [OAuth2Auth]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.providers.IBMCloudAuth] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use discover returning a future and chain with coAwait()", replaceWith = ReplaceWith("discover(vertx, config).coAwait()"))
  suspend fun discoverAwait(vertx: Vertx, config: OAuth2Options): OAuth2Auth {
    return awaitResult {
      IBMCloudAuthVertxAlias.discover(vertx, config, it)
    }
  }

}
