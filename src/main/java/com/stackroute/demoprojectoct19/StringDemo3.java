package com.stackroute.demoprojectoct19;

public class StringDemo3{ 
	
	
	public void demo1() {
		
		System.out.println("Inside String demo - demo1");
		
		// String literals
		String msg1 = "Hello";
		String msg2 = "Hello";
//		String msg2 = msg1;
		
		
		
		// String object
		String msg3 = new String("Hello");
		
		// length
		System.out.println(msg1.length());
		
		// same address/hashcode
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());
		System.out.println(msg3.hashCode());
		
		// returns true and then false
		System.out.println(msg1 == msg2);
		System.out.println(msg2 == msg3);
		
		// returns true for both
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2.equals(msg3));
		
		
		
		
		
		
	}
	
	

}
