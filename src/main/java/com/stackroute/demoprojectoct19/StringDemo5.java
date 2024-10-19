package com.stackroute.demoprojectoct19;

public class StringDemo5{ 
	
	
	public void demo1() {
		
		String[] cars = new String[5];
		cars[0] = "i10";
		cars[1] = "i20";
		cars[2] = "Swift";
		cars[3] = "Zen";
		cars[4] = "alto";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		String msg = "Welcome to Java programming";
		
		String[] msgArray = msg.split(" ");
		
		for(int i=0; i<msgArray.length; i++) {
			System.out.println(msgArray[i]);
		}
		
		int[][] mdimArray = new int[2][3];
		
		
		mdimArray[0][0] = 101;
		mdimArray[0][1] = 102;
		mdimArray[0][2] = 103;
		
		mdimArray[1][0] = 201;
		mdimArray[1][1] = 202;
		mdimArray[1][2] = 203;
		
		for(int i=0; i<mdimArray.length; i++) {
			for (int j=0; j<mdimArray[i].length; j++) {
				System.out.println(mdimArray[i][j]);
			}
		}
		
		
		
		
		
		
		
		
	
	}
	
}
