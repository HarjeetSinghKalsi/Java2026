package basics2026;

public class NonStaticMthod_Parameterized
{
	void add (int a, int b)
	{
		
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	void mul(float f1, float f2)
	{
		f1 =(float) 3.45;
		f2 = (float) 5.67;
		float mul = f1*f2 ;
		System.out.println(mul);
	}
	
	public static void main(String[] args)
	{
		NonStaticMthod_Parameterized n1 = new NonStaticMthod_Parameterized();
		n1.add(5, 5);
		n1.mul(0, 0);
		
	}

}
