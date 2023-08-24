package com.java;

import java.util.Iterator;

public class StringFunctions {
	
	
	
	
	public static void main(String[] args) {
		
		String s = "Java";  //4 3   13 12
		
		int length = s.length();
		
		System.out.println(length);
		
		
		char charAt = s.charAt(1);
		
		System.out.println(charAt);
		
		for(int i = 0 ; i < s.length();i++) {
			
			System.out.println(s.charAt(i));
			
			
		}
		
		String s1 = "JAVA in porur";
		
		boolean equals = s1.equals(s);
		
		System.out.println(equals);
		
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		
		System.out.println(lowerCase);
		
		boolean startsWith = s1.startsWith("J");
		
		System.out.println(startsWith);
		
		
		boolean endsWith = s1.endsWith("A");
		
		System.out.println(endsWith);
		
		boolean contains = s1.contains("in");
		
		System.out.println(contains);
		
		int indexOf = s1.indexOf('A');
		
		System.out.println(indexOf);
		
		int lastIndexOf = s1.lastIndexOf('A');
		
		System.out.println(lastIndexOf);
		
		String replace = s1.replace("porur", "Adayar");
		System.out.println(replace);
		
		
		
		
		String substring = s1.substring(8, 13);
		
		System.out.println(substring);
		
		String s2 = "Java in Adayar";
		
		
		boolean empty = s2.isEmpty();
		
		System.out.println(empty);
		
		
		String[] split = s2.split(" ");
		
		System.out.println(split[1]);
		
		String s3 = "Java";
		
		String s4 = "java";
		
		System.out.println(s3.compareTo(s4));
		
		
		
	}

}
