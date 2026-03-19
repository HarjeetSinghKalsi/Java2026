package list_collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

	public static void main(String[] args) 
	{
		Vector  v1 = new Vector();
		v1.add(85);
		v1.add(105);
		v1.add("harjeet");
		v1.add(04);
		v1.add(74);
		
		Enumeration e1 =  v1.elements(); //it is used for Iteration in legacy class i.e. vector, stack etc.
		   while(e1.hasMoreElements())
		      {
		         System.out.println(e1.nextElement());
		      }
		
	}

}
