package com.cicd.docker_jenkins_integration_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

	public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationSampleApplication.class);


	@PostConstruct
	public void init(){
		logger.info("Application initialized ....");
		logger.info("Used for docker jenkins integration sample .....");
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
	}

}
