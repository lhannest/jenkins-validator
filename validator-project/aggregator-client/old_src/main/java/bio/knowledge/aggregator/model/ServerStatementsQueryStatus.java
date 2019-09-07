package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerStatementsQueryBeaconStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServerStatementsQueryStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerStatementsQueryStatus   {
  @JsonProperty("queryId")
  private String queryId = null;

  @JsonProperty("status")
  @Valid
  private List<ServerStatementsQueryBeaconStatus> status = null;

  public ServerStatementsQueryStatus queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * session identifier of initiated query 
   * @return queryId
  **/
  @ApiModelProperty(value = "session identifier of initiated query ")


  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public ServerStatementsQueryStatus status(List<ServerStatementsQueryBeaconStatus> status) {
    this.status = status;
    return this;
  }

  public ServerStatementsQueryStatus addStatusItem(ServerStatementsQueryBeaconStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<ServerStatementsQueryBeaconStatus>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * array of beacon-specific query status reports 
   * @return status
  **/
  @ApiModelProperty(value = "array of beacon-specific query status reports ")

  @Valid

  public List<ServerStatementsQueryBeaconStatus> getStatus() {
    return status;
  }

  public void setStatus(List<ServerStatementsQueryBeaconStatus> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerStatementsQueryStatus serverStatementsQueryStatus = (ServerStatementsQueryStatus) o;
    return Objects.equals(this.queryId, serverStatementsQueryStatus.queryId) &&
        Objects.equals(this.status, serverStatementsQueryStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerStatementsQueryStatus {\n");
    
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

