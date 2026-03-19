package string_functions2026;

public class String_Functions1
{
	public static void main(String[] args) 
	{
		
		String name ="Hajreet";
		System.out.println("Length of String Harjeet is : " + name.length());	//give the length/size of string
		System.out.println("Convert HARJEET in lower case : "+ name.toLowerCase()); //convert String into lower case
		System.out.println("Convert harjeet in upper case : "+ name.toUpperCase()); //convert String into upper case
		
		String name1 ="   I am a boy    ";
		System.out.println(name1);
		String name2 ="   I am a boy    ";
		System.out.println("trim the extra spaces :"+ name2.trim());  //trim the start and end extra spaces
		
		String name3 = "Welcome@123";
		System.out.println("Starting from 3rd index Welcome@123 : " + name3.substring(3)); //starting from this indexing
		System.out.println("Starting from 3rd index and end in 8th index Welcome@123 : "+ name3.substring(2, 8)); //starting and ending from this indexing
		
	}

}
