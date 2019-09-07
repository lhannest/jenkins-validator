package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerPredicatesByBeacon;
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
 * ServerPredicate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerPredicate   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("edge_label")
  private String edgeLabel = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("beacons")
  @Valid
  private List<ServerPredicatesByBeacon> beacons = null;

  public ServerPredicate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the CURIE of the predicate relation (see [Biolink Model](https://biolink.github.io/biolink-model)
   * @return id
  **/
  @ApiModelProperty(value = "the CURIE of the predicate relation (see [Biolink Model](https://biolink.github.io/biolink-model)")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServerPredicate uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * the URI of the predicate relation (see [Biolink Model](https://biolink.github.io/biolink-model) for the full list of URI)
   * @return uri
  **/
  @ApiModelProperty(value = "the URI of the predicate relation (see [Biolink Model](https://biolink.github.io/biolink-model) for the full list of URI)")


  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ServerPredicate edgeLabel(String edgeLabel) {
    this.edgeLabel = edgeLabel;
    return this;
  }

  /**
   * the human readable 'edge label' of the 'minimal' predicate (see [Biolink Model](https://biolink.github.io/biolink-model) for the full list of Biolink Model minimal predicates)
   * @return edgeLabel
  **/
  @ApiModelProperty(value = "the human readable 'edge label' of the 'minimal' predicate (see [Biolink Model](https://biolink.github.io/biolink-model) for the full list of Biolink Model minimal predicates)")


  public String getEdgeLabel() {
    return edgeLabel;
  }

  public void setEdgeLabel(String edgeLabel) {
    this.edgeLabel = edgeLabel;
  }

  public ServerPredicate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * human readable definition assigned by the beacon for the predicate relation 
   * @return description
  **/
  @ApiModelProperty(value = "human readable definition assigned by the beacon for the predicate relation ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServerPredicate beacons(List<ServerPredicatesByBeacon> beacons) {
    this.beacons = beacons;
    return this;
  }

  public ServerPredicate addBeaconsItem(ServerPredicatesByBeacon beaconsItem) {
    if (this.beacons == null) {
      this.beacons = new ArrayList<ServerPredicatesByBeacon>();
    }
    this.beacons.add(beaconsItem);
    return this;
  }

  /**
   * list of metadata for beacons that support the use of this predicate relation 
   * @return beacons
  **/
  @ApiModelProperty(value = "list of metadata for beacons that support the use of this predicate relation ")

  @Valid

  public List<ServerPredicatesByBeacon> getBeacons() {
    return beacons;
  }

  public void setBeacons(List<ServerPredicatesByBeacon> beacons) {
    this.beacons = beacons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerPredicate serverPredicate = (ServerPredicate) o;
    return Objects.equals(this.id, serverPredicate.id) &&
        Objects.equals(this.uri, serverPredicate.uri) &&
        Objects.equals(this.edgeLabel, serverPredicate.edgeLabel) &&
        Objects.equals(this.description, serverPredicate.description) &&
        Objects.equals(this.beacons, serverPredicate.beacons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, edgeLabel, description, beacons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerPredicate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    edgeLabel: ").append(toIndentedString(edgeLabel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    beacons: ").append(toIndentedString(beacons)).append("\n");
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

