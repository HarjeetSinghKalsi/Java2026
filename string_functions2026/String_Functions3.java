package string_functions2026;

public class String_Functions3 
{
	public static void main(String[] args)
	
	{
	  // In a given String replace all the small alphabet
	     String s1 ="kv no 2 banglore";
	     System.out.println(s1.replaceAll("[a-z]" , ""));
	     
	  
	 // In a given String replace all the numeric 
		  String s2 ="50 cent";
		  System.out.println(s2.replaceAll("[0-9]" , ""));
		  
		  
	 // In a given String replace all the capital letters 
		  String s3 ="Harjeet Kalsi";
		  System.out.println(s3.replaceAll("[A-Z]" , ""));	
		  
		  	  
	//In a given String "My Name is Harjeet kalsi" replace all the spaces 
		  String s4 ="My Name is Harjeet Kalsi";
		  System.out.println(s4);
		  System.out.println(s4.replaceAll(" " , ""));	
		 	  
	

}
}
