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
import io.swagger.model.TapiCommonAdminStatePac;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiOamOamProfileRef;
import io.swagger.model.TapiOamOamServiceEndPointRef;
import io.swagger.model.TapiOamPmCurrentData;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamOamJob
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamOamJob   {
  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  @JsonProperty("oam-profile")
  private TapiOamOamProfileRef oamProfile = null;

  @JsonProperty("pm-current-data")
  private List<TapiOamPmCurrentData> pmCurrentData = null;

  @JsonProperty("creation-time")
  private String creationTime = null;

  @JsonProperty("oam-service-end-point")
  private List<TapiOamOamServiceEndPointRef> oamServiceEndPoint = null;

  @JsonProperty("oam-job-type")
  private String oamJobType = null;

  public TapiOamOamJob operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * none
   * @return operationalState
   **/
  @JsonProperty("operational-state")
  @ApiModelProperty(value = "none")
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiOamOamJob lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * none
   * @return lifecycleState
   **/
  @JsonProperty("lifecycle-state")
  @ApiModelProperty(value = "none")
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiOamOamJob administrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * none
   * @return administrativeState
   **/
  @JsonProperty("administrative-state")
  @ApiModelProperty(value = "none")
  public TapiCommonAdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public TapiOamOamJob name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamOamJob addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiOamOamJob uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-&#39; + &#39;[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
   **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiOamOamJob schedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * none
   * @return schedule
   **/
  @JsonProperty("schedule")
  @ApiModelProperty(value = "none")
  public TapiCommonTimeRange getSchedule() {
    return schedule;
  }

  public void setSchedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
  }

  public TapiOamOamJob oamProfile(TapiOamOamProfileRef oamProfile) {
    this.oamProfile = oamProfile;
    return this;
  }

  /**
   * none
   * @return oamProfile
   **/
  @JsonProperty("oam-profile")
  @ApiModelProperty(value = "none")
  public TapiOamOamProfileRef getOamProfile() {
    return oamProfile;
  }

  public void setOamProfile(TapiOamOamProfileRef oamProfile) {
    this.oamProfile = oamProfile;
  }

  public TapiOamOamJob pmCurrentData(List<TapiOamPmCurrentData> pmCurrentData) {
    this.pmCurrentData = pmCurrentData;
    return this;
  }

  public TapiOamOamJob addPmCurrentDataItem(TapiOamPmCurrentData pmCurrentDataItem) {
    if (this.pmCurrentData == null) {
      this.pmCurrentData = new ArrayList<TapiOamPmCurrentData>();
    }
    this.pmCurrentData.add(pmCurrentDataItem);
    return this;
  }

  /**
   * Granularity period of the CurrentData identifies the specific CurrentData instance in the scope of this OamJob.                      For example, typically at least                      one 15min and                      one 24hr;                      optionally one additional configurable (&lt; 15min)
   * @return pmCurrentData
   **/
  @JsonProperty("pm-current-data")
  @ApiModelProperty(value = "Granularity period of the CurrentData identifies the specific CurrentData instance in the scope of this OamJob.                      For example, typically at least                      one 15min and                      one 24hr;                      optionally one additional configurable (< 15min)")
  public List<TapiOamPmCurrentData> getPmCurrentData() {
    return pmCurrentData;
  }

  public void setPmCurrentData(List<TapiOamPmCurrentData> pmCurrentData) {
    this.pmCurrentData = pmCurrentData;
  }

  public TapiOamOamJob creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * none
   * @return creationTime
   **/
  @JsonProperty("creation-time")
  @ApiModelProperty(value = "none")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TapiOamOamJob oamServiceEndPoint(List<TapiOamOamServiceEndPointRef> oamServiceEndPoint) {
    this.oamServiceEndPoint = oamServiceEndPoint;
    return this;
  }

  public TapiOamOamJob addOamServiceEndPointItem(TapiOamOamServiceEndPointRef oamServiceEndPointItem) {
    if (this.oamServiceEndPoint == null) {
      this.oamServiceEndPoint = new ArrayList<TapiOamOamServiceEndPointRef>();
    }
    this.oamServiceEndPoint.add(oamServiceEndPointItem);
    return this;
  }

  /**
   * none
   * @return oamServiceEndPoint
   **/
  @JsonProperty("oam-service-end-point")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamServiceEndPointRef> getOamServiceEndPoint() {
    return oamServiceEndPoint;
  }

  public void setOamServiceEndPoint(List<TapiOamOamServiceEndPointRef> oamServiceEndPoint) {
    this.oamServiceEndPoint = oamServiceEndPoint;
  }

  public TapiOamOamJob oamJobType(String oamJobType) {
    this.oamJobType = oamJobType;
    return this;
  }

  /**
   * none
   * @return oamJobType
   **/
  @JsonProperty("oam-job-type")
  @ApiModelProperty(value = "none")
  public String getOamJobType() {
    return oamJobType;
  }

  public void setOamJobType(String oamJobType) {
    this.oamJobType = oamJobType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamJob tapiOamOamJob = (TapiOamOamJob) o;
    return Objects.equals(this.operationalState, tapiOamOamJob.operationalState) &&
        Objects.equals(this.lifecycleState, tapiOamOamJob.lifecycleState) &&
        Objects.equals(this.administrativeState, tapiOamOamJob.administrativeState) &&
        Objects.equals(this.name, tapiOamOamJob.name) &&
        Objects.equals(this.uuid, tapiOamOamJob.uuid) &&
        Objects.equals(this.schedule, tapiOamOamJob.schedule) &&
        Objects.equals(this.oamProfile, tapiOamOamJob.oamProfile) &&
        Objects.equals(this.pmCurrentData, tapiOamOamJob.pmCurrentData) &&
        Objects.equals(this.creationTime, tapiOamOamJob.creationTime) &&
        Objects.equals(this.oamServiceEndPoint, tapiOamOamJob.oamServiceEndPoint) &&
        Objects.equals(this.oamJobType, tapiOamOamJob.oamJobType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalState, lifecycleState, administrativeState, name, uuid, schedule, oamProfile, pmCurrentData, creationTime, oamServiceEndPoint, oamJobType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamJob {\n");
    
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    oamProfile: ").append(toIndentedString(oamProfile)).append("\n");
    sb.append("    pmCurrentData: ").append(toIndentedString(pmCurrentData)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    oamServiceEndPoint: ").append(toIndentedString(oamServiceEndPoint)).append("\n");
    sb.append("    oamJobType: ").append(toIndentedString(oamJobType)).append("\n");
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
