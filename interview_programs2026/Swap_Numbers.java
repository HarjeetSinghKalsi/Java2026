package interview_programs2026;

public class Swap_Numbers {

//swap two number without using third variable
	public static void main(String[] args)
	{
		int a =10;
		int b =20;
		System.out.println("Before swap a= " + a + " b= " + b);
		
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("after swap a= " + a + " b= " + b);
	
	}

}
