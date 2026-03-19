package array_problems;

public class Array_34IsPresent {

	public static void main(String[] args) 
	{
		int num[] = {10,45,76,34};
		int nopresent = 34;
		
		for (int i =0; i<4; i++)
		{
		  if (num[i] == nopresent)
		   {
			System.out.println("Number -> " + nopresent + " is present in Array");
			System.out.println("Index of -> " + nopresent + " is -> " + i);
		   }
		}

	}

}
