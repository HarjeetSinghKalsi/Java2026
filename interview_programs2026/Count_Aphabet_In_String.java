package interview_programs2026;

public class Count_Aphabet_In_String {

	public static void main(String[] args)
	{
		  int count = 0;
		String s1 = "Harjeet@123";
		char[] c1=        s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			boolean b1 = Character.isLetter(c1[i]);  //isDigit, isWhitespace
			if (b1 == true)
			{
				count++;
			}
		}
		System.out.println("count of alphabet is :" + count);
	}

}
