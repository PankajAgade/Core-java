package day_6_employee_scenario;

public class Trainee extends Employee {

	Trainee(long Id, String Name, String Address, long Phone, double Salary)
	{
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		this.basicSalary = Salary;
	}
}
