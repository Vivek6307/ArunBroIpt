package com.object_oriented_program;

public class Java_str_replace {
	public static void main(String[] args) {
		String str = "w@el556#co6#me";
		str = str.replaceAll("[^a-zA-Z]","");
		//str = str.replace(" ", "");
		System.out.println(str);
	}

}
