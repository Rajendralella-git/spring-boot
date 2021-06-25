package com.mkyong.core.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MainControllerTest {

	// bind the above RANDOM_PORT
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAdd() throws Exception {

		ResponseEntity<Integer> response = restTemplate
				.getForEntity(new URL("http://localhost:" + port + "/add").toString(), Integer.class);
		assertEquals(Integer.parseInt("3"), Integer.parseInt(response.getBody().toString()));

	}

	@Test
	public void testSub() throws Exception {

		ResponseEntity<String> response = restTemplate
				.getForEntity(new URL("http://localhost:" + port + "/sub").toString(), String.class);
		assertEquals(Integer.parseInt("1"), Integer.parseInt(response.getBody().toString()));

	}

	@Test
	public void testMul() throws Exception {

		ResponseEntity<String> response = restTemplate
				.getForEntity(new URL("http://localhost:" + port + "/mul").toString(), String.class);
		assertEquals(Integer.parseInt("6"), Integer.parseInt(response.getBody().toString()));

	}

}
