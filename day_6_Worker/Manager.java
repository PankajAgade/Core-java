package day_6_Worker;

public class Manager extends Worker {

	public static void main(String[] args) {
		String Work_specialization = "Maneger" ;
		String department = "Maneger";
		
		Worker ob1 = new Worker();
		
		ob1.Sname= "pankaj";
		ob1.Saddress= "pune";
		ob1.Sage=36;
		ob1.SphoneNo=58469;
		ob1.Ssalary= 500000;		
		
		ob1.displaySalary();
		System.out.println("department => "+department);
		System.out.println("Work Specialization => "+Work_specialization);
	}
	
}
