package list_collection;

class first
{
	void add()
	{
		System.out.println("1");
	}

	void add1()
	{
		System.out.println("2");
	}

	void add2()
	{
	   System.out.println("3");
	}
}
public class UpCasting extends first
{

	public static void main(String[] args) 
	{
		         
		first f1  =new UpCasting(); //upcasting the child class object to the Super class type
		f1.add();                  //access the super class properties.
		f1.add1();
		f1.add2();

	}

}
