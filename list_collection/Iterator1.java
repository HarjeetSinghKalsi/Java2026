package list_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) 
	{
		List li 	 =new ArrayList();
		 li.add(96);
		 li.add(785);
		 li.add("harjeet");
		 li.add(123);
		 li.add(578);
		 
	  Iterator m1 = li.iterator(); 
		while (m1.hasNext())        // will check if the value is present or not, if yes
		  {
		    
		     System.out.println("Iterator: -> " + m1.next()); //then it will print the value
		  }
		
		

	}

}
