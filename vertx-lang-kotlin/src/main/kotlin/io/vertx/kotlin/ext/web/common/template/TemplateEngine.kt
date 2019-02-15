package io.vertx.kotlin.ext.web.common.template

import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.common.template.TemplateEngine
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.common.template.TemplateEngine.render]
 *
 * @param context the routing context
 * @param templateFileName the template file name to use
 * @return [Buffer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.common.template.TemplateEngine] using Vert.x codegen.
 */
suspend fun TemplateEngine.renderAwait(context: JsonObject, templateFileName: String): Buffer {
  return awaitResult {
    this.render(context, templateFileName, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.common.template.TemplateEngine.render]
 *
 * @param context the routing context
 * @param templateFileName the template file name to use
 * @return [Buffer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.common.template.TemplateEngine] using Vert.x codegen.
 */
suspend fun TemplateEngine.renderAwait(context: Map<String,Any>, templateFileName: String): Buffer {
  return awaitResult {
    this.render(context, templateFileName, it)
  }
}

