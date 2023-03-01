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

import io.vertx.ext.mail.MailClient
import io.vertx.ext.mail.MailMessage
import io.vertx.ext.mail.MailResult
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.mail.MailClient.sendMail]
 *
 * @param email MailMessage object containing the mail text, from/to, attachments etc
 * @return [MailResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mail.MailClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sendMail returning a future and chain with await()", replaceWith = ReplaceWith("sendMail(email).await()"))
suspend fun MailClient.sendMailAwait(email: MailMessage): MailResult {
  return awaitResult {
    this.sendMail(email, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.mail.MailClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.mail.MailClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun MailClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

