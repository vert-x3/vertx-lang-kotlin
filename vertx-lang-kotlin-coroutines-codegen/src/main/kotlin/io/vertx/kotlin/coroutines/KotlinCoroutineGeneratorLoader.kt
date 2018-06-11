package io.vertx.kotlin.coroutines

import io.vertx.codegen.Generator
import io.vertx.codegen.GeneratorLoader
import java.util.stream.Stream
import javax.annotation.processing.ProcessingEnvironment

class KotlinCoroutineGeneratorLoader : GeneratorLoader {
  override fun loadGenerators(processingEnv: ProcessingEnvironment?): Stream<Generator<*>> {
    return Stream.of(KotlinCoroutineGenerator())
  }
}
