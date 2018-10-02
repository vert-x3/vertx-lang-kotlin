package io.vertx.kotlin.ext.web.common.template

import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.common.template.TemplateEngine
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Render the template. Template engines that support partials/fragments should extract the template base path from
 * the template filename up to the last file separator.
 *
 * Some engines support localization, for these engines, there is a predefined key "lang" to specify the language to
 * be used in the localization, the format should follow the standard locale formats e.g.: "en-gb", "pt-br", "en".
 *
 * @param context the routing context
 * @param templateFileName the template file name to use
 * @param handler the handler that will be called with a result containing the buffer or a failure.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.common.template.TemplateEngine original] using Vert.x codegen.
 */
suspend fun TemplateEngine.renderAwait(context : JsonObject, templateFileName : String) : Buffer {
  return awaitResult{
    this.render(context, templateFileName, it)
  }
}

