package basics2026;

public class ThisCallingStatement 
{
	
	ThisCallingStatement(int age)
	{
	  System.out.println("age is :" + 25);	 
	}
	
	ThisCallingStatement(String name)
	{
		this(100);          //this calling statement
		System.out.println("name is :"  + "Harjeet");
	}
	
	ThisCallingStatement()
	{
		this("abc");         //this calling statement
		System.out.println("number is :" + "3");
	}
	
	public static void main(String[] args) 
	{
		new ThisCallingStatement();
	}

}
