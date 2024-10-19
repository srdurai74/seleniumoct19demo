package com.stackroute.demoprojectoct19;

public class StringDemo4{ 
	
	
	public void demo1() {
		
		String msg1 = "Welcome to Java";
		
		System.out.println(msg1.contains("Java"));
		
		System.out.println(msg1.charAt(9));
		
		String resultmsg = "16,000+ results for Samsung1";
		
		System.out.println(resultmsg.endsWith("Samsung"));
		
		String x1 = "Welcome";
		String x2 = " to Java";
		String y = x1.concat(x2);
		
		System.out.println(y);
		
		System.out.println(msg1.valueOf(123));
		
		String m1 = " ";
		// whitespace will be considered as string, returns false
		System.out.println(m1.isEmpty());
		
		// whitespace will be not be considered as string, returns true
		System.out.println(m1.isBlank());
		
		
		System.out.println(msg1.replace("Java","Python"));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
