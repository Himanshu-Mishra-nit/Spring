package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		System.out.println("sort algo");
	}



	public int binarySearch(int []numbers, int numberToSearchFor) {
		
		numbers = sortAlgorithm.sort(numbers);
		//searching in array
		//return result
		return 3;
	}
}
