package com.in28minutes.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics")
public class SpringIn5StepsXmlContextApplication {

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
			// applicationContext.close();
		}

	}

}
