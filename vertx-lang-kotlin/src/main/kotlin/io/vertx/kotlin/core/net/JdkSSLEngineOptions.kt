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
package io.vertx.kotlin.core.net

import io.vertx.core.net.JdkSSLEngineOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.JdkSSLEngineOptions] objects.
 *
 * Configures a [io.vertx.core.net.TCPSSLOptions] to use the JDK ssl engine implementation.
 *
 * @param pooledHeapBuffers  Set whether to use pooled heap buffers. Default is <code>false</code>, but it is recommended to use pooled buffers
 * @param useWorkerThread  Set the thread pool to use for SSL blocking operations.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.JdkSSLEngineOptions original] using Vert.x codegen.
 */
fun jdkSSLEngineOptionsOf(
  pooledHeapBuffers: Boolean? = null,
  useWorkerThread: Boolean? = null): JdkSSLEngineOptions = io.vertx.core.net.JdkSSLEngineOptions().apply {

  if (pooledHeapBuffers != null) {
    this.setPooledHeapBuffers(pooledHeapBuffers)
  }
  if (useWorkerThread != null) {
    this.setUseWorkerThread(useWorkerThread)
  }
}

