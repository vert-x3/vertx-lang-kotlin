package io.vertx.kotlin.ext.web.templ

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.templ.TemplateEngine
import io.vertx.kotlin.coroutines.awaitResult

suspend fun TemplateEngine.renderAwait(context : RoutingContext, templateDirectory : String, templateFileName : String) : Buffer {
    return awaitResult{
        this.render(context, templateDirectory, templateFileName, it)
    }
}

