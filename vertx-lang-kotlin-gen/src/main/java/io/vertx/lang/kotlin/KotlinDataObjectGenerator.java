package io.vertx.lang.kotlin;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.PropertyKind;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.lang.kotlin.helper.KotlinCodeGenHelper;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.vertx.codegen.type.ClassKind.*;

public class KotlinDataObjectGenerator extends KotlinGeneratorBase<DataObjectModel> {

  KotlinDataObjectGenerator() {
    super("codegen.kotlin.dataobject");
    this.name = "Kotlin";
    this.kinds = Collections.singleton("dataObject");
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
    PrintWriter writer = new PrintWriter(buffer);
    writer.print("package " + model.getType().translatePackageName("kotlin") + "\n");
    writer.print("\n");
    generateImport(model, writer);
    writer.print("\n");
    generateDoc(model, writer);
    generateFun(model, writer);
    return buffer.toString();
  }

  private void generateImport(DataObjectModel model, PrintWriter writer) {
    writer.print("import " + model.getType().getRaw().getName() + "\n");
    Set<String> genImports = new TreeSet<>();
    for (PropertyInfo p : model.getPropertyMap().values()) {
      ClassKind propertyKind = p.getType().getKind();
      if ((propertyKind == ClassKind.ENUM || propertyKind == ClassKind.DATA_OBJECT) && !p.getType().equals(model.getType())) {
        genImports.add(p.getType().getName());
      }
    }
    for (String i : genImports) {
      writer.print("import " + i + "\n");
    }
  }

  private void generateDoc(DataObjectModel model, PrintWriter writer) {
    Doc doc = model.getDoc();
    if (doc != null) {
      writer.print("/**\n");
      writer.print(" * A function providing a DSL for building [" + model.getType().getName() + "] objects.\n");
      writer.print(" *\n");
      Token.toHtml(doc.getTokens(), " *", KotlinCodeGenHelper::renderLinkToHtml, "\n", writer);
      writer.print(" *\n");
      model.getPropertyMap().values().stream().filter(filterProperties()).forEach(p -> {
        writer.print(" * @param " + p.getName() + " ");
        if (p.getDoc() != null) {
          String docInfo = Token.toHtml(p.getDoc().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "").replace("/*", "/<star>");
          writer.print(docInfo);
        }
        writer.print("\n");
      });
      writer.print(" *\n");
      writer.print(" * <p/>\n");
      writer.print(" * NOTE: This function has been automatically generated from the [" + model.getType().getName() + " original] using Vert.x codegen.\n");
      writer.print(" */\n");
    }
  }

  private Predicate<PropertyInfo> filterProperties() {
    return p -> p.getSetterMethod() != null || p.getAdderMethod() != null;
  }

  private void generateFun(DataObjectModel model, PrintWriter writer) {

    boolean isKotlin = model.getAnnotations().stream().anyMatch(ann -> ann.getName().equals("kotlin.Metadata"));

    ClassTypeInfo type = model.getType();
    writer.print("fun " + type.getRaw().getSimpleName() + "(\n");
    String paramsInfo = model.getPropertyMap().values().stream().filter(filterProperties()).map(p -> "  " + p.getName() + ": " + applyPropertyKind(mapKotlinType(p.getType()), p.getKind()) + "? = null").collect(Collectors.joining(",\n"));
    writer.print(paramsInfo);
    writer.print("): ");
    writer.print(model.getType().getSimpleName());
    writer.print(" = ");
    writer.print(model.getType().getName());
    writer.print("(");
    if (!model.hasEmptyConstructor()) {
      writer.print("io.vertx.core.json.JsonObject()");
    }
    writer.print(").apply {\n");
    writer.print("\n");
    model.getPropertyMap().values()
      .stream()
      .filter(filterProperties())
      .forEach(p -> {
        String propertyName = p.getName();
        PropertyKind propertyKind = p.getKind();
        writer.print("  if (" + propertyName + " != null) {\n");
//        writer.print("  ");
        if (p.getSetterMethod() != null) {
          writer.print("    this." + (isKotlin ? (p.getName() + " = ") : (p.getSetterMethod() + "(")));
          writer.print(propertyName);
          if (propertyKind.isList()) {
            writer.print(".toList()");
          } else if (propertyKind.isSet()) {
            writer.print(".toSet()");
          }
          writer.print((isKotlin ? "" : ")") + "\n");
        } else {
          writer.print("    for (item in " + propertyName);
          writer.print(") {\n");
          writer.print("      this." + p.getAdderMethod());
          if (propertyKind.isMap()) {
            writer.print("(item.key, item.value)\n");
          } else {
            writer.print("(item)\n");
          }
          writer.print("    }\n");
        }
        writer.print("  }\n");
      });
    writer.print("}\n");
    writer.print("\n");
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
    } else if (typeKind == DATA_OBJECT) {
      ret = type.getRaw().getName();
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
