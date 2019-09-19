package com.aby.spring.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aby.spring.tutorials.basic.BinarySearchImpl;

@SpringBootApplication
public class TutorialsBasicApplication {

	// Should tell spring the below
	// What are the beans? - By adding @Component to binarysearchImpl and BubbleSort
	// classes
	// What are the dependencies - By adding @Autowired to dependency in
	// binarySearchImpl
	// Where to search the beans - SpringBoot scans current package so not needed
	// for now

	public static void main(String[] args) {

		// Spring takes care of dependencies so below line is not needed
		// BinarySearchImpl binSearch = new BinarySearchImpl(new
		// BubbleSortAlgorithm());//loosely coupled to choose algorithm
		// com.aby.spring.tutorials.BubbleSortAlgorithm@3cd1a2f1

		// Application context manages all beans
		ApplicationContext applContext = SpringApplication.run(TutorialsBasicApplication.class, args);
		BinarySearchImpl binSearch = applContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binSearch1 = applContext.getBean(BinarySearchImpl.class);
		// one bean is instantiated for any number of applicationContexts -> singleton. 
		// Beans are singleton by default
		System.out.println("binSearch:::" + binSearch);
		System.out.println("binSearch1:::" + binSearch1);//When prototype scope is given, new instance is created
		
		int result = binSearch.binarySearch(new int[] { 124, 99, 234, 128 }, 124);
		System.out.println(result);
		// com.aby.spring.tutorials.BubbleSortAlgorithm@180da663
		// 3
	}

}
