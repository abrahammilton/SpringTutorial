package com.aby.spring.tutorials.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary //takes priority when 2 dependecy classes has @component and also has higher priority than autowiring by name
@Qualifier("quick") // kind of autowiring by alias name
public class QuickSortAlgorithm implements SortAlgorithm {

	// Quick sort algorithm is outside implemetation class
	// any change to sorting logic can be done independently
	public int[] sort(int[] num) {
		// logic for bubble sort goes here
		return num;
	}
}
