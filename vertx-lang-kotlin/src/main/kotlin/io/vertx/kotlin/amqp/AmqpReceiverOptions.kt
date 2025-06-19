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

import io.vertx.amqp.AmqpReceiverOptions

/**
 * A function providing a DSL for building [io.vertx.amqp.AmqpReceiverOptions] objects.
 *
 * Configures the AMQP Receiver.
 *
 * @param autoAcknowledgement  Sets the auto-acknowledgement. When enabled (default), the messages are automatically acknowledged. If set to <code>false</code>, the messages must be acknowledged explicitly using [io.vertx.amqp.AmqpMessage], [io.vertx.amqp.AmqpMessage] and [io.vertx.amqp.AmqpMessage].
 * @param capabilities  Sets the list of capabilities to be set on the receiver source terminus.
 * @param capabilitys  Adds a capability to be set on the receiver source terminus.
 * @param durable  Sets the durability. <p> Passing <code>true</code> sets the expiry policy of the source to <code>NEVER</code> and the durability of the source to <code>UNSETTLED_STATE</code>.
 * @param dynamic  Sets whether the Source terminus to be used should specify it is 'dynamic', requesting the peer creates a node and names it with a generated address. <p> The address provided by the peer can then be inspected using the [io.vertx.amqp.AmqpReceiver] method on the [io.vertx.amqp.AmqpReceiver] received once opened.
 * @param linkName 
 * @param maxBufferedMessages  Sets the max buffered messages. This message can be used to configure the initial credit of a receiver.
 * @param noLocal  Sets whether this receiver should not receive messages that were sent using the same underlying connection. Used to determine whether to define an "apache.org:no-local-filter:list" filter on the source terminus, requesting that the server filters which messages are delivered to the receiver so that they do not include messages sent on the same underlying connection (if supported by the server in question).
 * @param qos  Sets the local QOS config.
 * @param selector  Sets a message selector string. Used to define an "apache.org:selector-filter:string" filter on the source terminus, using SQL-based syntax to request the server filters which messages are delivered to the receiver (if supported by the server in question). Precise functionality supported and syntax needed can vary depending on the server.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqp.AmqpReceiverOptions original] using Vert.x codegen.
 */
fun amqpReceiverOptionsOf(
  autoAcknowledgement: Boolean? = null,
  capabilities: Iterable<String>? = null,
  capabilitys: Iterable<String>? = null,
  durable: Boolean? = null,
  dynamic: Boolean? = null,
  linkName: String? = null,
  maxBufferedMessages: Int? = null,
  noLocal: Boolean? = null,
  qos: String? = null,
  selector: String? = null): AmqpReceiverOptions = io.vertx.amqp.AmqpReceiverOptions().apply {

  if (autoAcknowledgement != null) {
    this.setAutoAcknowledgement(autoAcknowledgement)
  }
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
  if (noLocal != null) {
    this.setNoLocal(noLocal)
  }
  if (qos != null) {
    this.setQos(qos)
  }
  if (selector != null) {
    this.setSelector(selector)
  }
}

