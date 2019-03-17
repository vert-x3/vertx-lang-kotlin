/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.common.template.TemplateEngine original] using Vert.x codegen.
 */
suspend fun TemplateEngine.renderAwait(context : JsonObject, templateFileName : String) : Buffer {
  return awaitResult{
    this.render(context, templateFileName, it)
  }
}

/**
 * Render the template. Template engines that support partials/fragments should extract the template base path from
 * the template filename up to the last file separator.
 *
 * Some engines support localization, for these engines, there is a predefined key "lang" to specify the language to
 * be used in the localization, the format should follow the standard locale formats e.g.: "en-gb", "pt-br", "en".
 *
 * @param context the routing context
 * @param templateFileName the template file name to use
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.common.template.TemplateEngine original] using Vert.x codegen.
 */
suspend fun TemplateEngine.renderAwait(context : Map<String,Any>, templateFileName : String) : Buffer {
  return awaitResult{
    this.render(context, templateFileName, it)
  }
}

