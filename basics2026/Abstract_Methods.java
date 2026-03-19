package basics2026;

//abstract method using abstract class

abstract class fb_Auth
{
	abstract void fb_login();  //abstract method
}

abstract class Google_Auth extends fb_Auth
{
	abstract void google_login();
}

abstract class Razor_Pay extends Google_Auth
{
   abstract void razor_payment(); //abstract method
	
   public void phone_pay() // concrete method
	{
		int a =10;
		int b= 20;
		int div = b/a;
		System.out.println(div);
		
	}
}
public class Abstract_Methods extends Razor_Pay
{
	 void razor_payment() 
	{
		int a =10;
		int b= 20;
		int mul = a*b;
		System.out.println(mul);
		
	}

	void google_login()
	{
		
		int a =10;
		int b= 20;
		int sub = a-b;
		System.out.println(sub);
	}
	
	void fb_login() 
	{
		
		int a =10;
		int b= 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		Abstract_Methods a1 = new Abstract_Methods();
		a1.fb_login();
		a1.google_login();
		a1.razor_payment();
		a1.phone_pay();
		
	}



}
