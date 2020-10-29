package day_6_employee_scenario;

public class Manager extends Employee{

	Manager(long Id, String Name, String Address, long Phone, double Salary)
	{
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		this.basicSalary = Salary;
	}
	void calculateTransportAllowance()
	{
		System.out.println("Transport Allowance =>"+0.15*basicSalary);
	}
}
