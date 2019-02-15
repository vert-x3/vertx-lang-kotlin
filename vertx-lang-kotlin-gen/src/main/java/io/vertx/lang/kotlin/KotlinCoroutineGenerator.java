package io.vertx.lang.kotlin;

import io.vertx.codegen.*;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.type.*;
import io.vertx.codegen.writer.CodeWriter;
import io.vertx.core.Handler;
import io.vertx.lang.kotlin.helper.KotlinCodeGenHelper;

import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KotlinCoroutineGenerator extends KotlinGeneratorBase<ClassModel> {

  private static final Set<String> keyWords = new HashSet<>(Arrays.asList("object", "fun", "in", "typealias", "var", "val"));
  private static final String methodSuffix = "Await";
  private static final Set<String> unnecessaryImports = new HashSet<>(Arrays.asList(Handler.class.getCanonicalName()));

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
    Stream<MethodInfo> methodStream = Stream.concat(
      model.getMethods().stream(),
      model.getAnyJavaTypeMethods().stream()
    );
    Map<Boolean, List<MethodInfo>> methodGroupMap = methodStream
      .filter(this::generateFilter)
      .collect(Collectors.groupingBy(MethodInfo::isStaticMethod));
    boolean hasStaticMethod = methodGroupMap.containsKey(true);

    writer.println("package " + type.getRaw().translatePackageName("kotlin"));
    writer.println();
    generateImport(model, writer, methodGroupMap, hasStaticMethod);
    writer.println();
    String className = vertxSimpleNameWrapper(type.getSimpleName(), hasStaticMethod);

    List<MethodInfo> methods = methodGroupMap.get(false);
    if (methods != null) {
      methods.forEach(method -> generateMethod(model, type, method, className, true, writer));
    }

    methods = methodGroupMap.get(true);
    if (methods != null) {
      writer.print("object ");
      writer.print(type.getSimpleName());
      writer.println(" {");

      writer.indent();
      methods.forEach(method -> generateMethod(model, type, method, className, false, writer));
      writer.unindent();
      writer.println("}");
    }
    return buffer.toString();
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
        ParameterizedTypeInfo lastParam = (ParameterizedTypeInfo) params.get(params.size() - 1).getType();
        TypeInfo arg = lastParam.getArg(0);
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
    imports.stream()
      .filter(temp -> !unnecessaryImports.contains(temp))
      .forEach(temp -> {
        writer.print("import ");
        writer.println(temp);
      });

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

  private String vertxSimpleNameWrapper(String simpleName, boolean hasStatic) {
    return hasStatic ? simpleName + "VertxAlias" : simpleName;
  }

  private void generateMethod(
    ClassModel model,
    ClassTypeInfo type,
    MethodInfo method,
    String className,
    Boolean isExtensionMethod,
    CodeWriter writer
  ) {
    List<ParamInfo> params = method.getParams();
    ParamInfo lastParam = params.get(params.size() - 1);
    TypeInfo returnType = getAsyncTypeArgument(method, lastParam);
    String returnTypeAsString = getReturnTypeAsString(returnType, lastParam.isNullableCallback(), type, className);
    generateDoc(model, method, returnTypeAsString, writer);

    String methodName;
    if (isExtensionMethod) {
      StringBuilder methodNameBuilder = new StringBuilder().append(className);
      if (!type.getParams().isEmpty()) {
        methodNameBuilder.append(
          type.getParams()
            .stream()
            .map(TypeParamInfo::getName)
            .collect(Collectors.joining(",", "<", ">"))
        );
      }
      methodNameBuilder.append(".");
      methodNameBuilder.append(method.getName());
      methodName = methodNameBuilder.toString();
    } else {
      methodName = method.getName();
    }
    generateMethodSignature(
      type,
      method,
      className,
      methodName,
      returnType,
      lastParam.isNullableCallback(),
      writer
    );

    String objectName;
    if (isExtensionMethod) {
      objectName = "this";
    } else {
      objectName = className;
    }
    generateFunctionBody(method, objectName, returnType, writer);
  }

  private TypeInfo getAsyncTypeArgument(MethodInfo method, ParamInfo lastParam) {
    ParameterizedTypeInfo lastParamType = (ParameterizedTypeInfo) lastParam.getType();
    TypeInfo handlerArg = lastParamType.getArg(0);
    TypeInfo returnType;
    if (method.getKind() == MethodKind.HANDLER) {
      returnType = handlerArg;
    } else {
      returnType = ((ParameterizedTypeInfo) handlerArg).getArg(0);
    }
    return returnType;
  }

  private void generateDoc(
    ClassModel model,
    MethodInfo method,
    String returnType,
    CodeWriter writer
  ) {
    Doc doc = method.getDoc();
    if (doc != null) {
      writer.println("/**");
      writer.println(" * Suspending version of method [" + model.getType().getName() + "." + method.getName() + "]");
      writer.println(" *");

      List<ParamInfo> parameters = method.getParams();
      parameters.stream().limit(parameters.size() - 1).forEach(p -> {
        writer.print(" * @param " + p.getName() + " ");
        if (p.getDescription() != null) {
          String docInfo = Token.toHtml(p.getDescription().getTokens(), "", KotlinCodeGenHelper::renderLinkToHtml, "");
          writer.print(docInfo);
        }
        writer.println();
      });
      if (!returnType.equals("Unit")) {
        writer.println(" * @return [" + returnType + "]");
      }
      writer.println(" *");
      writer.println(" * NOTE: This function has been automatically generated from [" + model.getType().getName() + "] using Vert.x codegen.");
      writer.println(" */");
    }
  }

  private void generateMethodSignature(
    ClassTypeInfo type,
    MethodInfo method,
    String className,
    String methodName,
    TypeInfo returnType,
    Boolean isNullable,
    CodeWriter writer
  ) {
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
    writer.print(methodName);
    writer.print(methodSuffix);
    writer.print("(");
    List<ParamInfo> params = method.getParams();
    writer.print(params.stream()
      .limit(params.size() - 1)
      .map(p -> p.getName() + ": " + kotlinType(p.getType()))
      .collect(Collectors.joining(", ")));
    writer.print(")");
    writer.print(": ");
    writer.print(getReturnTypeAsString(returnType, isNullable, type, className));
  }

  private String getReturnTypeAsString(TypeInfo returnType, Boolean isNullable, ClassTypeInfo type, String className) {
    String returnTypeAsString;
    if (returnType.equals(type)) {
      returnTypeAsString = className;
    } else {
      returnTypeAsString = kotlinType(returnType);
    }
    if (isNullable) {
      returnTypeAsString += "?";
    }
    return returnTypeAsString;
  }

  private void generateFunctionBody(MethodInfo method, String objectName, TypeInfo returnType, CodeWriter writer) {
    List<ParamInfo> params = method.getParams();
    writer.println(" {");

    writer.indent();
    writer.print("return ");
    String awaitCallMethod;
    if (method.getKind() == MethodKind.HANDLER) {
      awaitCallMethod = "awaitEvent";
    } else {
      awaitCallMethod = "awaitResult";
    }
    writer.print(awaitCallMethod);
    writer.println(" {");

    writer.indent();
    writer.print(objectName);
    writer.print(".");
    writer.print(keyWordConverter(method.getName()));
    boolean methodHasMoreThanOneParameter = params.size() > 1;
    if (methodHasMoreThanOneParameter) {
      writer.print("(");
      writer.print(params.stream()
        .limit(params.size() - 1)
        .map(p -> keyWordConverter(p.getName()))
        .collect(Collectors.joining(", ")));
    }
    if (returnType.getName().equals("java.lang.Void")) {
      if (methodHasMoreThanOneParameter) {
        writer.print(")");
      }
      if (method.getKind() == MethodKind.HANDLER) {
        writer.println(" { v -> it.handle(null) }");
      } else {
        writer.println(" { ar -> it.handle(ar.mapEmpty()) }");
      }
    } else {
      boolean hasLambdaParam = params.stream().limit(params.size() - 1).anyMatch(p -> {
        ClassKind kind = p.getType().getKind();
        return kind == ClassKind.HANDLER || kind == ClassKind.FUNCTION;
      });
      if (methodHasMoreThanOneParameter) {
        writer.print(", ");
      } else {
        writer.print("(");
      }
      if (hasLambdaParam) {
        writer.println("it::handle)");
      } else {
        writer.println("it)");
      }
    }
    writer.unindent();
    writer.println("}");
    writer.unindent();
    writer.println("}");
    writer.println();
  }

  private String kotlinType(TypeInfo type) {
    ClassKind kind = type.getKind();
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
        if (kind == ClassKind.HANDLER || kind == ClassKind.FUNCTION) {
          List<String> args = ((ParameterizedTypeInfo) type).getArgs().stream().map(this::kotlinType).collect(Collectors.toList());
          return "(" + args.get(0) + ") -> " + (args.size() == 1 ? "Unit" : args.get(1));
        } else {
          List<TypeInfo> args = ((ParameterizedTypeInfo) type).getArgs();
          return type.getRaw().getSimpleName() + args.stream().map(this::kotlinType).collect(Collectors.joining(",", "<", ">"));
        }
      } else {
        return type.getSimpleName();
      }
    }
  }


  private boolean generateFilter(MethodInfo it) {
    MethodKind methodKind = it.getKind();
    return !it.isDeprecated() && (it.isFluent() || it.getReturnType().isVoid()) && methodKind == MethodKind.FUTURE;
  }

  /**
   * The method name that is legal in java but not legal in kotlin needs to be processed
   */
  private String keyWordConverter(String word) {
    return keyWords.contains(word) ? "`" + word + "`" : word;
  }
}
