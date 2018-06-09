package io.vertx.kotlin.coroutines

import io.vertx.codegen.*
import io.vertx.codegen.type.ClassKind
import io.vertx.codegen.type.ParameterizedTypeInfo
import io.vertx.codegen.type.PrimitiveTypeInfo
import io.vertx.codegen.type.TypeInfo
import io.vertx.core.Future
import java.io.PrintWriter
import java.io.StringWriter
import java.util.*

class KotlinCoroutineGenerator : Generator<ClassModel>() {
  init {
    this.name = "KotlinCoroutine"
    this.kinds = setOf(ClassModel::class.java)
  }

  override fun relativeFilename(model: ClassModel): String? {
    if (model.methods.filter(this::filterMethod).none()) {
      return null
    }
    return "kotlin/${model.module.translateQualifiedName(model.fqn, "kotlin").replace(".", "/")}.kt"
  }

  override fun render(model: ClassModel, index: Int, size: Int, session: MutableMap<String, Any>): String {
    val stringBuffer = StringWriter()
    val writer = PrintWriter(stringBuffer)
    writer.print("package ${model.module.translatePackageName("kotlin")}\n")
    writer.print("\n")
    val type = model.type
    writer.print("import ${type.packageName}.${type.simpleName}\n")
    generateImport(model, writer)
    writer.print("\n")

    model.methods.asSequence().filter(this::filterMethod).forEach { method ->
      //      writer.print("// ${method.kind}\n")
      writer.print("suspend fun ")
      if (method.typeParams.isNotEmpty()) {
        writer.print(method.typeParams.joinToString(",", "<", ">") {it.name})
      }
      writer.print("${type.simpleName}.${method.name}Await(${method.params.filterIndexed { index, _ -> index < method.params.size - 1 }.joinToString(", ") { "${it.name} : ${kotlinType(it.type)}" }})")
      val lastParam = method.params.last()
      @Suppress("CAST_NEVER_SUCCEEDS")
      val handlerArg = (lastParam.type as ParameterizedTypeInfo).args[0]
      val returnType : TypeInfo
      val awaitCallMethod : String
      if (method.kind == MethodKind.HANDLER) {
        returnType = handlerArg
        awaitCallMethod = "awaitEvent"
      } else {
        returnType = (handlerArg as ParameterizedTypeInfo).args[0]
        awaitCallMethod = "awaitResult"
      }
      writer.print(" : ")
      writer.print(kotlinType(returnType))
      writer.print("? {\n")

      writer.print("    return $awaitCallMethod{\n")

      writer.print("        this.${method.name}(")

      writer.print(method.params.filterIndexed { index, _ -> index < method.params.size - 1 }.joinToString(", ") {it.name})

      if (method.params.size > 1) {
        writer.print(", ")
      }
      writer.print("it)\n")

      writer.print("    }\n")
//      val returnType = method.returnType

      writer.print("}\n")
      writer.print("\n")
    }

    return stringBuffer.toString()
  }

  private fun generateImport(model: ClassModel, writer: PrintWriter) {
    val imports = TreeSet<String>()
    model.methods.asSequence().filter(this::filterMethod).forEach {
      val params = it.params
      if (params.size > 0) {
        for (i in 0 until params.size - 1) {
          addImport(model.type, imports, params[i].type)
        }
        val param = params[params.size - 1]
        @Suppress("CAST_NEVER_SUCCEEDS")
        //it must be Handler or Handler<AsyncResult>
        val arg = (param.type as ParameterizedTypeInfo).args[0]
        if (arg.kind == ClassKind.ASYNC_RESULT) {
          addImport(model.type, imports, (arg as ParameterizedTypeInfo).args[0])
        } else {
          addImport(model.type, imports, arg)
        }
      }
      if (!it.isFluent && it.returnType.name != "void") {
        addImport(model.type, imports, it.returnType)
      }
      if (it.kind == MethodKind.HANDLER) {
        imports.add("io.vertx.kotlin.coroutines.awaitEvent")
      } else if(it.kind == MethodKind.FUTURE){
        imports.add("io.vertx.kotlin.coroutines.awaitResult")
      }
    }
    for (i in imports) {
      writer.print("import $i\n")
    }
  }

  private fun addImport(currentType: TypeInfo, imports: MutableSet<String>, type: TypeInfo) {
    if (type.isVariable || type.kind.basic) {
      return
    }
    if (!type.kind.collection && type.kind != ClassKind.THROWABLE) {
      imports.add("${type.raw.packageName}.${type.raw.simpleName}")
    }
    if (type is ParameterizedTypeInfo) {
      for (arg in type.args) {
        addImport(currentType, imports, arg)
      }
    }
  }

  private fun kotlinType(type: TypeInfo): String {
    return when {
      type is PrimitiveTypeInfo -> Case.CAMEL.format(listOf(type.simpleName))
      type.kind == ClassKind.BOXED_PRIMITIVE -> when (type.simpleName) {
        "Integer" -> "Int"
        "Character" -> "Char"
        else -> type.simpleName
      }
      else -> {
        if (type is ParameterizedTypeInfo) {
          type.raw.simpleName + type.args.joinToString(", ", "<", ">") { kotlinType(it) }
        } else {
          type.simpleName
        }
      }
    }
  }

  private fun filterMethod(it: MethodInfo): Boolean = (it.isFluent || it.returnType.name == "void") && (it.kind == MethodKind.HANDLER || it.kind == MethodKind.FUTURE)
}
