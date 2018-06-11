package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.http.HttpClient
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.client.WebClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.HttpEndpoint
import java.util.function.Function

suspend fun getClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : HttpClient? {
    return awaitResult{
        HttpEndpoint.getClient(discovery, filter, it)
    }
}

suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : WebClient? {
    return awaitResult{
        HttpEndpoint.getWebClient(discovery, filter, it)
    }
}

suspend fun getClientAwait(discovery : ServiceDiscovery, filter : JsonObject, conf : JsonObject) : HttpClient? {
    return awaitResult{
        HttpEndpoint.getClient(discovery, filter, conf, it)
    }
}

suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : JsonObject, conf : JsonObject) : WebClient? {
    return awaitResult{
        HttpEndpoint.getWebClient(discovery, filter, conf, it)
    }
}

suspend fun getClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>) : HttpClient? {
    return awaitResult{
        HttpEndpoint.getClient(discovery, filter, it)
    }
}

suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>) : WebClient? {
    return awaitResult{
        HttpEndpoint.getWebClient(discovery, filter, it)
    }
}

suspend fun getClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>, conf : JsonObject) : HttpClient? {
    return awaitResult{
        HttpEndpoint.getClient(discovery, filter, conf, it)
    }
}

suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>, conf : JsonObject) : WebClient? {
    return awaitResult{
        HttpEndpoint.getWebClient(discovery, filter, conf, it)
    }
}

