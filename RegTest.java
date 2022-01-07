package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegTest {
	@Test(dataProvider="getData")
	public void registerUser(String username, String password) {
		
	}
	@DataProvider
	
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		//1st row
		data[0][0] = "U1";
		data[0][1] = "P1";
	
		//2nd row
		data[1][0] = "U2";
		data[1][1] = "P2";
		
		//3rd row
		data[2][0] = "U3";
		data[2][1] = "P3";
		
		return data;
	}


}
