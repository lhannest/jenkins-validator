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
 * ServerConceptsQuery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerConceptsQuery   {
  @JsonProperty("queryId")
  private String queryId = null;

  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  public ServerConceptsQuery queryId(String queryId) {
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

  public ServerConceptsQuery keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public ServerConceptsQuery addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * 'keywords' string parameter to API call, echoed back 
   * @return keywords
  **/
  @ApiModelProperty(value = "'keywords' string parameter to API call, echoed back ")


  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public ServerConceptsQuery categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public ServerConceptsQuery addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * 'categories' string parameter to API call, echoed back 
   * @return categories
  **/
  @ApiModelProperty(value = "'categories' string parameter to API call, echoed back ")


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
    ServerConceptsQuery serverConceptsQuery = (ServerConceptsQuery) o;
    return Objects.equals(this.queryId, serverConceptsQuery.queryId) &&
        Objects.equals(this.keywords, serverConceptsQuery.keywords) &&
        Objects.equals(this.categories, serverConceptsQuery.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, keywords, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConceptsQuery {\n");
    
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

