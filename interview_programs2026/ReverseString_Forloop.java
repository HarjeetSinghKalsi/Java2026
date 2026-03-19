package interview_programs2026;

public class ReverseString_Forloop
{
	public static void main(String[] args) 
	{
		String input ="Harjeet";
		System.out.println(input);
		String output ="";
		for (int i=input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
		

	}

}
