package java_Programs;

import java.util.Iterator;
import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Table To Multiple");

		int a = s.nextInt();

		System.out.println("Till Which Number To Multiple");

		int b = s.nextInt();

		int c;

		for (int i = 1; i <= b; i++) {
			c = a * i;
			System.out.println(a + "*" + i + "=" + c);

		}

	}

}
