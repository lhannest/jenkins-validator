package bio.knowledge.validator.beacon;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import bio.knowledge.client.ApiClient;
import bio.knowledge.client.ApiException;
import bio.knowledge.client.api.ConceptsApi;
import bio.knowledge.client.api.MetadataApi;
import bio.knowledge.client.api.StatementsApi;
import bio.knowledge.client.model.BeaconConcept;
import bio.knowledge.client.model.BeaconStatement;
import bio.knowledge.validator.BeaconTestBase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveEndpointsTests extends BeaconTestBase {
	
	@Test
	public void testConceptsCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		conceptsApi.getConcepts(Arrays.asList("e"), null, 1);
	}

	@Test
	public void testConceptDetailsCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		List<BeaconConcept> concepts = conceptsApi.getConcepts(Arrays.asList("e"), null, 1);

		if (concepts.isEmpty()) {
			fail("Could not run test since concepts endpoint returned empty");
		}

		String conceptId = concepts.get(0).getId();

		conceptsApi.getConceptDetails(conceptId);
	}

	@Test
	public void testExactMatchesToConceptIdCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);

		List<BeaconConcept> concepts = conceptsApi.getConcepts(Arrays.asList("e"), null, 1);

		if (concepts.isEmpty()) {
			fail("Could not run test since concepts endpoint returned empty");
		}

		String conceptId = concepts.get(0).getId();
		
		conceptsApi.getExactMatchesToConceptList(Arrays.asList(conceptId));
	}

	@Test
	public void testExactMatchesToConceptListCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		List<BeaconConcept> concepts = conceptsApi.getConcepts(Arrays.asList("e"), null, 1);

		if (concepts.isEmpty()) {
			fail("Could not run test since concepts endpoint returned empty");
		}

		String conceptId = concepts.get(0).getId();

		conceptsApi.getExactMatchesToConceptList(Arrays.asList(conceptId));
	}

	@Test
	public void testStatementsCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		StatementsApi statementsApi = new StatementsApi(apiClient);
		List<BeaconConcept> concepts = conceptsApi.getConcepts(Arrays.asList("e"), null, 1);

		if (concepts.isEmpty()) {
			fail("Could not run test since concepts endpoint returned empty");
		}

		String conceptId = concepts.get(0).getId();

		statementsApi.getStatements(Arrays.asList(conceptId), null, null, null, null, null, 1);
	}

	@Test
	public void testStatementDetails() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		ConceptsApi conceptsApi = new ConceptsApi(apiClient);
		StatementsApi statementsApi = new StatementsApi(apiClient);
		List<BeaconConcept> concepts = conceptsApi.getConcepts(Arrays.asList("e"), null, 50);

		if (concepts.isEmpty()) {
			fail("Could not run test since concepts endpoint returned empty");
		}

		for (BeaconConcept concept : concepts) {
			String conceptId = concept.getId();
			List<BeaconStatement> statements = statementsApi.getStatements(Arrays.asList(conceptId), null, null, null, null,
					null, 1);

			if (!statements.isEmpty()) {
				String statementId = statements.get(0).getId();

				statementsApi.getStatementDetails(statementId, null, 1);
				return;
			}
		}

		fail("Could not find any evidence to test this endpoint");

	}

	@Test
	public void testKmapCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		MetadataApi metadataApi = new MetadataApi(apiClient);
		metadataApi.getKnowledgeMap();
	}

	@Test
	public void testTypesCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		MetadataApi metadataApi = new MetadataApi(apiClient);
		metadataApi.getConceptCategories();
	}

	@Test
	public void testPredicatesCall() throws ApiException {
		ApiClient apiClient = rule.getBeaconApiClient(BASE_PATH);
		MetadataApi metadataApi = new MetadataApi(apiClient);
		metadataApi.getPredicates();
	}

}
