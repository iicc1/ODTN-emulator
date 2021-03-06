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
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiNotificationNotificationType;
import io.swagger.model.TapiNotificationObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiNotificationSubscriptionFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiNotificationSubscriptionFilter   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("requested-notification-types")
  private List<TapiNotificationNotificationType> requestedNotificationTypes = null;

  @JsonProperty("requested-object-identifier")
  private List<String> requestedObjectIdentifier = null;

  @JsonProperty("requested-layer-protocols")
  private List<TapiCommonLayerProtocolName> requestedLayerProtocols = null;

  @JsonProperty("include-content")
  private Boolean includeContent = false;

  @JsonProperty("requested-object-types")
  private List<TapiNotificationObjectType> requestedObjectTypes = null;

  public TapiNotificationSubscriptionFilter name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiNotificationSubscriptionFilter addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiNotificationSubscriptionFilter localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
   **/
  @JsonProperty("local-id")
  @ApiModelProperty(value = "none")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public TapiNotificationSubscriptionFilter requestedNotificationTypes(List<TapiNotificationNotificationType> requestedNotificationTypes) {
    this.requestedNotificationTypes = requestedNotificationTypes;
    return this;
  }

  public TapiNotificationSubscriptionFilter addRequestedNotificationTypesItem(TapiNotificationNotificationType requestedNotificationTypesItem) {
    if (this.requestedNotificationTypes == null) {
      this.requestedNotificationTypes = new ArrayList<TapiNotificationNotificationType>();
    }
    this.requestedNotificationTypes.add(requestedNotificationTypesItem);
    return this;
  }

  /**
   * none
   * @return requestedNotificationTypes
   **/
  @JsonProperty("requested-notification-types")
  @ApiModelProperty(value = "none")
  public List<TapiNotificationNotificationType> getRequestedNotificationTypes() {
    return requestedNotificationTypes;
  }

  public void setRequestedNotificationTypes(List<TapiNotificationNotificationType> requestedNotificationTypes) {
    this.requestedNotificationTypes = requestedNotificationTypes;
  }

  public TapiNotificationSubscriptionFilter requestedObjectIdentifier(List<String> requestedObjectIdentifier) {
    this.requestedObjectIdentifier = requestedObjectIdentifier;
    return this;
  }

  public TapiNotificationSubscriptionFilter addRequestedObjectIdentifierItem(String requestedObjectIdentifierItem) {
    if (this.requestedObjectIdentifier == null) {
      this.requestedObjectIdentifier = new ArrayList<String>();
    }
    this.requestedObjectIdentifier.add(requestedObjectIdentifierItem);
    return this;
  }

  /**
   * none
   * @return requestedObjectIdentifier
   **/
  @JsonProperty("requested-object-identifier")
  @ApiModelProperty(value = "none")
  public List<String> getRequestedObjectIdentifier() {
    return requestedObjectIdentifier;
  }

  public void setRequestedObjectIdentifier(List<String> requestedObjectIdentifier) {
    this.requestedObjectIdentifier = requestedObjectIdentifier;
  }

  public TapiNotificationSubscriptionFilter requestedLayerProtocols(List<TapiCommonLayerProtocolName> requestedLayerProtocols) {
    this.requestedLayerProtocols = requestedLayerProtocols;
    return this;
  }

  public TapiNotificationSubscriptionFilter addRequestedLayerProtocolsItem(TapiCommonLayerProtocolName requestedLayerProtocolsItem) {
    if (this.requestedLayerProtocols == null) {
      this.requestedLayerProtocols = new ArrayList<TapiCommonLayerProtocolName>();
    }
    this.requestedLayerProtocols.add(requestedLayerProtocolsItem);
    return this;
  }

  /**
   * none
   * @return requestedLayerProtocols
   **/
  @JsonProperty("requested-layer-protocols")
  @ApiModelProperty(value = "none")
  public List<TapiCommonLayerProtocolName> getRequestedLayerProtocols() {
    return requestedLayerProtocols;
  }

  public void setRequestedLayerProtocols(List<TapiCommonLayerProtocolName> requestedLayerProtocols) {
    this.requestedLayerProtocols = requestedLayerProtocols;
  }

  public TapiNotificationSubscriptionFilter includeContent(Boolean includeContent) {
    this.includeContent = includeContent;
    return this;
  }

  /**
   * Indicates whether the published Notification includes content or just the Notification Id (which enables retrieval of the notification at the later stage)
   * @return includeContent
   **/
  @JsonProperty("include-content")
  @ApiModelProperty(value = "Indicates whether the published Notification includes content or just the Notification Id (which enables retrieval of the notification at the later stage)")
  public Boolean isIncludeContent() {
    return includeContent;
  }

  public void setIncludeContent(Boolean includeContent) {
    this.includeContent = includeContent;
  }

  public TapiNotificationSubscriptionFilter requestedObjectTypes(List<TapiNotificationObjectType> requestedObjectTypes) {
    this.requestedObjectTypes = requestedObjectTypes;
    return this;
  }

  public TapiNotificationSubscriptionFilter addRequestedObjectTypesItem(TapiNotificationObjectType requestedObjectTypesItem) {
    if (this.requestedObjectTypes == null) {
      this.requestedObjectTypes = new ArrayList<TapiNotificationObjectType>();
    }
    this.requestedObjectTypes.add(requestedObjectTypesItem);
    return this;
  }

  /**
   * none
   * @return requestedObjectTypes
   **/
  @JsonProperty("requested-object-types")
  @ApiModelProperty(value = "none")
  public List<TapiNotificationObjectType> getRequestedObjectTypes() {
    return requestedObjectTypes;
  }

  public void setRequestedObjectTypes(List<TapiNotificationObjectType> requestedObjectTypes) {
    this.requestedObjectTypes = requestedObjectTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationSubscriptionFilter tapiNotificationSubscriptionFilter = (TapiNotificationSubscriptionFilter) o;
    return Objects.equals(this.name, tapiNotificationSubscriptionFilter.name) &&
        Objects.equals(this.localId, tapiNotificationSubscriptionFilter.localId) &&
        Objects.equals(this.requestedNotificationTypes, tapiNotificationSubscriptionFilter.requestedNotificationTypes) &&
        Objects.equals(this.requestedObjectIdentifier, tapiNotificationSubscriptionFilter.requestedObjectIdentifier) &&
        Objects.equals(this.requestedLayerProtocols, tapiNotificationSubscriptionFilter.requestedLayerProtocols) &&
        Objects.equals(this.includeContent, tapiNotificationSubscriptionFilter.includeContent) &&
        Objects.equals(this.requestedObjectTypes, tapiNotificationSubscriptionFilter.requestedObjectTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId, requestedNotificationTypes, requestedObjectIdentifier, requestedLayerProtocols, includeContent, requestedObjectTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationSubscriptionFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    requestedNotificationTypes: ").append(toIndentedString(requestedNotificationTypes)).append("\n");
    sb.append("    requestedObjectIdentifier: ").append(toIndentedString(requestedObjectIdentifier)).append("\n");
    sb.append("    requestedLayerProtocols: ").append(toIndentedString(requestedLayerProtocols)).append("\n");
    sb.append("    includeContent: ").append(toIndentedString(includeContent)).append("\n");
    sb.append("    requestedObjectTypes: ").append(toIndentedString(requestedObjectTypes)).append("\n");
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

