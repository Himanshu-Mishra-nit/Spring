package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort Algo");
		return numbers;
	}

}
