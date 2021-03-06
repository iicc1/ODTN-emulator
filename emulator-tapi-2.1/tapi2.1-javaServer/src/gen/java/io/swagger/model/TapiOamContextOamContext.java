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
import io.swagger.model.TapiOamOamService;
import io.swagger.model.TapiOamOamcontextMeg;
import io.swagger.model.TapiOamOamcontextOamJob;
import io.swagger.model.TapiOamOamcontextOamProfile;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamContextOamContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamContextOamContext   {
  @JsonProperty("oam-service")
  private List<TapiOamOamService> oamService = null;

  @JsonProperty("oam-profile")
  private List<TapiOamOamcontextOamProfile> oamProfile = null;

  @JsonProperty("oam-job")
  private List<TapiOamOamcontextOamJob> oamJob = null;

  @JsonProperty("meg")
  private List<TapiOamOamcontextMeg> meg = null;

  public TapiOamContextOamContext oamService(List<TapiOamOamService> oamService) {
    this.oamService = oamService;
    return this;
  }

  public TapiOamContextOamContext addOamServiceItem(TapiOamOamService oamServiceItem) {
    if (this.oamService == null) {
      this.oamService = new ArrayList<TapiOamOamService>();
    }
    this.oamService.add(oamServiceItem);
    return this;
  }

  /**
   * none
   * @return oamService
   **/
  @JsonProperty("oam-service")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamService> getOamService() {
    return oamService;
  }

  public void setOamService(List<TapiOamOamService> oamService) {
    this.oamService = oamService;
  }

  public TapiOamContextOamContext oamProfile(List<TapiOamOamcontextOamProfile> oamProfile) {
    this.oamProfile = oamProfile;
    return this;
  }

  public TapiOamContextOamContext addOamProfileItem(TapiOamOamcontextOamProfile oamProfileItem) {
    if (this.oamProfile == null) {
      this.oamProfile = new ArrayList<TapiOamOamcontextOamProfile>();
    }
    this.oamProfile.add(oamProfileItem);
    return this;
  }

  /**
   * none
   * @return oamProfile
   **/
  @JsonProperty("oam-profile")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamcontextOamProfile> getOamProfile() {
    return oamProfile;
  }

  public void setOamProfile(List<TapiOamOamcontextOamProfile> oamProfile) {
    this.oamProfile = oamProfile;
  }

  public TapiOamContextOamContext oamJob(List<TapiOamOamcontextOamJob> oamJob) {
    this.oamJob = oamJob;
    return this;
  }

  public TapiOamContextOamContext addOamJobItem(TapiOamOamcontextOamJob oamJobItem) {
    if (this.oamJob == null) {
      this.oamJob = new ArrayList<TapiOamOamcontextOamJob>();
    }
    this.oamJob.add(oamJobItem);
    return this;
  }

  /**
   * none
   * @return oamJob
   **/
  @JsonProperty("oam-job")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamcontextOamJob> getOamJob() {
    return oamJob;
  }

  public void setOamJob(List<TapiOamOamcontextOamJob> oamJob) {
    this.oamJob = oamJob;
  }

  public TapiOamContextOamContext meg(List<TapiOamOamcontextMeg> meg) {
    this.meg = meg;
    return this;
  }

  public TapiOamContextOamContext addMegItem(TapiOamOamcontextMeg megItem) {
    if (this.meg == null) {
      this.meg = new ArrayList<TapiOamOamcontextMeg>();
    }
    this.meg.add(megItem);
    return this;
  }

  /**
   * none
   * @return meg
   **/
  @JsonProperty("meg")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamcontextMeg> getMeg() {
    return meg;
  }

  public void setMeg(List<TapiOamOamcontextMeg> meg) {
    this.meg = meg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamContextOamContext tapiOamContextOamContext = (TapiOamContextOamContext) o;
    return Objects.equals(this.oamService, tapiOamContextOamContext.oamService) &&
        Objects.equals(this.oamProfile, tapiOamContextOamContext.oamProfile) &&
        Objects.equals(this.oamJob, tapiOamContextOamContext.oamJob) &&
        Objects.equals(this.meg, tapiOamContextOamContext.meg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamService, oamProfile, oamJob, meg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamContextOamContext {\n");
    
    sb.append("    oamService: ").append(toIndentedString(oamService)).append("\n");
    sb.append("    oamProfile: ").append(toIndentedString(oamProfile)).append("\n");
    sb.append("    oamJob: ").append(toIndentedString(oamJob)).append("\n");
    sb.append("    meg: ").append(toIndentedString(meg)).append("\n");
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

