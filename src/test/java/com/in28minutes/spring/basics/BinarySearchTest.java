package com.in28minutes.spring.basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.SpringIn5StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {
	
	
	//Get this bean from the contest
	@Autowired
	BinarySearchImpl binarySearch;
	@Test
	public void testBasicScenario() {
		//call method on binarySearch
		//check if the value is correct
		int res = binarySearch.binarySearch(new int [] {}, 5);
		assertEquals(3, res);
	}

}
