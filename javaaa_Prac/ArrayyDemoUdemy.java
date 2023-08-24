package javaaa_Prac;

public class ArrayyDemoUdemy {

	public static void main(String[] args) {

		int myNum = 5;

		String website = "Rahul Shetty Academy";

		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;

		System.out.println(myNum + "is the value stored in the myNum variable");

		System.out.println(website);

		System.out.println("====================================");

		//Arrays -
		int[] arr = new int[5];// 5, 10

		arr[0] = 1;

		arr[1] = 2;

		arr[2] = 4;

		arr[3] = 5;

		arr[4] = 6;
		System.out.println(arr[2]);

		// Array 
		int[] arr2 = { 1, 2, 4, 5, 6 };

		System.out.println(arr2[3]);

        //for loop arr.length - 5
		System.out.println("============ARRAY==================");

		for (int i = 0; i < arr.length; i++) // 4

		{

			System.out.println(arr[i]);

		}
		System.out.println("=============ARRAY Model 2=================");

		for (int i = 0; i < arr2.length; i++)

		{

			System.out.println(arr2[i]);

		}

		System.out.println("==============String Array FOR LOOP=============");

		String[] name = { "rahul", "shetty", "selenium" };

		for (int i = 0; i < name.length; i++)

		{

			System.out.println(name[i]);

		}
		System.out.println("============String Array FOR EACH===========");
		for (String s : name)

		{

			System.out.println(s);

		}
		System.out.println("====================================");

	}

}
