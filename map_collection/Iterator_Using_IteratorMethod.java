package map_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iterator_Using_IteratorMethod {

	public static void main(String[] args) 
	{
		
		Map <Character, Integer> m1 = new HashMap<Character, Integer>();
		m1.put('M', 1001);
		m1.put('I', 1002);
		m1.put('N', 1003);
		m1.put('i', 1004);
		
		Set<Entry<Character, Integer>> s1 =    m1.entrySet();
		Iterator<Entry<Character,Integer>> i1 =  s1.iterator();
		   while(i1.hasNext())
		   {
			  System.out.println(i1.next()); 
		   }
		
		

	}

}
