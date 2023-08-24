package java_Programs;

import java.util.Scanner;

public class Amstrong {
	static int temp, a, ans;

	public static void main(String[] args) {
		System.out.println("Enter The Num = ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		temp = n;

		while (n > 0) {
			a = n % 10; // %-->Remainder
			ans = ans + (a * a * a);
			n = n / 10; // /-->Quotient

		}
		if (temp == ans) {
			System.out.println("Amstrong Num");
		} else {
			System.out.println("Not Amstrong Num");
		}
		s.close();
	}
}
