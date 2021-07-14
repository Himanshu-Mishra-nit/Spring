package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	
	public int[] sort(int[] numbers) {
		System.out.println("Bubble sort Algo");
		return numbers;
	}

}
