package map_collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Method2 {

	public static void main(String[] args) 
	{
		Map<String, Double> m1 = new HashMap<String, Double>();
		m1.put("harj", 54.656656);
		m1.put("test1", 96.343443);
		m1.put("test2", 78.2343243);
		m1.put("test3", 35.7878);
		m1.put("test4", 02.899898);
		
		Map<String, Double> m2 = new HashMap<String, Double>();
		m2.put("harj1", 154.565655);
		m2.put("test5", 88.89987);
		m2.put("test6", 278.324434);
		m2.put("test7", 305.568);
		m2.put("test8", 022.34343);

		
		boolean b1 =m1.containsKey("test*");  // it contains the value of Keys
		System.out.println(b1);
		
		boolean b2 = m1.containsValue(34.1111);  // it contains the actual values
		System.out.println(b2);
	}

}
