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
suspend fun MailClient.sendMailAwait(email: MailMessage): MailResult {
  return awaitResult {
    this.sendMail(email, it)
  }
}

