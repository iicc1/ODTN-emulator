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
import io.swagger.model.TapiOamOamServiceRef;
import javax.validation.constraints.*;

/**
 * TapiOamOamServiceEndPointRef
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamOamServiceEndPointRef   {
  @JsonProperty("oam-service-uuid")
  private String oamServiceUuid = null;

  @JsonProperty("oam-service-end-point-local-id")
  private String oamServiceEndPointLocalId = null;

  public TapiOamOamServiceEndPointRef oamServiceUuid(String oamServiceUuid) {
    this.oamServiceUuid = oamServiceUuid;
    return this;
  }

  /**
   * none
   * @return oamServiceUuid
   **/
  @JsonProperty("oam-service-uuid")
  @ApiModelProperty(value = "none")
  public String getOamServiceUuid() {
    return oamServiceUuid;
  }

  public void setOamServiceUuid(String oamServiceUuid) {
    this.oamServiceUuid = oamServiceUuid;
  }

  public TapiOamOamServiceEndPointRef oamServiceEndPointLocalId(String oamServiceEndPointLocalId) {
    this.oamServiceEndPointLocalId = oamServiceEndPointLocalId;
    return this;
  }

  /**
   * none
   * @return oamServiceEndPointLocalId
   **/
  @JsonProperty("oam-service-end-point-local-id")
  @ApiModelProperty(value = "none")
  public String getOamServiceEndPointLocalId() {
    return oamServiceEndPointLocalId;
  }

  public void setOamServiceEndPointLocalId(String oamServiceEndPointLocalId) {
    this.oamServiceEndPointLocalId = oamServiceEndPointLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamServiceEndPointRef tapiOamOamServiceEndPointRef = (TapiOamOamServiceEndPointRef) o;
    return Objects.equals(this.oamServiceUuid, tapiOamOamServiceEndPointRef.oamServiceUuid) &&
        Objects.equals(this.oamServiceEndPointLocalId, tapiOamOamServiceEndPointRef.oamServiceEndPointLocalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamServiceUuid, oamServiceEndPointLocalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamServiceEndPointRef {\n");
    
    sb.append("    oamServiceUuid: ").append(toIndentedString(oamServiceUuid)).append("\n");
    sb.append("    oamServiceEndPointLocalId: ").append(toIndentedString(oamServiceEndPointLocalId)).append("\n");
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

