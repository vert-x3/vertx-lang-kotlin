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

