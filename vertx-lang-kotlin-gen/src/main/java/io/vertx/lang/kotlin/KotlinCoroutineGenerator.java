package io.vertx.lang.kotlin;

import io.vertx.codegen.*;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.type.*;
import io.vertx.codegen.writer.CodeWriter;
import io.vertx.lang.kotlin.helper.KotlinCodeGenHelper;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KotlinCoroutineGenerator extends KotlinGeneratorBase<ClassModel> {

  private static final Set<String> keyWords = new HashSet<>(Arrays.asList("object", "fun", "in", "typealias", "var", "val"));

  public KotlinCoroutineGenerator() {
    super("codegen.kotlin.coroutines");
    this.name = "KotlinCoroutines";
    this.kinds = Collections.singleton("class");
  }

  @Override
  public Collection<Class<? extends Annotation>> annotations() {
    return Arrays.asList(VertxGen.class, ModuleGen.class);
  }

  @Override
  public String filename(ClassModel model) {
    return enabled && model.getMethods().stream().anyMatch(this::generateFilter) ?
      generated + model.getModule().translateQualifiedName(model.getFqn(), "kotlin").replace(".", "/") + ".kt" : null;
  }

  @Override
  public String render(ClassModel model, int index, int size, Map<String, Object> session) {
    StringWriter buffer = new StringWriter();
    CodeWriter writer = new CodeWriter(buffer);
    ClassTypeInfo type = model.getType();
    Map<Boolean, List<MethodInfo>> methodGroupMap = model
      .getMethods()
      .stream()
      .filter(this::generateFilter)
      .collect(Collectors.groupingBy(MethodInfo::isStaticMethod));
    boolean hasStatic = methodGroupMap.containsKey(true);

    writer.println("package " + type.getRaw().translatePackageName("kotlin"));
    writer.println();
    generateImport(model, writer, methodGroupMap, hasStatic);
    writer.println();

    List<MethodInfo> methods = methodGroupMap.get(false);
    if (methods != null) {
      methods.forEach(method -> {
        generateMethod(model, type, method, writer, hasStatic);
      });
    }

    methods = methodGroupMap.get(true);
    if (methods != null) {
      writer.print("object ");
      writer.print(type.getSimpleName());
      writer.println(" {");

      writer.indent();
      methods.forEach(method -> {
        generateMethod(model, type, method, writer, hasStatic);
      });
      writer.unindent();
      writer.println("}");
    }
    return buffer.toString();
  }

  private void generateDoc(ClassModel model, MethodInfo method, Writer writer) {
    generateDoc(model, method, new PrintWriter(writer));
  }

  private void generateDoc(ClassModel model, MethodInfo method, PrintWriter writer) {
    Doc doc = method.getDoc();
    if (doc != null) {
      writer.print("/**\n");
      Token.toHtml(doc.getTokens(), " *", KotlinCodeGenHelper::renderLinkToHtml, "\n", writer);
      writer.print(" *\n");
      method.getParams()
        .stream()
        .limit(method.getParams().size() - 1)
        .forEach(p -> {
          writer.print(" * @param " + p.getName() + " ");
          if (p.getDescription() != null) {
            String docInfo = Token.toHtml(p.getDescription().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "");
            writer.print(docInfo);
          }
          writer.print("\n");
        });
      if (!method.getReturnType().isVoid()) {
        writer.print(" * @return");
        if (method.getReturnDescription() != null) {
          String docInfo = Token.toHtml(method.getReturnDescription().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "");
          writer.print(docInfo);
        }
      }
      writer.print(" *\n");
      writer.print(" * <p/>\n");
      writer.print(" * NOTE: This function has been automatically generated from the [" + model.getType().getName() + " original] using Vert.x codegen.\n");
      writer.print(" */\n");
    }
  }


  private void generateMethod(ClassModel model, ClassTypeInfo type, MethodInfo method, CodeWriter writer, boolean hasStatic) {
    generateDoc(model, method, writer.writer());
    writer.print("suspend fun ");
    if (!method.getTypeParams().isEmpty() || !type.getParams().isEmpty()) {
      String typeParamInfo = Stream
        .concat(
          method.getTypeParams().stream(),
          type.getParams().stream())
        .map(TypeParamInfo::getName)
        .collect(Collectors.joining(",", "<", ">"));
      writer.print(typeParamInfo);
      writer.print(" ");
    }
    if (!method.isStaticMethod()) {
      writer.print(vertxSimpleNameWrapper(type.getSimpleName(), hasStatic));
      if (!type.getParams().isEmpty()) {
        writer.print(type.getParams().stream()
          .map(TypeParamInfo::getName)
          .collect(Collectors.joining(",", "<", ">")));
      }
      writer.print(".");
    }
    writer.print(method.getName());
    writer.print("Await(");
    List<ParamInfo> params = method.getParams();
    writer.print(params.stream()
      .limit(params.size() - 1)
      .map(p -> p.getName() + " : " + kotlinType(p.getType()))
      .collect(Collectors.joining(", ")));
    writer.print(")");
    ParamInfo lastParam = params.get(params.size() - 1);
    ParameterizedTypeInfo lastParamType = (ParameterizedTypeInfo) lastParam.getType();
    TypeInfo handlerArg = lastParamType.getArg(0);
    TypeInfo returnType;
    String awaitCallMethod;
    if (method.getKind() == MethodKind.HANDLER) {
      returnType = handlerArg;
      awaitCallMethod = "awaitEvent";
    } else {
      returnType = ((ParameterizedTypeInfo) handlerArg).getArg(0);
      awaitCallMethod = "awaitResult";
    }
    writer.print(" : ");
    if (returnType.equals(type)) {
      writer.print(vertxSimpleNameWrapper(returnType.getSimpleName(), hasStatic));
    } else {
      writer.print(kotlinType(returnType));
    }


    if (lastParam.isNullableCallback()) {
      writer.print("?");
    }
    writer.print(" {\n");

    writer.indent();
    writer.print("return ");
    writer.print(awaitCallMethod);
    writer.println("{");

    writer.indent();
    if (method.isStaticMethod()) {
      writer.print(vertxSimpleNameWrapper(type.getSimpleName(), hasStatic));
    } else {
      writer.print("this");
    }
    writer.print(".");
    writer.print(keyWordConverter(method.getName()));
    writer.print("(");
    writer.print(params.stream()
      .limit(params.size() - 1)
      .map(p -> keyWordConverter(p.getName()))
      .collect(Collectors.joining(", ")));
    if (params.size() > 1) {
      writer.print(", ");
    }
    if (returnType.getName().equals("java.lang.Void")) {
      if (method.getKind() == MethodKind.HANDLER) {
        writer.print("{ v -> it.handle(null) })");
      } else {
        writer.print("{ ar -> it.handle(ar.mapEmpty()) })");
      }
    } else {
      writer.print("it)\n");
    }
    writer.unindent();
    writer.print("}\n");
    writer.unindent();
    writer.print("}\n");
    writer.print("\n");
  }

  private String vertxSimpleNameWrapper(String simpleName, boolean hasStatic) {
    return hasStatic ? simpleName + "VertxAlias" : simpleName;
  }

  private void generateImport(ClassModel model, CodeWriter writer, Map<Boolean, List<MethodInfo>> methodGroupMap, boolean hasStatic) {
    Set<String> imports = new TreeSet<>();
    ClassTypeInfo type = model.getType();
    String simpleName = type.getSimpleName();
    imports.add(type.getPackageName() + "." + simpleName + (!hasStatic ? "" : (" as " + vertxSimpleNameWrapper(type.getSimpleName(), true))));

    methodGroupMap.values().stream().flatMap(List::stream).forEach(m -> {
      List<ParamInfo> params = m.getParams();
      if (params.size() > 0) {
        params.stream().limit(params.size() - 1).forEach(p -> addImport(type, imports, p.getType()));
        ParameterizedTypeInfo param = (ParameterizedTypeInfo) params.get(params.size() - 1).getType();
        TypeInfo arg = param.getArg(0);
        if (arg.getKind() == ClassKind.ASYNC_RESULT) {
          addImport(type, imports, ((ParameterizedTypeInfo) arg).getArg(0));
        } else {
          addImport(type, imports, arg);
        }
      }
      if (m.getKind() == MethodKind.HANDLER) {
        imports.add("io.vertx.kotlin.coroutines.awaitEvent");
      } else if (m.getKind() == MethodKind.FUTURE) {
        imports.add("io.vertx.kotlin.coroutines.awaitResult");
      }
    });
    for (String temp : imports) {
      writer.print("import ");
      writer.println(temp);
    }

  }

  private void addImport(ClassTypeInfo currentType, Set<String> imports, TypeInfo type) {
    ClassKind typeKind = type.getKind();
    if (type.isVariable() || typeKind.basic) {
      return;
    }
    if (!typeKind.collection &&
      typeKind != ClassKind.THROWABLE &&
      !type.equals(currentType) &&
      !type.getRaw().getPackageName().startsWith("java.lang")) {
      imports.add(type.getRaw().getPackageName() + "." + type.getRaw().getSimpleName());
    }
    if (type instanceof ParameterizedTypeInfo) {
      for (TypeInfo arg : ((ParameterizedTypeInfo) type).getArgs()) {
        addImport(currentType, imports, arg);
      }
    }
  }

  private String kotlinType(TypeInfo type) {
    if (type instanceof VoidTypeInfo) {
      return "Unit";
    } else if (type instanceof PrimitiveTypeInfo) {
      return Case.CAMEL.format(Collections.singletonList(type.getSimpleName()));
    } else if (type.getKind() == ClassKind.BOXED_PRIMITIVE) {
      switch (type.getSimpleName()) {
        case "Integer":
          return "Int";
        case "Character":
          return "Char";
        default:
          return type.getSimpleName();
      }
    } else if ("java.lang.Void".equals(type.getName())) {
      return "Unit";
    } else if ("java.lang.Object".equals(type.getName())) {
      return "Any";
    } else {
      if (type instanceof ParameterizedTypeInfo) {
        List<TypeInfo> args = ((ParameterizedTypeInfo) type).getArgs();
        return type.getRaw().getSimpleName() + args.stream().map(this::kotlinType).collect(Collectors.joining(",", "<", ">"));
      } else {
        return type.getSimpleName();
      }
    }
  }


  private boolean generateFilter(MethodInfo it) {
    MethodKind methodKind = it.getKind();
    return
      !it.isDeprecated() &&
        (it.isFluent() || it.getReturnType().isVoid()) && methodKind == MethodKind.FUTURE;
  }

  /**
   * The method name that is legal in java but not legal in kotlin needs to be processed
   */
  private String keyWordConverter(String word) {
    return keyWords.contains(word) ? "`" + word + "`" : word;
  }
}
