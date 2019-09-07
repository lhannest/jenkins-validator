package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerStatementAnnotation;
import bio.knowledge.aggregator.model.ServerStatementCitation;
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
 * ServerStatementDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerStatementDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("is_defined_by")
  private String isDefinedBy = null;

  @JsonProperty("provided_by")
  private String providedBy = null;

  @JsonProperty("qualifiers")
  @Valid
  private List<String> qualifiers = null;

  @JsonProperty("annotation")
  @Valid
  private List<ServerStatementAnnotation> annotation = null;

  @JsonProperty("evidence")
  @Valid
  private List<ServerStatementCitation> evidence = null;

  public ServerStatementDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Statement identifier of the statement made in an edge (echoed back) 
   * @return id
  **/
  @ApiModelProperty(value = "Statement identifier of the statement made in an edge (echoed back) ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServerStatementDetails keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public ServerStatementDetails addKeywordsItem(String keywordsItem) {
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

  public ServerStatementDetails pageNumber(Integer pageNumber) {
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

  public ServerStatementDetails pageSize(Integer pageSize) {
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

  public ServerStatementDetails isDefinedBy(String isDefinedBy) {
    this.isDefinedBy = isDefinedBy;
    return this;
  }

  /**
   * A CURIE/URI for the translator group that wrapped this knowledge source ('beacon') that publishes the statement made in an edge. 
   * @return isDefinedBy
  **/
  @ApiModelProperty(value = "A CURIE/URI for the translator group that wrapped this knowledge source ('beacon') that publishes the statement made in an edge. ")


  public String getIsDefinedBy() {
    return isDefinedBy;
  }

  public void setIsDefinedBy(String isDefinedBy) {
    this.isDefinedBy = isDefinedBy;
  }

  public ServerStatementDetails providedBy(String providedBy) {
    this.providedBy = providedBy;
    return this;
  }

  /**
   * A CURIE prefix, e.g. Pharos, MGI, Monarch. The group that curated/asserted the statement made in an edge. 
   * @return providedBy
  **/
  @ApiModelProperty(value = "A CURIE prefix, e.g. Pharos, MGI, Monarch. The group that curated/asserted the statement made in an edge. ")


  public String getProvidedBy() {
    return providedBy;
  }

  public void setProvidedBy(String providedBy) {
    this.providedBy = providedBy;
  }

  public ServerStatementDetails qualifiers(List<String> qualifiers) {
    this.qualifiers = qualifiers;
    return this;
  }

  public ServerStatementDetails addQualifiersItem(String qualifiersItem) {
    if (this.qualifiers == null) {
      this.qualifiers = new ArrayList<String>();
    }
    this.qualifiers.add(qualifiersItem);
    return this;
  }

  /**
   * (Optional) terms representing qualifiers that modify or qualify the meaning of the statement made in an edge. 
   * @return qualifiers
  **/
  @ApiModelProperty(value = "(Optional) terms representing qualifiers that modify or qualify the meaning of the statement made in an edge. ")


  public List<String> getQualifiers() {
    return qualifiers;
  }

  public void setQualifiers(List<String> qualifiers) {
    this.qualifiers = qualifiers;
  }

  public ServerStatementDetails annotation(List<ServerStatementAnnotation> annotation) {
    this.annotation = annotation;
    return this;
  }

  public ServerStatementDetails addAnnotationItem(ServerStatementAnnotation annotationItem) {
    if (this.annotation == null) {
      this.annotation = new ArrayList<ServerStatementAnnotation>();
    }
    this.annotation.add(annotationItem);
    return this;
  }

  /**
   * Extra edge properties, generally compliant with Translator Knowledge Graph Standard Specification 
   * @return annotation
  **/
  @ApiModelProperty(value = "Extra edge properties, generally compliant with Translator Knowledge Graph Standard Specification ")

  @Valid

  public List<ServerStatementAnnotation> getAnnotation() {
    return annotation;
  }

  public void setAnnotation(List<ServerStatementAnnotation> annotation) {
    this.annotation = annotation;
  }

  public ServerStatementDetails evidence(List<ServerStatementCitation> evidence) {
    this.evidence = evidence;
    return this;
  }

  public ServerStatementDetails addEvidenceItem(ServerStatementCitation evidenceItem) {
    if (this.evidence == null) {
      this.evidence = new ArrayList<ServerStatementCitation>();
    }
    this.evidence.add(evidenceItem);
    return this;
  }

  /**
   * Get evidence
   * @return evidence
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServerStatementCitation> getEvidence() {
    return evidence;
  }

  public void setEvidence(List<ServerStatementCitation> evidence) {
    this.evidence = evidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerStatementDetails serverStatementDetails = (ServerStatementDetails) o;
    return Objects.equals(this.id, serverStatementDetails.id) &&
        Objects.equals(this.keywords, serverStatementDetails.keywords) &&
        Objects.equals(this.pageNumber, serverStatementDetails.pageNumber) &&
        Objects.equals(this.pageSize, serverStatementDetails.pageSize) &&
        Objects.equals(this.isDefinedBy, serverStatementDetails.isDefinedBy) &&
        Objects.equals(this.providedBy, serverStatementDetails.providedBy) &&
        Objects.equals(this.qualifiers, serverStatementDetails.qualifiers) &&
        Objects.equals(this.annotation, serverStatementDetails.annotation) &&
        Objects.equals(this.evidence, serverStatementDetails.evidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keywords, pageNumber, pageSize, isDefinedBy, providedBy, qualifiers, annotation, evidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerStatementDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    isDefinedBy: ").append(toIndentedString(isDefinedBy)).append("\n");
    sb.append("    providedBy: ").append(toIndentedString(providedBy)).append("\n");
    sb.append("    qualifiers: ").append(toIndentedString(qualifiers)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
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

