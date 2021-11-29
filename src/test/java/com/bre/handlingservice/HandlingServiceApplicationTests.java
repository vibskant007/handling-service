
package com.bre.handlingservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.testng.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HandlingServiceApplicationTests {

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@LocalServerPort
	private int port;

	@Test
	public void testCreateStudent() throws Exception {
		String body = "{\n" +
				"\t\"orderId\" : \"12345\",\n" +
				"\t\"book\" : {\n" +
				"\t\"price\" : 200,\n" +
				"\t\"quantity\" : 20\n" +
				"\t},\n" +
				"\t\"membership\":{\n" +
				"\t\t\n" +
				"\t},\n" +
				"\t\"physicalOrder\" :{\n" +
				"\t\t\n" +
				"\t},\n" +
				"\t\"video\" :{\n" +
				"\t\t\n" +
				"\t},\n" +
				"\t\"status\" : true\n" +
				"}";
		HttpEntity<String> entity = new HttpEntity<String>(body, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/v1/api/apply-rule"), HttpMethod.POST, entity, String.class);

		System.out.println(response.getBody().toString());

		assertEquals(200,response.getStatusCodeValue());
		assertEquals("{\n" +
				"    \"message\": \"Processed Packaging & Commission !\",\n" +
				"    \"success\": true\n" +
				"}",response.getBody());

	}



	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}



}