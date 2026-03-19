package basics2026;

//interface using single inheritence 
interface Amazon1
{
	void add();
	void sub();
}

interface Google extends Amazon1
{
	void mul();
	void div();
}


public class Interface_1 implements Google
{
    public void add() 
	{
		
		System.out.println("Addition");
	}

	public void sub()
	{
		System.out.println("Subtraction");
	}

	
	public void mul() 
	{
		System.out.println("Multipliy");
	}

	
	public void div() 
	{
		System.out.println("Divide");
	}
	
public static void main(String[] args) 

    {
	
	Interface_1 a1 = new Interface_1();
	a1.add();
	a1.sub();
	a1.mul();
	a1.div();
	
	}

}
