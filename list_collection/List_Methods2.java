package list_collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods2 {

	public static void main(String[] args) 
	{
	  List li 	 =new ArrayList();
		 li.add(96);
		 li.add(785);
		 li.add("harjeet");
		 li.add(123);
		 li.add(578);
		 System.out.println("Before Remove -> " + li);
		 
		 li.remove(3);          //removing index 3
		 System.out.println("Index 3 Remove -> " + li);
		 
		 li.remove("harjeet");  //removing object
		 System.out.println("Object harjeet Remove -> " + li);
		 
		 System.out.println(li.get(2)); //give the value from index 2
		 System.out.println(li.set(2, "test")); //replace the value from index 2 and set new value as test
		 System.out.println(li); 
		 System.out.println(li.indexOf(785)); // give the index
		 
		 
		
	}

}
