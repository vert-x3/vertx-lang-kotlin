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
 * @param localOnly  Whether a message should be delivered to local consumers only. Defaults to <code>false</code>. <p> <strong>This option is effective in clustered mode only and does not apply to reply messages</strong>.
 * @param sendTimeout  Set the send timeout.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.DeliveryOptions original] using Vert.x codegen.
 */
fun deliveryOptionsOf(
  codecName: String? = null,
  headers: Map<String, String>? = null,
  localOnly: Boolean? = null,
  sendTimeout: Long? = null): DeliveryOptions = io.vertx.core.eventbus.DeliveryOptions().apply {

  if (codecName != null) {
    this.setCodecName(codecName)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (localOnly != null) {
    this.setLocalOnly(localOnly)
  }
  if (sendTimeout != null) {
    this.setSendTimeout(sendTimeout)
  }
}

