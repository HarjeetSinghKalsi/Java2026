package interview_programs2026;

import java.util.Arrays;

public class Second_Largest_Number_UsingArray {

	public static void main(String[] args)
	{
		int number[] = {56,889,889,66,63};
		int largest = number[0]; //56
		int secondlargest = number[0];  //56
		
		for (int i=1; i<number.length; i++)
		{
			if (number[i]>largest)
			{
				secondlargest = largest;
				largest = number[i];
			}
			
			else if (number[i] >secondlargest && number[i]!=largest )
			{
				secondlargest = number[i];
			}
		}
		
		System.out.println(Arrays.toString(number));
		System.out.println("largest no is :" + largest);
		System.out.println("second largest no is :" + secondlargest);
		

	}

}
