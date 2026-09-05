package com.cicd.docker_jenkins_integration_sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class DockerJenkinsIntegrationSampleApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationSampleApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case execution started docker jenkins integration sample ..");
		Assertions.assertTrue(true);
	}

}
