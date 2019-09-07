package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerKnowledgeMapStatement;
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
 * ServerKnowledgeMap
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerKnowledgeMap   {
  @JsonProperty("beacon")
  private Integer beacon = null;

  @JsonProperty("statements")
  @Valid
  private List<ServerKnowledgeMapStatement> statements = null;

  public ServerKnowledgeMap beacon(Integer beacon) {
    this.beacon = beacon;
    return this;
  }

  /**
   * aggregator assigned beacon index identifier 
   * @return beacon
  **/
  @ApiModelProperty(value = "aggregator assigned beacon index identifier ")


  public Integer getBeacon() {
    return beacon;
  }

  public void setBeacon(Integer beacon) {
    this.beacon = beacon;
  }

  public ServerKnowledgeMap statements(List<ServerKnowledgeMapStatement> statements) {
    this.statements = statements;
    return this;
  }

  public ServerKnowledgeMap addStatementsItem(ServerKnowledgeMapStatement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<ServerKnowledgeMapStatement>();
    }
    this.statements.add(statementsItem);
    return this;
  }

  /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServerKnowledgeMapStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<ServerKnowledgeMapStatement> statements) {
    this.statements = statements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerKnowledgeMap serverKnowledgeMap = (ServerKnowledgeMap) o;
    return Objects.equals(this.beacon, serverKnowledgeMap.beacon) &&
        Objects.equals(this.statements, serverKnowledgeMap.statements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beacon, statements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerKnowledgeMap {\n");
    
    sb.append("    beacon: ").append(toIndentedString(beacon)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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

