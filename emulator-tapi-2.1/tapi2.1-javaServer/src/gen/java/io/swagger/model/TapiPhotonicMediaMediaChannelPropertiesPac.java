/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaPowerPropertiesPac;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelPropertiesPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaMediaChannelPropertiesPac   {
  @JsonProperty("occupied-spectrum")
  private TapiPhotonicMediaSpectrumBand occupiedSpectrum = null;

  @JsonProperty("measured-power-egress")
  private TapiPhotonicMediaPowerPropertiesPac measuredPowerEgress = null;

  @JsonProperty("measured-power-ingress")
  private TapiPhotonicMediaPowerPropertiesPac measuredPowerIngress = null;

  public TapiPhotonicMediaMediaChannelPropertiesPac occupiedSpectrum(TapiPhotonicMediaSpectrumBand occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
    return this;
  }

  /**
   * none
   * @return occupiedSpectrum
   **/
  @JsonProperty("occupied-spectrum")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaSpectrumBand getOccupiedSpectrum() {
    return occupiedSpectrum;
  }

  public void setOccupiedSpectrum(TapiPhotonicMediaSpectrumBand occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
  }

  public TapiPhotonicMediaMediaChannelPropertiesPac measuredPowerEgress(TapiPhotonicMediaPowerPropertiesPac measuredPowerEgress) {
    this.measuredPowerEgress = measuredPowerEgress;
    return this;
  }

  /**
   * none
   * @return measuredPowerEgress
   **/
  @JsonProperty("measured-power-egress")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaPowerPropertiesPac getMeasuredPowerEgress() {
    return measuredPowerEgress;
  }

  public void setMeasuredPowerEgress(TapiPhotonicMediaPowerPropertiesPac measuredPowerEgress) {
    this.measuredPowerEgress = measuredPowerEgress;
  }

  public TapiPhotonicMediaMediaChannelPropertiesPac measuredPowerIngress(TapiPhotonicMediaPowerPropertiesPac measuredPowerIngress) {
    this.measuredPowerIngress = measuredPowerIngress;
    return this;
  }

  /**
   * none
   * @return measuredPowerIngress
   **/
  @JsonProperty("measured-power-ingress")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaPowerPropertiesPac getMeasuredPowerIngress() {
    return measuredPowerIngress;
  }

  public void setMeasuredPowerIngress(TapiPhotonicMediaPowerPropertiesPac measuredPowerIngress) {
    this.measuredPowerIngress = measuredPowerIngress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelPropertiesPac tapiPhotonicMediaMediaChannelPropertiesPac = (TapiPhotonicMediaMediaChannelPropertiesPac) o;
    return Objects.equals(this.occupiedSpectrum, tapiPhotonicMediaMediaChannelPropertiesPac.occupiedSpectrum) &&
        Objects.equals(this.measuredPowerEgress, tapiPhotonicMediaMediaChannelPropertiesPac.measuredPowerEgress) &&
        Objects.equals(this.measuredPowerIngress, tapiPhotonicMediaMediaChannelPropertiesPac.measuredPowerIngress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occupiedSpectrum, measuredPowerEgress, measuredPowerIngress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelPropertiesPac {\n");
    
    sb.append("    occupiedSpectrum: ").append(toIndentedString(occupiedSpectrum)).append("\n");
    sb.append("    measuredPowerEgress: ").append(toIndentedString(measuredPowerEgress)).append("\n");
    sb.append("    measuredPowerIngress: ").append(toIndentedString(measuredPowerIngress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
