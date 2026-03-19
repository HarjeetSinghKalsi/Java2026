package basics2026;

 public class FinalVariable
{
   final int noofdays =30; // final global variable
	 String name = "Hello";
	 static double d = 34567;
	
	 void amazon()
	{
			
	 final int b=200; //final local variable
	 System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
	
		FinalVariable f1 = new FinalVariable();
		f1.amazon();
		System.out.println(f1.noofdays);
		System.out.println(f1.name);
		System.out.println(d);
			
	}

}
