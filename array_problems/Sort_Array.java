package array_problems;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) 
	{
		String name = "harjeet";
		char [] c1 =  name.toCharArray(); //convert String into char of array
		System.out.println(Arrays.toString(c1)); //convert string in array
		Arrays.sort(c1); //sort array 
		System.out.println(Arrays.toString(c1));
		

	}

}
