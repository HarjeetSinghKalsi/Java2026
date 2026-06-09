package interview_programs2026;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurance_of_Single_Character {

	public static void main(String[] args)
	{
		String s1 ="Programming";
		char targetchar = 'g';
		Map<Character, Integer> m1 = new HashMap<>();
		for(char m2: s1.toCharArray())
		{
			m1.put(m2, m1.getOrDefault(m2, 0)+1);
		}
		
		System.out.println(targetchar + " -> " + m1.getOrDefault(targetchar, 0));
	}

}
