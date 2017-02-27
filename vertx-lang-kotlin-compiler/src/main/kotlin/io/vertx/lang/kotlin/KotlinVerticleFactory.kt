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

    override fun start(startFuture: Future<Void>) {
      CompositeFuture.all(
          children.map { verticle ->
            Future.future<String>().apply {
              vertx.deployVerticle(verticle, completer())
            }
          }).setHandler { startFuture.complete() }
    }

    override fun stop(stopFuture: Future<Void>) {
    }

    override fun getVertx() = vertx
  }
}
