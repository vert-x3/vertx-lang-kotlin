package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailMessage
import io.vertx.ext.mail.MailResult
import io.vertx.ext.mail.MailService
import io.vertx.kotlin.coroutines.awaitResult

suspend fun MailService.sendMailAwait(email : MailMessage) : MailResult {
  return awaitResult{
    this.sendMail(email, it)
  }
}

