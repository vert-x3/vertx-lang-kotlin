package io.vertx.kotlin.coroutines;

import io.vertx.codegen.Generator;
import io.vertx.codegen.GeneratorLoader;

import javax.annotation.processing.ProcessingEnvironment;
import java.util.stream.Stream;

public class KotlinCoroutineGeneratorLoader implements GeneratorLoader {
  @Override
  public Stream<Generator<?>> loadGenerators(ProcessingEnvironment processingEnvironment) {
    return Stream.of(new KotlinCoroutineGenerator());
  }
}
