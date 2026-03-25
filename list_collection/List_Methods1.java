package list_collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods1 {

	public static void main(String[] args)
	{
		List li =  new ArrayList(); //collection 1
		 li.add(96);
		 li.add(785);
		 li.add(14);
		 li.add(123);
		 li.add(578);
		 System.out.println(li);
		 
		List l2 =  new ArrayList();  //collection 2
		l2.add("harjeet");
		l2.add("kalsi");
		l2.addAll(li);               //addAll method, it will add both the collection 1 and 2
		System.out.println(l2);
		
		System.out.println(l2.get(2)); //get the 2nd index value
		
		boolean b1 =li.equals(l2); //equals method
		System.out.println(b1);
		
		 
		
		
		

	}

}
