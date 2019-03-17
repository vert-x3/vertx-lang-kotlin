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
