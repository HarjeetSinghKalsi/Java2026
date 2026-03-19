package string_functions2026;

import java.util.Date;

public class Current_Time {

	public static void main(String[] args) 
	{
		Date d1 = new Date(); // constructor non para
		System.out.println(d1.getTime());
	   //epoc converter
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String currentTime =  d2.toString();
		String year =       currentTime.substring(currentTime.length()-4);
		System.out.println(year);
		
		String s1 =    d2.toString();
		String month = s1.substring(4, 7);
		System.out.println(month);
		
		String s2 = d2.toString();
		String date = s2.substring(8, 10);		
		System.out.println(date);
		
		String dateformat =  date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(dateformat);
		

	}

}
