package com.Oxhead.BaseTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.Oxhead.BaseTest.CrossBrowerTesting.class)
public class ListenersClass {
	@Test
	public void move() {
	System.out.println("Test2");
	//System.out.println("Test2");

	}
}