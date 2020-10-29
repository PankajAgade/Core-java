package day_5_Employee;

public class Employee {
	double salary;
	Employee()
	{
		System.out.println(" Hefshine Company");
	}
	Employee(double i) {
		salary = i;
		//System.out.println(" Sallary => "+Sallary);
	}
	
	void calculating_salary()
	{
		salary = salary + (0.35*salary);
	}

	double displaying_employeedata()
	{
		return salary;
	}
}
