package list_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOF_Iterator {

	public static void main(String[] args)
	{
		List li =new ArrayList();
		li.add(89);
		li.add(693);
		li.add(74);
		li.add(25);
		
		   ListIterator i2 = li.listIterator();
		   while(i2.hasNext())
		   {
			   System.out.println("forward iteration: -> " + i2.next());
		   }
		   
		   while(i2.hasPrevious())
		   {
			   System.out.println("backward iteration: -> " + i2.previous());
		   }
		
	}

}
