package array_problems;

public class Array_String_Count 
{
  //find out the count of alphabet, special char, number and spaces from the string
	
	public static void main(String[] args) 
	{
		int countofalphabet = 0;
		int countofnumber = 0;
		int countofspaces = 0;
			
		String s1 = "Harjeet@#*1234  5";
		int totalStringlength =  s1.length();
		System.out.println("total string length is: " + totalStringlength);
		
		char[] c1 =   s1.toCharArray();
		for (int i=0; i<s1.length(); i++)
		{
		   boolean b1 =	Character.isLetter(c1[i]);
		   if (b1 == true)
		   {
			   countofalphabet++;
		   }   
		}
		System.out.println("number of alphabet are :" + countofalphabet );
		
//**********************************************************************************************************		
		for (int i=0; i<s1.length(); i++)
		{
		   boolean b2 =	Character.isDigit(c1[i]);
		   if (b2 == true)
		   {
			   countofnumber++;
		   }   
		}
		System.out.println("number of number are :" + countofnumber);

//***************************************************************************
		
		for (int i=0; i<s1.length(); i++)
		{
		   boolean b3 =	Character.isWhitespace(c1[i]);
		   if (b3 == true)
		   {
			   countofspaces++;
		   }   
		}
		System.out.println("number of spaces are :" + countofspaces);
		
//****************************************************************************************	
		 int i = totalStringlength;
		 int j = countofalphabet;
		 int k = countofnumber;
		 int l=  countofspaces; 
		 int countofspecialcharacter = i -j - k - l;
		 System.out.println("count of special char is: " + countofspecialcharacter);
	}

}
