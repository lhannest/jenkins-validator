package bio.knowledge.validator.beacon;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import bio.knowledge.client.ApiClient;
import bio.knowledge.client.ApiException;
import bio.knowledge.client.api.ConceptsApi;
import bio.knowledge.client.api.StatementsApi;
import bio.knowledge.client.model.BeaconConcept;
import bio.knowledge.client.model.BeaconConceptWithDetails;
import bio.knowledge.client.model.BeaconStatement;
import bio.knowledge.client.model.BeaconStatementObject;
import bio.knowledge.client.model.BeaconStatementSubject;
import bio.knowledge.client.model.ExactMatchResponse;
import bio.knowledge.validator.BeaconTestBase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowTests extends BeaconTestBase {

	private final Integer EXACT_MATCH_PAGE_SIZE = 10;
	private final Integer CONCEPTS_PAGE_SIZE = 100;
	private final Integer STATEMENTS_PAGE_SIZE = 100;
	private final List<String> CONCEPTS_KEYWORDS = Arrays.asList("diabetes");
	private final List<String> CONCEPTS_TYPES = null;
	
	@Test
	public void testConcepts() throws ApiException {		
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		
		List<BeaconConcept> concepts = conceptsApi.getConcepts(CONCEPTS_KEYWORDS, CONCEPTS_TYPES, CONCEPTS_PAGE_SIZE);
		
		Assert.assertFalse(
				"No concepts found for filter keywords/types: " + CONCEPTS_KEYWORDS + "/" + CONCEPTS_TYPES,
				concepts == null || concepts.isEmpty()
		);
		
		Assert.assertFalse(
				"Requested page size of " + CONCEPTS_PAGE_SIZE + " got " + concepts.size() + " instead",
				concepts.size() > CONCEPTS_PAGE_SIZE
		);
		
		// Test that the filters apply to each concept
		for (BeaconConcept concept : concepts) {
			String name = concept.getName();
			String definition = concept.getDescription();
			
			List<String> categories = concept.getCategories();
			
			Assert.assertTrue(
					"Keyword filter failed for: " + concept.getId(),
					CONCEPTS_KEYWORDS.stream().anyMatch(k -> contains(name, k)) ||
					CONCEPTS_KEYWORDS.stream().anyMatch(k -> contains(definition, k))
			);
			
			Assert.assertTrue(
					"Type filter failed for: " + concept.getId(),
					CONCEPTS_TYPES == null || CONCEPTS_TYPES.stream().anyMatch(categories::contains)
			);
		}
	}
	
	@Test
	public void testConceptDetails() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		
		List<BeaconConcept> concepts = conceptsApi.getConcepts(CONCEPTS_KEYWORDS, CONCEPTS_TYPES, CONCEPTS_PAGE_SIZE);
		
		for (BeaconConcept concept : concepts) {
			BeaconConceptWithDetails detail = conceptsApi.getConceptDetails(concept.getId());
				
			if (detail.getId() == null) {
				warningRule.warn("Concept " + detail.getId() + " has null ID");
			}
			
			if (detail.getCategories() == null) {
				warningRule.warn("Concept " + detail.getId() + " has null type");
			}
			
			if (detail.getName() == null) {
				warningRule.warn("Concept " + detail.getId() + " has null name");
			}
			
			if (detail.getDescription() == null) {
				warningRule.warn("Concept " + detail.getId() + " has null definition");
			}
			
			if (detail.getSynonyms() == null) {
				warningRule.warn("Concept " + detail.getId() + " has null synonyms");
			}
			
			String msg = "Detail %1$s is not the same as concept %1$s, conceptId: %s";
			
			Assert.assertTrue(
					String.format(msg, "ID", concept.getId()),
					Objects.equals(detail.getId(), concept.getId())
			);
			
			Assert.assertTrue(
					String.format(msg, "definition", concept.getId()),
					Objects.equals(detail.getDescription(), concept.getDescription())
			);
			
			Assert.assertTrue(
					String.format(msg, "name", concept.getId()),
					Objects.equals(detail.getName(), concept.getName())
			);
			
			Assert.assertTrue(
					String.format(msg, "type", concept.getId()),
					Objects.equals(detail.getCategories(), concept.getCategories())
			);
		}
		
	}
	
	@Test
	public void testStatements() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		StatementsApi statementsApi = new StatementsApi(apiClient);
		
		//TODO: remove magic number
		List<BeaconConcept> concepts = conceptsApi.getConcepts(CONCEPTS_KEYWORDS, CONCEPTS_TYPES, 1);
		
		List<String> c = concepts.stream().map(x -> x.getId()).collect(Collectors.toList());
		
		//TODO: currently times out if more than 1 concept searched at statements endpoint
		List<BeaconStatement> statements = statementsApi.getStatements(c, null, null, null, null, null, STATEMENTS_PAGE_SIZE);
		
		for (BeaconStatement statement : statements) {
			boolean anyMatch = false;
			
			for (BeaconConcept concept : concepts) {
				BeaconStatementSubject subject = statement.getSubject();
				BeaconStatementObject object = statement.getObject();
				
				String msg = "Concept %s from statement %s does not have the same name and type as result from concept search";
				
				if (subject.getId().equals(concept.getId())) {
					anyMatch = true;
					Assert.assertTrue(
							String.format(msg, subject.getId(), statement.getId()),
							Objects.equals(subject.getCategories(), concept.getCategories()) &&
							Objects.equals(subject.getName(), concept.getName())
					);
				} else if (object.getId().equals(concept.getId())) {
					anyMatch = true;
					Assert.assertTrue(
							String.format(msg, object.getId(), statement.getId()),
							Objects.equals(object.getCategories(), concept.getCategories()) &&
							Objects.equals(object.getName(), concept.getName())
					);
				}
			}
			
			Assert.assertTrue("None of the given concepts found in statement " + statement.getId(), anyMatch);
		}
	}
	
	@Test
	public void testExactMatches() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		
		List<BeaconConcept> concepts = conceptsApi.getConcepts(CONCEPTS_KEYWORDS, CONCEPTS_TYPES, EXACT_MATCH_PAGE_SIZE);
		
		for (BeaconConcept concept : concepts) {
			List<ExactMatchResponse> matches = conceptsApi.getExactMatchesToConceptList(Arrays.asList(concept.getId()));
			
			Assert.assertTrue(
					"Exact matches to concept" + concept.getId() + " returned more than 1 response", 
					matches.size()==1
			);
			
			ExactMatchResponse match = matches.get(0);
			
			Assert.assertTrue(
						"Searched id doesn't match response id: " + concept.getId(),
						Objects.equals(concept.getId(), match.getId()));
			
			if (match.getHasExactMatches().size() != 0) {
				Assert.assertTrue("within_domain should be true if exact matches found", match.getWithinDomain());
			}
			
		}
	}
	
	private boolean contains(String superstring, String substring) {
		if (superstring != null) {
			return superstring.toLowerCase().contains(substring.toLowerCase());
		} else {
			return false;
		}
	}

}
