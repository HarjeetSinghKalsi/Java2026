package map_collection;

import java.util.HashMap;
import java.util.Map;

public class Iterator_Using_KeySet_Value {

	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put(null, 17);
		m1.put(null, 96);
		m1.put("test2", 78);
		m1.put("test3", 35);
		m1.put("test4", 02);
		
	   for (String s1 : m1.keySet())  //used to fetch the keys using iterator and for each loop
	     {
		    System.out.println(s1); 
	     }
	   
	   for(Integer i1  : m1.values()) // used to fetch the values using iterator 
	      {
		     System.out.println(i1);  
	      }
	   
	   
	   

	}

}
