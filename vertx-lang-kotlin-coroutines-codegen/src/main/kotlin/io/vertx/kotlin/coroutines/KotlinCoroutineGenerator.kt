package io.vertx.kotlin.coroutines

import com.squareup.kotlinpoet.*
import io.vertx.codegen.*
import io.vertx.codegen.type.ClassKind
import io.vertx.codegen.type.ParameterizedTypeInfo
import io.vertx.codegen.type.TypeInfo
import io.vertx.codegen.type.TypeVariableInfo

class KotlinCoroutineGenerator : Generator<ClassModel>() {

  init {
    this.name = "Kotlin-Coroutines"
    this.kinds = setOf("class")
  }

  override fun relativeFilename(model: ClassModel): String? {
    return if (model.methods.none { it.isFutureMethod() }) null
    else "kotlin/${qualifiedName(model).replace(".", "/")}Extensions.kt"
  }

  private val emptyDeprecated = AnnotationSpec.builder(Deprecated::class).addMember("\"\"").build()

  private fun TypeName.checkNull(type: TypeInfo): TypeName =
    if (type.isNullable) this.asNullable() else this.asNonNullable()

  private fun fixParameterizedType(t: ParameterizedTypeInfo): ParameterizedTypeName {
    val typeName = when (t.raw.name) {
      "java.util.Iterator" -> "kotlin.collections.MutableIterator"
      "java.util.Iterable" -> "kotlin.collections.MutableIterable"
      "java.util.Collection" -> "kotlin.collections.MutableCollection"
      "java.util.Set" -> "kotlin.collections.MutableSet"
      "java.util.List" -> "kotlin.collections.MutableList"
      "java.util.ListIterator" -> "kotlin.collections.MutableListIterator"
      "java.util.Map" -> "kotlin.collections.MutableMap"
      "java.util.Map.Entry" -> "kotlin.collections.MutableMap.MutableEntry"
      else -> t.raw.name
    }

    return ParameterizedTypeName.get(
      rawType = ClassName.bestGuess(typeName),
      typeArguments = *(t.args.map { kotlinType(it).checkNull(it) }.toTypedArray())
    )
  }

  private fun typeParamDef(t: TypeParamInfo) = TypeVariableName(
    name = t.name,
    bounds = *arrayOf(Any::class)
  )

  private fun kotlinType(t: TypeInfo): TypeName = when {
    t.isVariable -> TypeVariableName(t.name)
    t.kind == ClassKind.VOID -> UNIT
    t.kind == ClassKind.OBJECT -> ANY
    t.kind == ClassKind.THROWABLE -> Throwable::class.asTypeName()
    t.kind == ClassKind.STRING -> String::class.asTypeName()
    t.kind in setOf(ClassKind.BOXED_PRIMITIVE, ClassKind.PRIMITIVE) -> when (t.name) {
      "java.lang.Boolean", "boolean" -> BOOLEAN
      "java.lang.Byte", "byte" -> BYTE
      "java.lang.Short", "short" -> SHORT
      "java.lang.Integer", "int" -> INT
      "java.lang.Long", "long" -> LONG
      "java.lang.Character", "char" -> CHAR
      "java.lang.Float", "float" -> FLOAT
      "java.lang.Double", "double" -> DOUBLE
      else -> throw IllegalArgumentException()
    }
    t is ParameterizedTypeInfo -> fixParameterizedType(t)
    else -> ClassName.bestGuess(t.name)
  }.let { if (it == UNIT) UNIT else it.checkNull(t) }

  private fun parameter(p: ParamInfo) = ParameterSpec.builder(p.name, kotlinType(p.type)).build()

  private fun generateCoroutineMethod(
    model: ClassModel, method: MethodInfo, typeVarInClass: List<TypeVariableName>,
    isStatic: Boolean
  ): FunSpec? {
    if (!method.isFutureMethod()) return null

    val handler = method.params.last()
    val asyncResult = (handler.type as ParameterizedTypeInfo).getArg(0) as ParameterizedTypeInfo
    val returnType = kotlinType(asyncResult.getArg(0))

    val realParams = method.params.dropLast(1)
    val isShadowed = !isStatic && checkShadowed(model, realParams, method.name)
    val newName = method.name + if (isShadowed) "Suspending" else ""

    val paramsInWrappedFunctionCall = (realParams.map { it.name } + "it").joinToString(", ")

    return FunSpec.builder(newName).apply {
      addModifiers(KModifier.SUSPEND)
      if (method.isDeprecated) addAnnotation(emptyDeprecated)

      addTypeVariables(typeVarInClass)
      addTypeVariables(method.typeParams.map(::typeParamDef))

      val interfaceWithParam = if (model.typeParams.isEmpty()) model.type else {
        val typeParams = model.typeParams.map { TypeVariableInfo(it, false, it.name) }
        ParameterizedTypeInfo(model.type, false, typeParams)
      }

      val receiver = if (isStatic) model.ifaceSimpleName else {
        receiver(kotlinType(interfaceWithParam))
        "this"
      }

      addParameters(realParams.map(::parameter))
      if (returnType == UNIT) {
        // this weird space and the 1 space indent below are workaround to KotlinPoet's indent rules
        addStatement(" awaitResult<Void?> { %L.%N(%L) }", receiver, method.name, paramsInWrappedFunctionCall)
      } else {
        addStatement(" return awaitResult { %L.%N(%L) }", receiver, method.name, paramsInWrappedFunctionCall)
        returns(returnType)
      }

    }.build()
  }

  override fun render(model: ClassModel, index: Int, size: Int, session: MutableMap<String, Any>): String {
    val typeVarInClass = model.typeParams.map(::typeParamDef)

    val (staticMethods, instanceMethods) = model.methods.partition { it.isStaticMethod }

    val extnensionFunctions = instanceMethods.mapNotNull {
      generateCoroutineMethod(model, it, typeVarInClass, isStatic = false)
    }

    val functionsInObj = staticMethods.mapNotNull {
      generateCoroutineMethod(model, it, typeVarInClass, isStatic = true)
    }

    val obj = functionsInObj.takeIf { it.isNotEmpty() }?.let { methods ->
      TypeSpec.objectBuilder(model.ifaceSimpleName + "Extensions").apply {
        methods.forEach { addFunction(it) }
      }.build()
    }

    val packageName = qualifiedName(model).dropLast(model.ifaceSimpleName.length + 1)
    val fileSpec = FileSpec.builder(packageName, "").apply {
      indent(" ")
      addStaticImport("io.vertx.kotlin.coroutines", "awaitResult")
      addStaticImport(model.ifacePackageName, model.ifaceSimpleName)
      extnensionFunctions.forEach { addFunction(it) }
      if (obj != null) addType(obj)
    }.build()

    val s = StringBuilder()
    fileSpec.writeTo(s)
    return s.toString()
  }

  private fun MethodInfo.isFutureMethod() = this.kind == MethodKind.FUTURE
  private fun qualifiedName(model: ClassModel) = model.module.translateQualifiedName(model.fqn, "kotlin")

  private fun checkShadowed(model: ClassModel, params: List<ParamInfo>, name: String): Boolean = model.methods.any {
    it.name == name && it.params.map { it.type } == params.map { it.type }
  }
}
