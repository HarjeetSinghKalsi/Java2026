package interview_programs2026;

import java.util.Arrays;

public class Copy_Array_In_Reverse_Order {

	   public static void main(String[] args)
	   {
		   int num[] = {13,56,88,99,65};
		   int num1[] = new int [5];
		   
		   for (int i=0,k=4;  i<num.length;i++, k--)
		   {
			     num1[k] =   num[i];
		
	       }
		   System.out.println(Arrays.toString(num));
		   System.out.println(Arrays.toString(num1));
		

	}

}
