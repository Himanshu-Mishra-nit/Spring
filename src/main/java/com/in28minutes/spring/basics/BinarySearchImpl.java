package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
