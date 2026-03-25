package practice2026;

abstract class Amazon
{
	abstract void amazonlogin();
}


abstract class Google extends Amazon
{
	abstract void gogglelogin();
}


abstract class Razorpay extends Google
{
	abstract void payment();
}

 public class AbstractionConcept extends Razorpay
{
		@Override
	void payment()
		{
		   System.out.println("payment1");
		
	    }


	@Override
	void gogglelogin() {
		System.out.println("gogglelogin1");	
	}


	@Override
	void amazonlogin() {
		System.out.println("amazonlogin1");
		
	}


	public static void main(String[] args) 
	{
		AbstractionConcept a1 = new AbstractionConcept();
		a1.amazonlogin();
		a1.gogglelogin();
		a1.payment();
		

	}

}
