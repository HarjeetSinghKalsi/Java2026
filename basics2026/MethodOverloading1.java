package basics2026;

//Compile time Polymorphism

public class MethodOverloading1 
{
	void add()            //non para
	{
		int a =3;         // local variable
		int b =4;
		int sum= (a+b);
		System.out.println(sum);
	}
   static void add(int a, int b) //para
   {
	   int c=a*b;
	   System.out.println(c);
   }
   
   public static void main(String[] args) 
   {
	
	   MethodOverloading1 m1 = new MethodOverloading1 ();
	   add(5,4);  // static
	   m1.add();  // non static
	   
	   
}
}
