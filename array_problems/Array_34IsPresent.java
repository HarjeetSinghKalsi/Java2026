package array_problems;

public class Array_34IsPresent {

	public static void main(String[] args) 
	{
		int num[] = {10,45,76,34};
		int numpresent = 34;
		
		for (int i =0; i<4; i++)
		{
		  if (num[i] == numpresent)
		   {
			System.out.println("Number -> " + numpresent + " is present in Array");
			System.out.println("Index of -> " + numpresent + " is -> " + i);
		   }
		}

	}

}
