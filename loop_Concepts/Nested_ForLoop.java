package loop_Concepts;

public class Nested_ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 8; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
		
		
		System.out.println("=================================");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("=================================");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println("=================================");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		System.out.println("===============================");
	}}

