package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailClient
import io.vertx.ext.mail.MailMessage
import io.vertx.ext.mail.MailResult
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  send a single mail via MailClient
 * @param email         MailMessage object containing the mail text, from/to, attachments etc
 * @return this MailClient instance so the method can be used fluently
 */
suspend fun MailClient.sendMail(email: MailMessage): MailResult {
  return awaitResult { this.sendMail(email, it) }
}
