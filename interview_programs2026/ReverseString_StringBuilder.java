package interview_programs2026;

public class ReverseString_StringBuilder {

	public static void main(String[] args) 
	{
		String input ="Hajreet";
		System.out.println(input);
		
		StringBuilder s1 = new StringBuilder(input);
		s1.reverse();
		System.out.println(s1);

	}

}
