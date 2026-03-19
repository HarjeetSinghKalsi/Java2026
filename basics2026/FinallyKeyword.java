package basics2026;

public class FinallyKeyword {

	public static void main(String[] args)
	{
		
		try {
			int a =1/0;
			System.out.println(a);
		     }
			
			catch (ArithmeticException e1)
			{
				System.out.println("exception handled");
			}
			
			finally //doesn't matter try or catch block will execute but finally block will definitely execute
			{
				System.out.println("Welcome to GTM");
			}
			
	}

}
