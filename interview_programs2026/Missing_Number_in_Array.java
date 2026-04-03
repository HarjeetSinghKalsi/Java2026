package interview_programs2026;

public class Missing_Number_in_Array {

	public static void main(String[] args) 
	{
		int num[] = {1,2,4,5}; //3 is missing
		int sum =0;
		for (int i=0; i<num.length; i++)
		{
		  sum = sum + num[i];	
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1; j<=5; j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number is: " + (sum1 - sum));
		
	
	}

}
