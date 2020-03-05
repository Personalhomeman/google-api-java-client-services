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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * A request to replace all existing Access Levels in an Access Policy with the Access Levels
 * provided. This is done atomically.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplaceAccessLevelsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The desired Access Levels that should replace all existing Access Levels in the
   * Access Policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccessLevel> accessLevels;

  static {
    // hack to force ProGuard to consider AccessLevel used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AccessLevel.class);
  }

  /**
   * Optional. The etag for the version of the Access Policy that this replace operation is to be
   * performed on. If, at the time of replace, the etag for the Access Policy stored in Access
   * Context Manager is different from the specified etag, then the replace operation will not be
   * performed and the call will fail. This field is not required. If etag is not provided, the
   * operation will be performed as if a valid etag is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Required. The desired Access Levels that should replace all existing Access Levels in the
   * Access Policy.
   * @return value or {@code null} for none
   */
  public java.util.List<AccessLevel> getAccessLevels() {
    return accessLevels;
  }

  /**
   * Required. The desired Access Levels that should replace all existing Access Levels in the
   * Access Policy.
   * @param accessLevels accessLevels or {@code null} for none
   */
  public ReplaceAccessLevelsRequest setAccessLevels(java.util.List<AccessLevel> accessLevels) {
    this.accessLevels = accessLevels;
    return this;
  }

  /**
   * Optional. The etag for the version of the Access Policy that this replace operation is to be
   * performed on. If, at the time of replace, the etag for the Access Policy stored in Access
   * Context Manager is different from the specified etag, then the replace operation will not be
   * performed and the call will fail. This field is not required. If etag is not provided, the
   * operation will be performed as if a valid etag is provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. The etag for the version of the Access Policy that this replace operation is to be
   * performed on. If, at the time of replace, the etag for the Access Policy stored in Access
   * Context Manager is different from the specified etag, then the replace operation will not be
   * performed and the call will fail. This field is not required. If etag is not provided, the
   * operation will be performed as if a valid etag is provided.
   * @param etag etag or {@code null} for none
   */
  public ReplaceAccessLevelsRequest setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  @Override
  public ReplaceAccessLevelsRequest set(String fieldName, Object value) {
    return (ReplaceAccessLevelsRequest) super.set(fieldName, value);
  }

  @Override
  public ReplaceAccessLevelsRequest clone() {
    return (ReplaceAccessLevelsRequest) super.clone();
  }

}
