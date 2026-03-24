package stringbuilder_stringbuffer;

public class StringBuffer_Constructor {

	public static void main(String[] args) 
	{
		StringBuffer s1 =new StringBuffer(); //Default Constructor means by default initial capacity is 16 
		s1.append("harjeet ");
		s1.append("kalsi");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("harjeet kalsi "); //Constructor with initial String
		s2.append("2026");
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer(3); //Constructor with initial capacity is 2 and its growable and resizeing the size
		s3.append("learning practice ");
		s3.append("java");
		System.out.println(s3);
	
		//check the capacity of s1, s2, s3
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		System.out.println(s3.capacity());
		
		
		

	}

}
