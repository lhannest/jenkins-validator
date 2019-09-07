package bio.knowledge.aggregator.model;

import java.util.Objects;
import bio.knowledge.aggregator.model.ServerBeaconPredicate;
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
 * ServerPredicatesByBeacon
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

public class ServerPredicatesByBeacon   {
  @JsonProperty("beacon")
  private Integer beacon = null;

  @JsonProperty("predicates")
  @Valid
  private List<ServerBeaconPredicate> predicates = null;

  public ServerPredicatesByBeacon beacon(Integer beacon) {
    this.beacon = beacon;
    return this;
  }

  /**
   * aggregator index of the given beacon 
   * @return beacon
  **/
  @ApiModelProperty(value = "aggregator index of the given beacon ")


  public Integer getBeacon() {
    return beacon;
  }

  public void setBeacon(Integer beacon) {
    this.beacon = beacon;
  }

  public ServerPredicatesByBeacon predicates(List<ServerBeaconPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public ServerPredicatesByBeacon addPredicatesItem(ServerBeaconPredicate predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<ServerBeaconPredicate>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

  /**
   * Get predicates
   * @return predicates
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServerBeaconPredicate> getPredicates() {
    return predicates;
  }

  public void setPredicates(List<ServerBeaconPredicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerPredicatesByBeacon serverPredicatesByBeacon = (ServerPredicatesByBeacon) o;
    return Objects.equals(this.beacon, serverPredicatesByBeacon.beacon) &&
        Objects.equals(this.predicates, serverPredicatesByBeacon.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beacon, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerPredicatesByBeacon {\n");
    
    sb.append("    beacon: ").append(toIndentedString(beacon)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

