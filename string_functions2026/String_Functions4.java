package string_functions2026;

public class String_Functions4 {

	public static void main(String[] args) 
	{
	  //matches-> check if given String ends with l
		 String s1 = "school";
		 boolean b1 = s1.matches("(.*)l"); //(.*) is used to search letters 
		 System.out.println(b1);
		
	  //matches-> check if given String starts with H
		 String s2 = "Harjeet";
		 boolean b2 = s2.matches("H(.*)");
		 System.out.println(b2);
		 
	  //matches->  in a given String check if 'a' is present or not
		 String s3 = "Harjeeta";
		 boolean b3 = s3.matches("(.*)a(.*)"); //multi character search
		 System.out.println(b3);	 
		
	  //matches->  in a given String check if exact 4 letter are present or not
		 String s4 = "Harj";
		 boolean b4 = s4.matches("...."); // using .
		 System.out.println(b4);	 
			 
		

	}

}
