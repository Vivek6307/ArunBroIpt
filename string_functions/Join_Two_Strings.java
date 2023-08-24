package string_functions;

public class Join_Two_Strings {

	public static void main(String[] args) {
		//create first string
		String firstname ="Vivek ";
		System.out.println("first name :"+firstname);

		//create second string
		String Secondname ="Vinoth";
		System.out.println("Second name :"+Secondname);
		
		//join two strings
		String Joining = firstname.concat(Secondname);
		System.out.println("Joined Two String :"+Joining );
	}

}
