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

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.PropertyKind;
import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.format.LowerCamelCase;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codegen.writer.CodeWriter;
import io.vertx.lang.kotlin.helper.KotlinCodeGenHelper;

import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.vertx.codegen.type.ClassKind.*;
import static io.vertx.lang.kotlin.helper.KotlinCodeGenHelper.LICENSE;

public class KotlinDataObjectGenerator extends KotlinGeneratorBase<DataObjectModel> {

  KotlinDataObjectGenerator() {
    super("codegen.kotlin.dataobject");
    this.name = "Kotlin";
    this.kinds = Collections.singleton("dataObject");
  }

  @Override
  public Collection<Class<? extends Annotation>> annotations() {
    return Arrays.asList(DataObject.class, ModuleGen.class);
  }

  @Override
  public String filename(DataObjectModel model) {
    return enabled && model.isConcrete() ?
      generated + model.getModule().translateQualifiedName(model.getFqn(), "kotlin").replace(".", "/") + ".kt"
      : null;
  }

  @Override
  public String render(DataObjectModel model, int index, int size, Map<String, Object> session) {
    StringWriter buffer = new StringWriter();
    CodeWriter writer = new CodeWriter(buffer);
    writer.println(LICENSE);
    writer.println("package " + model.getType().translatePackageName("kotlin"));
    writer.println();
    generateImport(model, writer);
    writer.println();
    generateDoc(model, writer);
    generateFun(model, writer);
    return buffer.toString();
  }

  private void generateImport(DataObjectModel model, CodeWriter writer) {
    writer.println("import " + model.getType().getRaw().getName());
    Set<String> genImports = new TreeSet<>();
    for (PropertyInfo p : model.getPropertyMap().values()) {
      ClassKind propertyKind = p.getType().getKind();
      if ((propertyKind == ClassKind.ENUM || p.getType().isDataObjectHolder()) && !p.getType().equals(model.getType())) {
        genImports.add(p.getType().getName());
      }
    }
    for (String i : genImports) {
      writer.println("import " + i);
    }
  }

  private void generateDoc(DataObjectModel model, CodeWriter writer) {
    Doc doc = model.getDoc();
    if (doc != null) {
      writer.println("/**");
      writer.println(" * A function providing a DSL for building [" + model.getType().getName() + "] objects.");
      writer.println(" *");
      Token.toHtml(doc.getTokens(), " *", KotlinCodeGenHelper::renderLinkToHtml, "\n", writer);
      writer.println(" *");
      model.getPropertyMap().values().stream().filter(filterProperties()).forEach(p -> {
        writer.print(" * @param " + p.getName() + " ");
        if (p.getDoc() != null) {
          String docInfo = Token.toHtml(p.getDoc().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "").replace("/*", "/<star>");
          writer.print(docInfo);
        }
        writer.println();
      });
      writer.println(" *");
      writer.println(" * <p/>");
      writer.println(" * NOTE: This function has been automatically generated from the [" + model.getType().getName() + " original] using Vert.x codegen.");
      writer.println(" */");
    }
  }

  private Predicate<PropertyInfo> filterProperties() {
    return p -> p.getSetterMethod() != null || p.getAdderMethod() != null;
  }

  private void generateFun(DataObjectModel model, CodeWriter writer) {
    String functionName = model.getType().getSimpleName(LowerCamelCase.INSTANCE) + "Of";
    generateFunction(functionName, model, writer);
  }

