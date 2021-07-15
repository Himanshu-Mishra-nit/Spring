package com.in28minutes.spring;

//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binary = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binary1 = applicationContext.getBean(BinarySearchImpl.class);
			int result = binary.binarySearch(new int[] { 12, 4, 3 }, 3);
			System.out.println(result);
			System.out.println(binary);
			System.out.println(binary1);
			// applicationContext.close();
		}

	}

}
