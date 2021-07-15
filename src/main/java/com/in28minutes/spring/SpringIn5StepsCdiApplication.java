package com.in28minutes.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.BinarySearchImpl;
import com.in28minutes.spring.cdi.SomeCdiBussiness;
import com.in28minutes.spring.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {
private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args); 
		SomeCdiBussiness someCdiBussiness = applicationContext.getBean(SomeCdiBussiness.class);
		LOGGER.info("{} dao - {}", someCdiBussiness, someCdiBussiness.getSomeCdiDao());
		
		
		
	}

}
