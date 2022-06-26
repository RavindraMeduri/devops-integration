package com.example.devops.integration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SpringJenkinsDevopsIntegrationApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsDevopsIntegrationApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Case executing");
		assertEquals(true, true);
	}

}
