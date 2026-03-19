package basics2026;

//using with Method overriding
class Parent
{
	void add(int a)                   //Method overriding
	{
		a=100;
		System.out.println("1:" + a);
	}
}

public class SuperKeyword extends Parent
{
	void add(int a)                  //Method overriding
	{
		super.add(1);              //super.methodname() 
		a =200;
		System.out.println("2:" + a);
	}
	
	public static void main(String[] args) 
	{
		SuperKeyword s1 = new SuperKeyword();
		s1.add(0);			
	}

}
