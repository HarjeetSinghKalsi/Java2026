 package interview_programs2026;

import java.util.Arrays;

public class Third_Largest_Number_UsingArray {

	public static void main(String[] args)
	{
		int number[] = {10,50,90,100, 200, 100};
		int largest = Integer.MIN_VALUE;  // Integer.MIN_VALUE is smallest possible integer value in Java
		int secondlargest= Integer.MIN_VALUE;
		int thirdlargest = Integer.MIN_VALUE;
		
		for (int i =0; i<number.length; i++)
		{
			if (number[i] > largest)
			{	
				thirdlargest = secondlargest;
				secondlargest = largest;
				largest = number[i];
			}
			
			else if (number[i] > secondlargest && number[i]!=largest)
			{
				thirdlargest = secondlargest;
				secondlargest = number[i];
			}
			
			else if (number[i] > thirdlargest && number[i]!= secondlargest && number[i]!= largest )
			{
				thirdlargest=number[i];
			}
		}
		System.out.println(Arrays.toString(number));
		 System.out.println("largest is " + largest);
		 System.out.println("second largest is " + secondlargest);
		 System.out.println("third largest is " + thirdlargest);
		

	}

}
