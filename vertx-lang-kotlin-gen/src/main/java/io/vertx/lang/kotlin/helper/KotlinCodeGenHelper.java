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
package io.vertx.lang.kotlin.helper;

import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;

public class KotlinCodeGenHelper {
  public static String renderLinkToHtml(Tag.Link link) {
    ClassTypeInfo rawType = link.getTargetType().getRaw();
    if (rawType.getModule() != null) {
      String label = link.getLabel().trim();
      if (rawType.getKind() == ClassKind.DATA_OBJECT) {
        return "[" + rawType.getName() + "]";
      } else {
        if (rawType.getKind() == ClassKind.API) {
          String ret = "[" + rawType.getName() + "]";
          if (label.length() > 0) {
            ret += "[" + label + "]" + ret;
          }
          return ret;
        }
      }
    }
    return "[" + rawType.getName() + "]";
  }

  public static String LICENSE = "/*\n" +
    " * Copyright 2019 Red Hat, Inc.\n" +
    " *\n" +
    " * All rights reserved. This program and the accompanying materials\n" +
    " * are made available under the terms of the Eclipse Public License v1.0\n" +
    " * and Apache License v2.0 which accompanies this distribution.\n" +
    " *\n" +
    " * The Eclipse Public License is available at\n" +
    " * http://www.eclipse.org/legal/epl-v10.html\n" +
    " *\n" +
    " * The Apache License v2.0 is available at\n" +
    " * http://www.opensource.org/licenses/apache2.0.php\n" +
    " *\n" +
    " * You may elect to redistribute this code under either of these licenses.\n" +
    " */";
}
