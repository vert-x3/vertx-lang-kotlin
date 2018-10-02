package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailMessage
import io.vertx.ext.mail.MailAttachment

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailMessage] objects.
 *
 * represent a mail message that can be sent via the MailClient
 *
 * @param attachment  set the list of attachments of this mail
 * @param bcc  set list of bcc addresses
 * @param bounceAddress  set bounce address of this mail
 * @param cc  set list of cc addresses
 * @param fixedHeaders  set whether our own headers should be the only headers added to the message
 * @param from  set from address of this mail
 * @param headers  Add a message header.
 * @param html  set the html text of this mail
 * @param inlineAttachment  set the list of inline attachments of this mail
 * @param subject  set the subject of this mail
 * @param text  set the plain text of this mail
 * @param to  set list of to addresses
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailMessage original] using Vert.x codegen.
 */
fun MailMessage(
  attachment: Iterable<io.vertx.ext.mail.MailAttachment>? = null,
  bcc: Iterable<String>? = null,
  bounceAddress: String? = null,
  cc: Iterable<String>? = null,
  fixedHeaders: Boolean? = null,
  from: String? = null,
  headers: Map<String, String>? = null,
  html: String? = null,
  inlineAttachment: Iterable<io.vertx.ext.mail.MailAttachment>? = null,
  subject: String? = null,
  text: String? = null,
  to: Iterable<String>? = null): MailMessage = io.vertx.ext.mail.MailMessage().apply {

  if (attachment != null) {
    this.setAttachment(attachment.toList())
  }
  if (bcc != null) {
    this.setBcc(bcc.toList())
  }
  if (bounceAddress != null) {
    this.setBounceAddress(bounceAddress)
  }
  if (cc != null) {
    this.setCc(cc.toList())
  }
  if (fixedHeaders != null) {
    this.setFixedHeaders(fixedHeaders)
  }
  if (from != null) {
    this.setFrom(from)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (html != null) {
    this.setHtml(html)
  }
  if (inlineAttachment != null) {
    this.setInlineAttachment(inlineAttachment.toList())
  }
  if (subject != null) {
    this.setSubject(subject)
  }
  if (text != null) {
    this.setText(text)
  }
  if (to != null) {
    this.setTo(to.toList())
  }
}

