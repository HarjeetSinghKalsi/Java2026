package interview_programs2026;

import java.util.HashSet;
import java.util.Set;

//Find out Duplicate Words from a String using HashSet

public class Duplicate_Element_Using_Hashset 
{	
  public static void main(String[] args) 
	{
	  String [] names = {"java","java", "python", "python","c++", "selenium"};
		
	  Set<String> s1  = new HashSet<String>();
	  
	  for (String s2:names)
	  {
		    if (s1.add(s2) == false)
		    {
			  System.out.println("duplicate element is: " + s2);
		    }
	  }
		

	}

}
