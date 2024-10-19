package com.stackroute.demoprojectoct19;

public class StringDemo{ 

	// No arg constructor
	public StringDemo() {
		System.out.println("Inside String demo constructor. No arguments");
	}
	
	
	public void demo1() {
		
		
		String[][] userdataset = new String[3][2];
		
		
		userdataset[0][0] = "admin";
		userdataset[0][1] = "admin";
		
		userdataset[1][0] = "admin";
		userdataset[1][1] = "welcome";

		userdataset[2][0] = "sam";
		userdataset[2][1] = "sam";

		for(int i=0; i<userdataset.length; i++) {
			for (int j=0; j<userdataset[i].length; j++) {
				System.out.println(userdataset[i][j]);
			}
		}
		
	
	}
	
}
