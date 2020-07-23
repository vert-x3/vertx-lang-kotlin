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
package io.vertx.kotlin.rabbitmq

import io.vertx.rabbitmq.RabbitMQConfirmation

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.RabbitMQConfirmation] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConfirmation original] using Vert.x codegen.
 */
fun rabbitMQConfirmationOf(
): RabbitMQConfirmation = io.vertx.rabbitmq.RabbitMQConfirmation(io.vertx.core.json.JsonObject()).apply {

}

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.RabbitMQConfirmation] objects.
 *
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConfirmation original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("rabbitMQConfirmationOf()")
)
fun RabbitMQConfirmation(
): RabbitMQConfirmation = io.vertx.rabbitmq.RabbitMQConfirmation(io.vertx.core.json.JsonObject()).apply {

}

