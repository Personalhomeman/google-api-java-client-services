/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dlp.v2.model;

/**
 * Configuration description of the scanning process. When used with redactContent only info_types
 * and min_likelihood are currently used.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2InspectConfig extends com.google.api.client.json.GenericJson {

  /**
   * List of options defining data content to scan. If empty, text, images, and other content will
   * be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contentOptions;

  /**
   * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-
   * infotypes to learn more.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2CustomInfoType> customInfoTypes;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2CustomInfoType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2CustomInfoType.class);
  }

  /**
   * When true, excludes type information of the findings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean excludeInfoTypes;

  /**
   * When true, a contextual quote from the data that triggered a finding is included in the
   * response; see Finding.quote.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeQuote;

  /**
   * Restricts what info_types to look for. The values must correspond to InfoType values returned
   * by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically
   * choose what detectors to run. By default this may be all types, but may change over time as
   * detectors are updated.
   *
   * If you need precise control and predictability as to what detectors are run you should specify
   * specific InfoTypes listed in the reference, otherwise a default list will be used, which may
   * change over time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2InfoType> infoTypes;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2InfoType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2InfoType.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FindingLimits limits;

  /**
   * Only returns findings equal or above this threshold. The default is POSSIBLE. See
   * https://cloud.google.com/dlp/docs/likelihood to learn more.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minLikelihood;

  /**
   * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the
   * set are executed in the end, other rules are executed in the order they are specified for each
   * info type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2InspectionRuleSet> ruleSet;

  /**
   * List of options defining data content to scan. If empty, text, images, and other content will
   * be included.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContentOptions() {
    return contentOptions;
  }

  /**
   * List of options defining data content to scan. If empty, text, images, and other content will
   * be included.
   * @param contentOptions contentOptions or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setContentOptions(java.util.List<java.lang.String> contentOptions) {
    this.contentOptions = contentOptions;
    return this;
  }

  /**
   * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-
   * infotypes to learn more.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2CustomInfoType> getCustomInfoTypes() {
    return customInfoTypes;
  }

  /**
   * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-
   * infotypes to learn more.
   * @param customInfoTypes customInfoTypes or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setCustomInfoTypes(java.util.List<GooglePrivacyDlpV2CustomInfoType> customInfoTypes) {
    this.customInfoTypes = customInfoTypes;
    return this;
  }

  /**
   * When true, excludes type information of the findings.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExcludeInfoTypes() {
    return excludeInfoTypes;
  }

  /**
   * When true, excludes type information of the findings.
   * @param excludeInfoTypes excludeInfoTypes or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setExcludeInfoTypes(java.lang.Boolean excludeInfoTypes) {
    this.excludeInfoTypes = excludeInfoTypes;
    return this;
  }

  /**
   * When true, a contextual quote from the data that triggered a finding is included in the
   * response; see Finding.quote.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeQuote() {
    return includeQuote;
  }

  /**
   * When true, a contextual quote from the data that triggered a finding is included in the
   * response; see Finding.quote.
   * @param includeQuote includeQuote or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setIncludeQuote(java.lang.Boolean includeQuote) {
    this.includeQuote = includeQuote;
    return this;
  }

  /**
   * Restricts what info_types to look for. The values must correspond to InfoType values returned
   * by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically
   * choose what detectors to run. By default this may be all types, but may change over time as
   * detectors are updated.
   *
   * If you need precise control and predictability as to what detectors are run you should specify
   * specific InfoTypes listed in the reference, otherwise a default list will be used, which may
   * change over time.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2InfoType> getInfoTypes() {
    return infoTypes;
  }

  /**
   * Restricts what info_types to look for. The values must correspond to InfoType values returned
   * by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically
   * choose what detectors to run. By default this may be all types, but may change over time as
   * detectors are updated.
   *
   * If you need precise control and predictability as to what detectors are run you should specify
   * specific InfoTypes listed in the reference, otherwise a default list will be used, which may
   * change over time.
   * @param infoTypes infoTypes or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setInfoTypes(java.util.List<GooglePrivacyDlpV2InfoType> infoTypes) {
    this.infoTypes = infoTypes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FindingLimits getLimits() {
    return limits;
  }

  /**
   * @param limits limits or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setLimits(GooglePrivacyDlpV2FindingLimits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Only returns findings equal or above this threshold. The default is POSSIBLE. See
   * https://cloud.google.com/dlp/docs/likelihood to learn more.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinLikelihood() {
    return minLikelihood;
  }

  /**
   * Only returns findings equal or above this threshold. The default is POSSIBLE. See
   * https://cloud.google.com/dlp/docs/likelihood to learn more.
   * @param minLikelihood minLikelihood or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setMinLikelihood(java.lang.String minLikelihood) {
    this.minLikelihood = minLikelihood;
    return this;
  }

  /**
   * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the
   * set are executed in the end, other rules are executed in the order they are specified for each
   * info type.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2InspectionRuleSet> getRuleSet() {
    return ruleSet;
  }

  /**
   * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the
   * set are executed in the end, other rules are executed in the order they are specified for each
   * info type.
   * @param ruleSet ruleSet or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig setRuleSet(java.util.List<GooglePrivacyDlpV2InspectionRuleSet> ruleSet) {
    this.ruleSet = ruleSet;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InspectConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InspectConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InspectConfig clone() {
    return (GooglePrivacyDlpV2InspectConfig) super.clone();
  }

}
