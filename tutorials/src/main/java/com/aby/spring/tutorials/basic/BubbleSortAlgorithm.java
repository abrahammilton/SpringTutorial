package com.aby.spring.tutorials.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble") // kind of autowiring by alias name
public class BubbleSortAlgorithm implements SortAlgorithm {

	// Bubble sort algorithm is outside implemetation class
	// any change to sorting logic can be done independently
	public int[] sort(int[] num) {
		// logic for bubble sort goes here
		return num;
	}
}
