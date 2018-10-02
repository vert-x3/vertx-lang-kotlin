package io.vertx.kotlin.ext.auth.oauth2.providers

import io.vertx.core.Vertx
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.ext.auth.oauth2.providers.GoogleAuth as GoogleAuthVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object GoogleAuth {
/**
 * Create a OAuth2Auth provider for OpenID Connect Discovery. The discovery will use the default site in the
 * configuration options and attempt to load the well known descriptor. If a site is provided (for example when
 * running on a custom instance) that site will be used to do the lookup.
 * <p>
 * If the discovered config includes a json web key url, it will be also fetched and the JWKs will be loaded
 * into the OAuth provider so tokens can be decoded.
 *
 * @param vertx the vertx instance
 * @param config the initial config
 * @param handler the instantiated Oauth2 provider instance handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.providers.GoogleAuth original] using Vert.x codegen.
 */
  suspend fun discoverAwait(vertx : Vertx, config : OAuth2ClientOptions) : OAuth2Auth {
    return awaitResult{
      GoogleAuthVertxAlias.discover(vertx, config, it)
    }
  }

}
