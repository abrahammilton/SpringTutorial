package com.aby.spring.tutorials.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	// Class is tightly copuled with bubble sort algorithm because
	// if we need to change the algorithm, entire implemetation has to be changed

	// @Autowired
	// private SortAlgorithm bubbleSortAlgorithm;//dependency for this class

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm algorithm;

	// Constructor Injection
	/*
	 * public BinarySearchImpl(SortAlgorithm sa) { super(); this.sa = sa; }
	 */

	// Setter Injection
	// Not mandatory.. if setter or constructor is given, setter injection is used
	/*
	 * public void setSa(SortAlgorithm sa) { this.sa = sa; }
	 */

	public int binarySearch(int[] num, int num2Searchß) {

		int[] sortedNumbers = algorithm.sort(num);
		System.out.println(algorithm);

		// Sort an array
		// Search array
		// return result
		// Example the method implements bubble sort algorithm

		return 3;
	}

}
