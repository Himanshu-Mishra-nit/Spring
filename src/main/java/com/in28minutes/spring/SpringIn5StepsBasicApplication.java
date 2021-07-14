package com.in28minutes.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args); 
		BinarySearchImpl binary = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binary1 = applicationContext.getBean(BinarySearchImpl.class);
		int result = binary.binarySearch(new int[] {12,4,3}, 3);
		System.out.println(result);
		System.out.println(binary);
		System.out.println(binary1 );
		
		
		
	}

}
