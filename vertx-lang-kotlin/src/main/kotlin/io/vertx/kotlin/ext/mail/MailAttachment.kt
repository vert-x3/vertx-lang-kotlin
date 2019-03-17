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

import io.vertx.ext.mail.MailAttachment

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailAttachment] objects.
 *
 * Represent a mail attachment that can be used in a MailMessage.
 *
 * @param contentId  set the Content-ID field to be used in the attachment
 * @param contentType  set the Content-Type
 * @param data  set the data
 * @param description  set the description field to be used in the attachment
 * @param disposition  set the disposition field to be used in the attachment
 * @param headers  Add an header to this attachment.
 * @param name  set the name
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailAttachment original] using Vert.x codegen.
 */
fun mailAttachmentOf(
  contentId: String? = null,
  contentType: String? = null,
  data: io.vertx.core.buffer.Buffer? = null,
  description: String? = null,
  disposition: String? = null,
  headers: Map<String, String>? = null,
  name: String? = null): MailAttachment = io.vertx.ext.mail.MailAttachment().apply {

  if (contentId != null) {
    this.setContentId(contentId)
  }
  if (contentType != null) {
    this.setContentType(contentType)
  }
  if (data != null) {
    this.setData(data)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (disposition != null) {
    this.setDisposition(disposition)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (name != null) {
    this.setName(name)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailAttachment] objects.
 *
 * Represent a mail attachment that can be used in a MailMessage.
 *
 * @param contentId  set the Content-ID field to be used in the attachment
 * @param contentType  set the Content-Type
 * @param data  set the data
 * @param description  set the description field to be used in the attachment
 * @param disposition  set the disposition field to be used in the attachment
 * @param headers  Add an header to this attachment.
 * @param name  set the name
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailAttachment original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("mailAttachmentOf(contentId, contentType, data, description, disposition, headers, name)")
)
fun MailAttachment(
  contentId: String? = null,
  contentType: String? = null,
  data: io.vertx.core.buffer.Buffer? = null,
  description: String? = null,
  disposition: String? = null,
  headers: Map<String, String>? = null,
  name: String? = null): MailAttachment = io.vertx.ext.mail.MailAttachment().apply {

  if (contentId != null) {
    this.setContentId(contentId)
  }
  if (contentType != null) {
    this.setContentType(contentType)
  }
  if (data != null) {
    this.setData(data)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (disposition != null) {
    this.setDisposition(disposition)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (name != null) {
    this.setName(name)
  }
}

