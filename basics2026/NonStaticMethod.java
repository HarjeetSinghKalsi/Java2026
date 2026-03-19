package basics2026;

public class NonStaticMethod 
{
	
	void add()
	{
		int a =10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	public void mul()
	{
		int a =10;
		int b = 20;
		int mul = a*b;
		System.out.println(mul);
		
	}
	
	public static void main(String[] args) 
	{
		
		NonStaticMethod n1 = new NonStaticMethod ();
		n1.add();
		n1.mul();
	
}
}
