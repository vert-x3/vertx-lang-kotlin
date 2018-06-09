package io.vertx.lang.kotlin.helper;

import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;

import javax.lang.model.element.Element;

public class KotlinCodeGenHelper {
  public static String renderLinkToHtml(Tag.Link link) {
    ClassTypeInfo rawType = link.getTargetType().getRaw();
    if (rawType.getModule() != null) {
      String label = link.getLabel().trim();
      if (rawType.getKind() == ClassKind.DATA_OBJECT) {
        return "[" + rawType.getName() + "]";
      } else {
        if (rawType.getKind() == ClassKind.API) {
          Element elt = link.getTargetElement();
          String eltKind = elt.getKind().name();
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
}
