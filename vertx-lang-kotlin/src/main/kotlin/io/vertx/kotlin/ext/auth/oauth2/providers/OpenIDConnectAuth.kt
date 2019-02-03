package io.vertx.kotlin.ext.auth.oauth2.providers

import io.vertx.core.Vertx
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth as OpenIDConnectAuthVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object OpenIDConnectAuth {
  /**
   * Suspending version of method [io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth.discover]
   *
   * @param vertx the vertx instance
   * @param config the initial config, it should contain a site url
   * @return [OAuth2Auth]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth] using Vert.x codegen.
   */
  suspend fun discoverAwait(vertx: Vertx, config: OAuth2ClientOptions): OAuth2Auth {
    return awaitResult {
      OpenIDConnectAuthVertxAlias.discover(vertx, config, it)
    }
  }

}
