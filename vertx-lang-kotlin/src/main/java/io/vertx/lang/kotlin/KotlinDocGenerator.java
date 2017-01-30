package io.vertx.lang.kotlin;

import io.vertx.codegen.Case;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.type.EnumTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codegen.type.TypeMirrorFactory;
import io.vertx.codetrans.CodeTranslator;
import io.vertx.codetrans.lang.js.JavaScriptLang;
import io.vertx.codetrans.lang.kotlin.KotlinLang;
import io.vertx.docgen.Coordinate;
import io.vertx.docgen.DocGenerator;
import io.vertx.docgen.JavaDocGenerator;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class KotlinDocGenerator implements DocGenerator {

  private JavaDocGenerator javaGen = new JavaDocGenerator();
  private CodeTranslator translator;

  @Override
  public void init(ProcessingEnvironment processingEnv) {
    translator = new CodeTranslator(processingEnv);
    javaGen.init(processingEnv);
  }

  @Override
  public String getName() {
    return "kotlin";
  }

  @Override
  public String renderSource(ExecutableElement elt, String source) {
    KotlinLang lang = new KotlinLang();
    try {
      return translator.translate(elt, lang);
    } catch (Exception e) {
      System.out.println("Cannot generate " + elt.getEnclosingElement().getSimpleName() + "#" + elt.getSimpleName() + " : " + e.getMessage());
      return "Code not translatable";
    }
  }

  @Override
  public String resolveTypeLink(TypeElement elt, Coordinate coordinate) {
    return javaGen.resolveTypeLink(elt, coordinate);
  }

  @Override
  public String resolveConstructorLink(ExecutableElement elt, Coordinate coordinate) {
    return javaGen.resolveConstructorLink(elt, coordinate);
  }

  @Override
  public String resolveMethodLink(ExecutableElement elt, Coordinate coordinate) {
    return javaGen.resolveMethodLink(elt, coordinate);
  }

  @Override
  public String resolveLabel(Element elt, String defaultLabel) {
    return javaGen.resolveLabel(elt, defaultLabel);
  }

  @Override
  public String resolveFieldLink(VariableElement elt, Coordinate coordinate) {
    return javaGen.resolveFieldLink(elt, coordinate);
  }
}
