	package interview_programs2026;

import java.util.HashMap;
import java.util.Map;

public class Count_Of_Occurence_of_Char_Using_HashMap {
	
//Find out count of occurrence of character from String using HashMap
	
	public static void main(String[] args)
	{
		String s1 = "Programming";
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		// Count occurrences
		for(char c1 : s1.toCharArray())
		{
			m1.put(c1, m1.getOrDefault(c1, 0)+1);
		}
		
		 // Print result
		for(Map.Entry<Character, Integer>    m2       : m1.entrySet())
		{
			System.out.println(m2.getKey() + "-> "+ m2.getValue());
		}
		

	}

}
