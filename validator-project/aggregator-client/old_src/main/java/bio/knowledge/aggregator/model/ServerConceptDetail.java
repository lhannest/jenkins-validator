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
 * Additional attributes associated with a concept 
 */
@ApiModel(description = "Additional attributes associated with a concept ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerConceptDetail   {
  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("value")
  private String value = null;

  public ServerConceptDetail tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Attribute name 
   * @return tag
  **/
  @ApiModelProperty(value = "Attribute name ")


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ServerConceptDetail value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Attribute value 
   * @return value
  **/
  @ApiModelProperty(value = "Attribute value ")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConceptDetail serverConceptDetail = (ServerConceptDetail) o;
    return Objects.equals(this.tag, serverConceptDetail.tag) &&
        Objects.equals(this.value, serverConceptDetail.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConceptDetail {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

