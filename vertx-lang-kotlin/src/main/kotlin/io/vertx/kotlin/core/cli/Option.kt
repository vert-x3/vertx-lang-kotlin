package io.vertx.kotlin.core.cli

import io.vertx.core.cli.Option

/**
 * A function providing a DSL for building [io.vertx.core.cli.Option] objects.
 *
 * Models command line options. Options are values passed to a command line interface using -x or --x. Supported
 * syntaxes depend on the parser.
 * <p/>
 * Short name is generally used with a single dash, while long name requires a double-dash.
 *
 * @param argName  Sets te arg name for this option.
 * @param choices  Sets the list of values accepted by this option. If the value set by the user does not match once of these values, a [io.vertx.core.cli.InvalidValueException] exception is thrown.
 * @param defaultValue  Sets the default value of this option
 * @param description  Sets te description of this option.
 * @param flag  Configures the current [io.vertx.core.cli.Option] to be a flag. It will be evaluated to <code>true</code> if it's found in the command line. If you need a flag that may receive a value, use, in this order: <code><pre>   option.setFlag(true).setSingleValued(true) </pre></code>
 * @param help  Sets whether or not this option is a "help" option
 * @param hidden  Sets whether or not this option should be hidden
 * @param longName  Sets the long name of this option.
 * @param multiValued  Sets whether or not this option can receive several values.
 * @param required  Sets whether or not this option is mandatory.
 * @param shortName  Sets the short name of this option.
 * @param singleValued  Sets whether or not this option can receive a value.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.cli.Option original] using Vert.x codegen.
 */
fun optionOf(
  argName: String? = null,
  choices: Iterable<String>? = null,
  defaultValue: String? = null,
  description: String? = null,
  flag: Boolean? = null,
  help: Boolean? = null,
  hidden: Boolean? = null,
  longName: String? = null,
  multiValued: Boolean? = null,
  required: Boolean? = null,
  shortName: String? = null,
  singleValued: Boolean? = null): Option = io.vertx.core.cli.Option().apply {

  if (argName != null) {
    this.setArgName(argName)
  }
  if (choices != null) {
    this.setChoices(choices.toSet())
  }
  if (defaultValue != null) {
    this.setDefaultValue(defaultValue)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (flag != null) {
    this.setFlag(flag)
  }
  if (help != null) {
    this.setHelp(help)
  }
  if (hidden != null) {
    this.setHidden(hidden)
  }
  if (longName != null) {
    this.setLongName(longName)
  }
  if (multiValued != null) {
    this.setMultiValued(multiValued)
  }
  if (required != null) {
    this.setRequired(required)
  }
  if (shortName != null) {
    this.setShortName(shortName)
  }
  if (singleValued != null) {
    this.setSingleValued(singleValued)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.cli.Option] objects.
 *
 * Models command line options. Options are values passed to a command line interface using -x or --x. Supported
 * syntaxes depend on the parser.
 * <p/>
 * Short name is generally used with a single dash, while long name requires a double-dash.
 *
 * @param argName  Sets te arg name for this option.
 * @param choices  Sets the list of values accepted by this option. If the value set by the user does not match once of these values, a [io.vertx.core.cli.InvalidValueException] exception is thrown.
 * @param defaultValue  Sets the default value of this option
 * @param description  Sets te description of this option.
 * @param flag  Configures the current [io.vertx.core.cli.Option] to be a flag. It will be evaluated to <code>true</code> if it's found in the command line. If you need a flag that may receive a value, use, in this order: <code><pre>   option.setFlag(true).setSingleValued(true) </pre></code>
 * @param help  Sets whether or not this option is a "help" option
 * @param hidden  Sets whether or not this option should be hidden
 * @param longName  Sets the long name of this option.
 * @param multiValued  Sets whether or not this option can receive several values.
 * @param required  Sets whether or not this option is mandatory.
 * @param shortName  Sets the short name of this option.
 * @param singleValued  Sets whether or not this option can receive a value.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.cli.Option original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("optionOf(argName, choices, defaultValue, description, flag, help, hidden, longName, multiValued, required, shortName, singleValued)")
)
fun Option(
  argName: String? = null,
  choices: Iterable<String>? = null,
  defaultValue: String? = null,
  description: String? = null,
  flag: Boolean? = null,
  help: Boolean? = null,
  hidden: Boolean? = null,
  longName: String? = null,
  multiValued: Boolean? = null,
  required: Boolean? = null,
  shortName: String? = null,
  singleValued: Boolean? = null): Option = io.vertx.core.cli.Option().apply {

  if (argName != null) {
    this.setArgName(argName)
  }
  if (choices != null) {
    this.setChoices(choices.toSet())
  }
  if (defaultValue != null) {
    this.setDefaultValue(defaultValue)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (flag != null) {
    this.setFlag(flag)
  }
  if (help != null) {
    this.setHelp(help)
  }
  if (hidden != null) {
    this.setHidden(hidden)
  }
  if (longName != null) {
    this.setLongName(longName)
  }
  if (multiValued != null) {
    this.setMultiValued(multiValued)
  }
  if (required != null) {
    this.setRequired(required)
  }
  if (shortName != null) {
    this.setShortName(shortName)
  }
  if (singleValued != null) {
    this.setSingleValued(singleValued)
  }
}

