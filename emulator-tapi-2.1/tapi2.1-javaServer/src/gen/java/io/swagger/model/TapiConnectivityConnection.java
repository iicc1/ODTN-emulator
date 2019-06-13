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
import io.swagger.model.TapiCommonForwardingDirection;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonOperationalStatePac;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityConnectionRef;
import io.swagger.model.TapiConnectivityRoute;
import io.swagger.model.TapiConnectivitySwitchControl;
import io.swagger.model.TapiTopologyLinkRef;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiConnectivityConnection   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("supported-client-link")
  private List<TapiTopologyLinkRef> supportedClientLink = null;

  @JsonProperty("lower-connection")
  private List<TapiConnectivityConnectionRef> lowerConnection = null;

  @JsonProperty("switch-control")
  private List<TapiConnectivitySwitchControl> switchControl = null;

  @JsonProperty("route")
  private List<TapiConnectivityRoute> route = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("connection-end-point")
  private List<TapiConnectivityConnectionEndPointRef> connectionEndPoint = null;

  @JsonProperty("direction")
  private TapiCommonForwardingDirection direction = null;

  public TapiConnectivityConnection name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiConnectivityConnection addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiConnectivityConnection uuid(String uuid) {
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

  public TapiConnectivityConnection operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiConnectivityConnection lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiConnectivityConnection supportedClientLink(List<TapiTopologyLinkRef> supportedClientLink) {
    this.supportedClientLink = supportedClientLink;
    return this;
  }

  public TapiConnectivityConnection addSupportedClientLinkItem(TapiTopologyLinkRef supportedClientLinkItem) {
    if (this.supportedClientLink == null) {
      this.supportedClientLink = new ArrayList<TapiTopologyLinkRef>();
    }
    this.supportedClientLink.add(supportedClientLinkItem);
    return this;
  }

  /**
   * none
   * @return supportedClientLink
   **/
  @JsonProperty("supported-client-link")
  @ApiModelProperty(value = "none")
  public List<TapiTopologyLinkRef> getSupportedClientLink() {
    return supportedClientLink;
  }

  public void setSupportedClientLink(List<TapiTopologyLinkRef> supportedClientLink) {
    this.supportedClientLink = supportedClientLink;
  }

  public TapiConnectivityConnection lowerConnection(List<TapiConnectivityConnectionRef> lowerConnection) {
    this.lowerConnection = lowerConnection;
    return this;
  }

  public TapiConnectivityConnection addLowerConnectionItem(TapiConnectivityConnectionRef lowerConnectionItem) {
    if (this.lowerConnection == null) {
      this.lowerConnection = new ArrayList<TapiConnectivityConnectionRef>();
    }
    this.lowerConnection.add(lowerConnectionItem);
    return this;
  }

  /**
   * An Connection object supports a recursive aggregation relationship such that the internal construction of an Connection can be exposed as multiple lower level Connection objects (partitioning).                      Aggregation is used as for the Node/Topology  to allow changes in hierarchy.                       Connection aggregation reflects Node/Topology aggregation.                       The FC represents a Cross-Connection in an NE. The Cross-Connection in an NE is not necessarily the lowest level of FC partitioning.
   * @return lowerConnection
   **/
  @JsonProperty("lower-connection")
  @ApiModelProperty(value = "An Connection object supports a recursive aggregation relationship such that the internal construction of an Connection can be exposed as multiple lower level Connection objects (partitioning).                      Aggregation is used as for the Node/Topology  to allow changes in hierarchy.                       Connection aggregation reflects Node/Topology aggregation.                       The FC represents a Cross-Connection in an NE. The Cross-Connection in an NE is not necessarily the lowest level of FC partitioning.")
  public List<TapiConnectivityConnectionRef> getLowerConnection() {
    return lowerConnection;
  }

  public void setLowerConnection(List<TapiConnectivityConnectionRef> lowerConnection) {
    this.lowerConnection = lowerConnection;
  }

  public TapiConnectivityConnection switchControl(List<TapiConnectivitySwitchControl> switchControl) {
    this.switchControl = switchControl;
    return this;
  }

  public TapiConnectivityConnection addSwitchControlItem(TapiConnectivitySwitchControl switchControlItem) {
    if (this.switchControl == null) {
      this.switchControl = new ArrayList<TapiConnectivitySwitchControl>();
    }
    this.switchControl.add(switchControlItem);
    return this;
  }

  /**
   * none
   * @return switchControl
   **/
  @JsonProperty("switch-control")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivitySwitchControl> getSwitchControl() {
    return switchControl;
  }

  public void setSwitchControl(List<TapiConnectivitySwitchControl> switchControl) {
    this.switchControl = switchControl;
  }

  public TapiConnectivityConnection route(List<TapiConnectivityRoute> route) {
    this.route = route;
    return this;
  }

  public TapiConnectivityConnection addRouteItem(TapiConnectivityRoute routeItem) {
    if (this.route == null) {
      this.route = new ArrayList<TapiConnectivityRoute>();
    }
    this.route.add(routeItem);
    return this;
  }

  /**
   * none
   * @return route
   **/
  @JsonProperty("route")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityRoute> getRoute() {
    return route;
  }

  public void setRoute(List<TapiConnectivityRoute> route) {
    this.route = route;
  }

  public TapiConnectivityConnection layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * none
   * @return layerProtocolName
   **/
  @JsonProperty("layer-protocol-name")
  @ApiModelProperty(value = "none")
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiConnectivityConnection connectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public TapiConnectivityConnection addConnectionEndPointItem(TapiConnectivityConnectionEndPointRef connectionEndPointItem) {
    if (this.connectionEndPoint == null) {
      this.connectionEndPoint = new ArrayList<TapiConnectivityConnectionEndPointRef>();
    }
    this.connectionEndPoint.add(connectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return connectionEndPoint
   **/
  @JsonProperty("connection-end-point")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityConnectionEndPointRef> getConnectionEndPoint() {
    return connectionEndPoint;
  }

  public void setConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
  }

  public TapiConnectivityConnection direction(TapiCommonForwardingDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * none
   * @return direction
   **/
  @JsonProperty("direction")
  @ApiModelProperty(value = "none")
  public TapiCommonForwardingDirection getDirection() {
    return direction;
  }

  public void setDirection(TapiCommonForwardingDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnection tapiConnectivityConnection = (TapiConnectivityConnection) o;
    return Objects.equals(this.name, tapiConnectivityConnection.name) &&
        Objects.equals(this.uuid, tapiConnectivityConnection.uuid) &&
        Objects.equals(this.operationalState, tapiConnectivityConnection.operationalState) &&
        Objects.equals(this.lifecycleState, tapiConnectivityConnection.lifecycleState) &&
        Objects.equals(this.supportedClientLink, tapiConnectivityConnection.supportedClientLink) &&
        Objects.equals(this.lowerConnection, tapiConnectivityConnection.lowerConnection) &&
        Objects.equals(this.switchControl, tapiConnectivityConnection.switchControl) &&
        Objects.equals(this.route, tapiConnectivityConnection.route) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityConnection.layerProtocolName) &&
        Objects.equals(this.connectionEndPoint, tapiConnectivityConnection.connectionEndPoint) &&
        Objects.equals(this.direction, tapiConnectivityConnection.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, operationalState, lifecycleState, supportedClientLink, lowerConnection, switchControl, route, layerProtocolName, connectionEndPoint, direction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnection {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    supportedClientLink: ").append(toIndentedString(supportedClientLink)).append("\n");
    sb.append("    lowerConnection: ").append(toIndentedString(lowerConnection)).append("\n");
    sb.append("    switchControl: ").append(toIndentedString(switchControl)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
