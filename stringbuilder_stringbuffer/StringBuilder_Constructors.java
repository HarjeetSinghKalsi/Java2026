package stringbuilder_stringbuffer;

public class StringBuilder_Constructors {

	public static void main(String[] args) 
	{
		StringBuilder s1 =new StringBuilder(); //Default Constructor means by default initial capacity is 16 
		s1.append("harjeet ");
		s1.append("kalsi");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Automation learninig "); //Constructor with initial String
		s2.append("2026");
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder(3); //Constructor with initial capacity is 2 and its growable and resizeing the size
		s3.append("learning practice ");
		s3.append("java");
		System.out.println(s3);
	
		//check the capacity of s1, s2, s3
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		System.out.println(s3.capacity());
		
		

		

	}

}
