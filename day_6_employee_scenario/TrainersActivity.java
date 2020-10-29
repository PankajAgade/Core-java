package day_6_employee_scenario;

public class TrainersActivity {

	public static void main(String[] args) {
		
		long employeeId = 202020l;
		String employeeName = "Pankaj";
		String employeeAddress = "umred";
		Long employeePhone = 1325554l;
		double 	basicSalary = 100;
		
		Manager obj1 = new Manager(employeeId, employeeName, employeeAddress, employeePhone, basicSalary); 
		obj1.calculateSalary();
		obj1.calculateTransportAllowance();
		
		Trainee obj2 = new Trainee(1230, "prajwal", "nagpur", 78951, 90);
		obj2.calculateSalary();
		obj2.calculateTransportAllowance();
		
	
	}
}
