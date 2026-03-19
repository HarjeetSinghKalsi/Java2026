package basics2026;

public class StaticMethod_Parameterized
{
	
	static void add(int a, int b, int c)
	{
		a=10;
		b=30;
	    c=a+b;
		System.out.println(c);
	}
	
	
	static void sub(int q, int w)
	{
	    int sub = q-w;
		System.out.println(sub);
	}
	
	public static void Login(String un , String pwd)
	{
	    
		System.out.println(un);
		System.out.println(pwd);
	}
	public static void main(String[] args) 
	{
		add(0, 0, 0);
		sub(15,5);
		Login("harjeet", "welcome");
	}

}
