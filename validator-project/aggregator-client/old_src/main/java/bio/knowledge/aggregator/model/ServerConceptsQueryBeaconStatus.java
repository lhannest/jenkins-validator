package bio.knowledge.aggregator.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServerConceptsQueryBeaconStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerConceptsQueryBeaconStatus   {
  @JsonProperty("beacon")
  private Integer beacon = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("discovered")
  private Integer discovered = null;

  @JsonProperty("processed")
  private Integer processed = null;

  @JsonProperty("count")
  private Integer count = null;

  public ServerConceptsQueryBeaconStatus beacon(Integer beacon) {
    this.beacon = beacon;
    return this;
  }

  /**
   * Index number of beacon providing these concept details 
   * @return beacon
  **/
  @ApiModelProperty(value = "Index number of beacon providing these concept details ")


  public Integer getBeacon() {
    return beacon;
  }

  public void setBeacon(Integer beacon) {
    this.beacon = beacon;
  }

  public ServerConceptsQueryBeaconStatus status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Http code status of beacon API - 200 means 'data ready', 102 means 'query in progress', other codes (e.g. 500) are server errors. Once a beacon has a '200' success code, then the /concepts/data  endpoint may be used to retrieve it. 
   * @return status
  **/
  @ApiModelProperty(value = "Http code status of beacon API - 200 means 'data ready', 102 means 'query in progress', other codes (e.g. 500) are server errors. Once a beacon has a '200' success code, then the /concepts/data  endpoint may be used to retrieve it. ")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ServerConceptsQueryBeaconStatus discovered(Integer discovered) {
    this.discovered = discovered;
    return this;
  }

  /**
   * A count of how many items a beacon has returned. This number will not always be the same as the final number of results since we merge duplicate items. 
   * @return discovered
  **/
  @ApiModelProperty(value = "A count of how many items a beacon has returned. This number will not always be the same as the final number of results since we merge duplicate items. ")


  public Integer getDiscovered() {
    return discovered;
  }

  public void setDiscovered(Integer discovered) {
    this.discovered = discovered;
  }

  public ServerConceptsQueryBeaconStatus processed(Integer processed) {
    this.processed = processed;
    return this;
  }

  /**
   * A count of how many of the beacon responses have been processed and are ready for consumption. 
   * @return processed
  **/
  @ApiModelProperty(value = "A count of how many of the beacon responses have been processed and are ready for consumption. ")


  public Integer getProcessed() {
    return processed;
  }

  public void setProcessed(Integer processed) {
    this.processed = processed;
  }

  public ServerConceptsQueryBeaconStatus count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * When a 200 status code is returned, this integer designates  the number of concepts matched by the query for the given beacon. 
   * @return count
  **/
  @ApiModelProperty(value = "When a 200 status code is returned, this integer designates  the number of concepts matched by the query for the given beacon. ")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConceptsQueryBeaconStatus serverConceptsQueryBeaconStatus = (ServerConceptsQueryBeaconStatus) o;
    return Objects.equals(this.beacon, serverConceptsQueryBeaconStatus.beacon) &&
        Objects.equals(this.status, serverConceptsQueryBeaconStatus.status) &&
        Objects.equals(this.discovered, serverConceptsQueryBeaconStatus.discovered) &&
        Objects.equals(this.processed, serverConceptsQueryBeaconStatus.processed) &&
        Objects.equals(this.count, serverConceptsQueryBeaconStatus.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beacon, status, discovered, processed, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConceptsQueryBeaconStatus {\n");
    
    sb.append("    beacon: ").append(toIndentedString(beacon)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    discovered: ").append(toIndentedString(discovered)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

