package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	SortAlgorithm bubbleSortAlgorithm;
	
	@Autowired
	SortAlgorithm quickSortAlgorithm;
	
	
	public int binarySearch(int []numbers, int numberToSearchFor) {
		
		numbers = quickSortAlgorithm.sort(numbers);
		//searching in array
		//return result
		return 3;
	}
}
