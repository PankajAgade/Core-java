 package day_6_employee_scenario;

public class Employee {
	
		long employeeId;
		String employeeName;
		String employeeAddress;
		Long employeePhone;
		double 	basicSalary;
		double specialAllowance = 250.80;
		double Hra = 1000.50;
		 Employee(long employeeId, String employeeName, String employeeAddress, Long employeePhone,
				double basicSalary)
		 {
			
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.employeePhone = employeePhone;
			this.basicSalary = basicSalary;
		}
		 Employee()
		 {
			 
		 }
		void calculateSalary()
		{
			double salary;
			salary = basicSalary + (basicSalary *specialAllowance/100) + (basicSalary
					*Hra/100);
			System.out.println("Sallary =>"+salary);
			
		}
		void calculateTransportAllowance()
		{
			System.out.println("Transport Allowance =>"+0.1*basicSalary);
		}
		
		
		
		
}
