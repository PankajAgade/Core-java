package day_6_Department;

public class Department extends StaffMember {

	String departmentName;
	String HODname;
	
	public Department(String departmentName, String HODname, String memberName, String memberQualification) {
		super(memberName, memberQualification);
		this.departmentName = departmentName;
		this.HODname = HODname;
	}

	void showDepartmentDetails()
	{
		System.out.println();
		System.out.println("~~~~~~~~ Department Details ~~~~~~~");
		System.out.println("	=> The department name : "+departmentName);
		System.out.println("	=> The HOD name : "+HODname);
	}
}
