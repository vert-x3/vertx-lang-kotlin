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
package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailMessage

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailMessage] objects.
 *
 * represent a mail message that can be sent via the MailClient
 *
 * @param bounceAddress  set bounce address of this mail
 * @param from  set from address of this mail
 * @param to  set list of to addresses
 * @param cc  set list of cc addresses
 * @param bcc  set list of bcc addresses
 * @param subject  set the subject of this mail
 * @param text  set the plain text of this mail
 * @param html  set the html text of this mail
 * @param attachment  set the list of attachments of this mail
 * @param inlineAttachment  set the list of inline attachments of this mail
 * @param headers  Add a message header.
 * @param fixedHeaders  set whether our own headers should be the only headers added to the message
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailMessage original] using Vert.x codegen.
 */
fun mailMessageOf(
  bounceAddress: String? = null,
  from: String? = null,
  to: Iterable<String>? = null,
  cc: Iterable<String>? = null,
  bcc: Iterable<String>? = null,
  subject: String? = null,
  text: String? = null,
  html: String? = null,
  attachment: Iterable<io.vertx.ext.mail.MailAttachment>? = null,
  inlineAttachment: Iterable<io.vertx.ext.mail.MailAttachment>? = null,
  headers: Map<String, String>? = null,
  fixedHeaders: Boolean? = null): MailMessage = io.vertx.ext.mail.MailMessage().apply {

  if (bounceAddress != null) {
    this.setBounceAddress(bounceAddress)
  }
  if (from != null) {
    this.setFrom(from)
  }
  if (to != null) {
    this.setTo(to.toList())
  }
  if (cc != null) {
    this.setCc(cc.toList())
  }
  if (bcc != null) {
    this.setBcc(bcc.toList())
  }
  if (subject != null) {
    this.setSubject(subject)
  }
  if (text != null) {
    this.setText(text)
  }
  if (html != null) {
    this.setHtml(html)
  }
  if (attachment != null) {
    this.setAttachment(attachment.toList())
  }
  if (inlineAttachment != null) {
    this.setInlineAttachment(inlineAttachment.toList())
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (fixedHeaders != null) {
    this.setFixedHeaders(fixedHeaders)
  }
}

