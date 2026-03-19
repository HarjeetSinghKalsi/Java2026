package basics2026;

public class ExceptionHandling 
{
	
public static void main(String[] args) {
	
	try {
	int a =1/0;
	System.out.println(a);
     }
	
	catch (ArithmeticException e1)
	{
		System.out.println("exception handled");
	}
	
}
}
