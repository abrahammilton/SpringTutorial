package com.aby.spring.tutorials.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.aby.spring.tutorials.TutorialsBasicApplication;

//Load context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TutorialsBasicApplication.class)
public class BinarySearchTest {

	//Get this bean from context
	@Autowired
	BinarySearchImpl search;
	
	@Test
	public void testBasicScenario() {
		//call method in binarySearch
		int actual = search.binarySearch(new int[] {}, 5);
		//check value
		assertEquals(3, actual);
	}

}
