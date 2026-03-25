package set_collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet //Maintain insertion order without duplicates
{

	public static void main(String[] args)
	{
		Set s1 =	new LinkedHashSet();
		s1.add("harjeet");
		s1.add("harjeet");
		s1.add(null);
		s1.add(null);
		s1.add(89705056);
		s1.add(12);
		s1.add(58.69);
		s1.add('M');
		s1.add(true);
		s1.add("harjeet");
		s1.add("singh");
		s1.add(123);
		s1.add(89705056);
		  System.out.println(s1);
		  
		  

		

	}

}
