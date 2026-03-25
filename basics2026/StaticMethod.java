package basics2026;

public class StaticMethod 
{
	public static void add()
	{
		int a = 40;
		int b= 50;
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void sub()
	{
		int a = 45;
		int b= 56;
		int sub = a-b;
		System.out.println(sub);
	}
	
	public static void mul()
	{
		int a = 45;
		int b= 56;
		int mul = a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args)
	{
		int a = 45;
		int b= 45;
		int div = a/b;
		System.out.println(div); 
		
		StaticMethod.add(); //another way to call the static methods using ClassName.MethodName();
		sub();
		mul();
		
		
		
	}

}
