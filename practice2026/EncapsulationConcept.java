package practice2026;

class GP
{
	private String un="dummy test";
	private int pwd =1234;
	private long otp =0000;
	
	public String getun()
	{
		return un;
	}
	
	public void setun(String un)
	{
		this.un=un;
	}
	
	public int getpwd()
	{
		return pwd;
	}
	
	public void setpwd(int pwd)
	{
		this.pwd=pwd;
	}
	
	public long getotp()
	{
		return otp;
	}
	
	public void setotp(long otp)
	{
		this.otp=otp;
	}
}

public class EncapsulationConcept {

	public static void main(String[] args)
	{
		GP g1 = new GP();
		g1.setun("harjeet.kalsi007@gmail.com");
		System.out.println(g1.getun());
		
		g1.setpwd(123456789);
		System.out.println(g1.getpwd());
		
		g1.setotp(2020);
		System.out.println(g1.getotp());

	}

}
