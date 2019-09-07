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
 * ServerClique
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerClique   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("cliqueId")
  private String cliqueId = null;

  public ServerClique id(String id) {
    this.id = id;
    return this;
  }

  /**
   * CURIE identifying the concept whose concept clique is being resolved 
   * @return id
  **/
  @ApiModelProperty(value = "CURIE identifying the concept whose concept clique is being resolved ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServerClique cliqueId(String cliqueId) {
    this.cliqueId = cliqueId;
    return this;
  }

  /**
   * CURIE identifying the equivalent concept clique to which the  input concept CURIE belongs. 
   * @return cliqueId
  **/
  @ApiModelProperty(value = "CURIE identifying the equivalent concept clique to which the  input concept CURIE belongs. ")


  public String getCliqueId() {
    return cliqueId;
  }

  public void setCliqueId(String cliqueId) {
    this.cliqueId = cliqueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerClique serverClique = (ServerClique) o;
    return Objects.equals(this.id, serverClique.id) &&
        Objects.equals(this.cliqueId, serverClique.cliqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cliqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerClique {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cliqueId: ").append(toIndentedString(cliqueId)).append("\n");
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

