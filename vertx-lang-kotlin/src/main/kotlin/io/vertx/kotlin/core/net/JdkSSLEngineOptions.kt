package io.vertx.kotlin.core.net

import io.vertx.core.net.JdkSSLEngineOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.JdkSSLEngineOptions] objects.
 *
 * Configures a [io.vertx.core.net.TCPSSLOptions] to use the JDK ssl engine implementation.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.JdkSSLEngineOptions original] using Vert.x codegen.
 */
fun jdkSSLEngineOptionsOf(
): JdkSSLEngineOptions = io.vertx.core.net.JdkSSLEngineOptions().apply {

}

/**
 * A function providing a DSL for building [io.vertx.core.net.JdkSSLEngineOptions] objects.
 *
 * Configures a [io.vertx.core.net.TCPSSLOptions] to use the JDK ssl engine implementation.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.JdkSSLEngineOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jdkSSLEngineOptionsOf()")
)
fun JdkSSLEngineOptions(
): JdkSSLEngineOptions = io.vertx.core.net.JdkSSLEngineOptions().apply {

}

