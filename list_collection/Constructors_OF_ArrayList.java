package list_collection;

import java.util.ArrayList;


public class Constructors_OF_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>(); //Default constructor means by default 10 capacity
		a1.add(96);
		a1.add(96);
		a1.add(null);
		a1.add(25);
		a1.add(123);
		a1.add(578);
		System.out.println(a1);
		
		ArrayList <Integer>a2 =new ArrayList<Integer>(a1); //Copy constructor (creating from another list)
		System.out.println(a2);
		
		ArrayList<Integer> a3 = new ArrayList<Integer>(2); //Constructor with initial capacity is 2 and its growable and resizeing the size to 6
		a3.add(96); 
		a3.add(96);
		a3.add(78);
		a3.add(25);
		a3.add(123);
		a3.add(578);
		System.out.println(a3);
		
	
		  
	}

}
