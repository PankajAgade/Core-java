package day_5_Employee;
/*
Create class Employee with constructors (default and parameterized), 
methods (1 with return type (calculating salary), 
1 without return type (displaying employeedata)).
 */
public class Employee_Main {

	public static void main(String[] args) {
		Employee obj = new Employee();
		Employee obj1 = new Employee(50000);
		obj1.calculating_salary();
		System.out.println(" Employee Slary => "+obj1.displaying_employeedata());

	}

}
