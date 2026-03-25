package practice2026;

interface Amazon2
{
	void add();
}

interface Google2
{
	void sub();
}

interface paytm
{
	void mul();
}

interface phonepay
{
	void div();
}
public class Interface_Concept implements Amazon2, Google2, paytm, phonepay
{

	public static void main(String[] args)
	{
		
		Interface_Concept a1 = new Interface_Concept();
		a1.add();
		a1.div();
		a1.mul();
		a1.sub();

	}

	@Override
	public void div() 
	{
		int a=10;
		int b= 20;
		int c= b/a;
		System.out.println(c);
		
	}

	@Override
	public void mul() 
	{
		int a=10;
		int b= 20;
		int c= b*a;
		System.out.println(c);
		
	}

	@Override
	public void sub() 
	{
		int a=10;
		int b= 20;
		int c= b-a;
		System.out.println(c);
		
		
	}

	@Override
	public void add()
	{
		int a=10;
		int b= 20;
		int c= b+a;
		System.out.println(c);
		
		
	}

}
