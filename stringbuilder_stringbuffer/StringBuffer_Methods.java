package stringbuilder_stringbuffer;

public class StringBuffer_Methods {

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("automation testing ");
		s1.append("engineering");   //append
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("selenium testing ");
		s2.insert(9, "java ");      //it will insert the string after that index
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("selenium testing ");
		s3.replace(0, 9, "api ");   //replace string from given index's
		System.out.println(s3);
		
		StringBuffer s4 = new StringBuffer("selenium testing ");
		s4.delete(0, 5);           //delete string from given index's
		System.out.println(s4);
		
		StringBuffer s5 = new StringBuffer("selenium testing ");
		char c1= s5.charAt(4);     //give the char of string
		System.out.println(c1);
		
		StringBuffer s6 = new StringBuffer("selenium testing ");
		int a =s6.indexOf("m");    //give the index for string
		System.out.println(a);
		
		StringBuffer s7 = new StringBuffer("selenium testing ");
		int b = s7.length();       //give the length of string
		System.out.println(b);
		
		StringBuffer s8 = new StringBuffer("selenium testing ");
		System.out.println(s8.substring(11));     // give string from given string
		
		
		StringBuffer s9 = new StringBuffer("selenium testing ");
		System.out.println(s9.substring(9, 17));       //give string from start and end index
		
		
		}

}
