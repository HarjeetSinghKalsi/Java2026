package string_functions2026;

public class String_Functions2 {

	public static void main(String[] args) 
	{
		String s1 ="Harjeet";
		String s2 = "harjeet";
		System.out.println(s1.equals(s2)); //compare two Strings
		System.out.println(s1.equalsIgnoreCase(s2)); //compare Strings and will ignore the upper or lower Case
		
		String s3 ="Harjeet ";
		String s4 = "singh";
		String s5 =  s3.concat(s4); //concat, combine two strings
		System.out.println(s5);
		
		
		String s6 ="Harjeet ";
		System.out.println(s6.replace('H', 'v')); //Replace char 
		
		String s7 ="Harjeet singh";
		System.out.println(s7.replaceAll("singh", "kalsi")); //ReplaceAll the String
		
		String s8 = "Hajreet kalsi";
		boolean b1 = s8.contains("kalsi"); //contains the string
		System.out.println(b1);
		
		

	}

}
