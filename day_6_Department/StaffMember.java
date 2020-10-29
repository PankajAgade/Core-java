package day_6_Department;

public class StaffMember {

	String MemberName;
	String MemberQualification;
	
	public StaffMember(String MemberName, String MemberQualification) {
		this.MemberName = MemberName;
		this.MemberQualification = MemberQualification;
	}



	void showstaffMemberDetails()
	{
		System.out.println();
		System.out.println("~~~~~~~~ Staff Member Details ~~~~~~~");
		System.out.println("	=> The Member name : "+MemberName);
		System.out.println("	=> The Member Qualification : "+MemberQualification);
	}
}
