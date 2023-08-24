package com.java;

public class StringTypes {
	
	
	
	public static void main(String[] args) {
		
		String s = "Java";
		
		System.out.println(s);
		
		String upperCase = s.toUpperCase();  //JAVA
		
		System.out.println(upperCase);  //Java   JAVA
		 
		
		StringBuffer sb = new StringBuffer("Java");
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		//Literal String
		String s1 = "Java";
		
		
		String s2 = "Java";
		
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		//Non literal String
		String s3 = new String("Java");
		
		String s4 = new String("Java");
		
		System.out.println(s3 == s4);
		
		System.out.println(s3.equals(s4));
		
		
		
		
		
	}

}
