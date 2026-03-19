package basics2026;

//interface using multiple inheritence

interface Google_Login
{
	void g_email();
	void g_mob();
	
}

interface Fb_Login
{
	void fb_email();
	void fb_mob();	
}

interface GTM_Login
{
	void gtm_email();
	void gtm_mob();
}
public class Interface_2 implements Google_Login, Fb_Login, GTM_Login
{

	public static void main(String[] args)
	{
		Interface_2 i1 = new Interface_2();
		i1.fb_email();
		i1.fb_mob();
		i1.g_email();
		i1.g_mob();
		i1.gtm_email();
		i1.gtm_mob();
	}

	@Override
	public void gtm_email() 
	{
		System.out.println("gtm_email");	
	}

	@Override
	public void gtm_mob() 
	{
		System.out.println("gtm_mob");		
	}

	@Override
	public void fb_email()
	{
		System.out.println("fb_email");
		
	}

	@Override
	public void fb_mob()
	{
		System.out.println("fb_mob");	
	}

	@Override
	public void g_email() 
	{
		System.out.println("g_email");		
	}

	@Override
	public void g_mob() 
	{
		System.out.println("g_mob");
		
	}

}
