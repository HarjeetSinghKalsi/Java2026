package interview_programs2026;
import java.util.HashMap;
import java.util.Map;

//find out the count of duplicate character from given String

public class Count_Duplicate_Character_Using_HahMap
{
  public static void main(String[] args)
	
{
	String s1 = "automation";	
	Map <Character, Integer> m1 = new HashMap<Character, Integer>();
	for (char m2 : s1.toCharArray())
	 {
	   m1.put(m2, m1.getOrDefault(m2, 0)+1);// getOrDefault method is used to return the default value -
		                                     // when the key is not present, which helps in -
	 }	                                     //counting occurrences without null checks		
	for(Map.Entry<Character, Integer> m2: m1.entrySet())
	{
		if (m2.getValue()>1)
		{
			System.out.println(m2.getKey() + "-> " + m2.getValue());
		}
	}

	}
}
