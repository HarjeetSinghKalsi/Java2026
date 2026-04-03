package interview_programs2026;

import java.util.Arrays;

public class Copy_One_Array_To_Another {

	public static void main(String[] args) {
		
		{
			int num[] = {10,56,78,45,77};
			int num1[] = new int [5];
			
			
			for(int i=0; i<num.length;i++)
			{
				    num1[i] =    num[i];
			}
			System.out.println(Arrays.toString(num));
			System.out.println(Arrays.toString(num1));

	}
	}
}
