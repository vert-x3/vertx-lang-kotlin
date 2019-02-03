package io.vertx.kotlin.ext.auth.oauth2.providers

import io.vertx.core.Vertx
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.ext.auth.oauth2.providers.KeycloakAuth as KeycloakAuthVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object KeycloakAuth {
  /**
   * Suspending version of method [io.vertx.ext.auth.oauth2.providers.KeycloakAuth.discover]
   *
   * @param vertx the vertx instance
   * @param config the initial config
   * @return [OAuth2Auth]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.providers.KeycloakAuth] using Vert.x codegen.
   */
  suspend fun discoverAwait(vertx: Vertx, config: OAuth2ClientOptions): OAuth2Auth {
    return awaitResult {
      KeycloakAuthVertxAlias.discover(vertx, config, it)
    }
  }

}
