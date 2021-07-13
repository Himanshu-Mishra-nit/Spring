package com.in28minutes.spring.basics;

public class BinarySearchImpl {
	SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int []numbers, int numberToSearchFor) {
		
		numbers = sortAlgorithm.sort(numbers);
		//searching in array
		//return result
		return 3;
	}
}
