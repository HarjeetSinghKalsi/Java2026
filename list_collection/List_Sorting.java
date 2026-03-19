package list_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Sorting {
  //sorting can be workout for homogenous vlaues
	
	public static void main(String[] args)
	{
		List li =  new ArrayList();
		 li.add(96);
		 li.add(785);
		 li.add(14);
		 li.add(123);
		 li.add(578);
		 System.out.println("Before sorting -> " + li);
		 Collections.sort(li);
		 System.out.println("After sorting -> " + li); 
		 
	}

}
