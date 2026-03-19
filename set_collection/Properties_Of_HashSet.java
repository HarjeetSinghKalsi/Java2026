package set_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Properties_Of_HashSet {

	public static void main(String[] args) {
		
	  HashSet s1 = new HashSet();
	    s1.add("harjeet");
		s1.add("harjeet");
		s1.add(null);
		s1.add(123);
		s1.add(89705056);
		s1.add(58.69);
		s1.add('M');
		s1.add(true);
		s1.add("harjeet");
		s1.add("singh");
		s1.add(123);
		s1.add(89705056);
		  System.out.println(s1);
		  
		Queue q1 =   new LinkedList();
		q1.add(345);
		q1.add(567);
		q1.add(25);
		Iterator i1 =q1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
