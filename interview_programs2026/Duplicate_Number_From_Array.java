package interview_programs2026;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Number_From_Array {

	public static void main(String[] args) 
	{
		int number[] = {23,23,45,78,90,2};
		
		Set<Integer> s1 = new HashSet<>();
		for(int s2  :number)
		{
			if (s1.add(s2)==false)
			{
				System.out.println("duplicate number is: " + s2);
			}
		}
		
	}

}
