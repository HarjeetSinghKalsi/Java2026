package set_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator1 {

	public static void main(String[] args)
	{
		Set s1 =	new HashSet();
		s1.add("harjeet");
		s1.add("singh");
		s1.add(null);
		s1.add(123);
		s1.add(89705056);
		
		Iterator s2 =  s1.iterator();
		  while(s2.hasNext())
		  {
			  System.out.println(s2.next());
		  }
		
		

	}

}
