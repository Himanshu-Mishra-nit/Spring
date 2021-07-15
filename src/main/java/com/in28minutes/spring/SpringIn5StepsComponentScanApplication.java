package com.in28minutes.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.componentscan.ComponentPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.componentscan")
public class SpringIn5StepsComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class)) {
			ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);

			LOGGER.info("{}", componentPersonDAO);
		}

	}

}
