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

package com.google.api.services.ml.v1.model;

/**
 * Represents the metadata of the long-running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Machine Learning Engine. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time the operation was submitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time operation processing completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Indicates whether a request to cancel this operation has been made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isCancellationRequested;

  /**
   * The user labels, inherited from the model or the model version being operated on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Contains the name of the model associated with the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelName;

  /**
   * The operation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * Contains the project number associated with the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectNumber;

  /**
   * The time operation processing started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Contains the version associated with the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1Version version;

  /**
   * The time the operation was submitted.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the operation was submitted.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time operation processing completed.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time operation processing completed.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Indicates whether a request to cancel this operation has been made.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCancellationRequested() {
    return isCancellationRequested;
  }

  /**
   * Indicates whether a request to cancel this operation has been made.
   * @param isCancellationRequested isCancellationRequested or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setIsCancellationRequested(java.lang.Boolean isCancellationRequested) {
    this.isCancellationRequested = isCancellationRequested;
    return this;
  }

  /**
   * The user labels, inherited from the model or the model version being operated on.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The user labels, inherited from the model or the model version being operated on.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Contains the name of the model associated with the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelName() {
    return modelName;
  }

  /**
   * Contains the name of the model associated with the operation.
   * @param modelName modelName or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setModelName(java.lang.String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * The operation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * The operation type.
   * @param operationType operationType or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Contains the project number associated with the operation.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectNumber() {
    return projectNumber;
  }

  /**
   * Contains the project number associated with the operation.
   * @param projectNumber projectNumber or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setProjectNumber(java.lang.Long projectNumber) {
    this.projectNumber = projectNumber;
    return this;
  }

  /**
   * The time operation processing started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time operation processing started.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Contains the version associated with the operation.
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1Version getVersion() {
    return version;
  }

  /**
   * Contains the version associated with the operation.
   * @param version version or {@code null} for none
   */
  public GoogleCloudMlV1OperationMetadata setVersion(GoogleCloudMlV1Version version) {
    this.version = version;
    return this;
  }

  @Override
  public GoogleCloudMlV1OperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudMlV1OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1OperationMetadata clone() {
    return (GoogleCloudMlV1OperationMetadata) super.clone();
  }

}
