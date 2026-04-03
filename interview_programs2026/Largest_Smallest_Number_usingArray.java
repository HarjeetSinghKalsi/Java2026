package interview_programs2026;

import java.util.Arrays;

public class Largest_Smallest_Number_usingArray {

	public static void main(String[] args) 
	{
		int number[] = {200,50,100,100,200,10};
		int largest = number[0]; //10
		int smallest = number [0];  //10
		
		for (int i=1; i<number.length; i++) //1st iteration
		{
			if (number[i]> largest)  //40>10 true
			{
				largest =number[i]; //40, it will repeat the loop till the largest value i.e. 80 gets
			}
			else if (number[i]< smallest) //40<10
			{
				smallest = number [i];  //5 it will repeat the loop till the smallest value i.e. 5 gets
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println("largest no is :" + largest);
		System.out.println("largest no is :" + smallest);
		

	}

}
