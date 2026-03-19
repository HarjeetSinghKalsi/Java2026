package basics2026;

public class ThisCallingStatement 
{
	
	ThisCallingStatement(int age)
	{
	  System.out.println("1 :" + 25);	 
	}
	
	ThisCallingStatement(String name)
	{
		this(100);  //this calling statement
		System.out.println("2 :"  + "Harjeet");
	}
	
	ThisCallingStatement()
	{
		this("abc"); //this calling statement
		System.out.println("3");
	}
	
	public static void main(String[] args) 
	{
		new ThisCallingStatement();
	}

}
