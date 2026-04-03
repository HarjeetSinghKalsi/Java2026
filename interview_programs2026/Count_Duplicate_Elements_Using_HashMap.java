package interview_programs2026;

import java.util.HashMap;
import java.util.Map;

public class Count_Duplicate_Elements_Using_HashMap {

//Find out Duplicate words in a String using HashMap
	
	public static void main(String[] args) 
	{
		String [] names = {"c++", "c++","java", "python", "selenium", "selenium"};
		
		Map <String, Integer> m1 = new HashMap<String, Integer>();
		for (String m2 : names)
		{
		  m1.put(m2, m1.getOrDefault(m2, 0)+1);// getOrDefault method is used to return the default value -
			                                     // when the key is not present, which helps in -
		}	                                     //counting occurrences without null checks	
		
		for(Map.Entry<String, Integer> m2:          m1.entrySet())
		{
			if(m2.getValue()>1)
			{
			System.out.println(m2.getKey()+ "-> " + m2.getValue());
			}
		}

	}

}
