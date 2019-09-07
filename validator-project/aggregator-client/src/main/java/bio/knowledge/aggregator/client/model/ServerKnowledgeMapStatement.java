/*
 * Translator Knowledge Beacon Aggregator API
 * This is the Translator Knowledge Beacon Aggregator web service application programming interface (API) that provides integrated access to a pool of knowledge sources publishing concepts and relations through the Translator Knowledge Beacon API. This API is similar to that of the latter mentioned API with the addition of some extra informative endpoints plus session identifier and beacon indices. These latter identifiers are locally assigned numeric indices provided to track the use of specific registered beacons within the aggregator API itself. 
 *
 * OpenAPI spec version: 1.0.10
 * Contact: richard@starinformatics.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package bio.knowledge.aggregator.client.model;

import java.util.Objects;
import bio.knowledge.aggregator.client.model.ServerKnowledgeMapObject;
import bio.knowledge.aggregator.client.model.ServerKnowledgeMapPredicate;
import bio.knowledge.aggregator.client.model.ServerKnowledgeMapSubject;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServerKnowledgeMapStatement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-04T13:48:21.751-07:00")
public class ServerKnowledgeMapStatement {
  @SerializedName("subject")
  private ServerKnowledgeMapSubject subject = null;

  @SerializedName("predicate")
  private ServerKnowledgeMapPredicate predicate = null;

  @SerializedName("object")
  private ServerKnowledgeMapObject object = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("description")
  private String description = null;

  public ServerKnowledgeMapStatement subject(ServerKnowledgeMapSubject subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServerKnowledgeMapSubject getSubject() {
    return subject;
  }

  public void setSubject(ServerKnowledgeMapSubject subject) {
    this.subject = subject;
  }

  public ServerKnowledgeMapStatement predicate(ServerKnowledgeMapPredicate predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Get predicate
   * @return predicate
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServerKnowledgeMapPredicate getPredicate() {
    return predicate;
  }

  public void setPredicate(ServerKnowledgeMapPredicate predicate) {
    this.predicate = predicate;
  }

  public ServerKnowledgeMapStatement object(ServerKnowledgeMapObject object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServerKnowledgeMapObject getObject() {
    return object;
  }

  public void setObject(ServerKnowledgeMapObject object) {
    this.object = object;
  }

  public ServerKnowledgeMapStatement frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * the frequency of statements of the specified relationship within the given beacon 
   * @return frequency
  **/
  @ApiModelProperty(example = "null", value = "the frequency of statements of the specified relationship within the given beacon ")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public ServerKnowledgeMapStatement description(String description) {
    this.description = description;
    return this;
  }

   /**
   * a description of the nature of the relationship 
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "a description of the nature of the relationship ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerKnowledgeMapStatement serverKnowledgeMapStatement = (ServerKnowledgeMapStatement) o;
    return Objects.equals(this.subject, serverKnowledgeMapStatement.subject) &&
        Objects.equals(this.predicate, serverKnowledgeMapStatement.predicate) &&
        Objects.equals(this.object, serverKnowledgeMapStatement.object) &&
        Objects.equals(this.frequency, serverKnowledgeMapStatement.frequency) &&
        Objects.equals(this.description, serverKnowledgeMapStatement.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, predicate, object, frequency, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerKnowledgeMapStatement {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

