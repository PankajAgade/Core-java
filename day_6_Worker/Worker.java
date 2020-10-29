package day_6_Worker;
/*
Create a class named ‘Worker’ having the following 
members: Sname, Sage, Sphone number ,Saddress, Ssalary.
It also has a method named 'displaySalary' which displays the salary of the members.
 Two classes 'Employee' and 'Manager' inherit the ‘Worker’ class. 
 The 'Employee' and 'Manager' classes have data members 'Work specialization' and 
 'department' respectively. Now, assign name, age, phone number, address and salary
  to an employee and a manager by making an object of both of these classes and 
  print the same.
 */
public class Worker {

	String Sname,Saddress;
	int Sage, SphoneNo , Ssalary;
	
	
	void displaySalary()
	{
		System.out.println("Name => "+Sname);
		System.out.println("Address => "+Saddress);
		System.out.println("Phone No. => "+SphoneNo);
		System.out.println("Age => "+Sage);
		System.out.println("Salary => "+Ssalary);
	}
}
