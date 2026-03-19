package basics2026;

//Runtime Polymorphism
class Amazon
{
   void login()
   {
	 System.out.println("login with no");
   }
}
public class MethodOverriding extends Amazon
{
	void login()
	{
	                                                //	super.login();  super keyword
		System.out.println("login with email");
	}
	
	public static void main(String[] args)
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.login();
		
	}

}
