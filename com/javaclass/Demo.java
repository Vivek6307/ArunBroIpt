package com.javaclass;

public class Demo {

	public int julySal() {

		int varPay = 10000;

		int fixPay = 700000;

		int totaljulySal = varPay + fixPay;
		return totaljulySal;
		
	
	}

	public int augSal() {

		int varPay = 10000;

		int fixPay = 800000;

		int totalaugSal = varPay + fixPay;
		
		return totalaugSal;

	}
	
	public void totalSalary() {
		
		int julySal = julySal();
		
		int augSal = augSal();

		int totalSalary = julySal + augSal;
		
		System.out.println(totalSalary);
		
		
	}

	public static void main(String[] args) {

		Encapsulation_ d = new Encapsulation_();

		System.out.println(d.j);
		
		Demo d1 = new Demo();
		
		d1.totalSalary();
		
		int i = d.getI();
		
		System.out.println(i);

	}

}
