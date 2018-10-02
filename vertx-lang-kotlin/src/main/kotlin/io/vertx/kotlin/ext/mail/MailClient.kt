package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailClient
import io.vertx.ext.mail.MailMessage
import io.vertx.ext.mail.MailResult
import io.vertx.kotlin.coroutines.awaitResult

/**
 * send a single mail via MailClient
 *
 * @param email MailMessage object containing the mail text, from/to, attachments etc
 * @param resultHandler will be called when the operation is finished or it fails (may be null to ignore the result)
 * @returnthis MailClient instance so the method can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailClient original] using Vert.x codegen.
 */
suspend fun MailClient.sendMailAwait(email : MailMessage) : MailResult {
  return awaitResult{
    this.sendMail(email, it)
  }
}

