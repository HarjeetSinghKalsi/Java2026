package interview_programs2026;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		
		String s1 ="angel";
		String s2 ="angle";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		             Arrays.sort(c1);
		             Arrays.sort(c2); 
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b1 =(Arrays.equals(c1, c2));
		System.out.println(b1);
		if(b1 == true)
		{
			System.out.println("it is anagram");
		}
		else
		{
			System.out.println("it is not an anagram");
		}
		

	}

}
