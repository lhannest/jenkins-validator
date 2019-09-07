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
 * ServerConcept
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerConcept   {
  @JsonProperty("clique")
  private String clique = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  public ServerConcept clique(String clique) {
    this.clique = clique;
    return this;
  }

  /**
   * CURIE identifying the inferred equivalent concept clique to which the concept belongs. This is assigned by an identifier precedence heuristic by the beacon-aggregator 
   * @return clique
  **/
  @ApiModelProperty(value = "CURIE identifying the inferred equivalent concept clique to which the concept belongs. This is assigned by an identifier precedence heuristic by the beacon-aggregator ")


  public String getClique() {
    return clique;
  }

  public void setClique(String clique) {
    this.clique = clique;
  }

  public ServerConcept name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Canonical human readable name of the concept 
   * @return name
  **/
  @ApiModelProperty(value = "Canonical human readable name of the concept ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServerConcept categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public ServerConcept addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Concept categories associated with the given concept ((see [Biolink Model](https://biolink.github.io/biolink-model) for the full list of categories). 
   * @return categories
  **/
  @ApiModelProperty(value = "Concept categories associated with the given concept ((see [Biolink Model](https://biolink.github.io/biolink-model) for the full list of categories). ")


  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConcept serverConcept = (ServerConcept) o;
    return Objects.equals(this.clique, serverConcept.clique) &&
        Objects.equals(this.name, serverConcept.name) &&
        Objects.equals(this.categories, serverConcept.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clique, name, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConcept {\n");
    
    sb.append("    clique: ").append(toIndentedString(clique)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

