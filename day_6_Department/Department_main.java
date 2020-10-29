package day_6_Department;
/*
WRITE A PROGRAM for Department class having departmentName and HOD name as instance
 variables,a constructor to initialize the variables and showDepartmentDetails() 
 to display the details.Create StaffMember class having MemberName and 
 MemberQualification as instance variables.Create the constructor and s
 howstaffMemberDetails() method to display the details.
 */
public class Department_main {

	public static void main(String[] args) {
		
		Department obj = new Department("IT", "pallavi ma'am", "puri sir", "P.H.D");
		obj.showDepartmentDetails();
		obj.showstaffMemberDetails();
	}
}
