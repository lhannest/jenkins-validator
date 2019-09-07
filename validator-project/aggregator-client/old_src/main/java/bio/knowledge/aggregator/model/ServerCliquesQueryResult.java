package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerClique;
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
 * ServerCliquesQueryResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerCliquesQueryResult   {
  @JsonProperty("queryId")
  private String queryId = null;

  @JsonProperty("results")
  @Valid
  private List<ServerClique> results = null;

  public ServerCliquesQueryResult queryId(String queryId) {
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

  public ServerCliquesQueryResult results(List<ServerClique> results) {
    this.results = results;
    return this;
  }

  public ServerCliquesQueryResult addResultsItem(ServerClique resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ServerClique>();
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

  public List<ServerClique> getResults() {
    return results;
  }

  public void setResults(List<ServerClique> results) {
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
    ServerCliquesQueryResult serverCliquesQueryResult = (ServerCliquesQueryResult) o;
    return Objects.equals(this.queryId, serverCliquesQueryResult.queryId) &&
        Objects.equals(this.results, serverCliquesQueryResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerCliquesQueryResult {\n");
    
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
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

