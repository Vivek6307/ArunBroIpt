package javaaa_Prac;

//class level final
public final class Variable_Final {

	
	//variable level final
	final int a =5;
	
	int b = 10; //initialization
	 
	//method level final
	public final void methodcheck() {
		
		
		int c = 15+b;
		System.out.println(c);
		
}
	//static at method level
	public static void staticMethod() {
		
		System.out.println("staticmethod");

	}
	
	public void method1(int b) {
		//calling the class variable using this keyword
		System.out.println("This is Method 1");
		this.b=b;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
	}

}
