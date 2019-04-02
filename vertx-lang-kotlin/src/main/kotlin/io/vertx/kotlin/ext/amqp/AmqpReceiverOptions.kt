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
package io.vertx.kotlin.ext.amqp

import io.vertx.ext.amqp.AmqpReceiverOptions

/**
 * A function providing a DSL for building [io.vertx.ext.amqp.AmqpReceiverOptions] objects.
 *
 * Configures the AMQP Receiver.
 *
 * @param capabilities  Sets the list of desired capabilities A registry of commonly defined source capabilities and their meanings is maintained at <a href="http://www.amqp.org/specification/1.0/source-capabilities">AMQP Source Capabilities</a>.
 * @param capabilitys  Adds a desired capability. A registry of commonly defined source capabilities and their meanings is maintained at <a href="http://www.amqp.org/specification/1.0/source-capabilities">AMQP Source Capabilities</a>.
 * @param durable  Sets the durability. <p> Passing <code>true</code> sets the expiry policy of the source to <code>NEVER</code> and the durability of the source to <code>UNSETTLED_STATE</code>.
 * @param dynamic  Sets whether the link remote terminus to be used should indicate it is 'dynamic', requesting the peer names it with a dynamic address. <p> The address provided by the peer can then be inspected using the [io.vertx.ext.amqp.AmqpReceiver] method on the [io.vertx.ext.amqp.AmqpReceiver] received once opened.
 * @param linkName 
 * @param maxBufferedMessages  Sets the max buffered messages. This message can be used to configure the initial credit of a receiver.
 * @param qos  Sets the local QOS config.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.amqp.AmqpReceiverOptions original] using Vert.x codegen.
 */
fun amqpReceiverOptionsOf(
  capabilities: Iterable<String>? = null,
  capabilitys: Iterable<String>? = null,
  durable: Boolean? = null,
  dynamic: Boolean? = null,
  linkName: String? = null,
  maxBufferedMessages: Int? = null,
  qos: String? = null): AmqpReceiverOptions = io.vertx.ext.amqp.AmqpReceiverOptions().apply {

  if (capabilities != null) {
    this.setCapabilities(capabilities.toList())
  }
  if (capabilitys != null) {
    for (item in capabilitys) {
      this.addCapability(item)
    }
  }
  if (durable != null) {
    this.setDurable(durable)
  }
  if (dynamic != null) {
    this.setDynamic(dynamic)
  }
  if (linkName != null) {
    this.setLinkName(linkName)
  }
  if (maxBufferedMessages != null) {
    this.setMaxBufferedMessages(maxBufferedMessages)
  }
  if (qos != null) {
    this.setQos(qos)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.amqp.AmqpReceiverOptions] objects.
 *
 * Configures the AMQP Receiver.
 *
 * @param capabilities  Sets the list of desired capabilities A registry of commonly defined source capabilities and their meanings is maintained at <a href="http://www.amqp.org/specification/1.0/source-capabilities">AMQP Source Capabilities</a>.
 * @param capabilitys  Adds a desired capability. A registry of commonly defined source capabilities and their meanings is maintained at <a href="http://www.amqp.org/specification/1.0/source-capabilities">AMQP Source Capabilities</a>.
 * @param durable  Sets the durability. <p> Passing <code>true</code> sets the expiry policy of the source to <code>NEVER</code> and the durability of the source to <code>UNSETTLED_STATE</code>.
 * @param dynamic  Sets whether the link remote terminus to be used should indicate it is 'dynamic', requesting the peer names it with a dynamic address. <p> The address provided by the peer can then be inspected using the [io.vertx.ext.amqp.AmqpReceiver] method on the [io.vertx.ext.amqp.AmqpReceiver] received once opened.
 * @param linkName 
 * @param maxBufferedMessages  Sets the max buffered messages. This message can be used to configure the initial credit of a receiver.
 * @param qos  Sets the local QOS config.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.amqp.AmqpReceiverOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("amqpReceiverOptionsOf(capabilities, capabilitys, durable, dynamic, linkName, maxBufferedMessages, qos)")
)
fun AmqpReceiverOptions(
  capabilities: Iterable<String>? = null,
  capabilitys: Iterable<String>? = null,
  durable: Boolean? = null,
  dynamic: Boolean? = null,
  linkName: String? = null,
  maxBufferedMessages: Int? = null,
  qos: String? = null): AmqpReceiverOptions = io.vertx.ext.amqp.AmqpReceiverOptions().apply {

  if (capabilities != null) {
    this.setCapabilities(capabilities.toList())
  }
  if (capabilitys != null) {
    for (item in capabilitys) {
      this.addCapability(item)
    }
  }
  if (durable != null) {
    this.setDurable(durable)
  }
  if (dynamic != null) {
    this.setDynamic(dynamic)
  }
  if (linkName != null) {
    this.setLinkName(linkName)
  }
  if (maxBufferedMessages != null) {
    this.setMaxBufferedMessages(maxBufferedMessages)
  }
  if (qos != null) {
    this.setQos(qos)
  }
}

