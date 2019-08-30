import io.vertx.core.Vertx
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.ext.web.handler.LoggerHandler
import io.vertx.kotlin.core.json.jsonObjectOf
import io.vertx.kotlin.dsl.router
import io.vertx.kotlin.dsl.server
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
val vertx = Vertx.vertx()

    runBlocking {
        server(vertx) {

            var name: String = "world"

            router {
                route {
                    it.handler(LoggerHandler.create())
                }
            }

            router("/v1") {

                getAwait("/hello") {
                    //call suspend methods or app layer
                    delay(500)
                    it.response().end(jsonObjectOf("hello" to name).toBuffer())
                }

                put("/hello", BodyHandler.create())
                putAwait("/hello") {
                    val body = it.bodyAsJson
                    try {
                        name = body.getString("name") ?: error("Name Key Missing")
                        it.response().setStatusCode(200).end()
                    } catch (throwable: Throwable) {
                        it.response().setStatusCode(400).end("Key 'name' Was missing from body")
                    }
                }


            }

        }.listenAwait(8081)
    }
}




