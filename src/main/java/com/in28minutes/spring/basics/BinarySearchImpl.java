package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	@Autowired
	@Qualifier("quick")
	SortAlgorithm sortAlgorithm;
	

	public int binarySearch(int []numbers, int numberToSearchFor) {
		
		numbers = sortAlgorithm.sort(numbers);
		//searching in array
		//return result
		return 3;
	}
}
