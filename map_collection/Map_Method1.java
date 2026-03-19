package map_collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Method1 {

	public static void main(String[] args) {
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("harj", 54);
		m1.put("test1", 96);
		m1.put("test2", 78);
		m1.put("test3", 35);
		m1.put("test4", 02);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("harj1", 154);
		m2.put("test5", 88);
		m2.put("test6", 278);
		m2.put("test7", 305);
		m2.put("test8", 022);
		
		System.out.println(m2.equals(m1));  //equals m1 and m2
		
		m1.putAll(m2);          //put all the values of m1 into m2
		System.out.println(m1);
		
		m1.clear();          //clear value from m1
		System.out.println(m1);
		
		System.out.println(m1.isEmpty());   //check if m1 is Empty
		
		m1.putIfAbsent("test9", 555);   // add new elements in m1
		System.out.println(m1);
		
	}

}
