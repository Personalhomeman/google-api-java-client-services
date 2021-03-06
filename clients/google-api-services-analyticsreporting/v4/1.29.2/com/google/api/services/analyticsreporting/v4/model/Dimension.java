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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * [Dimensions](https://support.google.com/analytics/answer/1033861) are attributes of your data.
 * For example, the dimension `ga:city` indicates the city, for example, "Paris" or "New York", from
 * which a session originates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dimension extends com.google.api.client.json.GenericJson {

  /**
   * If non-empty, we place dimension values into buckets after string to int64. Dimension values
   * that are not the string representation of an integral value will be converted to zero.  The
   * bucket values have to be in increasing order.  Each bucket is closed on the lower end, and open
   * on the upper end. The "first" bucket includes all values less than the first boundary, the
   * "last" bucket includes all values up to infinity. Dimension values that fall in a bucket get
   * transformed to a new dimension value. For example, if one gives a list of "0, 1, 3, 4, 7", then
   * we return the following buckets:
   *
   * - bucket #1: values < 0, dimension value "<0" - bucket #2: values in [0,1), dimension value "0"
   * - bucket #3: values in [1,3), dimension value "1-2" - bucket #4: values in [3,4), dimension
   * value "3" - bucket #5: values in [4,7), dimension value "4-6" - bucket #6: values >= 7,
   * dimension value "7+"
   *
   * NOTE: If you are applying histogram mutation on any dimension, and using that dimension in
   * sort, you will want to use the sort type `HISTOGRAM_BUCKET` for that purpose. Without that the
   * dimension values will be sorted according to dictionary (lexicographic) order. For example the
   * ascending dictionary order is:
   *
   *    "<50", "1001+", "121-1000", "50-120"
   *
   * And the ascending `HISTOGRAM_BUCKET` order is:
   *
   *    "<50", "50-120", "121-1000", "1001+"
   *
   * The client has to explicitly request `"orderType": "HISTOGRAM_BUCKET"` for a histogram-mutated
   * dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> histogramBuckets;

  /**
   * Name of the dimension to fetch, for example `ga:browser`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If non-empty, we place dimension values into buckets after string to int64. Dimension values
   * that are not the string representation of an integral value will be converted to zero.  The
   * bucket values have to be in increasing order.  Each bucket is closed on the lower end, and open
   * on the upper end. The "first" bucket includes all values less than the first boundary, the
   * "last" bucket includes all values up to infinity. Dimension values that fall in a bucket get
   * transformed to a new dimension value. For example, if one gives a list of "0, 1, 3, 4, 7", then
   * we return the following buckets:
   *
   * - bucket #1: values < 0, dimension value "<0" - bucket #2: values in [0,1), dimension value "0"
   * - bucket #3: values in [1,3), dimension value "1-2" - bucket #4: values in [3,4), dimension
   * value "3" - bucket #5: values in [4,7), dimension value "4-6" - bucket #6: values >= 7,
   * dimension value "7+"
   *
   * NOTE: If you are applying histogram mutation on any dimension, and using that dimension in
   * sort, you will want to use the sort type `HISTOGRAM_BUCKET` for that purpose. Without that the
   * dimension values will be sorted according to dictionary (lexicographic) order. For example the
   * ascending dictionary order is:
   *
   *    "<50", "1001+", "121-1000", "50-120"
   *
   * And the ascending `HISTOGRAM_BUCKET` order is:
   *
   *    "<50", "50-120", "121-1000", "1001+"
   *
   * The client has to explicitly request `"orderType": "HISTOGRAM_BUCKET"` for a histogram-mutated
   * dimension.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getHistogramBuckets() {
    return histogramBuckets;
  }

  /**
   * If non-empty, we place dimension values into buckets after string to int64. Dimension values
   * that are not the string representation of an integral value will be converted to zero.  The
   * bucket values have to be in increasing order.  Each bucket is closed on the lower end, and open
   * on the upper end. The "first" bucket includes all values less than the first boundary, the
   * "last" bucket includes all values up to infinity. Dimension values that fall in a bucket get
   * transformed to a new dimension value. For example, if one gives a list of "0, 1, 3, 4, 7", then
   * we return the following buckets:
   *
   * - bucket #1: values < 0, dimension value "<0" - bucket #2: values in [0,1), dimension value "0"
   * - bucket #3: values in [1,3), dimension value "1-2" - bucket #4: values in [3,4), dimension
   * value "3" - bucket #5: values in [4,7), dimension value "4-6" - bucket #6: values >= 7,
   * dimension value "7+"
   *
   * NOTE: If you are applying histogram mutation on any dimension, and using that dimension in
   * sort, you will want to use the sort type `HISTOGRAM_BUCKET` for that purpose. Without that the
   * dimension values will be sorted according to dictionary (lexicographic) order. For example the
   * ascending dictionary order is:
   *
   *    "<50", "1001+", "121-1000", "50-120"
   *
   * And the ascending `HISTOGRAM_BUCKET` order is:
   *
   *    "<50", "50-120", "121-1000", "1001+"
   *
   * The client has to explicitly request `"orderType": "HISTOGRAM_BUCKET"` for a histogram-mutated
   * dimension.
   * @param histogramBuckets histogramBuckets or {@code null} for none
   */
  public Dimension setHistogramBuckets(java.util.List<java.lang.Long> histogramBuckets) {
    this.histogramBuckets = histogramBuckets;
    return this;
  }

  /**
   * Name of the dimension to fetch, for example `ga:browser`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the dimension to fetch, for example `ga:browser`.
   * @param name name or {@code null} for none
   */
  public Dimension setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Dimension set(String fieldName, Object value) {
    return (Dimension) super.set(fieldName, value);
  }

  @Override
  public Dimension clone() {
    return (Dimension) super.clone();
  }

}
