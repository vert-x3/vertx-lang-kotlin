package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Http2PushMapping

fun http2PushMappingOf(
  extensionTarget: String? = null,
  filePath: String? = null,
  noPush: Boolean? = null): Http2PushMapping = io.vertx.ext.web.Http2PushMapping().apply {

  if (extensionTarget != null) {
    this.setExtensionTarget(extensionTarget)
  }
  if (filePath != null) {
    this.setFilePath(filePath)
  }
  if (noPush != null) {
    this.setNoPush(noPush)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("http2PushMappingOf(extensionTarget, filePath, noPush)")
)
fun Http2PushMapping(
  extensionTarget: String? = null,
  filePath: String? = null,
  noPush: Boolean? = null): Http2PushMapping = io.vertx.ext.web.Http2PushMapping().apply {

  if (extensionTarget != null) {
    this.setExtensionTarget(extensionTarget)
  }
  if (filePath != null) {
    this.setFilePath(filePath)
  }
  if (noPush != null) {
    this.setNoPush(noPush)
  }
}

