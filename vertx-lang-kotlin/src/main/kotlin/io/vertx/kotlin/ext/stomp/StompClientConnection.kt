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
package io.vertx.kotlin.ext.stomp

import io.vertx.core.buffer.Buffer
import io.vertx.ext.stomp.Frame
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.send]
 *
 * @param headers the headers, must not be <code>null</code>
 * @param body the body, may be <code>null</code>
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(headers, body).await()"))
suspend fun StompClientConnection.sendAwait(headers: Map<String,String>, body: Buffer): Frame {
  return awaitResult {
    this.send(headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.send]
 *
 * @param destination the destination, must not be <code>null</code>
 * @param body the body, may be <code>null</code>
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(destination, body).await()"))
suspend fun StompClientConnection.sendAwait(destination: String, body: Buffer): Frame {
  return awaitResult {
    this.send(destination, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.send]
 *
 * @param frame the frame
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(frame).await()"))
suspend fun StompClientConnection.sendAwait(frame: Frame): Frame {
  return awaitResult {
    this.send(frame, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.send]
 *
 * @param destination the destination, must not be <code>null</code>
 * @param headers the header. The <code>destination</code> header is replaced by the value given to the <code>destination</code> parameter
 * @param body the body, may be <code>null</code>
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(destination, headers, body).await()"))
suspend fun StompClientConnection.sendAwait(destination: String, headers: Map<String,String>, body: Buffer): Frame {
  return awaitResult {
    this.send(destination, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.subscribe]
 *
 * @param destination the destination, must not be <code>null</code>
 * @param handler the handler invoked when a message is received on the given destination. Must not be <code>null</code>.
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use subscribe returning a future and chain with await()", replaceWith = ReplaceWith("subscribe(destination, handler).await()"))
suspend fun StompClientConnection.subscribeAwait(destination: String, handler: (Frame) -> Unit): String {
  return awaitResult {
    this.subscribe(destination, handler, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.subscribe]
 *
 * @param destination the destination, must not be <code>null</code>
 * @param headers the headers to configure the subscription. It may contain the <code>ack</code> header to configure the acknowledgment policy. If the given set of headers contains the <code>id</code> header, this value is used as subscription id.
 * @param handler the handler invoked when a message is received on the given destination. Must not be <code>null</code>.
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use subscribe returning a future and chain with await()", replaceWith = ReplaceWith("subscribe(destination, headers, handler).await()"))
suspend fun StompClientConnection.subscribeAwait(destination: String, headers: Map<String,String>, handler: (Frame) -> Unit): String {
  return awaitResult {
    this.subscribe(destination, headers, handler, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.unsubscribe]
 *
 * @param destination the destination
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unsubscribe returning a future and chain with await()", replaceWith = ReplaceWith("unsubscribe(destination).await()"))
suspend fun StompClientConnection.unsubscribeAwait(destination: String): Frame {
  return awaitResult {
    this.unsubscribe(destination, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.unsubscribe]
 *
 * @param destination the destination
 * @param headers the headers
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unsubscribe returning a future and chain with await()", replaceWith = ReplaceWith("unsubscribe(destination, headers).await()"))
suspend fun StompClientConnection.unsubscribeAwait(destination: String, headers: Map<String,String>): Frame {
  return awaitResult {
    this.unsubscribe(destination, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.beginTX]
 *
 * @param id the transaction id, must not be <code>null</code>
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use beginTX returning a future and chain with await()", replaceWith = ReplaceWith("beginTX(id).await()"))
suspend fun StompClientConnection.beginTXAwait(id: String): Frame {
  return awaitResult {
    this.beginTX(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.beginTX]
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param headers additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use beginTX returning a future and chain with await()", replaceWith = ReplaceWith("beginTX(id, headers).await()"))
suspend fun StompClientConnection.beginTXAwait(id: String, headers: Map<String,String>): Frame {
  return awaitResult {
    this.beginTX(id, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.commit]
 *
 * @param id the transaction id, must not be <code>null</code>
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use commit returning a future and chain with await()", replaceWith = ReplaceWith("commit(id).await()"))
suspend fun StompClientConnection.commitAwait(id: String): Frame {
  return awaitResult {
    this.commit(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.commit]
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param headers additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use commit returning a future and chain with await()", replaceWith = ReplaceWith("commit(id, headers).await()"))
suspend fun StompClientConnection.commitAwait(id: String, headers: Map<String,String>): Frame {
  return awaitResult {
    this.commit(id, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.abort]
 *
 * @param id the transaction id, must not be <code>null</code>
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use abort returning a future and chain with await()", replaceWith = ReplaceWith("abort(id).await()"))
suspend fun StompClientConnection.abortAwait(id: String): Frame {
  return awaitResult {
    this.abort(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.abort]
 *
 * @param id the transaction id, must not be <code>null</code>
 * @param headers additional headers to send to the server. The <code>transaction</code> header is replaced by the value passed in the @{code id} parameter
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use abort returning a future and chain with await()", replaceWith = ReplaceWith("abort(id, headers).await()"))
suspend fun StompClientConnection.abortAwait(id: String, headers: Map<String,String>): Frame {
  return awaitResult {
    this.abort(id, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.disconnect]
 *
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use disconnect returning a future and chain with await()", replaceWith = ReplaceWith("disconnect().await()"))
suspend fun StompClientConnection.disconnectAwait(): Frame {
  return awaitResult {
    this.disconnect(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.disconnect]
 *
 * @param frame the <code>DISCONNECT</code> frame.
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use disconnect returning a future and chain with await()", replaceWith = ReplaceWith("disconnect(frame).await()"))
suspend fun StompClientConnection.disconnectAwait(frame: Frame): Frame {
  return awaitResult {
    this.disconnect(frame, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.ack]
 *
 * @param id the message id of the message to acknowledge
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ack returning a future and chain with await()", replaceWith = ReplaceWith("ack(id).await()"))
suspend fun StompClientConnection.ackAwait(id: String): Frame {
  return awaitResult {
    this.ack(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.nack]
 *
 * @param id the message id of the message to acknowledge
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use nack returning a future and chain with await()", replaceWith = ReplaceWith("nack(id).await()"))
suspend fun StompClientConnection.nackAwait(id: String): Frame {
  return awaitResult {
    this.nack(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.ack]
 *
 * @param id the message id of the message to acknowledge
 * @param txId the transaction id
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ack returning a future and chain with await()", replaceWith = ReplaceWith("ack(id, txId).await()"))
suspend fun StompClientConnection.ackAwait(id: String, txId: String): Frame {
  return awaitResult {
    this.ack(id, txId, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClientConnection.nack]
 *
 * @param id the message id of the message to acknowledge
 * @param txId the transaction id
 * @return [Frame]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClientConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use nack returning a future and chain with await()", replaceWith = ReplaceWith("nack(id, txId).await()"))
suspend fun StompClientConnection.nackAwait(id: String, txId: String): Frame {
  return awaitResult {
    this.nack(id, txId, it)
  }
}

