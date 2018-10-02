package io.vertx.kotlin.ext.auth.oauth2.providers

import io.vertx.core.Vertx
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth as OpenIDConnectAuthVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object OpenIDConnectAuth {
/**
 * Create a OAuth2Auth provider for OpenID Connect Discovery. The discovery will use the given site in the
 * configuration options and attempt to load the well known descriptor.
 *
 * If the discovered config includes a json web key url, it will be also fetched and the JWKs will be loaded
 * into the OAuth provider so tokens can be decoded.
 *
 * @param vertx the vertx instance
 * @param config the initial config, it should contain a site url
 * @param handler the instantiated Oauth2 provider instance handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth original] using Vert.x codegen.
 */
  suspend fun discoverAwait(vertx : Vertx, config : OAuth2ClientOptions) : OAuth2Auth {
    return awaitResult{
      OpenIDConnectAuthVertxAlias.discover(vertx, config, it)
    }
  }

}
