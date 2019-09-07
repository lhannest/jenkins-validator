package bio.knowledge.aggregator.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-25T19:34:49.338-07:00")

@Controller
public class PredicatesApiController implements PredicatesApi {

    private static final Logger log = LoggerFactory.getLogger(PredicatesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PredicatesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Object>> getPredicatesDetails(@ApiParam(value = "set of aggregator indices of beacons to constrain predicates returned ") @Valid @RequestParam(value = "beacons", required = false) List<Integer> beacons) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Object>>(objectMapper.readValue("[ {  \"id\" : \"BLM:affects_risk_for\",  \"uri\" : \"http://bioentity.io/vocab/affects_risk_for\",  \"edge_label\" : \"affects_risk_for\",  \"description\" : \"holds between two entities where exposure to one entity \nalters the chance of developing the other\n\",  \"beacons\" : [ {    \"beacon\" : 1,    \"predicates\" : [ {      \"id\" : \"SEMMEDDB:PREDISPOSES\",      \"uri\" : \"https://metamap.nlm.nih.gov/predicate/PREDISPOSES\",      \"relation\" : \"PREDISPOSES\",      \"description\" : \"agent which predisposes individual to a given condition\",      \"frequency\" : 123    } ]  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Object>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
