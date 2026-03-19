package basics2026;

public class ThisKeyword
{
	int age;
	String name;
	double salary;
	
	void student_details(int age, String name, double salary, char c) 
	{
		this.age=age; //assigning local var value to global var using this keyword
		this.name=name;
		this.salary=salary;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		ThisKeyword t1 = new ThisKeyword();
		t1.student_details(25, "harjeet", 678907, 'M');
		
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}

}
