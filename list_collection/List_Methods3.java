package list_collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods3 {

	public static void main(String[] args) 
	{
	  List li 	 =new ArrayList();
		 li.add(96);
		 li.add(785);
		 li.add("harjeet");
		 li.add(123);
		 li.add(578);
		 System.out.println(li);
		 System.out.println(li.size());  //print the total length
		 
		 boolean b2 =li.contains("harjeet"); //check the condition
		 System.out.println(b2);
		  
		 li.clear();
		 System.out.println(li); //clear the array 
		 
		boolean b1 = li.isEmpty(); // check if array is empty or not
		System.out.println(b1);
		
		
		
		 
		 
		
	}

}
