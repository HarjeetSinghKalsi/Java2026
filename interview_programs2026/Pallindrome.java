package interview_programs2026;

public class Pallindrome {

	public static void main(String[] args) 
	{
		String input ="radar";
		System.out.println(input);
		String output="";
		
		for (int i=input.length()-1; i>=0; i--)
		{
			char c1 =   input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		
		if (input.equals(output)==true)
		{
			System.out.println("it is pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
		
		

	}

}
