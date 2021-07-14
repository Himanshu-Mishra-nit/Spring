package com.in28minutes.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	
	public int[] sort(int[] numbers) {
		System.out.println("Bubble sort Algo");
		return numbers;
	}

}
