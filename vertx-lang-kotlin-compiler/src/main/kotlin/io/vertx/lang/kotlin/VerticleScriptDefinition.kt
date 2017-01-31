package io.vertx.lang.kotlin

import com.intellij.psi.PsiFile
import com.intellij.util.PathUtil
import org.jetbrains.kotlin.descriptors.ScriptDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.parsing.KotlinParserDefinition
import org.jetbrains.kotlin.psi.KtScript
import org.jetbrains.kotlin.resolve.descriptorUtil.module
import org.jetbrains.kotlin.script.KotlinScriptDefinition
import org.jetbrains.kotlin.script.ScriptNameUtil
import org.jetbrains.kotlin.script.ScriptParameter
import org.jetbrains.kotlin.serialization.deserialization.findClassAcrossModuleDependencies

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
object VerticleScriptDefinition : KotlinScriptDefinition {

  private val VERTX_NAME = Name.identifier("vertx")
  private val CONTEXT_NAME = Name.identifier("context")

  override fun isScript(file: PsiFile): Boolean {
    return PathUtil.getFileExtension(file.name) == KotlinParserDefinition.STD_SCRIPT_SUFFIX
  }

  override fun getScriptParameters(scriptDescriptor: ScriptDescriptor): List<ScriptParameter> {
    val vertxClassDesc = scriptDescriptor.module.findClassAcrossModuleDependencies(ClassId.topLevel(FqName.fromSegments(listOf("io", "vertx", "core", "Vertx"))))
        ?: throw IllegalArgumentException();
    val contextClassDesc = scriptDescriptor.module.findClassAcrossModuleDependencies(ClassId.topLevel(FqName.fromSegments(listOf("io", "vertx", "core", "Context"))))
        ?: throw IllegalArgumentException();
    return listOf(ScriptParameter(VERTX_NAME, vertxClassDesc.defaultType), ScriptParameter(CONTEXT_NAME, contextClassDesc.defaultType))
  }

  override fun getScriptName(script: KtScript): Name {
    return ScriptNameUtil.fileNameWithExtensionStripped(script, KotlinParserDefinition.STD_SCRIPT_EXT)
  }


}