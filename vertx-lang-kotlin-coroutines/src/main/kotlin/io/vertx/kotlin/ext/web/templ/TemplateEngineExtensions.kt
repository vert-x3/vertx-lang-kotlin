package io.vertx.kotlin.ext.web.templ

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.templ.TemplateEngine
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Deprecated
import kotlin.String

/**
 *  Render the template
 * @param context  the routing context
 * @param templateFileName  the template file name to use
 * @deprecated  use [TemplateEngine.render]
 */
@Deprecated("")
suspend fun TemplateEngine.render(context: RoutingContext, templateFileName: String): Buffer {
  return awaitResult { this.render(context, templateFileName, it) }
}

/**
 *  Render the template
 *  <p>
 *  <b>NOTE</b> if you call method directly (i.e. not using [io.vertx.ext.web.handler.TemplateHandler]) make sure
 *  that <i>templateFileName</i> is sanitized via [io.vertx.ext.web.impl.Utils.normalizePath]
 * @param context  the routing context
 * @param templateDirectory  the template directory to use
 * @param templateFileName  the relative template file name to use */
suspend fun TemplateEngine.render(
  context: RoutingContext,
  templateDirectory: String,
  templateFileName: String
): Buffer {
  return awaitResult { this.render(context, templateDirectory, templateFileName, it) }
}
