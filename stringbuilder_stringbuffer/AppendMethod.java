package stringbuilder_stringbuffer;

public class AppendMethod {

	public static void main(String[] args) 
	{
		//Immutable (unchanged text)
		
		String s3 = new String ("java ");
		String s4 =s3.concat("selenium1"); //combine two text using String
		System.out.println(s4);
		
		
		
		//Mutable(change text)
		
		StringBuilder s5 = new StringBuilder("python ");
	    s5.append("20261");            //combine two text using StringBuilder
		System.out.println(s5);
		
		//Mutable(change text)
		
		StringBuffer s6 = new StringBuffer("machine ");	
		s6.append("learning"); //combine two text using StringBuffer
		System.out.println(s6);
		

	}

}
