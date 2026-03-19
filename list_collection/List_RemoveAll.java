package list_collection;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveAll {

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
		System.out.println("add the collection 1 and 2 " + l2);
		
		l2.removeAll(li);
		System.out.println("removed the collection 1 and 2 " + l2); // remove the 1st collection
		
		

	}

}
