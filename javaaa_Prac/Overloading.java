package javaaa_Prac;

public class Overloading {
	private void student(String name) {
		
		System.out.println("Student Name Is= " + name);
	}
	private void student(int rollNum) {
		System.out.println("Student rollNum Is= " + rollNum);

	}
	public void student(int mark,int a) {
		System.out.println("Student mark Is= " + mark);

	}
	private void student(String name , int rollNum ,int mark , char grade) {
		System.out.println("Student Name rollNum and mark = "+ name +","+rollNum+"," + mark +","+grade);

	}
	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.student("vivek");
		ov.student(6307);
		ov.student(50, 25);
		ov.student("Vivek", 6307, 50,'B');
	}
	}

