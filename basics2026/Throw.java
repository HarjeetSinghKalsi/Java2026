package basics2026;

import java.util.InputMismatchException;

public class Throw {

	public static void main(String[] args) throws NullPointerException, InputMismatchException  
	{
		if (1==1)
		{
			throw new NullPointerException("sorry your cell is empty"); //throwing the exception explicitly
		}
		
		else
		{
			throw new InputMismatchException("sorry check your input before entering");
		}
		

	}

}
