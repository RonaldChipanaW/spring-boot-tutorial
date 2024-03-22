package com.codesign.proy1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proy1Application {
	private static Logger logger = LoggerFactory.getLogger(Proy1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Proy1Application.class, args);
		logger.debug("MI mensaje debug");
		logger.info("MI mensaje info");
		logger.warn("MI mensaje warn");
		logger.error("MI mensaje error");
	}

}
