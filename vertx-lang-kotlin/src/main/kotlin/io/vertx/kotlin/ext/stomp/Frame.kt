package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.Frame
import io.vertx.ext.stomp.Frame.Command

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.Frame] objects.
 *
 * Represents a STOMP frame. STOMP frames are structured as follows. It starts by a <code>command</code>, followed by a
 * set of headers. Then the frame may have a body and is finished by a <code>0</code> byte. This class represents this
 * structure and provide access to the different parts.
 * <p/>
 * This class is <strong>NOT</strong> thread-safe.
 *
 * @param body  Sets the body of the frame.
 * @param command  Sets the frame command.
 * @param destination 
 * @param headers  Sets the headers of the frames.
 * @param id 
 * @param transaction 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.Frame original] using Vert.x codegen.
 */
fun frameOf(
  body: io.vertx.core.buffer.Buffer? = null,
  command: Command? = null,
  destination: String? = null,
  headers: Map<String, String>? = null,
  id: String? = null,
  transaction: String? = null): Frame = io.vertx.ext.stomp.Frame().apply {

  if (body != null) {
    this.setBody(body)
  }
  if (command != null) {
    this.setCommand(command)
  }
  if (destination != null) {
    this.setDestination(destination)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (id != null) {
    this.setId(id)
  }
  if (transaction != null) {
    this.setTransaction(transaction)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.Frame] objects.
 *
 * Represents a STOMP frame. STOMP frames are structured as follows. It starts by a <code>command</code>, followed by a
 * set of headers. Then the frame may have a body and is finished by a <code>0</code> byte. This class represents this
 * structure and provide access to the different parts.
 * <p/>
 * This class is <strong>NOT</strong> thread-safe.
 *
 * @param body  Sets the body of the frame.
 * @param command  Sets the frame command.
 * @param destination 
 * @param headers  Sets the headers of the frames.
 * @param id 
 * @param transaction 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.Frame original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("frameOf(body, command, destination, headers, id, transaction)")
)
fun Frame(
  body: io.vertx.core.buffer.Buffer? = null,
  command: Command? = null,
  destination: String? = null,
  headers: Map<String, String>? = null,
  id: String? = null,
  transaction: String? = null): Frame = io.vertx.ext.stomp.Frame().apply {

  if (body != null) {
    this.setBody(body)
  }
  if (command != null) {
    this.setCommand(command)
  }
  if (destination != null) {
    this.setDestination(destination)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (id != null) {
    this.setId(id)
  }
  if (transaction != null) {
    this.setTransaction(transaction)
  }
}

