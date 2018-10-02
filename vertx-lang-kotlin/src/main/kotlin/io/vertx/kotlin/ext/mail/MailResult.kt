package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailResult

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailResult] objects.
 *
 * Represent the result of the sendMail operation
 *
 * @param messageID 
 * @param recipients 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailResult original] using Vert.x codegen.
 */
fun MailResult(
  messageID: String? = null,
  recipients: Iterable<String>? = null): MailResult = io.vertx.ext.mail.MailResult().apply {

  if (messageID != null) {
    this.setMessageID(messageID)
  }
  if (recipients != null) {
    this.setRecipients(recipients.toList())
  }
}