  private void generateFunction(String functionName, DataObjectModel model, CodeWriter writer) {
    boolean isKotlin = model.getAnnotations().stream().anyMatch(ann -> ann.getName().equals("kotlin.Metadata"));

    writer.println("fun " + functionName + "(");
    String paramsInfo = model.getPropertyMap()
      .values()
      .stream()
      .filter(filterProperties())
      .map(p -> {
        String type = mapKotlinType(p.getType());
        String name = isKotlin ? getKotlinName(p, type) : p.getName();
        return "  " + name + ": " + applyPropertyKind(type, p.getKind()) + "? = null";
      })
      .collect(Collectors.joining(",\n"));
    writer.print(paramsInfo);
    writer.print("): ");
    writer.print(model.getType().getSimpleName());
    writer.print(" = ");
    writer.print(model.getType().getName());
    writer.print("(");
    if (!model.hasEmptyConstructor()) {
      if (model.hasJsonConstructor()) {
        writer.print("io.vertx.core.json.JsonObject()");
      } else if (model.hasStringConstructor()) {
        writer.print("String()");
      }
    }
    writer.println(").apply {");
    writer.println();
    writer.indent();
    model.getPropertyMap().values()
      .stream()
      .filter(filterProperties())
      .forEach(p -> {
        String type = mapKotlinType(p.getType());
        String propertyName = isKotlin ? getKotlinName(p, type) : p.getName();
        PropertyKind propertyKind = p.getKind();
        writer.println("if (" + propertyName + " != null) {");
        writer.indent();
        if (p.getSetterMethod() != null) {
          writer.print("this." + (isKotlin ? (propertyName + " = ") : (p.getSetterMethod() + "(")));
          writer.print(propertyName);
          if (propertyKind.isList()) {
            writer.print(".toList()");
          } else if (propertyKind.isSet()) {
            writer.print(".toSet()");
          }
          writer.println((isKotlin ? "" : ")"));
        } else {
          writer.print("for (item in " + propertyName);
          writer.println(") {");
          writer.indent();
          writer.print("this." + p.getAdderMethod());
          if (propertyKind.isMap()) {
            writer.println("(item.key, item.value)");
          } else {
            writer.println("(item)");
          }
          writer.unindent().println("}");
        }
        writer.unindent().println("}");
      });
    writer.unindent().println("}");
    writer.println();
  }

  /**
   * Kotlin converts boolean fields to "isFoo" and "setFoo".
   * Consequently, the field "isFoo" will incorrectly be mapped to "foo".
   *
   * @see <a href="https://github.com/vert-x3/vertx-lang-kotlin/issues/158">Releva</a>
   */
  private String getKotlinName(PropertyInfo p, String kotlinType) {
    String name = p.getName();

    if (kotlinType.equals("Boolean") && (p.getGetterMethod().startsWith("is") && !p.getSetterMethod().startsWith("is"))) {
      name = p.getGetterMethod();
    }
    return name;
  }

  private String mapKotlinType(TypeInfo type) {
    String typeName = type.getName();
    String ret;
    ClassKind typeKind = type.getKind();
    if (typeName.equals("void") || typeName.equals("java.lang.Void")) {
      ret = "Unit";
    } else if (typeName.equals("Object") || typeName.equals("java.lang.Object")) {
      ret = "Any";
    } else if (typeName.equals("Throwable") || typeName.equals("java.lang.Throwable")) {
      ret = "Throwable";
    } else if (typeKind == STRING) {
      ret = "String";
    } else if (type.isDataObjectHolder()) {
      ret = type.getRaw().getName();
    } else if (typeKind == PRIMITIVE || typeKind == BOXED_PRIMITIVE) {
      switch (typeName) {
        case "byte":
        case "java.lang.Byte":
          ret = "Byte";
          break;
        case "short":
        case "java.lang.Short":
          ret = "Short";
          break;
        case "int":
        case "java.lang.Integer":
          ret = "Int";
          break;
        case "long":
        case "java.lang.Long":
          ret = "Long";
          break;
        case "float":
        case "java.lang.Float":
          ret = "Float";
          break;
        case "double":
        case "java.lang.Double":
          ret = "Double";
          break;
        case "boolean":
        case "java.lang.Boolean":
          ret = "Boolean";
          break;
        case "char":
        case "java.lang.Character":
          ret = "Char";
          break;
        default:
          //Will not execute
          throw new RuntimeException("err primitive:" + typeName);
      }
    } else if (typeKind == ENUM) {
      ret = type.getSimpleName();
    } else if (typeKind == JSON_OBJECT || typeKind == JSON_ARRAY) {
      ret = typeName;
    } else {
      ret = typeName;
    }
    return ret;
  }

  private String applyPropertyKind(String type, PropertyKind kind) {
    if (kind.isList() || kind.isSet()) {
      return "Iterable<" + type + ">";
    } else if (kind.isMap()) {
      return "Map<String, " + type + ">";
    }
    return type;
  }
}
