package basics2026;

 class Amazon_login
 {
	private String un = "dummy@gmail.com";
	private int pwd = 1234;
	private int otp = 0000;
	
//********************************************************	    
	 public String getun()
	 {
		 return un;
	 }
	 
	 public void setun(String un)
	 {
		 this.un=un;
     }
//***********************************************************	 
	 public int getpwd()
	 {
		 return pwd;
	 }
	 
	 public void setpwd(int pwd)
	 {
		 this.pwd=pwd;
	 }
//**************************************************	 
	 public int getotp()
	 {
		 return otp;
	 }
	 
	 public void setotp(int otp)
	 {
		 this.otp=otp;
	 }
	 
//****************************************************** 
 }
public class Encapsulation_Concept
{
	public static void main(String[] args) 
	{
		Amazon_login a1 = new Amazon_login();
		
		a1.setun("username:-> " + "harjeet.kalsi007@gmail");
		System.out.println(a1.getun());
		
		a1.setpwd(1234567890);
		System.out.println("password:-> "+ a1.getpwd());
		
		
		a1.setotp(2323);
		System.out.println("otp:-> "+ a1.getotp());
		

	}

}
