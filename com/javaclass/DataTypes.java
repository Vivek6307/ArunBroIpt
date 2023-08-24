package com.javaclass;

public class DataTypes {
int j ;

boolean bln = true;
	
	public void primiviteDataTypes(){
		
		byte b;  //variable declared 
		
		b = 127;   //assigned value
		
		float f = 1.2f;
		
		System.out.println("Varaible b value is "+b);
		
		int i = 20;
		
		System.out.println(f);
		

	}
	
	public void nonPrimitiveDataTypes(){
		
		
		String s = "Java@#$455 ";
		
	//	System.out.println(s);
		
		int [] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[6]);
		
		
	}
	
	public static void main(String[] args) {
		
		DataTypes dts = new DataTypes();
		
	//	dts.primiviteDataTypes();
		
	//	dts.nonPrimitiveDataTypes();
		
	}
	
	
}
