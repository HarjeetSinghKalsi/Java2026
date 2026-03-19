package array_problems;

import java.util.Arrays;

public class TwoArrays_Equals2 {

	public static void main(String[] args) 
	{
		int arr1[] = new int [4];
		arr1[0]=21;
		arr1[1]=85;
		arr1[2]=69;
		arr1[3]=41;
		
		int arr2[] = new int [4];
		arr2[0]=21;
		arr2[1]=85;
		arr2[2]=69;
		arr2[3]=41;
		
		 boolean b1 =   Arrays.equals(arr1, arr2);
		 System.out.println(b1);
	
	}

}
