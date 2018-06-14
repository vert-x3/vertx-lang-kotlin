package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MessageSource
import java.util.function.Function
import kotlin.Any
import kotlin.Boolean

object MessageSourceExtensions {
 /**
  *  Convenient method that looks for a message source and provides the configured [MessageConsumer]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional
  * @param <T>           The class of the message
  */
 suspend fun <T : Any> getConsumer(discovery: ServiceDiscovery, filter: JsonObject): MessageConsumer<T> {
   return awaitResult { MessageSource.getConsumer(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a message source and provides the configured [MessageConsumer]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, must not be `null`
  * @param <T>           The class of the message
  */
 suspend fun <T : Any> getConsumer(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): MessageConsumer<T> {
   return awaitResult { MessageSource.getConsumer(discovery, filter, it) }
 }
}
