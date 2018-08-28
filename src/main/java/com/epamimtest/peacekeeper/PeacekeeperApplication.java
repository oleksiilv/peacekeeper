package com.epamimtest.peacekeeper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.epamimtest.peacekeeper"})
public class PeacekeeperApplication {

	private static final Logger log = LoggerFactory.getLogger(PeacekeeperApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PeacekeeperApplication.class, args);
	}

}
