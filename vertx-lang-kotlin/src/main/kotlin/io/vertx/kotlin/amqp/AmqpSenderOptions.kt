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
package io.vertx.kotlin.amqp

import io.vertx.amqp.AmqpSenderOptions

/**
 * A function providing a DSL for building [io.vertx.amqp.AmqpSenderOptions] objects.
 *
 * Configures the AMQP Receiver.
 *
 * @param autoDrained  Sets whether the link is automatically marked drained after the send queue drain handler callback returns if the receiving peer requested that credit be drained. <p> <code>true</code> by default.
 * @param dynamic  Sets whether the link remote terminus to be used should indicate it is 'dynamic', requesting the peer names it with a dynamic address. <p> The address provided by the peer can then be inspected using the [io.vertx.amqp.AmqpSender] method on the [io.vertx.amqp.AmqpSender] received once opened.
 * @param linkName 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqp.AmqpSenderOptions original] using Vert.x codegen.
 */
fun amqpSenderOptionsOf(
  autoDrained: Boolean? = null,
  dynamic: Boolean? = null,
  linkName: String? = null): AmqpSenderOptions = io.vertx.amqp.AmqpSenderOptions().apply {

  if (autoDrained != null) {
    this.setAutoDrained(autoDrained)
  }
  if (dynamic != null) {
    this.setDynamic(dynamic)
  }
  if (linkName != null) {
    this.setLinkName(linkName)
  }
}

/**
 * A function providing a DSL for building [io.vertx.amqp.AmqpSenderOptions] objects.
 *
 * Configures the AMQP Receiver.
 *
 * @param autoDrained  Sets whether the link is automatically marked drained after the send queue drain handler callback returns if the receiving peer requested that credit be drained. <p> <code>true</code> by default.
 * @param dynamic  Sets whether the link remote terminus to be used should indicate it is 'dynamic', requesting the peer names it with a dynamic address. <p> The address provided by the peer can then be inspected using the [io.vertx.amqp.AmqpSender] method on the [io.vertx.amqp.AmqpSender] received once opened.
 * @param linkName 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqp.AmqpSenderOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("amqpSenderOptionsOf(autoDrained, dynamic, linkName)")
)
fun AmqpSenderOptions(
  autoDrained: Boolean? = null,
  dynamic: Boolean? = null,
  linkName: String? = null): AmqpSenderOptions = io.vertx.amqp.AmqpSenderOptions().apply {

  if (autoDrained != null) {
    this.setAutoDrained(autoDrained)
  }
  if (dynamic != null) {
    this.setDynamic(dynamic)
  }
  if (linkName != null) {
    this.setLinkName(linkName)
  }
}

