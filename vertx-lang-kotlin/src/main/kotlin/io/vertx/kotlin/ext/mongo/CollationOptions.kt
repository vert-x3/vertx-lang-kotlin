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
package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.CollationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.CollationOptions] objects.
 *
 * Options used to configure collation options.
 *
 * @param backwards  Optional. Flag that determines whether strings with diacritics sort from back of the string, such as with some French dictionary ordering. <p> If true, compare from back to front. If false, compare from front to back. <p> The default value is false.
 * @param caseLevel  Optional. Flag that determines whether to include case comparison at strength level 1 or 2. <p> If true, include case comparison; i.e. <p> When used with strength:1, collation compares base characters and case. When used with strength:2, collation compares base characters, diacritics (and possible other secondary differences) and case. If false, do not include case comparison at level 1 or 2. The default is false.
 * @param locale  The ICU locale. See <a href="https://docs.mongodb.com/manual/reference/collation-locales-defaults/#std-label-collation-languages-locales">Supported Languages and Locales</a> for a list of supported locales. <p> The default value is <code>simple</code> which specifies simple binary comparison.
 * @param normalization  Optional. Flag that determines whether to check if text require normalization and to perform normalization. Generally, majority of text does not require this normalization processing. <p> If true, check if fully normalized and perform normalization to compare text. If false, does not check. <p> The default value is false.
 * @param numericOrdering  Optional. Flag that determines whether to compare numeric strings as numbers or as strings. <p> If true, compare as numbers; i.e. "10" is greater than "2". If false, compare as strings; i.e. "10" is less than "2". <p> Default is false.
 * @param strength  Optional. The level of comparison to perform. Corresponds to ICU Comparison Levels. Possible values are: <p> Value Description 1 Primary level of comparison. Collation performs comparisons of the base characters only, ignoring other differences such as diacritics and case. 2 Secondary level of comparison. Collation performs comparisons up to secondary differences, such as diacritics. That is, collation performs comparisons of base characters (primary differences) and diacritics (secondary differences). Differences between base characters takes precedence over secondary differences. 3 Tertiary level of comparison. Collation performs comparisons up to tertiary differences, such as case and letter variants. That is, collation performs comparisons of base characters (primary differences), diacritics (secondary differences), and case and variants (tertiary differences). Differences between base characters takes precedence over secondary differences, which takes precedence over tertiary differences. This is the default level. <p> 4 Quaternary Level. Limited for specific use case to consider punctuation when levels 1-3 ignore punctuation or for processing Japanese text. 5 Identical Level. Limited for specific use case of tie breaker.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.CollationOptions original] using Vert.x codegen.
 */
fun collationOptionsOf(
  backwards: Boolean? = null,
  caseLevel: Boolean? = null,
  locale: String? = null,
  normalization: Boolean? = null,
  numericOrdering: Boolean? = null,
  strength: Int? = null): CollationOptions = io.vertx.ext.mongo.CollationOptions().apply {

  if (backwards != null) {
    this.setBackwards(backwards)
  }
  if (caseLevel != null) {
    this.setCaseLevel(caseLevel)
  }
  if (locale != null) {
    this.setLocale(locale)
  }
  if (normalization != null) {
    this.setNormalization(normalization)
  }
  if (numericOrdering != null) {
    this.setNumericOrdering(numericOrdering)
  }
  if (strength != null) {
    this.setStrength(strength)
  }
}

