package array_problems;

public class Array_Sample
{

	public static void main(String[] args) 
	{
		int student_id[] = {34,67,89};	//1st way to declaration & initialization
	
		String name[]=new String [3]; //2nd way to declaration
		name[0]="abc";   //  and initialization
		name[1]="test";  
		name[2]="welcome";  
		
		double salary [] = new double[3];
		salary[0]=345678;
		salary[1]=988089;
		salary[2]=565566;
		
		char gender[] =new char[3];
		gender[0]='M';
		gender[1]='F';
		gender[2]='T';
		
		boolean age[] =new boolean[3];
		age[0]=true;
		age[1]=false;
		age[2]=true;
		
		for(int i=0; i<3;i++)
		{
			System.out.println(student_id[i] + name[i]  + salary[i] + gender[i] + age[i]);
		}				
	}

}
