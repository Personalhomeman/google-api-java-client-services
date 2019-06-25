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
 * An observed value of a metric.
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
public final class GoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends com.google.api.client.json.GenericJson {

  /**
   * The objective value at this training step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double objectiveValue;

  /**
   * The global training step for this metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long trainingStep;

  /**
   * The objective value at this training step.
   * @return value or {@code null} for none
   */
  public java.lang.Double getObjectiveValue() {
    return objectiveValue;
  }

  /**
   * The objective value at this training step.
   * @param objectiveValue objectiveValue or {@code null} for none
   */
  public GoogleCloudMlV1HyperparameterOutputHyperparameterMetric setObjectiveValue(java.lang.Double objectiveValue) {
    this.objectiveValue = objectiveValue;
    return this;
  }

  /**
   * The global training step for this metric.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrainingStep() {
    return trainingStep;
  }

  /**
   * The global training step for this metric.
   * @param trainingStep trainingStep or {@code null} for none
   */
  public GoogleCloudMlV1HyperparameterOutputHyperparameterMetric setTrainingStep(java.lang.Long trainingStep) {
    this.trainingStep = trainingStep;
    return this;
  }

  @Override
  public GoogleCloudMlV1HyperparameterOutputHyperparameterMetric set(String fieldName, Object value) {
    return (GoogleCloudMlV1HyperparameterOutputHyperparameterMetric) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1HyperparameterOutputHyperparameterMetric clone() {
    return (GoogleCloudMlV1HyperparameterOutputHyperparameterMetric) super.clone();
  }

}
