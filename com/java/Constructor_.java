package com.java;

public class Constructor_ {

	public Constructor_() {
		
		this("Sachin");

		System.out.println("Constructor ");

	}

	public Constructor_(String s) {
		
		this("Sachin",100);

		System.out.println(s);

	}
	
	public Constructor_(String name , int rollNO) {

		this("Chennai","Maths");
		
		System.out.println(name+rollNO);

	}

	public Constructor_(String address,String Subject) {

		System.out.println(address+Subject);

	}

	public static void main(String[] args) {

		Constructor_ cs = new Constructor_();
		
		
		

	}

}
