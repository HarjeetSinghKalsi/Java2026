package string_functions2026;

import java.util.Date;

public class Future_Past_Time {

	public static void main(String[] args) 
	{
	  Date d1 = new Date();
	  System.out.println(d1.getTime());
	  //epoc convertor
	  Date d2 = new Date(d1.getTime() + (1000*60*60*24*2)); //future time
	  System.out.println(d2);
	   
	  Date d3 = new Date(d1.getTime() - (1000*60*60*24*2)); // Past time
	  System.out.println(d3);

	}

}
