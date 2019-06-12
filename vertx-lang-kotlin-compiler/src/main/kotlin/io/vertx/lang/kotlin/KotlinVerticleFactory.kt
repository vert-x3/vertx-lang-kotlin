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
package io.vertx.lang.kotlin

import io.vertx.core.*
import io.vertx.core.spi.*
import org.jetbrains.kotlin.descriptors.*
import org.jetbrains.kotlin.js.descriptorUtils.*
import org.jetbrains.kotlin.types.*
import org.jetbrains.kotlin.types.typeUtil.*
import java.io.*

open class KotlinVerticleFactory : VerticleFactory {
  override fun prefix() = "kt"

  override fun createVerticle(verticleName: String, classLoader: ClassLoader): Verticle {
    val resourceName = VerticleFactory.removePrefix(verticleName)

    var url = classLoader.getResource(resourceName)
    if (url == null) {
      var f = File(resourceName)
      if (!f.isAbsolute) {
        f = File(System.getProperty("user.dir"), resourceName)
      }
      if (f.exists() && f.isFile) {
        url = f.toURI().toURL()
      }
    }
    if (url == null) {
      throw IllegalStateException("Cannot find verticle script: $verticleName on classpath")
    }

    val verticleClasses = KotlinCompilerHelper.compileKotlinScript(classLoader, prefix() == "kts", url) { _, it ->
      it.kind == ClassKind.CLASS
          && it.modality != Modality.ABSTRACT
          && it.modality != Modality.SEALED
          &&
          (it.defaultType.constructor.supertypes.any { it.isVerticleType() }
              || it.defaultType.supertypes().any { it.isVerticleType() }
              || it is ScriptDescriptor
              )
          && it.effectiveVisibility().publicApi
    }

    return when (verticleClasses.size) {
      0 -> throw IllegalStateException("No verticle classes found in the file")
      1 -> toVerticle(verticleClasses.toList().single())
      else -> CompositeVerticle(verticleClasses.map { it -> toVerticle(it.toPair()) })
    }
  }

  private fun toVerticle(entry : Pair<Class<*>, ClassDescriptor>) : Verticle {
    if (entry.second is ScriptDescriptor) {
      return ScriptVerticle(entry.first)
    } else {
      return entry.first.verticle()
    }
  }

  private fun Class<*>.verticle(): Verticle = newInstance() as Verticle

  private fun KotlinType.isVerticleType() = getJetTypeFqName(false) == "io.vertx.core.Verticle"

  private class CompositeVerticle(val children: List<Verticle>) : Verticle {
    private lateinit var vertx: Vertx

    override fun init(vertx: Vertx, context: Context) {
      this.vertx = vertx
    }

    override fun start(startFuture: Promise<Void>) {
      CompositeFuture.all(
        children.map { verticle ->
          val promise = Promise.promise<String>()
          vertx.deployVerticle(verticle, promise)
          promise.future()
        }).setHandler {
        if (it.succeeded()) {
          startFuture.complete()
        } else {
          startFuture.fail(it.cause())
        }
      }
    }

    override fun stop(stopFuture: Promise<Void>) {
    }

    override fun getVertx() = vertx
  }
}
