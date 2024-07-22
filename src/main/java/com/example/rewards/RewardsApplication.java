package com.example.rewards;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RewardsApplication {

		    private static final Logger logger = (Logger) LoggerFactory.getLogger(RewardsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RewardsApplication.class, args);
		logger.info("welcome to rewards application using sprintboots");

	}

}
