package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerStatement;
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
 * ServerStatementsQueryResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerStatementsQueryResult   {
  @JsonProperty("queryId")
  private String queryId = null;

  @JsonProperty("beacons")
  @Valid
  private List<Integer> beacons = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("results")
  @Valid
  private List<ServerStatement> results = null;

  public ServerStatementsQueryResult queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * session identifier of the query returning the results 
   * @return queryId
  **/
  @ApiModelProperty(value = "session identifier of the query returning the results ")


  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public ServerStatementsQueryResult beacons(List<Integer> beacons) {
    this.beacons = beacons;
    return this;
  }

  public ServerStatementsQueryResult addBeaconsItem(Integer beaconsItem) {
    if (this.beacons == null) {
      this.beacons = new ArrayList<Integer>();
    }
    this.beacons.add(beaconsItem);
    return this;
  }

  /**
   * Get beacons
   * @return beacons
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getBeacons() {
    return beacons;
  }

  public void setBeacons(List<Integer> beacons) {
    this.beacons = beacons;
  }

  public ServerStatementsQueryResult pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * 'pageNumber' string parameter to API call, echoed back 
   * @return pageNumber
  **/
  @ApiModelProperty(value = "'pageNumber' string parameter to API call, echoed back ")


  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ServerStatementsQueryResult pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * 'pageSize' string parameter to API call, echoed back 
   * @return pageSize
  **/
  @ApiModelProperty(value = "'pageSize' string parameter to API call, echoed back ")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ServerStatementsQueryResult results(List<ServerStatement> results) {
    this.results = results;
    return this;
  }

  public ServerStatementsQueryResult addResultsItem(ServerStatement resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ServerStatement>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServerStatement> getResults() {
    return results;
  }

  public void setResults(List<ServerStatement> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerStatementsQueryResult serverStatementsQueryResult = (ServerStatementsQueryResult) o;
    return Objects.equals(this.queryId, serverStatementsQueryResult.queryId) &&
        Objects.equals(this.beacons, serverStatementsQueryResult.beacons) &&
        Objects.equals(this.pageNumber, serverStatementsQueryResult.pageNumber) &&
        Objects.equals(this.pageSize, serverStatementsQueryResult.pageSize) &&
        Objects.equals(this.results, serverStatementsQueryResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, beacons, pageNumber, pageSize, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerStatementsQueryResult {\n");
    
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    beacons: ").append(toIndentedString(beacons)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

