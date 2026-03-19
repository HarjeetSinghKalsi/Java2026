package map_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Iterator_Using_EntrySet {

	public static void main(String[] args)
	{
		Map <Integer, String> m1   = new HashMap<Integer, String>();
		m1.put(1, null);
		m1.put(2, null);
		m1.put(3, "AI");
		m1.put(4, "c++");
		
		for (Entry<Integer, String>  e1 :  m1.entrySet()) //another way to fetch key values together entrySet method
		 {
			System.out.println(e1);
		 }
		

	}

}
