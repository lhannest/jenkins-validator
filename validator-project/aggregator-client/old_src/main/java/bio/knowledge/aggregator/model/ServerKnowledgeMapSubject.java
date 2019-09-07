package bio.knowledge.aggregator.model;

import java.util.Objects;
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
 * ServerKnowledgeMapSubject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerKnowledgeMapSubject   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("prefixes")
  @Valid
  private List<String> prefixes = null;

  public ServerKnowledgeMapSubject category(String category) {
    this.category = category;
    return this;
  }

  /**
   * the human readable label of the concept category of a statement subject 
   * @return category
  **/
  @ApiModelProperty(value = "the human readable label of the concept category of a statement subject ")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ServerKnowledgeMapSubject prefixes(List<String> prefixes) {
    this.prefixes = prefixes;
    return this;
  }

  public ServerKnowledgeMapSubject addPrefixesItem(String prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<String>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }

  /**
   * Get prefixes
   * @return prefixes
  **/
  @ApiModelProperty(value = "")


  public List<String> getPrefixes() {
    return prefixes;
  }

  public void setPrefixes(List<String> prefixes) {
    this.prefixes = prefixes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerKnowledgeMapSubject serverKnowledgeMapSubject = (ServerKnowledgeMapSubject) o;
    return Objects.equals(this.category, serverKnowledgeMapSubject.category) &&
        Objects.equals(this.prefixes, serverKnowledgeMapSubject.prefixes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, prefixes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerKnowledgeMapSubject {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
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

