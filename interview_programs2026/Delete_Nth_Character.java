package interview_programs2026;

public class Delete_Nth_Character {

	public static void main(String[] args) 
	{
		String s1 ="aaxbbyccz";
		int n=3;
		String result = nthchar(s1,n); 
		System.out.println(result);
	}	       
	public static String nthchar(String s1, int n)
	{
		StringBuilder s2 = new StringBuilder();
		for (int i=0; i<s1.length();i++)
		{
			if ((i+1)%n !=0)      //Condition to skip nth character
			{
				s2.append(s1.charAt(i));
			}
			
		}
		   return s2.toString();
	}
		

	
}

