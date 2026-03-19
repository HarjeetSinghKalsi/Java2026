package basics2026;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		int a; //declaration
		  a=5; //initialization
		int b=10; //declaration and initialization
		int sum = a+b;
		System.out.println(sum); //utilization
	}
	
	ConstructorOverloading(int a, int b)
	{
		int mul =a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args) 
	{
		
		ConstructorOverloading c1 = new ConstructorOverloading(); //1st way creating object with non para
		new ConstructorOverloading(); //2nd way with non para
		
		ConstructorOverloading c2 = new ConstructorOverloading(5,10); //1st way with para
		new ConstructorOverloading(5,10); //2nd way with para
		
		
		
		
	}

}
