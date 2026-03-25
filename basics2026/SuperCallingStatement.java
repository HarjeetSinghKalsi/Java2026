package basics2026;

//using with inheritence + constructor
//ex multi level

class Grand_Parent
{
	Grand_Parent(String name) //Parameterized constructor
	{
		System.out.println("subject: " + name);
	}
}
class Parent_Class extends Grand_Parent
{
	Parent_Class(int a) //non para constructor
	{
		super("java"); //super calling statement
		System.out.println(500);
	}
}
public class SuperCallingStatement extends Parent_Class
{
	SuperCallingStatement(String name) //para cons
	{
		super(1); //super calling statement
		System.out.println("sub:" + "selenium" );
	}
	
	public static void main(String[] args)
	{
		new SuperCallingStatement(null); //created child class obj and pass the para value as null
	}

}
