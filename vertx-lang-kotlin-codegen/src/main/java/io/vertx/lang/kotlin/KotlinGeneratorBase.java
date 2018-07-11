package io.vertx.lang.kotlin;

import io.vertx.codegen.Generator;
import io.vertx.codegen.Model;

import javax.annotation.processing.ProcessingEnvironment;
import java.io.File;

public class KotlinGeneratorBase<M extends Model> extends Generator<M> {

  private final String enabledOpt;
  protected String generated;
  protected boolean enabled = true;

  protected KotlinGeneratorBase(String enabledOpt) {
    this.enabledOpt = enabledOpt;
  }

  @Override
  public void load(ProcessingEnvironment processingEnv) {
    super.load(processingEnv);
    generated = processingEnv.getOptions().get("kapt.kotlin.generated");
    if (generated != null) {
      generated = generated.replace(File.separatorChar, '/');
      if (!generated.endsWith("/")) {
        generated += "/";
      }
    } else {
      generated = "kotlin/";
    }
    String opt = processingEnv.getOptions().get(enabledOpt);
    if (opt != null) {
      enabled = "true".equalsIgnoreCase(opt.trim());
    }
  }


}
