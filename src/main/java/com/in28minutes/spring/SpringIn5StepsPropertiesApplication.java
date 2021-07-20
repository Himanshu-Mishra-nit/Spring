package com.in28minutes.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties") 
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class)) {
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			
	
			System.out.println(service);
			System.out.println(service.returnServiceURL());
			
			// applicationContext.close();
		}

	}

}
