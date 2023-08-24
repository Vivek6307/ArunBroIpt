package string_functions;

public class Return_ {

	public static int add() {

		int no1 = 10;

		int no2 = 30;

		int sum = no1 + no2;

		// System.out.println(sum);

		return sum;

	}

	public Return_(int a) {

		System.out.println("Parameterized Constructor " + a);

	}

	public static void main(String[] args) {

		Return_ rt = new Return_(10);

		int add = add();

		System.out.println(add);

	}

}
