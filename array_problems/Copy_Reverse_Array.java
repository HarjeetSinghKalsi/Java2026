package array_problems;

import java.util.Arrays;

public class Copy_Reverse_Array 
{
	public static void main(String[] args) 
	 {
		 String name1[] = {"java", "python", "c++",   "javascript"  , "machine learning"};
		 String name2[]= new String [5];
		 
		for (int i=0,k=4; i<name1.length; i++, k--)
		 {
			 name2[k] =   name1[i];	
		 }
		
		 System.out.println(Arrays.toString(name1));
		 System.out.println(Arrays.toString(name2));
		 
	 }

}
