package basics2026;

public class GlobalVariable
{
	String name = "harjeet";
	static double salary= 90867.898; //that value cannot change
	
	public static void main(String[] args)
	{
		
		System.out.println(salary); //print salary
		GlobalVariable g1 = new GlobalVariable();
		System.out.println(g1.name); //print name
		
	}

}
