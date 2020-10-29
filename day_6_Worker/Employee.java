package day_6_Worker;

public class Employee extends Worker {

	public static void main(String[] args) {
	
		String Work_specialization = "Driver" ;
		String department = "Employer";
		
		Worker ob = new Worker();
		
		ob.Sname= "prajwal";
		ob.Saddress= "nagpur";
		ob.Sage=23;
		ob.SphoneNo=12369;
		ob.Ssalary= 50000;		
		
		ob.displaySalary();
		System.out.println("department => "+department);
		System.out.println("Work Specialization => "+Work_specialization);
	}
	
	
	
}
