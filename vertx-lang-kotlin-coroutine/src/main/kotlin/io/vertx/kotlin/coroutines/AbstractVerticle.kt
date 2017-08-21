package io.vertx.kotlin.coroutines

import io.vertx.core.Context
import io.vertx.core.Verticle
import io.vertx.core.Vertx

/**
 * @author [Julien Viet](mailto:julien@julienviet.com)
 */
abstract class AbstractVerticle : Verticle {

    private lateinit var vertxInstance: Vertx
    protected lateinit var context: Context

    override fun init(vertx: Vertx, context: Context) {
        this.vertxInstance = vertx
        this.context = context
    }

    override fun getVertx(): Vertx = vertxInstance
}
