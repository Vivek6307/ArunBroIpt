package com.java;

public class Variables_ {
	
	
	int i = 10; //class Variable
	
	static int k = 45;
	
	static Variables_ vs ;
	
	public static  void demo(){
		
		int j = 20; //Local variables
		
		
		System.out.println(j);
		
		System.out.println(k);
		
		System.out.println(vs.i);
		
		
		
	}
	
	
	public void demo1(){
		
		
		
		System.out.println("Class Variable accesed "+i);
		
		System.out.println(k);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		 vs = new Variables_();
		
		demo();
		
		vs.demo1();
		
		
		System.out.println(vs.i);
		
		System.out.println(k);
		
		
		
	}
	
	
	

}
