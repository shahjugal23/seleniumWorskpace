package com.practice.testng;

import org.testng.annotations.Test;

public class Priority {
	
	/***
	 *	First preference: Non-prioritized methods : Based on alphabetical order
		Second preference: Prioritized methods: 0 to N . Same priority then alphabetically.
		
		Use enabled =false to SKIP a testcase
	 */
	
	@Test(priority = 0)
	public void One() {
		System.out.println("This is the Test Case number One");
	}
	
	@Test(priority = 1)
	public void Two() {
		System.out.println("This is the Test Case number Two");
	}

	@Test()
	public void Three() {
		System.out.println("This is the Test Case number Three");
	}
	
	@Test(priority = 3)
	public void Four() {
		System.out.println("This is the Test Case number Four");
	}

}
