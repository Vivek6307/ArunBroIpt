package javaaa_Prac;

public class String_ {

	public static void main(String[] args) {

		String s = "Java training in Annanagar";

		int length = s.length();

		System.out.println(length);

		char charAt = s.charAt(0);

		System.out.println(charAt);

		String upperCase = s.toUpperCase();

		String s1 = "JAVA";

		System.out.println(s);

		System.out.println(upperCase);

		String lowerCase = s1.toLowerCase();

		System.out.println(lowerCase);

		boolean equals = s.equals(s1);

		System.out.println(equals);

		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s);

		System.out.println(equalsIgnoreCase);

		boolean startsWith = s.startsWith("java");

		System.out.println(startsWith);

		boolean endsWith = s.endsWith("porur");

		System.out.println(endsWith);

		boolean contains = s.contains("po");

		System.out.println(contains);

		int indexOf = s.indexOf("a");

		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf("a");

		System.out.println(lastIndexOf);

		String replace = s.replace("Annanagar", "Adayar");

		System.out.println(replace);

		String substring = s.substring(5, 13);

		System.out.println(substring);

		String s3 = "";

		boolean empty = s3.isEmpty();

		System.out.println(empty);

	}

}
