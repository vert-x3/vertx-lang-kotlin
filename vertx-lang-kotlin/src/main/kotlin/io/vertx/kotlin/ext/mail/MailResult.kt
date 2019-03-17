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
fun mailResultOf(
  messageID: String? = null,
  recipients: Iterable<String>? = null): MailResult = io.vertx.ext.mail.MailResult().apply {

  if (messageID != null) {
    this.setMessageID(messageID)
  }
  if (recipients != null) {
    this.setRecipients(recipients.toList())
  }
}

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
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("mailResultOf(messageID, recipients)")
)
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

