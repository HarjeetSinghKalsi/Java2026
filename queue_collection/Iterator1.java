package queue_collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Iterator1 {

	public static void main(String[] args) 
	{
		Queue li = new PriorityQueue();
		  li.add("harjeet");
		  li.add("singh");
		  li.add("kalsi");
		  li.add("QA");
		  li.add("Engineer");
		  
		  Iterator i2 = li.iterator();
		   while(i2.hasNext())
		    {
			  System.out.println(i2.next());
		    }
		  
	}

}
