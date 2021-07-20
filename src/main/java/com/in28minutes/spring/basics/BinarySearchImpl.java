package com.in28minutes.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger LOGGER  = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	@Qualifier("quick")
	SortAlgorithm sortAlgorithm;
	

	public int binarySearch(int []numbers, int numberToSearchFor) {
		
		numbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//searching in array
		//return result
		return 3;
	}
	
	
}
