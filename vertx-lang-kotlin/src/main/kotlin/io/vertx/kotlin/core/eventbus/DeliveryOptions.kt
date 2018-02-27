package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions

/**
 * A function providing a DSL for building [io.vertx.core.eventbus.DeliveryOptions] objects.
 *
 * Delivery options are used to configure message delivery.
 * <p>
 * Delivery options allow to configure delivery timeout and message codec name, and to provide any headers
 * that you wish to send with the message.
 *
 * @param codecName  Set the codec name.
 * @param headers  Add a message header. <p> Message headers can be sent with any message and will be accessible with [io.vertx.core.eventbus.Message] at the recipient.
 * @param sendTimeout  Set the send timeout.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.DeliveryOptions original] using Vert.x codegen.
 */
fun DeliveryOptions(
  codecName: String? = null,
  headers: Map<String, String>? = null,
  sendTimeout: Long? = null): DeliveryOptions = io.vertx.core.eventbus.DeliveryOptions().apply {

  if (codecName != null) {
    this.setCodecName(codecName)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (sendTimeout != null) {
    this.setSendTimeout(sendTimeout)
  }
}

